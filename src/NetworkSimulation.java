public class NetworkSimulation {
    public static void main(String[] args) {
        // Create end devices
        EndDevice deviceA = new EndDevice("DeviceA", "192.168.1.2", NetworkUtils.generateMacAddress());
        EndDevice deviceB = new EndDevice("DeviceB", "192.168.2.2", NetworkUtils.generateMacAddress());

        // Create routers
        Router router1 = new Router("Router1", "192.168.1.1", NetworkUtils.generateMacAddress());
        Router router2 = new Router("Router2", "192.168.2.1", NetworkUtils.generateMacAddress());

        deviceA.printDeviceDetails();
        deviceB.printDeviceDetails();
        router1.printDeviceDetails();
        router2.printDeviceDetails();

        // Set up ARP tables
        router1.addArpEntry(deviceA.getIpAddress(), deviceA.getMacAddress());
        router2.addArpEntry(deviceB.getIpAddress(), deviceB.getMacAddress());

        // Set up routing table
        router1.addRoute("192.168.2.2", router2);
        router2.addRoute("192.168.1.2", router1);

        // Configure and start RIP on routers
        RIPProtocol ripRouter1 = new RIPProtocol(router1);
        RIPProtocol ripRouter2 = new RIPProtocol(router2);
        
        router1.configureRoutingProtocol(ripRouter1);
        router2.configureRoutingProtocol(ripRouter2);
        
        router1.startRoutingProtocol();
        router2.startRoutingProtocol();

        // Simulate sending a packet from DeviceA to DeviceB
        Packet packet = new Packet(deviceA.getIpAddress(), deviceB.getIpAddress(), deviceA.getMacAddress(), deviceB.getMacAddress());
        
        deviceA.sendPacket(packet);
        router1.sendPacket(packet);
        router2.sendPacket(packet);
        deviceB.receivePacket(packet);
    }
}

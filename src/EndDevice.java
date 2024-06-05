public class EndDevice extends NetworkDevice {
    public EndDevice(String name, String ipAddress, String macAddress) {
        super(name, ipAddress, macAddress);
    }

    @Override
    public void sendPacket(Packet packet) {
        System.out.println(this.name + " sending packet to " + packet.getDestinationIp());
    }

    public void receivePacket(Packet packet) {
        System.out.println(this.name + " received packet from " + packet.getSourceIp());
    }
}

// Overriding means providing a new implementation for a method that is already defined in the superclass.
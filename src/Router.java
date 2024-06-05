import java.util.HashMap;
import java.util.Map;

public class Router extends NetworkDevice {

    private final Map<String, NetworkDevice> routingTable; // Map is interface
    private final ARPTable arpTable;
    private RoutingProtocol routingProtocol;  // Routing protocol to manage dynamic routing

    public Router(String name, String ipAddress, String macAddress) {

        super(name, ipAddress, macAddress);
        routingTable = new HashMap<>(); // HashMap is class
        arpTable = new ARPTable();
    }

    public void addRoute(String destinationIp, NetworkDevice nextHop) {
        routingTable.put(destinationIp, nextHop);
    }

    public void addArpEntry(String ipAddress, String macAddress) {
        arpTable.addEntry(ipAddress, macAddress);
    }


    // Method to send a packet to the appropriate next hop device based on the destination IP
    @Override
    public void sendPacket(Packet packet) {

        NetworkDevice nextHop = routingTable.get(packet.getDestinationIp());

        if (nextHop != null) {
            System.out.println(this.name + " routing packet to " + packet.getDestinationIp());
            nextHop.sendPacket(packet);
        } 
        else {
            System.out.println(this.name + " has no route to " + packet.getDestinationIp());
        }
    }
    

    // Method to retrieve the MAC address corresponding to a given IP address from the ARP table
    public String getMacAddressForIp(String ipAddress) {
        return arpTable.getMacAddress(ipAddress);
    }
    
    // Method to configure the routing protocol for the router
    public void configureRoutingProtocol(RoutingProtocol protocol) {
        this.routingProtocol = protocol;
    }
    
    
    public void startRoutingProtocol() {
        if (this.routingProtocol != null) {
            this.routingProtocol.run();
        }
    }
}

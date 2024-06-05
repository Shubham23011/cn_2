/* An Abstract class cannot be instantiated directly and may contain abstract methods 
that must be implemented by subclasses. */

public abstract class NetworkDevice {

    // Protected fields are accessible within the same package and by subclasses.
    protected String name;
    protected String ipAddress;
    protected String macAddress;

    public NetworkDevice(String name, String ipAddress, String macAddress) {
        this.name = name;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getName() {
        return name;
    }

    public void printDeviceDetails() {
        System.out.println("Name: " + name);
        System.out.println("IP Address: " + ipAddress);
        System.out.println("MAC Address: " + macAddress);
    }

    /* This method define the behavior for sending a packet from the network device.
     The method takes a Packet object as a parameter. */
    public abstract void sendPacket(Packet packet);
}

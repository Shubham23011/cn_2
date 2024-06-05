public class Packet {
    
    private final String sourceIp;
    private final String destinationIp;
    private final String sourceMac;
    private final String destinationMac;

    public Packet(String sourceIp, String destinationIp, String sourceMac, String destinationMac) {
        this.sourceIp = sourceIp;
        this.destinationIp = destinationIp;
        this.sourceMac = sourceMac;
        this.destinationMac = destinationMac;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public String getDestinationIp() {
        return destinationIp;
    }

    public String getSourceMac() {
        return sourceMac;
    }

    public String getDestinationMac() {
        return destinationMac;
    }
}

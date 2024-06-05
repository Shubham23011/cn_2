public class NetworkUtils {
    public static String generateMacAddress() {
        // Generates a random MAC address
        return String.format("%02X:%02X:%02X:%02X:%02X:%02X", 
            (int)(Math.random() * 256),
            (int)(Math.random() * 256),
            (int)(Math.random() * 256),
            (int)(Math.random() * 256),
            (int)(Math.random() * 256),
            (int)(Math.random() * 256));
    }
    
    public static boolean isValidIpAddress(String ipAddress) {
        // Validate the IP address format
        return ipAddress.matches("\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b");
    }
}

// Math.random() generates a random floating-point number between 0.0 (inclusive) and 1.0 (exclusive)

/*  %02X: This indicates that the corresponding argument should be formatted as a hexadecimal integer 
    with a minimum width of 2 characters, padded with zeros if necessary.
*/
import java.util.HashMap;
import java.util.Map;

public class ARPTable {
    private final Map<String, String> arpTable; // Interface

    public ARPTable() {
        arpTable = new HashMap<>(); // Class
    } 

    public void addEntry(String ipAddress, String macAddress) {
        arpTable.put(ipAddress, macAddress);
    }

    public String getMacAddress(String ipAddress) {
        return arpTable.get(ipAddress);
    }
}

/*  Map

    Type: Interface
    Purpose: Defines a collection that maps keys to values. It cannot be instantiated directly.
    Common Methods: put(K key, V value), get(Object key), remove(Object key), containsKey(Object key), 
    containsValue(Object value), keySet(), values(), and more.
    Subtypes: Various implementations like HashMap, TreeMap, LinkedHashMap, ConcurrentHashMap, etc. 
*/

/*  HashMap

    Type: Concrete Class
    Purpose: Provides a specific implementation of the Map interface using a hash table.
    Order: Does not guarantee any specific order of the elements.
    Performance: Provides constant-time performance for basic operations (put, get, remove)
    Null Values: Allows one null key and multiple null values.
    Usage: Commonly used when you need a basic, high-performance map without any ordering guarantees.

 */
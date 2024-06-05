import java.util.HashMap;
import java.util.Map;

public class RoutingTable {
    private final Map<String, NetworkDevice> routes;

    public RoutingTable() {
        routes = new HashMap<>();
    }

    public void addRoute(String destinationIp, NetworkDevice nextHop) {
        routes.put(destinationIp, nextHop);
    }

    public NetworkDevice getRoute(String destinationIp) {
        return routes.get(destinationIp);
    }
}

import java.util.HashMap;
import java.util.Map;

public class RIPProtocol extends RoutingProtocol {
    protected Map<String, Integer> distances;

    public RIPProtocol(Router router) {
        super(router);
        distances = new HashMap<>();
    }

    @Override
    public void run() {

        // Basic RIP implementation
        System.out.println("Running RIP protocol on " + router.getName());

        // Add more detailed RIP logic here
    }
}

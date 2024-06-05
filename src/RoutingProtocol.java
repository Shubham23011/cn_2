public abstract class RoutingProtocol {
    
    protected Router router;

    public RoutingProtocol(Router router) {
        this.router = router;
    }

    public abstract void run();
}

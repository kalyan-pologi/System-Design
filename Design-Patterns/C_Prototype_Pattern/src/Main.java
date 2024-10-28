// Clones existing objects for new instances.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);

        NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
        System.out.println(networkConnection);
        networkConnection.getDomains().remove(0);
        System.out.println(networkConnection);
        System.out.println(networkConnection2);
    }
}
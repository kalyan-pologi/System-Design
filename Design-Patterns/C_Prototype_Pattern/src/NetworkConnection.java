import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();


    public String getIp() {
        return ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadVeryImportantData(){
        this.importantData = "very very important data";
        // this will take a lot of time
        domains.add("www.google.com");
        domains.add("www.yahoo.com");
        domains.add("www.gmail.com");

    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    public NetworkConnection clone() {
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());

        for(String d: this.getDomains()){
            networkConnection.getDomains().add(d);
        }
        return networkConnection;

    }
}

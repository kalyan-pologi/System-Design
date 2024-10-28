// Builds complex objects step-by-step for flexibility.

public class Main {
    public static void main(String[] args) {
        URLBuilder.Builder builder = new URLBuilder.Builder();
        URLBuilder urlBuilder = builder.protocol("http://").hostname("newwebsite:").port("443").build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);

    }
}
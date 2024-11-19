package Q1;

public class Main {
    public static void main(String[] args) {
        // Create books
        PhysicalBook physicalBook1 = new PhysicalBook("The Catcher in the Rye");
        PhysicalBook physicalBook2 = new PhysicalBook("1984");
        DigitalBook digitalBook1 = new DigitalBook("Clean Code");

        // Create memberships
        Membership regularMembership = new RegularMembership();
        Membership premiumMembership = new PremiumMembership();

        // Create notification services
        NotificationService emailNotification = new EmailNotification();

        // Use LibraryProcessor
        LibraryProcessor libraryProcessor = new LibraryProcessor(regularMembership, emailNotification);

        // Test regular membership borrowing
        System.out.println("=== Regular Membership Borrowing ===");
        libraryProcessor.borrowBook(physicalBook1, "Member1", 2); // Should succeed
        libraryProcessor.borrowBook(physicalBook2, "Member1", 5); // Should fail (limit exceeded)

        // Switch to premium membership
        libraryProcessor = new LibraryProcessor(premiumMembership, emailNotification);

        System.out.println("\n=== Premium Membership Borrowing ===");
        libraryProcessor.borrowBook(physicalBook2, "Member2", 10); // Should succeed (no limit)

        // Test downloading a digital book
        System.out.println("\n=== Digital Book Download ===");
        libraryProcessor.downloadBook(digitalBook1, "Member2");
    }
}

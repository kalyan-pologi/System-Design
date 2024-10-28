// Creates related object families without specifying exact classes.

public class Main {
    public static void main(String[] args) {
        int entranceExamScore = 125;

        UniversityFactory abstractUniversityFactory = UniversityFactory.getUniversityFactory(entranceExamScore);

        AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
        System.out.println(admitCard.getClass());
        FeeCalculator feeCalculator = abstractUniversityFactory.getFeeCalculator("Math");
        System.out.println(feeCalculator.calculateFee());
    }
}
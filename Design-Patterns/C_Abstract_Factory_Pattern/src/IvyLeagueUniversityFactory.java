
public class IvyLeagueUniversityFactory extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        return switch (course) {
            case "Math" -> new MITAdmitCard();
            case "Physics" -> new CalTechAdmitCard();
            default -> null;
        };

    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        return switch (course) {
            case "Math" -> new MITFeeCalculator();
            case "Physics" -> new CalTechFeeCalculator();
            default -> null;
        };
    }
}

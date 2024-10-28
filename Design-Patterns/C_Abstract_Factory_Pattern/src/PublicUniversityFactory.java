

public class PublicUniversityFactory extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        return null;
    }
}

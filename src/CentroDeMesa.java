public class CentroDeMesa implements Decoration{

    @Override
    public String selectDecoration() {
        return "Decoration has been selected";
    }

    @Override
    public String setDecoration() {
        return "Setting selected decoration in venue";
    }
}

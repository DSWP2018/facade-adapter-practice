public class PlantaBaja implements Venue {
    @Override
    public void clean() {
        System.out.println("Se limpió el piso de la planta");
    }

    @Override
    public void preparePlace() {
        System.out.println("Se preparó la estructura del lugar");
    }
}

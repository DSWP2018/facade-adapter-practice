public class MainClass {

    public static void main(String [] args){

        GraduationPartyFacade grad = new GraduationPartyFacade();

        System.out.println("PREPARAR TODO ANTES DE INICIAR");
        grad.getEverythingReadyBeforeStarted();

        System.out.println("\nINICIA LA FIESTA");
        grad.startGrad();

        System.out.println("\nSERVIR CENA Y BEBIDAS");
        grad.startSrevingDinnerAndDrinks();

        System.out.println("\nTOCAR MUSICA DE BANDA");
        grad.playSomeMusicBand();

        System.out.println("\nTOCAR MUSICA DE DJ");
        grad.playSomeMusicDJ();
    }
}

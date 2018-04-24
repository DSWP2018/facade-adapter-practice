public class MainClass {

    public static void main(String [] args){

        GraduationPartyFacade grad = new GraduationPartyFacade(new Globos(),new PolloConCrema(),new Margarita(),new Mesa(),new LosPunchis(),new PlantaBaja(),new WaiterMesa10());

        System.out.println("\nPREPARAR TODO ANTES DE INICIAR");
        grad.getEverythingReadyBeforeStarted();

        System.out.println("\nINICIA LA FIESTA");
        grad.startGrad();

        System.out.println("\nSERVIR CENA Y BEBIDAS");
        grad.startSrevingDinnerAndDrinks();

        System.out.println("\nTOCAR MUSICA DE BANDA");
        grad.playSomeMusicBand();


        GraduationPartyFacade gradDJ = new GraduationPartyFacade(new Globos(),new PolloConCrema(),new Margarita(),new Mesa(),new DJAdapter(new AVICII()),new PlantaBaja(),new WaiterMesa10());
        System.out.println("\nPREPARAR TODO ANTES DE INICIAR");
        gradDJ.getEverythingReadyBeforeStarted();

        System.out.println("\nINICIA LA FIESTA");
        gradDJ.startGrad();

        System.out.println("\nSERVIR CENA Y BEBIDAS");
        gradDJ.startSrevingDinnerAndDrinks();

        System.out.println("\nTOCAR MUSICA DE DJ");
        gradDJ.playSomeMusicBand();

    }
}

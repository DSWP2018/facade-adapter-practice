package mx.iteso.desi.diseno.facadeadapter.partyitems.place.places;

import mx.iteso.desi.diseno.facadeadapter.partyitems.place.IPlace;

public class Casino implements IPlace {

	@Override
	public void contract() {
        System.out.println("Estas contratando los servicios del casino para alojar tu fiesta");
	}

	@Override
	public void prepare() {
		System.out.println("Arreglar el lugar para la fiesta");
	}

	@Override
	public void clean() {
		System.out.println("Limpiar el lugar al finalizar");
	}

}

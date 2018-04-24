package mx.iteso.desi.diseno.facadeadapter.partyitems.cateringservice.cateringservices;

import mx.iteso.desi.diseno.facadeadapter.partyitems.cateringservice.ICateringService;

public class Banquetes implements ICateringService {

	@Override
	public void contract() {
        System.out.println("Estas contratando un servicio de banquetes");
	}

	@Override
	public void prepare() {
		System.out.println("Se esta preparando el banquete");
	}

	@Override
	public void cleanUp() {
		System.out.println("Ya todos comieron, retirar platos");
	}
}

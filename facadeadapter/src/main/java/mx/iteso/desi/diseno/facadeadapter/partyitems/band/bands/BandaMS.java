package mx.iteso.desi.diseno.facadeadapter.partyitems.band.bands;

import mx.iteso.desi.diseno.facadeadapter.partyitems.band.IBand;

public class BandaMS implements IBand {

	@Override
	public void contract() {
		System.out.println("Estas contratanddo a la banda ms pariente");
	}

	@Override
	public void test() {
		System.out.println("Afinando trumpetas, supongo");
	}

	@Override
	public void play() {
		System.out.println("Banda MS tocando");
	}

	@Override
	public void retire() {
		System.out.println("Se va la banda");
	}
}

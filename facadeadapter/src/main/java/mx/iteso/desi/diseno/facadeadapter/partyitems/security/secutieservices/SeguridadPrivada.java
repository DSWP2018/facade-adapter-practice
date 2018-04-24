package mx.iteso.desi.diseno.facadeadapter.partyitems.security.secutieservices;

import mx.iteso.desi.diseno.facadeadapter.partyitems.security.ISecurity;

public class SeguridadPrivada implements ISecurity {

	@Override
	public void contract() {
		System.out.println("Estas contratando servicios de Seguridad Privada");
	}

	@Override
	public void patrol() {
        System.out.println("Cuidar la seguridad dentro del evento");
	}

	@Override
	public void retire() {
        System.out.println("Retirarse del lugar al final del evento");
	}

}

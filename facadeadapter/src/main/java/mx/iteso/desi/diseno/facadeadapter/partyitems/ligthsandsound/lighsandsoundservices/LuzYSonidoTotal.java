package mx.iteso.desi.diseno.facadeadapter.partyitems.ligthsandsound.lighsandsoundservices;

import mx.iteso.desi.diseno.facadeadapter.partyitems.ligthsandsound.ILightsAndSound;

public class LuzYSonidoTotal implements ILightsAndSound {

	@Override
	public void contract() {
		System.out.println("Estas contratando el servicio de Luz y Sonido Total");
	}

	@Override
	public void prepare() {
		System.out.println("Preparando las luces y el sonido para la fiesta");
	}

	@Override
	public void execute() {
        System.out.println("Manejar luces de acuerdo al evento");
	}

	@Override
	public void retire() {
		System.out.println("Desmontar luces");
	}
}

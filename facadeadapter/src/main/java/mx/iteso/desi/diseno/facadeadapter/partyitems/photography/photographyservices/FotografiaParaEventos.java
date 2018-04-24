package mx.iteso.desi.diseno.facadeadapter.partyitems.photography.photographyservices;

import mx.iteso.desi.diseno.facadeadapter.partyitems.photography.IPhotography;

public class FotografiaParaEventos implements IPhotography{

	@Override
	public void contract() {
        System.out.println("Estas contratando el servicio de Fotografia para eventos");
	}

	@Override
	public void execute() {
		System.out.println("Tomar fotos durante el evento");
	}

	@Override
	public void print() {
        System.out.println("Imprimir fotos para repartir a asistentes");
	}
}

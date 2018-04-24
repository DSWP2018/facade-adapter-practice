package mx.iteso.desi.diseno.facadeadapter.partyitems.tickets.ticketservices;

import mx.iteso.desi.diseno.facadeadapter.partyitems.tickets.ITickets;

public class DisenoImpresiones implements ITickets{

	@Override
	public void contract() {
        System.out.println("Estas contratando el servicio de Diseno e Impresiones");
	}

	@Override
	public void print() {
		System.out.println("Disenar e imprimir los tickets");
	}

	@Override
	public void handout() {
		System.out.println("Repartir los tickets a los invitados");
	}

	@Override
	public void receive() {
		System.out.println("Recoger los tickets de los invitados en la entrada");
	}

}

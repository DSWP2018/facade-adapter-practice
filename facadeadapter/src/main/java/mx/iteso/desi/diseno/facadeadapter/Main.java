package mx.iteso.desi.diseno.facadeadapter;

import mx.iteso.desi.diseno.facadeadapter.facade.PartyOrganization;
import mx.iteso.desi.diseno.facadeadapter.partyitems.band.IBand;
import mx.iteso.desi.diseno.facadeadapter.partyitems.band.adapters.DJ;
import mx.iteso.desi.diseno.facadeadapter.partyitems.band.adapters.DJAdapter;
import mx.iteso.desi.diseno.facadeadapter.partyitems.cateringservice.ICateringService;
import mx.iteso.desi.diseno.facadeadapter.partyitems.cateringservice.cateringservices.Banquetes;
import mx.iteso.desi.diseno.facadeadapter.partyitems.ligthsandsound.ILightsAndSound;
import mx.iteso.desi.diseno.facadeadapter.partyitems.ligthsandsound.lighsandsoundservices.LuzYSonidoTotal;
import mx.iteso.desi.diseno.facadeadapter.partyitems.photography.IPhotography;
import mx.iteso.desi.diseno.facadeadapter.partyitems.photography.photographyservices.FotografiaParaEventos;
import mx.iteso.desi.diseno.facadeadapter.partyitems.place.IPlace;
import mx.iteso.desi.diseno.facadeadapter.partyitems.place.places.Casino;
import mx.iteso.desi.diseno.facadeadapter.partyitems.security.ISecurity;
import mx.iteso.desi.diseno.facadeadapter.partyitems.security.secutieservices.SeguridadPrivada;
import mx.iteso.desi.diseno.facadeadapter.partyitems.tickets.ITickets;
import mx.iteso.desi.diseno.facadeadapter.partyitems.tickets.ticketservices.DisenoImpresiones;

public class Main 
{
    public static void main( String[] args )
    {
        IBand mBand = new DJAdapter(new DJ());
        ICateringService mCateringService = new Banquetes();
        ILightsAndSound mLightsAndSound = new LuzYSonidoTotal();
        IPhotography mPhotography = new FotografiaParaEventos();
        IPlace mPlace = new Casino();
        ISecurity mSecurity = new SeguridadPrivada();
        ITickets mTickets = new DisenoImpresiones();
        
        PartyOrganization mPartyOrganization = new PartyOrganization();

        mPartyOrganization.setmBand(mBand);
        mPartyOrganization.setmCateringService(mCateringService);
        mPartyOrganization.setmLightsAndSound(mLightsAndSound);
        mPartyOrganization.setmPhotography(mPhotography);
        mPartyOrganization.setmPlace(mPlace);
        mPartyOrganization.setmSecurity(mSecurity);
        mPartyOrganization.setmTickets(mTickets);

        mPartyOrganization.organize();
        mPartyOrganization.execute();
        mPartyOrganization.followUp();

        System.out.println( "Fin!" );
    }
}

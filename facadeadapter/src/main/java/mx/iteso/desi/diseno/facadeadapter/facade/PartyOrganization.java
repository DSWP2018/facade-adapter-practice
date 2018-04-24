package mx.iteso.desi.diseno.facadeadapter.facade;

import mx.iteso.desi.diseno.facadeadapter.partyitems.band.IBand;
import mx.iteso.desi.diseno.facadeadapter.partyitems.cateringservice.ICateringService;
import mx.iteso.desi.diseno.facadeadapter.partyitems.ligthsandsound.ILightsAndSound;
import mx.iteso.desi.diseno.facadeadapter.partyitems.photography.IPhotography;
import mx.iteso.desi.diseno.facadeadapter.partyitems.place.IPlace;
import mx.iteso.desi.diseno.facadeadapter.partyitems.security.ISecurity;
import mx.iteso.desi.diseno.facadeadapter.partyitems.tickets.ITickets;

public class PartyOrganization {
	private ICateringService mCateringService;
    private ILightsAndSound mLightsAndSound;
    private IPhotography mPhotography;
    private IPlace mPlace;
    private ISecurity mSecurity;
    private ITickets mTickets;

	private IBand mBand;

    public PartyOrganization(){
	}
	
    public void organize(){
		mBand.contract();
		mCateringService.contract();
		mLightsAndSound.contract();
		mPhotography.contract();
		mPlace.contract();
		mSecurity.contract();
		mTickets.contract();
		mTickets.print();
		mTickets.handout();
	}
	
    public void execute(){
		mBand.test();
		mBand.play();
		mCateringService.prepare();
		mLightsAndSound.prepare();
		mLightsAndSound.execute();	
		mPhotography.execute();
		mPlace.prepare();
		mSecurity.patrol();
		mTickets.receive();
    }
	
    public void followUp(){
		mBand.retire();
		mCateringService.cleanUp();
		mLightsAndSound.retire();
		mPhotography.print();
		mPlace.clean();
		mSecurity.retire();
    }
	
	/**
	 * @return the mBand
	 */
	public IBand getmBand() {
		return mBand;
	}

	/**
	 * @param mBand the mBand to set
	 */
	public void setmBand(IBand mBand) {
		this.mBand = mBand;
	}
	
	/**
	 * @return the mCateringService
	 */
	public ICateringService getmCateringService() {
		return mCateringService;
	}

	/**
	 * @param mCateringService the mCateringService to set
	 */
	public void setmCateringService(ICateringService mCateringService) {
		this.mCateringService = mCateringService;
	}

	/**
	 * @return the mLightsAndSound
	 */
	public ILightsAndSound getmLightsAndSound() {
		return mLightsAndSound;
	}

	/**
	 * @param mLightsAndSound the mLightsAndSound to set
	 */
	public void setmLightsAndSound(ILightsAndSound mLightsAndSound) {
		this.mLightsAndSound = mLightsAndSound;
	}

	/**
	 * @return the mPhotography
	 */
	public IPhotography getmPhotography() {
		return mPhotography;
	}

	/**
	 * @param mPhotography the mPhotography to set
	 */
	public void setmPhotography(IPhotography mPhotography) {
		this.mPhotography = mPhotography;
	}

	/**
	 * @return the mPlace
	 */
	public IPlace getmPlace() {
		return mPlace;
	}

	/**
	 * @param mPlace the mPlace to set
	 */
	public void setmPlace(IPlace mPlace) {
		this.mPlace = mPlace;
	}

	/**
	 * @return the mSecurity
	 */
	public ISecurity getmSecurity() {
		return mSecurity;
	}

	/**
	 * @param mSecurity the mSecurity to set
	 */
	public void setmSecurity(ISecurity mSecurity) {
		this.mSecurity = mSecurity;
	}

	/**
	 * @return the mTickets
	 */
	public ITickets getmTickets() {
		return mTickets;
	}

	/**
	 * @param mTickets the mTickets to set
	 */
	public void setmTickets(ITickets mTickets) {
		this.mTickets = mTickets;
	}

}
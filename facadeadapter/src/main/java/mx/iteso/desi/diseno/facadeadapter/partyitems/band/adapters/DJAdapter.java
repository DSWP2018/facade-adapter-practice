package mx.iteso.desi.diseno.facadeadapter.partyitems.band.adapters;

import mx.iteso.desi.diseno.facadeadapter.partyitems.band.IBand;

public class DJAdapter implements IBand {

    private DJ mDJ;

	public DJAdapter(DJ dj){
		mDJ = dj;
	}

	@Override
	public void contract() {
		mDJ.contract();
	}

	@Override
	public void test() {
		mDJ.testConsole();
	}

	@Override
	public void play() {
		mDJ.playDJ();
	}

	@Override
	public void retire() {
		mDJ.byeDJ();
	}
}

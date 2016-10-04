package plo.ujk;

public enum Transport {
	CAR(200),TRAIN(80),PLAIN(900),BUS(60),BIKE(30),HORSE(40);
	
	private int maxspeed;
	
	
	
	public int getMaxspeed() {
		return maxspeed;
	}


	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}


	private Transport(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	

}

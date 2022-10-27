package ch07;

public class Ex7_4 {

}


class LgTv{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}

class VCR{
	boolean power;
	int counter = 0;
	void power() {
		power = !power;
	}
	void play() {}
	void stop()	{}
	void ff() {}
}

class TVCR extends LgTv{
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void ff() {
		vcr.ff();
	}
}
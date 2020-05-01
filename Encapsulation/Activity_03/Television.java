package Activity_03;

public class Television {   
	protected int channel;
	protected int sound;

	  public void getCurrentChannel() {
	    System.out.printf("Current chanel: %d\n", this.channel);
	  }

	  public void getCurrentSound() {
	    System.out.printf("Current sound: %d\n", this.sound);
	  }

}
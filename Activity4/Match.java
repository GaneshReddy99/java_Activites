
public abstract class Match {
	private int currentscore;
    private Float currentover;
    private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public Float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(Float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
   public abstract  float calculateRunRate(int y,int z,int w);
    public abstract int calculateBalls(int y,int z,int w);
    
  public abstract void display(float reqRunrate, int balls);
    

}

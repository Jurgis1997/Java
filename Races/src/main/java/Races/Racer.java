package Races;

public class Racer {
	private String Name;
	private int Victories ;
	private String SwimTime;
	private int KnockingDown;
	private int Refusal;
	private int Disobedienceleading;
	private int Targetscore;
	private String Time;
	
	
	
	public int finalscore(String name, int Victories, String SwimTime, int Knocking, int Refusal, int Disobedience, int score, String Time) {
		int result = 0;
		if(score >= 172) { 
			result = 1000 + (score - 172)*12; 
			}
		else {
			result = 1000 - (score - 172)*12;
		}
		
		
			
		
		return result;
	}
	
	public int getDisobedienceleading() {
		return Disobedienceleading;
	}
	public int getKnockingDown() {
		return KnockingDown;
	}
	public String getName() {
		return Name;
	}
	public int getRefusal() {
		return Refusal;
	}
	public String getSwimTime() {
		return SwimTime;
	}
	public int getTargetscore() {
		return Targetscore;
	}
	public String getTime() {
		return Time;
	}
	public int getVictories() {
		return Victories;
	}
	public void setDisobedienceleading(int disobedienceleading) {
		Disobedienceleading = disobedienceleading;
	}
	public void setKnockingDown(int knockingDown) {
		KnockingDown = knockingDown;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setRefusal(int refusal) {
		Refusal = refusal;
	}
	public void setSwimTime(String swimTime) {
		SwimTime = swimTime;
	}
	public void setTargetscore(int targetscore) {
		Targetscore = targetscore;
	}
	public void setTime(String time) {
		Time = time;
	}
	public void setVictories(int victories) {
		Victories = victories;
	}
	
	
}

package _07_duck;

public class Duck {
	private int numberOfFriends;
	private String favoriteFood;
	
	public Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	public void quack() {
		
	}
	public void waddle() {
		
	}
	public int getFr() {
		return numberOfFriends;
	}
	public String fetFud() {
		return favoriteFood;
	}
}
	class Rabbit{
		private String occupation;
		private String accessory;
		
		public Rabbit(String a, String b) {
			this.occupation = a;
			this.accessory =b;
		}
		public String getC() {
			return occupation;
		}
		public String getB() {
			return accessory;
		}
		public void greeting() {
		System.out.println("Hoi! Is that you Sasuke?!Oh well, I'm Naruto Uzumaki, peko");
		}
	}
	

	
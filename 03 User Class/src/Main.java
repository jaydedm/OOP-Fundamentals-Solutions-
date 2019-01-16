public class Main {

	public static class User{

		//instance variables
		private String Name;
		private int Score;


		//constructor

		public User(){}

		private User(String name, int score){
			this.Name = name;
			this.Score = score;
		}

		private String getName(){
			return this.Name;
		}

		public void setName(String name) {
			Name = name;
		}

		private int getScore() {
			return this.Score;
		}

		public void setScore(int score) {
			Score = score;
		}


		private void increaseScoreByOne() {



		}
	}


	public static void main(String[] args) {
		User sampleUser = new User();
		sampleUser.setName("Henry");
		sampleUser.setScore(1337);
		sampleUser.increaseScoreByOne();

		System.out.println("User " + sampleUser.getName() + " has a score of: " + sampleUser.getScore()); // Prints ‘User Henry has a score of: 1337’

	}

}

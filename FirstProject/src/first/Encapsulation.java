package first;


class student{
	private int rollnumber;
	private String name;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

	public  class Encapsulation {
		public static  void main(String[] args) {
			student s = new student();
			s.setRollnumber(7);
			s.setName("john");
			System.out.println(s.getRollnumber());
			System.out.println(s.getName());
		}
	}

	

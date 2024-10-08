package Spring.model;

public class Employee {

	
		private int id;
		private String name;
		private String gender;	
		
		
		
	

		public Employee(int id, String name, String gender) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
//			System.out.println("Employee.Employee()");
		}

		
		public int getId() {
			return id;
		}




		public void setId(int id) {
//			System.out.println("Employee.setId()"); sysoint

			this.id = id;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
//			System.out.println("Employee.setName()");
			this.name = name;
		}




		public String getGender() {
//			System.out.println("Employee.setGender()");

			return gender;
		}




		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + "]";
		}


	public Employee() {
		super();
//		System.out.println("Employee.Employee(3)");
		
		

}
}
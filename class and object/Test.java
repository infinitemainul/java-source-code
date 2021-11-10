public class Test{
		public static void main(String [] args){
			Student student1; //Declaring variable of student type
			student1= new Student(); //Object creation
			student1.name="Jimmy";
			student1.gender="Male";
			student1.age=7;
			
			System.out.println("Name: "+student1.name);
			System.out.println("Gender: "+student1.gender);
			System.out.println("Age: "+student1.age);

			System.out.println("\n");
			
			Student student2 = new Student();
			student2.name="Luna";
			student2.gender="Female";
			student2.age=8;
					
			System.out.println("Name: "+student2.name);
			System.out.println("Gender: "+student2.gender);
			System.out.println("Age: "+student2.age);
		}
}


















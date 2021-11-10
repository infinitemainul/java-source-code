public class Test{
		public static void main(String [] args){
			Student student1; //Declaring variable of student type
			student1= new Student(); //Object creation
			student1.name="Jimmy";
			student1.gender="Male";
			student1.age=7;
			
			student1.displayInformation();

			System.out.println("\n");
			
			Student student2 = new Student();
			student2.name="Luna";
			student2.gender="Female";
			student2.age=8;
					
			student2.displayInformation();
		}
}


















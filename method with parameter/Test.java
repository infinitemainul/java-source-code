public class Test{
		public static void main(String [] args){
			Student student1; //Declaring variable of student type
			student1= new Student(); //Object creation
			student1.setInformation("Jimmy","Male",7);
			
			student1.displayInformation();

			System.out.println("\n");
			
			Student student2 = new Student();
			student2.setInformation("Luna","Female",8);
					
			student2.displayInformation();
		}
}


















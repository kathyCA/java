class Teacher {
   String designation = "Teacher";
   String collegeName = "Beginnersbook";
   void does(){
	System.out.println("Teaching");
   }
}

public class physicsteacher extends Teacher{
   String mainSubject = "Physics";
   public static void main(String args[]){
	physicsteacher obj = new physicsteacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
   }
}

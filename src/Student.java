public class Student extends Person {
    private static Student student;
   public static Student singleton(){
       if(student== null){
           synchronized (Student.class){
               if(student==null){
                   student= new Student();
               }
           }
       }
      return student;
   }
}

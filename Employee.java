public class Employee {
   void work() {
       System.out.println("Employee is working");

   }

   void attendMeeting(){
       System.out.println("Employee attends meeting");
   }
}


class Programmer extends Employee {
   @Override
   void work() {
       System.out.println("Programmer writes code");
   }
}


package day46_collection_part1;
 class SampleClass extends LinkList{
     public static void main(String[] args) {
         innerPrivate innerClass = new innerPrivate();
         innerClass.printl();
         System.out.println("printing from main class");
     }

     private static class innerPrivate{
       void printl(){
           System.out.println("calling from inner class");
       }

     }
}



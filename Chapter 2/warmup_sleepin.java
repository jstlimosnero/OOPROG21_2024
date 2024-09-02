package activities;
 public class warmup_sleepin {
      public static boolean sleepIn(boolean weekday, boolean vacation) {
         if (!weekday){
         return true;
      } else if (vacation){
         return true;
      } else {
         return false;
      }
   }
         public static void main(String[] args) {
        warmup_sleepin warmup_sleepin = new warmup_sleepin();
    
   System.out.println(sleepIn(false, false));
   System.out.println(sleepIn(true, false));
   System.out.println(sleepIn(false, true));
   System.out.println(sleepIn(true, true));
  }
}
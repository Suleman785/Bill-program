public  class MarkSheet {
    public static void main(String[]args){

    int java=90, laag=70, physics=30, english=33,electronic=90;

   float totalmarks=java+laag+physics+english+electronic;

   float percentage=(totalmarks/500)*100;

   if (percentage>85 && percentage<100){

       System.out.println("Great work you got A plus:"+percentage);
   }
   if (percentage>70 && percentage<80){

       System.out.println("Good work you got A:"+percentage);
   }
   if (percentage>60 && percentage<70){

       System.out.println("Mehnat kr you got b grade:"+percentage);

   }
       if (percentage>50 && percentage<60){
           System.out.println("lagy tho doller kamir jo shonk aw:"+percentage);
       }
       if (percentage<50){
           System.out.println("ada tu fail ahyeen supply ja paisa jama kr"+percentage);
       }
   }
    }
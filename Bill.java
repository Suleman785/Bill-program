     class Bill{
    public static void main(String[]args){

        int units=156;

        float percentage=(units/100*10);

        float extra= (units*30)+(percentage);

        if (units<100){

            System.out.println("your bill is:"+units*8);
        }
        if (units>100 && units<200){

            System.out.println("your bill is:"+units*15);
        }
        if (units>200 && units<300){

            System.out.println("your bill is:"+units*20);
        }
        if (units>300){

            System.out.println("your bill is :"+units*30+percentage);
        }
    }

}
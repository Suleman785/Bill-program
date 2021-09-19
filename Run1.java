 class Run1{
    public static void main(String[] args) {
        //100/200  200/300 300
        int units = 100;
        int percentage = (units / 100)*10;

        if (units > 100 && units < 99) {
            System.out.println("you bill is:" + units*8);
        }
        if (units > 100 && units < 200) {
            System.out.println("your bill is:" + units*10);
        }

        if (units > 200 && units < 300) {
            System.out.println("your bill is:" + units*15);
        }
        if (units > 300) {
            System.out.println("your bill is:" + units*30+percentage);
        }

    }
}
public class ForLoop {
    public static void main(String[] args) {
        String correct="Correct";
        for(int i = 0;i<=10;i++) {
            System.out.println("Hello "+i);   //i++=i+1
        }
        int myInt=15;
        if(myInt<10) {
            System.out.println("Нет не верно ");
        }
        else if(myInt<20){
            System.out.println(correct);
        }
        else{
            System.out.println("None of them correct");
        }
    }
}

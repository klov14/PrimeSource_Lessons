public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());
        System.out.printf("Hello amigo, %s \n","HAY");//%d for integers    \n for new line
        System.out.printf("Number is, %10d\n", 523);
        System.out.printf("Number is, %.2f", 523.45678);
        //toString() when we print an object we essentially do: h1.toString();
        //So go on and change the method: public String toString(){return name+age}so it only prints what we want



    }

}

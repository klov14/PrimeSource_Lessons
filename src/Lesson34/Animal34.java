package Lesson34;

class Animal34 {
    private int id;

    public Animal34(){}
    public Animal34(int id){
        this.id=id;
    }

    public void eat(){
        System.out.println("Your animal is eating");
    }
    public String toString(){
        return String.valueOf(id);
    }
}

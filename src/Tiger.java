import java.util.Comparator;

public class Tiger implements Cat {

    private int age;

    public int getAge(){
        return age;
    }

    public Tiger(int age){
        this.age = age;
    }

    @Override public void meow() {
        System.out.println("meow");
    }

    @Override public String toString(){
        return "Age: " + getAge();
    }

}

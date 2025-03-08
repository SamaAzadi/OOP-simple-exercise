public class Person {
    private String name;
    private int age;


    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void isAnAdult(){
        if(age >= 18)
        {
            System.out.println(name + " is an adult.");
        }else{
            System.out.println(name + " is not an adult.");
        }
    }

    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
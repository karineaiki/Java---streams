public class Hero {

    // attribut"s
    private String name;
    private int age;
    private boolean glutenIntolerant;

    // constructors
    public Hero(String name, int age, boolean glutenIntolerant) {
        this.name = name;
        this.age = age;
        this.glutenIntolerant = glutenIntolerant;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGlutenIntolerant() {
        return glutenIntolerant;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGlutenIntolerant(boolean glutenIntolerant) {
        this.glutenIntolerant = glutenIntolerant;
    }
}
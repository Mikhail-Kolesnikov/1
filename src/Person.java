import java.util.Objects;

public class Person {

    private String name;
    private int age;

    private Debiting type;


    public Person(String name, int age, Debiting type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && type == person.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, type);
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

    public Debiting getType() {
        return type;
    }

    public void setType(Debiting type) {
        this.type = type;
    }
}


//1. Пользователь вводит в консоли число - количество данных, которые будет вводить
//2. Далее пользователь начинает ввод данных через консоль (кол-во данных = числу, введенному ранее)
//3. В каждой строке пользователь вводит:
//3.1 Количество денег, которые он хочет положить на вклад
//3.2 Процент по вкладку
//3.3 Количество лет (длительность вклада)
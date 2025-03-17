//Класс для представления человека

@Validate({PersonValidator.class}) // Аннотация указывает, какие классы валидации использовать
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

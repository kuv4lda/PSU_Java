//Валидатор для проверки возраста

public class PersonValidator {
    // Метод для проверки возраста человека
    public static void validate(Person person) throws Exception {
        int age = person.getAge();
        if (age < 1 || age > 200) {
            throw new Exception("Ошибка валидации: возраст должен быть от 1 до 200.");
        }
    }
}

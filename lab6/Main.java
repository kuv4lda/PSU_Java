public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тест 1.2: Валидация ===");
        testValidation();

        System.out.println("\n=== Тест 2.1: Аннотация @Invoke ===");
        testInvokeAnnotation();

        System.out.println("\n=== Тест 2.2: Аннотация @Default ===");
        testDefaultAnnotation();

        System.out.println("\n=== Тест 2.3: Аннотация @ToString ===");
        testToStringAnnotation();

        System.out.println("\n=== Тест 2.4: Аннотация @Validate ===");
        testValidateAnnotation();

        System.out.println("\n=== Тест 2.5: Аннотация @Two ===");
        testTwoAnnotation();

        System.out.println("\n=== Тест 2.6: Аннотация @Cache ===");
        testCacheAnnotation();

        System.out.println("\n=== Тест 3.2: Улучшенная валидация ===");
        testAdvancedValidation();
    }

    private static void testValidation() {
        try {
            Person person = new Person("John", -5); // Пример с некорректным возрастом
            Validator.validate(person, PersonValidator.class);
        } catch (Exception e) {
            System.out.println("Ошибка валидации: " + e.getMessage());  // Печатаем подробное сообщение об ошибке
        }
    }

    private static void testInvokeAnnotation() {
        for (var method : InvokeTest.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    method.invoke(null);
                } catch (Exception e) {
                    System.out.println("Ошибка выполнения метода: " + method.getName());
                }
            }
        }
    }

    private static void testDefaultAnnotation() {
        if (DefaultTest.class.isAnnotationPresent(Default.class)) {
            Default annotation = DefaultTest.class.getAnnotation(Default.class);
            System.out.println("Аннотация @Default указывает на класс: " + annotation.value().getSimpleName());
        } else {
            System.out.println("Аннотация @Default отсутствует");
        }
    }

    private static void testToStringAnnotation() {
        if (ToStringTest.class.isAnnotationPresent(ToString.class)) {
            ToString annotation = ToStringTest.class.getAnnotation(ToString.class);
            System.out.println("Аннотация @ToString: " + annotation.value());
        }
    }

    private static void testValidateAnnotation() {
        if (Person.class.isAnnotationPresent(Validate.class)) {
            System.out.println("Аннотация @Validate присутствует у класса Person");
        } else {
            System.out.println("Аннотация @Validate отсутствует");
        }
    }

    private static void testTwoAnnotation() {
        if (TwoTest.class.isAnnotationPresent(Two.class)) {
            Two annotation = TwoTest.class.getAnnotation(Two.class);
            System.out.println("Аннотация @Two: first = " + annotation.first() + ", second = " + annotation.second());
        }
    }

    private static void testCacheAnnotation() {
        if (CacheTest.class.isAnnotationPresent(Cache.class)) {
            Cache annotation = CacheTest.class.getAnnotation(Cache.class);
            System.out.println("Аннотация @Cache: " + String.join(", ", annotation.value()));
        }
    }

    private static void testAdvancedValidation() {
        try {
            Person validPerson = new Person("Alice", 250); // Проверим возраст 250
            Person invalidPerson = new Person("Bob", 5); // Проверим возраст 5

            Validator.validate(validPerson, invalidPerson); // Валидация обоих объектов
        } catch (Exception e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        }
    }
}

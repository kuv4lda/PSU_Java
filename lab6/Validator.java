//Утилита для валидации объектов

import java.lang.reflect.Method;

public class Validator {
    /*
     * Проверяет объект на корректность, используя методы указанного класса-валидатора.
     * @param obj         Тестируемый объект
     * @param validator   Класс, содержащий методы проверки
     * @throws Exception  Если объект не проходит тест
     */
    public static void validate(Object obj, Class<?> validator) throws Exception {
        for (Method method : validator.getDeclaredMethods()) {
            if (method.getParameterCount() == 1 && method.getParameterTypes()[0].isAssignableFrom(obj.getClass())) {
                method.invoke(null, obj); // Вызываем метод валидации
            }
        }
    }

    /*
     * Проверяет список объектов, используя аннотацию @Validate.
     * @param objects Объекты для проверки
     * @throws Exception Если хотя бы один объект не проходит тест
     */
    public static void validate(Object... objects) throws Exception {
        for (Object obj : objects) {
            Validate annotation = obj.getClass().getAnnotation(Validate.class);
            if (annotation != null) {
                for (Class<?> validator : annotation.value()) {
                    validate(obj, validator);
                }
            }
        }
    }
}

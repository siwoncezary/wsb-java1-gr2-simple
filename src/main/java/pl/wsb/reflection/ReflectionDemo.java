package pl.wsb.reflection;

import pl.wsb.rectangle.Rectangle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Rectangle rectangle = new Rectangle(12, 20);
        Constructor<Rectangle> constructor = Rectangle.class.getDeclaredConstructor();
        //dostęp do konstruktora prywatnego
        constructor.setAccessible(true);
        //Dla poprzednich wersji refleksji konieczne było rzutowanie
        Rectangle instance = (Rectangle) constructor.newInstance();
        System.out.println(instance);
        Method[] methods = Rectangle.class.getDeclaredMethods();
        Field[] fields = Rectangle.class.getDeclaredFields();
        System.out.println("****************************");
        for(Field field: fields){
            System.out.println(field.getName());
            System.out.println(field.getType());
        }
        System.out.println("************");
        for(Method method: methods){
            System.out.println(method.getName());
            System.out.println(method.getParameterCount());
        }
    }
}

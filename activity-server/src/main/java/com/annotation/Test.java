package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

@AnnotationTest
public class Test {

    @AnnotationTest(test = "test field")
    private String test;

    @AnnotationTest("testDefaultValue")
    public String testDefaultValue(){
        System.out.println("test default value");
        return "Test default value";
    }

    @AnnotationTest(test = "test other value")
    public String testOtherValue(){
        System.out.println("Test other value");
        return "Test other value";
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Class clazz = Test.class;

        AnnotationTest annotation = (AnnotationTest)clazz.getAnnotation(AnnotationTest.class);
        System.out.println("annotation value on class : " + clazz.getName()+ " : " + annotation.value());
        System.out.println("annotation test on class : " + clazz.getName() + " : " + annotation.test());

        Annotation[] annotations = clazz.getAnnotations();
        Arrays.stream(annotations).forEach(a -> System.out.println("annatation type: " + a.annotationType()));


        Field field = clazz.getDeclaredField("test");
        annotation = field.getAnnotation(AnnotationTest.class);
        System.out.println("annotation value on filed : " + field.getName() + " : " + annotation.value());
        System.out.println("annotation test on filed : " + field.getName() +" : " + annotation.test());

        Method[] methods = clazz.getMethods();
        Arrays.stream(methods).forEach(m ->{
            AnnotationTest anno = m.getAnnotation(AnnotationTest.class);
            if (anno == null) return;
            System.out.println("annotation value on method : " + m.getName()+ " : " + anno.value());
            System.out.println("annotation test: on method : " + m.getName() + ": " + anno.test());
        });
    }
}

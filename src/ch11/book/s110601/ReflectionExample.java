package ch11.book.s110601;

import java.lang.reflect.Constructor;

import com.sun.jdi.Field;

public class ReflectionExample {
	public static void main(String[] args) {
		Class clazz = Class.forName("sec06.exam02_reflection.Car");
		
		System.out.println("[클래스이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		Constructor[] constructor = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName()+"(");
			Class[]	parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
			System.out.println();
			
			System.out.println("[필드 정보]");
			Field[] fields = clazz.getDeclaredFields();
			for(Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
		}
	}
}

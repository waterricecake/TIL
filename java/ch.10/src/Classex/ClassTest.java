package Classex;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person("james");
		System.out.println(person);
		
		Class c1 = Class.forName("Classex.Person");
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"kim"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);
	}
}

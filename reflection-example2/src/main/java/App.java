import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		Class<?> bookClass = Class.forName("Book");
		Constructor<?> constructor = bookClass.getConstructor(String.class);
		Book book = (Book) constructor.newInstance("myBook");
		System.out.println(book);

		Field a = Book.class.getDeclaredField("A");
		System.out.println(a.get(null));
		a.set(null, "AAAAAA");
		System.out.println(a.get(null));

		Field b = Book.class.getDeclaredField("B");
		b.setAccessible(true);
		System.out.println(b.get(book));
		b.set(book, "BBBBBB");
		System.out.println(b.get(book));

		Method c = Book.class.getDeclaredMethod("c");
		c.setAccessible(true);
		c.invoke(book);

		Method d = Book.class.getDeclaredMethod("sum", int.class, int.class);
		int invoke = (int) d.invoke(book, 1, 2);
		System.out.println(invoke);
	}
}

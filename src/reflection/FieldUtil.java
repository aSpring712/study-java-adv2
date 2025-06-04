package reflection;

import java.lang.reflect.Field;

/**
 * Field Util
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class FieldUtil {

	public static void nullFieldToDefault(Object target) throws IllegalAccessException {
		Class<?> aClass = target.getClass();
		Field[] declaredFields = aClass.getDeclaredFields();
		for (Field field : declaredFields) {
			field.setAccessible(true);
			if (field.get(target) != null) {
				continue;
			}

			if (field.getType() == String.class) {
				field.set(target, " ");
			} else if (field.getType() == Integer.class) {
				field.set(target, 0);
			}
		}
	}
}
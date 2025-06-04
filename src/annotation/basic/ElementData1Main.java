package annotation.basic;

import java.util.Arrays;

/**
 * Element Data1 Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class ElementData1Main {

	public static void main(String[] args) {
		Class<ElementData1> annoClass = ElementData1.class;
		AnnoElement annotation = annoClass.getAnnotation(AnnoElement.class);

		String value = annotation.value();
		System.out.println("value = " + value);

		int count = annotation.count();
		System.out.println("count = " + count);

		String[] tags = annotation.tags();
		System.out.println("tags = " + Arrays.toString(tags));
	}
}
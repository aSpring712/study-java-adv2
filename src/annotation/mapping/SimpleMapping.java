package annotation.mapping;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Simple Mapping
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface SimpleMapping {
	String value();
}
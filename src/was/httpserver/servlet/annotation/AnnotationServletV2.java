package was.httpserver.servlet.annotation;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;
import was.httpserver.PageNotFoundException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Annotation Servlet V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class AnnotationServletV2 implements HttpServlet {

	private final List<Object> controllers;

	public AnnotationServletV2(List<Object> controllers) {
		this.controllers = controllers;
	}

	@Override
	public void service(HttpRequest request, HttpResponse response) throws IOException {
		String path = request.getPath();

		for (Object controller : controllers) {
			Method[] methods = controller.getClass().getDeclaredMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(Mapping.class)) {
					Mapping mapping = method.getAnnotation(Mapping.class);
					String value = mapping.value();
					if (value.equals(path)) {
						invoke(request, response, controller, method);
						return;
					}
				}
			}
		}
		throw new PageNotFoundException("request = " + path);
	}

	private void invoke(HttpRequest request, HttpResponse response, Object controller, Method method) {
		Class<?>[] parameterTypes = method.getParameterTypes();
		Object[] args = new Object[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i] == HttpRequest.class) {
				args[i] = request;
			}  else if (parameterTypes[i] == HttpResponse.class) {
				args[i] = response;
			} else {
				throw new IllegalArgumentException("Unsupported parameter type: " + parameterTypes[i]);
			}
		}

		try {
			method.invoke(controller, args);
		} catch (InvocationTargetException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
}
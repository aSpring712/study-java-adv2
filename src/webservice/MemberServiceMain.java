package webservice;

import io.member.MemberRepository;
import io.member.impl.FileMemberRepository;
import was.httpserver.HttpServer;
import was.httpserver.HttpServlet;
import was.httpserver.ServletManager;
import was.httpserver.servlet.DiscardServlet;
import was.httpserver.servlet.annotation.AnnotationServletV3;

import java.io.IOException;
import java.util.List;

/**
 * Member Service Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-05
 * @version 1.0
 */
public class MemberServiceMain {

	private static final int PORT = 12345;

	public static void main(String[] args) throws IOException {
		MemberRepository memberRepository = new FileMemberRepository();
		MemberController memberController = new MemberController(memberRepository);
		HttpServlet servlet = new AnnotationServletV3(List.of(memberController));

		ServletManager servletManager = new ServletManager();
		servletManager.add("/favicon.ico", new DiscardServlet());
		servletManager.setDefaultServlet(servlet);
		HttpServer server = new HttpServer(PORT, servletManager);
		server.start();
	}
}
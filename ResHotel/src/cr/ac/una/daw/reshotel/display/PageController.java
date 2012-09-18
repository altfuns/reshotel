package cr.ac.una.daw.reshotel.display;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.springframework.web.context.*;
import org.springframework.web.context.support.*;

/**
 * Controlador de pagina base
 *
 */
public class PageController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2581877634900440920L;
	protected WebApplicationContext context;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.context = WebApplicationContextUtils
				.getWebApplicationContext(getServletContext());
	}

	protected void forward(String target, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.context.getServletContext()
				.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}
}
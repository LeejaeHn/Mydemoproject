package org.iclass.controller.book;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iclass.controller.Controller;

public class BookCaseFormController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("BookcaseForm.jsp");
=======
		RequestDispatcher dispatcher = request.getRequestDispatcher("bookcaseForm.jsp");
>>>>>>> refs/heads/final
		dispatcher.forward(request, response);
	}

}

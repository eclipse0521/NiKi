package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di.M_Action;
import model.CenterDAO;

public class Detail implements M_Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int id = Integer.parseInt(request.getParameter("id"));
		new CenterDAO().addCount(id);
		request.setAttribute("dto", new CenterDAO().detail(id));

	}

}

package edu.eci.cvds.servlet;

import edu.eci.cvds.servlet.model.Todo;
import java.util.*;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
	    urlPatterns = "/my_page"
	)

public class AltServlet extends HttpServlet{
	protected int id = 1;
	@Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Writer responseWriter = resp.getWriter();
			try {
		       Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
		       if (optId.isPresent() && !optId.get().isEmpty())
		       {
		    	   try {
			    	   id = Integer.parseInt(optId.get());
			    	   if (id > 0 && id < 201)
			    	   {
			    		   List<Todo> todo = new ArrayList();
					       todo.add(Service.getTodo(id));
					       resp.setStatus(HttpServletResponse.SC_OK);
					       responseWriter.write(Service.todosToHTMLTable(todo));
					       responseWriter.flush();
			    	   }else 
			    	   {
			    		   resp.setStatus(412);
			    		   responseWriter.write("Requerimiento Invalido");
					       responseWriter.flush();
			    	   }
		    	   }catch(NumberFormatException E)
		    	   {
		    		   resp.setStatus(412);
		    		   responseWriter.write("Requerimiento Invalido");
				       responseWriter.flush();
		    	   }
		    	   
		       }else if(!optId.isPresent())
		       {
		    	   resp.setStatus(400);
		    	   responseWriter.write("No Existe un item con el identificador requerido");
			       responseWriter.flush();
		       }
		   }catch(MalformedURLException urle) 
		   {
			   resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		   }
		   catch(Exception Oe) {
			   resp.setStatus(HttpServletResponse.SC_PRECONDITION_FAILED);
			   responseWriter.write("Requerimiento Invalido");
		       responseWriter.flush();
		   }
	       
	   }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		Writer responseWriter = resp.getWriter();
		try {
	       Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
	       if (optId.isPresent() && !optId.get().isEmpty())
	       {
	    	   try {
		    	   id = Integer.parseInt(optId.get());
		    	   if (id > 0 && id < 201)
		    	   {
		    		   List<Todo> todo = new ArrayList();
				       todo.add(Service.getTodo(id));
				       resp.setStatus(HttpServletResponse.SC_OK);
				       responseWriter.write(Service.todosToHTMLTable(todo));
				       responseWriter.flush();
		    	   }else 
		    	   {
		    		   resp.setStatus(412);
		    		   responseWriter.write("Requerimiento Invalido");
				       responseWriter.flush();
		    	   }
	    	   }catch(NumberFormatException E)
	    	   {
	    		   resp.setStatus(412);
	    		   responseWriter.write("Requerimiento Invalido");
			       responseWriter.flush();
	    	   }
	    	   
	       }else if(!optId.isPresent())
	       {
	    	   resp.setStatus(400);
	    	   responseWriter.write("No Existe un item con el identificador requerido");
		       responseWriter.flush();
	       }
	   }catch(MalformedURLException urle) 
	   {
		   resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	   }
	   catch(Exception Oe) {
		   resp.setStatus(HttpServletResponse.SC_PRECONDITION_FAILED);
		   responseWriter.write("Requerimiento Invalido");
	       responseWriter.flush();
	   }
	}
}
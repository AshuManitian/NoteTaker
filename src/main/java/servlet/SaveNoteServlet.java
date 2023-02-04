package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Note;
import helper.FactoryProvider;


public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SaveNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		String title=request.getParameter("addTitle");
		String content=request.getParameter("addContent");
		Note note=new Note(title,content,new Date());
		Session s=FactoryProvider.getFactory().openSession();
		Transaction tran=s.beginTransaction();
		s.save(note);
		tran.commit();
		s.close();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1> Note save succesfully </h1>");
		out.print("<h1><a href='all_notes.jsp'>view all notes</a></h1>");
		}catch(Exception e){
			System.out.println("DB ERROR");
		}
	}

}

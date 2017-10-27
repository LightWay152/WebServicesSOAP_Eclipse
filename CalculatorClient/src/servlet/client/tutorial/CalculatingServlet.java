package servlet.client.tutorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservice.soap.tutorial.CalculatingServiceStub;
import webservice.soap.tutorial.CalculatingServiceStub.Add;
import webservice.soap.tutorial.CalculatingServiceStub.AddResponse;
import webservice.soap.tutorial.CalculatingServiceStub.Mul;
import webservice.soap.tutorial.CalculatingServiceStub.MulResponse;
import webservice.soap.tutorial.CalculatingServiceStub.Sub;
import webservice.soap.tutorial.CalculatingServiceStub.SubResponse;

public class CalculatingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalculatingServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String strNumberA = request.getParameter("numberA");
		String strNumberB = request.getParameter("numberB");
		Integer numberA = Integer.parseInt(strNumberA);
		Integer numberB = Integer.parseInt(strNumberB);
		
		CalculatingServiceStub calculatingServiceStub = new CalculatingServiceStub();
		Add sumOfTwoNumber = new Add();
		sumOfTwoNumber.setA(numberA);
		sumOfTwoNumber.setB(numberB);
		AddResponse addResponse = calculatingServiceStub.add(sumOfTwoNumber);
		int sum = addResponse.get_return();
		response.getWriter().write("" + sum);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String strNumberA = request.getParameter("numberA");
		String strNumberB = request.getParameter("numberB");
		Integer numberA = Integer.parseInt(strNumberA);
		Integer numberB = Integer.parseInt(strNumberB);
		
		CalculatingServiceStub calculatingServiceStub = new CalculatingServiceStub();
		Sub subOfTwoNumber = new Sub();
		subOfTwoNumber.setA(numberA);
		subOfTwoNumber.setB(numberB);
		SubResponse subResponse = calculatingServiceStub.sub(subOfTwoNumber);
		int sub = subResponse.get_return();
		response.getWriter().write("" + sub);
	}

}

package com.oop.handler;
import com.oop.dao.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import com.oop.bean.paymentBean;
import com.oop.dao.paymentdao;
 
public class paymentServlet extends HttpServlet {
 
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public paymentServlet() {
 }
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 //Copying all the input parameters in to local variables
	 
	 int cardNumber = Integer.parseInt(request.getParameter("cardNumber"));
	 int cardExpiry = Integer.parseInt(request.getParameter("cardExpiry"));
	 int cardcv = Integer.parseInt(request.getParameter("cardCVC"));
	 int couponcode = Integer.parseInt(request.getParameter("couponCode"));
	 //int cardNumber = request.Attribute("cardNumber");
	 //int cardExpiry = request.getParameter("cardExpiry");
	 //int cardcv = request.getParameter("cardCVC");
	 //int couponcode = request.getParameter("couponCode");
 
 paymentBean paymentbean = new paymentBean();
 //Using Java Beans - An easiest way to play with group of related data
 		paymentbean.setCardNumber(cardNumber);
 		paymentbean.setCardExpiry(cardExpiry);
 		paymentbean.setcouponcode(cardcv);
 		paymentbean.setcardcv(couponcode); 
 
 		paymentdao paymentDao = new paymentdao();
 
 //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
 		String payment1 = paymentDao.paymentuser(paymentbean);
 
 if(payment1.equals("SUCCESS"))   //On success, you can display a message to user on Home page
 {
	 request.getRequestDispatcher("/paymentFinish.jsp").forward(request, response);
 }
 else   //On Failure, display a meaningful message to the User.
 {
	 request.setAttribute("errMessage", payment1);
	 request.getRequestDispatcher("/payment.jsp").forward(request, response);
 }
 }
}
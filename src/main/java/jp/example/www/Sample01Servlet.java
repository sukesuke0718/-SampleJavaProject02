//****************************************************************
//	サーブレット名：Sample01Servlet
//	機能：計算画面の呼び出しを行う
//		計算を実施し、画面に表示する
//****************************************************************

package jp.example.www;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample01Servlet
 */
public class Sample01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample01Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String path = "/WEB-INF/jsp/sample01.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    float num1 		= 	0;	//	入力値1
	    float num2 		= 	0;	//	入力値2
	    float resultNum	=	0;	//	計算結果

	    //	画面上で入力された数字を取得し、足し算を行う
	    try {
	      num1 = Float.parseFloat(request.getParameter("num1"));
	      num2 = Float.parseFloat(request.getParameter("num2"));
	      resultNum = num1 + num2;
	    } catch (NumberFormatException e) {
	      resultNum = 0;
	    }
		
	    //	計算結果を画面に表示する
	    request.setAttribute("resultNum", resultNum);
		
		doGet(request, response);
	}

}

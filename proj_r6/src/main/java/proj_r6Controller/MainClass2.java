package proj_r6Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;
import dto.PatientDto;

@WebServlet("/abc")
public class MainClass2 extends HttpServlet
{
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	
	
	String s1=req.getParameter("pid");
	int pid=Integer.parseInt(s1);
	String pbgrp=req.getParameter("pbgrp");
	
	PatientDto pdto=new PatientDto();
	pdto.setPid(pid);
	pdto.setPbgrp(pbgrp);
	
	Patientdao pdao=new Patientdao();
	pdao.update(pid, pbgrp);
}
}

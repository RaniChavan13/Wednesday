package proj_r6Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;
import dto.PatientDto;

@WebServlet("/two")
public class MainClass1 extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	
	String s1=req.getParameter("pid");
	int pid=Integer.parseInt(s1);
	String pname=req.getParameter("pname");
	String s2=req.getParameter("phno");
	long phno=Long.parseLong(s2);
	String pbgrp=req.getParameter("pbgrp");
	
	PatientDto patientDto =new PatientDto();
	patientDto.setPid(pid);
	patientDto.setPname(pname);
	patientDto.setPhno(phno);
	patientDto.setPbgrp(pbgrp);
	
	Patientdao patientdao=new Patientdao();
	patientdao.insert(patientDto);
}
}

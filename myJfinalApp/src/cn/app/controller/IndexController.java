package cn.app.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller{

	public void index(){
		this.render("/index.jsp");
	}
	public void sayhello(){
		
		String userName=this.getPara("userName");
		String sayhello="Hello "+userName+",ok";
		this.setAttr("sayhello", sayhello);
		this.render("/hello.jsp");
	}
}

package cn.app.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller{

	public void index(){
		
		System.out.println("hello   rebase");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		this.render("/index.jsp");
	}
	public void sayhello(){
		
		String userName=this.getPara("userName");
		String sayhello="Hello "+userName+",ok";
		this.setAttr("sayhello", sayhello);
		this.render("/hello.jsp");
	}
	public void newFeature(){
		
		System.out.println("new feature");
	}
}

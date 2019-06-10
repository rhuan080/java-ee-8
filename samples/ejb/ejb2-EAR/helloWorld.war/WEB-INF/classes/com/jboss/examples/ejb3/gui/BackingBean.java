package com.jboss.examples.ejb3.gui;

import com.jboss.examples.ejb2.*;

import javax.rmi.PortableRemoteObject;
import javax.naming.InitialContext;

import javax.ejb.EJB;

public class BackingBean {
	
	private String name = "JBoss";
	private String response = "";
	private Boolean useTransferObject = false;

	//java:global/helloWorld/helloWorld-ejb/Example!com.jboss.examples.ejb2.ExampleLocalHome
	@EJB 
	private ExampleLocalHome ejbHome;

	public BackingBean() 
	{
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getUseTransferObject()
	{
		return useTransferObject;
	}
	public void setUseTransferObject ( Boolean useTransferObject )
	{
		this.useTransferObject = useTransferObject;
	}

	public String getResponse() {
		return response;
	}

	// looks up in JNDI on given host and calls hello with name
	public String hello() throws Exception 
	{
		System.out.println ( "Calling Remote interface ejbHome: " + ejbHome);
		Object o = new InitialContext().lookup("java:global/helloWorld/helloWorld-ejb/Example!com.jboss.examples.ejb2.ExampleRemoteHome");
		ExampleRemoteHome home = (ExampleRemoteHome) PortableRemoteObject.narrow(o, ExampleRemoteHome.class);
		ExampleRemote ejbRemote = (ExampleRemote) home.create();
		System.out.println ( "ejbRemote: " + ejbRemote);
		System.out.println("Hello response: " + ejbRemote.hello("JBoss"));
		this.response = ("Remote response: " + ejbRemote.hello("JBoss"));
		
		return "";
	}

	public String helloLocal() throws Exception 
	{
		System.out.println ( "Calling Local interface ejbHome: " + ejbHome);
		Object o = new InitialContext().lookup("java:global/helloWorld/helloWorld-ejb/Example!com.jboss.examples.ejb2.ExampleLocalHome");
		ExampleLocalHome home = (ExampleLocalHome) PortableRemoteObject.narrow(o, ExampleLocalHome.class);
		ExampleLocal ejbRemote = (ExampleLocal) home.create();
		System.out.println ( "ejbRemote: " + ejbRemote);
		System.out.println("Hello response: " + ejbRemote.hello("JBoss"));
		this.response = ("Local response: " + ejbRemote.hello("JBoss"));
		
		return "";
	}

}

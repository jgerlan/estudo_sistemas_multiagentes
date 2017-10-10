package br.com.sismultiagentes.helloworldagent;

import jade.core.Agent;

public class HelloWorldAgent extends Agent {
	
	// Put agent initializations here
	protected void setup() {
		System.out.println("Hello World! My name is "+ getLocalName());
  	
		// Make this agent terminate
		doDelete();
	} 
}
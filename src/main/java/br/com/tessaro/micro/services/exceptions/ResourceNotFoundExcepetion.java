package br.com.tessaro.micro.services.exceptions;

public class ResourceNotFoundExcepetion extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcepetion (Object id) {
		super("Ressource not found. Id "+id);
	}
}

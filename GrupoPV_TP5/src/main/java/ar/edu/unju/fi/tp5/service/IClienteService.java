package ar.edu.unju.fi.tp5.service;

import java.util.List;

import ar.edu.unju.fi.tp5.model.Cliente;

public interface IClienteService {
	
	
	public void guardarCliente(Cliente cliente);
	public void addCliente(Cliente cliente);
	public List<Cliente>getClientes();
	public void generarListaClientes();
	
	

}

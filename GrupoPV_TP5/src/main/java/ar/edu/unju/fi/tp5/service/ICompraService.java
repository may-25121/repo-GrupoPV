package ar.edu.unju.fi.tp5.service;



import java.util.List;

import ar.edu.unju.fi.tp5.model.Compra;

public interface ICompraService {
public Compra getCompra();
	
	public void  agregarCompra(Compra compra);
  
 // 	public Compra obtenerUltomaCompra();
  	
  	public List<Compra> obtenerCompras();

	

}

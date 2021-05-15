package ar.edu.unju.fi.tp5.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import ar.edu.unju.fi.tp5.model.Compra;
import ar.edu.unju.fi.tp5.service.ICompraService;


@Service("compraUtilService")
public class CompraServiceImp implements ICompraService {

	@Autowired
	private Compra compra;
	
	List<Compra> compras = new ArrayList<Compra>();
	
	private static final Log LOGGER = LogFactory.getLog(CompraServiceImp.class);
	
	

@Override
public Compra getCompra() {
	LOGGER.info("SERVICE: ICompraService -> CompraServiceImp");
	LOGGER.info("METHOD: getCompra()");
	LOGGER.info("RESULT: devuelve un objeto compra");
	return this.compra;
}

@Override
public void agregarCompra(Compra compra) {
	LOGGER.info("SERVICE: ICompraService -> CompraServiceImp");
	LOGGER.info("METHOD: agregarCompra()");
	LOGGER.info("RESULT: agrega un objeto compra a la lista");
	this.compras.add(compra);
}

/*
@Override
public Compra obtenerUltomaCompra() {
	int indiceUltimaCompra=compras.size() - 1;
	Compra compra=null;
	if(indiceUltimaCompra>=0) {
		compra=compras.get(indiceUltimaCompra);
	}else {
		compra = new Compra(123, null, 250, 100);
		agregarCompra(compra);
	}
	LOGGER.info("SERVICE: ICompraService -> CompraServiceImp");
	LOGGER.info("METHOD: getUltimaCompra()");
	LOGGER.info("RESULT: devuelve la ultima compra a la lista");
	return compra;
}*/

@Override
public List<Compra> obtenerCompras() {
	LOGGER.info("SERVICE: ICompraService -> CompraServiceImp");
	LOGGER.info("METHOD: obtenerCompra()");
	LOGGER.info("RESULT: devuelve una lista de las compras agregadas");
	return this.compras;
}



}

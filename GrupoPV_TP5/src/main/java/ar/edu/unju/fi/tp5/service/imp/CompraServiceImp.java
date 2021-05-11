package ar.edu.unju.fi.tp5.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;


import ar.edu.unju.fi.tp5.model.Compra;
import ar.edu.unju.fi.tp5.service.ICompraService;
import ar.edu.unju.fi.tp5.util.TablaCompra;

@Service("compraUtilService")
public class CompraServiceImp implements ICompraService {

	private List<Compra> compras;
	
	private static final Log LOGGER = LogFactory.getLog(CompraServiceImp.class);
	
	@Override
	public void guardarCompra(Compra compra) {
		if(compras == null) {
			generarListCompras();
		}
		compras.add(compra);
		LOGGER.info("METHOD: guardarCompra- se agrego un objeto compra en la lista -> " + compras.get(compras.size() -1 ));
	}

	@Override
	public List<Compra> obtenerCompras() {
		LOGGER.info("METHOD: obtenerCompras - se obtuvo un objeto compra de la lista -> " + compras.get(compras.size() -1 ));
		return compras;
	}

	@Override
	public void generarListCompras() {
		compras = TablaCompra.compras;
		compras.add(new Compra(123, null, 100,50 ));
		LOGGER.info("METHOD: generarListCompras - Se agrego un Compra a la lista -> " + compras.get(compras.size() -1 ));

	}

}

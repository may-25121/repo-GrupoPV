package ar.edu.unju.fi.tp5.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.tp5.model.Compra;
import ar.edu.unju.fi.tp5.service.ICompraService;

@Controller
public class CompraController {
	private static final Log LOGGER = LogFactory.getLog(CompraController.class);
	
	
	@Autowired
	private ICompraService compraService;

	@GetMapping("/compra")
	public String getCompraPage(Model model) {
		LOGGER.info("CONTROLLER: CompraController con /compra invoca al metodo get");
		LOGGER.info("METHOD: getCompraPage()");
		LOGGER.info("RESULT: Se visualiza la página nuevacompra.html");
		model.addAttribute("compra", compraService.getCompra());
		return "nuevacompra";
	}
	
	@PostMapping("/compra/guardar")
	public String getCompraResultadoPage(@ModelAttribute("compra") Compra compra) {
		LOGGER.info("CONTROLLER: CompraController con /compra/guardar invoca al metodo post");
		LOGGER.info("METHOD: getCompraResultadoPage() -- PARAMS: compra'"+compra+"'");
		LOGGER.info("RESULT: Se visualiza la página resultado02.html mostrando el formulario de compras");
		compraService.agregarCompra(compra);
		return "resultado02";
	}
	
	
	
	@GetMapping("/compra/listar")
	public String getListarCompraPage(Model model) {
		LOGGER.info("CONTROLLER: CompraController con /compra/listar invoca al metodo get");
		LOGGER.info("METHOD: getListarComprasPage()");
		LOGGER.info("RESULT: Se visualiza la página listarcompras.html, mostrando las compras que se encuentran en la lista");
		model.addAttribute("compras", compraService.obtenerCompras());
	return "listarcompras";
	}
}

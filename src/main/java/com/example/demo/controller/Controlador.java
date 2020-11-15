package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Clientes;
import com.example.demo.model.Computadoras;
import com.example.demo.model.Proveedores;
import com.example.demo.model.Tickets;
import com.example.demo.model.Venta;
@Controller
@RequestMapping("/examenUnidad2")
public class Controlador {
	@GetMapping("/")
	public String index(Model modelo) {
		
		return "index";
	}
		@GetMapping("/Computadoras")
		public String Computadoras(Model modelo) {
			List<Computadoras> computadoras = new ArrayList<Computadoras>();
			computadoras.add(new Computadoras("123456","HP","Intel CORE 3","Windows 10 Home","8Gb","4"));
			computadoras.add(new Computadoras("789101","HP","Ryzen 3","Windows 10 Pro","12Gb","12"));
			computadoras.add(new Computadoras("112131","Gateway","Ryzen 5","Windows 10 Home","16Gb","6"));
			computadoras.add(new Computadoras("415161","Lenovo","Intel CORE 9","Windows 10 Pro","32Gb","8"));
			computadoras.add(new Computadoras("718192","Asus","Intel CORE 7","Windows 10 Home","64Gb","4"));
			computadoras.add(new Computadoras("021222","Lenovo","Intel CORE 5","Windows 10 Pro","128Gb","4"));
			computadoras.add(new Computadoras("324252","HP","Ryzen 7","Windows 10 Pro","8Gb","12"));
			computadoras.add(new Computadoras("627282","Gateway","Ryzen 7","Windows 10 Pro","4Gb","6"));
			computadoras.add(new Computadoras("930313","Dell","Intel CORE 7","Windows 10 Pro","6Gb","8"));
			computadoras.add(new Computadoras("233343","Think","Intel CORE 9","Windows 10 Home","2Gb","4"));
			modelo.addAttribute("computadoras",computadoras);
			return "Computadoras";
	}
		
		@GetMapping("/Tickets")
		public String Tickets(Model modelo) {
			List<Tickets> tickets = new ArrayList<Tickets>();
			tickets.add(new Tickets("10","A821","123090","1","$100"));
			tickets.add(new Tickets("11","B123","789456","2","$200"));
			tickets.add(new Tickets("12","C456","456123","3","$300"));
			tickets.add(new Tickets("13","D789","321654","4","$400"));
			tickets.add(new Tickets("14","E147","951159","5","$500"));
			tickets.add(new Tickets("15","F821","123090","6","$600"));
			tickets.add(new Tickets("16","G123","789456","7","$700"));
			tickets.add(new Tickets("17","H456","456123","8","$800"));
			tickets.add(new Tickets("18","I789","321654","9","$900"));
			tickets.add(new Tickets("19","J147","951159","10","$1000"));
			modelo.addAttribute("tickets",tickets);
			return "Tickets";
	}
		
		@GetMapping("/Venta")
		public String Venta(Model modelo) {
			List<Venta> venta = new ArrayList<Venta>();
			venta.add(new Venta("100","1","01/10/20","$1000","0.16","$100","$1260"));
			venta.add(new Venta("101","2","02/11/20","$2000","0.16","$200","$3520"));
			venta.add(new Venta("102","3","03/12/20","$3000","0.16","$300","$6100"));
			venta.add(new Venta("103","4","04/13/20","$4000","0.16","$400","$6200"));
			venta.add(new Venta("104","5","05/14/20","$5000","0.16","$500","$6300"));
			venta.add(new Venta("105","6","06/15/20","$6000","0.16","$600","$7900"));
			venta.add(new Venta("106","7","07/16/20","$7000","0.16","$700","$9000"));
			venta.add(new Venta("107","8","08/17/20","$8000","0.16","$800","$10100"));
			venta.add(new Venta("108","9","09/18/20","$9000","0.16","$900","$11200"));
			venta.add(new Venta("109","10","10/19/20","$10000","0.16","$500","$13300"));
			modelo.addAttribute("venta",venta);
			return "Venta";
	}		
		
		@GetMapping("/Clientes")
		public String Clientes(Model modelo) {
			List<Clientes> clientes = new ArrayList<Clientes>();
			clientes.add(new Clientes("1","Blue","Demon","55689874","demon@gmail.com","Ciudad Azteca"));
			clientes.add(new Clientes("2","Perro","Aguayo","55689874","perro@gmail.com","Plaza Aragon"));
			clientes.add(new Clientes("3","Emilio","Charles","12365498","emilio@gmail.com","Olimpica"));
			clientes.add(new Clientes("4","Hector","Garza","95132185","hector@gmail.com","Ecatepec"));
			clientes.add(new Clientes("5","Damian","666","97456312","damian@gmail.com","Muzquiz"));
			clientes.add(new Clientes("6","Alma","Madero","55689874","alma@gmail.com","Rio"));
			clientes.add(new Clientes("7","Pedro","Galarga","55689874","pedro@gmail.com","Impulsora"));
			clientes.add(new Clientes("8","Benito","Juarez","12365498","benito@gmail.com","Neza York"));
			clientes.add(new Clientes("9","Marco","Antonio","95132185","marco@gmail.com","Villas"));
			clientes.add(new Clientes("10","Juan","Mecanico","97456312","juan@gmail.com","Bosque"));
			modelo.addAttribute("clientes",clientes);
			return "Clientes";
	}
		
		@GetMapping("/Proveedores")
		public String Proveedores(Model modelo) {
			List<Proveedores> proveedores = new ArrayList<Proveedores>();
			proveedores.add(new Proveedores("821123","Apple","Refugio","refugio@gmail.com","as9856fa","321412","Deportivo"));
			proveedores.add(new Proveedores("123654","Google","Tubodino","tubo@gmail.com","es9856fa","987432","Oceania"));
			proveedores.add(new Proveedores("159951","Amazon","Memo","memo@gmail.com","is9856fa","456976","Romero Rubio"));
			proveedores.add(new Proveedores("456987","Samsung","Refugio","refus@gmail.com","os9856fa","321451","Ricardo Flores"));
			proveedores.add(new Proveedores("987654","Telmex","Chava","chava@gmail.com","us9856fa","321481","San Lazaro"));
			proveedores.add(new Proveedores("821123","Apple","Rufino","rufus@gmail.com","pa9856fa","321412","Morelos"));
			proveedores.add(new Proveedores("123654","Google","Fancisco","pancho@gmail.com","pe9856fa","987432","Tepito"));
			proveedores.add(new Proveedores("159951","Amazon","Memo","memo@gmail.com","pi9856fa","456976","Lagunilla"));
			proveedores.add(new Proveedores("456987","Samsung","Rogelio","rogelio@gmail.com","po9856fa","321451","Garibaldi"));
			proveedores.add(new Proveedores("987654","Telmex","Salvador","salvador@gmail.com","pu9856fa","321481","Guerrero"));
			modelo.addAttribute("proveedores",proveedores);
			return "Proveedores";
	}

}

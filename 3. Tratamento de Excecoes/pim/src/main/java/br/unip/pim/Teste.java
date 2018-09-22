package br.unip.pim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.stella.validation.CPFValidator;
import br.unip.pim.model.Chamado;
import br.unip.pim.model.Cliente;
import br.unip.pim.model.Funcionario;

public class Teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Luiz");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("José");
		
		Chamado chamado = new Chamado();
		List<Chamado> chamados = chamado.buscarChamados();
		
		// Testes Unchecked Exceptions
		
		try {
			// NullPointerException
			for (Chamado chamadoFor : chamados) {
				System.out.println(chamadoFor.getTitulo());
			}
			
			// IndexOutOfBoundsException
			// chamados.get(0);
			
			// InvalidStateException
			CPFValidator validator = new CPFValidator();
			validator.assertValid("111.111.111-11");
			validator.assertValid("362.890.588-51");
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.err.println("Ocorreu uma Unchecked Exception");
		}
		
		// Teste Checked Exceptions
		try {
			new SimpleDateFormat("dd/MM/yyyy").parse("14092018");
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("Ocorreu uma Checked Exception");
		}
	}

}

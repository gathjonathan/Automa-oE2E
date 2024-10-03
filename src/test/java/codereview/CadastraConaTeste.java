package codereview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadastraConaTeste {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	@BeforeEach
	public void antesDoTeste() {
		Navegador.abrirNavegador();
	}

	@Test
	public void abrirContaTeste() {
		// ELEMENTOS HOME
		metodos.clicar(elementos.btnAbrirConta);
		metodos.escrever(elementos.cpf, "565.888.565-80");
		metodos.clicar(elementos.btnContinuar);
		
		// DADOS PESSOAIS
		metodos.aguardarElemento(elementos.firstName);
		metodos.escrever(elementos.firstName, "Jonathan");
		metodos.escrever(elementos.lastName, "Honorato");
		metodos.escrever(elementos.email, "jonathan.honorato@e2etreinamentos.com.br");
		metodos.clicar(elementos.dataBirthday);
		metodos.escrever(elementos.dataBirthday, "07091990");
		metodos.clicar(elementos.phoneNumber);
		metodos.escrever(elementos.phoneNumber, "11951163339");
		metodos.escrever(elementos.rg, "543210987");
		metodos.escrever(elementos.address, "Rua: jose antonio da silva");
		metodos.clicar(elementos.cep);
		metodos.escrever(elementos.cep, "06243170");
		metodos.escrever(elementos.number,"26");
		//metodos.escrever(elementos.complement, "B");
		metodos.escrever(elementos.state,"SP");
		metodos.escrever(elementos.city, "Osasco");
		metodos.clicar(elementos.btnAvancar);
				
		// DADOS PROFISSIONAIS
		metodos.aguardarElemento(elementos.actualGroup);
		metodos.escrever(elementos.actualGroup, "");
		metodos.escrever(elementos.firstGroup, "");
		metodos.escrever(elementos.job, "");
		metodos.escrever(elementos.salario, "");
		metodos.escrever(elementos.professionalEmail, "jonathan.honorato@e2etreinamentos.com");
		metodos.clicar(elementos.btnEnviar);
		metodos.clicar(elementos.btnVoltar);
		
		// SENHA
		metodos.aguardarElemento(elementos.password);
		metodos.escrever(elementos.password, "");
		metodos.escrever(elementos.confirmPassword,"");
		metodos.clicar(elementos.btnCadastrar);
	}

	@AfterEach
	public void tearDown() {
}
}
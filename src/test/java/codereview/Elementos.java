package codereview;

import org.openqa.selenium.By;

	public class Elementos {
		
		// ELEMENTOS HOME
		public By btnAbrirConta = By.xpath("//button[text()='Abrir conta']");
		public By cpf = By.id("cpf-input");
		public By btnContinuar = By.xpath("//button[text()='Continuar']");
		public By msgError = By.id("error-message");

		// Dados Pessoais
		public By firstName = By.name("firstName");
		public By lastName = By.name("lastName");
		public By email = By.name("email");
		public By dataBirthday = By.name("dataBirthday");
		public By rg = By.name("rg");
		public By phoneNumber = By.name("phoneNumber");
		public By address = By.name("address");
		public By cep = By.name("cep");
		public By number = By.xpath("//input[@placeholder='Número']");
		public By state = By.name("state");
		public By city = By.name("city");
		public By complement = By.name("complement");
		public By btnAvancar = By.xpath("//button[text()='Avançar']");

		// Dados Profissionais
		public By actualGroup = By.name("actualGroup");
		public By firstGroup = By.name("firstGroup");
		public By job = By.name("job");
		public By salario = By.xpath("//input[@placeholder='Salário']");
		public By professionalEmail = By.name("professionalEmail");
		public By btnEnviar = By.id("btnEnviar");
		public By btnVoltar = By.id("btnVoltar");

		// Crie sua senha de acesso à conta
		public By password = By.name("password");
		public By confirmPassword = By.name("confirmPassword");
		public By btnCancelar = By.xpath("//button[text()='Cancelar']");
		public By btnCadastrar = By.xpath("//button[text()='Cadastrar']");
	}
package codereview;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class MetodosApi {

	public boolean validarCadastro(String cpf) {

		
		Response response = RestAssured.get("http://52.2.114.98:api/cliente");
		
		if(response.statusCode()!=200) {
			return false;
		}
		
		JsonPath json = response.jsonPath();
		
		List<String> cpfs = json.getList("personalInformation.cpf");
		
		boolean cpfExistente = cpfs.contains(cpf);
				return cpfExistente;

	}

}

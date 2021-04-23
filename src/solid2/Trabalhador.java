package solid2;

public class Trabalhador implements TrabalhadorAssalariado, TrabalhadorComissionado, TrabalhadorPlr, Bolsista{

	@Override
	public void receberSalarioPlr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberSalarioComissionado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberSalarioAssalarioado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberSalarioBolsista() {
		// TODO Auto-generated method stub
		
	}
	
	/*Para cada novo tipo terefos um if
	* isso é errado, devemos implementar uma
	* interface para cada tipo de coisa.
	* 
	public void receberSalario(String tipo){
		if(tipo ==  "Salário fixo") {
			//....
		} else if(tipo == "Comissão"){
			//....
		} else if(tipo == "Participação nos Lucros") {
			//..
		}
	}*/
}

package Classe;

public class DesafioData {
	
	int dia;
	int mes;
	int ano;	
	
	String ObterDataFormatada(){
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	DesafioData(int dia, int mesd,
			int ano){
		this.dia = dia;
		this.mes = mesd;
		this.ano = ano;
		}
	
	DesafioData(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	
}

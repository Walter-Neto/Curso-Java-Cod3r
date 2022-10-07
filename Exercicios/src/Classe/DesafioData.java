package Classe;

public class DesafioData {
	
	int dia;
	int mes;
	int ano;	
	
	String ObterDataFormatada(){
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	DesafioData(int diaInformado, int mesInformado,
			int anoInformado){
		dia = diaInformado;
		mes = mesInformado;
		ano = anoInformado;
		}
	
	DesafioData(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	
}

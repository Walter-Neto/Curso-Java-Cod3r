package Classe;

public class DesafioDataProd {
	
	public static void main(String[] args) {
		
		DesafioData data1 = new DesafioData();
		System.out.println(data1.ObterDataFormatada());
		
		DesafioData data2 = new DesafioData(7,10,2022);
		System.out.println(data2.ObterDataFormatada());		
		
	}

}

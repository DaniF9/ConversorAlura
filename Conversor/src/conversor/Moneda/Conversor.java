package conversor.Moneda;

import javax.swing.JOptionPane;

/**
 *
 * @author dani_
 */




public class Conversor {
	
	public void ConvertirPesosMexicanosDolares(double valor) {
		double monedaDolar = valor / 16.91;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, " $ " + monedaDolar + " Dolares");
	}
	public void ConvertirPesosMexicanosEuros(double valor) {
		double monedaEuro = valor / 18.86;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	public void ConvertirPesosMexicanosLibras(double valor) {
		double monedaLibra = valor / 21.80;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirPesosMexicanosYen(double valor) {
		double monedaYen = valor / 0.12;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
	}
	
	
	public void ConvertirDolaresPesos(double valor) {
		double monedaDolar = 16.91 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
	}
	public void ConvertirEurosPesos(double valor) {
		double monedaEuro = valor * 18.86;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos");
	}
	public void ConvertirLibraPesos(double valor) {
		double monedaLibra = valor * 21.80;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
	}
	public void ConvertirYenPesos(double valor) {
		double monedaYen = valor * 0.12;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos");
	}
	

}



/*
public class Conversor {
    
    //Metodos de moneda Nacional a otras monedas
    public void ConversionPesosMexicanosDolares(double valor){
        double monedaDolar = valor / 16.91;
        JOptionPane.showMessageDialog(null, " $ " + monedaDolar + " Dolares ");
    }
    
    public void ConversionPesosMexicanosEuro(double valor) {
        double monedaEuro = valor / 18.90;
        JOptionPane.showMessageDialog(null, " $ " + monedaEuro + " Euros ");
        
    }
    
    public void ConvertirPesosMexicanosLibras(double valor){
        double monedaLibra = valor / 21.84;
        JOptionPane.showMessageDialog(null, " $ " + monedaLibra + "Libras");
        
    }
    
    public void ConvertirPesosMexicanosYen(double valor){
        double monedaYen = valor / 0.12;
        JOptionPane.showMessageDialog(null, " $ " + monedaYen + "Yen Japones");
    }
    
    //Metodos de otras monedas a moneda Nacional
    double monedaNacional;
    public void ConvertirYenPesos(double valor){
        double monedaNacional = valor * 0.12;
        JOptionPane.showMessageDialog(null, " $ " + monedaNacional + " Pesos Mexicanos");
    }
    
    public void ConvetirLibrasPesos(double valor){
        monedaNacional = valor * 21.84;
        JOptionPane.showMessageDialog(null, " $ " + monedaNacional + " Pesos Mexicanos ");
    }
    
    public void ConvertirEuroPesos(double valor){
        double monedaNacional = valor * 18.90;
        JOptionPane.showMessageDialog(null, " $ " + monedaNacional + " Pesos Mexicanos");
    }
    public void ConvetirDolarPesos(double valor){
        double monedaNacional = valor * 16.91;
        JOptionPane.showMessageDialog(null, " $ " + monedaNacional + " Pesos Mexicanos");
    }
    

    
        
        
        
    
}
*/
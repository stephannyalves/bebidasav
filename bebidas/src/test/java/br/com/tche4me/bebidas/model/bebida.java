package br.com.tche4me.bebidas.model;

public class bebida {

        private string sabor; 
        private string validade;
        private double valor;
        private double precocusto;
        private double margemlucro;
    
    
        public double getMargemlucro() {
            return margemlucro;
        }
        public string getSabor() {
            return sabor;
        }
        public void setSabor(string sabor) {
            this.sabor = sabor;
        }
        public void setMargemlucro(double margemlucro) {
            this.margemlucro = margemlucro;
        }
        public double getPrecocusto() {
            return precocusto;
        }
        public void setPrecocusto(double precocusto) {
            this.precocusto = precocusto;
        }
        public double getValor() {
            return valor;
        }
        public void setValor(double valor) {
            this.valor = valor;
        }
        public string getValidade() {
            return validade;
        }
        public void setValidade(string validade) {
            this.validade = validade;
        }
        
}

       
           
       
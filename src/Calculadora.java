public class Calculadora {
    private HistoricoCalculos historico = new HistoricoCalculos();

    public double calcular(Operacao calculo){
        calculo.calcular();
        historico.adicionar(calculo);
        return calculo.getResult();
    }

    public void mostrarHistorico(){
        historico.mostrarHistorico();
    }
}

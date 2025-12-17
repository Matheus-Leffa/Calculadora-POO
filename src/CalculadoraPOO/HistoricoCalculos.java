package CalculadoraPOO;

import java.util.ArrayList;

public class HistoricoCalculos {
    private ArrayList<Operacao> historico = new ArrayList<>();

    public void adicionar(Operacao calculoFeito){
        historico.add(calculoFeito);
    }

    public void mostrarHistorico(){
        if(historico.isEmpty()){
            System.out.println("Nenhum cálculo no histórico");
            return;
        }

        System.out.println("Histórico de cálculos:");
        for(Operacao op : historico){
            System.out.println(op);
        }
    }
}

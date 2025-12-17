package calculadoraPOO.service;

import java.util.ArrayList;
import java.util.List;

public class HistoricoServiceImpl implements HistoricoService {

    private final List<String> historico = new ArrayList<>();
    @Override
    public void registrar(String operacao) {
        historico.add(operacao);
    }

    @Override
    public List<String> obterHistorico() {
        return new ArrayList<>(historico);
    }
}

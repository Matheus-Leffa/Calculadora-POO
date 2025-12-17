package calculadoraPOO.service;

import java.util.List;

public interface HistoricoService {
    void registrar(String operacao);
    List<String> obterHistorico();
}

package calculadoraPOO.config;


import calculadoraPOO.service.CalculadoraService;
import calculadoraPOO.service.CalculadoraServiceImpl;
import calculadoraPOO.service.HistoricoService;
import calculadoraPOO.service.HistoricoServiceImpl;

public class CalculadoraConfig {

    private final CalculadoraService calculadoraService;
    private final HistoricoService historicoService;

    public CalculadoraConfig() {
        this.calculadoraService = new CalculadoraServiceImpl();
        this.historicoService = new HistoricoServiceImpl();
    }

    public CalculadoraService getCalculadoraService() {
        return calculadoraService;
    }

    public HistoricoService getHistoricoService() {
        return historicoService;
    }
}

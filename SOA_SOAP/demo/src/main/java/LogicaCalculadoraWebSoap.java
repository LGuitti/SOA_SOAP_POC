import javax.jws.WebService;

// Classe de implementação do serviço da calculadora via Web Service SOAP
@WebService(serviceName = "InterfaceCalculadoraService", endpointInterface = "InterfaceCalculadoraWebSoap", targetNamespace = "http://exemplo.com/calculadora")
public class LogicaCalculadoraWebSoap implements InterfaceCalculadoraWebSoap {
    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a - b;
    }
}

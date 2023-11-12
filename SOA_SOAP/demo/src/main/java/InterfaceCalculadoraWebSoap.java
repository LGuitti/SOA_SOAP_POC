import javax.jws.WebService;

// Define a interface do serviço da calculadora via Web Service SOAP
@WebService(targetNamespace = "http://exemplo.com/calculadora")
public interface InterfaceCalculadoraWebSoap {
    int somar(int a, int b);
    int subtrair(int a, int b);
}

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

// Classe do cliente do serviço da calculadora via Web Service SOAP
public class ClienteCalculadoraWebSoap {
    public static void main(String[] args) throws Exception {
        // Define a URL do WSDL do serviço da calculadora
        URL url = new URL("http://localhost:8080/calculadora?wsdl");

        // Define um QName (Qualified Name) para acessar o serviço
        QName qname = new QName("http://exemplo.com/calculadora", "InterfaceCalculadoraService");

        // Cria uma instância de Service usando a URL e o QName
        Service service = Service.create(url, qname);

        // Obtém uma instância do serviço da calculadora
        InterfaceCalculadoraWebSoap calculadora = service.getPort(InterfaceCalculadoraWebSoap.class);

        // Chama o método somar para realizar uma operação de adição
        int resultado = calculadora.somar(5, 3);
        System.out.println("5 + 3 = " + resultado);

        // Chama o método subtrair para realizar uma operação de subtração
        resultado = calculadora.subtrair(8, 2);
        System.out.println("8 - 2 = " + resultado);
    }
}

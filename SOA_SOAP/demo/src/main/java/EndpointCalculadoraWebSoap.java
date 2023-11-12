import javax.xml.ws.Endpoint;

// Classe de publicação do serviço da calculadora via Web Service SOAP
public class EndpointCalculadoraWebSoap {
    public static void main(String[] args) {
        // Define o endereço onde o serviço será publicado
        String endereco = "http://localhost:8080/calculadora";

        // Cria uma instância do serviço da calculadora
        InterfaceCalculadoraWebSoap calculadora = new LogicaCalculadoraWebSoap();

        // Publica o serviço da calculadora no endereço especificado
        Endpoint.publish(endereco, calculadora);

        // Imprime uma mensagem informando que o serviço está em execução
        System.out.println("Serviço está em execução em: " + endereco);
    }
}

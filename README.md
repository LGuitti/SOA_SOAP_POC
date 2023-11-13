# SOA_SOAP_POC

Este repositório é uma PoC (Proof of Concept) criado pelos alunos Lucas Guitti Bonando e João Pedro Contrera Assis. Para o correto funcionamento, é necessário ter o Apache Maven instalado.

## Instalação do Apache Maven

Este guia fornece instruções passo a passo para a instalação do Apache Maven no seu sistema.

### Requisitos

Antes de prosseguir, verifique se o seu sistema atende aos seguintes requisitos:

- Java Development Kit (JDK) instalado e configurado. O Maven requer o JDK para funcionar.
- Conexão com a internet para baixar o Maven.

### Passos de Instalação

#### Passo 1: Verificar se o Java está instalado

Abra um terminal ou prompt de comando e digite:

```bash
java -version

Certifique-se de que o comando exibe a versão do Java instalada. Caso contrário, instale o JDK antes de prosseguir.

Passo 2: Baixar o Apache Maven
Acesse o site oficial do Apache Maven e baixe a versão mais recente do Maven. Ou, se preferir, use um gerenciador de pacotes do seu sistema operacional.

Passo 3: Extrair o Maven
Após o download, extraia o arquivo compactado do Maven para o diretório desejado em seu sistema. Por exemplo:


Passo 4: Configurar as Variáveis de Ambiente
Windows
Vá para Configurações do Sistema ou Painel de Controle.
Clique em "Sistema" e, em seguida, em "Configurações avançadas do sistema".
Clique em "Variáveis de Ambiente".
Na seção "Variáveis do Sistema", clique em "Novo".
Adicione uma nova variável com o nome M2_HOME e o caminho para a pasta onde o Maven foi extraído.
Encontre a variável Path, selecione-a e clique em "Editar". Adicione %M2_HOME%\bin ao final do valor existente.
Linux ou macOS
Edite o arquivo .bashrc, .bash_profile ou .zshrc no seu diretório home e adicione as seguintes linhas:


export M2_HOME=/caminho/do/diretorio/apache-maven-3.x.x
export PATH=$M2_HOME/bin:$PATH
Substitua "/caminho/do/diretorio/apache-maven-3.x.x" pelo caminho real onde o Maven foi extraído.

Passo 5: Verificar a Instalação
Abra um novo terminal ou prompt de comando e digite:

mvn -v
Isso deve exibir a versão do Maven instalada, confirmando que a instalação foi bem-sucedida.


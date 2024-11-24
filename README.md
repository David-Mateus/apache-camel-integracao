## Sistema de Integração entre APIs com Apache Camel
 Este projeto demonstra um sistema de integração entre APIs, utilizando o Apache Camel para orquestrar o fluxo de dados entre dois serviços. A API1 realiza uma requisição GET, envia um texto ao Camel, que processa e encaminha o conteúdo para a API2.
### Arquitetura do Sistema
- API1: Realiza uma chamada GET para enviar um texto.
- Apache Camel: Atua como o middleware responsável por:
   - Receber o texto enviado pela API1.
   - Processar e redirecionar o conteúdo.
   - Encaminhar a mensagem para a API2.
- API2: Recebe o texto processado e executa a lógica necessária com a informação.
### Tecnologias Utilizadas
- Java: Linguagem principal do projeto.
- Apache Camel: Framework de integração para roteamento e mediação de mensagens.
- Spring Boot: Para facilitar a configuração e execução do projeto.
- Maven: Gerenciador de dependências.
- REST APIs: Comunicação entre os serviços

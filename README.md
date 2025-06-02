
# Coin Exchange

Este projeto é uma aplicação Java para simular ou implementar funcionalidades relacionadas a uma exchange de moedas.

## 📁 Estrutura do Projeto

```
coin-exchange/
├── src/
│   └── main/
│       └── java/
│           └── coin/
│               └── exchange/
├── pom.xml
└── .gitignore
```

- **`src/main/java/coin/exchange/`**: Contém o código-fonte principal da aplicação.
- **`pom.xml`**: Arquivo de configuração do Maven, gerenciando as dependências e o ciclo de vida do build.

## 🚀 Tecnologias Utilizadas

- Java 11+
- Maven
- GSON & JAVA-DOTENV

## ⚙️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/nielassis/coin-exchange.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd coin-exchange
   ```

3. Compile o projeto usando o Maven:
   ```bash
   mvn clean install
   ```

4. Crie um arquivo .env na raiz do projeto e insira sua API_KEY (Exchange Rate API)

5. Execute a aplicação:
   ```bash
   mvn exec:java -Dexec.mainClass="coin.exchange.Main"
   ```

   *Substitua `coin.exchange.Main` pelo nome da classe que contém o método `main`, se diferente.*

<p align="center">
  <img src="https://i.imgur.com/9kAYSX2.png" alt="TicTacToe Logo">
</p>
<p align="center"> 
  <a href="https://github.com/Jorgeluisreis/TicTacToe"> 
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Jorgeluisreis/TicTacToe"> 
  </a> 
  <a href="https://github.com/SeuUsername/TicTacToe/issues"> 
    <img alt="GitHub issues" src="https://img.shields.io/github/issues/Jorgeluisreis/TicTacToe"> 
  </a> 
  <a href="https://github.com/Jorgeluisreis/TicTacToe/pulls"> 
    <img alt="GitHub pull requests" src="https://img.shields.io/github/issues-pr/Jorgeluisreis/TicTacToe"> 
  </a> 
  <a href="https://github.com/Jorgeluisreis/TicTacToe"> 
    <img alt="GitHub repo size" src="https://img.shields.io/github/repo-size/Jorgeluisreis/TicTacToe"> 
  </a> 
  <a href="https://github.com/Jorgeluisreis/TicTacToe"> 
    <img alt="License" src="https://img.shields.io/github/license/Jorgeluisreis/TicTacToe"> 
  </a> 
</p>

# TicTacToe

## 🎯 Proósito do Projeto

O projeto **TicTacToe** é uma iniciativa da Hackathon de Dezembro de 2024 da turma 4 do **Programa 1000 Devs** pela [mesttra](https://www.mesttra.com/) em parceria com a [J&J Medtech](https://www.jnjmedtech.com/pt-br) e o [Hospital Einstein](https://www.einstein.br/n/). O Professor [Rogério de Freitas](https://www.linkedin.com/in/rogerio-freitas-ribeiro-690a9712/) organizou o evento para ser um Jogo da Velha com desafios técnicos e de lógica, onde os participantes devem integrar as funcionalidades em equipe. O nome dado ao projeto é **TicTacToe**.

## 📚 Conceito

O **TicTacToe** é um projeto colaborativo desenvolvido em uma Hackathon, com o objetivo de criar um Jogo da Velha que coloca à prova as habilidades técnicas e lógicas dos participantes. Durante o desenvolvimento, a equipe enfrentará desafios de programação e integração, proporcionando uma experiência prática no trabalho em equipe e no desenvolvimento de soluções criativas.

## 🛠️ Tecnologias Utilizadas

- ![Java](https://img.shields.io/badge/Java-21-blue) - Linguagem de programação utilizada
- ![Maven](https://img.shields.io/badge/Maven-3.8-blue) - Gerenciador de dependências
- ![CLI](https://img.shields.io/badge/CLI-Interface-Informática) - Interface de linha de comando utilizada para interação com o jogo

## 🌐 Funcionalidades

- **Modo de Jogo para Dois Jogadores** - Permite que dois jogadores disputem uma partida de Jogo da Velha pela CLI.
- **Exibição Gráfica no Console** - Interface simples e limpa para visualização do tabuleiro de jogo.
- **Verificação de Vencedor** - O jogo verifica automaticamente se há um vencedor após cada jogada.
- **Reinício de Jogo** - Permite que os jogadores reiniciem uma nova partida após o término.

## 📓 Documentação

- Clique [aqui](https://github.com/Jorgeluisreis/TicTacToe/wiki) para ter acessoa documentação completa do **TicTacToe**.

## 📸 Imagens da Aplicação

### Menu Principal

<p align="center">
  <img src="https://i.imgur.com/6vBVDjV.png" alt="Menu Principal" width="50%">
</p>

### Sobre o Jogo

<p align="center">
  <img src="https://i.imgur.com/eWhOLRF.png" alt="Sobre o Jogo" width="50%">
</p>

### Dentro da Partida (Tabuleiro 3x3)

<p align="center">
  <img src="https://i.imgur.com/qkXv4Fi.png" alt="Tabuleiro 3x3" width="50%">
</p>

### Dentro da Partida (Tabuleiro 10x10)

<p align="center">
  <img src="https://i.imgur.com/iF6O6Wc.png" alt="Tabuleiro 10x10" width="50%">
</p>

### Tela de Vitória

<p align="center">
  <img src="https://i.imgur.com/K8ACSsO.png" alt="Tela de Vitória" width="50%">
</p>

## 📥 Requisitos Mínimos

- **JRE 1.8** - Necessário para rodar a aplicação.

## 🛠️ Instalação

### Windows

- OBS: Em caso de Compilação, ou seja, caso quiser rodar o projeto no seu Ambiente de Desenvolvimento, será necessário a instalação do binário do [Maven](https://maven.apache.org/download.cgi) e localmente a Biblioteca **ConsoleClear**.

Para a instalação da biblioteca, insira o comando abaixo já tendo o Maven instalado na sua máquina em um terminal (CMD ou GitBash), substituindo a palavra **DIRETÓRIO** pelo diretório onde você fez o clone do projeto:

```bash
mvn install:install-file -Dfile="DIRETÓRIO\lib\ConsoleClear-1.0.0.jar" -DgroupId=net.jorgedev -DartifactId=ConsoleClear -Dversion=1.0.0 -Dpackaging=jar
```

## Tutorial de Instalação

1.  Faça o download da aplicação clicando [aqui](https://github.com/Jorgeluisreis/TicTacToe/releases)
2.  Descompacte o arquivo baixado usando o WinRAR ou 7-Zip.
3.  Mova a pasta descompactada para um local de sua preferência.
4.  Abra o terminal na pasta onde o arquivo foi descompactado e execute:
    ```bash
    java -jar TicTacToe.jar
    ```
    ou execute o **.exe** que é o **.jar** convertido para executável.

### Linux

1.  Faça o download da aplicação clicando [aqui](https://github.com/SeuUsername/TicTacToe/releases)
2.  Descompacte o arquivo baixado usando o `unzip` ou qualquer outra ferramenta de sua preferência.
3.  Mova a pasta descompactada para um local de sua escolha no sistema.
4.  Torne o arquivo executável e execute o jogo:
    ```bash
    chmod +x TicTacToe.jar
    java -jar TicTacToe.jar
    ```

## 📄 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](https://github.com/SeuUsername/TicTacToe/blob/main/LICENSE) para mais detalhes.

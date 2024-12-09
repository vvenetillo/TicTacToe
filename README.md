# TicTacToe

O JOGO DA VELHA é também um jogo popular e pode ser conhecido por outros nomes diferentes como: jogo do galo ou três em linha.

## Sobre

Este é um projeto para a Hackathon de 6 a 8 de Dezembro de 2024 para o Programa 1000Devs, em parceria com a J & J Medtech e o Hospital Albert Einstein.

## Dinâmica de pastas

O projeto deve ser consistido nesta distribuição de pastas:

```

TicTacToe/
├── lib/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── hackathon/
│   │   │           └── tictactoe/
│   │   │               ├── Main.java                # Classe principal
│   │   │               ├── game/                   # Pacote para lógica do jogo
│   │   │               │   ├── TicTacToeGame.java  # Classe central do jogo
│   │   │               │   ├── Player.java         # Classe para jogadores
│   │   │               │   ├── Board.java          # Classe para o tabuleiro
│   │   │               │   └── MoveValidator.java  # Classe para validar jogadas
│   │   │               ├── ui/                     # Pacote para interface do usuário
│   │   │               │   ├── ConsoleUI.java      # Classe para interações no console
│   │   │               │   └── Display.java        # Classe para exibir mensagens e tabuleiro
│   │   │               ├── util/                   # Pacote para utilitários
│   │   │               │   └── Logger.java         # Classe para logging
│   │   │               └── config/                 # Pacote para configuração
│   │   │                   └── GameConfig.java     # Classe para configuração de jogo
│   │   └── resources/                              # Recursos do projeto
│   │       └── messages.properties                 # Arquivo de mensagens
│   └── test/                                       # Testes unitários
│       └── java/
│           └── com/
│               └── hackathon/
│                   └── tictactoe/
│                       ├── TicTacToeGameTest.java  # Testes para a lógica do jogo
│                       ├── BoardTest.java          # Testes para o tabuleiro
│                       └── ConsoleUITest.java      # Testes para a interface de usuário
├── target/                                         # Gerado após build
├── .gitignore                                      # Arquivos e diretórios a ignorar pelo Git
├── pom.xml                                         # Arquivo de configuração Maven
├── README.md                                       # Documentação inicial do projeto
└── LICENSE                                         # Licença do projeto
```

OBS: Pode haver mudanças com o decorrer do desenvolvimento

## Como tratar o fluxo de desenvolvimento ?

OBS: é estritamente necessário fazer a instalação do [Maven](https://dicasdeprogramacao.com.br/como-instalar-o-maven-no-windows/) para esta aplicação funcionar, além de instalar manualmente a biblioteca ConsoleClear.

```
mvn install:install-file -Dfile="DIRETÓRIO\ConsoleClear-1.0.0.jar" -DgroupId='net.jorgedev' -

DartifactId=ConsoleClear -

Dversion='1.0.0' -Dpackaging=jar
```

O código acima pode ser rodado no Terminal, Git Bash ou Powershell.

Onde há escrito **DIRETÓRIO**, deve ser colocado o diretório do projeto direto na pasta lib.

1. Mova o card que seja desenvolver de _Read_ para _In Progress_ e atribua o seu nome no campo _Assignees_ clicando no nome do card.
   ![image](https://i.imgur.com/jj2oK9o.png)

   ![image](https://i.imgur.com/pI8DNCh.png)

2. No card, clique em **Convert to issue** e selecione o repositório do projeto, isso gerará uma mudança que será visível e gerenciada pelo líder do projeto, essencial para garantir o fluxo saudável do desenvolvimento.

   ![image](https://i.imgur.com/5qrWZH6.png)

   ![image](https://i.imgur.com/cBWyr16.png)

   ![image](https://i.imgur.com/jt7NcxC.png)

3. Crie uma branch nome com o nome do card, por exemplo:
   Na aba de branchs, clique em **View all branchs**

   ![image](https://i.imgur.com/Bbxiicx.png)

   Clicando em **New branch**, você pode estar criando uma nova branch para o projeto.

Exemplo: se o card se chama "Adição da biblioteca de console", a branch se chamará "Adicao_da_biblioteca_de_console", e aponta-la para a branch **development** e clique em **Create new bran ch**, ou seja, a nova branch será criada espelhada na branch de desenvolvimento. Isto é necessário para que você trabalhe as suas modificações dentro da aplicação sem intervir nas outras modificações que estão sendo criadas.
![enter image description here](https://i.imgur.com/OLWXLLn.png)

4. No seu projeto, dê o **git pull** para atualizar a sua branch local e assim trazer a criação da sua branch remota, mude para ela e comece o desenvolvimento.

   ![image](https://i.imgur.com/Glztjx6.png)

   ![image](https://i.imgur.com/DTLIjiN.png)

5. No término do desenvolvimento, faça commits usando Convensão de Commits
   ![image](https://i.imgur.com/KE2DM1G.png)

   ![image](https://i.imgur.com/VsalRh3.png)

6. Quando o código estiver validado, testado localmente, crie um **Pull Request** a partir da sua branch de trabalho:
   ![image](https://i.imgur.com/utON8Yo.png)

   Faça as devidas configurações e ponderações a respeito da solicitação, como feito abaixo:
   ![image](https://i.imgur.com/BvIsIC6.png)

7. em **compare** é a sua branch que você trabalhou e a base é para qual você quer atribuir estas mudanças, no caso é a **development**
   ![image](https://github.com/user-attachments/assets/b97bfe9b-c31a-4ca4-b037-97386872d412)


   e clique em **Create pull request** que o coordenador irá avaliar e testar junto com você a sua implementação.
=======
# TicTacToe

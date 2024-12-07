# TicTacToe

O JOGO DA VELHA é também um jogo popular e pode ser conhecido por outros nomes diferentes como: jogo do galo ou três em linha.

## Sobre

Este é um projeto para a Hackathon de 6 a 8 de Dezembro de 2024 para o Programa 1000Devs, em parceria com a J & J Medtech e o Hospital Albert Einstein.

## Dinâmica de pastas

O projeto deve ser consistido nesta distribuição de pastas:

```
TicTacToe/
│
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

1. Mova o card que seja desenvolver de _Read_ para _In Progress_ e atribua o seu nome no campo _Assignees_
2. No card, clique em _Convert to issue_, isso gerará uma mudança que será visível e gerenciada pelo lider do projeto, essencial para garantir o fluxo saudável do desenvolvimento.
3. Crie uma branch noma com o nome do card, por exemplo:
   se o card se chama "Documentação inicial", a branch se chamará "Documentacao_inicial", isto é necessário para que você trabalhe as suas modificações dentro da aplicação sem intervir nas outras modificações que estão sendo criadas.
4. No seu projeto, dê o _git pull_ para atualizar a sua branch local e assim trazer a criaão da sua branch remota, mude para ela e começe o desenvolvimento.
5. No término do desenvolvimento, faça commits usando Convensão de Commits

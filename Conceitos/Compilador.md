### O que é código fonte?
    É aquele escrito por um programador em uma linguagem de programação.

### Compilação:
    É um processo realizado pelo compilador, onde ele faz uma análise léxica e sintática e se estiver tudo ok o código é transformado em código objeto. Após isso, é realizado a build desse código e ele se torna um código executável.

### Interpretação:
    O interpretador realiza a análise léxica e sintática, além de gerar o código [SOB DEMANDA], ou seja, gradualmente ele lê o código fonte e já vai traduzindo ele para executável.

### Abordagem híbrida:
    O compilador realiza uma precompilação com a análise léxica e sintática e transforma o arquivo em bytecode. E o interpretador, através da máquina virtual, gera o código sob demanda e o executa.

### O que são bytecode?
    Bytecode é um código precompilado.


### VANTAGENS
    * Compilação:
        * Velocidade do programa
        * Auxílio do compilador antes da execução
    
    * Interpretação:
        * Flexibilidade de manunteção do aplicativo em produção
        * Expressividade da linguagem
        * Código fonte não precisa ser recompilado para rodar em plataformas diferentes


### Exemplo por linguagem:

    C/C++ : Código Fonte -> Código Executável (específico do SO) -> Sistema Operacional -> Hardware

    PHP, Python, JS : Código fonte -> Interpretador (específico do SO) -> Sistema Operacional -> Hardware

    Java, C# : Código fonte -> Bytecode (código precompilado) -> Máquina Virtual (específica para o sistema operacional) -> Sistema Operacional -> Hardware


### Resumo:
    * Tipos de Código
        * Código fonte
        * Código objeto / bytecode
    
    * Modelos de execução
        
    * Compilação
        * Gerador de código
        
    * Interpretação
        
    * Abordagem híbrida
        * Máquina virtual

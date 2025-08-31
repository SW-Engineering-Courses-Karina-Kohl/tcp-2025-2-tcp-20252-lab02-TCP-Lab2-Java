# TCP-Lab2-Java

Você vai construir uma Calculadora em Java que soma e divide dois números no formato int.
Essa calculadora será construida em algumas fases.

No template do GitHub Classroom com o assignment, você verá 3 arquivos iniciais
1. Calculadora.java
2. CalculadoraGUI.java
3. CalculadoraTest.java

Você irá alterar apenas os arquivos 1 e 2. Não altere o arquivo 3, pois ele é usado para testar o código de vocês de forma automática. Você irá criar seu próprio arquivo de testes depois que passarmos pela aula de testes. 

Parte 1: 
- Baixe os .java 1 e 2 do exercício para um diretório do computador que estiver usando
- No arquivo Calculadora.java
- Na área indicada como: /* área para a criação dos métodos*/, você irá criar os métodos somar e dividir. Eles devem:
    - ser públicos
    - retornar int
    - receber 2 argumentos int
    - o método somar irá somar esses 2 argumentos
    - o método dividir irá dividir esses 2 argumentos (o primeiro é o numerador e o segundo o denominador)
- Dentro do método main:
    - Instancie um objeto Scanner para ler os dois números  a serem somados ou divididos pelo terminal
    - Leia os dois números pelo terminal
    - Instancie um objeto Calculadora
    - Chame o método somar e imprima a saída no terminal
    - Chame o método dividir e imprima a saída no terminal
- Compilando
    - Pelo terminal do SO que vcê estiver usando, vá até o diretório onde você colocou os .java
        - para compilar: javac Calculadora.java
        - para rodar: java Calculadora
        - rode algumas vezes com diferentes entradas e observe a saída no terminal
        - tente inclusive a divisão por zero ;-)
- Funcionou?
    - Coloque a nova versão do arquivo o Calculadora.java, com as suas implementações, no repositório do github e pode comitar direto no main dessa vez :-) 
    - Vá até a aba actions e observe o log do workflow de autograding que estará rodando
    - O que aconteceu nos testes? Isso nos leva para a parte 2 :-)
    - 
- Parte 2 - Tratamento de Exceções
    - Volte para a edição local do seu Calculadora.java e adicione o tratamento de exceções para entradas inválidas
        - Você pode tentar o tratamento de exceções direto nos métodos ou na chamada deles no main
    - Repita a compilação e rode novamente com diferentes entradas
    - Coloque novamente o Calculadora.java no github, comite e veja o resultado da action do autograding
- Parte3 - Interface Gráfica Básica para sua Calculadora (se não der tempo, pode ficar para fazer em casa)
    - Use a referência do MultiButtonApp.java que está no repositório para ajudar
    - Crie o JFrame e faça o setup de como fechar a janela, tamanho do frame e layout
    - Crie dois JTextField para o usuário poder entrar com os números
    - Crie um JButton que vai chamar a soma
    - Crie um JButton que vai chamar a divisão
    - Crie um JLabel que vai mostrar o resultado
    - Adicione os listerners em cada componente
    - Adicione os componentes no frame
    - Torne o frame visível
    - Implemente o método actionPerformed. Detalhes a serem cuidados:
        - como o input dos dados é em uma caixa de texto, você terá de transformar em int
            - exemplo: int num1 = Integer.parseInt(campoNum1.getText()); 
        - Não esqueça de instanciar Calculadora e chamar os métodos de semana e dividir que foram implementados lá. Não vá implementar tudo de novo na classe da GUI.
        - As duas classes precisam estar no mesmo diretório. As duas classes precisam estar compiladas 

    - Para compilar e rodar localmente, é igual aos passos da parte 2 e 3. A diferença é que ao invés de pedir o input no terminal, será na tela implementada por vocês. Não esqueça que Calculadora precisa estar compilada também e no mesmo diretório
    - Não esqueça de colocar no github também
 

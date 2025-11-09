Relatório do Projeto – Sistema de Carrinho de Compras em Java
1. Introdução

O presente projeto tem como objetivo o desenvolvimento de um sistema de carrinho de compras, implementado na linguagem Java, aplicando os princípios da Programação Orientada a Objetos (POO).
O sistema simula o funcionamento básico de uma loja virtual, permitindo a gestão de produtos, o controle de um carrinho de compras e o cálculo do valor total da compra.

A proposta visa consolidar conceitos fundamentais da POO, como encapsulamento, composição, classes e objetos, além de promover o raciocínio lógico aplicado ao desenvolvimento de sistemas modulares e reutilizáveis.

2. Objetivos
2.1 Objetivo Geral

Desenvolver um sistema que simule as operações de um carrinho de compras, aplicando os conceitos da Programação Orientada a Objetos.

2.2 Objetivos Específicos

Criar classes que representem produtos, itens e carrinho de compras.

Implementar métodos para adicionar, remover e listar produtos.

Calcular o valor total da compra de forma dinâmica.

Controlar a interação entre o usuário, o carrinho e a loja.

Demonstrar o uso de composição entre objetos em Java.

3. Justificativa

A escolha deste tema se justifica pela ampla utilização de sistemas de compra e venda online no mercado atual.
Compreender a lógica e a estrutura por trás de um carrinho de compras é fundamental para o aprendizado prático da POO, pois envolve a criação e interação entre múltiplas classes, além do uso de listas e métodos de controle.

4. Metodologia

O projeto foi desenvolvido utilizando a linguagem Java, explorando a criação de classes e objetos de forma estruturada.
A implementação foi dividida em etapas:

Modelagem das Classes:

Definição das entidades Produto, Item, CarrinhoDeCompras, Loja e CarrinhoController.

Implementação:

Desenvolvimento dos atributos, construtores e métodos necessários em cada classe.

Integração:

O CarrinhoController atua como ponto de controle do sistema, integrando a loja e o carrinho.

Testes:

Execução e verificação do funcionamento das principais funcionalidades (adição de produtos, listagem e cálculo de total).

5. Estrutura do Projeto
Classe	Descrição
Produto	Representa um produto da loja, com atributos como nome, preço e código.
Item	Define um item no carrinho, relacionando um produto à sua quantidade.
CarrinhoDeCompras	Gerencia a lista de itens, permitindo adicionar, remover e calcular o valor total da compra.
Loja	Contém o catálogo de produtos disponíveis para compra.
CarrinhoController	Classe principal de controle e execução, responsável pela interação entre o usuário e o sistema.
6. Funcionamento do Sistema

O sistema permite ao usuário:

Consultar os produtos disponíveis na loja;

Adicionar produtos ao carrinho;

Exibir os itens presentes no carrinho;

Calcular o valor total da compra;

Remover produtos do carrinho, quando necessário.

A execução é feita a partir da classe CarrinhoController, que coordena as operações entre as demais classes.

Para executar o programa:

javac *.java
java CarrinhoController

7. Resultados Obtidos

O sistema funcionou conforme o esperado, permitindo realizar todas as operações propostas.
Durante os testes, foi possível verificar o correto comportamento das classes, evidenciando a aplicação dos princípios da POO de forma clara e objetiva.

8. Conclusão

O projeto proporcionou uma sólida compreensão sobre o uso da Programação Orientada a Objetos em Java, demonstrando como a composição de classes e o encapsulamento podem ser utilizados para modelar sistemas reais.
Além disso, reforçou a importância do planejamento e da modularização para a criação de sistemas flexíveis e de fácil manutenção.

# Sistema de Carrinho de Compras

## Descrição
Sistema simples de carrinho de compras desenvolvido em Java aplicando padrões GRASP.

## Padrões GRASP Implementados

### 1. Creator
- **Classe:** CarrinhoDeCompras
- **Método:** adicionarItem()
- **Justificativa:** A classe que contém os itens é responsável por criá-los.

### 2. Controller
- **Classe:** CarrinhoController
- **Métodos:** adicionarProdutoAoCarrinho() e verTotalDoCarrinho()
- **Justificativa:** Intermediário entre interface e lógica de negócio, promovendo baixo acoplamento.

## Como Executar
```bash
javac com/loja/grasp/*.java
java com.loja.grasp.Loja
```

## Estrutura
- `Produto.java` - Dados do produto
- `Item.java` - Produto com quantidade
- `CarrinhoDeCompras.java` - Gerencia itens (Creator)
- `CarrinhoController.java` - Controla operações (Controller)
- `Loja.java` - Interface do usuário

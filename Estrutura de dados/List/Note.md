## 🔹 1. O que é List?
`List` é uma interface que herda de Collection e representa uma coleção ordenada, ou seja, os elementos possuem posição (índice).

* 🔁 Permite elementos duplicados
* 📥 Mantém a ordem de inserção
* 🔢 Permite acesso por índice (get(int index))

## 🔹 2 Principais métodos (além dos herdados de Collection)

| Método                      | Descrição                               |
| --------------------------- | --------------------------------------- |
| `get(int index)`            | Retorna o elemento na posição           |
| `set(int index, E e)`       | Substitui o elemento na posição         |
| `add(int index, E e)`       | Insere em uma posição específica        |
| `remove(int index)`         | Remove o elemento na posição            |
| `indexOf(Object o)`         | Retorna o índice da primeira ocorrência |
| `lastIndexOf(Object o)`     | Retorna o índice da última ocorrência   |
| `subList(int from, int to)` | Retorna uma parte da lista              |



## 🔹3 Aplicações do List

*Usamos List quando:*

* Precisamos acessar elementos por índice
* A ordem dos elementos importa
* Elementos duplicados são aceitáveis
* Queremos flexibilidade (pode usar ArrayList ou LinkedList dependendo da performance esperada)

## ✅ Resumo
* List é uma interface que representa uma coleção ordenada e indexada
* Permite elementos duplicados
* Tem métodos poderosos como get(), indexOf(), subList(), etc.
* Base para ArrayList, LinkedList e outras implementações
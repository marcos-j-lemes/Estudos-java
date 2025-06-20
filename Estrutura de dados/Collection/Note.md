## 🔹 1. O que é `Collection`?
`Collection` é a interface raiz da Java Collections Framework.
Ela representa um grupo de objetos, chamados de elementos.


## 🔹 2. Estruturas que implementam Collection
As interfaces abaixo herdam de Collection:
*  `List` → lista ordenada (permite duplicatas)
* `Set` → conjunto (não permite duplicatas)
* `Queue` → fila (ordem de inserção ou prioridade)

```
Cada uma dessas possui implementações práticas como:

* ArrayList, LinkedList (List)
* HashSet, TreeSet (Set)
* PriorityQueue, ArrayDeque (Queue)
```

## 🔹 3. Para que serve?
Ela define um conjunto comum de `métodos` que podem ser usados em todas essas estruturas.


## 🔹 4. Principais métodos definidos por Collection
Esses métodos são herdados pelas interfaces filhas (List, Set, Queue):

| Método                      | Descrição                                                                |
| --------------------------- | ------------------------------------------------------------------------ |
| `add(E e)`                  | Adiciona um elemento à coleção                                           |
| `addAll(Collection c)`      | Adiciona todos os elementos de outra coleção                             |
| `clear()`                   | Remove todos os elementos da coleção                                     |
| `contains(Object o)`        | Retorna `true` se o elemento estiver na coleção                          |
| `containsAll(Collection c)` | Verifica se contém todos os elementos de outra coleção                   |
| `isEmpty()`                 | Verifica se está vazia                                                   |
| `remove(Object o)`          | Remove o elemento específico (se existir)                                |
| `removeAll(Collection c)`   | Remove todos os elementos que também estão na outra coleção              |
| `retainAll(Collection c)`   | Mantém apenas os elementos que estão na outra coleção                    |
| `size()`                    | Retorna o número de elementos                                            |
| `toArray()`                 | Retorna um array contendo os elementos da coleção                        |
| `iterator()`                | Retorna um iterador para percorrer a coleção (usado em loops `for-each`) |


## 🔸 Exemplo de código genérico:

```

public static void imprimirColecao(Collection<String> colecao) {
    for (String item : colecao) {
        System.out.println(item);
    }
}
```

## ✅ Resumo:
* Collection é uma interface mãe para as coleções Java.
* Define métodos básicos compartilhados.
* Serve de base para List, Set e Queue.

---
* *Author:* Marcos J. Lemes
* *Email:* `marcos.jlf@aluno.ifsc.edu.br`
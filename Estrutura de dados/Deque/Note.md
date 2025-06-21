

## 🔹 1. O que é `Deque`?

**Deque** significa **Double-Ended Queue** (Fila de Duas Extremidades).

> É uma estrutura que permite **inserção e remoção tanto no início quanto no fim** da fila.

Ela herda da interface `Queue`, mas é **mais flexível**, permitindo comportamentos de:

* **Fila comum (FIFO)** ✅
* **Pilha (LIFO)** ✅

---

## 🔹 2. Principais implementações de `Deque`

| Implementação | Características principais                               |
| ------------- | -------------------------------------------------------- |
| `ArrayDeque`  | Mais eficiente e recomendada. Baseada em array dinâmico. |
| `LinkedList`  | Também implementa `Deque`, mas com mais sobrecarga.      |

> 🚫 Evite usar `Stack` (classe antiga). Prefira `Deque` para comportamento de pilha moderna.

---

## 🔹 3. Métodos principais de `Deque`

> Os métodos se dividem em **extremidade inicial (início)** e **extremidade final (fim)**.

| Ação                  | Início                          | Fim                           |
| --------------------- | ------------------------------- | ----------------------------- |
| Inserir               | `addFirst(e)` / `offerFirst(e)` | `addLast(e)` / `offerLast(e)` |
| Remover               | `removeFirst()` / `pollFirst()` | `removeLast()` / `pollLast()` |
| Acessar (sem remover) | `getFirst()` / `peekFirst()`    | `getLast()` / `peekLast()`    |


## 🔹 4. Aplicações comuns

* Implementação de **pilha** (LIFO) usando `addFirst()` + `removeFirst()`
* Algoritmos que exigem acesso rápido nas duas pontas
* Verificações de palíndromos
* Estrutura base para **cache LRU** (Least Recently Used)
* Desfazer/refazer ações (ex: editores de texto)

---

## ✅ Resumo

* `Deque` permite inserção e remoção em **ambas as extremidades**.
* Pode ser usado tanto como **fila (FIFO)** quanto como **pilha (LIFO)**.
* `ArrayDeque` é a implementação mais rápida e recomendada.
* Tem métodos específicos para cada extremidade: `addFirst`, `addLast`, `pollFirst`, etc.


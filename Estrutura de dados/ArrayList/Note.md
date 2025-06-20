# 🔹 Array list

`ArrayList` é uma estrutura de dados dinâmica baseada em array.
Ela cresce automaticamente conforme os elementos são adicionados — diferente do array, que tem tamanho fixo.

* 📦 *Pertence ao pacote: `java.util.ArrayList`*


## Como funciona?


Internamente, o `ArrayList` usa um array comum, mas quando esse array enche, ele cria um novo array maior e copia os elementos para ele.

O acesso por índice é rápido (O(1)), igual ao array.

Inserções/remoções no meio da lista podem ser mais lentas (O(n)), pois exigem deslocamento dos elementos.

---
### 🔸 Vantagens:
* Tamanho dinâmico.
* Métodos prontos ( `add()`, `remove()`, `contains()`, `indexOf()`...)
* Compatível com as ferramentas do Java moderno (Streams, Lambdas, etc)

---

### 🔹 4. Aplicações práticas

<strong>ArrayList é muito usado quando:</strong>
* Você precisa de uma lista que cresce dinamicamente.
* Precisa acessar elementos por índice (como em um array).
* Precisa de uma lista ordenada com elementos repetidos permitidos.

---
### ✅ Exemplos do mundo real:

* Lista de tarefas em um app de produtividade.
* Lista de produtos em um carrinho de compras.
* Histórico de comandos ou ações em um sistema.

---
* *Author:* Marcos J. Lemes
* *Email:* `marcos.jlf@aluno.ifsc.edu.br`
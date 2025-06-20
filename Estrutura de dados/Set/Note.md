## 🔹 1. O que é `Set`?

`Set` é uma interface da Java Collections Framework que representa uma **coleção que não permite elementos duplicados**.

>⚠️ Se você tentar adicionar um item repetido, ele **simplesmente será ignorado**.

Ela herda de `Collection`, então possui os mesmos métodos básicos (`add()`, `remove()`, `contains()`, etc.).

---

## 🔹 2. Principais implementações de `Set`

| Implementação   | Características principais                                    |
| --------------- | ------------------------------------------------------------- |
| `HashSet`       | Mais comum. Sem garantia de ordem. Alta performance.          |
| `LinkedHashSet` | Mantém a ordem de inserção. Um pouco mais pesado.             |
| `TreeSet`       | Ordena os elementos de forma **natural** (ou com comparador). |

> Na dúvida, comece com `HashSet`.

---

## 🔹 3. Como funciona internamente?

* `HashSet` usa uma **tabela hash** para armazenar elementos de forma rápida.
* Duplicatas são detectadas com base no resultado de `equals()` e `hashCode()` dos objetos.
* Acesso por índice **não existe** — `Set` não é indexado.


## 🔹 4. Aplicações comuns

* Eliminar valores duplicados.
* Garantir unicidade (ex: emails únicos, ID únicos, CPFs únicos).
* Verificação de presença (mais eficiente que `List` em grandes conjuntos).

## ✅ Resumo

* `Set` é uma **coleção sem elementos duplicados**.
* A ordem **não é garantida** (a não ser com `LinkedHashSet` ou `TreeSet`).
* É ideal para **verificação de unicidade**, **filtragem de dados**, e **operações matemáticas de conjuntos** (união, interseção, diferença).


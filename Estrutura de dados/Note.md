# Estruturas de Dados em Java — Ordem de Estudo e Resumo

## 📌 Introdução

As estruturas de dados são fundamentais para organizar, armazenar e manipular informações de forma eficiente. Em Java, existe uma hierarquia robusta conhecida como **Java Collections Framework**, que oferece diversas implementações prontas para diferentes finalidades.

Para entender de forma gradual, é útil estudar em **forma de pirâmide**, partindo das bases mais simples até as abstrações mais poderosas.

---

## 🧱 Pirâmide de Estruturas de Dados — Ordem Sugerida de Estudo

```
      Map
    /     \
   Set    List
    \     /
  Collection
      |
   ArrayList
      |
  Array (base)

```


---

## 🧾 Resumo por nível (até o nível atual)

### 1. 🔹 Array
- Estrutura nativa e mais básica.
- Tamanho fixo e acesso por índice.
- Usada quando se sabe a quantidade exata de elementos.
- Não faz parte do pacote `Collection`.

### 2. 🔹 ArrayList
- Estrutura dinâmica baseada em array.
- Pertence à hierarquia da interface `List`.
- Permite duplicatas, ordenada, e redimensionável.
- Ideal para quando a quantidade de elementos pode variar.

### 3. 🔹 Collection
- Interface **raiz** do Java Collections Framework.
- Define os principais métodos (`add()`, `remove()`, `contains()`, `size()`, etc).
- Não pode ser instanciada diretamente, mas é a base para `List`, `Set` e `Queue`.

### 4. 🔹 List
- Interface que representa listas ordenadas e indexadas.
- Permite elementos duplicados.
- Implementações: `ArrayList`, `LinkedList`, `Vector`.
- Ideal quando é necessário preservar a ordem de inserção e permitir duplicatas.

---

## 🧠 Observações Importantes

- A **sintaxe e métodos** entre `List`, `Set`, e `Queue` são muito parecidos porque todos herdam de `Collection`.
- O que muda é o **comportamento interno** e o **objetivo** de cada um:
  - `List`: mantém ordem e permite duplicatas.
  - `Set`: não permite elementos repetidos.
  - `Queue`: segue o modelo de fila (FIFO) e pode ter prioridades.
- Aprender primeiro os conceitos comuns (como `add`, `remove`, `contains`, `size`, etc) facilita muito a compreensão das outras estruturas.

---

✅ **Próximos passos de estudo sugeridos**:

1. **Set** – coleções sem duplicatas  
2. **Queue** – fila (FIFO)  
3. **Deque** – fila de duas extremidades  
4. **Map** – estrutura baseada em pares chave-valor (fora de Collection, mas essencial)


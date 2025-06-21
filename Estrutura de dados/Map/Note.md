## 🔹 1. O que é `Map`?

`Map` é uma **interface da Java Collections Framework**, mas **não herda de `Collection`**, pois seu comportamento é diferente:

> Em vez de guardar apenas elementos, o `Map` armazena **pares chave-valor (key-value)**.

* Cada **chave é única**
* Cada chave está associada a **um valor**
* Um valor pode se repetir, mas a chave não

---

## 🔹 2. Principais implementações de `Map`

| Implementação   | Características principais                                  |
| --------------- | ----------------------------------------------------------- |
| `HashMap`       | Mais comum. Alta performance. Sem ordem garantida.          |
| `LinkedHashMap` | Mantém ordem de inserção. Um pouco mais lento.              |
| `TreeMap`       | Ordena automaticamente pelas chaves (ordem natural).        |
| `Hashtable`     | Antiga, sincronizada, geralmente evitada em projetos novos. |

> ✅ Normalmente usamos `HashMap`.

---

## 🔹 3. Principais métodos de `Map`

| Método                   | Descrição                                                    |
| ------------------------ | ------------------------------------------------------------ |
| `put(K chave, V valor)`  | Adiciona ou substitui um valor para uma chave                |
| `get(K chave)`           | Retorna o valor associado à chave (ou `null` se não existir) |
| `containsKey(K chave)`   | Verifica se a chave existe                                   |
| `containsValue(V valor)` | Verifica se o valor existe                                   |
| `remove(K chave)`        | Remove o par com a chave                                     |
| `size()`                 | Retorna o número de pares armazenados                        |
| `isEmpty()`              | Verifica se está vazio                                       |
| `keySet()`               | Retorna um `Set` com todas as chaves                         |
| `values()`               | Retorna uma `Collection` com todos os valores                |
| `entrySet()`             | Retorna um `Set` com os pares chave-valor                    |


## 🔹 4. Aplicações comuns

* Dicionários de palavras e definições
* Contar frequência de elementos (ex: letras, palavras)
* Mapear IDs para nomes, emails, objetos...
* Configurações (ex: chave = “modo escuro”, valor = `true`)
* Cache de dados (com limite de tamanho, usando `LinkedHashMap`)

---

## ✅ Resumo

* `Map` armazena **pares chave-valor**
* Chaves são únicas; valores podem se repetir
* Ideal para buscas rápidas e relacionamentos diretos
* Não faz parte da interface `Collection`, mas é essencial

---

## 📌 Finalizando a pirâmide de estrutura de dados em Java:

```
          Map
        /     \
   Set         List
     \         /
      Collection
           |
         ArrayList
           |
         Array (base)
```

Cada camada adiciona **mais poder e flexibilidade**, começando pelo simples `Array` até a poderosa estrutura de **associação de dados com `Map`**
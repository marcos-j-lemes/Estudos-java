## 📌 **`Queue` em Java (FIFO - First-In, First-Out)**
🔹 **O que é?**  
   - Uma **fila** onde o **primeiro elemento inserido é o primeiro a ser removido** (como uma fila de banco).  
   - Estende `Collection`, então herda métodos como `add()`, `remove()`, `size()`, etc.  
   - **Não é uma classe, mas uma interface**. As implementações mais comuns são:  
     - `LinkedList`  
     - `PriorityQueue` (ordena por prioridade, não é puramente FIFO)  
     - `ArrayDeque` (mais eficiente para filas simples).  

---

## 📋 **Principais Métodos da `Queue`**
### 1️⃣ **Inserção de Elementos**  
| Método         | Comportamento quando a fila está cheia | Lança Exceção? | Retorno Especial |
|----------------|---------------------------------------|----------------|------------------|
| `add(e)`       | Lança `IllegalStateException`          | ✅ Sim         | ❌               |
| `offer(e)`     | **Retorna `false`**                    | ❌ Não         | ✅ (`false`)     |

**Exemplo**:  
```java
Queue<String> fila = new LinkedList<>();
fila.add("Alice");  // Lança exceção se não conseguir inserir
fila.offer("Bob");  // Retorna false se não conseguir, sem exceção
```

---

### 2️⃣ **Remoção de Elementos**  
| Método         | Comportamento quando a fila está vazia | Lança Exceção? | Retorno Especial |
|----------------|----------------------------------------|----------------|------------------|
| `remove()`     | Lança `NoSuchElementException`         | ✅ Sim         | ❌               |
| `poll()`       | **Retorna `null`**                     | ❌ Não         | ✅ (`null`)      |

**Exemplo**:  
```java
String proximo1 = fila.remove();  // Remove "Alice" (lança exceção se vazia)
String proximo2 = fila.poll();    // Remove "Bob" (retorna null se vazia)
```

---

### 3️⃣ **Consulta ao Primeiro Elemento (sem remover)**  
| Método         | Comportamento quando a fila está vazia | Lança Exceção? | Retorno Especial |
|----------------|----------------------------------------|----------------|------------------|
| `element()`    | Lança `NoSuchElementException`         | ✅ Sim         | ❌               |
| `peek()`       | **Retorna `null`**                     | ❌ Não         | ✅ (`null`)      |

**Exemplo**:  
```java
String cabeca1 = fila.element();  // Retorna o próximo (lança exceção se vazia)
String cabeca2 = fila.peek();    // Retorna o próximo (null se vazia)
```

---

## 🛠 **Implementações Práticas de `Queue`**
### 1. **`LinkedList` como Fila (FIFO Simples)**
```java
Queue<Integer> fila = new LinkedList<>();
fila.offer(10);
fila.offer(20);

System.out.println(fila.poll());  // 10 (primeiro a entrar)
System.out.println(fila.poll());  // 20
```

### 2. **`PriorityQueue` (Fila com Prioridades)**
```java
Queue<Integer> filaPrioritaria = new PriorityQueue<>();
filaPrioritaria.offer(30);
filaPrioritaria.offer(10);
filaPrioritaria.offer(20);

System.out.println(filaPrioritaria.poll());  // 10 (menor valor primeiro)
System.out.println(filaPrioritaria.poll());  // 20
```

---

## 🔍 **Diferença Entre `Queue` e `Deque`**
| Operação       | `Queue` (FIFO)           | `Deque` (Fila Dupla)       |
|---------------|--------------------------|---------------------------|
| Inserir no fim | `add(e)` / `offer(e)`    | `addLast(e)` / `offerLast(e)` |
| Inserir no início | ❌ Não permitido       | `addFirst(e)` / `offerFirst(e)` |
| Remover do início | `remove()` / `poll()` | `removeFirst()` / `pollFirst()` |
| Remover do fim | ❌ Não permitido         | `removeLast()` / `pollLast()` |

---

## 💡 **Quando Usar `Queue`?**
1. **Processamento em ordem de chegada**:  
   - Ex: Filas de pedidos em um restaurante (o primeiro pedido é atendido primeiro).  
2. **BFS (Busca em Largura)**:  
   - Algoritmos de grafos que usam filas para explorar níveis.  
3. **Buffers de Mensagens**:  
   - Sistemas que processam mensagens na ordem recebida (ex: filas RabbitMQ).  

---

## 📜 **Exemplo Completo: Simulando uma Fila de Impressão**
```java
import java.util.LinkedList;
import java.util.Queue;

public class FilaDeImpressao {
    public static void main(String[] args) {
        Queue<String> documentos = new LinkedList<>();
        
        // Adicionando documentos à fila
        documentos.offer("Relatório.pdf");
        documentos.offer("Planilha.xlsx");
        documentos.offer("Apresentação.pptx");

        // Processando a fila
        while (!documentos.isEmpty()) {
            String doc = documentos.poll();
            System.out.println("Imprimindo: " + doc);
        }
    }
}
```
**Saída**:  
```
Imprimindo: Relatório.pdf
Imprimindo: Planilha.xlsx
Imprimindo: Apresentação.pptx
```

---

## ✅ **Resumo dos Métodos da `Queue`**
| Objetivo          | Método que Lança Exceção | Método que Retorna Valor Especial |
|-------------------|--------------------------|-----------------------------------|
| Inserir           | `add(e)`                 | `offer(e)`                        |
| Remover           | `remove()`               | `poll()`                          |
| Consultar (peek)  | `element()`              | `peek()`                          |

### **Dica Importante**:  
- Prefira **`offer()`**, **`poll()`** e **`peek()`** para evitar exceções em filas vazias/cheias.  
- Use `LinkedList` para FIFO puro e `PriorityQueue` para prioridades.  
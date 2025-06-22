## 📦 **O que é `class Caixa<T>`?**  
É uma **classe genérica** que pode trabalhar com **qualquer tipo (`T`)** sem precisar reescrever a classe para cada tipo possível. O `T` é um "placeholder" que será substituído por um tipo real (como `String`, `Integer`, etc.) quando a classe for usada.  

### 🔹 **Exemplo Básico:**  
```java
public class Caixa<T> {  // "T" pode ser qualquer tipo (String, Integer, etc.)
    private T conteudo;

    public void guardar(T item) {
        this.conteudo = item;
    }

    public T pegar() {
        return conteudo;
    }
}
```

---

### 🛠 **Como usar essa `Caixa<T>`?**  
Ao criar um objeto, você especifica o tipo que `T` representará:  

```java
Caixa<String> caixaDeString = new Caixa<>();
caixaDeString.guardar("Olá, Mundo!");
String texto = caixaDeString.pegar(); // Retorna "Olá, Mundo!"

Caixa<Integer> caixaDeInt = new Caixa<>();
caixaDeInt.guardar(100);
int numero = caixaDeInt.pegar(); // Retorna 100
```

---

## 💡 **Por que usar Generics (`<T>`)?**  
1. **Segurança de tipos**:  
   - O compilador verifica se você está usando o tipo correto.  
   - Evita erros como `ClassCastException`.  

2. **Reutilização de código**:  
   - A mesma classe (`Caixa`) funciona para `String`, `Integer`, ou qualquer outro tipo.  

3. **Elimina a necessidade de casts**:  
   - Sem Generics (Java antigo):  
     ```java
     Caixa caixa = new Caixa(); // Raw type (não genérico)
     caixa.guardar("Texto");
     String texto = (String) caixa.pegar(); // Casting necessário (risco de erro!)
     ```  
   - Com Generics:  
     ```java
     Caixa<String> caixa = new Caixa<>();
     caixa.guardar("Texto");
     String texto = caixa.pegar(); // Sem casting!
     ```

---

## 🌟 **Múltiplos Tipos Genéricos**  
Você pode definir vários parâmetros de tipo, como em `Map<K, V>`:  

```java
public class Par<K, V> {  // Dois tipos genéricos: K (chave) e V (valor)
    private K chave;
    private V valor;

    // Getters e Setters...
}
```

**Uso:**  
```java
Par<String, Integer> par = new Par<>();
par.setChave("Idade");
par.setValor(30);
```

---

## ⚠️ **Restrições e Observações**  
1. **Tipos primitivos não são aceitos**:  
   - Use `Integer` em vez de `int`, `Double` em vez de `double`, etc.  

2. **Herança com Generics**:  
   - `Caixa<String>` **não é** subtipo de `Caixa<Object>`.  

3. **Wildcards (`?`)**:  
   - Usados para flexibilidade (ex: `List<?>` aceita qualquer tipo, mas com restrições).  

---

## 📌 **Exemplo Avançado: Métodos Genéricos**  
Você também pode criar métodos genéricos dentro de classes não genéricas:  

```java
public class Utilitarios {
    public static <T> void imprimir(T[] array) {  // Método genérico
        for (T item : array) {
            System.out.print(item + " ");
        }
    }
}
```

**Uso:**  
```java
String[] palavras = {"Java", "Generics"};
Utilitarios.imprimir(palavras); // Imprime: Java Generics
```

---

## 🔥 **Resumo Final**  
| Sintaxe | Significado | Exemplo |  
|---------|-------------|---------|  
| `class Caixa<T>` | Classe genérica com tipo `T` | `Caixa<String>` |  
| `<T>` | Parâmetro de tipo | `T conteudo;` |  
| `Caixa<Integer>` | Tipo concreto (`T` = `Integer`) | `caixa.guardar(100)` |  
| `<K, V>` | Múltiplos tipos genéricos | `Map<String, Integer>` |  


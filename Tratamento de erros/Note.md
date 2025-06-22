## 📝 **Tratamento de Erros em Java**  

Este README explica os principais conceitos e mecanismos para lidar com erros (exceções) em Java.  

---

## 🔧 **Mecanismos Principais**  

### 1. **`try-catch-finally`**  
- **`try`**: Bloco onde o código que pode gerar erros é executado.  
- **`catch`**: Captura e trata exceções (específicas ou genéricas).  
- **`finally`**: Executa código **sempre** (ideal para liberar recursos).  

**Exemplo:**  
```java
try {
    int divisao = 10 / 0; // ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Erro: Divisão por zero!");
} finally {
    System.out.println("Finalizando...");
}
```

---

### 2. **`throw`** (Lançar exceções manualmente)  
- Usado para **forçar** um erro quando uma condição inválida é detectada.  

**Exemplo:**  
```java
if (idade < 0) {
    throw new IllegalArgumentException("Idade inválida!");
}
```

---

### 3. **Exceções Personalizadas**  
- Crie suas próprias exceções estendendo `Exception` (checked) ou `RuntimeException` (unchecked).  

**Exemplo:**  
```java
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

// Uso:
if (saldo < valor) {
    throw new SaldoInsuficienteException("Saldo insuficiente!");
}
```

---

### 4. **`throws`** (Declarar exceções no método)  
- Indica que um método **pode lançar** uma exceção, mas não a trata.  
- Obriga quem chama o método a tratar ou repassar a exceção.  

**Exemplo:**  
```java
public void lerArquivo(String caminho) throws FileNotFoundException {
    File arquivo = new File(caminho);
    Scanner leitor = new Scanner(arquivo); // Pode lançar FileNotFoundException
}
```

---

## 📌 **Hierarquia de Exceções**  
- **`Exception` (Checked)**: Exige tratamento (ex: `IOException`).  
- **`RuntimeException` (Unchecked)**: Não exige tratamento (ex: `NullPointerException`).  
- **`Error`**: Erros graves (ex: `OutOfMemoryError`).  

---

## ✅ **Boas Práticas**  
✔ **Capture exceções específicas** antes das genéricas.  
✔ **Use `finally`** para liberar recursos (arquivos, conexões).  
✔ **Documente exceções** com `@throws` em JavaDoc.  
✔ **Evite `catch` vazio** (não ignore erros silenciosamente).  

---

## 🚀 **Exemplo Completo**  
```java
public class TratamentoErros {
    public static void main(String[] args) {
        try {
            validarIdade(-5); // Lança exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void validarIdade(int idade) throws IllegalArgumentException {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa!");
        }
    }
}
```
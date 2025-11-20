package entidades;

// Subclasse representando a moeda Real.
public class Real extends Moeda {

    // Definição do construtor fazendo referência à classe abstrata Moeda.
    public Real(double valor) {
        super(valor);
    }
    
    // Habilitação do método info().
    public void info() {
        System.out.println("Moeda: Real - Valor R$ " + valor);
    }
    
    // Habilitação do método converter()
    // Conversão de valor não realizada, visto que a moeda em questão já é o Real.
    public double converter() {
        return valor;
    }

    // Sobrescrita do método equals para permitir a comparação entre objetos Real.
    // Prezado corretor, neste trecho encontrei grande dificuldade, e acabei por utilizar IA, confesso que não compreendi bem esse funcionamento.
    public boolean equals(Object obj) {
        // Verificação se o objeto comparado é o mesmo.
        if (this == obj) return true;
        // Verificação se o objeto é nulo ou de classe diferente.
        if (obj == null || getClass() != obj.getClass()) return false;
        // Conversão do objeto para Real e comparação dos valores.
        Real other = (Real) obj;
        return Double.compare(this.valor, other.valor) == 0;
    }
    // Sobrescrita do método hashCode para manter consistência com equals.

    public int hashCode() {
        return Double.hashCode(valor);
    }
}

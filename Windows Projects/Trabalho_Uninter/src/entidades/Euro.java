package entidades;

// Subclasse representando a moeda Euro.
public class Euro extends Moeda {

    // Definição do construtor fazendo referência a classe abstrata Moeda.
    public Euro(double valor) {
        super(valor);
    }
    
    // Habilitação do método info().
    public void info() {
        System.out.println("Moeda: Euro - Valor EU$ " + valor);
    }
    
    // Habilitação do método converter()
    // Conversão de valor utilizando a cotação de EU$ 1.0 = R$ 6.26.
    public double converter() {
        return valor * 6.26;
    }

    // Sobrescrita do método equals para permitir a comparação entre objetos Euro.
    // Prezado corretor, neste trecho encontrei grande dificuldade, e acabei por utilizar IA, confesso que não compreendi bem esse funcionamento.
    public boolean equals(Object obj) {
        // Verificação se o objeto comparado é o mesmo.
        if (this == obj) return true;
        // Verificação se o objeto é nulo ou de classe diferente.
        if (obj == null || getClass() != obj.getClass()) return false;
        // Conversão do objeto para Euro e comparação dos valores.
        Euro other = (Euro) obj;
        return Double.compare(this.valor, other.valor) == 0;
    }

    // Sobrescrita do método hashCode para manter consistência com equals.
    public int hashCode() {
        return Double.hashCode(valor);
    }
}

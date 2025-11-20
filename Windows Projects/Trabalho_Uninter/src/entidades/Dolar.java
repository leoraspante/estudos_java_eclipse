package entidades;

// Subclasse representando a moeda Dólar.
public class Dolar extends Moeda {

    // Definição do construtor fazendo referência a classe abstrata Moeda.
    public Dolar(double valor) {
        super(valor);
    }
    
    // Habilitação do método info().
    public void info() {
        System.out.println("Moeda: Dólar - Valor US$ " + valor);
    }
    
    // Habilitação do método converter()
    // Conversão de valor utilizando a cotação de US$ 1.0 = R$ 5.37.
    public double converter() {
        return valor * 5.37;
    }

    // Sobrescrita do método equals para permitir a comparação entre objetos Dólar.
    // Prezado corretor, neste trecho encontrei grande dificuldade, e acabei por utilizar IA, confesso que não compreendi bem esse funcionamento.
    public boolean equals(Object obj) {
        // Verificação se o objeto comparado é o mesmo.
        if (this == obj) return true;
        // Verificação se o objeto é nulo ou de classe diferente.
        if (obj == null || getClass() != obj.getClass()) return false;
        // Conversão do objeto para Dólar e comparação dos valores.
        Dolar other = (Dolar) obj;
        return Double.compare(this.valor, other.valor) == 0;
    }

    // Sobrescrita do método hashCode para manter consistência com equals.
    public int hashCode() {
        return Double.hashCode(valor);
    }
}

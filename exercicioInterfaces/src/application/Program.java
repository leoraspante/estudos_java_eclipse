// Primeiro exercício proposto.

/* Uma locadora brasileira de carros cobra um valor por hora para locações de até
12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
cobrada com base em um valor diário. Além do valor da locação, é acrescido no
preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
programa que lê os dados da locação (modelo do carro, instante inicial e final da
locação), bem como o valor por hora e o valor diário de locação. O programa
deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela. Veja os
exemplos. */

package application;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Car;
import model.entities.Rent;
import utils.DateUtils;
import utils.NumberUtils;
import utils.StringUtils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Mesnagem de apresentação.
		System.out.printf("Informe os dados do aluguel%n%n");
		
		// Coleta de dados validadas por métodos - Pacote utils.
		String msgCar = "Modelo do carro: ";
		String carModel = StringUtils.readCarName(sc, msgCar);
		
		String msgRent = "Data/Hora da retirada do veículo : ";
		LocalDateTime rentTime = DateUtils.readDateTime(sc, msgRent, fmt);
		
		String msgReturn = "Data/Hora da devolução do veículo : ";
		LocalDateTime returnTime;
		while(true) {
			returnTime = DateUtils.readDateTime(sc, msgReturn, fmt);
			if(returnTime.isAfter(rentTime)) { // Lógica garantindo que a devolução seja posterior a locação.
				break;
			}
			else {
				System.out.printf("%nA devolução deve ser posterior à retirada.%nTente novamente.%n%n");
			}
		}
		
		String msgPricePerHour = "Entre com o preço por hora: ";
		Double pricePerHour = NumberUtils.readDouble(sc, msgPricePerHour);
		
		String msgPricePerDay = "Entre com o preço por dia: ";
		Double pricePerDay = NumberUtils.readDouble(sc, msgPricePerDay);
		
		// Criação do objeto aluguel.
		Rent rent = new Rent(rentTime, returnTime, new Car(carModel));
		
		Duration duration = rent.parkingDuration(rentTime, returnTime);
		
		double minutes = duration.toMinutes();
		double rentDuration = minutes / 60;
		
		System.out.println("Tempo de locação: " + rentDuration);
		
		
		
		sc.close();
	}

}

// Descrição do exercício.

// Aula inicial onde são aplicados conceitos de manipulação de data/hora no Java.
// Material serve para consulta posteriores.

package application;

import java.time.Instant; // Responsável pela data e hora atual global GMT + 0.
import java.time.LocalDate; // Responsável pela data atual do sistema.
import java.time.LocalDateTime; // Responsável pela data e hora atual do sistema.
import java.time.ZoneId; // Permite especificar uma zona de fuso horário.
import java.time.format.DateTimeFormatter; // Responsável pela formatação personalizada de data/hora.
import java.time.temporal.ChronoUnit; // Permite a especificação de um intervalo para tipo Instant.
import java.time.Duration; // Permite o cálculo de tempo entre datas.

public class Program {

	public static void main(String[] args) {
		
		// Exibindo a data atual so sistema.
		System.out.println("Exibindo a data atual do sistema:");
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		
		System.out.println("--------------------------------------------------");
		
		// Exibindo a data e hora atual do sistema.
		System.out.println("Exibindo a data e hora atual do sistema:");
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		
		System.out.println("--------------------------------------------------");

		// Exibindo a data e hora atual global GMT + 0.
		System.out.println("Exibindo a data e hora atual global GMT + 0:");
		Instant d03 = Instant.now();
		System.out.println(d03);
				
		System.out.println("--------------------------------------------------");		
		
		// Gerando uma data a partir de um texto padrão ISO8601.
		System.out.println("Gerando uma data de um texto padrão ISO8601:");
		LocalDate d04 = LocalDate.parse("2025-11-27"); // Atenção a formatação da string e o uso do método .parse.
		System.out.println(d04);
		
		System.out.println("--------------------------------------------------");
		
		// Gerando uma data/hora a partir de um texto padrão ISO8601.
		System.out.println("Gerando uma data/hora de um texto padrão ISO8601:");
		LocalDateTime d05 = LocalDateTime.parse("2025-11-27T09:40:55"); // Atenção a formatação da string e o uso do método .parse. A hora vem após o T.
		System.out.println(d05);
		
		System.out.println("--------------------------------------------------");
		
		// Gerando uma data/hora no padrão global GMT + 0.
		System.out.println("Gerando uma data/hora no padrão global GMT + 0:");
		Instant d06 = Instant.parse("2025-11-27T09:40:55Z"); // Atenção a formatação da string e o uso do método .parse. A hora vem após o T, e colocar o Z no final.
		System.out.println(d06);
		
		System.out.println("--------------------------------------------------");
		
		// Gerando uma data/hora especificando um timezone.
		System.out.println("Gerando uma data/hora no padrão GMT - 3:");
		Instant d07 = Instant.parse("2025-11-27T09:40:55-03:00"); // Atenção a formatação da string e o uso do método .parse. A hora vem após o T, o timezone usado foi o GMT-3 "-03:00".
		System.out.println(d07);
		System.out.println("Exibido o horário de Londres 3 horas a mais.");
				
		System.out.println("--------------------------------------------------");
		
		// Gerando uma data/hora a partir de um texto customizado.
		System.out.println("Gerando uma data/hora de um texto customizado:");
		System.out.println("Ex de entrada: 27/11/2025");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Aqui especificamos uma formatação personalizada.
		// Tabela contendo os padrões de formatação de data/hora.
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate d08 = LocalDate.parse("27/11/2025", fmt1); // Atenção a formatação da string seguindo regras do Java.
		// Ou: LocalDate d08 = LocalDate.parse("27/11/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Saída formatada: " + d08);
		
		System.out.println();
		
		System.out.println("Ex de entrada: 27/11/2025 15:35");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("27/11/2025 15:35", fmt2);
		System.out.println("Saída formatada: " + d09);
								
		System.out.println("-------------------------------------------------------------------------------");
		
		// Gerando uma data a partir de dados isolados (dia,mês,ano).
		System.out.println("Gerando uma data a partir de dados isolados (dia,mês,ano):");
		LocalDate d10 = LocalDate.of(2025, 11, 27); // Basta substituir os valores por variáveis.
		System.out.println("Saída formatada: " + d10);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		// Gerando uma data/hora a partir de dados isolados (dia,mês,ano,hora,minuto).
		System.out.println("Gerando uma data/hora a partir de dados isolados (dia,mês,ano,hora,minuto):");
		LocalDateTime d11 = LocalDateTime.of(2025, 11, 27, 12, 53); // Basta substituir os valores por variáveis.
		System.out.println("Saída formatada: " + d11);
				
		System.out.println("-------------------------------------------------------------------------------");
		
		// Trabalhando com formatação personalizada para a exibição de data/hora.
		System.out.println("Saídas personalizadas de data");
		System.out.println("Exemplo de entrada: 2025-11-27");
		System.out.println();
		LocalDate d12 = LocalDate.parse("2025-11-27");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de saída escolhido.
		System.out.println("Saída padrão: " + d12);
		System.out.println("Saída formatada: " + d12.format(fmt3)); // Atenção ao uso do .format recebendo fmt3 como parâmetro.
		// Ou: System.out.println("Saída formatada: " + fmt3.format(d12));
		// Ou: System.out.println("Saída formatada: " + d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Saídas personalizadas de data/hora");
		System.out.println("Exemplo de entrada: 2025-11-27 13:08");
		System.out.println();		
		LocalDateTime d13 = LocalDateTime.parse("2025-11-27T13:08");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato de saída escolhido, incluindo hora.
		System.out.println("Saída padrão: " + d13);
		System.out.println("Saída formatada: " + d13.format(fmt4));
		
		System.out.println("-----------------------------------------------------------");
		
		// Imprimindo de forma customizada uma data/hora global.
		System.out.println("Imprimindo de forma customizada uma data/hora global");
		System.out.println("Exemplo de entrada: 2025-11-27T13:08:36Z");
		System.out.println();
		Instant d14 = Instant.parse("2025-11-27T13:08:36Z");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // .withZone(ZoneId.systemDefault() Permite especificar o fuso horário. 
		System.out.println("Saída padrão GMT 0: " + d14);
		System.out.println("Saída formatada considerando fuso GMT-3: " + fmt5.format(d14)); // Atenção a ordem dos parâmetros.
		
		System.out.println("----------------------------------------------------------------------------");
		
		// Convertendo data/hora global para local.
		System.out.println("Convertendo data/hora global para local");
		System.out.println("Ex data/hora global: 2025-11-27T01:30:00Z");
		System.out.println();
		Instant d15 = Instant.parse("2025-11-27T01:30:00Z");
		LocalDate r1 = LocalDate.ofInstant(d15, ZoneId.systemDefault()); // Conversão para o fuso local do sistema.
		LocalDate r2 = LocalDate.ofInstant(d15, ZoneId.of("Europe/Athens")); // Conversão para o fuso de Portugal.
		LocalDateTime r3 = LocalDateTime.ofInstant(d15, ZoneId.systemDefault()); // Conversão para o fuso local do sistema.
		LocalDateTime r4 = LocalDateTime.ofInstant(d15, ZoneId.of("Europe/Athens")); // Conversão para o fuso de Portugal.
		System.out.println("Saída padrão GMT 0: " + d15);
		System.out.println("Saída formatada para fuso local somente data GMT-3: " + r1);
		System.out.println("Saída formatada para fuso de Portugal somente data GMT+2: " + r2);
		System.out.println();
		System.out.println("Saída formatada para fuso local data/hora GMT-3: " + r3);
		System.out.println("Saída formatada para fuso de Atenas data/hora GMT+2: " + r4);
		
		System.out.println("----------------------------------------------------------------------------");
		
		// Obtendo dados de uma data/hora local.
		System.out.println("Extraindo dados de uma data/hora local");
		LocalDateTime d16 = LocalDateTime.parse("2025-04-22T15:30");
		System.out.println("Saída padrão: " + d16);
		System.out.println();
		System.out.println("Saídas personalizadas:");
		System.out.println("Dia do mês: " + d16.getDayOfMonth()); // Extrai o dia do mês com o .getDayOfMonth().
		System.out.println("Mês: " + d16.getMonthValue());
		System.out.println("Ano: " + d16.getYear());
		System.out.println("Hora: " + d16.getHour());
		System.out.println("Minuto: " + d16.getMinute());
		
		System.out.println("--------------------------------------------------");
		
		// Realizando cálculos com data/hora
		System.out.println("Realizando cálculos com data/hora");
		System.out.println("Ex: Diminuindo e somando 7 dias");
		LocalDate d17 = LocalDate.parse("2025-05-22");
		LocalDate d17LastWeek = d17.minusDays(7); // Removi 7 dias desta data usando o .minusDays(7).
		LocalDate d17NextWeek = d17.plusDays(7); // Acrescentei 7 dias a data usando o .plusDays(7).
		System.out.println("Data padrão: " + d17);
		System.out.println("Data com 7 dias a menos: " + d17LastWeek);
		System.out.println("Data com 7 dias a mais: " + d17NextWeek);
		System.out.println();
		LocalDateTime d18 = LocalDateTime.parse("2025-05-22T15:00");
		LocalDateTime d18MinusTime = d18.minusSeconds(9300); // Removi 9300 segundos = 2h35min.
		LocalDateTime d18PlusTime = d18.plusSeconds(9300); // Acrescentei 9300 segundos = 2h35min.
		System.out.println("Ex: Diminuindo e somando 2h35min");
		System.out.println("Data/Hora padrão: " + d18);
		System.out.println("Data/Hora com 2h35min a menos: " + d18MinusTime);
		System.out.println("Data/Hora com com 2h35min a mais: " + d18PlusTime);
		System.out.println();
		Instant d19 = Instant.parse("2025-11-27T18:30:00Z");
		Instant past = d19.minus(7, ChronoUnit.DAYS); // Atenção ao uso do ChronoUnit permitindo adicionar dias.
		Instant future = d19.plusSeconds(9300);
		System.out.println("Ex: Diminuindo e somando GTM+0");
		System.out.println("Data/Hora padrão: " + d19);
		System.out.println("Subtraindo 7 dias: " + past);
		System.out.println("Adicionando 2h35min: " + future);
		
		System.out.println("--------------------------------------------------");
		
		// Encontrando intervalo de tempo entre duas datas.
		System.out.println("Encontrando o intervalo de tempo entre duas datas");
		System.out.println("Data Inicial: 2025-05-22T18:32:45");
		System.out.println("Data Final: 2025-05-27T21:18:58");
		LocalDateTime d20 = LocalDateTime.parse("2025-05-22T18:32:45");
		LocalDateTime d21 = LocalDateTime.parse("2025-05-27T21:18:58");
		Duration t1 = Duration.between(d20, d21);
		// Quebrando em dias, horas, minutos e segundos
		long dias = t1.toDays();
		long horas = t1.toHours() % 24; // Atenção ao uso do tipo long e a quebra em 24, representando um dia.
		long minutos = t1.toMinutes() % 60;
		long segundos = t1.getSeconds() % 60;
		System.out.println();
		System.out.println("Resultado:");
		System.out.println("Dias: " + dias);
		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);
		
		System.out.println("--------------------------------------------------");
		
	}

}

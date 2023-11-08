package variaveis;

public class Variaveis {

	public static void main(String[] args) {
		
		/* ----- VARIÁVEIS E CONSTANTES
		 * 
		 * Variáveis são um tipo de armazenamento de dados em memória que tem um valor mutável ao longo da execução.
		 * * Toda variável tem um identificador (designado após a declaração de tipo) e um valor (atribuído pelo operador '=')
		 * 
		 * Constantes são um tipo de armazenamento de dados em memória que tem um valor fixo e imutável ao longo da execução.
		 * * Para declarar uma constante, babsta colocar a keyword 'final' antes do tipo da variável
		 * 
		 * Tipos de dados primitivos:
		 * * Tipos numéricos:
		 * 
		 * * * Tipos integrais: // Armazenam números inteiros
		 * * * * byte: dado composto por 8 bits. -128/127 (valor mínimo/valor máximo) 
		 * * * * short: dado composto por 16 bits. -32.768/32.767
		 * * * * int: dado composto por 32 bits, comumente utilizado para operações aritméticas com inteiro sem sinal. -2.147.483.648/2.147.483.648
		 * * * * long: dado composto por 64 bits. -9.223.372.036.854.775.808/9.223.372.036.854.775.808
		 * 
		 * * * Tipos de ponto flutuante: //Armazenam números decimais
		 * * * * float: dado composto por 32 bits, comumente utilizado em operações que precisam economizar memória.
		 * * * * double: dado composto por 64 bits, é o padrão para dados com valores reais, mas não deve ser usado para valores precisos como moedas.
		 * 
		 * * Tipos não-numéricos:
		 * * * char: tipo de dado composto por apenas um caractere Unicode de 16 bits.
		 * * * Tipos booleanos: //Armazenam valores lógicos de verdadeiro ou falso
		 * * * * true: verdadeiro
		 * * * * false: falso
		 */
		
		byte bit = 127;
		short valor = 254;
		int quantidade = 1000;
		long identificador = 10000l; //Tem um 'l' no final para diferenciar de int
		float altura = 25.4f; //Tem um 'f' no final para diferenciar de double
		double area = 45.4567;
		char tipo = 'A'; //Sempre declarar com aspas simples
		boolean resposta = true;
		
		// String é um tipo de variável não-primitivo, mas muito utilizado em Java. Todos os valores armazenados em uma string são tratados como texto, mesmo valores numéricos.
		String palavra = "Uma string"; //Sempre declarar com aspas duplas
	}

}

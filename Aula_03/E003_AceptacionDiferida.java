package Aula_03;

/*
 * Ejercicio - E003 
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Gale Shapley Algorithm - Aceptación diferida
 * Date	  : 27/09/2021
 */

public class E003_AceptacionDiferida {

	private int N, numParejas;
	private String[][] prefHombres;
	private String[][] prefMujeres;
	private String[] hombre;
	private String[] mujer;
	private String[] parejo; // pareja de la mujer
	private boolean[] hombreEmparejado;

	// constructor
	public E003_AceptacionDiferida(String[] h, String[] m, String[][] ph, String[][] pm) {
		N = ph.length; /* hombres sin pareja que no le hayan pedido salir a todas las mujeres */
		numParejas = 0; // contador de parejas
		hombre = h; // hombres --> /*h = Uno de esos hombres */
		mujer = m; // mujeres --> /*m = Primera mujer en la lista de h a quien todavía no le haya
					// pedido salir */
		prefHombres = ph; // orden de prioridad de los hombres hacia las mujeres
		prefMujeres = pm; // orden de prioridad de las mujeres hacia los hombres
		hombreEmparejado = new boolean[N]; // hombre emparejado
		parejo = new String[N]; // pareja de la mujer
		emparejar();
	}

	/* Inicialmente, todas las personas están sin pareja */
	private void emparejar() {
		 /* mientras queden hombres sin pareja */
		while (numParejas < N) {

			int sinP; // índice de hombres libres
			// itera hasta llegar al siguiente hombre sin pareja
			for (sinP = 0; sinP < N; sinP++) {

				System.out.println(hombre[sinP] + " está emparejado ? " + hombreEmparejado[sinP]);
				if (!hombreEmparejado[sinP])
					break; // si es que el hombre está emparejado se detiene, es decir ya no se busca
							// pareja para el
			}
			// asiganción de pareja para el hombre
			// mientras queden hombres sin pareja
			for (int i = 0; i < N && !hombreEmparejado[sinP]; i++) {

				System.out.println("\nSe reportan hombres sin pareja");
				String nombreMujer = prefHombres[sinP][i];
				int indice = indiceMujer(nombreMujer);
				System.out.println("La pareja que " + hombre[sinP] + " prefiere es " + nombreMujer);

				if (parejo[indice] != null) {
					System.out.println("pero, " + nombreMujer + " ya tiene pareja");
				}

				/* if (m está sin pareja) */
				if (parejo[indice] == null) { // si la mujer está sin pareja
					String x = mujer[indice];
					System.out.println("\t" + x + " está sin pareja");
					/* Añadir (h,m) a los emparejamientos */
					String y = hombre[sinP];
					System.out.println("\tEntonces " + x + " y " + y + " se vuelven pareja");
					parejo[indice] = y; // el hombre que estaba libre se convierte en la pareja de la mujer
					hombreEmparejado[sinP] = true;// entonces, el hombre ya no está soltero
					numParejas++; // y la cantidad de parejas aumenta o la cantidad de solteros disminuye
					System.out.println("--> El resumen de parejas hasta ahora es: ");
					imprimirParejas();
					System.out.println("-----------------------------------------------------------------------");
				} else {
					String currentPartner = parejo[indice];
					/* m prefiere a h frente a su pareja actual h1 */
					if (preferencia(currentPartner, hombre[sinP], indice)) {
						System.out.println("Sin embargo, " + hombre[sinP] + " tiene más preferencia que "
								+ currentPartner + "(pareja anterior)");
						/* Añadir (h,m) a los emparejamientos */
						System.out.println(
								"\tPor lo tanto, ahora " + mujer[indice] + " y " + hombre[sinP] + " se vuelven pareja");
						parejo[indice] = hombre[sinP];
						hombreEmparejado[sinP] = true;
						/* Dejar a h1 sin pareja */
						System.out.println("\t" + currentPartner + " aún no está emparejado");
						hombreEmparejado[indiceHombre(currentPartner)] = false;
						System.out.println("--> El resumen de parejas hasta ahora es: ");
						imprimirParejas();
						System.out.println("-----------------------------------------------------------------------");
					}
				}
			}
		}

		System.out.println("Bien hecho !!! ... \nTerminó de emparejar");

		System.out.println("----------------------------");
		System.out.println("Resumen final de parejas");
		System.out.println("----------------------------");
		imprimirParejas();
		System.out.println("----------------------------");
	}

	// Esta función verifica si la nueva pareja es más preferida frente a la
	// anterior
	private boolean preferencia(String parejaActual, String parejaNueva, int indice) {
		for (int i = 0; i < N; i++) {
			if (prefMujeres[indice][i].equals(parejaNueva))
				return true;
			if (prefMujeres[indice][i].equals(parejaActual))
				return false;
		}
		return false;
	}

	// Retorna el indice de los hombres
	private int indiceHombre(String str) {
		for (int i = 0; i < N; i++)
			if (hombre[i].equals(str))
				return i;
		return -1;
	}

	// Retorna el indice de las mujeres
	private int indiceMujer(String str) {
		for (int i = 0; i < N; i++)
			if (mujer[i].equals(str))
				return i;
		return -1;
	}

	// imprime las parejas
	public void imprimirParejas() {

		for (int i = 0; i < N; i++) {
			System.out.println("  * " + parejo[i] + " con " + mujer[i]);
		}
	}
}

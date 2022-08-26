/**
 * Resumen.
 * Objeto                   : SpringBootConfigServerApplication.java
 * Descripción              : Clase para iniciar el configserver.
 * Fecha de Creación        : 08/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              17/08/2022        Mario Vásquez           Realizar la creación de un método nuevo.
 */

package pe.com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Clase para iniciar el configserver.
 */
@EnableConfigServer
@SpringBootApplication
public class SpringBootConfigServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootConfigServerApplication.class, args);
	}

}

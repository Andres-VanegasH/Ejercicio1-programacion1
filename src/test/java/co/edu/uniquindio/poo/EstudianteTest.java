/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Prueba para verificar que todos los datos de un estudiante esten completos
     */

    @Test
    public void complete_data() {
        LOG.info("Iniciado test complete_data");
        var estudiante = new Estudiante("Andres", "Vanegas Henao", "andres@uq.com", "3226094267", "1007109560", (byte) 20);
        
        assertEquals("Andres", estudiante.getName());
        assertEquals("Vanegas Henao", estudiante.getLast_names());
        assertEquals("andres@uq.com", estudiante.getEmail());
        assertEquals("3226094267", estudiante.getCellphone());
        assertEquals("1007109560", estudiante.getId());
        assertEquals((byte)20, estudiante.getAge());

        LOG.info("Finalizando test complete_data");
    }

    /**
     * Prueba para verificar que todos los datos de un estudiante no estén nulos
     */

    @Test
    public void null_data(){
        LOG.info("Iniciado test null_data");
        
        assertThrows(Throwable.class, () -> new Estudiante(null, null, null, null, null, (byte) 18));

        LOG.info("Finalizando test null_data");
    }

    /**
     * Prueba para verificar que todos los datos de un estudiante no estén vacios
     */

    @Test
    public void void_data(){
        LOG.info("Iniciado test void_data");

        assertThrows(Throwable.class, () -> new Estudiante("", "", "", "", "", (byte) 18));

        LOG.info("Finalizando test void_data");
    }


    /**
     * Prueba para verificar que la edad de un estudiante no este negativa
     */

    @Test
    public void negative_age() {
        LOG.info("Inicio negative_age");
        assertThrows(Throwable.class, () -> new Estudiante("Camila", "Alzate Rios", "109453264",
                "camila@uniquindio.edu.co", "315635674", (byte) -18));
        Tester_negative_age tester = new Tester_negative_age();
        assertThrows(Throwable.class, tester);
        LOG.info("Finalización negative_age");
    }

    private static class Tester_negative_age implements Executable {
        @Override
        public void execute() throws Throwable {
            new Estudiante("Camila", "Alzate Rios", "109453264",
                    "camila@uniquindio.edu.co", "315635674", (byte) -18);
        }
    }



     /**
     * Prueba para verificar que el correo de un estudiante no este invalido
     */

    @Test
    public void invalid_email(){
        LOG.info("Iniciado test invalid_email");
        LOG.info("Finalizando test invalid_email");
    }
    
}

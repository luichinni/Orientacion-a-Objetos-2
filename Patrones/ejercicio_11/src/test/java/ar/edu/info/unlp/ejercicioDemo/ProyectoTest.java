package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
    private Proyecto pr;

    @BeforeEach
    void ProyectoSetup(){
        pr = new Proyecto("Vacaciones de Invierno", LocalDate.of(2024,7,15),LocalDate.of(2024,7,27) ,"Salir con amigos", 3, 10);
        pr.aprobarEtapa();
    }

    @Test
    void aprobarEtapaTest(){
        pr.aprobarEtapa();
        assertEquals(EtConfirmado.class,pr.getEtapa().getClass());
    }

    @Test
    void modifMargenGananciaTest(){
        assertEquals(385.2 , pr.getPrecio(),0.1);
        pr.modifMargenGanancia(0.12);
        assertEquals(403.2 , pr.getPrecio(),0.1);
    }

    @Test
    void cancelarProyectoTest(){
        pr.cancelarProyecto();
        assertEquals("Salir con amigos(Cancelado)", pr.getObjetivo());
    }

    @Test
    void getCostoTest(){
        assertEquals(360 , pr.getCosto(), 0.1);
    }

    @Test
    void getPrecioTest(){
        assertEquals(385.2 , pr.getPrecio(), 0.1);
    }
}

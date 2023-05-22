package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class BloqueoAutomaticoTest {
    private BloqueoAutomatico bloqueo;

    @Before
    public void setUp() {
        bloqueo = new BloqueoAutomatico();
    }

    @After
    public void tearDown() {
        bloqueo = null;
    }

    @Test
    public void testBloqueoAutomaticoDespuesDeTresIntentosFallidos() {
        assertFalse(bloqueo.estaBloqueado());

     
        bloqueo.intentoFallido("contraseña_orrecta");
        assertFalse(bloqueo.estaBloqueado());
        bloqueo.intentoFallido("contraseñaCorrecta");
        assertFalse(bloqueo.estaBloqueado());
        bloqueo.intentoFallido("contraseñaCVorrecta");
        assertFalse(bloqueo.estaBloqueado());
        bloqueo.intentoFallido("contraseñaCoVrrecta");
        assertFalse(bloqueo.estaBloqueado());
        bloqueo.intentoFallido("contraseña_orrecta");
        assertTrue(bloqueo.estaBloqueado());
    }
}


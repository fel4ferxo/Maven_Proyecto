package com.example;


public class BloqueoAutomatico {
    private int intentosFallidos;
    private boolean bloqueado;

    public BloqueoAutomatico() {
        intentosFallidos = 0;
        bloqueado = false;
    }

    public void intentoFallido(String contraseñaIngresada) {
        if (contraseñaIngresada.equals("contraseñaCorrecta")) {
            intentosFallidos = 0; // Reiniciar los intentos fallidos si se ingresa la contraseña correcta
        } else {
            intentosFallidos++;
            if (intentosFallidos >= 3) {
                bloqueado = true;
            }
        }
    }

    public boolean estaBloqueado() {
        return bloqueado;
    }
}
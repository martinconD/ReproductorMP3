package mispracticas;

import ReproductorM.ReproductorMP3;

public class Mispracticas {

    public static void main(String[] args) {
        // Al estar en una clase común sin herencias, Java no se pondrá estricto con los módulos
        java.awt.EventQueue.invokeLater(() -> {
            try {
                ReproductorMP3 ventana = new ReproductorMP3();
                ventana.setVisible(true);
            } catch (Exception e) {
                System.out.println("Error al inicializar la ventana: " + e.getMessage());
            }
        });
    }
}
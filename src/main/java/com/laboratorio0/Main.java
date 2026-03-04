package com.laboratorio0;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Daniel Reis", "d169250@dac.unicamp.br");
        Usuario u2 = new Usuario("Carlos", "carlos@email.com"); // Perfil do chefe

        Chefe chefe = new Chefe(u2);
        Tarefa t1 = new Tarefa("Revisão de Código");

        chefe.direcionarTarefa(t1, u1);
        System.out.println("Dados do Chefe: " + chefe.getNome() + " (" + chefe.getEmail() + ")");
    }
}

package com.example.proyecto.ranking;

class Ranking {
    String photoURL;
    int position;
    int retos_completados;
    int pasos_dados;
    double kilometros;

    Ranking() { }

    Ranking(String photoURL, int position, int retos_completados, int pasos_dados, double kilometros) {
        this.photoURL = photoURL;
        this.position = position;
        this.retos_completados = retos_completados;
        this.pasos_dados = pasos_dados;
        this.kilometros = kilometros;
    }

    public int getPasos_dados() {
        return pasos_dados;
    }
}

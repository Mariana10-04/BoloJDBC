package com.example.demo.models;
// models = representacao do banco de dados em forma de obj
public class Bolo {
    private int id;
    private String cobertuta;
    private String recheio;
    private String cor;

                //parametro do construtor
    public Bolo(String cobertuta, String recheio, String cor) {
        this.cobertuta = cobertuta;
        this.recheio = recheio;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCobertuta() {
        return cobertuta;
    }

    public void setCobertuta(String cobertuta) {
        this.cobertuta = cobertuta;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

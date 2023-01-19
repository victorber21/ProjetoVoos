package br.com.voos.entities;

import java.io.Serializable;

public class VoosRepository implements Serializable {
    private static final long serialVersionUID = 1L;
    private String numeroVoo;
    private String aeroOrigem;
    private String aeroDestino;
    private double data;
    private double horarioSaida;
    private double horarioChegada;
    private double preco;

    public VoosRepository() {
    }

    public VoosRepository(String numeroVoo, String aeroOrigem, String aeroDestino, double data, double horarioSaida, double horarioChegada, double preco) {
        this.numeroVoo = numeroVoo;
        this.aeroOrigem = aeroOrigem;
        this.aeroDestino = aeroDestino;
        this.data = data;
        this.horarioSaida = horarioSaida;
        this.horarioChegada = horarioChegada;
        this.preco = preco;
    }

    public VoosRepository(String[] numeroVoo, String[] aeroOrigem, String[] aeroDestino, Double data, Double horarioSaida, Double horarioChegada, Double preco) {
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getAeroOrigem() {
        return aeroOrigem;
    }

    public void setAeroOrigem(String aeroOrigem) {
        this.aeroOrigem = aeroOrigem;
    }

    public String getAeroDestino() {
        return aeroDestino;
    }

    public void setAeroDestino(String aeroDestino) {
        this.aeroDestino = aeroDestino;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public double getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(double horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public double getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(double horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

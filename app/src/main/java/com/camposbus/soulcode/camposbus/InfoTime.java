package com.camposbus.soulcode.camposbus;

/**
 * Created by henriquedealmeida on 20/03/17.
 */

public class InfoTime {
    /*falta lidar com entrada do tempo restante e construtor*/

    private String linhaNome, tempoRestante;

    public InfoTime(String nome, String tempo){
        linhaNome = nome;
        tempoRestante = tempo;
    }

    public String getLinhaNome(){
        return linhaNome;
    }

    public String getTempoRestante(){
        return tempoRestante;
    }
}

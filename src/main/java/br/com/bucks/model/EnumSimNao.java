/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bucks.model;

/**
 *
 * @author La Laina
 */

public enum EnumSimNao {

    Sim("S"), Não("N");

    private String cd;
    private String descr;

    EnumSimNao(String cd) {
        this.cd = cd;
    }

    public String getCd() {
        return cd;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

}

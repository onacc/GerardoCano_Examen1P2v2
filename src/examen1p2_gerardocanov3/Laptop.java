/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_gerardocanov3;

/**
 *
 * @author gcano
 */
public class Laptop extends PC {
    protected String marca , res, RGB;

    public Laptop(String marca, String res, String RGB) {
        this.marca = marca;
        this.res = res;
        this.RGB = RGB;
    }

    public Laptop() {
    super();
    }

    public Laptop(String marca, String res, String RGB, String ip, String mask, String hostname) {
        super(ip, mask, hostname);
        this.marca = marca;
        this.res = res;
        this.RGB = RGB;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return super.toString() + "Marca: " + marca +"\n"+ "Definicion de pantalla:" + res +"\n"+ "Teclado RGB:" + RGB ;
    }
    
}

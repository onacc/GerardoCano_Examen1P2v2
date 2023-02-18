/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_gerardocanov3;

/**
 *
 * @author gcano
 */
public class Desktop extends PC {
private int ram, storage;
private String tiposto, Gpu;

    public Desktop(int ram, int storage, String tiposto, String Gpu) {
        this.ram = ram;
        this.storage = storage;
        this.tiposto = tiposto;
        this.Gpu = Gpu;
    }

    public Desktop(int ram, int storage, String tiposto, String Gpu, String ip, String mask, String hostname) {
        super(ip, mask, hostname);
        this.ram = ram;
        this.storage = storage;
        this.tiposto = tiposto;
        this.Gpu = Gpu;
    }
    
    public Desktop() {
        super();
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getTiposto() {
        return tiposto;
    }

    public void setTiposto(String tiposto) {
        this.tiposto = tiposto;
    }

    public String getGpu() {
        return Gpu;
    }

    public void setGpu(String Gpu) {
        this.Gpu = Gpu;
    }

    @Override
    public String toString() {
        return super.toString() + "RAM: " + ram +"\n"+ "Storage " + storage +"\n"+ "Storage type" + tiposto +"\n"+ "GPU" + Gpu;
    }
    

}

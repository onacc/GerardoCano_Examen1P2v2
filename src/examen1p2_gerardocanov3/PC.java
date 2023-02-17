/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_gerardocanov3;

/**
 *
 * @author gcano
 */
public class PC {
    protected String ip , mask, hostname;

    public PC(String ip, String mask, String hostname) {
        this.ip = ip;
        this.mask = mask;
        this.hostname = hostname;
    }

    public PC() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "PC{" + "ip=" + ip + ", mask=" + mask + ", hostname=" + hostname + '}';
    }
    
}

package com.adriancostaiv.libs.data.dto;

import java.util.ArrayList;
import java.util.List;

public class BalDTO {
    List<String> lbals = new ArrayList<>();

    String bal1;
    String bal2;
    String bal3;
    String bal4;
    String bal5;
    String sbal;

    public String getBal1() {
        return bal1;
    }

    public void setBal1(String bal1) {
        this.bal1 = bal1;
    }

    public String getBal2() {
        return bal2;
    }

    public void setBal2(String bal2) {
        this.bal2 = bal2;
    }

    public String getBal3() {
        return bal3;
    }

    public void setBal3(String bal3) {
        this.bal3 = bal3;
    }

    public String getBal4() {
        return bal4;
    }

    public void setBal4(String bal4) {
        this.bal4 = bal4;
    }

    public String getBal5() {
        return bal5;
    }

    public void setBal5(String bal5) {
        this.bal5 = bal5;
    }

    public String getSbal() {
        return sbal;
    }

    public void setSbal(String sbal) {
        this.sbal = sbal;
    }

    public void addBal(String bal){
        if(lbals.size()==6){
            lbals = new ArrayList<>();
        }
        lbals.add(bal);
        for(int i=0;i<lbals.size();i++){
            switch (i){
                case 0:
                    setBal1(lbals.get(i));
                    break;
                case 1:
                    setBal2(lbals.get(i));
                    break;
                case 2:
                    setBal3(lbals.get(i));
                    break;
                case 3:
                    setBal4(lbals.get(i));
                    break;
                case 4:
                    setBal5(lbals.get(i));
                    break;
                case 5:
                    setSbal(lbals.get(i));
                    break;
                default:
                    break;
            }
        }

    }

    public boolean isEmpty(){
        return (
                bal1==null ||
                bal2==null ||
                bal3==null ||
                bal4==null ||
                bal5==null ||
                sbal==null
                );
    }

    @Override
    public String toString() {
        return
            bal1 + "," +
            bal2 + "," +
            bal3 + "," +
            bal4 + "," +
            bal5 + "," +
            sbal + "\r\n";
    }
}

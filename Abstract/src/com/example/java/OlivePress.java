package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

public class OlivePress implements Press {
    private int currentoil;
    public int getOil(List<Olive> olives){
        int totalOil = currentoil;
        for (Olive o : olives){
            totalOil += o.crush();
        }
        return totalOil;
    }

    @Override
    public void setOil(int oil) {
        currentoil = oil;
    }

}

package android.fasa.edu.br.sanelibras.model;

import android.fasa.edu.br.sanelibras.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pcego on 10/08/18.
 */

public class Sinal {

    private String letra;
    private int img;


    public Sinal(String letra, int img){

        this.letra = letra;
        this.img = img;
    }


    public String getLetra() {
        return letra;
    }

    public int getImg() {
        return img;
    }
}

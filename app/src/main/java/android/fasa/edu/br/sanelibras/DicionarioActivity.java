package android.fasa.edu.br.sanelibras;

import android.fasa.edu.br.sanelibras.adapter.BasicAdapter;
import android.fasa.edu.br.sanelibras.model.Sinal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DicionarioActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

    private ListView listaDicionario;
    private List<Sinal> sinais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicionario);

        listaDicionario = findViewById(R.id.lista_dicionario);
        sinais = new ArrayList<Sinal>();
        sinais.add(new Sinal());
        listaDicionario.setAdapter(new BasicAdapter(this, sinais));
        listaDicionario.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

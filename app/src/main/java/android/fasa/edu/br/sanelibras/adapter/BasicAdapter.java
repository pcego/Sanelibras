package android.fasa.edu.br.sanelibras.adapter;

import android.content.Context;
import android.fasa.edu.br.sanelibras.model.Sinal;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pcego on 10/08/18.
 */

public class BasicAdapter extends BaseAdapter {

    private Context context;
    private List<Sinal> sinais = new ArrayList<>();

    public BasicAdapter(Context context, List<Sinal> sinais){
        super();
        this.sinais = sinais;
        this.context = context;
    }

    @Override
    public int getCount() {
        return sinais.size();
    }

    @Override
    public Object getItem(int position) {
        return sinais.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView txtLetra = new TextView(context);
        float dip = 50;
        float densidade = context.getResources().getDisplayMetrics().density;
        int px = (int) (dip * densidade + 0.5f);
        txtLetra.setHeight(px);
        // texto que irá aparecer em cada elemento do ListView
        txtLetra.setText("Letra A");

        return txtLetra;

    }
}

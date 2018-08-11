package android.fasa.edu.br.sanelibras.adapter;

import android.content.Context;
import android.fasa.edu.br.sanelibras.R;
import android.fasa.edu.br.sanelibras.model.Sinal;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pcego on 10/08/18.
 */

public class BasicAdapter extends BaseAdapter {

    private Context context;
    private List<Sinal> sinais = new ArrayList<Sinal>();

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

        View view = LayoutInflater.from(context).
                inflate(R.layout.adapter_letra,
                        parent, false);

        TextView txtLetra = (TextView) view.findViewById(R.id.letra);
        ImageView imgSinal = (ImageView) view.findViewById(R.id.img_sinal);
        Sinal sinal = sinais.get(position);

        txtLetra.setText(sinal.getLetra());
        imgSinal.setImageResource(sinal.getImg());

        return view;

    }
}

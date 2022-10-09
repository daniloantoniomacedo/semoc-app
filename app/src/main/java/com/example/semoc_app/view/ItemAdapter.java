package com.example.semoc_app.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.semoc_app.R;
import com.example.semoc_app.model.Item;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    private List<Item> itens;
    private Context context;

    public ItemAdapter(Context context, List<Item> lista){
        this.itens = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int i) {
        return itens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(com.example.semoc_app.R.layout.item_list_item,viewGroup,false);
        }
        Item item = itens.get(i);

        //pegando as referências das Views
        TextView nome = (TextView) view.findViewById(R.id.item_list_nome);
        TextView descricao = (TextView) view.findViewById(R.id.item_list_local);
        TextView dataHora = (TextView) view.findViewById(R.id.item_list_data_hora);

        //populando as Views
        nome.setText(item.getNome());
        descricao.setText(item.getLocal());
        dataHora.setText(item.getDataHora());

        return view;
    }
}

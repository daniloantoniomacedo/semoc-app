package com.example.semoc_app.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Item implements Parcelable {

    private int id;

    private String nome;

    private String local;

    private String dataHora;

    private String descricao;

    private String convidados;

    private static final String LOREN_DESCRICAO_1 = "Eos sapiente eveniet et eveniet voluptatum sit corrupti totam hic velit blanditiis est vero quas eos dicta voluptatem! Sit commodi iusto eum doloremque velit sed vero accusantium ab omnis internos est illum delectus nam rerum debitis. Quo sapiente nesciunt vel itaque quia in magni dolorem! Vel nihil dolore et itaque ratione ab velit enim ut repudiandae autem ut eaque molestiae.";
    private static final String LOREN_DESCRICAO_2 = "Aut illum voluptatibus ut velit rerum aut quidem quis non sunt voluptatem qui rerum sunt ut rerum laborum 33 facilis voluptatum. Rem possimus internos et galisum tempore quibusdam Quis et magnam dolorem et molestiae nemo. Est velit consectetur ab maiores quam ut amet quaerat.";

    private static final String CONVIDADOS_1 = "Profa. Dra. Fulana de Tal (UCSAL) e Prof. Dr. Fulano de tal (UCSAL) ";
    private static final String CONVIDADOS_2 = "Fulano de Araujo (UCSAL) e Alguém Duarte (UCSAL) ";

    public Item() {
        super();
    }

    public Item(int id, String nome, String local, String dataHora, String descricao, String convidados) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.convidados = convidados;
    }

    protected Item(Parcel in) {
        id = in.readInt();
        nome = in.readString();
        local = in.readString();
        dataHora = in.readString();
        descricao = in.readString();
        convidados = in.readString();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    public static List<Item> criarLista(){
        List<Item> list = new ArrayList<Item>();

        Item item1 = new Item(1, "ABERTURA", "AUDITÓRIO TÉRREO - BLOCO A", "17/10 - 18h30 às 21h", LOREN_DESCRICAO_1, CONVIDADOS_1);
        Item item2 = new Item(2, "Bioética e Relação Médico-Paciente", "AUDITÓRIO TÉRREO - BLOCO A", "18/10 - 09:30 às 12h", LOREN_DESCRICAO_2, CONVIDADOS_2);
        Item item3 = new Item(3, "Acessibilidade em Escolas Municipais: ir, estar e voltar", "SALA 202 - BLOCO B", "18/10 - 09:30 às 12h", LOREN_DESCRICAO_1, CONVIDADOS_1);
        Item item4 = new Item(4, "Primeira infância primeiro", "AUDITÓRIO DA PÓS", "18/10 - 09:30 às 12h", LOREN_DESCRICAO_2, CONVIDADOS_2);
        Item item5 = new Item(5, "Povos tradicionais e o direito ao território", "ONLINE - YouTube - UCSAL Oficial", "18/10 - 09:30 às 12h", LOREN_DESCRICAO_1, CONVIDADOS_1);
        Item item6 = new Item(6, "Políticas Públicas e Promoção das Capacidades", "AUDITÓRIO DA PÓS", "21/10 - 09:30 às 12h", LOREN_DESCRICAO_1, CONVIDADOS_1);
        Item item7 = new Item(7, "Arbitragem Empresarial e Acesso à Justiça", "SALA 201 - BLOCO B", "21/10 - 09:30 às 12h", LOREN_DESCRICAO_2, CONVIDADOS_2);
        Item item8 = new Item(8, "Inclusão social: o reverso da exclusão social?", "ONLINE - YouTube - UCSAL Oficial", "21/10 - 20:30 às 22h", LOREN_DESCRICAO_1, CONVIDADOS_1);

        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        list.add(item6);
        list.add(item7);
        list.add(item8);

        return list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConvidados() {
        return convidados;
    }

    public void setConvidados(String convidados) {
        this.convidados = convidados;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(nome);
        parcel.writeString(local);
        parcel.writeString(dataHora);
        parcel.writeString(descricao);
        parcel.writeString(convidados);

    }
}

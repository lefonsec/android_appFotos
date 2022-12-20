package com.empresa.appdefotos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.empresa.appdefotos.R;
import com.empresa.appdefotos.model.Postagem;

import java.util.List;

public class PostagemAdapter  extends RecyclerView.Adapter<PostagemAdapter.MyHolderView> {

    private List<Postagem> postagens;
    public PostagemAdapter(List<Postagem> listaPostagem) {
        this.postagens = listaPostagem;
    }

    @NonNull
    @Override
    public MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postage_detalhe, parent, false);

        return new MyHolderView(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolderView holder, int position) {
        Postagem postagem = postagens.get(position);
        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imagemPostagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyHolderView extends RecyclerView.ViewHolder{
        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagemPostagem;

        public MyHolderView(@NonNull View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagemPostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}

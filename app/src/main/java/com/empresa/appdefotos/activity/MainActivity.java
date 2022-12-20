package com.empresa.appdefotos.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.empresa.appdefotos.R;
import com.empresa.appdefotos.adapter.PostagemAdapter;
import com.empresa.appdefotos.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //define Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        // define adapter
        this.carregarPostagem();
        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter(adapter);
    }

    public void carregarPostagem() {
        Postagem post = new Postagem("Leonardo Fonseca", "#Viagem legal", R.drawable.imagem1);
        this.postagens.add(post);
        post = new Postagem("Cafu", "#Viagem legal", R.drawable.imagem2);
        this.postagens.add(post);
        post = new Postagem("Neymar", "#Viagem legal", R.drawable.imagem3);
        this.postagens.add(post);
        post = new Postagem("Ronaldo", "#Viagem legal", R.drawable.imagem4);
        this.postagens.add(post);

    }
}
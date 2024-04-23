package com.example.meumercado.model

//DUVIDA PROFESSOR
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meumercado.Adapter.Adapterproduto
import com.example.meumercado.model.produto


data class produto(
    val foto: Int,
    val nome: String,
    val descricao: String,
    val preco: String
)
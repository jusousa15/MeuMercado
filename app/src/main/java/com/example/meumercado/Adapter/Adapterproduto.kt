package com.example.meumercado.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.meumercado.R
import com.example.meumercado.model.produto
import kotlin.coroutines.coroutineContext

class Adapterproduto(private val context: Context, private val produto: MutableList<produto>) : RecyclerView.Adapter<Adapterproduto.ProdutoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
       val itemLista = LayoutInflater.from(context).inflate(R.layout.produtos_item, parent, false)
        val holder = ProdutoViewHolder(itemLista)
        return holder

    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.foto.setImageResource(produto[position].foto)
        holder.nome.text = produto[position].nome
        holder.descricao.text = produto[position].descricao
        holder.preco.text = produto[position].preco


    }
    override fun getItemCount(): Int = produto.size



    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val foto = itemView.findViewById<ImageView>(R.id.fotoProduto)
        val nome= itemView.findViewById<TextView>(R.id.nomeProduto)
        var descricao = itemView.findViewById<TextView>(R.id.descriçãoProduto)
        var preco = itemView.findViewById<TextView>(R.id.precoProduto)
    }}

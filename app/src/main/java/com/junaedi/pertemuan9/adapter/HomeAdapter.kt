package com.junaedi.pertemuan9.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.junaedi.pertemuan9.R
import com.junaedi.pertemuan9.databinding.UserListBinding
import com.junaedi.pertemuan9.model.request.DataMahasiswa

class HomeAdapter(private var dataMhs : List<DataMahasiswa>)
    : RecyclerView.Adapter<HomeAdapter.ViewHolder>(){
    class ViewHolder(val binding : UserListBinding) :
        RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int): ViewHolder {
        val view =
            UserListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
        return dataMhs.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtNama.text = dataMhs[position].nama
        holder.binding.txtNim.text = dataMhs[position].nIM
        holder.binding.txtTelepon.text = dataMhs[position].telepon
        holder.binding.cardView.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nim",dataMhs[position].nIM)
            bundle.putString("nama",dataMhs[position].nama)
            bundle.putString("telepon",dataMhs[position].telepon)

            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_detailFragment,bundle)
        }


    }
}

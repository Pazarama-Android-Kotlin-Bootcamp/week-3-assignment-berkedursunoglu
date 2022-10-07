package com.berkedursunoglu.thirdassingment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.berkedursunoglu.thirdassingment.R
import com.berkedursunoglu.thirdassingment.databinding.BookListRvRawBinding
import com.berkedursunoglu.thirdassingment.interfaces.onClick
import com.berkedursunoglu.thirdassingment.models.BookModel
import com.berkedursunoglu.thirdassingment.setImage
import com.bumptech.glide.Glide

class BookListAdapter(val listener:onClick): RecyclerView.Adapter<BookListViewHolder>() {

    private var arrayList =  ArrayList<BookModel>()
    private lateinit var binding: BookListRvRawBinding

    fun addArray(bookList: MutableList<BookModel>){
        arrayList.clear()
        arrayList.addAll(bookList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = DataBindingUtil.inflate<BookListRvRawBinding>(inflater, R.layout.book_list_rv_raw,parent,false)
        return BookListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BookListViewHolder, position: Int) {
        binding.bookModel = arrayList[position]
        binding.ivBookImage.setImage(holder.itemView.context,arrayList[position].drawable,binding.ivBookImage)

        holder.itemView.setOnClickListener {
            listener.onClick(arrayList[position])
        }

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}

class BookListViewHolder(binding: BookListRvRawBinding):RecyclerView.ViewHolder(binding.root) {

}

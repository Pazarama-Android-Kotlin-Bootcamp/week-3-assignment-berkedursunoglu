package com.berkedursunoglu.thirdassingment.views

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.berkedursunoglu.thirdassingment.R
import com.berkedursunoglu.thirdassingment.adapter.BookListAdapter
import com.berkedursunoglu.thirdassingment.databinding.FragmentBookListBinding
import com.berkedursunoglu.thirdassingment.interfaces.onClick
import com.berkedursunoglu.thirdassingment.models.BookModel
import com.berkedursunoglu.thirdassingment.models.bookArrayList
import com.bumptech.glide.Glide


class BookListFragment : Fragment(),onClick {

    private lateinit var binding: FragmentBookListBinding
    private lateinit var listAdapter:BookListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_book_list, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Init recyclerview
        binding.bookListRv.layoutManager = GridLayoutManager(requireContext(), 2)
        listAdapter = BookListAdapter(this@BookListFragment)
        listAdapter.addArray(bookArrayList)
        binding.bookListRv.adapter = listAdapter
        binding.tvShowSize.text = bookArrayList.size.toString()

    }

    private fun bookListToDetailFragment(book:BookModel) {
        //Navigate between tow fragments
        findNavController().navigate(R.id.action_bookListFragment_to_bookDetailFragment,Bundle().apply {
            putString("model",book.toJson())
        })
    }

    override fun onClick(model: BookModel) {
        //RecyclerView itemView interface clicked
        bookListToDetailFragment(model)
    }

}
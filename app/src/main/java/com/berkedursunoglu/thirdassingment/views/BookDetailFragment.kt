package com.berkedursunoglu.thirdassingment.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.berkedursunoglu.thirdassingment.R
import com.berkedursunoglu.thirdassingment.databinding.FragmentBookDetailBinding
import com.berkedursunoglu.thirdassingment.models.BookModel
import com.berkedursunoglu.thirdassingment.setImage
import com.bumptech.glide.Glide

class BookDetailFragment : Fragment() {

    private lateinit var binding: FragmentBookDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //Init data binding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_book_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Get variables from navigation component
        arguments.let {
            val bookModel = it?.getString("model")
            if (bookModel!= null) {
                Log.d("Model",BookModel.fromJson(bookModel).toString())
                val json = BookModel.fromJson(bookModel)
                binding.bookModel = json
                binding.ivBookImage.setImage(requireContext(),json.drawable,binding.ivBookImage)
            }
        }

        binding.backAction.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}
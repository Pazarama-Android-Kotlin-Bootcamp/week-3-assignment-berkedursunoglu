package com.berkedursunoglu.thirdassingment

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide


fun ImageView.setImage(context: Context,drawable:Int,iv:ImageView){
    Glide.with(context).load(drawable).into(iv)
}
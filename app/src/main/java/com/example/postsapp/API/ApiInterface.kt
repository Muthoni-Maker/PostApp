package com.example.postsapp.API

import android.renderscript.Sampler
import com.example.postsapp.Models.post

interface ApiInterface {
    @GET ("post")
        suspend fun getpost():Response<List<post>>
}

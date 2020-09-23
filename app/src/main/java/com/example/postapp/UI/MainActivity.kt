package com.example.postapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.postapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val postsRepository = PostsRepository()
    postsViewModelFactory =PostsViewModelFactory(postsRepository)
    postsViewModel =
    ViewModelProvider(owner:this, postsViewModelFactory).get(postsViewModel::
    class.java)
    postsViewModel.getPosts()
    postsViewModel.postsLiveData.observe(owner:this, Observer
    { postsList-> })

    Tost.makeText(baseContext, text: "&{postsList.size} posts fetched", Tost.LENGTH_LONG).show()
})

postsViewModel.postsFailedLiveData.observe(owner:this, Observer{ error->
 Toast.makeText(baseContext, error, Toast.LENGTH_LONG).show()
})
}
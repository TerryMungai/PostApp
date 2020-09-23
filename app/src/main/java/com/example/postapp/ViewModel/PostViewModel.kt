package com.example.postapp.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.postapp.Models.Post
import com.example.postapp.Repository.PostRepository

class PostViewModel {val postRepository: PostRepository): ViewModel() {
    var postLiveData = MutableLiveData<List<Post>>()
    var postLiveData = MutableLiveData<String>()
    
    fun getPosts(){
        viewModelScope.launch {this.coroutineScope
            val response = postsRepository.getPosts()
            if (response.isSuccessful){
                postLiveData.postValue(response.body())
            }
            else{
                postsFailedLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}

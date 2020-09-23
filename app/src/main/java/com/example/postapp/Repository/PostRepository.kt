package com.example.postapp.Repository

import com.example.postapp.Models.Post

class PostRepository {
    suspend fun getPosts(): Response<List<posbt>> = withContext(Dispatches.10){this.CoroutineScope}
    val apiInterface = ApiClient.buildService(ApiInterface::class.java)
    val response = apiInterface.getPosts()
    if(response.isSuccessful){
        val posts = response.body() as List<Post>
        savePosts(posts)
    }
    return@withCountext response
}

suspend fun savePosts(postsList: List<Post>) = withContext(Dispatchers.10){this.CoroutineScope}
val database =PostAppDatabase.getDbInstance(PostApp.appContext)
postsList.forEach {post->
database.postDao().insertpost(post)
}
}
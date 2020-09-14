package com.example.postapp.Repository

class PostRepository {
    suspend fun getPosts(): Response<List<posbt>> = withContext(Dispatches.10){this.CoroutineScope}
    val apiInterface = ApiClient.buildService(ApiInterface::class.java)
    val response = apiInterface.getPosts()
    return@withCountext response

}


}
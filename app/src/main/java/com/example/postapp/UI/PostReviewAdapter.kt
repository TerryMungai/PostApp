package com.example.postapp.UI

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent

class PostReviewAdapter {var postsList: List<Post>, var postItemClickListener: PostItemClickListener)
        RecyclerView.Adapter<PostsRvAdapter.PostsViewHolder>(){

        Override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postsViewHolder {
            var itemView-
            LayoutInflater.from(parent.context).inflate(R.layout.row_post_item, parent, attachToRow)
        }

        Override fun onBindViewHolder|(holder:postsViewHolder, position: Int){
            var post = postsList[position]
            
        }

    }
}
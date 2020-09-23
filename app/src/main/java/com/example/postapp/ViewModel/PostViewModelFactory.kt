package com.example.postapp.ViewModel

import androidx.lifecycle.ViewModel
import java.lang.IllegalArgumentException

class PostViewModelFactoryr {val postsRepository: postsRepository) : ViewModelProvider.Factory
    {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(postsViewModel::class.java)) {
                return postsViewModel(postsRepository) as T
            }
            throw IllegalArgumentException("Unknown viewModel class")
        }
    }
}
}
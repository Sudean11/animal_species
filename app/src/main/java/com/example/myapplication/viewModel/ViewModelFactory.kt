package com.example.myapplication.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.dao.AnimalDao

class ViewModelFactory(private val animalDao: AnimalDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AnimalViewModel::class.java)) {
            return AnimalViewModel(animalDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
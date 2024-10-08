package com.example.retrofit.data

import com.example.retrofit.data.model.Product
import com.example.retrofit.data.model.Products
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
}
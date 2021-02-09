package com.example.nasaspace.mvp.model.api

import com.example.nasaspace.mvp.model.entity.Collection
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

private const val API_KEY = "6btQNFeRwmKUeI5my2buhvdrcO5N2Oak84RjChoX"

interface IDataSource {
    @GET("/search?q=nebula")
    fun getNebula(): Single<Collection>
}
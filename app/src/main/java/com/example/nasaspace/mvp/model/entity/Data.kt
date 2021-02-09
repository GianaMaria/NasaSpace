package com.example.nasaspace.mvp.model.entity

import android.os.Parcelable
import com.google.gson.annotations.Expose
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    @Expose val photographer: String,
    @Expose val description: String,
    @Expose val location: String,
    @Expose val nasa_id: String,
    @Expose val album: List<String>,
    @Expose val media_type: String,
    @Expose val center: String,
    @Expose val title: String,
    @Expose val date_created: String,
    @Expose val keywordswords: List<String>
) : Parcelable
package com.example.nasaspace.mvp.model.entity

import android.os.Parcelable
import com.google.gson.annotations.Expose
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Items(
    @Expose val data: List<Data>,
    @Expose val links: List<Links>,
    @Expose val href: String
) : Parcelable
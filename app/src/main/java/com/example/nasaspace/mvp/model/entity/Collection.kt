package com.example.nasaspace.mvp.model.entity

import android.os.Parcelable
import com.google.gson.annotations.Expose
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Collection(
    @Expose val metadata: Metadata,
    @Expose val items: List<Items>,
    @Expose val links: List<Links>,
    @Expose val version: Double,
    @Expose val href: String
) : Parcelable
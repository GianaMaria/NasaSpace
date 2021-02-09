package com.example.nasaspace.mvp.model.entity

import android.os.Parcelable
import com.google.gson.annotations.Expose
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Metadata(
    @Expose val total_hits: Int
) : Parcelable
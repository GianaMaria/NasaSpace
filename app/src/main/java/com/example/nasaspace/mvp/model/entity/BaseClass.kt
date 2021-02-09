package com.example.nasaspace.mvp.model.entity

import android.os.Parcelable
import com.google.gson.annotations.Expose
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BaseClass(
    @Expose val collection: Collection
) : Parcelable
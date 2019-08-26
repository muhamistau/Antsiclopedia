package com.islam.antsiclopedia.entity

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
@SuppressLint("ParcelCreator")
data class Ant(
    val name: String,
    val latin: String,
    val description: String,
    val imageUrl: String
) : Parcelable
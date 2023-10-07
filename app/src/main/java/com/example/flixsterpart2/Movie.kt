package com.example.flixsterpart2

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class Movie(
    @SerialName("title")
    val title: String?,
    @SerialName("overview")
    val overview: String?,
    @SerialName("poster_path")
    val posterPath: String?,
) : java.io.Serializable {
    val posterPathUrl = "https://image.tmdb.org/t/p/w500${posterPath?.firstOrNull()}"
}

@Keep
@Serializable
data class BaseResponse(
    @SerialName("results")
    val results: List<Movie>?
) : java.io.Serializable

//class Movie {
//    @JvmField
//    @SerializedName("title")
//    var title: String? = null
//
//    @JvmField
//    @SerializedName("overview")
//    var overview: String? = null
//
//    @JvmField
//    @SerializedName("poster_path")
//    var poster_path: String? = null
//}
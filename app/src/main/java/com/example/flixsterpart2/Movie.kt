package com.example.flixsterpart2

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//@Keep
//@Serializable
//data class Movie(
//    @SerialName("title")
//    val title: String?,
//    @SerialName("overview")
//    val overview: String?,
//    @SerialName("pupularity")
//    val popularity: String?,
//    @SerialName("release_date")
//    val release_date: String?,
//    @SerialName("poster_path")
//    val posterPath: String?
//) : java.io.Serializable {
//    val posterPathUrl = "https://image.tmdb.org/t/p/w500/${posterPath}"
//}
//
//@Keep
//@Serializable
//data class BaseResponse(
//    @SerialName("results")
//    val results: List<Movie>?
//) : java.io.Serializable

@Keep
@Serializable
class Movie (
    @JvmField
    @SerializedName("title")
    var title: String? = null,

    @JvmField
    @SerializedName("overview")
    var overview: String? = null,

    @JvmField
    @SerializedName("poster_path")
    var posterPath: String? = null,

    @JvmField
    @SerializedName("release_date")
    val releaseDate: String? = null,

    @JvmField
    @SerializedName("popularity")
    val popularity: String? = null,
) : java.io.Serializable
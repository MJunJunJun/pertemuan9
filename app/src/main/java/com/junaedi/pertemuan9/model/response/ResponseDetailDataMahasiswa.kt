package com.junaedi.pertemuan9.model.response


import com.google.gson.annotations.SerializedName
import com.junaedi.pertemuan9.model.request.DetailDataMahasiswa

data class ResponseDetailDataMahasiswa(
    @SerializedName("data")
    val data: DetailDataMahasiswa,
    @SerializedName("status")
    val status: String
)
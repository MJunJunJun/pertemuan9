package com.junaedi.pertemuan9.model.response


import com.google.gson.annotations.SerializedName

data class ResponseDataUpdateMahasiswa(
    @SerializedName("data")
    val data: String,
    @SerializedName("status")
    val status: String
)
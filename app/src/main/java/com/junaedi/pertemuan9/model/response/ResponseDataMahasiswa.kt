package com.junaedi.pertemuan9.model.response


import com.google.gson.annotations.SerializedName
import com.junaedi.pertemuan9.model.request.DataAllMahasiswa

data class ResponseDataMahasiswa(
    @SerializedName("data")
    val data: List<DataAllMahasiswa>,
    @SerializedName("status")
    val status: String
)
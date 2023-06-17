package com.junaedi.pertemuan9.network

import com.junaedi.pertemuan9.model.request.Mahasiswa
import com.junaedi.pertemuan9.model.response.ResponseAddDataMahasiswa
import com.junaedi.pertemuan9.model.response.ResponseDataMahasiswa
import com.junaedi.pertemuan9.model.response.ResponseDataUpdateMahasiswa
import com.junaedi.pertemuan9.model.response.ResponseDeletDataMahasiswa
import com.junaedi.pertemuan9.model.response.ResponseDetailDataMahasiswa
import retrofit2.Call
import retrofit2.http.*


interface ApiService {


    @GET("datamahasiswa/")
    fun getDataMahasiswa() : Call<ResponseDataMahasiswa>

    @GET("datamahasiswa/{nim}")
    fun getDetailMahasiswa(@Path("nim") nim : String) : Call<ResponseDetailDataMahasiswa>

    @POST("datamahasiswa/")
    fun addDataMahasiswa(@Body data:Mahasiswa):Call<ResponseAddDataMahasiswa>

    @POST("datamahasiswa/{nim}")
    fun updateDataMahasiswa(@Path("nim") nim : String,@Body data: Mahasiswa):Call<ResponseDataUpdateMahasiswa>

    @DELETE("datamahasiswa/{nim}")
    fun deleteDataMahasiswa(@Path("nim") nim :String):Call<ResponseDeletDataMahasiswa>

}
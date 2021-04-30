package com.plete.addrecordapi

import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {
    @GET("latihanAPI/public/api/ceo")
    fun getCEOs(): Call<ArrayList<CEOModel>>

    @POST("latihanAPI/public/api/ceo")
    fun addCEOs(@Body newCEOModel: CEOModel) : Call<CEOModel>

    @DELETE("latihanAPI/public/api/ceo/{id}")
    fun deleteCEO(@Path("id") id: Int): Call<CEOModel>

    @PATCH("latihanAPI/public/api/ceo/{id}")
    fun updateCEO(@Body newCEOModel: CEOModel, @Path("id") id :Int): Call<CEOModel>
}
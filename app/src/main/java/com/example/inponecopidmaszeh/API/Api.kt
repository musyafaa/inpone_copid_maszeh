package com.example.inponecopidmaszeh.API

import com.example.inponecopidmaszeh.model.IndonesiaResponse
import com.example.inponecopidmaszeh.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>

}
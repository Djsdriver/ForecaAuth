package com.example.forecaauth.retrofit

import retrofit2.Call
import retrofit2.http.*

interface ForecaApi {

    @POST("/authorize/token?expire_hours=2")
    fun authenticate(@Body equest: ForecaAuthRequest): Call<ForecaAuthResponse>

    @GET("/api/v1/location/search/{query}")
    fun getLocations(@Header("Authorization") token: String, @Path("query") query: String): Call<LocationsResponse>

    @GET("/api/v1/current/{location}")
    fun getForecast(@Header("Authorization") token: String, @Path("location") locationId: Int): Call<ForecastResponse>
}
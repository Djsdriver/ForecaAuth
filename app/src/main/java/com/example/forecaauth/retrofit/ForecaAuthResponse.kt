package com.example.forecaauth.retrofit

import com.google.gson.annotations.SerializedName

class ForecaAuthResponse(@SerializedName("access_token") val token: String)

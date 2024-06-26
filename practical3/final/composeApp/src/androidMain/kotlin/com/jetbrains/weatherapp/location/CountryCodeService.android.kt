package com.jetbrains.weatherapp.location

import java.util.Locale

class AndroidCountryCodeService : CountryCodeService {
    override fun getCountryCode(): String? {
        return Locale.getDefault().country
    }
}

actual fun getCountryCode(): CountryCodeService {
    return AndroidCountryCodeService()
}
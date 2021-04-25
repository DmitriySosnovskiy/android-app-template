package com.dsosnovskiy.template.data.local.preferences

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PrefManager @Inject constructor(
    internal val preferences: SharedPreferences
) {

}
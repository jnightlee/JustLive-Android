package com.sunnyweather.android.ui.setting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import com.sunnyweather.android.R
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        var theme = sharedPreferences.getInt("theme", R.style.SunnyWeather)
        setTheme(theme)
        setContentView(R.layout.activity_setting)
        setSupportActionBar(setting_toolbar)
    }

}
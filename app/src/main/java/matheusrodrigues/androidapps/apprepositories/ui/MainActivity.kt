package matheusrodrigues.androidapps.apprepositories.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import matheusrodrigues.androidapps.apprepositories.R
import matheusrodrigues.androidapps.apprepositories.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(binding.toolbar)
    }
}
package id.gustonecrush.golekosapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        pageListener()
    }

    private fun pageListener() {
        content_2.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
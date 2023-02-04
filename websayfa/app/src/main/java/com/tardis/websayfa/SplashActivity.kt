package com.tardis.websayfa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // bu sayfanın birkaç saniye sonra kapatılıp mainactivity sayfasının açılmasını sağlama:
        val beklemeSuresi:Long=3000 //3sn
        Handler().postDelayed({
         startActivity(Intent(this,MainActivity::class.java))
         finish()
        },beklemeSuresi)
    }
}
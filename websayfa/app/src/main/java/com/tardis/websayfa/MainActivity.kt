package com.tardis.websayfa

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Tumblr")
        webView.loadUrl("https://tumblr.com")
        webView.webViewClient= WebViewClient() // bir bağlantıya tıkladığında hangi tarayıcı diye soran bu.
        webView.settings.javaScriptEnabled=true // javascript desteği ekler
        webView.settings.setSupportZoom(true) // zoom özelliği kazandırma
    }
// Uygulamadan Çıkış olayını Koyma.
    override fun onBackPressed() {
    AlertDialog.Builder(this)
        .setTitle("Çıkış")
        .setMessage("Uygulamayı kapatmak için Tamam'a tıklayınız.")
        .setNegativeButton("İptal",null)
        .setPositiveButton("Tamam", DialogInterface.OnClickListener { dialog, which ->
            super.onBackPressed()
        })
        .create()
        .show()
    //super.onBackPressed()
    }
}
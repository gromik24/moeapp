package com.gromik24.moeapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

const val TAG = "MyApp"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Ты видел деву на скале")
        Log.d(TAG, "В одежде белой над волнами")

        // srs6
        val openBrowserButton: Button = findViewById(R.id.open_browser_button)
        val link = Uri.parse("http://ya.ru")
        val intent = Intent(Intent.ACTION_VIEW, link)
        openBrowserButton.setOnClickListener(){
            startActivity(intent)
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Когда, бушуя в бурной мгле,")
        Log.d(TAG, "Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Когда луч молний озарял")
        Log.d(TAG, "Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "И ветер бился и летал")
        Log.d(TAG, "С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Прекрасно море в бурной мгле")
        Log.d(TAG, "И небо в блесках без лазури;")
    }

    override fun onRestart() {
        super.onRestart()
        printLastStrings()
    }

    override fun onDestroy() {
        super.onDestroy()
        printLastStrings()
    }

    fun printLastStrings()
    {
        Log.d(TAG, "Но верь мне: дева на скале")
        Log.d(TAG, "Прекрасней волн, небес и бури.")
    }




}
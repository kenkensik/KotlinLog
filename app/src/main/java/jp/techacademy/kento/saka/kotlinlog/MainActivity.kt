package jp.techacademy.kento.saka.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Kei=Human("錦織 圭",29,"テニス")

        Kei.say()
        Kei.think()

        val Rui=Human("八村 塁",21,"バスケ")

        Rui.say()
        Rui.think()


    }
}

package com.example.calculator_func

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlin.math.sqrt
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    lateinit var pasuxi: TextView

    private var ritsxv_shenaxva: Double = 0.0
    private var moqmedeba: String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pasuxi = findViewById(R.id.pasuxi)

    }
    //es funqcia pasuxim mgebelua daklikebaze
    fun click(view: View){
        if(view is TextView){
            var ritsxvi: String = view.text.toString()
            var shedegi: String = pasuxi.text.toString()
            //aq realizebulia 0 is dachera rom ar moxdes bevrjer dasawkyishi
            if(shedegi == "0"){
                shedegi = ""
            }
            //ritsxvebis gadabma
            pasuxi.text = shedegi + ritsxvi
        }

    }
    fun operatoriClick(view: View){
        if(view is TextView){
            if(!TextUtils.isEmpty(pasuxi.text)){
                //ritsxvis shenaxva rom ar dagvekargos
                ritsxv_shenaxva = pasuxi.text.toString().toDouble()
            }
            pasuxi.text = ""
            moqmedeba = view.text.toString()

        }

    }
    fun damatebaClick(view: View){
        var meore_ritsxvisText = pasuxi.text.toString()
        var meore_ritsxvi: Double = 0.0
        if(!TextUtils.isEmpty(meore_ritsxvisText)) {
            meore_ritsxvi = meore_ritsxvisText.toDouble()
        }
        when (moqmedeba) {
            "+" -> pasuxi.text = (ritsxv_shenaxva + meore_ritsxvi).toString()
            "-" -> pasuxi.text = (ritsxv_shenaxva - meore_ritsxvi).toString()
            "*" -> pasuxi.text = (ritsxv_shenaxva * meore_ritsxvi).toString()
            "/" -> pasuxi.text = (ritsxv_shenaxva / meore_ritsxvi).toString()
            "%" -> pasuxi.text = (ritsxv_shenaxva % meore_ritsxvi).toString()
            "x^2" -> pasuxi.text = (ritsxv_shenaxva * ritsxv_shenaxva).toString()
            "sqrt(2)" -> pasuxi.text = (ritsxv_shenaxva.pow(0.5) ).toString()


        }

    }
    //mtlianad washlis realizacia
    fun washlisclik(view: View){
        pasuxi.text = ""
    }
    //1 simbolos washlis realizacia
    fun ertis_washla(view: View){
        var b = pasuxi.text.toString()
        //aq vamowmebt aris tu ara gamosatan grafashi dawerili rame simbolo tu aris mashin shesruldeba da 1 wavshlit tu ar aris arafels ar izams radgan programam rom ar gaqrashos
        if(!TextUtils.isEmpty(b)) {
            pasuxi.text = b.substring(0, b.length - 1)
        }
    }

}
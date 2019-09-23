package mx.edu.ittepic.tpdm_u1_ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    var U = arrayOf("carlos","magali","marlon","emmanuel","jessica")
    var P = arrayOf("123","1234","12345","123456","12")

    var usuario = ""
    var pass = ""
    var a = false;
    var im = 0;
    var txtU : EditText ?= null
    var txtP : EditText ?= null
    var btn : Button ?= null
    var img : ImageView ?= null
    var count  = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtU = findViewById(R.id.txtU)
        txtP = findViewById(R.id.txtP)
        btn = findViewById(R.id.btn)
        img = findViewById(R.id.img)

        img?.setImageResource(R.drawable.avatar)

        btn?.setOnClickListener {
            getData()
            autenticar(usuario,pass)
        }
    }

    fun getData(){
        usuario = txtU?.text.toString()
        pass = txtP?.text.toString()
    }

    fun autenticar(u : String, p: String){

        (0..4).forEach {
            /*AlertDialog.Builder(this).setTitle("numero $it")
                .setMessage("usuario : $u"+ U[it])
                .setPositiveButton("contraseña: $p" + P[it]){dialog,witch ->}
                .show()*/

            if ( u==U[it] && p==P[it]){
              a =true
              im = it
                //AlertDialog.Builder(this).setTitle("change img")
                //    .show()
            }

        }
        if(a == true)
        changeImage(im)
        else {
            count++
            showError()
        }
    }
    fun changeImage(i: Int){
        Toast.makeText(this,"CEPTADO",Toast.LENGTH_LONG).show()
        when(i){
            0 -> img?.setImageResource(R.drawable.man)
            1 -> img?.setImageResource(R.drawable.girl)
            2 -> img?.setImageResource(R.drawable.man2)
            3 -> img?.setImageResource(R.drawable.boy)
            4 -> img?.setImageResource(R.drawable.girl2)
        }
        a =false
    }
    fun showError(){
        if(count==3 ){finish()}
        Toast.makeText(this,"Intento numero: $count",Toast.LENGTH_SHORT.show()
    }
}

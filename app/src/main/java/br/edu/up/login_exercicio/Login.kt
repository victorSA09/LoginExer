package br.edu.up.login_exercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun logar(view: View) {
        //
        var campoLogin: EditText = findViewById(R.id.edit_usuario)
        if (campoLogin.text.contentEquals("admin")) {
            var campoSenha:EditText = findViewById(R.id.edit_senha)
            if (campoSenha.text.contentEquals("123")) {
                //inicia a outra activity
                var termos: CheckBox = findViewById(R.id.Termos)
                if (termos.isChecked)
                    startActivity(Intent(this, MainActivity::class.java))
                else
                    Toast.makeText(this, "Aceite os termos", Toast.LENGTH_LONG).show()
            }
            else
                Toast.makeText(this, "Senha Invalida", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(this, "Usuario Invalido", Toast.LENGTH_LONG).show()
    }


}

package com.example.materialdesigncomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dialogs.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_snackBar.setOnClickListener {
            Toast.makeText(
                this, "SnackBar button pressed",
                Toast.LENGTH_LONG
            ).show()

            val snackBarIntent =
                Intent(this, SnackBarActivity::class.java)
            startActivity(snackBarIntent)
        }


        btn_dialog.setOnClickListener {
            Toast.makeText(
                this, "Dialogs button pressed",
                Toast.LENGTH_LONG
            ).show()

            val dialogsIntent = Intent(this, DialogsActivity::class.java )
            startActivity(dialogsIntent)
        }

        btn_floatingActionButton.setOnClickListener {
            Toast.makeText(this, "Show FAB button pressed",
                Toast.LENGTH_SHORT).show()

            Intent(this, FabActivity:: class.java).also{
                startActivity(it)
            }
        }
    }
}
package com.example.materialdesigncomponents

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_dialogs.*

class DialogsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogs)

        /**** Button ALERT DIALOG onClickListener ****/
        btn_alertDialog.setOnClickListener {

            tvDialogs.text = resources.getString(R.string.alert_dialog)

            /***************************/
            /**** Show Alert Dialog ****/
            /***************************/

            MaterialAlertDialogBuilder(this)
                    /** Title text **/
                    .setTitle("Reset settings?")
                    /** Supporting text **/
                    .setMessage("Reset your awesome device to its factory settings?")
                    /** NEUTRAL button **/
                    .setNeutralButton(resources.getString(R.string.neutral)) { _, _ ->
                        //some code for NEUTRAL button
                        tvDialogs.text = resources.getString(R.string.dialogs)
                        Toast.makeText(this, "Go back", Toast.LENGTH_SHORT).show()
                    }
                    /** POSITIVE button **/
                    .setPositiveButton(resources.getString(R.string.positive)) { _, _ ->
                        //some code for POSITIVE button
                        tvDialogs.text = resources.getString(R.string.dialogs)
                        Toast.makeText(this, "You've resetted it!",
                                Toast.LENGTH_SHORT).show()
                    }
                    /** NEGATIVE button **/
                    .setNegativeButton(resources.getString(R.string.negative)) { _, _ ->
                        //some code for NEGATIVE button
                        tvDialogs.text = resources.getString(R.string.dialogs)
                        Toast.makeText(this, "You haven't resetted it",
                                Toast.LENGTH_SHORT).show()
                    }
                    /** setting an icon **/
                    .setIcon(R.drawable.ic_baseline_sentiment_very_satisfied_24)
                    .show()
        }

        /***************************/
        /**** Show Simple Dialog ****/
        /***************************/

        val items = arrayOf("Item1", "Item2", "Item3", "Item4")

        val simpleDialog = MaterialAlertDialogBuilder(this)
                .setTitle("Choose one of these options")
                /** setting an icon before title**/
                .setIcon(R.drawable.ic_baseline_sentiment_very_satisfied_24)
                .setItems(items) { _, which ->
                    // Respond to item chosen
                    Toast.makeText(this, "${items[which]} chosen",
                            Toast.LENGTH_SHORT).show()
                    tvDialogs.text = resources.getString(R.string.dialogs)
                }
        /**** Button SIMPLE DIALOG onClickListener ****/
        btn_simpleDialog.setOnClickListener {
            simpleDialog.show()
            tvDialogs.text = resources.getString(R.string.simple_dialog)
        }
    }
}
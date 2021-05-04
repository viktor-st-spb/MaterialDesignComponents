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

        /**********************************/
        /**** Show Confirmation Dialog ****/
        /**********************************/
        val singleItems = arrayOf("Item 1", "Item 2", "Item 3")
        val checkedItem = 0

        val confirmationDialog = MaterialAlertDialogBuilder(this)
                .setTitle(resources.getString(R.string.choose_item))
                .setIcon(R.drawable.ic_baseline_sentiment_very_satisfied_24)
                .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
                    // Respond to neutral button press
                    Toast.makeText(this, "CANCEL button pressed",
                            Toast.LENGTH_SHORT).show()
                    tvDialogs.text = resources.getString(R.string.dialogs)
                }
                .setPositiveButton(resources.getString(R.string.ok)) { dialog, which ->
                    // Respond to positive button press
                    Toast.makeText(this, "OK button pressed",
                            Toast.LENGTH_SHORT).show()
                    tvDialogs.text = resources.getString(R.string.dialogs)
                }
                // Single-choice items (initialized with checked item)
                .setSingleChoiceItems(singleItems, checkedItem) { _, which ->
                    // Respond to item chosen
                    Toast.makeText(this, "You've chosen ${singleItems[which]}",
                            Toast.LENGTH_SHORT).show()
                }

        /**** Button CONFIRMATION DIALOG onClickListener ****/
        btn_confirmationDialog.setOnClickListener {
            confirmationDialog.show()
            tvDialogs.text = resources.getString(R.string.confirmationDialog)
        }


        /**************************************************/
        /**** Show Multiple Choice Confirmation Dialog ****/
        /**************************************************/

        val multiItems = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")
        val checkedItems = booleanArrayOf(true, false, false, true)

        val multipleChoiceConfirmationDialog = MaterialAlertDialogBuilder(this)
                .setTitle(resources.getString(R.string.choose_item))
                .setIcon(R.drawable.ic_baseline_sentiment_very_satisfied_24)
                //Multi-choice items (initialized with checked items)
                .setMultiChoiceItems(multiItems, checkedItems) { _, which, checked ->
                    // Respond to item chosen -
                    // the toast is shown only if item is checked from false to true
                    if (checked) {
                        Toast.makeText(this, "You checked ${multiItems[which]}",
                                Toast.LENGTH_SHORT).show()
                    }
                }
                .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
                    // Respond to neutral button press
                    Toast.makeText(this, "CANCEL button pressed",
                            Toast.LENGTH_SHORT).show()
                    tvDialogs.text = resources.getString(R.string.dialogs)
                }
                .setPositiveButton(resources.getString(R.string.ok)) { dialog, which ->
                    // Respond to positive button press
                    Toast.makeText(this, "OK button pressed",
                            Toast.LENGTH_SHORT).show()
                    tvDialogs.text = resources.getString(R.string.dialogs)
                }


        /**** Button MULTIPLE CHOICE CONFIRMATION DIALOG onClickListener ****/
        btn_multipleChoiceConfirmationDialog.setOnClickListener {
            multipleChoiceConfirmationDialog.show()
            tvDialogs.text = resources.getString(R.string.multipleChoiceConfirmationDialog)
        }


    }
}
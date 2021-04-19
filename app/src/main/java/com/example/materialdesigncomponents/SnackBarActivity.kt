package com.example.materialdesigncomponents

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.Fade
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.transition.MaterialContainerTransform
import kotlinx.android.synthetic.main.activity_snackbar.*

class SnackBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)


        btn_woActionShort.setOnClickListener {
            Snackbar.make(constraintLayout,
                "SnackBar w/o action SHORT", Snackbar.LENGTH_SHORT)
                .show()
        }

        btn_woActionLong.setOnClickListener {
            Snackbar.make(constraintLayout,
                "SnackBar w/o action LONG", Snackbar.LENGTH_LONG)
                .show()
        }

        btn_withAction_10s.setOnClickListener {
            Snackbar.make(constraintLayout,
                "SnackBar with action 10 s", Snackbar.LENGTH_LONG)
                .setDuration(10000)
                .setAction("BACK"){

                    Toast.makeText(
                        this,
                        "Button BACK pressed",
                        Toast.LENGTH_LONG).show()

                }
                .show()
        }

        btn_indefinite.setOnClickListener {
            Snackbar.make(constraintLayout,
                "SnackBar with action INDEFINITE",
                Snackbar.LENGTH_INDEFINITE)
//                .setDuration(10000)
                .setAction("BACK"){

                    Toast.makeText(
                        this,
                        "Button BACK pressed",
                        Toast.LENGTH_LONG).show()

                }
                .show()
        }

        btn_anchor.setOnClickListener {
            Snackbar.make(constraintLayout,
                "SnackBar above FAB",
                Snackbar.LENGTH_INDEFINITE)
                .setAnchorView(floatingActionButton)
//                .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE)
                .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_FADE)
                .setAction("BACK"){

                    Toast.makeText(
                        this,
                        "Button BACK pressed",
                        Toast.LENGTH_LONG).show()

                }
                .show()
        }

        btn_colors.setOnClickListener {
            Snackbar.make(
                    constraintLayout,
                    "Changed colors",
                    Snackbar.LENGTH_LONG)
                    .setAnchorView(floatingActionButton)
                    .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_FADE)
                    .setAction("RETRY"){
                        Toast.makeText(
                                this,
                                "Button RETRY pressed",
                                Toast.LENGTH_LONG).show()
                    }
                    .setBackgroundTint(Color.YELLOW)
                    .setTextColor(Color.GREEN)
                    .setActionTextColor(Color.RED)
                    .show()
        }
    }
}
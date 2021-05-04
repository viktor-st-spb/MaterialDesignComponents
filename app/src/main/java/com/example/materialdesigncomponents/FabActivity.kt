package com.example.materialdesigncomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_fab.*

class FabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fab)

        /**************************************/
        /*********** Regular FAB **************/
        /**************************************/

        btn_regularFab.setOnClickListener {
            tv_Fab.text = getString(R.string.regular_fab)
            fab_regular.visibility = View.VISIBLE
            // Make all buttons invisible
            btn_regularFab.visibility = View.INVISIBLE
            btn_extendedFab.visibility = View.INVISIBLE
            btn_miniFab.visibility = View.INVISIBLE
            btn_animatedRegularFab.visibility = View.INVISIBLE
        }

        // RegularFAB OnClickListener
        fab_regular.setOnClickListener {
            tv_Fab.text = getText(R.string.floating_action_buttons_fab)
            fab_regular.visibility = View.INVISIBLE
            // Make all buttons visible
            btn_regularFab.visibility = View.VISIBLE
            btn_extendedFab.visibility = View.VISIBLE
            btn_miniFab.visibility = View.VISIBLE
            btn_animatedRegularFab.visibility = View.VISIBLE
        }

        /**************************************/
        /************ Mini FAB ****************/
        /**************************************/

        btn_miniFab.setOnClickListener {
            tv_Fab.text = getString(R.string.mini_fab)
            fab_mini.visibility = View.VISIBLE
            // Make all buttons invisible
            btn_regularFab.visibility = View.INVISIBLE
            btn_extendedFab.visibility = View.INVISIBLE
            btn_miniFab.visibility = View.INVISIBLE
            btn_animatedRegularFab.visibility = View.INVISIBLE
        }


        fab_mini.setOnClickListener {
            tv_Fab.text = getText(R.string.floating_action_buttons_fab)
            //fab_regular.visibility = View.INVISIBLE
            fab_mini.visibility = View.INVISIBLE
            // Make all buttons visible
            btn_regularFab.visibility = View.VISIBLE
            btn_extendedFab.visibility = View.VISIBLE
            btn_miniFab.visibility = View.VISIBLE
            btn_animatedRegularFab.visibility = View.VISIBLE
        }

        /**************************************/
        /********** Extended FAB **************/
        /**************************************/

        btn_extendedFab.setOnClickListener {
            tv_Fab.text = getString(R.string.extended_fab)
            fab_extended.visibility = View.VISIBLE
            // Make all buttons invisible
            btn_regularFab.visibility = View.INVISIBLE
            btn_extendedFab.visibility = View.INVISIBLE
            btn_miniFab.visibility = View.INVISIBLE
            btn_animatedRegularFab.visibility = View.INVISIBLE
        }

        // ExtendedFAB OnClickListener
        fab_extended.setOnClickListener {
            tv_Fab.text = getText(R.string.floating_action_buttons_fab)
            fab_extended.visibility = View.INVISIBLE
            // Make all buttons visible
            btn_regularFab.visibility = View.VISIBLE
            btn_extendedFab.visibility = View.VISIBLE
            btn_miniFab.visibility = View.VISIBLE
            btn_animatedRegularFab.visibility = View.VISIBLE
        }

        /**************************************/
        /******** Animated Regular FAB ********/
        /**************************************/

        btn_animatedRegularFab.setOnClickListener {
            tv_Fab.text = getString(R.string.animated_regular_fab)

            // Show FAB with animation
            fab_animatedRegular.show()

            // Make all buttons invisible
            btn_regularFab.visibility = View.INVISIBLE
            btn_extendedFab.visibility = View.INVISIBLE
            btn_miniFab.visibility = View.INVISIBLE
            btn_animatedRegularFab.visibility = View.INVISIBLE
        }

        // Animated Regular FAB OnClickListener
        fab_animatedRegular.setOnClickListener {
            tv_Fab.text = getText(R.string.floating_action_buttons_fab)

            // Close FAB with animation
            fab_animatedRegular.hide()

            // Make all buttons visible
            btn_regularFab.visibility = View.VISIBLE
            btn_extendedFab.visibility = View.VISIBLE
            btn_miniFab.visibility = View.VISIBLE
            btn_animatedRegularFab.visibility = View.VISIBLE
        }
    }
}
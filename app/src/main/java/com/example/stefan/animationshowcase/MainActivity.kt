package com.example.stefan.animationshowcase

import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.VectorDrawable
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setDrawables()
        setListeners()
    }

    private fun setDrawables() {
        arrowToOverflow.fromAnimation = getDrawable(R.drawable.avd_arrow_to_overflow) as AnimatedVectorDrawable
        arrowToOverflow.fromAnimationSlow = getDrawable(R.drawable.avd_arrow_to_overflow_slow) as AnimatedVectorDrawable
        arrowToOverflow.toAnimation = getDrawable(R.drawable.avd_overflow_to_arrow) as AnimatedVectorDrawable
        arrowToOverflow.toAnimationSlow = getDrawable(R.drawable.avd_overflow_to_arrow_slow) as AnimatedVectorDrawable
        arrowToOverflow.init()
        arrowToOverflow.morph()
        arrowToOverflow2.fromAnimation = getDrawable(R.drawable.avd_arrow_to_overflow) as AnimatedVectorDrawable
        arrowToOverflow2.fromAnimationSlow = getDrawable(R.drawable.avd_arrow_to_overflow_slow) as AnimatedVectorDrawable
        arrowToOverflow2.toAnimation = getDrawable(R.drawable.avd_overflow_to_arrow) as AnimatedVectorDrawable
        arrowToOverflow2.toAnimationSlow = getDrawable(R.drawable.avd_overflow_to_arrow_slow) as AnimatedVectorDrawable
        arrowToOverflow2.init()
        arrowToOverflow2.morph()
        arrowToOverflow3.fromAnimation = getDrawable(R.drawable.avd_arrow_to_overflow) as AnimatedVectorDrawable
        arrowToOverflow3.fromAnimationSlow = getDrawable(R.drawable.avd_arrow_to_overflow_slow) as AnimatedVectorDrawable
        arrowToOverflow3.toAnimation = getDrawable(R.drawable.avd_overflow_to_arrow) as AnimatedVectorDrawable
        arrowToOverflow3.toAnimationSlow = getDrawable(R.drawable.avd_overflow_to_arrow_slow) as AnimatedVectorDrawable
        arrowToOverflow3.init()
        arrowToOverflow3.morph()
        arrowToOverflow4.fromAnimation = getDrawable(R.drawable.avd_arrow_to_overflow) as AnimatedVectorDrawable
        arrowToOverflow4.fromAnimationSlow = getDrawable(R.drawable.avd_arrow_to_overflow_slow) as AnimatedVectorDrawable
        arrowToOverflow4.toAnimation = getDrawable(R.drawable.avd_overflow_to_arrow) as AnimatedVectorDrawable
        arrowToOverflow4.toAnimationSlow = getDrawable(R.drawable.avd_overflow_to_arrow_slow) as AnimatedVectorDrawable
        arrowToOverflow4.init()
        arrowToOverflow4.morph()
    }

    private fun setListeners(){
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        arrowToOverflow.setOnClickListener {
            arrowToOverflow.morph()
        }
        arrowToOverflow2.setOnClickListener {
            arrowToOverflow2.morph()
        }
        arrowToOverflow3.setOnClickListener {
            arrowToOverflow3.morph()
        }
        arrowToOverflow4.setOnClickListener {
            arrowToOverflow4.morph()
        }

        slowMoSwitch.setOnCheckedChangeListener{_,isChecked ->
                arrowToOverflow.isSlow = isChecked
                arrowToOverflow2.isSlow = isChecked
                arrowToOverflow3.isSlow = isChecked
                arrowToOverflow4.isSlow = isChecked
        }
    }
}

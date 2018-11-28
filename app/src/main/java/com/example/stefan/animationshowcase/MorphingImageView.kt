package com.example.stefan.animationshowcase

import android.content.Context
import android.graphics.drawable.AnimatedVectorDrawable
import android.util.AttributeSet

class MorphingImageView : android.support.v7.widget.AppCompatImageView {

    var fromAnimation: AnimatedVectorDrawable? = null
    var toAnimation: AnimatedVectorDrawable? = null
    var fromAnimationSlow: AnimatedVectorDrawable? = null
    var toAnimationSlow: AnimatedVectorDrawable? = null
    var isFromAnimation = true
    var isSlow = false


    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    fun init() {
        isFromAnimation = false
        setImageDrawable(fromAnimation)
    }

    fun morph() {
        val drawable = if (isFromAnimation) fromAnimation else toAnimation
        val drawableSlow = if (isFromAnimation) fromAnimationSlow else toAnimationSlow
        setImageDrawable(if (isSlow) drawableSlow else drawable)
        drawable?.start()
        isFromAnimation = !isFromAnimation
    }
}
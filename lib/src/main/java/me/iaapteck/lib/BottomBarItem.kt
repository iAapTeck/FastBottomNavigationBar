package me.iaapteck.lib

/*
Designed and Developed by iAapTeck Software Labs
Author: Sanjay Chintamani Patel
URL: https://www.google.com/search?q=iaapteck
*/


import android.graphics.RectF
import android.graphics.drawable.Drawable

data class BottomBarItem (
    var title: String,
    var contentDescription : String,
    val icon: Drawable,
    var rect: RectF = RectF(),
    var alpha: Int
)

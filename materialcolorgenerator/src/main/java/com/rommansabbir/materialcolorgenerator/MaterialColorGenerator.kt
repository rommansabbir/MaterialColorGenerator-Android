package com.rommansabbir.materialcolorgenerator

import android.graphics.Color
import android.view.View

object MaterialColorGenerator {

    /**
     * Return a random color from material color set as string
     * @param level, color level
     */
    fun getRandomColor(level : Int): Int{
        when(level){
            50 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel50.random())
            }
            100 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel100.random())
            }
            200 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel200.random())
            }
            300 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel300.random())
            }
            400 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel400.random())
            }
            500 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel500.random())
            }
            600 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel600.random())
            }
            700 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel700.random())
            }
            800 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel800.random())
            }
            900 ->{
                return Color.parseColor(MaterialColorSet.materialColorSetLevel900.random())
            }
        }
        return Color.parseColor("#FFF")
    }

    /**
     * Set random color to a view
     * @param level, color level
     * @param view, the view you want to set color
     */
    fun setRandomColor(level: Int, view : View){
        when(level){
            50 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel50.random()))
            }
            100 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel100.random()))
            }
            200 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel200.random()))
            }
            300 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel300.random()))
            }
            400 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel400.random()))
            }
            500 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel500.random()))
            }
            600 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel600.random()))
            }
            700 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel700.random()))
            }
            800 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel800.random()))
            }
            900 ->{
                view.setBackgroundColor(Color.parseColor(MaterialColorSet.materialColorSetLevel900.random()))
            }
        }

    }
}
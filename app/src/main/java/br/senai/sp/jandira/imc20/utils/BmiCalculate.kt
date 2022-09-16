package br.senai.sp.jandira.imc20.utils

import android.content.Context
import br.senai.sp.jandira.imc20.R
import kotlin.math.pow

fun getBmi(weight: Int, height: Float): Float {
    return weight / height.pow(2)


}

fun getStatusBmi(bmi: Float, context: Context): String{

    if(bmi <= 18.5) {
        return context.getString(R.string.underweight)
    } else if (bmi > 18.5 && bmi < 25.0) {
        return context.getString(R.string.normal_weight)
    } else if (bmi >= 25.0 && bmi < 30) {
        return context.getString(R.string.overweight)
    } else if (bmi >= 30.0 && bmi < 35.0 ) {
        return context.getString(R.string.obesity_classI)
    } else if (bmi >= 35.0 && bmi < 40.0) {
        return context.getString(R.string.obesity_classII)
    } else {
        return context.getString(R.string.obesity_classIII)
    }
}
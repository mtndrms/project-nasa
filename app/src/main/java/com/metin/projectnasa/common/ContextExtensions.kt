package com.metin.projectnasa.common

import android.content.Context
import kotlin.math.roundToInt

object ContextExtensions {
    internal fun Context.dp2px(dp: Float): Float {
        return (dp * resources.displayMetrics.density).roundToInt().toFloat()
    }
}
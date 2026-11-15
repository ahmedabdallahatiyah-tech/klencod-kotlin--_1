package com.baran.app

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.graphics.Color

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // إنشاء واجهة بسيطة برمجياً
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER

        val titleText = TextView(this)
        titleText.text = "تطبيق تسديد الديون"
        titleText.textSize = 28f
        titleText.setTextColor(Color.parseColor("#1565C0")) // لون أزرق
        titleText.gravity = Gravity.CENTER

        layout.addView(titleText)
        setContentView(layout)
    }
}
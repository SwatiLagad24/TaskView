package com.example.taskview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log

class TaskView(
    context: Context,
    attributeSet: AttributeSet?
) : androidx.appcompat.widget.AppCompatTextView(context, attributeSet) {

    var taskChange = false

    private var paint = Paint()


    init {
        setTextColor(Color.RED)
        paint.strokeWidth = 20F

        setPadding(120, 10, 10, 10)

        setOnClickListener {
            taskChange = !taskChange

            var textColor = Color.RED
            if(taskChange) textColor = Color.GREEN

            setTextColor(textColor)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        paint.color=Color.RED


        canvas!!.let {
            it.drawLine(60F, 0F, 60F, height.toFloat(), paint)
            it.drawLine(90F, 0F, 90F, height.toFloat(), paint)
        }
    }
}








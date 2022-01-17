package com.gmail.avoishel.customviewtesting.UI

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.SurfaceHolder
import android.view.SurfaceView

class CustomView_SurfaseView(context: Context) : SurfaceView(context), SurfaceHolder.Callback {

    private val dravingThread = SurfaceDrawingThread(holder)

    init {
        holder.addCallback(this)
    }

    override fun surfaceCreated(p0: SurfaceHolder) {
        dravingThread.start()
    }

    override fun surfaceDestroyed(p0: SurfaceHolder) {
        try {
            dravingThread.join()
        } catch (e: InterruptedException){

        }
    }

    override fun surfaceChanged(p0: SurfaceHolder, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }

}

class SurfaceDrawingThread(private val surfaceHolder: SurfaceHolder) : Thread() {
    private val circlePainter = Paint().apply{
        color = Color.RED
        style = Paint.Style.FILL
        isAntiAlias = true
    }

    private val eyeasAndMouthPainter = Paint().apply {
        color - Color.BLUE
        isAntiAlias = true
        strokeWidth = 30f
    }

    override fun run() {
        val canvas: Canvas? = surfaceHolder.lockCanvas()
        canvas?.apply {
            val centerX = (canvas.width/2).toFloat()
            val centerY = (canvas.height/2).toFloat()
            drawColor(Color.WHITE)
            drawCircle(centerX, centerY, SMILE_RADIUS, circlePainter)
            //painter.color = Color.BLACK
            drawCircle(centerX - 100, centerY - 100, EYE_RADIUS, eyeasAndMouthPainter)
            drawCircle(centerX + 100, centerY - 100, EYE_RADIUS, eyeasAndMouthPainter)
            drawLine(centerX - 130, centerY + 130, centerX + 130, centerY + 130, eyeasAndMouthPainter)
        }
        surfaceHolder.unlockCanvasAndPost(canvas)
    }

    private companion object {
        private const val SMILE_RADIUS = 300f
        private const val EYE_RADIUS = 35f
    }
}
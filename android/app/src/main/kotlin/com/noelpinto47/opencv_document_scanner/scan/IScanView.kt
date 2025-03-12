package com.noelpinto47.opencv_document_scanner.scan

import android.view.Display
import android.view.SurfaceView
import com.noelpinto47.opencv_document_scanner.view.PaperRectangle

interface IScanView {
    interface Proxy {
        fun exit()
        fun getCurrentDisplay(): Display?
        fun getSurfaceView(): SurfaceView
        fun getPaperRect(): PaperRectangle
    }
}
package com.noelpinto47.opencv_document_scanner.crop

import android.widget.ImageView
import com.noelpinto47.opencv_document_scanner.view.PaperRectangle


/**
 * Created by pengke on 15/09/2017.
 */
class ICropView {
    interface Proxy {
        fun getPaper(): ImageView
        fun getPaperRect(): PaperRectangle
        fun getCroppedPaper(): ImageView
    }
}
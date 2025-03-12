package com.noelpinto47.opencv_document_scanner

import io.flutter.embedding.android.FlutterActivity
import android.view.WindowManager.LayoutParams
import android.os.Bundle
import android.net.wifi.*
import android.content.pm.PackageManager
import android.content.Context
import android.os.Build
import android.app.ActivityManager

class MainActivity : FlutterActivity() {
    private lateinit var wifiManager:WifiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(LayoutParams.FLAG_SECURE)
        wifiManager = context.getSystemService(Context.WIFI_SERVICE) as WifiManager;

        // Check if the device supports Impeller
        if (!isImpellerSupported()) {
            disableImpellerInManifest()
        }
    }

    private fun isImpellerSupported(): Boolean {
        // Impeller requires OpenGL ES 3.1+ and Android 8.0+ (API 26+)
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && isOpenGLES31Supported()
    }

    private fun isOpenGLES31Supported(): Boolean {
        val activityManager = getSystemService(ACTIVITY_SERVICE) as ActivityManager
        val config = activityManager.deviceConfigurationInfo
        return config.reqGlEsVersion >= 0x30001  // OpenGL ES 3.1+
    }

    private fun disableImpellerInManifest() {
        try {
            val packageManager = packageManager
            val appInfo = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
            appInfo.metaData.putBoolean("io.flutter.embedding.android.EnableImpeller", false)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

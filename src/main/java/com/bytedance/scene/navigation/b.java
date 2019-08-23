package com.bytedance.scene.navigation;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class b extends Handler {

    /* renamed from: a  reason: collision with root package name */
    boolean f22152a = true;

    @SuppressLint({"NewApi"})
    b(Looper looper) {
        super(looper);
        if (Build.VERSION.SDK_INT < 16) {
            this.f22152a = false;
            return;
        }
        if (this.f22152a && Build.VERSION.SDK_INT < 22) {
            Message obtain = Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (NoSuchMethodError unused) {
                this.f22152a = false;
            }
            obtain.recycle();
        }
    }
}

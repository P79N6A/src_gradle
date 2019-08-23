package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.bumptech.glide.load.DecodeFormat;
import java.io.File;

public final class HardwareConfigState {
    private static final File FD_SIZE_LIST = new File("/proc/self/fd");
    private static volatile HardwareConfigState instance;
    private volatile int decodesSinceLastFdCheck;
    private volatile boolean isHardwareConfigAllowed = true;

    private HardwareConfigState() {
    }

    static HardwareConfigState getInstance() {
        if (instance == null) {
            synchronized (HardwareConfigState.class) {
                if (instance == null) {
                    instance = new HardwareConfigState();
                }
            }
        }
        return instance;
    }

    private synchronized boolean isFdSizeBelowHardwareLimit() {
        int i = this.decodesSinceLastFdCheck + 1;
        this.decodesSinceLastFdCheck = i;
        if (i >= 50) {
            boolean z = false;
            this.decodesSinceLastFdCheck = 0;
            if (FD_SIZE_LIST.list().length < 700) {
                z = true;
            }
            this.isHardwareConfigAllowed = z;
            boolean z2 = this.isHardwareConfigAllowed;
        }
        return this.isHardwareConfigAllowed;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    public final boolean setHardwareConfigIfAllowed(int i, int i2, BitmapFactory.Options options, DecodeFormat decodeFormat, boolean z, boolean z2) {
        boolean z3;
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        if (i < 128 || i2 < 128 || !isFdSizeBelowHardwareLimit()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}

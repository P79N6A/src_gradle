package com.ss.android.vesdk;

import android.graphics.Bitmap;
import com.ss.android.ttve.nativePort.TEVideoUtils;

public class z {

    /* renamed from: a  reason: collision with root package name */
    private volatile long f78141a;

    public final synchronized void a() {
        TEVideoUtils.releaseGetFrameHandler(this.f78141a);
        this.f78141a = 0;
    }

    public final synchronized void a(String str) {
        this.f78141a = TEVideoUtils.createGetFrameHandler(str);
    }

    public final synchronized Bitmap a(int i, int i2, int i3, boolean z) throws r {
        if (this.f78141a != 0) {
            y.d("VEMediaParser", "getVideoFrame pts " + i + " width -1" + " height " + i3 + " isRough " + z);
        } else {
            throw new r(-101, "VEMediaParser not inited, or already released!");
        }
        return TEVideoUtils.getFrameWithHandler(this.f78141a, i, -1, i3, z);
    }
}

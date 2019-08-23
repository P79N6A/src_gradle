package com.ss.android.vesdk;

import com.ss.android.ttve.nativePort.TEVideoUtils;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    private long f77870a;

    /* renamed from: b  reason: collision with root package name */
    private final int f77871b;

    /* renamed from: c  reason: collision with root package name */
    private final int f77872c;

    ac(int i, int i2, int i3, float f2, int i4) {
        this.f77870a = TEVideoUtils.createRTAudioWaveformMgr(i2, i3, f2, i4);
        this.f77871b = i2;
        this.f77872c = i;
    }
}

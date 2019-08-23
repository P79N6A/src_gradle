package com.ss.android.ugc.aweme.shortvideo.senor;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;

public abstract class a implements SensorEventListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f69160b;

    /* renamed from: c  reason: collision with root package name */
    protected MediaRecordPresenter f69161c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69162d;

    public final double a(SensorEvent sensorEvent) {
        long j;
        SensorEvent sensorEvent2 = sensorEvent;
        if (PatchProxy.isSupport(new Object[]{sensorEvent2}, this, f69160b, false, 78484, new Class[]{SensorEvent.class}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{sensorEvent2}, this, f69160b, false, 78484, new Class[]{SensorEvent.class}, Double.TYPE)).doubleValue();
        }
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - sensorEvent2.timestamp);
        if (Build.VERSION.SDK_INT >= 17) {
            j = Math.abs(SystemClock.elapsedRealtimeNanos() - sensorEvent2.timestamp);
        } else {
            j = Long.MAX_VALUE;
        }
        return (double) (nanoTime - Math.min(Math.min(abs, j), Math.abs((SystemClock.uptimeMillis() * 1000000) - sensorEvent2.timestamp)));
    }

    public a(MediaRecordPresenter mediaRecordPresenter, boolean z) {
        this.f69161c = mediaRecordPresenter;
        this.f69162d = z;
    }
}

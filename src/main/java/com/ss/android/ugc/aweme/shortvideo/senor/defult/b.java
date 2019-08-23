package com.ss.android.ugc.aweme.shortvideo.senor.defult;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.shortvideo.senor.a;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69169a;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        if (PatchProxy.isSupport(new Object[]{sensorEvent}, this, f69169a, false, 78496, new Class[]{SensorEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sensorEvent}, this, f69169a, false, 78496, new Class[]{SensorEvent.class}, Void.TYPE);
            return;
        }
        float f2 = sensorEvent.values[0];
        float f3 = sensorEvent.values[1];
        float[] fArr = sensorEvent.values;
        if (f3 > 0.0f && Math.abs(f2) < f3) {
            i = 0;
        } else if (f2 > 0.0f && Math.abs(f3) < f2) {
            i = 270;
        } else if (f3 >= 0.0f || Math.abs(f2) >= (-f3)) {
            i = 90;
        } else {
            i = 180;
        }
        if (TextUtils.equals(Build.MODEL, "vivo X9")) {
            i = 0;
        }
        if (this.f69162d) {
            this.f69161c.a(0.0f, 0.0f, (float) i);
        }
    }

    b(MediaRecordPresenter mediaRecordPresenter, boolean z) {
        super(mediaRecordPresenter, z);
    }
}

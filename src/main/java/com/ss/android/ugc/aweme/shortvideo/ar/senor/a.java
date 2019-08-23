package com.ss.android.ugc.aweme.shortvideo.ar.senor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;

public final class a extends com.ss.android.ugc.aweme.shortvideo.senor.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65668a;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorEvent sensorEvent2 = sensorEvent;
        if (PatchProxy.isSupport(new Object[]{sensorEvent2}, this, f65668a, false, 75110, new Class[]{SensorEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sensorEvent2}, this, f65668a, false, 75110, new Class[]{SensorEvent.class}, Void.TYPE);
            return;
        }
        double a2 = a(sensorEvent);
        if (this.f69162d) {
            MediaRecordPresenter mediaRecordPresenter = this.f69161c;
            double d2 = (double) sensorEvent2.values[0];
            double d3 = (double) sensorEvent2.values[1];
            double d4 = (double) sensorEvent2.values[2];
            Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(a2)};
            if (PatchProxy.isSupport(objArr, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17661, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)) {
                Object[] objArr2 = {Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(a2)};
                Object[] objArr3 = objArr2;
                MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                ((Integer) PatchProxy.accessDispatch(objArr3, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17661, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
            } else {
                mediaRecordPresenter.j.slamProcessIngestAcc(d2, d3, d4, a2);
            }
        }
    }

    public a(MediaRecordPresenter mediaRecordPresenter, boolean z) {
        super(mediaRecordPresenter, z);
    }
}

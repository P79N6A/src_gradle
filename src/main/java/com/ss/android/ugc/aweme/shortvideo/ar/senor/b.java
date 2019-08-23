package com.ss.android.ugc.aweme.shortvideo.ar.senor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.shortvideo.senor.a;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65669a;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorEvent sensorEvent2 = sensorEvent;
        if (PatchProxy.isSupport(new Object[]{sensorEvent2}, this, f65669a, false, 75111, new Class[]{SensorEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sensorEvent2}, this, f65669a, false, 75111, new Class[]{SensorEvent.class}, Void.TYPE);
            return;
        }
        if (this.f69162d) {
            double a2 = a(sensorEvent);
            MediaRecordPresenter mediaRecordPresenter = this.f69161c;
            double d2 = (double) sensorEvent2.values[0];
            double d3 = (double) sensorEvent2.values[1];
            double d4 = (double) sensorEvent2.values[2];
            double d5 = d4;
            if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(a2)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17663, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)) {
                MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d5), Double.valueOf(a2)}, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17663, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
            } else {
                mediaRecordPresenter.j.slamProcessIngestGra(d2, d3, d5, a2);
            }
        }
    }

    public b(MediaRecordPresenter mediaRecordPresenter, boolean z) {
        super(mediaRecordPresenter, z);
    }
}

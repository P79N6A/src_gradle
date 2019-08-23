package com.ss.android.ugc.aweme.shortvideo.senor.defult;

import android.hardware.Sensor;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.shortvideo.senor.a;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69170a;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSensorChanged(android.hardware.SensorEvent r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f69170a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.hardware.SensorEvent> r1 = android.hardware.SensorEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 78497(0x132a1, float:1.09998E-40)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f69170a
            r3 = 0
            r4 = 78497(0x132a1, float:1.09998E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.hardware.SensorEvent> r1 = android.hardware.SensorEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            boolean r0 = r7.f69162d
            if (r0 == 0) goto L_0x0090
            com.ss.android.medialib.presenter.MediaRecordPresenter r0 = r7.f69161c
            float[] r1 = r8.values
            double r2 = r18.a(r19)
            r4 = 2
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r10] = r1
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            r11[r9] = r5
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
            r14 = 0
            r15 = 17590(0x44b6, float:2.4649E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<float[]> r6 = float[].class
            r5[r10] = r6
            java.lang.Class r6 = java.lang.Double.TYPE
            r5[r9] = r6
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x008b
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r10] = r1
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            r11[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
            r14 = 0
            r15 = 17590(0x44b6, float:2.4649E-41)
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.Class<float[]> r2 = float[].class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Double.TYPE
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x008b:
            com.ss.android.medialib.FaceBeautyInvoker r0 = r0.j
            r0.setDeviceRotation(r1, r2)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.senor.defult.c.onSensorChanged(android.hardware.SensorEvent):void");
    }

    c(MediaRecordPresenter mediaRecordPresenter, boolean z) {
        super(mediaRecordPresenter, z);
    }
}

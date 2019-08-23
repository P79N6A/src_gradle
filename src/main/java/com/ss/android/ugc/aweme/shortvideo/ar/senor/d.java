package com.ss.android.ugc.aweme.shortvideo.ar.senor;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.shortvideo.senor.a;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65671a;

    /* renamed from: e  reason: collision with root package name */
    private SensorManager f65672e;

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
            com.meituan.robust.ChangeQuickRedirect r2 = f65671a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.hardware.SensorEvent> r1 = android.hardware.SensorEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 75113(0x12569, float:1.05256E-40)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f65671a
            r3 = 0
            r4 = 75113(0x12569, float:1.05256E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.hardware.SensorEvent> r1 = android.hardware.SensorEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            double r0 = r18.a(r19)
            boolean r2 = r7.f69162d
            if (r2 == 0) goto L_0x00ae
            r2 = 9
            float[] r3 = new float[r2]
            android.hardware.SensorManager r4 = r7.f65672e
            if (r4 == 0) goto L_0x004d
            float[] r4 = r8.values
            android.hardware.SensorManager.getRotationMatrixFromVector(r3, r4)
        L_0x004d:
            double[] r4 = new double[r2]
            r5 = 0
        L_0x0050:
            if (r5 >= r2) goto L_0x005a
            r6 = r3[r5]
            double r11 = (double) r6
            r4[r5] = r11
            int r5 = r5 + 1
            goto L_0x0050
        L_0x005a:
            com.ss.android.medialib.presenter.MediaRecordPresenter r2 = r7.f69161c
            r3 = 2
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r4
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            r11[r9] = r5
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
            r14 = 0
            r15 = 17664(0x4500, float:2.4753E-41)
            java.lang.Class[] r5 = new java.lang.Class[r3]
            java.lang.Class<double[]> r6 = double[].class
            r5[r10] = r6
            java.lang.Class r6 = java.lang.Double.TYPE
            r5[r9] = r6
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r2
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x00a9
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r4
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r11[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
            r14 = 0
            r15 = 17664(0x4500, float:2.4753E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<double[]> r1 = double[].class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r2
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            goto L_0x00ae
        L_0x00a9:
            com.ss.android.medialib.FaceBeautyInvoker r2 = r2.j
            r2.slamProcessIngestOri(r4, r0)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ar.senor.d.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public d(SensorManager sensorManager, MediaRecordPresenter mediaRecordPresenter, boolean z) {
        super(mediaRecordPresenter, z);
        this.f65672e = sensorManager;
    }
}

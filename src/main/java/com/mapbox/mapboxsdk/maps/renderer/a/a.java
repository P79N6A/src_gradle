package com.mapbox.mapboxsdk.maps.renderer.a;

import android.opengl.GLSurfaceView;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.log.Logger;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public final class a implements GLSurfaceView.EGLConfigChooser {

    /* renamed from: a  reason: collision with root package name */
    private boolean f26715a;

    /* renamed from: com.mapbox.mapboxsdk.maps.renderer.a.a$a  reason: collision with other inner class name */
    class C0309a implements Comparable<C0309a> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f26716a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f26717b;

        /* renamed from: c  reason: collision with root package name */
        public final EGLConfig f26718c;

        /* renamed from: e  reason: collision with root package name */
        private final b f26720e;

        /* renamed from: f  reason: collision with root package name */
        private final c f26721f;
        private final int g;

        public final /* synthetic */ int compareTo(@NonNull Object obj) {
            C0309a aVar = (C0309a) obj;
            int a2 = com.mapbox.mapboxsdk.utils.c.a(this.f26720e.value, aVar.f26720e.value);
            if (a2 != 0) {
                return a2;
            }
            int a3 = com.mapbox.mapboxsdk.utils.c.a(this.f26721f.value, aVar.f26721f.value);
            if (a3 != 0) {
                return a3;
            }
            int a4 = com.mapbox.mapboxsdk.utils.c.a(this.f26716a, aVar.f26716a);
            if (a4 != 0) {
                return a4;
            }
            int a5 = com.mapbox.mapboxsdk.utils.c.a(this.f26717b, aVar.f26717b);
            if (a5 != 0) {
                return a5;
            }
            int a6 = com.mapbox.mapboxsdk.utils.c.a(this.g, aVar.g);
            if (a6 != 0) {
                return a6;
            }
            return 0;
        }

        public C0309a(b bVar, c cVar, boolean z, boolean z2, int i, EGLConfig eGLConfig) {
            this.f26720e = bVar;
            this.f26721f = cVar;
            this.f26716a = z;
            this.f26717b = z2;
            this.g = i;
            this.f26718c = eGLConfig;
        }
    }

    enum b {
        Format16Bit(3),
        Format32BitNoAlpha(1),
        Format32BitAlpha(2),
        Format24Bit(0),
        Unknown(4);
        
        int value;

        private b(int i) {
            this.value = i;
        }
    }

    enum c {
        Format16Depth8Stencil(1),
        Format24Depth8Stencil(0);
        
        int value;

        private c(int i) {
            this.value = i;
        }
    }

    public a() {
        this(false);
    }

    public a(boolean z) {
        this.f26715a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0256 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0203 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r29, javax.microedition.khronos.egl.EGLDisplay r30) {
        /*
            r28 = this;
            r6 = r29
            r7 = r30
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "generic"
            boolean r0 = r0.startsWith(r1)
            r8 = 1
            r9 = 0
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "unknown"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "google_sdk"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "Emulator"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "generic"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "generic"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0061
        L_0x004c:
            java.lang.String r0 = "google_sdk"
            java.lang.String r1 = android.os.Build.PRODUCT
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "ro.kernel.qemu"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r0 = 0
            goto L_0x0062
        L_0x0061:
            r0 = 1
        L_0x0062:
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Genymotion"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r0 = 0
            goto L_0x0072
        L_0x0071:
            r0 = 1
        L_0x0072:
            java.lang.String r1 = "Mbgl-EGLConfigChooser"
            java.lang.String r2 = "In emulator: %s"
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r3[r9] = r4
            java.lang.String r2 = java.lang.String.format(r2, r3)
            com.mapbox.mapboxsdk.log.Logger.i(r1, r2)
            r1 = 25
            int[] r10 = new int[r1]
            r11 = 12327(0x3027, float:1.7274E-41)
            r10[r9] = r11
            r12 = 12344(0x3038, float:1.7298E-41)
            r10[r8] = r12
            r1 = 2
            r2 = 12339(0x3033, float:1.729E-41)
            r10[r1] = r2
            r1 = 3
            r13 = 4
            r10[r1] = r13
            r14 = 12320(0x3020, float:1.7264E-41)
            r10[r13] = r14
            r15 = 5
            r5 = 16
            r10[r15] = r5
            r4 = 12324(0x3024, float:1.727E-41)
            r3 = 6
            r10[r3] = r4
            r1 = 7
            r10[r1] = r15
            r2 = 12323(0x3023, float:1.7268E-41)
            r1 = 8
            r10[r1] = r2
            r16 = 9
            r10[r16] = r3
            r16 = 10
            r14 = 12322(0x3022, float:1.7267E-41)
            r10[r16] = r14
            r16 = 11
            r10[r16] = r15
            r16 = 12
            r15 = 12321(0x3021, float:1.7265E-41)
            r10[r16] = r15
            r16 = 13
            r15 = r28
            boolean r2 = r15.f26715a
            if (r2 == 0) goto L_0x00d0
            r2 = 8
            goto L_0x00d1
        L_0x00d0:
            r2 = 0
        L_0x00d1:
            r10[r16] = r2
            r2 = 14
            r16 = 12325(0x3025, float:1.7271E-41)
            r10[r2] = r16
            r2 = 15
            r10[r2] = r5
            r2 = 12326(0x3026, float:1.7272E-41)
            r10[r5] = r2
            r2 = 17
            r10[r2] = r1
            r2 = 18
            if (r0 == 0) goto L_0x00ec
            r16 = 12344(0x3038, float:1.7298E-41)
            goto L_0x00ee
        L_0x00ec:
            r16 = 12354(0x3042, float:1.7312E-41)
        L_0x00ee:
            r10[r2] = r16
            r2 = 19
            r10[r2] = r13
            r2 = 20
            if (r0 == 0) goto L_0x00fb
            r0 = 12344(0x3038, float:1.7298E-41)
            goto L_0x00fd
        L_0x00fb:
            r0 = 12351(0x303f, float:1.7307E-41)
        L_0x00fd:
            r10[r2] = r0
            r0 = 21
            r2 = 12430(0x308e, float:1.7418E-41)
            r10[r0] = r2
            r0 = 22
            r2 = 12352(0x3040, float:1.7309E-41)
            r10[r0] = r2
            r0 = 23
            r10[r0] = r13
            r2 = 24
            r10[r2] = r12
            int[] r0 = new int[r8]
            r16 = 0
            r17 = 0
            r18 = r0
            r0 = r29
            r12 = 8
            r1 = r30
            r12 = 12323(0x3023, float:1.7268E-41)
            r13 = 24
            r2 = r10
            r3 = r16
            r13 = 12324(0x3024, float:1.727E-41)
            r4 = r17
            r5 = r18
            boolean r0 = r0.eglChooseConfig(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02e1
            r0 = r18[r9]
            if (r0 <= 0) goto L_0x02d2
            r0 = r18[r9]
            javax.microedition.khronos.egl.EGLConfig[] r5 = new javax.microedition.khronos.egl.EGLConfig[r0]
            r4 = r18[r9]
            r0 = r29
            r1 = r30
            r2 = r10
            r3 = r5
            r10 = r5
            r5 = r18
            boolean r0 = r0.eglChooseConfig(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02af
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r10.length
            r2 = 0
            r3 = 0
        L_0x0155:
            if (r2 >= r1) goto L_0x026d
            r4 = r10[r2]
            int r3 = r3 + r8
            int r5 = a(r6, r7, r4, r11)
            r11 = 12354(0x3042, float:1.7312E-41)
            int r11 = a(r6, r7, r4, r11)
            r8 = 12320(0x3020, float:1.7264E-41)
            int r9 = a(r6, r7, r4, r8)
            int r8 = a(r6, r7, r4, r13)
            int r13 = a(r6, r7, r4, r12)
            int r12 = a(r6, r7, r4, r14)
            r25 = r1
            r14 = 12321(0x3021, float:1.7265E-41)
            int r1 = a(r6, r7, r4, r14)
            r14 = 12350(0x303e, float:1.7306E-41)
            a(r6, r7, r4, r14)
            r14 = 12325(0x3025, float:1.7271E-41)
            int r14 = a(r6, r7, r4, r14)
            r26 = r10
            r10 = 12326(0x3026, float:1.7272E-41)
            int r10 = a(r6, r7, r4, r10)
            r15 = 12338(0x3032, float:1.7289E-41)
            int r15 = a(r6, r7, r4, r15)
            r27 = r2
            r2 = 12337(0x3031, float:1.7288E-41)
            int r2 = a(r6, r7, r4, r2)
            r6 = 24
            if (r14 == r6) goto L_0x01ad
            r6 = 16
            if (r14 != r6) goto L_0x01a8
            goto L_0x01af
        L_0x01a8:
            r6 = 8
            r16 = 0
            goto L_0x01b3
        L_0x01ad:
            r6 = 16
        L_0x01af:
            r6 = 8
            r16 = 1
        L_0x01b3:
            if (r10 != r6) goto L_0x01b7
            r6 = 1
            goto L_0x01b8
        L_0x01b7:
            r6 = 0
        L_0x01b8:
            r6 = r16 & r6
            if (r15 != 0) goto L_0x01be
            r15 = 1
            goto L_0x01bf
        L_0x01be:
            r15 = 0
        L_0x01bf:
            r6 = r6 & r15
            if (r2 != 0) goto L_0x01c4
            r2 = 1
            goto L_0x01c5
        L_0x01c4:
            r2 = 0
        L_0x01c5:
            r2 = r2 & r6
            if (r2 == 0) goto L_0x024c
            r2 = 16
            if (r9 != r2) goto L_0x01db
            r2 = 5
            if (r8 != r2) goto L_0x01dc
            r6 = 6
            if (r13 != r6) goto L_0x01dd
            if (r12 != r2) goto L_0x01dd
            if (r1 != 0) goto L_0x01dd
            com.mapbox.mapboxsdk.maps.renderer.a.a$b r1 = com.mapbox.mapboxsdk.maps.renderer.a.a.b.Format16Bit
        L_0x01d8:
            r2 = 24
            goto L_0x0210
        L_0x01db:
            r2 = 5
        L_0x01dc:
            r6 = 6
        L_0x01dd:
            r15 = 32
            if (r9 != r15) goto L_0x01ee
            r15 = 8
            if (r8 != r15) goto L_0x01f0
            if (r13 != r15) goto L_0x01f0
            if (r12 != r15) goto L_0x01f0
            if (r1 != 0) goto L_0x01f0
            com.mapbox.mapboxsdk.maps.renderer.a.a$b r1 = com.mapbox.mapboxsdk.maps.renderer.a.a.b.Format32BitNoAlpha
            goto L_0x01d8
        L_0x01ee:
            r15 = 8
        L_0x01f0:
            r2 = 32
            if (r9 != r2) goto L_0x01ff
            if (r8 != r15) goto L_0x01ff
            if (r13 != r15) goto L_0x01ff
            if (r12 != r15) goto L_0x01ff
            if (r1 != r15) goto L_0x01ff
            com.mapbox.mapboxsdk.maps.renderer.a.a$b r1 = com.mapbox.mapboxsdk.maps.renderer.a.a.b.Format32BitAlpha
            goto L_0x01d8
        L_0x01ff:
            r2 = 24
            if (r9 != r2) goto L_0x020e
            if (r8 != r15) goto L_0x020e
            if (r13 != r15) goto L_0x020e
            if (r12 != r15) goto L_0x020e
            if (r1 != 0) goto L_0x020e
            com.mapbox.mapboxsdk.maps.renderer.a.a$b r1 = com.mapbox.mapboxsdk.maps.renderer.a.a.b.Format24Bit
            goto L_0x0210
        L_0x020e:
            com.mapbox.mapboxsdk.maps.renderer.a.a$b r1 = com.mapbox.mapboxsdk.maps.renderer.a.a.b.Unknown
        L_0x0210:
            r8 = 16
            if (r14 != r8) goto L_0x021b
            r9 = 8
            if (r10 != r9) goto L_0x021d
            com.mapbox.mapboxsdk.maps.renderer.a.a$c r10 = com.mapbox.mapboxsdk.maps.renderer.a.a.c.Format16Depth8Stencil
            goto L_0x021f
        L_0x021b:
            r9 = 8
        L_0x021d:
            com.mapbox.mapboxsdk.maps.renderer.a.a$c r10 = com.mapbox.mapboxsdk.maps.renderer.a.a.c.Format24Depth8Stencil
        L_0x021f:
            r20 = r10
            r10 = 4
            r11 = r11 & r10
            if (r11 == r10) goto L_0x022a
            r11 = 12344(0x3038, float:1.7298E-41)
            r21 = 1
            goto L_0x022e
        L_0x022a:
            r11 = 12344(0x3038, float:1.7298E-41)
            r21 = 0
        L_0x022e:
            if (r5 == r11) goto L_0x0233
            r22 = 1
            goto L_0x0235
        L_0x0233:
            r22 = 0
        L_0x0235:
            com.mapbox.mapboxsdk.maps.renderer.a.a$b r5 = com.mapbox.mapboxsdk.maps.renderer.a.a.b.Unknown
            if (r1 == r5) goto L_0x0256
            com.mapbox.mapboxsdk.maps.renderer.a.a$a r5 = new com.mapbox.mapboxsdk.maps.renderer.a.a$a
            r17 = r5
            r18 = r28
            r19 = r1
            r23 = r3
            r24 = r4
            r17.<init>(r19, r20, r21, r22, r23, r24)
            r0.add(r5)
            goto L_0x0256
        L_0x024c:
            r2 = 24
            r6 = 6
            r8 = 16
            r9 = 8
            r10 = 4
            r11 = 12344(0x3038, float:1.7298E-41)
        L_0x0256:
            int r1 = r27 + 1
            r2 = r1
            r1 = r25
            r10 = r26
            r6 = r29
            r8 = 1
            r9 = 0
            r11 = 12327(0x3027, float:1.7274E-41)
            r12 = 12323(0x3023, float:1.7268E-41)
            r13 = 12324(0x3024, float:1.727E-41)
            r14 = 12322(0x3022, float:1.7267E-41)
            r15 = r28
            goto L_0x0155
        L_0x026d:
            java.util.Collections.sort(r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x02a7
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.mapbox.mapboxsdk.maps.renderer.a.a$a r0 = (com.mapbox.mapboxsdk.maps.renderer.a.a.C0309a) r0
            boolean r1 = r0.f26717b
            if (r1 == 0) goto L_0x0288
            java.lang.String r1 = "Mbgl-EGLConfigChooser"
            java.lang.String r2 = "Chosen config has a caveat."
            com.mapbox.mapboxsdk.log.Logger.w(r1, r2)
        L_0x0288:
            boolean r1 = r0.f26716a
            if (r1 == 0) goto L_0x0293
            java.lang.String r1 = "Mbgl-EGLConfigChooser"
            java.lang.String r2 = "Chosen config is not conformant."
            com.mapbox.mapboxsdk.log.Logger.w(r1, r2)
        L_0x0293:
            javax.microedition.khronos.egl.EGLConfig r0 = r0.f26718c
            if (r0 == 0) goto L_0x0298
            return r0
        L_0x0298:
            java.lang.String r0 = "Mbgl-EGLConfigChooser"
            java.lang.String r1 = "No config chosen"
            com.mapbox.mapboxsdk.log.Logger.e(r0, r1)
            com.mapbox.mapboxsdk.maps.renderer.a.b r0 = new com.mapbox.mapboxsdk.maps.renderer.a.b
            java.lang.String r1 = "No config chosen"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a7:
            com.mapbox.mapboxsdk.maps.renderer.a.b r0 = new com.mapbox.mapboxsdk.maps.renderer.a.b
            java.lang.String r1 = "No matching configurations after filtering"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02af:
            java.util.Locale r0 = com.mapbox.mapboxsdk.constants.a.f26480a
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r29.eglGetError()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "eglChooseConfig() returned error %d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            java.lang.String r1 = "Mbgl-EGLConfigChooser"
            com.mapbox.mapboxsdk.log.Logger.e(r1, r0)
            com.mapbox.mapboxsdk.maps.renderer.a.b r0 = new com.mapbox.mapboxsdk.maps.renderer.a.b
            java.lang.String r1 = "eglChooseConfig() failed"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02d2:
            java.lang.String r0 = "Mbgl-EGLConfigChooser"
            java.lang.String r1 = "eglChooseConfig() returned no configs."
            com.mapbox.mapboxsdk.log.Logger.e(r0, r1)
            com.mapbox.mapboxsdk.maps.renderer.a.b r0 = new com.mapbox.mapboxsdk.maps.renderer.a.b
            java.lang.String r1 = "eglChooseConfig() failed"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02e1:
            java.util.Locale r0 = com.mapbox.mapboxsdk.constants.a.f26480a
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r29.eglGetError()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "eglChooseConfig(NULL) returned error %d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            java.lang.String r1 = "Mbgl-EGLConfigChooser"
            com.mapbox.mapboxsdk.log.Logger.e(r1, r0)
            com.mapbox.mapboxsdk.maps.renderer.a.b r0 = new com.mapbox.mapboxsdk.maps.renderer.a.b
            java.lang.String r1 = "eglChooseConfig() failed"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.a.a.chooseConfig(javax.microedition.khronos.egl.EGL10, javax.microedition.khronos.egl.EGLDisplay):javax.microedition.khronos.egl.EGLConfig");
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        Logger.e("Mbgl-EGLConfigChooser", String.format(com.mapbox.mapboxsdk.constants.a.f26480a, "eglGetConfigAttrib(%d) returned error %d", new Object[]{Integer.valueOf(i), Integer.valueOf(egl10.eglGetError())}));
        throw new b("eglGetConfigAttrib() failed");
    }
}

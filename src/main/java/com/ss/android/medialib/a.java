package com.ss.android.medialib;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.common.e;
import com.ss.android.vesdk.y;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

@TargetApi(18)
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29334a;

    /* renamed from: b  reason: collision with root package name */
    static b f29335b;
    private static final String[] k = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};
    private static int l = 5000;

    /* renamed from: c  reason: collision with root package name */
    MediaCodec.BufferInfo f29336c;

    /* renamed from: d  reason: collision with root package name */
    ByteBuffer[] f29337d;

    /* renamed from: e  reason: collision with root package name */
    ByteBuffer[] f29338e;

    /* renamed from: f  reason: collision with root package name */
    int f29339f = 0;
    public int g = 30;
    public int h = 1;
    public boolean i = false;
    BufferedOutputStream j = null;
    private MediaCodec m;
    private String n = "video/avc";
    private MediaCodecInfo o;
    private Surface p;
    private e q;
    private int r;
    private int s;
    private boolean t;
    private Queue<Pair<Integer, Integer>> u = new LinkedList();
    private int v;
    private int w = 0;
    private int x = 0;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:86|87|88|89) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01e4, code lost:
        if (r13.profile < 8) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x03e3, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x03e1 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01eb A[Catch:{ Exception -> 0x03e1 }, LOOP:0: B:28:0x0196->B:44:0x01eb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f1 A[EDGE_INSN: B:94:0x01f1->B:45:0x01f1 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface a(int r24, int r25, int r26, int r27, int r28, int r29, boolean r30) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r30
            r14 = 7
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r15 = 0
            r1[r15] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r7 = 1
            r1[r7] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r6 = 2
            r1[r6] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
            r5 = 3
            r1[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r16 = 4
            r1[r16] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            r17 = 5
            r1[r17] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r30)
            r18 = 6
            r1[r18] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a
            java.lang.Class[] r4 = new java.lang.Class[r14]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r4[r15] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r4[r7] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r4[r6] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r4[r5] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r4[r16] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r4[r17] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r4[r18] = r2
            java.lang.Class<android.view.Surface> r19 = android.view.Surface.class
            r20 = 0
            r21 = 16158(0x3f1e, float:2.2642E-41)
            r2 = r23
            r22 = r4
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x00e6
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r1[r15] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r2 = 1
            r1[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r3 = 2
            r1[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            r4 = 3
            r1[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r1[r16] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            r1[r17] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r30)
            r1[r18] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = f29334a
            r5 = 0
            r6 = 16158(0x3f1e, float:2.2642E-41)
            java.lang.Class[] r7 = new java.lang.Class[r14]
            java.lang.Class r9 = java.lang.Integer.TYPE
            r7[r15] = r9
            java.lang.Class r9 = java.lang.Integer.TYPE
            r7[r2] = r9
            java.lang.Class r2 = java.lang.Integer.TYPE
            r7[r3] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r7[r4] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r7[r16] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r7[r17] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r7[r18] = r2
            java.lang.Class<android.view.Surface> r2 = android.view.Surface.class
            r24 = r1
            r25 = r23
            r26 = r0
            r27 = r5
            r28 = r6
            r29 = r7
            r30 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r24, r25, r26, r27, r28, r29, r30)
            android.view.Surface r0 = (android.view.Surface) r0
            return r0
        L_0x00e6:
            r2 = 1
            r3 = 2
            r4 = 3
            r1 = 0
            if (r13 != 0) goto L_0x00ed
            return r1
        L_0x00ed:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 18
            if (r5 >= r6) goto L_0x00f4
            return r1
        L_0x00f4:
            r8.w = r15
            r8.x = r15
            java.lang.String r5 = "AVCEncoder"
            java.lang.String r6 = "initAVCEncoder == enter"
            com.ss.android.vesdk.y.a(r5, r6)
            if (r11 < 0) goto L_0x0103
            if (r11 <= r3) goto L_0x011c
        L_0x0103:
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Do not support bitrate mode "
            r6.<init>(r7)
            r6.append(r11)
            java.lang.String r7 = ", set VBR mode"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.ss.android.vesdk.y.a(r5, r6)
            r11 = 1
        L_0x011c:
            if (r12 <= 0) goto L_0x0122
            r5 = 64
            if (r12 <= r5) goto L_0x013b
        L_0x0122:
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Do not support profile "
            r6.<init>(r7)
            r6.append(r12)
            java.lang.String r7 = ", use baseline"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.ss.android.vesdk.y.a(r5, r6)
            r12 = 1
        L_0x013b:
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "width + "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r7 = "\theight = "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = "\tbitrate = "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r7 = "\tuseTextureInput = "
            r6.append(r7)
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            com.ss.android.vesdk.y.a(r5, r6)
            if (r0 <= 0) goto L_0x03e6
            if (r9 > 0) goto L_0x016c
            goto L_0x03e6
        L_0x016c:
            r8.r = r0
            r8.s = r9
            monitor-enter(r23)
            r23.a()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.medialib.b r5 = f29335b     // Catch:{ Exception -> 0x03e1 }
            if (r5 == 0) goto L_0x017f
            com.ss.android.medialib.b r5 = f29335b     // Catch:{ Exception -> 0x03e1 }
            int r6 = r8.v     // Catch:{ Exception -> 0x03e1 }
            r5.setColorFormat(r6)     // Catch:{ Exception -> 0x03e1 }
        L_0x017f:
            java.lang.String r5 = r8.n     // Catch:{ Exception -> 0x03e1 }
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r5, r0, r9)     // Catch:{ Exception -> 0x03e1 }
            android.media.MediaCodec r5 = r8.m     // Catch:{ Exception -> 0x03e1 }
            android.media.MediaCodecInfo r5 = r5.getCodecInfo()     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r6 = r8.n     // Catch:{ Exception -> 0x03e1 }
            android.media.MediaCodecInfo$CodecCapabilities r5 = r5.getCapabilitiesForType(r6)     // Catch:{ Exception -> 0x03e1 }
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = r5.profileLevels     // Catch:{ Exception -> 0x03e1 }
            int r7 = r6.length     // Catch:{ Exception -> 0x03e1 }
            r13 = r1
            r9 = 0
        L_0x0196:
            if (r9 >= r7) goto L_0x01f1
            r1 = r6[r9]     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r15 = "AVCEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r14 = "Profile = "
            r4.<init>(r14)     // Catch:{ Exception -> 0x03e1 }
            int r14 = r1.profile     // Catch:{ Exception -> 0x03e1 }
            r4.append(r14)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r14 = ", Level = "
            r4.append(r14)     // Catch:{ Exception -> 0x03e1 }
            int r14 = r1.level     // Catch:{ Exception -> 0x03e1 }
            r4.append(r14)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.a(r15, r4)     // Catch:{ Exception -> 0x03e1 }
            int r4 = r1.profile     // Catch:{ Exception -> 0x03e1 }
            if (r4 != r2) goto L_0x01c5
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r13 = "Support Baseline Profile!"
            com.ss.android.vesdk.y.a(r4, r13)     // Catch:{ Exception -> 0x03e1 }
            goto L_0x01e6
        L_0x01c5:
            int r4 = r1.profile     // Catch:{ Exception -> 0x03e1 }
            if (r4 != r3) goto L_0x01d5
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r14 = "Support Main Profile!"
            com.ss.android.vesdk.y.a(r4, r14)     // Catch:{ Exception -> 0x03e1 }
            int r4 = r13.profile     // Catch:{ Exception -> 0x03e1 }
            if (r4 >= r3) goto L_0x01e7
            goto L_0x01e6
        L_0x01d5:
            int r4 = r1.profile     // Catch:{ Exception -> 0x03e1 }
            r14 = 8
            if (r4 != r14) goto L_0x01e7
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r15 = "Support High Profile!"
            com.ss.android.vesdk.y.a(r4, r15)     // Catch:{ Exception -> 0x03e1 }
            int r4 = r13.profile     // Catch:{ Exception -> 0x03e1 }
            if (r4 >= r14) goto L_0x01e7
        L_0x01e6:
            r13 = r1
        L_0x01e7:
            int r1 = r1.profile     // Catch:{ Exception -> 0x03e1 }
            if (r1 == r12) goto L_0x01f1
            int r9 = r9 + 1
            r1 = 0
            r4 = 3
            r15 = 0
            goto L_0x0196
        L_0x01f1:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x03e1 }
            r4 = 21
            if (r1 < r4) goto L_0x0223
            android.media.MediaCodecInfo$EncoderCapabilities r1 = r5.getEncoderCapabilities()     // Catch:{ Exception -> 0x03e1 }
            r6 = 0
        L_0x01fc:
            r7 = 3
            if (r6 >= r7) goto L_0x0223
            java.lang.String r7 = "AVCEncoder"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            r9.<init>()     // Catch:{ Exception -> 0x03e1 }
            java.lang.String[] r14 = k     // Catch:{ Exception -> 0x03e1 }
            r14 = r14[r6]     // Catch:{ Exception -> 0x03e1 }
            r9.append(r14)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r14 = ": "
            r9.append(r14)     // Catch:{ Exception -> 0x03e1 }
            boolean r14 = r1.isBitrateModeSupported(r6)     // Catch:{ Exception -> 0x03e1 }
            r9.append(r14)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.b(r7, r9)     // Catch:{ Exception -> 0x03e1 }
            int r6 = r6 + 1
            goto L_0x01fc
        L_0x0223:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x03e1 }
            r6 = 24
            if (r1 < r6) goto L_0x0294
            if (r13 == 0) goto L_0x0294
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r7 = "Set Profile: "
            r6.<init>(r7)     // Catch:{ Exception -> 0x03e1 }
            int r7 = r13.profile     // Catch:{ Exception -> 0x03e1 }
            r6.append(r7)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r7 = ", Level = "
            r6.append(r7)     // Catch:{ Exception -> 0x03e1 }
            int r7 = r13.level     // Catch:{ Exception -> 0x03e1 }
            r6.append(r7)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.a(r1, r6)     // Catch:{ Exception -> 0x03e1 }
            int r1 = r13.profile     // Catch:{ Exception -> 0x03e1 }
            r8.h = r1     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = "profile"
            int r6 = r13.profile     // Catch:{ Exception -> 0x03e1 }
            r0.setInteger(r1, r6)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = "level"
            int r6 = r13.level     // Catch:{ Exception -> 0x03e1 }
            r0.setInteger(r1, r6)     // Catch:{ Exception -> 0x03e1 }
            int r1 = r13.profile     // Catch:{ Exception -> 0x03e1 }
            if (r1 == r3) goto L_0x0274
            r6 = 8
            if (r1 == r6) goto L_0x0266
            r1 = r10
            goto L_0x0282
        L_0x0266:
            java.lang.String r1 = "AVCEncoder"
            java.lang.String r6 = "Set High Profile"
            com.ss.android.vesdk.y.a(r1, r6)     // Catch:{ Exception -> 0x03e1 }
            float r1 = (float) r10     // Catch:{ Exception -> 0x03e1 }
            r6 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r6
            int r1 = (int) r1     // Catch:{ Exception -> 0x03e1 }
            goto L_0x0282
        L_0x0274:
            java.lang.String r1 = "AVCEncoder"
            java.lang.String r6 = "Set Main Profile"
            com.ss.android.vesdk.y.a(r1, r6)     // Catch:{ Exception -> 0x03e1 }
            float r1 = (float) r10     // Catch:{ Exception -> 0x03e1 }
            r6 = 1062836634(0x3f59999a, float:0.85)
            float r1 = r1 * r6
            int r1 = (int) r1     // Catch:{ Exception -> 0x03e1 }
        L_0x0282:
            java.lang.String r6 = "te_mediacodec_profile"
            int r7 = r13.profile     // Catch:{ Exception -> 0x03e1 }
            long r14 = (long) r7     // Catch:{ Exception -> 0x03e1 }
            r7 = 0
            com.ss.android.ttve.monitor.e.a((int) r7, (java.lang.String) r6, (long) r14)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r6 = "iesve_record_mediacodec_profile"
            int r7 = r13.profile     // Catch:{ Exception -> 0x03e1 }
            long r12 = (long) r7     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.ttve.monitor.e.a((java.lang.String) r6, (long) r12)     // Catch:{ Exception -> 0x03e1 }
            goto L_0x02ba
        L_0x0294:
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r7 = "Do not support profile "
            r6.<init>(r7)     // Catch:{ Exception -> 0x03e1 }
            r6.append(r12)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r7 = ", use baseline"
            r6.append(r7)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.c(r1, r6)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = "te_mediacodec_profile"
            r6 = 1
            r9 = 0
            com.ss.android.ttve.monitor.e.a((int) r9, (java.lang.String) r1, (long) r6)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = "iesve_record_mediacodec_profile"
            com.ss.android.ttve.monitor.e.a((java.lang.String) r1, (long) r6)     // Catch:{ Exception -> 0x03e1 }
            r1 = r10
        L_0x02ba:
            r6 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 <= r6) goto L_0x02c2
            r1 = 12000000(0xb71b00, float:1.6815582E-38)
        L_0x02c2:
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r9 = "bitrate = "
            r7.<init>(r9)     // Catch:{ Exception -> 0x03e1 }
            float r9 = (float) r1     // Catch:{ Exception -> 0x03e1 }
            r12 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 * r12
            r12 = 1232348160(0x49742400, float:1000000.0)
            float r9 = r9 / r12
            r7.append(r9)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r9 = "Mb/s"
            r7.append(r9)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.a(r6, r7)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r9 = "speed = "
            r7.<init>(r9)     // Catch:{ Exception -> 0x03e1 }
            r9 = r29
            r7.append(r9)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.a(r6, r7)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r6 = "bitrate"
            r0.setInteger(r6, r1)     // Catch:{ Exception -> 0x03e1 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x03e1 }
            if (r1 < r4) goto L_0x036c
            android.media.MediaCodecInfo$EncoderCapabilities r1 = r5.getEncoderCapabilities()     // Catch:{ Exception -> 0x03e1 }
            r5 = 0
            r6 = 3
        L_0x0307:
            if (r5 >= r6) goto L_0x032d
            java.lang.String r7 = "AVCEncoder"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            r9.<init>()     // Catch:{ Exception -> 0x03e1 }
            java.lang.String[] r12 = k     // Catch:{ Exception -> 0x03e1 }
            r12 = r12[r5]     // Catch:{ Exception -> 0x03e1 }
            r9.append(r12)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r12 = ": "
            r9.append(r12)     // Catch:{ Exception -> 0x03e1 }
            boolean r12 = r1.isBitrateModeSupported(r5)     // Catch:{ Exception -> 0x03e1 }
            r9.append(r12)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.a(r7, r9)     // Catch:{ Exception -> 0x03e1 }
            int r5 = r5 + 1
            goto L_0x0307
        L_0x032d:
            java.lang.String r5 = "bitrate-mode"
            r0.setInteger(r5, r11)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r7 = "Bitrate mode = "
            r6.<init>(r7)     // Catch:{ Exception -> 0x03e1 }
            r6.append(r11)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.a(r5, r6)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r5 = "te_record_mediacodec_rate_control"
            long r6 = (long) r11     // Catch:{ Exception -> 0x03e1 }
            r9 = 0
            com.ss.android.ttve.monitor.e.a((int) r9, (java.lang.String) r5, (long) r6)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r5 = "max-bitrate"
            r0.setInteger(r5, r10)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r7 = "Encoder ComplexityRange: "
            r6.<init>(r7)     // Catch:{ Exception -> 0x03e1 }
            android.util.Range r1 = r1.getComplexityRange()     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03e1 }
            r6.append(r1)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.a(r5, r1)     // Catch:{ Exception -> 0x03e1 }
        L_0x036c:
            java.lang.String r1 = "color-format"
            int r5 = r8.v     // Catch:{ Exception -> 0x03e1 }
            r0.setInteger(r1, r5)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = "frame-rate"
            int r5 = r8.g     // Catch:{ Exception -> 0x03e1 }
            r0.setInteger(r1, r5)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = "i-frame-interval"
            r0.setInteger(r1, r2)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = "te_record_video_encode_gop"
            int r5 = r8.g     // Catch:{ Exception -> 0x03e1 }
            int r5 = r5 * 1
            long r5 = (long) r5     // Catch:{ Exception -> 0x03e1 }
            r7 = 0
            com.ss.android.ttve.monitor.e.a((int) r7, (java.lang.String) r1, (long) r5)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r6 = "initAVCEncoder: format = "
            r5.<init>(r6)     // Catch:{ Exception -> 0x03e1 }
            r5.append(r0)     // Catch:{ Exception -> 0x03e1 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x03e1 }
            com.ss.android.vesdk.y.a(r1, r5)     // Catch:{ Exception -> 0x03e1 }
            android.media.MediaCodec r1 = r8.m     // Catch:{ Exception -> 0x03e1 }
            r5 = 0
            r1.configure(r0, r5, r5, r2)     // Catch:{ Exception -> 0x03e1 }
            android.media.MediaCodec r0 = r8.m     // Catch:{ Exception -> 0x03e1 }
            android.view.Surface r0 = r0.createInputSurface()     // Catch:{ Exception -> 0x03e1 }
            r8.p = r0     // Catch:{ Exception -> 0x03e1 }
            android.media.MediaCodec r0 = r8.m     // Catch:{ Exception -> 0x03e1 }
            r0.start()     // Catch:{ Exception -> 0x03e1 }
            r8.f29339f = r3     // Catch:{ Exception -> 0x03e1 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x03e1 }
            if (r0 >= r4) goto L_0x03c6
            android.media.MediaCodec r0 = r8.m     // Catch:{ Exception -> 0x03e1 }
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch:{ Exception -> 0x03e1 }
            r8.f29337d = r0     // Catch:{ Exception -> 0x03e1 }
            android.media.MediaCodec r0 = r8.m     // Catch:{ Exception -> 0x03e1 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ Exception -> 0x03e1 }
            r8.f29338e = r0     // Catch:{ Exception -> 0x03e1 }
        L_0x03c6:
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x03e1 }
            r0.<init>()     // Catch:{ Exception -> 0x03e1 }
            r8.f29336c = r0     // Catch:{ Exception -> 0x03e1 }
            android.view.Surface r0 = r8.p     // Catch:{ all -> 0x03df }
            if (r0 != 0) goto L_0x03d4
            monitor-exit(r23)     // Catch:{ all -> 0x03df }
            r0 = 0
            return r0
        L_0x03d4:
            monitor-exit(r23)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r1 = "initAVCEncoder == exit"
            com.ss.android.vesdk.y.a(r0, r1)
            android.view.Surface r0 = r8.p
            return r0
        L_0x03df:
            r0 = move-exception
            goto L_0x03e4
        L_0x03e1:
            monitor-exit(r23)     // Catch:{ all -> 0x03df }
            r0 = 0
            return r0
        L_0x03e4:
            monitor-exit(r23)     // Catch:{ all -> 0x03df }
            throw r0
        L_0x03e6:
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.a(int, int, int, int, int, int, boolean):android.view.Surface");
    }

    static {
        new Thread(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29340a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f29340a, false, 16167, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f29340a, false, 16167, new Class[0], Void.TYPE);
                    return;
                }
                synchronized (a.class) {
                    MediaCodecList.getCodecCount();
                }
            }
        }).start();
    }

    private MediaCodecInfo d() {
        if (PatchProxy.isSupport(new Object[0], this, f29334a, false, 16150, new Class[0], MediaCodecInfo.class)) {
            return (MediaCodecInfo) PatchProxy.accessDispatch(new Object[0], this, f29334a, false, 16150, new Class[0], MediaCodecInfo.class);
        }
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(this.n)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29334a, false, 16161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29334a, false, 16161, new Class[0], Void.TYPE);
            return;
        }
        y.a("AVCEncoder", "uninitAVCEncoder == enter");
        synchronized (this) {
            if (this.f29339f != 0) {
                if (this.m != null) {
                    if (this.f29339f == 2) {
                        try {
                            this.m.stop();
                        } catch (Exception unused) {
                            y.d("AVCEncoder", "MediaCodec Exception");
                        }
                    }
                    this.f29339f = 3;
                    if (this.p != null) {
                        this.p.release();
                    }
                    c();
                    y.a("AVCEncoder", "uninitAVCEncoder == exit");
                }
            }
        }
    }

    public final synchronized void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29334a, false, 16162, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29334a, false, 16162, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.m.release();
        } catch (Exception unused) {
        }
        this.m = null;
        this.f29339f = 0;
        y.a("AVCEncoder", "time cost: " + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c6 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a     // Catch:{ all -> 0x01c6 }
            r4 = 0
            r5 = 16155(0x3f1b, float:2.2638E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x01c6 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x01c6 }
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01c6 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c6 }
            com.meituan.robust.ChangeQuickRedirect r4 = f29334a     // Catch:{ all -> 0x01c6 }
            r5 = 0
            r6 = 16155(0x3f1b, float:2.2638E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x01c6 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x01c6 }
            r3 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01c6 }
            monitor-exit(r12)
            return
        L_0x0025:
            int r1 = r12.f29339f     // Catch:{ all -> 0x01c6 }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r12)
            return
        L_0x002b:
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c6 }
            com.meituan.robust.ChangeQuickRedirect r4 = f29334a     // Catch:{ all -> 0x01c6 }
            r5 = 0
            r6 = 16154(0x3f1a, float:2.2637E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x01c6 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01c6 }
            r3 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01c6 }
            r2 = 1
            if (r1 == 0) goto L_0x0056
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c6 }
            com.meituan.robust.ChangeQuickRedirect r5 = f29334a     // Catch:{ all -> 0x01c6 }
            r6 = 0
            r7 = 16154(0x3f1a, float:2.2637E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ all -> 0x01c6 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01c6 }
            r4 = r12
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x01c6 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x01c6 }
            goto L_0x0165
        L_0x0056:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c6 }
            com.meituan.robust.ChangeQuickRedirect r5 = f29334a     // Catch:{ all -> 0x01c6 }
            r6 = 0
            r7 = 16152(0x3f18, float:2.2634E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ all -> 0x01c6 }
            java.lang.Class<int[]> r9 = int[].class
            r4 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01c6 }
            r3 = 0
            if (r1 == 0) goto L_0x007e
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c6 }
            com.meituan.robust.ChangeQuickRedirect r6 = f29334a     // Catch:{ all -> 0x01c6 }
            r7 = 0
            r8 = 16152(0x3f18, float:2.2634E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]     // Catch:{ all -> 0x01c6 }
            java.lang.Class<int[]> r10 = int[].class
            r5 = r12
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01c6 }
            r3 = r1
            int[] r3 = (int[]) r3     // Catch:{ all -> 0x01c6 }
            goto L_0x014a
        L_0x007e:
            java.lang.String r1 = "AVCEncoder"
            java.lang.String r4 = "start == "
            com.ss.android.vesdk.y.a(r1, r4)     // Catch:{ all -> 0x01c6 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01c6 }
            r4 = 21
            if (r1 < r4) goto L_0x0105
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c6 }
            com.meituan.robust.ChangeQuickRedirect r7 = f29334a     // Catch:{ all -> 0x01c6 }
            r8 = 0
            r9 = 16151(0x3f17, float:2.2632E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]     // Catch:{ all -> 0x01c6 }
            java.lang.Class<android.media.MediaCodecInfo> r11 = android.media.MediaCodecInfo.class
            r6 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01c6 }
            if (r1 == 0) goto L_0x00b0
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c6 }
            com.meituan.robust.ChangeQuickRedirect r6 = f29334a     // Catch:{ all -> 0x01c6 }
            r7 = 0
            r8 = 16151(0x3f17, float:2.2632E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]     // Catch:{ all -> 0x01c6 }
            java.lang.Class<android.media.MediaCodecInfo> r10 = android.media.MediaCodecInfo.class
            r5 = r12
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01c6 }
            android.media.MediaCodecInfo r1 = (android.media.MediaCodecInfo) r1     // Catch:{ all -> 0x01c6 }
            goto L_0x0109
        L_0x00b0:
            android.media.MediaCodecList r1 = new android.media.MediaCodecList     // Catch:{ all -> 0x01c6 }
            r1.<init>(r2)     // Catch:{ all -> 0x01c6 }
            android.media.MediaCodecInfo[] r1 = r1.getCodecInfos()     // Catch:{ all -> 0x01c6 }
            if (r1 == 0) goto L_0x0103
            int r4 = r1.length     // Catch:{ all -> 0x01c6 }
            if (r4 != 0) goto L_0x00bf
            goto L_0x0103
        L_0x00bf:
            int r4 = r1.length     // Catch:{ all -> 0x01c6 }
            r5 = 0
        L_0x00c1:
            if (r5 >= r4) goto L_0x0103
            r6 = r1[r5]     // Catch:{ all -> 0x01c6 }
            if (r6 == 0) goto L_0x0100
            boolean r7 = r6.isEncoder()     // Catch:{ all -> 0x01c6 }
            if (r7 == 0) goto L_0x0100
            java.lang.String r7 = r6.getName()     // Catch:{ all -> 0x01c6 }
            java.lang.String r8 = "OMX.google."
            boolean r8 = r7.startsWith(r8)     // Catch:{ all -> 0x01c6 }
            if (r8 != 0) goto L_0x0100
            java.lang.String r8 = "OMX.Nvidia."
            boolean r8 = r7.startsWith(r8)     // Catch:{ all -> 0x01c6 }
            if (r8 != 0) goto L_0x0100
            java.lang.String r8 = "OMX.TI.DUCATI1.VIDEO.H264E"
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x01c6 }
            if (r7 != 0) goto L_0x0100
            java.lang.String[] r7 = r6.getSupportedTypes()     // Catch:{ all -> 0x01c6 }
            r8 = 0
        L_0x00ee:
            int r9 = r7.length     // Catch:{ all -> 0x01c6 }
            if (r8 >= r9) goto L_0x0100
            r9 = r7[r8]     // Catch:{ all -> 0x01c6 }
            java.lang.String r10 = r12.n     // Catch:{ all -> 0x01c6 }
            boolean r9 = r9.equalsIgnoreCase(r10)     // Catch:{ all -> 0x01c6 }
            if (r9 == 0) goto L_0x00fd
            r1 = r6
            goto L_0x0109
        L_0x00fd:
            int r8 = r8 + 1
            goto L_0x00ee
        L_0x0100:
            int r5 = r5 + 1
            goto L_0x00c1
        L_0x0103:
            r1 = r3
            goto L_0x0109
        L_0x0105:
            android.media.MediaCodecInfo r1 = r12.d()     // Catch:{ all -> 0x01c6 }
        L_0x0109:
            r12.o = r1     // Catch:{ all -> 0x01c6 }
            java.lang.String r1 = "AVCEncoder"
            java.lang.String r4 = "end == "
            com.ss.android.vesdk.y.a(r1, r4)     // Catch:{ all -> 0x01c6 }
            android.media.MediaCodecInfo r1 = r12.o     // Catch:{ all -> 0x01c6 }
            if (r1 != 0) goto L_0x0117
            goto L_0x014a
        L_0x0117:
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c6 }
            java.lang.String r4 = "mMediaCodecInfo name = "
            r3.<init>(r4)     // Catch:{ all -> 0x01c6 }
            android.media.MediaCodecInfo r4 = r12.o     // Catch:{ all -> 0x01c6 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x01c6 }
            r3.append(r4)     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c6 }
            com.ss.android.vesdk.y.a(r1, r3)     // Catch:{ all -> 0x01c6 }
            android.media.MediaCodecInfo r1 = r12.o     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = r12.n     // Catch:{ all -> 0x01c6 }
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.getCapabilitiesForType(r3)     // Catch:{ all -> 0x01c6 }
            int[] r3 = r1.colorFormats     // Catch:{ all -> 0x01c6 }
            int r3 = r3.length     // Catch:{ all -> 0x01c6 }
            int[] r4 = new int[r3]     // Catch:{ all -> 0x01c6 }
            r5 = 0
        L_0x013e:
            if (r5 >= r3) goto L_0x0149
            int[] r6 = r1.colorFormats     // Catch:{ all -> 0x01c6 }
            r6 = r6[r5]     // Catch:{ all -> 0x01c6 }
            r4[r5] = r6     // Catch:{ all -> 0x01c6 }
            int r5 = r5 + 1
            goto L_0x013e
        L_0x0149:
            r3 = r4
        L_0x014a:
            if (r3 == 0) goto L_0x0164
            r1 = 0
        L_0x014d:
            int r4 = r3.length     // Catch:{ all -> 0x01c6 }
            if (r1 >= r4) goto L_0x0164
            r4 = r3[r1]     // Catch:{ all -> 0x01c6 }
            r5 = 2130708361(0x7f000789, float:1.701803E38)
            if (r4 != r5) goto L_0x0161
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r5 = "====== mColorFormat support COLOR_FormatSurface ======"
            com.ss.android.vesdk.y.a(r4, r5)     // Catch:{ all -> 0x01c6 }
            r1 = r3[r1]     // Catch:{ all -> 0x01c6 }
            goto L_0x0165
        L_0x0161:
            int r1 = r1 + 1
            goto L_0x014d
        L_0x0164:
            r1 = -1
        L_0x0165:
            r12.v = r1     // Catch:{ all -> 0x01c6 }
            int r1 = r12.v     // Catch:{ all -> 0x01c6 }
            if (r1 >= 0) goto L_0x016d
            monitor-exit(r12)
            return
        L_0x016d:
            java.lang.String r1 = r12.n     // Catch:{ IOException -> 0x01ac }
            android.media.MediaCodec r1 = android.media.MediaCodec.createEncoderByType(r1)     // Catch:{ IOException -> 0x01ac }
            r12.m = r1     // Catch:{ IOException -> 0x01ac }
            android.media.MediaCodec r1 = r12.m     // Catch:{ all -> 0x01c6 }
            android.media.MediaCodecInfo r1 = r1.getCodecInfo()     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = r1.getName()     // Catch:{ all -> 0x01c6 }
            java.lang.String r4 = "OMX.google."
            boolean r3 = r3.startsWith(r4)     // Catch:{ all -> 0x01c6 }
            if (r3 == 0) goto L_0x0189
            monitor-exit(r12)
            return
        L_0x0189:
            java.lang.String[] r1 = r1.getSupportedTypes()     // Catch:{ all -> 0x01c6 }
            int r3 = r1.length     // Catch:{ all -> 0x01c6 }
        L_0x018e:
            if (r0 >= r3) goto L_0x01a8
            r4 = r1[r0]     // Catch:{ all -> 0x01c6 }
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c6 }
            java.lang.String r7 = "CodecNames: "
            r6.<init>(r7)     // Catch:{ all -> 0x01c6 }
            r6.append(r4)     // Catch:{ all -> 0x01c6 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x01c6 }
            com.ss.android.vesdk.y.a(r5, r4)     // Catch:{ all -> 0x01c6 }
            int r0 = r0 + 1
            goto L_0x018e
        L_0x01a8:
            r12.f29339f = r2     // Catch:{ all -> 0x01c6 }
            monitor-exit(r12)
            return
        L_0x01ac:
            r0 = move-exception
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "createEncoderByTyp: "
            r2.<init>(r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01c6 }
            r2.append(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01c6 }
            com.ss.android.vesdk.y.d(r1, r0)     // Catch:{ all -> 0x01c6 }
            monitor-exit(r12)
            return
        L_0x01c6:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.a():void");
    }

    public static void a(int i2) {
        l = i2;
    }

    public static void a(b bVar) {
        f29335b = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:4|5|6|7|8|9|10|11|12|13|14|15|17) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0070 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e A[SYNTHETIC, Splitter:B:31:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3 A[SYNTHETIC, Splitter:B:35:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ac A[SYNTHETIC, Splitter:B:42:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1 A[SYNTHETIC, Splitter:B:46:0x00b1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.graphics.Bitmap r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f29334a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 16164(0x3f24, float:2.265E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f29334a
            r15 = 0
            r16 = 16164(0x3f24, float:2.265E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "saving Bitmap : "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.ss.android.vesdk.y.a(r2, r3)
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0095 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0095 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x008f, all -> 0x008c }
            r5 = 100
            r0.compress(r2, r5, r4)     // Catch:{ IOException -> 0x008f, all -> 0x008c }
            r4.flush()     // Catch:{ IOException -> 0x008f, all -> 0x008c }
            r4.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            r3.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            java.lang.String r0 = "AVCEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Bitmap "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " saved!"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.ss.android.vesdk.y.a(r0, r1)
            return
        L_0x008c:
            r0 = move-exception
            r2 = r4
            goto L_0x00aa
        L_0x008f:
            r2 = r4
            goto L_0x0095
        L_0x0091:
            r0 = move-exception
            r3 = r2
            goto L_0x00aa
        L_0x0094:
            r3 = r2
        L_0x0095:
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r1 = "Err when saving bitmap..."
            com.ss.android.vesdk.y.d(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x00a1
            r2.close()     // Catch:{ IOException -> 0x00a1 }
        L_0x00a1:
            if (r3 == 0) goto L_0x00a8
            r3.close()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00a8
        L_0x00a7:
            return
        L_0x00a8:
            return
        L_0x00a9:
            r0 = move-exception
        L_0x00aa:
            if (r2 == 0) goto L_0x00af
            r2.close()     // Catch:{ IOException -> 0x00af }
        L_0x00af:
            if (r3 == 0) goto L_0x00b4
            r3.close()     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.a(android.graphics.Bitmap, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0204, code lost:
        return 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(byte[] r23, int r24, boolean r25) {
        /*
            r22 = this;
            r8 = r22
            r0 = r23
            r9 = r24
            r10 = r25
            r11 = 3
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r12 = 0
            r1[r12] = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r13 = 1
            r1[r13] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r25)
            r14 = 2
            r1[r14] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<byte[]> r2 = byte[].class
            r6[r12] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r13] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r14] = r2
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 16166(0x3f26, float:2.2653E-41)
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x006b
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r1[r13] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r25)
            r1[r14] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a
            r4 = 0
            r5 = 16166(0x3f26, float:2.2653E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<byte[]> r0 = byte[].class
            r6[r12] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r13] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r14] = r0
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r22
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x006b:
            monitor-enter(r22)
            int r1 = r8.f29339f     // Catch:{ all -> 0x0208 }
            if (r1 != r14) goto L_0x0205
            android.media.MediaCodec r1 = r8.m     // Catch:{ all -> 0x0208 }
            if (r1 != 0) goto L_0x0076
            goto L_0x0205
        L_0x0076:
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0208 }
            java.lang.String r3 = "encodeBuffer pts: "
            r2.<init>(r3)     // Catch:{ all -> 0x0208 }
            r2.append(r9)     // Catch:{ all -> 0x0208 }
            java.lang.String r3 = "  isEndStream = "
            r2.append(r3)     // Catch:{ all -> 0x0208 }
            r2.append(r10)     // Catch:{ all -> 0x0208 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0208 }
            com.ss.android.vesdk.y.b(r1, r2)     // Catch:{ all -> 0x0208 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0208 }
            r2 = 21
            r3 = 0
            r5 = 4
            r6 = -1
            if (r1 < r2) goto L_0x0160
            android.media.MediaCodec r1 = r8.m     // Catch:{ all -> 0x0208 }
            int r1 = r1.dequeueInputBuffer(r6)     // Catch:{ all -> 0x0208 }
            if (r1 < 0) goto L_0x00c7
            android.media.MediaCodec r2 = r8.m     // Catch:{ all -> 0x0208 }
            java.nio.ByteBuffer r2 = r2.getInputBuffer(r1)     // Catch:{ all -> 0x0208 }
            r2.clear()     // Catch:{ all -> 0x0208 }
            int r6 = r0.length     // Catch:{ all -> 0x0208 }
            r2.put(r0, r12, r6)     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec r15 = r8.m     // Catch:{ all -> 0x0208 }
            r17 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0208 }
            long r6 = (long) r9     // Catch:{ all -> 0x0208 }
            if (r10 != r13) goto L_0x00bc
            r21 = 4
            goto L_0x00be
        L_0x00bc:
            r21 = 0
        L_0x00be:
            r16 = r1
            r18 = r0
            r19 = r6
            r15.queueInputBuffer(r16, r17, r18, r19, r21)     // Catch:{ all -> 0x0208 }
        L_0x00c7:
            android.media.MediaCodec r0 = r8.m     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r1 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r2 = l     // Catch:{ all -> 0x0208 }
            long r5 = (long) r2     // Catch:{ all -> 0x0208 }
            int r0 = r0.dequeueOutputBuffer(r1, r5)     // Catch:{ all -> 0x0208 }
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0208 }
            java.lang.String r5 = "outputBufferIndex = "
            r2.<init>(r5)     // Catch:{ all -> 0x0208 }
            r2.append(r0)     // Catch:{ all -> 0x0208 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0208 }
            com.ss.android.vesdk.y.b(r1, r2)     // Catch:{ all -> 0x0208 }
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0208 }
            java.lang.String r5 = "mBufferInfo.flags = "
            r2.<init>(r5)     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r5 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r5 = r5.flags     // Catch:{ all -> 0x0208 }
            r2.append(r5)     // Catch:{ all -> 0x0208 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0208 }
            com.ss.android.vesdk.y.b(r1, r2)     // Catch:{ all -> 0x0208 }
        L_0x00fc:
            if (r0 < 0) goto L_0x0203
            android.media.MediaCodec r1 = r8.m     // Catch:{ all -> 0x0208 }
            java.nio.ByteBuffer r1 = r1.getOutputBuffer(r0)     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r2 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r2 = r2.offset     // Catch:{ all -> 0x0208 }
            r1.position(r2)     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r2 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r2 = r2.offset     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r5 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r5 = r5.size     // Catch:{ all -> 0x0208 }
            int r2 = r2 + r5
            r1.limit(r2)     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r2 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r2 = r2.flags     // Catch:{ all -> 0x0208 }
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0133
            java.lang.String r2 = "AVCEncoder"
            java.lang.String r5 = "mEncoderCaller.onSetCodecConfig"
            com.ss.android.vesdk.y.b(r2, r5)     // Catch:{ all -> 0x0208 }
            com.ss.android.medialib.b r2 = f29335b     // Catch:{ all -> 0x0208 }
            if (r2 == 0) goto L_0x012e
            com.ss.android.medialib.b r2 = f29335b     // Catch:{ all -> 0x0208 }
            r2.onSetCodecConfig(r1)     // Catch:{ all -> 0x0208 }
        L_0x012e:
            android.media.MediaCodec$BufferInfo r1 = r8.f29336c     // Catch:{ all -> 0x0208 }
            r1.size = r12     // Catch:{ all -> 0x0208 }
            goto L_0x0152
        L_0x0133:
            android.media.MediaCodec$BufferInfo r2 = r8.f29336c     // Catch:{ all -> 0x0208 }
            long r5 = r2.presentationTimeUs     // Catch:{ all -> 0x0208 }
            int r2 = (int) r5     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r5 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r5 = r5.flags     // Catch:{ all -> 0x0208 }
            r5 = r5 & r13
            if (r5 == 0) goto L_0x0141
            r5 = 1
            goto L_0x0142
        L_0x0141:
            r5 = 0
        L_0x0142:
            java.lang.String r6 = "AVCEncoder"
            java.lang.String r7 = "mEncoderCaller.onWriteFile"
            com.ss.android.vesdk.y.b(r6, r7)     // Catch:{ all -> 0x0208 }
            com.ss.android.medialib.b r6 = f29335b     // Catch:{ all -> 0x0208 }
            if (r6 == 0) goto L_0x0152
            com.ss.android.medialib.b r6 = f29335b     // Catch:{ all -> 0x0208 }
            r6.onWriteFile(r1, r2, r12, r5)     // Catch:{ all -> 0x0208 }
        L_0x0152:
            android.media.MediaCodec r1 = r8.m     // Catch:{ all -> 0x0208 }
            r1.releaseOutputBuffer(r0, r12)     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec r0 = r8.m     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r1 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r0 = r0.dequeueOutputBuffer(r1, r3)     // Catch:{ all -> 0x0208 }
            goto L_0x00fc
        L_0x0160:
            android.media.MediaCodec r1 = r8.m     // Catch:{ all -> 0x0208 }
            int r16 = r1.dequeueInputBuffer(r6)     // Catch:{ all -> 0x0208 }
            if (r16 < 0) goto L_0x0187
            java.nio.ByteBuffer[] r1 = r8.f29337d     // Catch:{ all -> 0x0208 }
            r1 = r1[r16]     // Catch:{ all -> 0x0208 }
            r1.clear()     // Catch:{ all -> 0x0208 }
            int r2 = r0.length     // Catch:{ all -> 0x0208 }
            r1.put(r0, r12, r2)     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec r15 = r8.m     // Catch:{ all -> 0x0208 }
            r17 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0208 }
            long r1 = (long) r9     // Catch:{ all -> 0x0208 }
            if (r10 != r13) goto L_0x017e
            r21 = 4
            goto L_0x0180
        L_0x017e:
            r21 = 0
        L_0x0180:
            r18 = r0
            r19 = r1
            r15.queueInputBuffer(r16, r17, r18, r19, r21)     // Catch:{ all -> 0x0208 }
        L_0x0187:
            android.media.MediaCodec r0 = r8.m     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r1 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r2 = l     // Catch:{ all -> 0x0208 }
            long r5 = (long) r2     // Catch:{ all -> 0x0208 }
            int r0 = r0.dequeueOutputBuffer(r1, r5)     // Catch:{ all -> 0x0208 }
        L_0x0192:
            if (r0 < 0) goto L_0x0203
            r1 = -3
            if (r0 != r1) goto L_0x01a0
            android.media.MediaCodec r0 = r8.m     // Catch:{ all -> 0x0208 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ all -> 0x0208 }
            r8.f29338e = r0     // Catch:{ all -> 0x0208 }
            goto L_0x01fa
        L_0x01a0:
            r1 = -2
            if (r0 == r1) goto L_0x01fa
            java.nio.ByteBuffer[] r1 = r8.f29338e     // Catch:{ all -> 0x0208 }
            r1 = r1[r0]     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r2 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r2 = r2.offset     // Catch:{ all -> 0x0208 }
            r1.position(r2)     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r2 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r2 = r2.offset     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r5 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r5 = r5.size     // Catch:{ all -> 0x0208 }
            int r2 = r2 + r5
            r1.limit(r2)     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r2 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r2 = r2.flags     // Catch:{ all -> 0x0208 }
            r2 = r2 & r14
            if (r2 == 0) goto L_0x01d6
            java.lang.String r2 = "AVCEncoder"
            java.lang.String r5 = "mEncoderCaller.onSetCodecConfig"
            com.ss.android.vesdk.y.b(r2, r5)     // Catch:{ all -> 0x0208 }
            com.ss.android.medialib.b r2 = f29335b     // Catch:{ all -> 0x0208 }
            if (r2 == 0) goto L_0x01d1
            com.ss.android.medialib.b r2 = f29335b     // Catch:{ all -> 0x0208 }
            r2.onSetCodecConfig(r1)     // Catch:{ all -> 0x0208 }
        L_0x01d1:
            android.media.MediaCodec$BufferInfo r1 = r8.f29336c     // Catch:{ all -> 0x0208 }
            r1.size = r12     // Catch:{ all -> 0x0208 }
            goto L_0x01f5
        L_0x01d6:
            android.media.MediaCodec$BufferInfo r2 = r8.f29336c     // Catch:{ all -> 0x0208 }
            long r5 = r2.presentationTimeUs     // Catch:{ all -> 0x0208 }
            int r2 = (int) r5     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r5 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r5 = r5.flags     // Catch:{ all -> 0x0208 }
            r5 = r5 & r13
            if (r5 == 0) goto L_0x01e4
            r5 = 1
            goto L_0x01e5
        L_0x01e4:
            r5 = 0
        L_0x01e5:
            java.lang.String r6 = "AVCEncoder"
            java.lang.String r7 = "mEncoderCaller.onWriteFile"
            com.ss.android.vesdk.y.b(r6, r7)     // Catch:{ all -> 0x0208 }
            com.ss.android.medialib.b r6 = f29335b     // Catch:{ all -> 0x0208 }
            if (r6 == 0) goto L_0x01f5
            com.ss.android.medialib.b r6 = f29335b     // Catch:{ all -> 0x0208 }
            r6.onWriteFile(r1, r2, r12, r5)     // Catch:{ all -> 0x0208 }
        L_0x01f5:
            android.media.MediaCodec r1 = r8.m     // Catch:{ all -> 0x0208 }
            r1.releaseOutputBuffer(r0, r12)     // Catch:{ all -> 0x0208 }
        L_0x01fa:
            android.media.MediaCodec r0 = r8.m     // Catch:{ all -> 0x0208 }
            android.media.MediaCodec$BufferInfo r1 = r8.f29336c     // Catch:{ all -> 0x0208 }
            int r0 = r0.dequeueOutputBuffer(r1, r3)     // Catch:{ all -> 0x0208 }
            goto L_0x0192
        L_0x0203:
            monitor-exit(r22)     // Catch:{ all -> 0x0208 }
            return r12
        L_0x0205:
            r0 = -1
            monitor-exit(r22)     // Catch:{ all -> 0x0208 }
            return r0
        L_0x0208:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0208 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.a(byte[], int, boolean):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:44|45|46|(1:48)|49|50|51|(2:53|54)|66|67|(1:69)(1:70)|71) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:55|56|57|(1:59)|60|61) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:75|76|77|78|79|80) */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x033c, code lost:
        if (r3 >= 0) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x033e, code lost:
        com.ss.android.vesdk.y.b("AVCEncoder", "encode: error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0378, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x037c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x037e, code lost:
        r2 = r8.m.getOutputBuffer(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0385, code lost:
        r2 = r8.f29338e[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0389, code lost:
        r2.position(r8.f29336c.offset);
        r2.limit(r8.f29336c.offset + r8.f29336c.size);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a2, code lost:
        if ((r8.f29336c.flags & 2) == 0) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03a4, code lost:
        com.ss.android.vesdk.y.b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03ad, code lost:
        if (f29335b == null) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03af, code lost:
        f29335b.onSetCodecConfig(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03b4, code lost:
        r8.f29336c.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03bf, code lost:
        if ((r8.f29336c.flags & 1) == 0) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03c1, code lost:
        r25 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03c4, code lost:
        r25 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03c6, code lost:
        com.ss.android.vesdk.y.b("AVCEncoder", "mEncoderCaller.onWriteFile");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03cf, code lost:
        if (f29335b == null) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03d1, code lost:
        com.ss.android.vesdk.y.b("AVCEncoder", "encode: pts queue size = " + r8.u.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03f0, code lost:
        if (r8.u.size() <= 0) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03f2, code lost:
        r8.x++;
        r4 = r8.u.poll();
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0407, code lost:
        if (r8.f29336c.presentationTimeUs <= 0) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0409, code lost:
        r15 = r8.f29336c.presentationTimeUs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x040e, code lost:
        f29335b.onWriteFile(r2, r15 / 1000, (long) ((java.lang.Integer) r4.first).intValue(), ((java.lang.Integer) r4.second).intValue(), r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x042d, code lost:
        com.ss.android.vesdk.y.c("AVCEncoder", "encode: no available pts!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0435, code lost:
        com.ss.android.vesdk.y.b("AVCEncoder", "encode: no output.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0292 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0293 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x029a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x02c2 */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02a9 A[Catch:{ IOException -> 0x0293, all -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02af A[Catch:{ IOException -> 0x0293, all -> 0x0288 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x0292=Splitter:B:60:0x0292, B:77:0x02c2=Splitter:B:77:0x02c2, B:66:0x029a=Splitter:B:66:0x029a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r27, int r28, int r29, boolean r30) {
        /*
            r26 = this;
            r8 = r26
            r0 = r27
            r9 = r28
            r10 = r30
            r11 = 4
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
            r12 = 0
            r1[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r13 = 1
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            r14 = 2
            r1[r14] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r30)
            r15 = 3
            r1[r15] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r12] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r13] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r14] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r15] = r2
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 16165(0x3f25, float:2.2652E-41)
            r2 = r26
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0088
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            r1[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r1[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            r1[r14] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r30)
            r1[r15] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a
            r4 = 0
            r5 = 16165(0x3f25, float:2.2652E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r12] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r13] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r14] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r15] = r0
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r26
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0088:
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "encodeTexture::texID: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " pts: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " duration:"
            r2.append(r3)
            r15 = r29
            r2.append(r15)
            java.lang.String r3 = "  isEndStream = "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.ss.android.vesdk.y.b(r1, r2)
            monitor-enter(r26)
            int r1 = r8.f29339f     // Catch:{ all -> 0x046f }
            r7 = -1
            if (r1 != r14) goto L_0x0465
            android.media.MediaCodec r1 = r8.m     // Catch:{ all -> 0x046f }
            if (r1 != 0) goto L_0x00c1
            goto L_0x0465
        L_0x00c1:
            if (r0 <= 0) goto L_0x0447
            if (r9 >= 0) goto L_0x00c7
            goto L_0x0447
        L_0x00c7:
            com.ss.android.medialib.common.e r1 = r8.q     // Catch:{ all -> 0x046f }
            r6 = 0
            if (r1 != 0) goto L_0x016f
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x046f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a     // Catch:{ all -> 0x046f }
            r4 = 0
            r5 = 16159(0x3f1f, float:2.2644E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]     // Catch:{ all -> 0x046f }
            java.lang.Class r16 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x046f }
            r17 = r2
            r2 = r26
            r14 = r6
            r6 = r17
            r14 = -1
            r7 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x046f }
            if (r1 == 0) goto L_0x00ff
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x046f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a     // Catch:{ all -> 0x046f }
            r4 = 0
            r5 = 16159(0x3f1f, float:2.2644E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ all -> 0x046f }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x046f }
            r2 = r26
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x046f }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x046f }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x046f }
            goto L_0x016b
        L_0x00ff:
            android.view.Surface r1 = r8.p     // Catch:{ all -> 0x046f }
            if (r1 != 0) goto L_0x010c
            java.lang.String r1 = "AVCEncoder"
            java.lang.String r2 = "initEGLCtx: MediaCodec should initialized ahead."
            com.ss.android.vesdk.y.d(r1, r2)     // Catch:{ all -> 0x046f }
            r1 = 0
            goto L_0x016b
        L_0x010c:
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x046f }
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.medialib.common.e.f29638a     // Catch:{ all -> 0x046f }
            r22 = 1
            r23 = 17123(0x42e3, float:2.3994E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]     // Catch:{ all -> 0x046f }
            java.lang.Class<com.ss.android.medialib.common.e> r25 = com.ss.android.medialib.common.e.class
            r19 = r1
            r24 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x046f }
            if (r1 == 0) goto L_0x013d
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x046f }
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.medialib.common.e.f29638a     // Catch:{ all -> 0x046f }
            r22 = 1
            r23 = 17123(0x42e3, float:2.3994E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]     // Catch:{ all -> 0x046f }
            java.lang.Class<com.ss.android.medialib.common.e> r25 = com.ss.android.medialib.common.e.class
            r19 = r1
            r24 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x046f }
            com.ss.android.medialib.common.e r1 = (com.ss.android.medialib.common.e) r1     // Catch:{ all -> 0x046f }
            goto L_0x0159
        L_0x013d:
            com.ss.android.medialib.common.e r6 = new com.ss.android.medialib.common.e     // Catch:{ all -> 0x046f }
            r6.<init>()     // Catch:{ all -> 0x046f }
            java.lang.String r1 = "attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}"
            java.lang.String r2 = "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n}"
            boolean r1 = r6.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x046f }
            if (r1 != 0) goto L_0x0158
            java.lang.String r1 = "TextureDrawer"
            java.lang.String r2 = "TextureDrawer create failed!"
            com.ss.android.vesdk.y.d(r1, r2)     // Catch:{ all -> 0x046f }
            r6.a()     // Catch:{ all -> 0x046f }
            r1 = 0
            goto L_0x0159
        L_0x0158:
            r1 = r6
        L_0x0159:
            r8.q = r1     // Catch:{ all -> 0x046f }
            com.ss.android.medialib.common.e r1 = r8.q     // Catch:{ all -> 0x046f }
            r2 = 0
            r1.a(r2)     // Catch:{ all -> 0x046f }
            com.ss.android.medialib.common.e r1 = r8.q     // Catch:{ all -> 0x046f }
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.a((float) r2, (float) r3)     // Catch:{ all -> 0x046f }
            r1 = 1
        L_0x016b:
            if (r1 != 0) goto L_0x0170
            monitor-exit(r26)     // Catch:{ all -> 0x046f }
            return r14
        L_0x016f:
            r14 = -1
        L_0x0170:
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r1 = r8.u     // Catch:{ all -> 0x046f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x046f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r29)     // Catch:{ all -> 0x046f }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ all -> 0x046f }
            r1.offer(r2)     // Catch:{ all -> 0x046f }
            int r1 = r8.r     // Catch:{ all -> 0x046f }
            int r2 = r8.s     // Catch:{ all -> 0x046f }
            android.opengl.GLES20.glViewport(r12, r12, r1, r2)     // Catch:{ all -> 0x046f }
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x046f }
            java.lang.String r3 = "encode: width = "
            r2.<init>(r3)     // Catch:{ all -> 0x046f }
            int r3 = r8.r     // Catch:{ all -> 0x046f }
            r2.append(r3)     // Catch:{ all -> 0x046f }
            java.lang.String r3 = " height = "
            r2.append(r3)     // Catch:{ all -> 0x046f }
            int r3 = r8.s     // Catch:{ all -> 0x046f }
            r2.append(r3)     // Catch:{ all -> 0x046f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x046f }
            com.ss.android.vesdk.y.b(r1, r2)     // Catch:{ all -> 0x046f }
            com.ss.android.medialib.common.e r1 = r8.q     // Catch:{ all -> 0x046f }
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x046f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r27)     // Catch:{ all -> 0x046f }
            r2[r12] = r3     // Catch:{ all -> 0x046f }
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.medialib.common.e.f29638a     // Catch:{ all -> 0x046f }
            r22 = 0
            r23 = 17125(0x42e5, float:2.3997E-41)
            java.lang.Class[] r3 = new java.lang.Class[r13]     // Catch:{ all -> 0x046f }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x046f }
            r3[r12] = r4     // Catch:{ all -> 0x046f }
            java.lang.Class r25 = java.lang.Void.TYPE     // Catch:{ all -> 0x046f }
            r19 = r2
            r20 = r1
            r24 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x046f }
            if (r2 == 0) goto L_0x01eb
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x046f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)     // Catch:{ all -> 0x046f }
            r2[r12] = r0     // Catch:{ all -> 0x046f }
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.medialib.common.e.f29638a     // Catch:{ all -> 0x046f }
            r22 = 0
            r23 = 17125(0x42e5, float:2.3997E-41)
            java.lang.Class[] r0 = new java.lang.Class[r13]     // Catch:{ all -> 0x046f }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x046f }
            r0[r12] = r3     // Catch:{ all -> 0x046f }
            java.lang.Class r25 = java.lang.Void.TYPE     // Catch:{ all -> 0x046f }
            r19 = r2
            r20 = r1
            r24 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x046f }
            goto L_0x01f0
        L_0x01eb:
            r2 = 3553(0xde1, float:4.979E-42)
            r1.a((int) r0, (int) r2)     // Catch:{ all -> 0x046f }
        L_0x01f0:
            android.opengl.GLES20.glFinish()     // Catch:{ all -> 0x046f }
            int r0 = r8.w     // Catch:{ all -> 0x046f }
            int r0 = r0 + r13
            r8.w = r0     // Catch:{ all -> 0x046f }
            com.ss.android.medialib.b r0 = f29335b     // Catch:{ all -> 0x046f }
            r0.onSwapGlBuffers()     // Catch:{ all -> 0x046f }
            boolean r0 = r8.t     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x02b9
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x046f }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r30)     // Catch:{ all -> 0x046f }
            r1[r12] = r0     // Catch:{ all -> 0x046f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a     // Catch:{ all -> 0x046f }
            r4 = 0
            r5 = 16163(0x3f23, float:2.2649E-41)
            java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x046f }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x046f }
            r6[r12] = r0     // Catch:{ all -> 0x046f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x046f }
            r2 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x023a
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x046f }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r30)     // Catch:{ all -> 0x046f }
            r1[r12] = r0     // Catch:{ all -> 0x046f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a     // Catch:{ all -> 0x046f }
            r4 = 0
            r5 = 16163(0x3f23, float:2.2649E-41)
            java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x046f }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x046f }
            r6[r12] = r0     // Catch:{ all -> 0x046f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x046f }
            r2 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x046f }
            goto L_0x02b7
        L_0x023a:
            int r0 = r8.r     // Catch:{ all -> 0x046f }
            int r1 = r8.s     // Catch:{ all -> 0x046f }
            int r0 = r0 * r1
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x046f }
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x046f }
            java.nio.ByteBuffer r0 = r0.order(r1)     // Catch:{ all -> 0x046f }
            r19 = 0
            r20 = 0
            int r1 = r8.r     // Catch:{ all -> 0x046f }
            int r2 = r8.s     // Catch:{ all -> 0x046f }
            r23 = 6408(0x1908, float:8.98E-42)
            r24 = 5121(0x1401, float:7.176E-42)
            r21 = r1
            r22 = r2
            r25 = r0
            android.opengl.GLES20.glReadPixels(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x046f }
            java.io.BufferedOutputStream r1 = r8.j     // Catch:{ IOException -> 0x0293, all -> 0x0288 }
            if (r1 != 0) goto L_0x0275
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0293, all -> 0x0288 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0293, all -> 0x0288 }
            java.lang.String r3 = "/storage/emulated/0/xzw/rgbaBig.rgba"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0293, all -> 0x0288 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0293, all -> 0x0288 }
            r8.j = r1     // Catch:{ IOException -> 0x0293, all -> 0x0288 }
        L_0x0275:
            java.io.BufferedOutputStream r1 = r8.j     // Catch:{ IOException -> 0x0293, all -> 0x0288 }
            byte[] r2 = r0.array()     // Catch:{ IOException -> 0x0293, all -> 0x0288 }
            r1.write(r2)     // Catch:{ IOException -> 0x0293, all -> 0x0288 }
            java.io.BufferedOutputStream r1 = r8.j     // Catch:{ IOException -> 0x029a }
            if (r1 == 0) goto L_0x029a
            java.io.BufferedOutputStream r1 = r8.j     // Catch:{ IOException -> 0x029a }
        L_0x0284:
            r1.close()     // Catch:{ IOException -> 0x029a }
            goto L_0x029a
        L_0x0288:
            r0 = move-exception
            java.io.BufferedOutputStream r1 = r8.j     // Catch:{ IOException -> 0x0292 }
            if (r1 == 0) goto L_0x0292
            java.io.BufferedOutputStream r1 = r8.j     // Catch:{ IOException -> 0x0292 }
            r1.close()     // Catch:{ IOException -> 0x0292 }
        L_0x0292:
            throw r0     // Catch:{ all -> 0x046f }
        L_0x0293:
            java.io.BufferedOutputStream r1 = r8.j     // Catch:{ IOException -> 0x029a }
            if (r1 == 0) goto L_0x029a
            java.io.BufferedOutputStream r1 = r8.j     // Catch:{ IOException -> 0x029a }
            goto L_0x0284
        L_0x029a:
            int r1 = r8.r     // Catch:{ all -> 0x046f }
            int r2 = r8.s     // Catch:{ all -> 0x046f }
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x046f }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)     // Catch:{ all -> 0x046f }
            r1.copyPixelsFromBuffer(r0)     // Catch:{ all -> 0x046f }
            if (r10 == 0) goto L_0x02af
            java.lang.String r0 = "/sdcard/aweme/picture/record_e.jpeg"
            r8.a(r1, r0)     // Catch:{ all -> 0x046f }
            goto L_0x02b4
        L_0x02af:
            java.lang.String r0 = "/sdcard/aweme/picture/record_s.jpeg"
            r8.a(r1, r0)     // Catch:{ all -> 0x046f }
        L_0x02b4:
            r1.recycle()     // Catch:{ all -> 0x046f }
        L_0x02b7:
            r8.t = r12     // Catch:{ all -> 0x046f }
        L_0x02b9:
            r0 = -2
            if (r10 == 0) goto L_0x02c6
            android.media.MediaCodec r1 = r8.m     // Catch:{ Throwable -> 0x02c2 }
            r1.signalEndOfInputStream()     // Catch:{ Throwable -> 0x02c2 }
            goto L_0x02c6
        L_0x02c2:
            r8.i = r13     // Catch:{ all -> 0x046f }
            monitor-exit(r26)     // Catch:{ all -> 0x046f }
            return r0
        L_0x02c6:
            r1 = 0
        L_0x02c7:
            int r1 = r1 + r13
            r2 = -3
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0443 }
            r4 = 21
            if (r3 >= r4) goto L_0x02d7
            android.media.MediaCodec r3 = r8.m     // Catch:{ Throwable -> 0x0443 }
            java.nio.ByteBuffer[] r3 = r3.getOutputBuffers()     // Catch:{ Throwable -> 0x0443 }
            r8.f29338e = r3     // Catch:{ Throwable -> 0x0443 }
        L_0x02d7:
            android.media.MediaCodec r3 = r8.m     // Catch:{ Throwable -> 0x0443 }
            android.media.MediaCodec$BufferInfo r5 = r8.f29336c     // Catch:{ Throwable -> 0x0443 }
            int r6 = l     // Catch:{ Throwable -> 0x0443 }
            long r6 = (long) r6     // Catch:{ Throwable -> 0x0443 }
            int r3 = r3.dequeueOutputBuffer(r5, r6)     // Catch:{ Throwable -> 0x0443 }
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x046f }
            java.lang.String r7 = "outputBufferIndex = "
            r6.<init>(r7)     // Catch:{ all -> 0x046f }
            r6.append(r3)     // Catch:{ all -> 0x046f }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x046f }
            com.ss.android.vesdk.y.b(r5, r6)     // Catch:{ all -> 0x046f }
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x046f }
            java.lang.String r7 = "mBufferInfo.flags = "
            r6.<init>(r7)     // Catch:{ all -> 0x046f }
            android.media.MediaCodec$BufferInfo r7 = r8.f29336c     // Catch:{ all -> 0x046f }
            int r7 = r7.flags     // Catch:{ all -> 0x046f }
            r6.append(r7)     // Catch:{ all -> 0x046f }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x046f }
            com.ss.android.vesdk.y.b(r5, r6)     // Catch:{ all -> 0x046f }
            if (r3 != r14) goto L_0x0327
            if (r10 == 0) goto L_0x031a
            int r2 = l     // Catch:{ all -> 0x046f }
            r3 = 5000(0x1388, float:7.006E-42)
            if (r2 >= r3) goto L_0x031a
            r2 = 10000(0x2710, float:1.4013E-41)
            l = r2     // Catch:{ all -> 0x046f }
        L_0x031a:
            if (r10 == 0) goto L_0x0345
            int r2 = r8.w     // Catch:{ all -> 0x046f }
            int r3 = r8.x     // Catch:{ all -> 0x046f }
            if (r2 == r3) goto L_0x0345
            r2 = 10
            if (r1 >= r2) goto L_0x0345
            goto L_0x02c7
        L_0x0327:
            if (r3 != r2) goto L_0x0332
            android.media.MediaCodec r2 = r8.m     // Catch:{ all -> 0x046f }
            java.nio.ByteBuffer[] r2 = r2.getOutputBuffers()     // Catch:{ all -> 0x046f }
            r8.f29338e = r2     // Catch:{ all -> 0x046f }
            goto L_0x02c7
        L_0x0332:
            if (r3 != r0) goto L_0x033c
            java.lang.String r2 = "AVCEncoder"
            java.lang.String r3 = "encode: output format change!"
            com.ss.android.vesdk.y.b(r2, r3)     // Catch:{ all -> 0x046f }
            goto L_0x02c7
        L_0x033c:
            if (r3 >= 0) goto L_0x0379
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r1 = "encode: error."
            com.ss.android.vesdk.y.b(r0, r1)     // Catch:{ all -> 0x046f }
        L_0x0345:
            if (r10 == 0) goto L_0x0377
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x046f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a     // Catch:{ all -> 0x046f }
            r4 = 0
            r5 = 16160(0x3f20, float:2.2645E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ all -> 0x046f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x046f }
            r2 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x036b
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x046f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29334a     // Catch:{ all -> 0x046f }
            r4 = 0
            r5 = 16160(0x3f20, float:2.2645E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ all -> 0x046f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x046f }
            r2 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x046f }
            goto L_0x0377
        L_0x036b:
            com.ss.android.medialib.common.e r0 = r8.q     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x0377
            com.ss.android.medialib.common.e r0 = r8.q     // Catch:{ all -> 0x046f }
            r0.a()     // Catch:{ all -> 0x046f }
            r1 = 0
            r8.q = r1     // Catch:{ all -> 0x046f }
        L_0x0377:
            monitor-exit(r26)     // Catch:{ all -> 0x046f }
            return r12
        L_0x0379:
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x046f }
            if (r2 < r4) goto L_0x0385
            android.media.MediaCodec r2 = r8.m     // Catch:{ all -> 0x046f }
            java.nio.ByteBuffer r2 = r2.getOutputBuffer(r3)     // Catch:{ all -> 0x046f }
            goto L_0x0389
        L_0x0385:
            java.nio.ByteBuffer[] r2 = r8.f29338e     // Catch:{ all -> 0x046f }
            r2 = r2[r3]     // Catch:{ all -> 0x046f }
        L_0x0389:
            android.media.MediaCodec$BufferInfo r4 = r8.f29336c     // Catch:{ all -> 0x046f }
            int r4 = r4.offset     // Catch:{ all -> 0x046f }
            r2.position(r4)     // Catch:{ all -> 0x046f }
            android.media.MediaCodec$BufferInfo r4 = r8.f29336c     // Catch:{ all -> 0x046f }
            int r4 = r4.offset     // Catch:{ all -> 0x046f }
            android.media.MediaCodec$BufferInfo r5 = r8.f29336c     // Catch:{ all -> 0x046f }
            int r5 = r5.size     // Catch:{ all -> 0x046f }
            int r4 = r4 + r5
            r2.limit(r4)     // Catch:{ all -> 0x046f }
            android.media.MediaCodec$BufferInfo r4 = r8.f29336c     // Catch:{ all -> 0x046f }
            int r4 = r4.flags     // Catch:{ all -> 0x046f }
            r5 = 2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x03ba
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r6 = "mEncoderCaller.onSetCodecConfig"
            com.ss.android.vesdk.y.b(r4, r6)     // Catch:{ all -> 0x046f }
            com.ss.android.medialib.b r4 = f29335b     // Catch:{ all -> 0x046f }
            if (r4 == 0) goto L_0x03b4
            com.ss.android.medialib.b r4 = f29335b     // Catch:{ all -> 0x046f }
            r4.onSetCodecConfig(r2)     // Catch:{ all -> 0x046f }
        L_0x03b4:
            android.media.MediaCodec$BufferInfo r2 = r8.f29336c     // Catch:{ all -> 0x046f }
            r2.size = r12     // Catch:{ all -> 0x046f }
            goto L_0x043c
        L_0x03ba:
            android.media.MediaCodec$BufferInfo r4 = r8.f29336c     // Catch:{ all -> 0x046f }
            int r4 = r4.flags     // Catch:{ all -> 0x046f }
            r4 = r4 & r13
            if (r4 == 0) goto L_0x03c4
            r25 = 1
            goto L_0x03c6
        L_0x03c4:
            r25 = 0
        L_0x03c6:
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r6 = "mEncoderCaller.onWriteFile"
            com.ss.android.vesdk.y.b(r4, r6)     // Catch:{ all -> 0x046f }
            com.ss.android.medialib.b r4 = f29335b     // Catch:{ all -> 0x046f }
            if (r4 == 0) goto L_0x0435
            java.lang.String r4 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x046f }
            java.lang.String r7 = "encode: pts queue size = "
            r6.<init>(r7)     // Catch:{ all -> 0x046f }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r7 = r8.u     // Catch:{ all -> 0x046f }
            int r7 = r7.size()     // Catch:{ all -> 0x046f }
            r6.append(r7)     // Catch:{ all -> 0x046f }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x046f }
            com.ss.android.vesdk.y.b(r4, r6)     // Catch:{ all -> 0x046f }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r4 = r8.u     // Catch:{ all -> 0x046f }
            int r4 = r4.size()     // Catch:{ all -> 0x046f }
            if (r4 <= 0) goto L_0x042d
            int r4 = r8.x     // Catch:{ all -> 0x046f }
            int r4 = r4 + r13
            r8.x = r4     // Catch:{ all -> 0x046f }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r4 = r8.u     // Catch:{ all -> 0x046f }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x046f }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x046f }
            android.media.MediaCodec$BufferInfo r6 = r8.f29336c     // Catch:{ all -> 0x046f }
            long r6 = r6.presentationTimeUs     // Catch:{ all -> 0x046f }
            r15 = 0
            int r9 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x040e
            android.media.MediaCodec$BufferInfo r6 = r8.f29336c     // Catch:{ all -> 0x046f }
            long r6 = r6.presentationTimeUs     // Catch:{ all -> 0x046f }
            r15 = r6
        L_0x040e:
            com.ss.android.medialib.b r18 = f29335b     // Catch:{ all -> 0x046f }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r20 = r15 / r6
            java.lang.Object r6 = r4.first     // Catch:{ all -> 0x046f }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x046f }
            int r6 = r6.intValue()     // Catch:{ all -> 0x046f }
            long r6 = (long) r6     // Catch:{ all -> 0x046f }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x046f }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x046f }
            int r24 = r4.intValue()     // Catch:{ all -> 0x046f }
            r19 = r2
            r22 = r6
            r18.onWriteFile(r19, r20, r22, r24, r25)     // Catch:{ all -> 0x046f }
            goto L_0x043c
        L_0x042d:
            java.lang.String r2 = "AVCEncoder"
            java.lang.String r4 = "encode: no available pts!!!"
            com.ss.android.vesdk.y.c(r2, r4)     // Catch:{ all -> 0x046f }
            goto L_0x043c
        L_0x0435:
            java.lang.String r2 = "AVCEncoder"
            java.lang.String r4 = "encode: no output."
            com.ss.android.vesdk.y.b(r2, r4)     // Catch:{ all -> 0x046f }
        L_0x043c:
            android.media.MediaCodec r2 = r8.m     // Catch:{ all -> 0x046f }
            r2.releaseOutputBuffer(r3, r12)     // Catch:{ all -> 0x046f }
            goto L_0x02c6
        L_0x0443:
            r8.i = r13     // Catch:{ all -> 0x046f }
            monitor-exit(r26)     // Catch:{ all -> 0x046f }
            return r2
        L_0x0447:
            r14 = -1
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x046f }
            java.lang.String r3 = "encode: invalidate params: texID = "
            r2.<init>(r3)     // Catch:{ all -> 0x046f }
            r2.append(r0)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = ", pts = "
            r2.append(r0)     // Catch:{ all -> 0x046f }
            r2.append(r9)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x046f }
            com.ss.android.vesdk.y.d(r1, r0)     // Catch:{ all -> 0x046f }
            monitor-exit(r26)     // Catch:{ all -> 0x046f }
            return r14
        L_0x0465:
            r14 = -1
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r1 = "encode: codec is not ready."
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ all -> 0x046f }
            monitor-exit(r26)     // Catch:{ all -> 0x046f }
            return r14
        L_0x046f:
            r0 = move-exception
            monitor-exit(r26)     // Catch:{ all -> 0x046f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.a(int, int, int, boolean):int");
    }
}

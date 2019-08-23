package com.ss.android.medialib;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

@TargetApi(18)
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29402a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f29403b = "c";

    /* renamed from: c  reason: collision with root package name */
    static d f29404c = null;
    private static int u = 2000;
    private Queue<Pair<Integer, Integer>> A = new LinkedList();
    private int B = 0;
    private int C = 0;

    /* renamed from: d  reason: collision with root package name */
    MediaCodec.BufferInfo f29405d;

    /* renamed from: e  reason: collision with root package name */
    ByteBuffer[] f29406e;

    /* renamed from: f  reason: collision with root package name */
    ByteBuffer[] f29407f;
    public MediaCodec g;
    public Surface h;
    public l i;
    public int j = 0;
    public int k = 30;
    public float l = 1.0f;
    public int m = 1;
    public float n = 1.0f;
    public float o = 1.0f;
    public float p = 1.0f;
    public float q = 1.0f;
    public float r = 1.0f;
    public float s = 1.0f;
    BufferedOutputStream t = null;
    private String v = "video/avc";
    private MediaCodecInfo w;
    private int x;
    private int y;
    private boolean z;

    static {
        new Thread(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29408a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f29408a, false, 16181, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f29408a, false, 16181, new Class[0], Void.TYPE);
                    return;
                }
                MediaCodecList.getCodecCount();
            }
        }).start();
    }

    private MediaCodecInfo a() {
        if (PatchProxy.isSupport(new Object[0], this, f29402a, false, 16168, new Class[0], MediaCodecInfo.class)) {
            return (MediaCodecInfo) PatchProxy.accessDispatch(new Object[0], this, f29402a, false, 16168, new Class[0], MediaCodecInfo.class);
        }
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(this.v)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 16172(0x3f2c, float:2.2662E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29402a
            r5 = 0
            r6 = 16172(0x3f2c, float:2.2662E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002a:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a
            r4 = 0
            r5 = 16170(0x3f2a, float:2.2659E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<int[]> r7 = int[].class
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            if (r1 == 0) goto L_0x0052
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f29402a
            r6 = 0
            r7 = 16170(0x3f2a, float:2.2659E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<int[]> r9 = int[].class
            r4 = r11
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            r2 = r1
            int[] r2 = (int[]) r2
            goto L_0x00fb
        L_0x0052:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x00b7
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f29402a
            r7 = 0
            r8 = 16169(0x3f29, float:2.2658E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class<android.media.MediaCodecInfo> r10 = android.media.MediaCodecInfo.class
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x007d
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f29402a
            r6 = 0
            r7 = 16169(0x3f29, float:2.2658E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<android.media.MediaCodecInfo> r9 = android.media.MediaCodecInfo.class
            r4 = r11
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            android.media.MediaCodecInfo r1 = (android.media.MediaCodecInfo) r1
            goto L_0x00bb
        L_0x007d:
            android.media.MediaCodecList r1 = new android.media.MediaCodecList
            r3 = 1
            r1.<init>(r3)
            android.media.MediaCodecInfo[] r1 = r1.getCodecInfos()
            if (r1 == 0) goto L_0x00b5
            int r3 = r1.length
            if (r3 != 0) goto L_0x008d
            goto L_0x00b5
        L_0x008d:
            int r3 = r1.length
            r4 = 0
        L_0x008f:
            if (r4 >= r3) goto L_0x00b5
            r5 = r1[r4]
            if (r5 == 0) goto L_0x00b2
            boolean r6 = r5.isEncoder()
            if (r6 == 0) goto L_0x00b2
            java.lang.String[] r6 = r5.getSupportedTypes()
            r7 = 0
        L_0x00a0:
            int r8 = r6.length
            if (r7 >= r8) goto L_0x00b2
            r8 = r6[r7]
            java.lang.String r9 = r11.v
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x00af
            r1 = r5
            goto L_0x00bb
        L_0x00af:
            int r7 = r7 + 1
            goto L_0x00a0
        L_0x00b2:
            int r4 = r4 + 1
            goto L_0x008f
        L_0x00b5:
            r1 = r2
            goto L_0x00bb
        L_0x00b7:
            android.media.MediaCodecInfo r1 = r11.a()
        L_0x00bb:
            r11.w = r1
            android.media.MediaCodecInfo r1 = r11.w
            if (r1 != 0) goto L_0x00c2
            goto L_0x00fb
        L_0x00c2:
            android.media.MediaCodecInfo r1 = r11.w
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "OMX.google."
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L_0x00fb
            java.lang.String r3 = "OMX.Nvidia."
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L_0x00fb
            java.lang.String r3 = "OMX.TI.DUCATI1.VIDEO.H264E"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e1
            goto L_0x00fb
        L_0x00e1:
            android.media.MediaCodecInfo r1 = r11.w
            java.lang.String r2 = r11.v
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.getCapabilitiesForType(r2)
            int[] r2 = r1.colorFormats
            int r2 = r2.length
            int[] r3 = new int[r2]
            r4 = 0
        L_0x00ef:
            if (r4 >= r2) goto L_0x00fa
            int[] r5 = r1.colorFormats
            r5 = r5[r4]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L_0x00ef
        L_0x00fa:
            r2 = r3
        L_0x00fb:
            r1 = -1
            if (r2 != 0) goto L_0x00ff
            return r1
        L_0x00ff:
            int r3 = r2.length
            if (r0 >= r3) goto L_0x010f
            r3 = r2[r0]
            r4 = 2130708361(0x7f000789, float:1.701803E38)
            if (r3 != r4) goto L_0x010c
            r0 = r2[r0]
            return r0
        L_0x010c:
            int r0 = r0 + 1
            goto L_0x00ff
        L_0x010f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.c.b():int");
    }

    public static void a(d dVar) {
        f29404c = dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:38|39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013f, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x013e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface a(int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r9 = r18
            r10 = 5
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r11 = 0
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r12 = 1
            r1[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r13 = 2
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r14 = 3
            r1[r14] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r21)
            r15 = 4
            r1[r15] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r12] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r13] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r14] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r15] = r2
            java.lang.Class<android.view.Surface> r7 = android.view.Surface.class
            r4 = 0
            r5 = 16175(0x3f2f, float:2.2666E-41)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0097
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r1[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r1[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r1[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r1[r14] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r21)
            r1[r15] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a
            r4 = 0
            r5 = 16175(0x3f2f, float:2.2666E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r11] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r12] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r13] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r14] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r15] = r0
            java.lang.Class<android.view.Surface> r7 = android.view.Surface.class
            r2 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            android.view.Surface r0 = (android.view.Surface) r0
            return r0
        L_0x0097:
            r1 = 0
            if (r21 != 0) goto L_0x009b
            return r1
        L_0x009b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r2 >= r3) goto L_0x00a2
            return r1
        L_0x00a2:
            r8.B = r11
            r8.C = r11
            if (r0 <= 0) goto L_0x0142
            if (r9 > 0) goto L_0x00ac
            goto L_0x0142
        L_0x00ac:
            r8.x = r0
            r8.y = r9
            monitor-enter(r16)
            int r2 = r16.b()     // Catch:{ Exception -> 0x013e }
            if (r2 >= 0) goto L_0x00b9
            monitor-exit(r16)     // Catch:{ all -> 0x013c }
            return r1
        L_0x00b9:
            com.ss.android.medialib.d r3 = f29404c     // Catch:{ Exception -> 0x013e }
            if (r3 == 0) goto L_0x00c2
            com.ss.android.medialib.d r3 = f29404c     // Catch:{ Exception -> 0x013e }
            r3.setColorFormatMark(r2)     // Catch:{ Exception -> 0x013e }
        L_0x00c2:
            java.lang.String r3 = r8.v     // Catch:{ Exception -> 0x013e }
            android.media.MediaCodec r3 = android.media.MediaCodec.createEncoderByType(r3)     // Catch:{ Exception -> 0x013e }
            r8.g = r3     // Catch:{ Exception -> 0x013e }
            r8.j = r12     // Catch:{ Exception -> 0x013e }
            java.lang.String r3 = r8.v     // Catch:{ Exception -> 0x013e }
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r3, r0, r9)     // Catch:{ Exception -> 0x013e }
            java.lang.String r3 = "color-format"
            r0.setInteger(r3, r2)     // Catch:{ Exception -> 0x013e }
            java.lang.String r2 = "bitrate"
            r3 = r19
            int r3 = r3 * 1024
            int r3 = r3 * 1024
            r0.setInteger(r2, r3)     // Catch:{ Exception -> 0x013e }
            java.lang.String r2 = "frame-rate"
            int r3 = r8.k     // Catch:{ Exception -> 0x013e }
            r0.setInteger(r2, r3)     // Catch:{ Exception -> 0x013e }
            java.lang.String r2 = "i-frame-interval"
            r0.setInteger(r2, r12)     // Catch:{ Exception -> 0x013e }
            java.lang.String r2 = f29403b     // Catch:{ Exception -> 0x013e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013e }
            java.lang.String r4 = "initAVCEncoder: format = "
            r3.<init>(r4)     // Catch:{ Exception -> 0x013e }
            r3.append(r0)     // Catch:{ Exception -> 0x013e }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x013e }
            com.ss.android.vesdk.y.a(r2, r3)     // Catch:{ Exception -> 0x013e }
            android.media.MediaCodec r2 = r8.g     // Catch:{ Exception -> 0x013e }
            r2.configure(r0, r1, r1, r12)     // Catch:{ Exception -> 0x013e }
            android.media.MediaCodec r0 = r8.g     // Catch:{ Exception -> 0x013e }
            android.view.Surface r0 = r0.createInputSurface()     // Catch:{ Exception -> 0x013e }
            r8.h = r0     // Catch:{ Exception -> 0x013e }
            android.media.MediaCodec r0 = r8.g     // Catch:{ Exception -> 0x013e }
            r0.start()     // Catch:{ Exception -> 0x013e }
            r8.j = r13     // Catch:{ Exception -> 0x013e }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x013e }
            r2 = 21
            if (r0 >= r2) goto L_0x012b
            android.media.MediaCodec r0 = r8.g     // Catch:{ Exception -> 0x013e }
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch:{ Exception -> 0x013e }
            r8.f29406e = r0     // Catch:{ Exception -> 0x013e }
            android.media.MediaCodec r0 = r8.g     // Catch:{ Exception -> 0x013e }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ Exception -> 0x013e }
            r8.f29407f = r0     // Catch:{ Exception -> 0x013e }
        L_0x012b:
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x013e }
            r0.<init>()     // Catch:{ Exception -> 0x013e }
            r8.f29405d = r0     // Catch:{ Exception -> 0x013e }
            android.view.Surface r0 = r8.h     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x0138
            monitor-exit(r16)     // Catch:{ all -> 0x013c }
            return r1
        L_0x0138:
            monitor-exit(r16)     // Catch:{ all -> 0x013c }
            android.view.Surface r0 = r8.h
            return r0
        L_0x013c:
            r0 = move-exception
            goto L_0x0140
        L_0x013e:
            monitor-exit(r16)     // Catch:{ all -> 0x013c }
            return r1
        L_0x0140:
            monitor-exit(r16)     // Catch:{ all -> 0x013c }
            throw r0
        L_0x0142:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.c.a(int, int, int, int, boolean):android.view.Surface");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:42|43|44|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x028a, code lost:
        if (r2 >= 0) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x028c, code lost:
        com.ss.android.vesdk.y.c(f29403b, "encode: error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02c5, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02c8, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02ca, code lost:
        r1 = r8.g.getOutputBuffer(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02d1, code lost:
        r1 = r8.f29407f[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02d5, code lost:
        r3 = r8.f29405d.size - r8.f29405d.offset;
        r1.position(r8.f29405d.offset);
        r4 = new byte[r3];
        r1.get(r4, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02ef, code lost:
        if ((r8.f29405d.flags & 2) == 0) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02f3, code lost:
        if (f29404c == null) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02f5, code lost:
        f29404c.onMarkSetCodecConfig(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02fa, code lost:
        r8.f29405d.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0304, code lost:
        if ((r8.f29405d.flags & 1) == 0) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0306, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0308, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x030b, code lost:
        if (f29404c == null) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x030d, code lost:
        com.ss.android.vesdk.y.b(f29403b, "encode: pts queue size = " + r8.A.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x032c, code lost:
        if (r8.A.size() <= 0) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x032e, code lost:
        r8.C++;
        r3 = r8.A.poll();
        f29404c.onMarkWriteFile(r4, ((java.lang.Integer) r3.first).intValue(), ((java.lang.Integer) r3.second).intValue(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0351, code lost:
        com.ss.android.vesdk.y.b(f29403b, "encode: no available pts!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0359, code lost:
        com.ss.android.vesdk.y.b(f29403b, "encode: no output.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x021e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(int r23, int r24, int r25, int r26, boolean r27) {
        /*
            r22 = this;
            r8 = r22
            r0 = r23
            r9 = r25
            r10 = 5
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r11 = 0
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r12 = 1
            r1[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r13 = 2
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r14 = 3
            r1[r14] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r27)
            r15 = 4
            r1[r15] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r11] = r2
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
            r5 = 16179(0x3f33, float:2.2672E-41)
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x009b
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r1[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r1[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r1[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r1[r14] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r27)
            r1[r15] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a
            r4 = 0
            r5 = 16179(0x3f33, float:2.2672E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r11] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r12] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r13] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r14] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r15] = r0
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r22
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x009b:
            monitor-enter(r22)
            int r1 = r8.j     // Catch:{ all -> 0x038f }
            r10 = -1
            if (r1 != r13) goto L_0x0386
            android.media.MediaCodec r1 = r8.g     // Catch:{ all -> 0x038f }
            if (r1 != 0) goto L_0x00a7
            goto L_0x0386
        L_0x00a7:
            if (r0 <= 0) goto L_0x0369
            if (r9 >= 0) goto L_0x00ad
            goto L_0x0369
        L_0x00ad:
            com.ss.android.medialib.l r1 = r8.i     // Catch:{ all -> 0x038f }
            r14 = 0
            if (r1 != 0) goto L_0x018d
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x038f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a     // Catch:{ all -> 0x038f }
            r4 = 0
            r5 = 16176(0x3f30, float:2.2667E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x038f }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x038f }
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x038f }
            if (r1 == 0) goto L_0x00de
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x038f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a     // Catch:{ all -> 0x038f }
            r4 = 0
            r5 = 16176(0x3f30, float:2.2667E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x038f }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x038f }
            r2 = r22
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x038f }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x038f }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x038f }
            goto L_0x0189
        L_0x00de:
            android.view.Surface r1 = r8.h     // Catch:{ all -> 0x038f }
            if (r1 != 0) goto L_0x00ec
            java.lang.String r1 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.String r2 = "initEGLCtx: MediaCodec should initialized ahead."
            com.ss.android.vesdk.y.d(r1, r2)     // Catch:{ all -> 0x038f }
            r1 = 0
            goto L_0x0189
        L_0x00ec:
            float r1 = r8.r     // Catch:{ all -> 0x038f }
            float r2 = r8.s     // Catch:{ all -> 0x038f }
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ all -> 0x038f }
            java.lang.Float r4 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x038f }
            r3[r11] = r4     // Catch:{ all -> 0x038f }
            java.lang.Float r4 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x038f }
            r3[r12] = r4     // Catch:{ all -> 0x038f }
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.medialib.l.f29681a     // Catch:{ all -> 0x038f }
            r18 = 1
            r19 = 16615(0x40e7, float:2.3283E-41)
            java.lang.Class[] r4 = new java.lang.Class[r13]     // Catch:{ all -> 0x038f }
            java.lang.Class r5 = java.lang.Float.TYPE     // Catch:{ all -> 0x038f }
            r4[r11] = r5     // Catch:{ all -> 0x038f }
            java.lang.Class r5 = java.lang.Float.TYPE     // Catch:{ all -> 0x038f }
            r4[r12] = r5     // Catch:{ all -> 0x038f }
            java.lang.Class<com.ss.android.medialib.l> r21 = com.ss.android.medialib.l.class
            r15 = r3
            r20 = r4
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x038f }
            if (r3 == 0) goto L_0x0147
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ all -> 0x038f }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x038f }
            r3[r11] = r1     // Catch:{ all -> 0x038f }
            java.lang.Float r1 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x038f }
            r3[r12] = r1     // Catch:{ all -> 0x038f }
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.medialib.l.f29681a     // Catch:{ all -> 0x038f }
            r18 = 1
            r19 = 16615(0x40e7, float:2.3283E-41)
            java.lang.Class[] r1 = new java.lang.Class[r13]     // Catch:{ all -> 0x038f }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ all -> 0x038f }
            r1[r11] = r2     // Catch:{ all -> 0x038f }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ all -> 0x038f }
            r1[r12] = r2     // Catch:{ all -> 0x038f }
            java.lang.Class<com.ss.android.medialib.l> r21 = com.ss.android.medialib.l.class
            r15 = r3
            r20 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x038f }
            com.ss.android.medialib.l r1 = (com.ss.android.medialib.l) r1     // Catch:{ all -> 0x038f }
            goto L_0x0163
        L_0x0147:
            com.ss.android.medialib.l r3 = new com.ss.android.medialib.l     // Catch:{ all -> 0x038f }
            r3.<init>()     // Catch:{ all -> 0x038f }
            java.lang.String r4 = "attribute highp vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}"
            java.lang.String r5 = "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform float xPos;\nuniform float yPos;\nuniform float bottomPos;\nuniform float rightPos;\nuniform float markAlpha;\nuniform float xAdjust;\nuniform float yAdjust;\nvec4 normalBlend(vec4 c2, vec4 c1)\n{\n   vec4 outputColor;\n   outputColor.r = c1.r * markAlpha + c2.r * c2.a * (1.0 - c1.a);\n   outputColor.g = c1.g * markAlpha + c2.g * c2.a * (1.0 - c1.a);\n   outputColor.b = c1.b * markAlpha + c2.b * c2.a * (1.0 - c1.a);\n   outputColor.a = c1.a + c2.a * (1.0 - c1.a);\n   return outputColor;\n}\nvoid main()\n{\n   highp vec2 cord;\n   cord.x = texCoord.x * xAdjust- (xAdjust - 1.0) * 0.5;\n   cord.y = texCoord.y * yAdjust- (yAdjust - 1.0) * 0.5;\n   vec4 origin;\n   if(cord.x > 0.0 && cord.x < 1.0 && cord.y > 0.0 && cord.y < 1.0)\n   {\n       origin = texture2D(inputImageTexture, cord);\n   } else {\n       origin = vec4(1.0, 1.0, 1.0, 1.0);\n   }\n   vec4 markOverlay;\n   vec2 tmpCoordinate;\n   tmpCoordinate.x = cord.x;\n   tmpCoordinate.y = 1.0 - cord.y;\n   origin.a = origin.a * markAlpha;\n   if( cord.x > xPos && cord.x < bottomPos && cord.y > yPos && cord.y < rightPos )\n   {\n       tmpCoordinate.x = (cord.x - xPos) / (bottomPos - xPos);\n       tmpCoordinate.y = 1.0 - (cord.y - yPos) / (rightPos - yPos);\n       markOverlay = texture2D(inputImageTexture2, tmpCoordinate);\n       markOverlay.a = markOverlay.a * markAlpha;\n       origin = normalBlend(origin, markOverlay);\n   }\n   gl_FragColor = vec4(origin.r, origin.g, origin.b, origin.a);\n}"
            boolean r1 = r3.a((java.lang.String) r4, (java.lang.String) r5, (float) r1, (float) r2)     // Catch:{ all -> 0x038f }
            if (r1 != 0) goto L_0x0162
            java.lang.String r1 = "TextureDrawer"
            java.lang.String r2 = "TextureDrawer create failed!"
            com.ss.android.vesdk.y.d(r1, r2)     // Catch:{ all -> 0x038f }
            r3.a()     // Catch:{ all -> 0x038f }
            r1 = r14
            goto L_0x0163
        L_0x0162:
            r1 = r3
        L_0x0163:
            r8.i = r1     // Catch:{ all -> 0x038f }
            com.ss.android.medialib.l r1 = r8.i     // Catch:{ all -> 0x038f }
            r2 = 0
            r1.a(r2)     // Catch:{ all -> 0x038f }
            com.ss.android.medialib.l r1 = r8.i     // Catch:{ all -> 0x038f }
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.a(r2, r3)     // Catch:{ all -> 0x038f }
            com.ss.android.medialib.l r1 = r8.i     // Catch:{ all -> 0x038f }
            float r2 = r8.l     // Catch:{ all -> 0x038f }
            r1.b(r2)     // Catch:{ all -> 0x038f }
            com.ss.android.medialib.l r1 = r8.i     // Catch:{ all -> 0x038f }
            float r2 = r8.n     // Catch:{ all -> 0x038f }
            float r3 = r8.o     // Catch:{ all -> 0x038f }
            float r4 = r8.p     // Catch:{ all -> 0x038f }
            float r5 = r8.q     // Catch:{ all -> 0x038f }
            r1.a((float) r2, (float) r3, (float) r4, (float) r5)     // Catch:{ all -> 0x038f }
            r1 = 1
        L_0x0189:
            if (r1 != 0) goto L_0x018d
            monitor-exit(r22)     // Catch:{ all -> 0x038f }
            return r10
        L_0x018d:
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r1 = r8.A     // Catch:{ all -> 0x038f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x038f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x038f }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ all -> 0x038f }
            r1.offer(r2)     // Catch:{ all -> 0x038f }
            int r1 = r8.x     // Catch:{ all -> 0x038f }
            int r2 = r8.y     // Catch:{ all -> 0x038f }
            android.opengl.GLES20.glViewport(r11, r11, r1, r2)     // Catch:{ all -> 0x038f }
            com.ss.android.medialib.l r1 = r8.i     // Catch:{ all -> 0x038f }
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x038f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x038f }
            r2[r11] = r3     // Catch:{ all -> 0x038f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x038f }
            r2[r12] = r3     // Catch:{ all -> 0x038f }
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.medialib.l.f29681a     // Catch:{ all -> 0x038f }
            r18 = 0
            r19 = 16617(0x40e9, float:2.3285E-41)
            java.lang.Class[] r3 = new java.lang.Class[r13]     // Catch:{ all -> 0x038f }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x038f }
            r3[r11] = r4     // Catch:{ all -> 0x038f }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x038f }
            r3[r12] = r4     // Catch:{ all -> 0x038f }
            java.lang.Class r21 = java.lang.Void.TYPE     // Catch:{ all -> 0x038f }
            r15 = r2
            r16 = r1
            r20 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x038f }
            if (r2 == 0) goto L_0x01fb
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x038f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x038f }
            r2[r11] = r0     // Catch:{ all -> 0x038f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x038f }
            r2[r12] = r0     // Catch:{ all -> 0x038f }
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.medialib.l.f29681a     // Catch:{ all -> 0x038f }
            r18 = 0
            r19 = 16617(0x40e9, float:2.3285E-41)
            java.lang.Class[] r0 = new java.lang.Class[r13]     // Catch:{ all -> 0x038f }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x038f }
            r0[r11] = r3     // Catch:{ all -> 0x038f }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x038f }
            r0[r12] = r3     // Catch:{ all -> 0x038f }
            java.lang.Class r21 = java.lang.Void.TYPE     // Catch:{ all -> 0x038f }
            r15 = r2
            r16 = r1
            r20 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x038f }
            goto L_0x0202
        L_0x01fb:
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = r24
            r1.a(r0, r3, r2)     // Catch:{ all -> 0x038f }
        L_0x0202:
            android.opengl.GLES20.glFinish()     // Catch:{ all -> 0x038f }
            int r0 = r8.B     // Catch:{ all -> 0x038f }
            int r0 = r0 + r12
            r8.B = r0     // Catch:{ all -> 0x038f }
            com.ss.android.medialib.d r0 = f29404c     // Catch:{ all -> 0x038f }
            r0.onMarkSwapGlBuffers()     // Catch:{ all -> 0x038f }
            boolean r0 = r8.z     // Catch:{ all -> 0x038f }
            if (r0 == 0) goto L_0x0215
            r8.z = r11     // Catch:{ all -> 0x038f }
        L_0x0215:
            r0 = -2
            if (r27 == 0) goto L_0x0220
            android.media.MediaCodec r1 = r8.g     // Catch:{ Throwable -> 0x021e }
            r1.signalEndOfInputStream()     // Catch:{ Throwable -> 0x021e }
            goto L_0x0220
        L_0x021e:
            monitor-exit(r22)     // Catch:{ all -> 0x038f }
            return r0
        L_0x0220:
            r1 = 0
        L_0x0221:
            int r1 = r1 + r12
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0367 }
            r3 = 21
            if (r2 >= r3) goto L_0x0230
            android.media.MediaCodec r2 = r8.g     // Catch:{ Throwable -> 0x0367 }
            java.nio.ByteBuffer[] r2 = r2.getOutputBuffers()     // Catch:{ Throwable -> 0x0367 }
            r8.f29407f = r2     // Catch:{ Throwable -> 0x0367 }
        L_0x0230:
            android.media.MediaCodec r2 = r8.g     // Catch:{ Throwable -> 0x0367 }
            android.media.MediaCodec$BufferInfo r4 = r8.f29405d     // Catch:{ Throwable -> 0x0367 }
            int r5 = u     // Catch:{ Throwable -> 0x0367 }
            long r5 = (long) r5     // Catch:{ Throwable -> 0x0367 }
            int r2 = r2.dequeueOutputBuffer(r4, r5)     // Catch:{ Throwable -> 0x0367 }
            java.lang.String r4 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x038f }
            java.lang.String r6 = "outputBufferIndex = "
            r5.<init>(r6)     // Catch:{ all -> 0x038f }
            r5.append(r2)     // Catch:{ all -> 0x038f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x038f }
            com.ss.android.vesdk.y.b(r4, r5)     // Catch:{ all -> 0x038f }
            java.lang.String r4 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x038f }
            java.lang.String r6 = "mBufferInfo.flags = "
            r5.<init>(r6)     // Catch:{ all -> 0x038f }
            android.media.MediaCodec$BufferInfo r6 = r8.f29405d     // Catch:{ all -> 0x038f }
            int r6 = r6.flags     // Catch:{ all -> 0x038f }
            r5.append(r6)     // Catch:{ all -> 0x038f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x038f }
            com.ss.android.vesdk.y.b(r4, r5)     // Catch:{ all -> 0x038f }
            if (r2 != r10) goto L_0x0274
            if (r27 == 0) goto L_0x0293
            int r2 = r8.B     // Catch:{ all -> 0x038f }
            int r3 = r8.C     // Catch:{ all -> 0x038f }
            if (r2 == r3) goto L_0x0293
            r2 = 10
            if (r1 >= r2) goto L_0x0293
            goto L_0x0221
        L_0x0274:
            r4 = -3
            if (r2 != r4) goto L_0x0280
            android.media.MediaCodec r2 = r8.g     // Catch:{ all -> 0x038f }
            java.nio.ByteBuffer[] r2 = r2.getOutputBuffers()     // Catch:{ all -> 0x038f }
            r8.f29407f = r2     // Catch:{ all -> 0x038f }
            goto L_0x0221
        L_0x0280:
            if (r2 != r0) goto L_0x028a
            java.lang.String r2 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.String r3 = "encode: output format change!"
            com.ss.android.vesdk.y.c(r2, r3)     // Catch:{ all -> 0x038f }
            goto L_0x0221
        L_0x028a:
            if (r2 >= 0) goto L_0x02c6
            java.lang.String r0 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.String r1 = "encode: error."
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ all -> 0x038f }
        L_0x0293:
            if (r27 == 0) goto L_0x02c4
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x038f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a     // Catch:{ all -> 0x038f }
            r4 = 0
            r5 = 16177(0x3f31, float:2.2669E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x038f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x038f }
            r2 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x038f }
            if (r0 == 0) goto L_0x02b9
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x038f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29402a     // Catch:{ all -> 0x038f }
            r4 = 0
            r5 = 16177(0x3f31, float:2.2669E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x038f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x038f }
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x038f }
            goto L_0x02c4
        L_0x02b9:
            com.ss.android.medialib.l r0 = r8.i     // Catch:{ all -> 0x038f }
            if (r0 == 0) goto L_0x02c4
            com.ss.android.medialib.l r0 = r8.i     // Catch:{ all -> 0x038f }
            r0.a()     // Catch:{ all -> 0x038f }
            r8.i = r14     // Catch:{ all -> 0x038f }
        L_0x02c4:
            monitor-exit(r22)     // Catch:{ all -> 0x038f }
            return r11
        L_0x02c6:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x038f }
            if (r1 < r3) goto L_0x02d1
            android.media.MediaCodec r1 = r8.g     // Catch:{ all -> 0x038f }
            java.nio.ByteBuffer r1 = r1.getOutputBuffer(r2)     // Catch:{ all -> 0x038f }
            goto L_0x02d5
        L_0x02d1:
            java.nio.ByteBuffer[] r1 = r8.f29407f     // Catch:{ all -> 0x038f }
            r1 = r1[r2]     // Catch:{ all -> 0x038f }
        L_0x02d5:
            android.media.MediaCodec$BufferInfo r3 = r8.f29405d     // Catch:{ all -> 0x038f }
            int r3 = r3.size     // Catch:{ all -> 0x038f }
            android.media.MediaCodec$BufferInfo r4 = r8.f29405d     // Catch:{ all -> 0x038f }
            int r4 = r4.offset     // Catch:{ all -> 0x038f }
            int r3 = r3 - r4
            android.media.MediaCodec$BufferInfo r4 = r8.f29405d     // Catch:{ all -> 0x038f }
            int r4 = r4.offset     // Catch:{ all -> 0x038f }
            r1.position(r4)     // Catch:{ all -> 0x038f }
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x038f }
            r1.get(r4, r11, r3)     // Catch:{ all -> 0x038f }
            android.media.MediaCodec$BufferInfo r1 = r8.f29405d     // Catch:{ all -> 0x038f }
            int r1 = r1.flags     // Catch:{ all -> 0x038f }
            r1 = r1 & r13
            if (r1 == 0) goto L_0x02ff
            com.ss.android.medialib.d r1 = f29404c     // Catch:{ all -> 0x038f }
            if (r1 == 0) goto L_0x02fa
            com.ss.android.medialib.d r1 = f29404c     // Catch:{ all -> 0x038f }
            r1.onMarkSetCodecConfig(r4)     // Catch:{ all -> 0x038f }
        L_0x02fa:
            android.media.MediaCodec$BufferInfo r1 = r8.f29405d     // Catch:{ all -> 0x038f }
            r1.size = r11     // Catch:{ all -> 0x038f }
            goto L_0x0360
        L_0x02ff:
            android.media.MediaCodec$BufferInfo r1 = r8.f29405d     // Catch:{ all -> 0x038f }
            int r1 = r1.flags     // Catch:{ all -> 0x038f }
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0308
            r1 = 1
            goto L_0x0309
        L_0x0308:
            r1 = 0
        L_0x0309:
            com.ss.android.medialib.d r3 = f29404c     // Catch:{ all -> 0x038f }
            if (r3 == 0) goto L_0x0359
            java.lang.String r3 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x038f }
            java.lang.String r6 = "encode: pts queue size = "
            r5.<init>(r6)     // Catch:{ all -> 0x038f }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r6 = r8.A     // Catch:{ all -> 0x038f }
            int r6 = r6.size()     // Catch:{ all -> 0x038f }
            r5.append(r6)     // Catch:{ all -> 0x038f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x038f }
            com.ss.android.vesdk.y.b(r3, r5)     // Catch:{ all -> 0x038f }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r3 = r8.A     // Catch:{ all -> 0x038f }
            int r3 = r3.size()     // Catch:{ all -> 0x038f }
            if (r3 <= 0) goto L_0x0351
            int r3 = r8.C     // Catch:{ all -> 0x038f }
            int r3 = r3 + r12
            r8.C = r3     // Catch:{ all -> 0x038f }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r3 = r8.A     // Catch:{ all -> 0x038f }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x038f }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x038f }
            com.ss.android.medialib.d r5 = f29404c     // Catch:{ all -> 0x038f }
            java.lang.Object r6 = r3.first     // Catch:{ all -> 0x038f }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x038f }
            int r6 = r6.intValue()     // Catch:{ all -> 0x038f }
            java.lang.Object r3 = r3.second     // Catch:{ all -> 0x038f }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x038f }
            int r3 = r3.intValue()     // Catch:{ all -> 0x038f }
            r5.onMarkWriteFile(r4, r6, r3, r1)     // Catch:{ all -> 0x038f }
            goto L_0x0360
        L_0x0351:
            java.lang.String r1 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.String r3 = "encode: no available pts!!!"
            com.ss.android.vesdk.y.b(r1, r3)     // Catch:{ all -> 0x038f }
            goto L_0x0360
        L_0x0359:
            java.lang.String r1 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.String r3 = "encode: no output."
            com.ss.android.vesdk.y.b(r1, r3)     // Catch:{ all -> 0x038f }
        L_0x0360:
            android.media.MediaCodec r1 = r8.g     // Catch:{ all -> 0x038f }
            r1.releaseOutputBuffer(r2, r11)     // Catch:{ all -> 0x038f }
            goto L_0x0220
        L_0x0367:
            monitor-exit(r22)     // Catch:{ all -> 0x038f }
            return r0
        L_0x0369:
            java.lang.String r1 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x038f }
            java.lang.String r3 = "encode: invalidate params: texID = "
            r2.<init>(r3)     // Catch:{ all -> 0x038f }
            r2.append(r0)     // Catch:{ all -> 0x038f }
            java.lang.String r0 = ", pts = "
            r2.append(r0)     // Catch:{ all -> 0x038f }
            r2.append(r9)     // Catch:{ all -> 0x038f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x038f }
            com.ss.android.vesdk.y.d(r1, r0)     // Catch:{ all -> 0x038f }
            monitor-exit(r22)     // Catch:{ all -> 0x038f }
            return r10
        L_0x0386:
            java.lang.String r0 = f29403b     // Catch:{ all -> 0x038f }
            java.lang.String r1 = "encode: codec is not reayd."
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ all -> 0x038f }
            monitor-exit(r22)     // Catch:{ all -> 0x038f }
            return r10
        L_0x038f:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x038f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.c.b(int, int, int, int, boolean):int");
    }
}

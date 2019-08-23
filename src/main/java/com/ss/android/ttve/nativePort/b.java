package com.ss.android.ttve.nativePort;

import android.content.Context;
import android.support.annotation.NonNull;
import com.ss.android.vesdk.runtime.f;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31278a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final String f31279b = "b";

    /* renamed from: c  reason: collision with root package name */
    public static C0396b f31280c;

    /* renamed from: d  reason: collision with root package name */
    public static Context f31281d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f31282e = false;

    /* renamed from: f  reason: collision with root package name */
    private static c f31283f;
    private static c g = new a();
    private static boolean h = false;

    public static class a implements c {
        public final boolean a(List<String> list) {
            for (String next : list) {
                long currentTimeMillis = System.currentTimeMillis();
                com.ss.android.ttve.log.a.a(3, "Start loadLibrary " + next);
                if (!f.a(next, b.f31281d)) {
                    return false;
                }
                com.ss.android.ttve.log.a.a(3, "Finish loadLibrary " + next + " cost time:" + (System.currentTimeMillis() - currentTimeMillis));
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.b$b  reason: collision with other inner class name */
    public interface C0396b {
        void a(String[] strArr);
    }

    public interface c {
        boolean a(List<String> list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a() {
        /*
            java.lang.Class<com.ss.android.ttve.nativePort.b> r0 = com.ss.android.ttve.nativePort.b.class
            monitor-enter(r0)
            boolean r1 = f31278a     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r1.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "x264"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "fdk-aac"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "ttopenssl"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "ttffmpeg"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "yuv"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "effect"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "ttvebase"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "ttvideorecorder"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "common"
            java.lang.String r3 = "hotsoon"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r2 = "ffmpeg-invoker"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "ffmpeg-main"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "main"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            goto L_0x0055
        L_0x0050:
            java.lang.String r2 = "ttmain"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
        L_0x0055:
            boolean r2 = h     // Catch:{ all -> 0x00c6 }
            r3 = 0
            if (r2 == 0) goto L_0x0063
            java.lang.String r2 = "ttvideoeditor"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            r2 = 1
            f31282e = r2     // Catch:{ all -> 0x00c6 }
            goto L_0x006a
        L_0x0063:
            java.lang.String r2 = "ttvideoeditor"
            r1.add(r2)     // Catch:{ all -> 0x00c6 }
            f31282e = r3     // Catch:{ all -> 0x00c6 }
        L_0x006a:
            int r2 = r1.size()     // Catch:{ all -> 0x00c6 }
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x00c6 }
        L_0x0070:
            int r4 = r1.size()     // Catch:{ all -> 0x00c6 }
            if (r3 >= r4) goto L_0x0094
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "lib"
            r4.<init>(r5)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r5 = r1.get(r3)     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00c6 }
            r4.append(r5)     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = ".so"
            r4.append(r5)     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c6 }
            r2[r3] = r4     // Catch:{ all -> 0x00c6 }
            int r3 = r3 + 1
            goto L_0x0070
        L_0x0094:
            com.ss.android.ttve.nativePort.b$c r3 = f31283f     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x00af
            com.ss.android.ttve.nativePort.b$c r3 = f31283f     // Catch:{ all -> 0x00c6 }
            boolean r1 = r3.a(r1)     // Catch:{ all -> 0x00c6 }
            f31278a = r1     // Catch:{ all -> 0x00c6 }
            if (r1 != 0) goto L_0x00a4
            monitor-exit(r0)
            return
        L_0x00a4:
            com.ss.android.ttve.nativePort.b$b r1 = f31280c     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x00c4
            com.ss.android.ttve.nativePort.b$b r1 = f31280c     // Catch:{ all -> 0x00c6 }
            r1.a(r2)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)
            return
        L_0x00af:
            com.ss.android.ttve.nativePort.b$c r3 = g     // Catch:{ all -> 0x00c6 }
            boolean r1 = r3.a(r1)     // Catch:{ all -> 0x00c6 }
            f31278a = r1     // Catch:{ all -> 0x00c6 }
            if (r1 != 0) goto L_0x00bb
            monitor-exit(r0)
            return
        L_0x00bb:
            com.ss.android.ttve.nativePort.b$b r1 = f31280c     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x00c4
            com.ss.android.ttve.nativePort.b$b r1 = f31280c     // Catch:{ all -> 0x00c6 }
            r1.a(r2)     // Catch:{ all -> 0x00c6 }
        L_0x00c4:
            monitor-exit(r0)
            return
        L_0x00c6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.b.a():void");
    }

    public static void a(c cVar) {
        f31283f = cVar;
    }

    public static synchronized void a(@NonNull Context context) {
        synchronized (b.class) {
            f31281d = context;
        }
    }
}

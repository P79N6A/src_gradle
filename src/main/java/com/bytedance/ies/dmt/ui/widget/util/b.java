package com.bytedance.ies.dmt.ui.widget.util;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f20592a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20593b;

    private b() {
    }

    public static b a() {
        if (f20592a == null) {
            synchronized (b.class) {
                if (f20592a == null) {
                    f20592a = new b();
                }
            }
        }
        return f20592a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Typeface a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f20593b     // Catch:{ all -> 0x0026 }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            com.bytedance.ies.dmt.ui.widget.util.a r0 = com.bytedance.ies.dmt.ui.widget.util.a.a()     // Catch:{ all -> 0x0026 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f20589b     // Catch:{ all -> 0x0026 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0024
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.bytedance.ies.dmt.ui.widget.util.a.f20586a     // Catch:{ all -> 0x0026 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0026 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0026 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0026 }
            android.graphics.Typeface r1 = r0.a(r4)     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r3)
            return r1
        L_0x0026:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.widget.util.b.a(java.lang.String):android.graphics.Typeface");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.widget.TextView r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0049
            if (r6 != 0) goto L_0x0008
            goto L_0x0049
        L_0x0008:
            boolean r2 = r4.f20593b     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x002a
            if (r5 != 0) goto L_0x0010
        L_0x000e:
            r3 = 0
            goto L_0x0024
        L_0x0010:
            if (r6 == 0) goto L_0x000e
            android.content.Context r2 = r5.getContext()     // Catch:{ all -> 0x0047 }
            int[] r3 = com.bytedance.ies.dmt.R$styleable.FontConfig     // Catch:{ all -> 0x0047 }
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r6, r3)     // Catch:{ all -> 0x0047 }
            r3 = 2
            boolean r3 = r2.getBoolean(r3, r1)     // Catch:{ all -> 0x0047 }
            r2.recycle()     // Catch:{ all -> 0x0047 }
        L_0x0024:
            if (r3 == 0) goto L_0x0049
            r5.setIncludeFontPadding(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0049
        L_0x002a:
            if (r5 != 0) goto L_0x002e
        L_0x002c:
            r3 = 0
            goto L_0x0041
        L_0x002e:
            if (r6 == 0) goto L_0x002c
            android.content.Context r2 = r5.getContext()     // Catch:{ all -> 0x0047 }
            int[] r3 = com.bytedance.ies.dmt.R$styleable.FontConfig     // Catch:{ all -> 0x0047 }
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r6, r3)     // Catch:{ all -> 0x0047 }
            boolean r3 = r2.getBoolean(r0, r1)     // Catch:{ all -> 0x0047 }
            r2.recycle()     // Catch:{ all -> 0x0047 }
        L_0x0041:
            if (r3 != 0) goto L_0x0049
            r5.setIncludeFontPadding(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0049
        L_0x0047:
            r5 = move-exception
            goto L_0x0071
        L_0x0049:
            boolean r2 = r4.f20593b     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x004f
            monitor-exit(r4)
            return
        L_0x004f:
            if (r6 == 0) goto L_0x0062
            android.content.Context r2 = r5.getContext()     // Catch:{ all -> 0x0047 }
            int[] r3 = com.bytedance.ies.dmt.R$styleable.FontConfig     // Catch:{ all -> 0x0047 }
            android.content.res.TypedArray r6 = r2.obtainStyledAttributes(r6, r3)     // Catch:{ all -> 0x0047 }
            int r0 = r6.getInt(r1, r0)     // Catch:{ all -> 0x0047 }
            r6.recycle()     // Catch:{ all -> 0x0047 }
        L_0x0062:
            com.bytedance.ies.dmt.ui.widget.util.a r6 = com.bytedance.ies.dmt.ui.widget.util.a.a()     // Catch:{ all -> 0x0047 }
            android.graphics.Typeface r6 = r6.a(r0)     // Catch:{ all -> 0x0047 }
            if (r6 == 0) goto L_0x006f
            r5.setTypeface(r6)     // Catch:{ all -> 0x0047 }
        L_0x006f:
            monitor-exit(r4)
            return
        L_0x0071:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.widget.util.b.a(android.widget.TextView, android.util.AttributeSet):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.widget.TextView r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f20593b     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.graphics.Typeface r3 = r1.a(r3)     // Catch:{ all -> 0x0012 }
            if (r3 == 0) goto L_0x0010
            r2.setTypeface(r3)     // Catch:{ all -> 0x0012 }
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.widget.util.b.a(android.widget.TextView, java.lang.String):void");
    }
}

package com.ss.android.ugc.aweme.player.sdk.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59197a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f59198b = {"player_prepare_duration", "videochache_prepare_duration", "videoheader_chache_duration", "firstframe_render_duration", "firstframe_total_duration"};

    /* renamed from: d  reason: collision with root package name */
    private static final b f59199d = new b();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Map<String, Long>> f59200c = new LinkedHashMap<String, Map<String, Long>>() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final boolean removeEldestEntry(Map.Entry entry) {
            if (PatchProxy.isSupport(new Object[]{entry}, this, changeQuickRedirect, false, 64502, new Class[]{Map.Entry.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{entry}, this, changeQuickRedirect, false, 64502, new Class[]{Map.Entry.class}, Boolean.TYPE)).booleanValue();
            } else if (size() > 3) {
                return true;
            } else {
                return false;
            }
        }
    };

    public static b a() {
        return f59199d;
    }

    private b() {
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f59197a, false, 64499, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f59197a, false, 64499, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(str3, str4, System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(java.lang.String r17, java.lang.String r18, long r19) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r9 = r18
            r10 = r19
            monitor-enter(r16)
            r12 = 3
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x00a1 }
            r13 = 0
            r1[r13] = r0     // Catch:{ all -> 0x00a1 }
            r14 = 1
            r1[r14] = r9     // Catch:{ all -> 0x00a1 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x00a1 }
            r2.<init>(r10)     // Catch:{ all -> 0x00a1 }
            r15 = 2
            r1[r15] = r2     // Catch:{ all -> 0x00a1 }
            com.meituan.robust.ChangeQuickRedirect r3 = f59197a     // Catch:{ all -> 0x00a1 }
            r4 = 0
            r5 = 64500(0xfbf4, float:9.0384E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ all -> 0x00a1 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r13] = r2     // Catch:{ all -> 0x00a1 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r14] = r2     // Catch:{ all -> 0x00a1 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x00a1 }
            r6[r15] = r2     // Catch:{ all -> 0x00a1 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00a1 }
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0062
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x00a1 }
            r1[r13] = r0     // Catch:{ all -> 0x00a1 }
            r1[r14] = r9     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x00a1 }
            r0.<init>(r10)     // Catch:{ all -> 0x00a1 }
            r1[r15] = r0     // Catch:{ all -> 0x00a1 }
            com.meituan.robust.ChangeQuickRedirect r3 = f59197a     // Catch:{ all -> 0x00a1 }
            r4 = 0
            r5 = 64500(0xfbf4, float:9.0384E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ all -> 0x00a1 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r13] = r0     // Catch:{ all -> 0x00a1 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r14] = r0     // Catch:{ all -> 0x00a1 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00a1 }
            r6[r15] = r0     // Catch:{ all -> 0x00a1 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00a1 }
            r2 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r16)
            return
        L_0x0062:
            boolean r1 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x006a
            monitor-exit(r16)
            return
        L_0x006a:
            java.lang.String r1 = "player_try_play"
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0082
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> r1 = r8.f59200c     // Catch:{ all -> 0x00a1 }
            r1.remove(r0)     // Catch:{ all -> 0x00a1 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00a1 }
            r1.<init>()     // Catch:{ all -> 0x00a1 }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> r2 = r8.f59200c     // Catch:{ all -> 0x00a1 }
            r2.put(r0, r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x0094
        L_0x0082:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> r1 = r8.f59200c     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00a1 }
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x009f
            boolean r0 = r1.containsKey(r9)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0094
            goto L_0x009f
        L_0x0094:
            if (r1 == 0) goto L_0x009d
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x00a1 }
            r1.put(r9, r0)     // Catch:{ all -> 0x00a1 }
        L_0x009d:
            monitor-exit(r16)
            return
        L_0x009f:
            monitor-exit(r16)
            return
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.c.b.a(java.lang.String, java.lang.String, long):void");
    }
}

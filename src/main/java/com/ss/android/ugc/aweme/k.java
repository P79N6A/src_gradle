package com.ss.android.ugc.aweme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.ttnet.hostmonitor.ConnectivityReceiver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.net.NetworkReceiver;
import java.util.ArrayList;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3402a;

    /* renamed from: b  reason: collision with root package name */
    private List<BroadcastReceiver> f3403b = new ArrayList();

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f3402a, false, 19447, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f3402a, false, 19447, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a(context, new NetworkReceiver(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
        a(context, new ConnectivityReceiver(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(android.content.Context r18) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            monitor-enter(r17)
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00f0 }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x00f0 }
            com.meituan.robust.ChangeQuickRedirect r3 = f3402a     // Catch:{ all -> 0x00f0 }
            r4 = 0
            r5 = 19448(0x4bf8, float:2.7252E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f0 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r10] = r2     // Catch:{ all -> 0x00f0 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00f0 }
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00f0 }
            r1[r10] = r0     // Catch:{ all -> 0x00f0 }
            com.meituan.robust.ChangeQuickRedirect r3 = f3402a     // Catch:{ all -> 0x00f0 }
            r4 = 0
            r5 = 19448(0x4bf8, float:2.7252E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f0 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r10] = r0     // Catch:{ all -> 0x00f0 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00f0 }
            r2 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r17)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver r1 = new com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver     // Catch:{ all -> 0x00f0 }
            r1.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2[r10] = r3     // Catch:{ all -> 0x00f0 }
            r8.a(r0, r1, r2)     // Catch:{ all -> 0x00f0 }
            com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver r1 = new com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver     // Catch:{ all -> 0x00f0 }
            r1.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = "android.intent.action.PACKAGE_ADDED"
            r2[r10] = r3     // Catch:{ all -> 0x00f0 }
            r8.a(r0, r1, r2)     // Catch:{ all -> 0x00f0 }
            com.ss.android.download.DownloadReceiver r11 = new com.ss.android.download.DownloadReceiver     // Catch:{ all -> 0x00f0 }
            r11.<init>()     // Catch:{ all -> 0x00f0 }
            r12 = 3
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r13[r10] = r1     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            r13[r9] = r1     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = "android.intent.action.PACKAGE_REPLACED"
            r14 = 2
            r13[r14] = r1     // Catch:{ all -> 0x00f0 }
            java.lang.String[] r15 = new java.lang.String[r9]     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = "package"
            r15[r10] = r1     // Catch:{ all -> 0x00f0 }
            r7 = 4
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x00f0 }
            r1[r10] = r0     // Catch:{ all -> 0x00f0 }
            r1[r9] = r11     // Catch:{ all -> 0x00f0 }
            r1[r14] = r13     // Catch:{ all -> 0x00f0 }
            r1[r12] = r15     // Catch:{ all -> 0x00f0 }
            com.meituan.robust.ChangeQuickRedirect r3 = f3402a     // Catch:{ all -> 0x00f0 }
            r4 = 0
            r5 = 19451(0x4bfb, float:2.7257E-41)
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch:{ all -> 0x00f0 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r10] = r2     // Catch:{ all -> 0x00f0 }
            java.lang.Class<android.content.BroadcastReceiver> r2 = android.content.BroadcastReceiver.class
            r6[r9] = r2     // Catch:{ all -> 0x00f0 }
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r14] = r2     // Catch:{ all -> 0x00f0 }
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r12] = r2     // Catch:{ all -> 0x00f0 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ all -> 0x00f0 }
            r2 = r17
            r12 = 4
            r7 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00ca
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x00f0 }
            r1[r10] = r0     // Catch:{ all -> 0x00f0 }
            r1[r9] = r11     // Catch:{ all -> 0x00f0 }
            r1[r14] = r13     // Catch:{ all -> 0x00f0 }
            r0 = 3
            r1[r0] = r15     // Catch:{ all -> 0x00f0 }
            com.meituan.robust.ChangeQuickRedirect r3 = f3402a     // Catch:{ all -> 0x00f0 }
            r4 = 0
            r5 = 19451(0x4bfb, float:2.7257E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f0 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r10] = r0     // Catch:{ all -> 0x00f0 }
            java.lang.Class<android.content.BroadcastReceiver> r0 = android.content.BroadcastReceiver.class
            r6[r9] = r0     // Catch:{ all -> 0x00f0 }
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r6[r14] = r0     // Catch:{ all -> 0x00f0 }
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r2 = 3
            r6[r2] = r0     // Catch:{ all -> 0x00f0 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00f0 }
            r2 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r17)
            return
        L_0x00ca:
            java.util.List<android.content.BroadcastReceiver> r1 = r8.f3403b     // Catch:{ all -> 0x00f0 }
            r1.add(r11)     // Catch:{ all -> 0x00f0 }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x00f0 }
            r1.<init>()     // Catch:{ all -> 0x00f0 }
            r2 = 0
            r3 = 3
        L_0x00d6:
            if (r2 >= r3) goto L_0x00e0
            r4 = r13[r2]     // Catch:{ all -> 0x00f0 }
            r1.addAction(r4)     // Catch:{ all -> 0x00f0 }
            int r2 = r2 + 1
            goto L_0x00d6
        L_0x00e0:
            r2 = 0
        L_0x00e1:
            if (r2 > 0) goto L_0x00eb
            r3 = r15[r10]     // Catch:{ all -> 0x00f0 }
            r1.addDataScheme(r3)     // Catch:{ all -> 0x00f0 }
            int r2 = r2 + 1
            goto L_0x00e1
        L_0x00eb:
            r0.registerReceiver(r11, r1)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r17)
            return
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.k.b(android.content.Context):void");
    }

    public final synchronized void c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f3402a, false, 19449, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f3402a, false, 19449, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            if (PatchProxy.isSupport(new Object[]{context}, this, f3402a, false, 19452, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, f3402a, false, 19452, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            for (BroadcastReceiver next : this.f3403b) {
                if (next != null) {
                    context.unregisterReceiver(next);
                }
            }
            this.f3403b.clear();
        }
    }

    private void a(Context context, BroadcastReceiver broadcastReceiver, String[] strArr) {
        Context context2 = context;
        BroadcastReceiver broadcastReceiver2 = broadcastReceiver;
        if (PatchProxy.isSupport(new Object[]{context2, broadcastReceiver2, strArr}, this, f3402a, false, 19450, new Class[]{Context.class, BroadcastReceiver.class, String[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, broadcastReceiver2, strArr}, this, f3402a, false, 19450, new Class[]{Context.class, BroadcastReceiver.class, String[].class}, Void.TYPE);
            return;
        }
        this.f3403b.add(broadcastReceiver2);
        IntentFilter intentFilter = new IntentFilter();
        for (int i = 0; i <= 0; i++) {
            intentFilter.addAction(strArr[0]);
        }
        context2.registerReceiver(broadcastReceiver2, intentFilter);
    }
}

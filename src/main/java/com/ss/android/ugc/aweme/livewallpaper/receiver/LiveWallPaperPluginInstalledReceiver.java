package com.ss.android.ugc.aweme.livewallpaper.receiver;

import android.content.BroadcastReceiver;
import com.meituan.robust.ChangeQuickRedirect;

public class LiveWallPaperPluginInstalledReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53698a;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r20, android.content.Intent r21) {
        /*
            r19 = this;
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r5 = f53698a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 56222(0xdb9e, float:7.8784E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r14 = f53698a
            r15 = 0
            r16 = 56222(0xdb9e, float:7.8784E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            if (r21 == 0) goto L_0x00c7
            if (r20 != 0) goto L_0x0049
            goto L_0x00c7
        L_0x0049:
            java.lang.String r0 = "android.intent.action.PACKAGE_ADDED"
            java.lang.String r2 = r21.getAction()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "package:com.ss.android.ugc.aweme.livewallpaper"
            java.lang.String r1 = r21.getDataString()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f53698a
            r4 = 0
            r5 = 56223(0xdb9f, float:7.8785E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0089
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f53698a
            r4 = 0
            r5 = 56223(0xdb9f, float:7.8785E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
        L_0x0086:
            r1 = r19
            goto L_0x0099
        L_0x0089:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x0086
            com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver$1 r0 = new com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver$1
            r1 = r19
            r0.<init>()
            a.i.a((java.util.concurrent.Callable<TResult>) r0)
        L_0x0099:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.livewallpaper.c.e.f53685a
            r5 = 1
            r6 = 56276(0xdbd4, float:7.886E-41)
            java.lang.Class[] r7 = new java.lang.Class[r10]
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x00bd
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.livewallpaper.c.e.f53685a
            r5 = 1
            r6 = 56276(0xdbd4, float:7.886E-41)
            java.lang.Class[] r7 = new java.lang.Class[r10]
            java.lang.Class r8 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x00bd:
            java.lang.String r0 = "wallpaper_plugin_success"
            r2 = 0
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r2)
            goto L_0x00c6
        L_0x00c4:
            r1 = r19
        L_0x00c6:
            return
        L_0x00c7:
            r1 = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}

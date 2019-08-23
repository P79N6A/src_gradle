package com.ss.android.ugc.aweme.plugin;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.android.ManifestData;
import com.bytedance.frameworks.plugin.a.a;
import com.bytedance.frameworks.plugin.d;
import com.bytedance.frameworks.plugin.pm.c;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Patch;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.h.e;
import com.ss.android.h.f;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.plugin.a.a;
import com.ss.android.ugc.aweme.plugin.d.g;
import com.ss.android.ugc.aweme.plugin.g.b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class PluginService implements IPluginService {
    private static final Set<String> PLUGIN_ERROR_MESSAGE_WATCH_SET;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final d miraPluginEventListener = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59201a;

        public final void a(String str, boolean z) {
            final String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f59201a, false, 64531, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f59201a, false, 64531, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            final boolean z2 = z;
            new Handler(Looper.getMainLooper()).post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59202a;

                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
                    r0 = r2.iterator();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
                    if (r0.hasNext() == false) goto L_0x00a5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
                    ((com.ss.android.ugc.aweme.plugin.a.b.a) r0.next()).a(r9, r10);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r13 = this;
                        r0 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r3 = f59202a
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r4 = 0
                        r5 = 64532(0xfc14, float:9.0429E-41)
                        r2 = r13
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0025
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r4 = f59202a
                        r5 = 0
                        r6 = 64532(0xfc14, float:9.0429E-41)
                        java.lang.Class[] r7 = new java.lang.Class[r0]
                        java.lang.Class r8 = java.lang.Void.TYPE
                        r3 = r13
                        com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        return
                    L_0x0025:
                        boolean r1 = r4     // Catch:{ Throwable -> 0x002e }
                        if (r1 == 0) goto L_0x002e
                        java.lang.String r1 = r0     // Catch:{ Throwable -> 0x002e }
                        com.ss.android.ugc.aweme.plugin.g.b.c(r1)     // Catch:{ Throwable -> 0x002e }
                    L_0x002e:
                        com.ss.android.ugc.aweme.plugin.d.e r1 = com.ss.android.ugc.aweme.plugin.d.e.a()
                        java.lang.String r9 = r0
                        boolean r10 = r4
                        r11 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r11]
                        r2[r0] = r9
                        java.lang.Byte r3 = java.lang.Byte.valueOf(r10)
                        r12 = 1
                        r2[r12] = r3
                        com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.plugin.d.e.f59289a
                        r5 = 0
                        r6 = 64624(0xfc70, float:9.0558E-41)
                        java.lang.Class[] r7 = new java.lang.Class[r11]
                        java.lang.Class<java.lang.String> r3 = java.lang.String.class
                        r7[r0] = r3
                        java.lang.Class r3 = java.lang.Boolean.TYPE
                        r7[r12] = r3
                        java.lang.Class r8 = java.lang.Void.TYPE
                        r3 = r1
                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                        if (r2 == 0) goto L_0x007c
                        java.lang.Object[] r2 = new java.lang.Object[r11]
                        r2[r0] = r9
                        java.lang.Byte r3 = java.lang.Byte.valueOf(r10)
                        r2[r12] = r3
                        com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.plugin.d.e.f59289a
                        r5 = 0
                        r6 = 64624(0xfc70, float:9.0558E-41)
                        java.lang.Class[] r7 = new java.lang.Class[r11]
                        java.lang.Class<java.lang.String> r3 = java.lang.String.class
                        r7[r0] = r3
                        java.lang.Class r0 = java.lang.Boolean.TYPE
                        r7[r12] = r0
                        java.lang.Class r8 = java.lang.Void.TYPE
                        r3 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        return
                    L_0x007c:
                        java.lang.Object r0 = r1.f59292c
                        monitor-enter(r0)
                        java.util.List<com.ss.android.ugc.aweme.plugin.a.b$a> r2 = r1.f59291b     // Catch:{ all -> 0x00a6 }
                        boolean r2 = com.bytedance.common.utility.Lists.isEmpty(r2)     // Catch:{ all -> 0x00a6 }
                        if (r2 == 0) goto L_0x0089
                        monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
                        return
                    L_0x0089:
                        java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00a6 }
                        java.util.List<com.ss.android.ugc.aweme.plugin.a.b$a> r1 = r1.f59291b     // Catch:{ all -> 0x00a6 }
                        r2.<init>(r1)     // Catch:{ all -> 0x00a6 }
                        monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
                        java.util.Iterator r0 = r2.iterator()
                    L_0x0095:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L_0x00a5
                        java.lang.Object r1 = r0.next()
                        com.ss.android.ugc.aweme.plugin.a.b$a r1 = (com.ss.android.ugc.aweme.plugin.a.b.a) r1
                        r1.a(r9, r10)
                        goto L_0x0095
                    L_0x00a5:
                        return
                    L_0x00a6:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.PluginService.AnonymousClass1.AnonymousClass1.run():void");
                }
            });
        }
    };
    private volatile boolean alreadyRequested;
    private boolean deviceIdIsEmpty;
    private IPluginService.b mCallback;
    private PluginReportReceiver pluginReportReceiver;

    @Keep
    static class PluginReportReceiver extends BroadcastReceiver {
        private static final String TAG = "PluginService$PluginReportReceiver";
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final SparseIntArray codeMap = new SparseIntArray();
        private static final SparseIntArray typeMap = new SparseIntArray();

        private PluginReportReceiver() {
        }

        static {
            typeMap.put(1, 1);
            typeMap.put(2, 2);
            typeMap.put(3, 100);
            codeMap.put(0, 1);
            codeMap.put(1, 2);
            codeMap.put(2, -1);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:35|36|37|38|(1:40)|41|(1:43)(3:44|(1:46)|47)|48|49) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x01e2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r28, android.content.Intent r29) {
            /*
                r27 = this;
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r28
                r11 = 1
                r3[r11] = r29
                com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r4 = android.content.Context.class
                r8[r10] = r4
                java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
                r8[r11] = r4
                java.lang.Class r9 = java.lang.Void.TYPE
                r6 = 0
                r7 = 64542(0xfc1e, float:9.0443E-41)
                r4 = r27
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0043
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r28
                r12[r11] = r29
                com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
                r15 = 0
                r16 = 64542(0xfc1e, float:9.0443E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                r0[r10] = r1
                java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
                r0[r11] = r1
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r27
                r17 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                return
            L_0x0043:
                java.lang.String r0 = "com.bytedance.frameworks.plugin.ACTION_REPORTER"
                java.lang.String r3 = r29.getAction()     // Catch:{ Throwable -> 0x01e7 }
                boolean r0 = r0.equals(r3)     // Catch:{ Throwable -> 0x01e7 }
                if (r0 != 0) goto L_0x0050
                return
            L_0x0050:
                android.os.Bundle r0 = r29.getExtras()     // Catch:{ Throwable -> 0x01e7 }
                if (r0 == 0) goto L_0x01e6
                boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x01e7 }
                if (r1 != 0) goto L_0x01e6
                java.lang.String r1 = "status"
                boolean r1 = r0.containsKey(r1)     // Catch:{ Throwable -> 0x01e7 }
                if (r1 != 0) goto L_0x0066
                goto L_0x01e6
            L_0x0066:
                java.lang.String r1 = "status"
                int r1 = r0.getInt(r1)     // Catch:{ Throwable -> 0x01e7 }
                java.lang.String r3 = "message"
                java.lang.String r3 = r0.getString(r3)     // Catch:{ Throwable -> 0x01e7 }
                java.lang.String r4 = "packageName"
                java.lang.String r4 = r0.getString(r4)     // Catch:{ Throwable -> 0x01e7 }
                java.lang.String r5 = "versionCode"
                int r5 = r0.getInt(r5)     // Catch:{ Throwable -> 0x01e7 }
                java.lang.String r6 = "duration"
                java.lang.String r0 = r0.getString(r6)     // Catch:{ Throwable -> 0x01e7 }
                int r6 = r1 / 10000
                int r7 = r1 % 10000
                int r7 = r7 / 1000
                java.lang.String r8 = ""
                r9 = 3
                if (r6 != r11) goto L_0x0092
                java.lang.String r6 = "plugin_install"
                goto L_0x009d
            L_0x0092:
                if (r6 != r2) goto L_0x0097
                java.lang.String r6 = "plugin_resolve"
                goto L_0x009d
            L_0x0097:
                if (r6 != r9) goto L_0x009c
                java.lang.String r6 = "plugin_activation"
                goto L_0x009d
            L_0x009c:
                r6 = r8
            L_0x009d:
                boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x01e7 }
                if (r8 == 0) goto L_0x00a4
                return
            L_0x00a4:
                android.util.SparseIntArray r8 = codeMap     // Catch:{ Throwable -> 0x01e7 }
                int r8 = r8.get(r7)     // Catch:{ Throwable -> 0x01e7 }
                if (r8 == r11) goto L_0x0186
                android.util.SparseIntArray r8 = codeMap     // Catch:{ Throwable -> 0x01e7 }
                int r15 = r8.get(r7)     // Catch:{ Throwable -> 0x01e7 }
                r8 = 8
                java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x01e7 }
                r12[r10] = r4     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x01e7 }
                r12[r11] = r13     // Catch:{ Throwable -> 0x01e7 }
                r12[r2] = r6     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r15)     // Catch:{ Throwable -> 0x01e7 }
                r12[r9] = r13     // Catch:{ Throwable -> 0x01e7 }
                r13 = 4
                r12[r13] = r3     // Catch:{ Throwable -> 0x01e7 }
                r23 = -1
                java.lang.Long r14 = java.lang.Long.valueOf(r23)     // Catch:{ Throwable -> 0x01e7 }
                r25 = 5
                r12[r25] = r14     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x01e7 }
                r26 = 6
                r12[r26] = r14     // Catch:{ Throwable -> 0x01e7 }
                r14 = 7
                r12[r14] = r0     // Catch:{ Throwable -> 0x01e7 }
                r17 = 0
                com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.plugin.g.a.f59347a     // Catch:{ Throwable -> 0x01e7 }
                r19 = 1
                r20 = 64725(0xfcd5, float:9.0699E-41)
                java.lang.Class[] r14 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r14[r10] = r16     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r14[r11] = r16     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r14[r2] = r16     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r14[r9] = r16     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r14[r13] = r16     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r16 = java.lang.Long.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r14[r25] = r16     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r14[r26] = r16     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r21 = 7
                r14[r21] = r16     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r22 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r16 = r12
                r21 = r14
                boolean r12 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x01e7 }
                if (r12 == 0) goto L_0x0170
                java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x01e7 }
                r12[r10] = r4     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x01e7 }
                r12[r11] = r14     // Catch:{ Throwable -> 0x01e7 }
                r12[r2] = r6     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)     // Catch:{ Throwable -> 0x01e7 }
                r12[r9] = r14     // Catch:{ Throwable -> 0x01e7 }
                r12[r13] = r3     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Long r14 = java.lang.Long.valueOf(r23)     // Catch:{ Throwable -> 0x01e7 }
                r12[r25] = r14     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x01e7 }
                r12[r26] = r14     // Catch:{ Throwable -> 0x01e7 }
                r14 = 7
                r12[r14] = r0     // Catch:{ Throwable -> 0x01e7 }
                r17 = 0
                com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.plugin.g.a.f59347a     // Catch:{ Throwable -> 0x01e7 }
                r19 = 1
                r20 = 64725(0xfcd5, float:9.0699E-41)
                java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class<java.lang.String> r14 = java.lang.String.class
                r8[r10] = r14     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r8[r11] = r10     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                r8[r2] = r10     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r8[r9] = r10     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                r8[r13] = r9     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r8[r25] = r9     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r8[r26] = r9     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                r10 = 7
                r8[r10] = r9     // Catch:{ Throwable -> 0x01e7 }
                java.lang.Class r22 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x01e7 }
                r16 = r12
                r21 = r8
                com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x01e7 }
                goto L_0x0186
            L_0x0170:
                r17 = -1
                r21 = 0
                r22 = 0
                r23 = -1
                r24 = 0
                r12 = r4
                r13 = r5
                r14 = r6
                r16 = r3
                r19 = r1
                r20 = r0
                com.ss.android.ugc.aweme.plugin.g.a.a(r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)     // Catch:{ Throwable -> 0x01e7 }
            L_0x0186:
                android.util.SparseIntArray r8 = codeMap     // Catch:{ Throwable -> 0x01e7 }
                int r8 = r8.get(r7)     // Catch:{ Throwable -> 0x01e7 }
                if (r8 == r11) goto L_0x01e5
                java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Throwable -> 0x01e7 }
                r8.<init>()     // Catch:{ Throwable -> 0x01e7 }
                java.lang.String r9 = "plugin_name"
                r8.put(r9, r4)     // Catch:{ Throwable -> 0x01e2 }
                java.lang.String r4 = "plugin_version"
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x01e2 }
                r8.put(r4, r5)     // Catch:{ Throwable -> 0x01e2 }
                boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x01e2 }
                if (r4 != 0) goto L_0x01ac
                java.lang.String r4 = "duration"
                r8.put(r4, r0)     // Catch:{ Throwable -> 0x01e2 }
            L_0x01ac:
                android.util.SparseIntArray r0 = codeMap     // Catch:{ Throwable -> 0x01e2 }
                int r0 = r0.get(r7)     // Catch:{ Throwable -> 0x01e2 }
                if (r0 != r2) goto L_0x01bc
                java.lang.String r0 = "status"
                java.lang.String r1 = "success"
                r8.put(r0, r1)     // Catch:{ Throwable -> 0x01e2 }
                goto L_0x01e2
            L_0x01bc:
                java.lang.String r0 = "status"
                java.lang.String r2 = "error"
                r8.put(r0, r2)     // Catch:{ Throwable -> 0x01e2 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01e2 }
                r0.<init>()     // Catch:{ Throwable -> 0x01e2 }
                r0.append(r1)     // Catch:{ Throwable -> 0x01e2 }
                boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x01e2 }
                if (r1 != 0) goto L_0x01d9
                java.lang.String r1 = " : "
                r0.append(r1)     // Catch:{ Throwable -> 0x01e2 }
                r0.append(r3)     // Catch:{ Throwable -> 0x01e2 }
            L_0x01d9:
                java.lang.String r1 = "reason"
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x01e2 }
                r8.put(r1, r0)     // Catch:{ Throwable -> 0x01e2 }
            L_0x01e2:
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r6, (java.util.Map) r8)     // Catch:{ Throwable -> 0x01e7 }
            L_0x01e5:
                return
            L_0x01e6:
                return
            L_0x01e7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.PluginService.PluginReportReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    static {
        HashSet hashSet = new HashSet();
        PLUGIN_ERROR_MESSAGE_WATCH_SET = hashSet;
        hashSet.add("NativeLibCopyHelper copy so failed.");
    }

    public void monitorPlugins() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64526, new Class[0], Void.TYPE);
            return;
        }
        List<a> d2 = c.d();
        if (d2 != null && !d2.isEmpty()) {
            for (a next : d2) {
                if (next != null) {
                    String str = next.f2145a;
                    int i = next.f2146b;
                    if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, null, com.ss.android.ugc.aweme.plugin.g.a.f59347a, true, 64722, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, null, com.ss.android.ugc.aweme.plugin.g.a.f59347a, true, 64722, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[]{"mira_plugin_info_stat", str, Integer.valueOf(i), Integer.valueOf(i), "plugin_version", null}, null, com.ss.android.ugc.aweme.plugin.g.a.f59347a, true, 64723, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                            Object[] objArr = {"mira_plugin_info_stat", str, Integer.valueOf(i), Integer.valueOf(i), "plugin_version", null};
                            Object[] objArr2 = objArr;
                            PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.aweme.plugin.g.a.f59347a, true, 64723, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.plugin.g.a.a("mira_plugin_info_stat", str, i, i, "plugin_version", null, -1);
                        }
                    }
                }
            }
        }
    }

    public void initPatchCallback(IPluginService.b bVar) {
        this.mCallback = bVar;
    }

    public void preload(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 64521, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 64521, new Class[]{String.class}, Void.TYPE);
            return;
        }
        b.c(str);
    }

    public void initSaveu(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 64525, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 64525, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        e.a().f29122a = new com.ss.android.h.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59208a;

            public final boolean a(JSONObject jSONObject) throws JSONException {
                if (!PatchProxy.isSupport(new Object[]{jSONObject}, this, f59208a, false, 64536, new Class[]{JSONObject.class}, Boolean.TYPE)) {
                    return com.ss.android.newmedia.thread.a.a(jSONObject);
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f59208a, false, 64536, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
            }

            public final String a(String str, boolean z) {
                if (!PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f59208a, false, 64534, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                    return NetworkUtils.addCommonParams(str, z);
                }
                return (String) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f59208a, false, 64534, new Class[]{String.class, Boolean.TYPE}, String.class);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.String a(int r25, java.lang.String r26, byte[] r27, com.bytedance.common.utility.NetworkUtils.CompressType r28, java.lang.String r29) throws java.lang.Exception {
                /*
                    r24 = this;
                    r0 = r26
                    r1 = r27
                    r2 = r28
                    r3 = r29
                    r4 = 5
                    java.lang.Object[] r5 = new java.lang.Object[r4]
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
                    r12 = 0
                    r5[r12] = r6
                    r13 = 1
                    r5[r13] = r0
                    r14 = 2
                    r5[r14] = r1
                    r15 = 3
                    r5[r15] = r2
                    r16 = 4
                    r5[r16] = r3
                    com.meituan.robust.ChangeQuickRedirect r7 = f59208a
                    java.lang.Class[] r10 = new java.lang.Class[r4]
                    java.lang.Class r6 = java.lang.Integer.TYPE
                    r10[r12] = r6
                    java.lang.Class<java.lang.String> r6 = java.lang.String.class
                    r10[r13] = r6
                    java.lang.Class<byte[]> r6 = byte[].class
                    r10[r14] = r6
                    java.lang.Class<com.bytedance.common.utility.NetworkUtils$CompressType> r6 = com.bytedance.common.utility.NetworkUtils.CompressType.class
                    r10[r15] = r6
                    java.lang.Class<java.lang.String> r6 = java.lang.String.class
                    r10[r16] = r6
                    java.lang.Class<java.lang.String> r11 = java.lang.String.class
                    r8 = 0
                    r9 = 64535(0xfc17, float:9.0433E-41)
                    r6 = r24
                    boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
                    if (r5 == 0) goto L_0x0081
                    java.lang.Object[] r5 = new java.lang.Object[r4]
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
                    r5[r12] = r6
                    r5[r13] = r0
                    r5[r14] = r1
                    r5[r15] = r2
                    r5[r16] = r3
                    com.meituan.robust.ChangeQuickRedirect r19 = f59208a
                    r20 = 0
                    r21 = 64535(0xfc17, float:9.0433E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r4]
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r0[r12] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r0[r13] = r1
                    java.lang.Class<byte[]> r1 = byte[].class
                    r0[r14] = r1
                    java.lang.Class<com.bytedance.common.utility.NetworkUtils$CompressType> r1 = com.bytedance.common.utility.NetworkUtils.CompressType.class
                    r0[r15] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r0[r16] = r1
                    java.lang.Class<java.lang.String> r23 = java.lang.String.class
                    r17 = r5
                    r18 = r24
                    r22 = r0
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
                    java.lang.String r0 = (java.lang.String) r0
                    return r0
                L_0x0081:
                    if (r2 != 0) goto L_0x0088
                    r2 = 0
                L_0x0084:
                    r4 = r2
                    r2 = r25
                    goto L_0x0099
                L_0x0088:
                    com.bytedance.common.utility.NetworkUtils$CompressType r4 = com.bytedance.common.utility.NetworkUtils.CompressType.NONE
                    if (r2 != r4) goto L_0x008f
                    com.ss.android.common.util.NetworkUtils$e r2 = com.ss.android.common.util.NetworkUtils.e.NONE
                    goto L_0x0084
                L_0x008f:
                    com.bytedance.common.utility.NetworkUtils$CompressType r4 = com.bytedance.common.utility.NetworkUtils.CompressType.GZIP
                    if (r2 != r4) goto L_0x0096
                    com.ss.android.common.util.NetworkUtils$e r2 = com.ss.android.common.util.NetworkUtils.e.GZIP
                    goto L_0x0084
                L_0x0096:
                    com.ss.android.common.util.NetworkUtils$e r2 = com.ss.android.common.util.NetworkUtils.e.DEFLATER
                    goto L_0x0084
                L_0x0099:
                    java.lang.String r0 = com.ss.android.common.util.NetworkUtils.executePost((int) r2, (java.lang.String) r0, (byte[]) r1, (com.ss.android.common.util.NetworkUtils.e) r4, (java.lang.String) r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.PluginService.AnonymousClass3.a(int, java.lang.String, byte[], com.bytedance.common.utility.NetworkUtils$CompressType, java.lang.String):java.lang.String");
            }
        };
        f a2 = f.a(context.getApplicationContext());
        AnonymousClass4 r1 = new com.ss.android.h.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59210a;

            public final void a(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
                if (PatchProxy.isSupport(new Object[]{context, str, str2, 0L, 0L, null}, this, f59210a, false, 64537, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, str, str2, 0L, 0L, null}, this, f59210a, false, 64537, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
                    return;
                }
                r.a(context, str, str2, PushConstants.PUSH_TYPE_NOTIFY, 0, (JSONObject) null);
            }
        };
        if (a2.f29128e == null) {
            a2.f29128e = r1;
        }
        if (this.pluginReportReceiver == null) {
            this.pluginReportReceiver = new PluginReportReceiver();
            context.getApplicationContext().registerReceiver(this.pluginReportReceiver, new IntentFilter("com.bytedance.frameworks.plugin.ACTION_REPORTER"));
        }
    }

    public void install(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 64519, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 64519, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.plugin.b.f.a(context).a((a.C0664a) new com.ss.android.ugc.aweme.plugin.d.d(context2));
        com.ss.android.ugc.aweme.plugin.b.f.a(context).a((a.C0664a) new com.ss.android.ugc.aweme.plugin.d.c(context2));
        com.bytedance.c.a.a.a().f2109c = new com.bytedance.frameworks.plugin.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59206a;

            public final void a(String str, Throwable th) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2, th}, this, f59206a, false, 64533, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2, th}, this, f59206a, false, 64533, new Class[]{String.class, Throwable.class}, Void.TYPE);
                } else if (TextUtils.isEmpty(str) || (!str2.contains("callActivityOnCreate") && !str2.contains("wrapIntent") && !str2.contains("beforeInvoke") && !str2.contains("beforeInvoke") && !str2.contains("MethodProxy") && !str2.contains("NativeLibCopyHelper copy start"))) {
                    HashMap hashMap = new HashMap();
                    try {
                        hashMap.put("plugin_error_message", str2);
                        if (th != null && !TextUtils.isEmpty(th.getMessage())) {
                            hashMap.put("plugin_throwable_message", th.getMessage());
                        }
                    } catch (Throwable unused) {
                    }
                    r.a("plugin_error", (Map) hashMap);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("plugin_error_message", str2);
                        if (th != null && !TextUtils.isEmpty(th.getMessage())) {
                            jSONObject.put("plugin_throwable_message", th.getMessage());
                        }
                        MonitorUtils.monitorCommonLog("plugin_error", jSONObject);
                    } catch (Throwable unused2) {
                    }
                }
            }
        };
        d dVar = miraPluginEventListener;
        com.bytedance.c.a.a a2 = com.bytedance.c.a.a.a();
        if (a2.f2110d.isEmpty()) {
            a2.f2110d = new ArrayList(5);
        }
        a2.f2110d.add(new WeakReference(dVar));
        new com.ss.android.ugc.aweme.plugin.f.c().a(context2);
    }

    public void manualLoadPlugins(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 64522, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 64522, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context}, null, b.f59348a, true, 64731, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, b.f59348a, true, 64731, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        g a2 = g.a(context);
        if (PatchProxy.isSupport(new Object[0], a2, g.f59296a, false, 64634, new Class[0], Boolean.TYPE)) {
            ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, g.f59296a, false, 64634, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            NetworkUtils.h networkType = NetworkUtils.getNetworkType(a2.f59297b);
            if (PatchProxy.isSupport(new Object[]{networkType}, a2, g.f59296a, false, 64637, new Class[]{NetworkUtils.h.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{networkType}, a2, g.f59296a, false, 64637, new Class[]{NetworkUtils.h.class}, Boolean.TYPE)).booleanValue();
            } else if (!(networkType == NetworkUtils.h.NONE || a2.f59298c == 2 || a2.f59298c == 1 || (a2.f59298c != 0 && a2.f59298c != 3))) {
                a2.f59299d.b(0);
                a2.f59299d.a(2);
                a2.a();
            }
        }
    }

    public void update(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 64520, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 64520, new Class[]{Context.class}, Void.TYPE);
        } else if (NetworkUtils.isNetworkAvailable(context)) {
            if (TextUtils.isEmpty(AppLog.getServerDeviceId())) {
                this.deviceIdIsEmpty = true;
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("event_type", "fetch_plugin_list");
                    jSONObject.put("reason", "device_id must not be null");
                    hashMap.put("event_type", "fetch_plugin_list");
                    hashMap.put("reason", "device_id must not be null");
                } catch (Throwable unused) {
                }
                MonitorUtils.monitorStatusRate("plugin_bug_track", 1, jSONObject);
                r.a("plugin_bug_track", (Map) hashMap);
                return;
            }
            if (this.deviceIdIsEmpty) {
                this.deviceIdIsEmpty = false;
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("event_type", "fetch_plugin_list_retry");
                    jSONObject2.put("reason", "device_id update, not restart app");
                    hashMap2.put("event_type", "fetch_plugin_list_retry");
                    hashMap2.put("reason", "device_id update, not restart app");
                } catch (Throwable unused2) {
                }
                MonitorUtils.monitorStatusRate("plugin_bug_track", 1, jSONObject2);
                r.a("plugin_bug_track", (Map) hashMap2);
            }
            if (!this.alreadyRequested) {
                this.alreadyRequested = true;
                initPatch(context, this.mCallback);
                g.a(context).b();
            }
        }
    }

    public void handleNetworkChanged(Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 64524, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, changeQuickRedirect, false, 64524, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (BaseAppData.a().k() && z) {
            update(context);
        }
    }

    public boolean loadLibrary(String str, String str2) {
        HashMap hashMap;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3}, this, changeQuickRedirect, false, 64523, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str3}, this, changeQuickRedirect, false, 64523, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return com.ss.android.ugc.aweme.plugin.d.f.a(str, str2);
        } catch (Throwable unused) {
        }
        r.a("plugin_bug_track", (Map) hashMap);
        return false;
    }

    public boolean needUpgradePlugin(Context context, String str) {
        if (!PatchProxy.isSupport(new Object[]{context, str}, this, changeQuickRedirect, false, 64529, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return b.a(context, str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, this, changeQuickRedirect, false, 64529, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    private static void initPatch(Context context, IPluginService.b bVar) {
        String str;
        final IPluginService.b bVar2 = bVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context, bVar2}, null, changeQuickRedirect, true, 64530, new Class[]{Context.class, IPluginService.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, bVar2}, null, changeQuickRedirect, true, 64530, new Class[]{Context.class, IPluginService.b.class}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (context.getCacheDir() == null) {
            str = null;
        } else {
            str = r4.getAbsolutePath() + "/";
        }
        sb.append(str);
        sb.append("patch_dir");
        sb.append(File.separator);
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (!file.exists() || !file.isDirectory()) {
            z = file.mkdirs();
        }
        if (!z) {
            sb2 = "";
        }
        com.ss.android.h.a.a.a(context).a(String.valueOf(ManifestData.getInt(context.getApplicationContext(), "UPDATE_VERSION_CODE")), sb2);
        com.ss.android.h.a.a.a(context).f29098a = new com.ss.android.h.a.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59212a;

            public final void b(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f59212a, false, 64539, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f59212a, false, 64539, new Class[]{String.class}, Void.TYPE);
                }
            }

            public final void a(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f59212a, false, 64541, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f59212a, false, 64541, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                if (bVar2 != null) {
                    bVar2.a(str);
                }
            }

            public final void a(int i, String str) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f59212a, false, 64538, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f59212a, false, 64538, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                if (bVar2 != null) {
                    bVar2.a(i, str);
                }
            }

            public final void a(boolean z, Patch patch) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), patch}, this, f59212a, false, 64540, new Class[]{Boolean.TYPE, Patch.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), patch}, this, f59212a, false, 64540, new Class[]{Boolean.TYPE, Patch.class}, Void.TYPE);
                    return;
                }
                if (bVar2 != null) {
                    bVar2.a(z, new Gson().toJson((Object) patch));
                }
            }
        };
    }

    public void check(Context context, String str, String str2, IPluginService.a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2, aVar}, this, changeQuickRedirect, false, 64527, new Class[]{Context.class, String.class, String.class, IPluginService.a.class}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, aVar};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 64527, new Class[]{Context.class, String.class, String.class, IPluginService.a.class}, Void.TYPE);
            return;
        }
        check(context, str, str2, true, aVar);
    }

    public void check(Context context, String str, String str2, boolean z, IPluginService.a aVar) {
        IPluginService.a aVar2;
        String str3;
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, Byte.valueOf(z ? (byte) 1 : 0), aVar}, this, changeQuickRedirect, false, 64528, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, IPluginService.a.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, Byte.valueOf(z), aVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 64528, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, IPluginService.a.class}, Void.TYPE);
            return;
        }
        Object[] objArr3 = {context2, str4, str5, Byte.valueOf(z), aVar};
        if (PatchProxy.isSupport(objArr3, null, com.ss.android.ugc.aweme.plugin.ui.a.f59377a, true, 64662, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, IPluginService.a.class}, Void.TYPE)) {
            Object[] objArr4 = {context2, str4, str5, Byte.valueOf(z), aVar};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, null, com.ss.android.ugc.aweme.plugin.ui.a.f59377a, true, 64662, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, IPluginService.a.class}, Void.TYPE);
            return;
        }
        if (aVar == null) {
            aVar2 = com.ss.android.ugc.aweme.plugin.ui.a.f59378b;
        } else {
            aVar2 = aVar;
        }
        boolean a2 = com.ss.android.ugc.aweme.plugin.ui.a.a(context2, str5);
        HashMap hashMap = new HashMap();
        hashMap.put("plugin_name", str5);
        hashMap.put("check_type", str4);
        if (z) {
            str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        hashMap.put("show_dialog", str3);
        hashMap.put("is_first", String.valueOf(a2));
        boolean a3 = b.a(context2, str5);
        hashMap.put("plugin_version", String.valueOf(c.c(str2)));
        hashMap.put("upgrade_plugin", String.valueOf(a3 ? 1 : 0));
        if (!a3 && b.a(str2)) {
            aVar2.a(str5);
            hashMap.put("status", "success");
            r.a("plugin_local_check", (Map) hashMap);
        } else if (a3 || !c.b(str2)) {
            com.ss.android.ugc.aweme.plugin.ui.b bVar = new com.ss.android.ugc.aweme.plugin.ui.b(context, str, str2, z, aVar2);
            if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.plugin.ui.b.f59379a, false, 64691, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.plugin.ui.b.f59379a, false, 64691, new Class[0], Void.TYPE);
            } else if (bVar.h) {
                if (bVar.f59383e) {
                    UIUtils.displayToast(bVar.f59380b, (int) C0906R.string.bnq);
                    bVar.a();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("message", "no network when check");
                    hashMap2.put("check_type", bVar.f59381c);
                    r.a("plugin_toast_show", (Map) hashMap2);
                    MonitorUtils.monitorStatusRate("plugin_toast_show", 1, new JSONObject(hashMap2));
                } else if (bVar.f59384f) {
                    UIUtils.displayToast(bVar.f59380b, (int) C0906R.string.bnn);
                    bVar.a();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("message", "manual load plugin error when check");
                    hashMap3.put("check_type", bVar.f59381c);
                    r.a("plugin_toast_show", (Map) hashMap3);
                    MonitorUtils.monitorStatusRate("plugin_toast_show", 2, new JSONObject(hashMap3));
                } else if (!bVar.g && !bVar.f59382d.isShowing()) {
                    bVar.a((Dialog) bVar.f59382d);
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("check_type", bVar.f59381c);
                    r.a("plugin_notify_show", (Map) hashMap4);
                    MonitorUtils.monitorCommonLog("plugin_notify_show", new JSONObject(hashMap4));
                }
            }
            try {
                com.ss.android.ugc.aweme.plugin.e.b b2 = com.ss.android.ugc.aweme.plugin.b.f.a(context).b(str5);
                if (b2 != null) {
                    hashMap.put("download_plugin_version", String.valueOf(b2.f59319b.f59325b));
                    StringBuilder sb = new StringBuilder();
                    sb.append(b2.f59320c.toString());
                    if (b2.k != null) {
                        sb.append(" : ");
                        sb.append(b2.k.toString());
                    }
                    hashMap.put("reason", sb.toString());
                } else {
                    hashMap.put("reason", "plugin download info is null");
                }
                hashMap.put("status", "error");
            } catch (Exception unused) {
            }
            r.a("plugin_local_check", (Map) hashMap);
        } else {
            b.c(str2);
            aVar2.a(str5);
            hashMap.put("status", "success");
            hashMap.put("reason", "plugin has installed but do not active, current lifecycle = " + b.b(str2));
            r.a("plugin_local_check", (Map) hashMap);
        }
    }
}

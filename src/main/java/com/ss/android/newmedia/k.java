package com.ss.android.newmedia;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30217a;
    private static k m;

    /* renamed from: b  reason: collision with root package name */
    long f30218b;

    /* renamed from: c  reason: collision with root package name */
    long f30219c;

    /* renamed from: d  reason: collision with root package name */
    long f30220d;

    /* renamed from: e  reason: collision with root package name */
    long f30221e;

    /* renamed from: f  reason: collision with root package name */
    String f30222f;
    String g;
    List<String> h;
    List<String> i;
    public boolean j;
    public boolean k;
    boolean l;
    private volatile long n;
    private volatile long o;
    private final long p = 1200000;
    private BaseAppData q;
    private String r;
    private ScheduledExecutorService s = ((ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(1).a("InstalledAppTracker2").a()));

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30223a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:4|5|(3:7|(1:9)(1:10)|11)|12|(1:14)(3:15|16|(6:20|(1:22)(2:23|(1:25)(1:26))|(6:28|(1:30)(7:31|(3:33|(4:36|(2:38|(2:40|110)(1:109))(1:108)|106|34)|107)|41|(1:43)(2:44|(1:46))|47|(3:49|(4:52|(6:54|(1:56)|57|(2:61|(1:63))|64|(2:66|115)(1:114))(1:113)|111|50)|112)|67)|68|(1:70)(2:71|(1:75))|77|(2:79|(1:81)(2:(1:84)|(1:87))))|76|77|(0))(1:19))|88|89|(3:91|(1:93)(1:94)|95)|96|2a7|102) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0249 */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0230 A[Catch:{ Exception -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x024f A[Catch:{ Exception -> 0x02a5 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f30223a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 18416(0x47f0, float:2.5806E-41)
                r2 = r13
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f30223a
                r5 = 0
                r6 = 18416(0x47f0, float:2.5806E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r13
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                com.ss.android.newmedia.k r1 = com.ss.android.newmedia.k.this     // Catch:{ Exception -> 0x02a5 }
                boolean r1 = r1.j     // Catch:{ Exception -> 0x02a5 }
                r2 = 1
                if (r1 != 0) goto L_0x0082
                com.ss.android.newmedia.k r1 = com.ss.android.newmedia.k.this     // Catch:{ Exception -> 0x02a5 }
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x02a5 }
                r6 = 0
                r7 = 18411(0x47eb, float:2.58E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02a5 }
                java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a5 }
                r4 = r1
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02a5 }
                if (r3 == 0) goto L_0x004e
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x02a5 }
                r6 = 0
                r7 = 18411(0x47eb, float:2.58E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02a5 }
                java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a5 }
                r4 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02a5 }
                goto L_0x007e
            L_0x004e:
                android.content.SharedPreferences r3 = r1.e()     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r4 = "time_last_send_install_app"
                r5 = 0
                long r7 = r3.getLong(r4, r5)     // Catch:{ Exception -> 0x02a5 }
                r1.f30218b = r7     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r4 = "time_last_send_recent_app"
                long r7 = r3.getLong(r4, r5)     // Catch:{ Exception -> 0x02a5 }
                r1.f30219c = r7     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r4 = "time_last_collect_app"
                long r7 = r3.getLong(r4, r5)     // Catch:{ Exception -> 0x02a5 }
                r1.f30220d = r7     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r4 = "tag_last_install_app"
                java.lang.String r7 = ""
                java.lang.String r4 = r3.getString(r4, r7)     // Catch:{ Exception -> 0x02a5 }
                r1.f30222f = r4     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r4 = "time_first_send_install_app"
                long r3 = r3.getLong(r4, r5)     // Catch:{ Exception -> 0x02a5 }
                r1.f30221e = r3     // Catch:{ Exception -> 0x02a5 }
            L_0x007e:
                com.ss.android.newmedia.k r1 = com.ss.android.newmedia.k.this     // Catch:{ Exception -> 0x02a5 }
                r1.j = r2     // Catch:{ Exception -> 0x02a5 }
            L_0x0082:
                com.ss.android.newmedia.k r1 = com.ss.android.newmedia.k.this     // Catch:{ Exception -> 0x02a5 }
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x02a5 }
                r6 = 0
                r7 = 18405(0x47e5, float:2.5791E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02a5 }
                java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a5 }
                r4 = r1
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02a5 }
                if (r3 == 0) goto L_0x00a7
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x02a5 }
                r6 = 0
                r7 = 18405(0x47e5, float:2.5791E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02a5 }
                java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a5 }
                r4 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02a5 }
                goto L_0x0249
            L_0x00a7:
                boolean r10 = r1.c()     // Catch:{ Exception -> 0x0249 }
                boolean r11 = r1.d()     // Catch:{ Exception -> 0x0249 }
                if (r10 != 0) goto L_0x00b5
                if (r11 != 0) goto L_0x00b5
                goto L_0x0249
            L_0x00b5:
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0249 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x0249 }
                r6 = 0
                r7 = 18404(0x47e4, float:2.579E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0249 }
                java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0249 }
                r4 = r1
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0249 }
                if (r3 == 0) goto L_0x00de
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0249 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x0249 }
                r6 = 0
                r7 = 18404(0x47e4, float:2.579E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0249 }
                java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0249 }
                r4 = r1
                java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0249 }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0249 }
                boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0249 }
                goto L_0x00f0
            L_0x00de:
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0249 }
                long r5 = r1.f30220d     // Catch:{ Exception -> 0x0249 }
                r7 = 0
                long r3 = r3 - r5
                r5 = 1200000(0x124f80, double:5.92879E-318)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L_0x00ef
                r3 = 1
                goto L_0x00f0
            L_0x00ef:
                r3 = 0
            L_0x00f0:
                if (r3 == 0) goto L_0x022b
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0249 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x0249 }
                r6 = 0
                r7 = 18407(0x47e7, float:2.5794E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0249 }
                java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0249 }
                r4 = r1
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0249 }
                if (r3 == 0) goto L_0x0115
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0249 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x0249 }
                r6 = 0
                r7 = 18407(0x47e7, float:2.5794E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0249 }
                java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0249 }
                r4 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0249 }
                goto L_0x01f2
            L_0x0115:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0249 }
                r3.<init>()     // Catch:{ Exception -> 0x0249 }
                r1.h = r3     // Catch:{ Exception -> 0x0249 }
                com.ss.android.ugc.aweme.app.k r3 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Exception -> 0x0249 }
                android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x0249 }
                java.util.List r3 = r3.getInstalledApplications(r0)     // Catch:{ Exception -> 0x0249 }
                if (r3 == 0) goto L_0x014a
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0249 }
            L_0x012e:
                boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0249 }
                if (r4 == 0) goto L_0x014a
                java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0249 }
                android.content.pm.ApplicationInfo r4 = (android.content.pm.ApplicationInfo) r4     // Catch:{ Exception -> 0x0249 }
                if (r4 == 0) goto L_0x012e
                java.lang.String r4 = r4.packageName     // Catch:{ Exception -> 0x0249 }
                boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0249 }
                if (r5 != 0) goto L_0x012e
                java.util.List<java.lang.String> r5 = r1.h     // Catch:{ Exception -> 0x0249 }
                r5.add(r4)     // Catch:{ Exception -> 0x0249 }
                goto L_0x012e
            L_0x014a:
                java.util.List<java.lang.String> r12 = r1.h     // Catch:{ Exception -> 0x0249 }
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0249 }
                r3[r0] = r12     // Catch:{ Exception -> 0x0249 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x0249 }
                r6 = 0
                r7 = 18408(0x47e8, float:2.5795E-41)
                java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0249 }
                java.lang.Class<java.util.List> r4 = java.util.List.class
                r8[r0] = r4     // Catch:{ Exception -> 0x0249 }
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                r4 = r1
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0249 }
                if (r3 == 0) goto L_0x017d
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0249 }
                r3[r0] = r12     // Catch:{ Exception -> 0x0249 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x0249 }
                r6 = 0
                r7 = 18408(0x47e8, float:2.5795E-41)
                java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0249 }
                java.lang.Class<java.util.List> r4 = java.util.List.class
                r8[r0] = r4     // Catch:{ Exception -> 0x0249 }
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                r4 = r1
                java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0249 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0249 }
                goto L_0x0190
            L_0x017d:
                java.util.Collections.sort(r12)     // Catch:{ Exception -> 0x0249 }
                java.lang.Object[] r3 = r12.toArray()     // Catch:{ Exception -> 0x0249 }
                java.lang.String r3 = java.util.Arrays.deepToString(r3)     // Catch:{ Exception -> 0x0249 }
                java.lang.String r3 = com.bytedance.common.utility.DigestUtils.md5Hex((java.lang.String) r3)     // Catch:{ Exception -> 0x0249 }
                if (r3 != 0) goto L_0x0190
                java.lang.String r3 = ""
            L_0x0190:
                r1.g = r3     // Catch:{ Exception -> 0x0249 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0249 }
                r3.<init>()     // Catch:{ Exception -> 0x0249 }
                r1.i = r3     // Catch:{ Exception -> 0x0249 }
                com.ss.android.ugc.aweme.app.k r3 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Exception -> 0x0249 }
                java.lang.String r4 = "activity"
                java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x0249 }
                android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch:{ Exception -> 0x0249 }
                r4 = 30
                java.util.List r3 = r3.getRecentTasks(r4, r2)     // Catch:{ Exception -> 0x0249 }
                if (r3 == 0) goto L_0x01ec
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0249 }
            L_0x01b1:
                boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0249 }
                if (r4 == 0) goto L_0x01ec
                java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0249 }
                android.app.ActivityManager$RecentTaskInfo r4 = (android.app.ActivityManager.RecentTaskInfo) r4     // Catch:{ Exception -> 0x0249 }
                if (r4 == 0) goto L_0x01b1
                r5 = 0
                android.content.ComponentName r6 = r4.origActivity     // Catch:{ Exception -> 0x0249 }
                if (r6 == 0) goto L_0x01ca
                android.content.ComponentName r5 = r4.origActivity     // Catch:{ Exception -> 0x0249 }
                java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x0249 }
            L_0x01ca:
                boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0249 }
                if (r6 == 0) goto L_0x01e0
                android.content.Intent r6 = r4.baseIntent     // Catch:{ Exception -> 0x0249 }
                if (r6 == 0) goto L_0x01e0
                android.content.Intent r4 = r4.baseIntent     // Catch:{ Exception -> 0x0249 }
                android.content.ComponentName r4 = r4.getComponent()     // Catch:{ Exception -> 0x0249 }
                if (r4 == 0) goto L_0x01e0
                java.lang.String r5 = r4.getPackageName()     // Catch:{ Exception -> 0x0249 }
            L_0x01e0:
                boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0249 }
                if (r4 != 0) goto L_0x01b1
                java.util.List<java.lang.String> r4 = r1.i     // Catch:{ Exception -> 0x0249 }
                r4.add(r5)     // Catch:{ Exception -> 0x0249 }
                goto L_0x01b1
            L_0x01ec:
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0249 }
                r1.f30220d = r3     // Catch:{ Exception -> 0x0249 }
            L_0x01f2:
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0249 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x0249 }
                r6 = 0
                r7 = 18406(0x47e6, float:2.5792E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0249 }
                java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0249 }
                r4 = r1
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0249 }
                if (r3 == 0) goto L_0x021b
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0249 }
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x0249 }
                r6 = 0
                r7 = 18406(0x47e6, float:2.5792E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0249 }
                java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0249 }
                r4 = r1
                java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0249 }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0249 }
                boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0249 }
                goto L_0x022c
            L_0x021b:
                java.lang.String r3 = r1.f30222f     // Catch:{ Exception -> 0x0249 }
                if (r3 == 0) goto L_0x022b
                java.lang.String r3 = r1.f30222f     // Catch:{ Exception -> 0x0249 }
                java.lang.String r4 = r1.g     // Catch:{ Exception -> 0x0249 }
                boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0249 }
                if (r3 == 0) goto L_0x022b
                r3 = 1
                goto L_0x022c
            L_0x022b:
                r3 = 0
            L_0x022c:
                java.util.List<java.lang.String> r4 = r1.h     // Catch:{ Exception -> 0x0249 }
                if (r4 == 0) goto L_0x0249
                java.util.List<java.lang.String> r4 = r1.i     // Catch:{ Exception -> 0x0249 }
                if (r4 != 0) goto L_0x0235
                goto L_0x0249
            L_0x0235:
                if (r10 == 0) goto L_0x0242
                if (r3 == 0) goto L_0x0242
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0249 }
                r1.f30218b = r3     // Catch:{ Exception -> 0x0249 }
                r1.k = r2     // Catch:{ Exception -> 0x0249 }
                r10 = 0
            L_0x0242:
                if (r10 != 0) goto L_0x0246
                if (r11 == 0) goto L_0x0249
            L_0x0246:
                r1.a(r10, r11)     // Catch:{ Exception -> 0x0249 }
            L_0x0249:
                com.ss.android.newmedia.k r1 = com.ss.android.newmedia.k.this     // Catch:{ Exception -> 0x02a5 }
                boolean r1 = r1.k     // Catch:{ Exception -> 0x02a5 }
                if (r1 == 0) goto L_0x02a5
                com.ss.android.newmedia.k r1 = com.ss.android.newmedia.k.this     // Catch:{ Exception -> 0x02a5 }
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x02a5 }
                r5 = 0
                r6 = 18410(0x47ea, float:2.5798E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02a5 }
                java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a5 }
                r3 = r1
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x02a5 }
                if (r2 == 0) goto L_0x0273
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.newmedia.k.f30217a     // Catch:{ Exception -> 0x02a5 }
                r5 = 0
                r6 = 18410(0x47ea, float:2.5798E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02a5 }
                java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a5 }
                r3 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x02a5 }
                goto L_0x02a1
            L_0x0273:
                android.content.SharedPreferences r2 = r1.e()     // Catch:{ Exception -> 0x02a5 }
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r3 = "time_last_send_install_app"
                long r4 = r1.f30218b     // Catch:{ Exception -> 0x02a5 }
                r2.putLong(r3, r4)     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r3 = "time_last_send_recent_app"
                long r4 = r1.f30219c     // Catch:{ Exception -> 0x02a5 }
                r2.putLong(r3, r4)     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r3 = "time_last_collect_app"
                long r4 = r1.f30220d     // Catch:{ Exception -> 0x02a5 }
                r2.putLong(r3, r4)     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r3 = "time_first_send_install_app"
                long r4 = r1.f30221e     // Catch:{ Exception -> 0x02a5 }
                r2.putLong(r3, r4)     // Catch:{ Exception -> 0x02a5 }
                java.lang.String r3 = "tag_last_install_app"
                java.lang.String r1 = r1.f30222f     // Catch:{ Exception -> 0x02a5 }
                r2.putString(r3, r1)     // Catch:{ Exception -> 0x02a5 }
                com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r2)     // Catch:{ Exception -> 0x02a5 }
            L_0x02a1:
                com.ss.android.newmedia.k r1 = com.ss.android.newmedia.k.this     // Catch:{ Exception -> 0x02a5 }
                r1.k = r0     // Catch:{ Exception -> 0x02a5 }
            L_0x02a5:
                com.ss.android.newmedia.k r1 = com.ss.android.newmedia.k.this
                monitor-enter(r1)
                r1.l = r0     // Catch:{ all -> 0x02ac }
                monitor-exit(r1)     // Catch:{ all -> 0x02ac }
                return
            L_0x02ac:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x02ac }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.k.a.run():void");
        }

        private a() {
        }

        /* synthetic */ a(k kVar, byte b2) {
            this();
        }
    }

    private k() {
    }

    public static synchronized k a() {
        synchronized (k.class) {
            if (PatchProxy.isSupport(new Object[0], null, f30217a, true, 18396, new Class[0], k.class)) {
                k kVar = (k) PatchProxy.accessDispatch(new Object[0], null, f30217a, true, 18396, new Class[0], k.class);
                return kVar;
            }
            if (m == null) {
                m = new k();
            }
            k kVar2 = m;
            return kVar2;
        }
    }

    private static boolean f() {
        if (PatchProxy.isSupport(new Object[0], null, f30217a, true, 18398, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30217a, true, 18398, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return g();
    }

    private static boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f30217a, true, 18399, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30217a, true, 18399, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean h2 = h();
        boolean i2 = i();
        if (!h2 && !i2) {
            z = true;
        }
        return z;
    }

    private static boolean h() {
        if (PatchProxy.isSupport(new Object[0], null, f30217a, true, 18400, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30217a, true, 18400, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return ToolUtils.isApkInstalled(GlobalContext.getContext(), "com.android.vending");
    }

    private static boolean i() {
        if (PatchProxy.isSupport(new Object[0], null, f30217a, true, 18401, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30217a, true, 18401, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return ToolUtils.isApkInstalled(GlobalContext.getContext(), "com.google.android.gms");
    }

    private void j() {
        this.n = this.q.w * 1000;
        if (this.n < 21600000) {
            this.n = 21600000;
        }
        this.o = this.q.x * 1000;
        if (this.o < 7200000) {
            this.o = 7200000;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f30217a, false, 18402, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30217a, false, 18402, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (System.currentTimeMillis() - this.f30218b > this.n) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f30217a, false, 18403, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30217a, false, 18403, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (System.currentTimeMillis() - this.f30219c > this.o) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences e() {
        if (PatchProxy.isSupport(new Object[0], this, f30217a, false, 18412, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, f30217a, false, 18412, new Class[0], SharedPreferences.class);
        }
        SharedPreferences a2 = c.a(com.ss.android.ugc.aweme.app.k.a(), "app_track", 0);
        if (1 != a2.getInt("version", -1)) {
            a(a2);
        }
        return a2;
    }

    private boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f30217a, false, 18415, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30217a, false, 18415, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a() || !((bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(d.a(), bm.class)).p(true)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r9.s.execute(new com.ss.android.newmedia.k.a(r9, (byte) 0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f30217a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 18397(0x47dd, float:2.578E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f30217a
            r5 = 0
            r6 = 18397(0x47dd, float:2.578E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            boolean r1 = f()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x007b
            com.ss.android.newmedia.BaseAppData r1 = r9.q     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x0033
            com.ss.android.newmedia.BaseAppData r1 = com.ss.android.newmedia.BaseAppData.a()     // Catch:{ Exception -> 0x007c }
            r9.q = r1     // Catch:{ Exception -> 0x007c }
        L_0x0033:
            java.lang.String r1 = com.ss.android.common.applog.AppLog.getServerDeviceId()     // Catch:{ Exception -> 0x007c }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x007c }
            if (r2 == 0) goto L_0x003e
            return
        L_0x003e:
            r9.r = r1     // Catch:{ Exception -> 0x007c }
            com.ss.android.ugc.aweme.app.k r1 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Exception -> 0x007c }
            boolean r1 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r1)     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x004b
            return
        L_0x004b:
            monitor-enter(r9)     // Catch:{ Exception -> 0x007c }
            boolean r1 = r9.l     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0052
            monitor-exit(r9)     // Catch:{ all -> 0x0078 }
            return
        L_0x0052:
            r9.j()     // Catch:{ all -> 0x0078 }
            boolean r1 = r9.c()     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x0061
            boolean r1 = r9.d()     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0067
        L_0x0061:
            boolean r1 = r9.k()     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0069
        L_0x0067:
            monitor-exit(r9)     // Catch:{ all -> 0x0078 }
            return
        L_0x0069:
            r1 = 1
            r9.l = r1     // Catch:{ all -> 0x0078 }
            monitor-exit(r9)     // Catch:{ all -> 0x0078 }
            java.util.concurrent.ScheduledExecutorService r1 = r9.s     // Catch:{ Exception -> 0x007c }
            com.ss.android.newmedia.k$a r2 = new com.ss.android.newmedia.k$a     // Catch:{ Exception -> 0x007c }
            r2.<init>(r9, r0)     // Catch:{ Exception -> 0x007c }
            r1.execute(r2)     // Catch:{ Exception -> 0x007c }
            goto L_0x007b
        L_0x0078:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ Exception -> 0x007c }
        L_0x007b:
            return
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.k.b():void");
    }

    private void a(SharedPreferences sharedPreferences) {
        if (PatchProxy.isSupport(new Object[]{sharedPreferences}, this, f30217a, false, 18413, new Class[]{SharedPreferences.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sharedPreferences}, this, f30217a, false, 18413, new Class[]{SharedPreferences.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        edit.putInt("version", 1);
        SharedPrefsEditorCompat.apply(edit);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, boolean z2) {
        String str;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f30217a, false, 18409, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f30217a, false, 18409, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        byte[] bArr = null;
        try {
            StringBuilder sb = new StringBuilder("https://ib.snssdk.com/service/1/z_app_stats/");
            e.a(sb);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_id", this.r);
            if (z) {
                sb.append("&_apps=1");
                jSONObject.put("apps", new JSONArray(this.h));
            }
            if (z2) {
                sb.append("&_recent=1");
                jSONObject.put("recent_apps", new JSONArray(this.i));
            }
            String c2 = p.c();
            if (c2 != null && c2.length() < 30) {
                sb.append("&rom=");
                sb.append(Uri.encode(c2));
            }
            if (this.f30221e == 0) {
                this.f30221e = System.currentTimeMillis();
            }
            sb.append("&time_first_send_install_app=");
            sb.append(this.f30221e);
            jSONObject.put("time_first_send_install_app", this.f30221e);
            str = sb.toString();
            try {
                bArr = jSONObject.toString().getBytes("UTF-8");
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "https://ib.snssdk.com/service/1/z_app_stats/";
        }
        if (bArr != null && NetworkUtils.isNetworkAvailable(com.ss.android.ugc.aweme.app.k.a())) {
            int i2 = 0;
            while (i2 < 2) {
                try {
                    String executePost = NetworkUtils.executePost(8192, str, bArr, NetworkUtils.e.GZIP, "application/json");
                    if (!StringUtils.isEmpty(executePost) && "success".equals(new JSONObject(executePost).getString("message"))) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (z) {
                            this.f30218b = currentTimeMillis;
                            this.f30222f = this.g;
                            this.k = true;
                        }
                        if (z2) {
                            this.f30219c = currentTimeMillis;
                            this.k = true;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    switch (e.a((Context) com.ss.android.ugc.aweme.app.k.a(), th)) {
                        case 13:
                        case 14:
                        case 15:
                            z3 = true;
                            break;
                        default:
                            z3 = false;
                            break;
                    }
                    if (z3) {
                        i2++;
                    }
                }
            }
        }
    }
}

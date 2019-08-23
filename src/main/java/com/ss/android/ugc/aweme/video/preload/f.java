package com.ss.android.ugc.aweme.video.preload;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.c.c;
import com.toutiao.proxyserver.Proxy;
import com.toutiao.proxyserver.g;
import com.toutiao.proxyserver.h;
import com.toutiao.proxyserver.k;
import com.toutiao.proxyserver.l;
import com.toutiao.proxyserver.m;
import com.toutiao.proxyserver.o;
import com.toutiao.proxyserver.p;
import com.toutiao.proxyserver.q;
import io.reactivex.BackpressureStrategy;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subscribers.DisposableSubscriber;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76214a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f76215b = com.ss.android.ugc.aweme.g.a.a();

    /* renamed from: c  reason: collision with root package name */
    public static final String f76216c = f.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public ConcurrentHashMap<String, Integer> f76217d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, Integer> f76218e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, e> f76219f;
    public Map<String, List<e>> g;
    public HashMap<String, List<com.toutiao.proxyserver.a.b>> h;
    public HashMap<String, com.toutiao.proxyserver.a.a> i;
    public WeakReference<Object> j;
    public WeakReference<a> k;
    public int l;
    private a m;
    private long n;

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76241a;

        /* renamed from: b  reason: collision with root package name */
        public Queue<C0798a> f76242b = new LinkedBlockingQueue();

        /* renamed from: c  reason: collision with root package name */
        public Queue<C0798a> f76243c = new LinkedBlockingQueue();

        /* renamed from: e  reason: collision with root package name */
        private boolean f76245e = true;

        /* renamed from: f  reason: collision with root package name */
        private final Queue<C0798a> f76246f = new ArrayBlockingQueue(10);
        private PublishSubject<C0798a> g;
        private Scheduler h;
        private HandlerThread i = new HandlerThread("preload-schedule-thread");

        /* renamed from: com.ss.android.ugc.aweme.video.preload.f$a$a  reason: collision with other inner class name */
        class C0798a {

            /* renamed from: a  reason: collision with root package name */
            public int f76250a;

            /* renamed from: b  reason: collision with root package name */
            public String f76251b;

            /* renamed from: c  reason: collision with root package name */
            public String[] f76252c;

            /* renamed from: d  reason: collision with root package name */
            public int f76253d = -1;

            /* renamed from: e  reason: collision with root package name */
            public boolean f76254e;

            /* renamed from: f  reason: collision with root package name */
            public VideoUrlModel f76255f;

            C0798a() {
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:7|8|(2:12|(1:14)(1:(2:15|(3:17|(2:19|87)(1:(2:21|89)(1:88))|85)(1:86))))|94|(4:24|(4:26|27|71|(2:73|92)(2:74|93))(1:91)|90|22)|75|76|77|78) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x02eb */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r25 = this;
                r8 = r25
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f76241a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 89225(0x15c89, float:1.25031E-40)
                r2 = r25
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0029
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f76241a
                r4 = 0
                r5 = 89225(0x15c89, float:1.25031E-40)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r25
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x0029:
                boolean r1 = r8.f76245e
                if (r1 == 0) goto L_0x02f1
                monitor-enter(r25)
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.f$a$a> r1 = r8.f76243c     // Catch:{ all -> 0x02ee }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x02ee }
                r9 = 0
                r10 = 1
                if (r1 != 0) goto L_0x00d2
                boolean r1 = com.ss.android.ugc.aweme.video.preload.g.b.a()     // Catch:{ all -> 0x02ee }
                if (r1 == 0) goto L_0x00d2
                java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r3 = f76241a     // Catch:{ all -> 0x02ee }
                r4 = 0
                r5 = 89226(0x15c8a, float:1.25032E-40)
                java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r2 = r25
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02ee }
                if (r1 == 0) goto L_0x0064
                java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r3 = f76241a     // Catch:{ all -> 0x02ee }
                r4 = 0
                r5 = 89226(0x15c8a, float:1.25032E-40)
                java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r2 = r25
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02ee }
                goto L_0x00d2
            L_0x0064:
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.f$a$a> r1 = r8.f76243c     // Catch:{ all -> 0x02ee }
                java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x02ee }
                r11 = r1
                com.ss.android.ugc.aweme.video.preload.f$a$a r11 = (com.ss.android.ugc.aweme.video.preload.f.a.C0798a) r11     // Catch:{ all -> 0x02ee }
                if (r11 == 0) goto L_0x00d2
                com.ss.android.ugc.playerkit.videoview.c.a r1 = com.ss.android.ugc.playerkit.videoview.c.a.a()     // Catch:{ all -> 0x02ee }
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r11.f76255f     // Catch:{ all -> 0x02ee }
                java.lang.String r2 = r2.getBitRatedRatioUri()     // Catch:{ all -> 0x02ee }
                com.ss.android.ugc.playerkit.videoview.d.c r1 = r1.b(r2)     // Catch:{ all -> 0x02ee }
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r11.f76255f     // Catch:{ all -> 0x02ee }
                com.ss.android.ugc.playerkit.c.a r3 = com.ss.android.ugc.playerkit.c.a.r()     // Catch:{ all -> 0x02ee }
                com.ss.android.ugc.playerkit.c.c$a r3 = r3.a()     // Catch:{ all -> 0x02ee }
                com.ss.android.ugc.playerkit.videoview.a.a r1 = r1.b(r2, r3, r0)     // Catch:{ all -> 0x02ee }
                java.lang.String[] r2 = r1.f77751a     // Catch:{ all -> 0x02ee }
                r11.f76252c = r2     // Catch:{ all -> 0x02ee }
                java.lang.String r1 = r1.f77753c     // Catch:{ all -> 0x02ee }
                r11.f76251b = r1     // Catch:{ all -> 0x02ee }
                r11.f76255f = r9     // Catch:{ all -> 0x02ee }
                java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x02ee }
                r1[r0] = r11     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r3 = f76241a     // Catch:{ all -> 0x02ee }
                r4 = 0
                r5 = 89224(0x15c88, float:1.2503E-40)
                java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x02ee }
                java.lang.Class<com.ss.android.ugc.aweme.video.preload.f$a$a> r2 = com.ss.android.ugc.aweme.video.preload.f.a.C0798a.class
                r6[r0] = r2     // Catch:{ all -> 0x02ee }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r2 = r25
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02ee }
                if (r1 == 0) goto L_0x00c7
                java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x02ee }
                r1[r0] = r11     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r3 = f76241a     // Catch:{ all -> 0x02ee }
                r4 = 0
                r5 = 89224(0x15c88, float:1.2503E-40)
                java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x02ee }
                java.lang.Class<com.ss.android.ugc.aweme.video.preload.f$a$a> r2 = com.ss.android.ugc.aweme.video.preload.f.a.C0798a.class
                r6[r0] = r2     // Catch:{ all -> 0x02ee }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r2 = r25
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02ee }
                goto L_0x0064
            L_0x00c7:
                if (r11 == 0) goto L_0x0064
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.f$a$a> r1 = r8.f76242b     // Catch:{ all -> 0x02ee }
                r1.offer(r11)     // Catch:{ all -> 0x02ee }
                r25.notify()     // Catch:{ all -> 0x02ee }
                goto L_0x0064
            L_0x00d2:
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.f$a$a> r1 = r8.f76242b     // Catch:{ all -> 0x02ee }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x02ee }
                if (r1 != 0) goto L_0x02e8
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.f$a$a> r1 = r8.f76242b     // Catch:{ all -> 0x02ee }
                java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x02ee }
                r11 = r1
                com.ss.android.ugc.aweme.video.preload.f$a$a r11 = (com.ss.android.ugc.aweme.video.preload.f.a.C0798a) r11     // Catch:{ all -> 0x02ee }
                if (r11 == 0) goto L_0x00d2
                int r1 = r11.f76250a     // Catch:{ all -> 0x02ee }
                switch(r1) {
                    case 0: goto L_0x01db;
                    case 1: goto L_0x019b;
                    case 2: goto L_0x0192;
                    case 3: goto L_0x00f7;
                    case 4: goto L_0x00ec;
                    default: goto L_0x00ea;
                }     // Catch:{ all -> 0x02ee }
            L_0x00ea:
                goto L_0x02a1
            L_0x00ec:
                com.toutiao.proxyserver.p r1 = com.toutiao.proxyserver.p.a()     // Catch:{ all -> 0x02ee }
                r1.b()     // Catch:{ all -> 0x02ee }
                r8.f76245e = r0     // Catch:{ all -> 0x02ee }
                goto L_0x02a1
            L_0x00f7:
                com.toutiao.proxyserver.p r1 = com.toutiao.proxyserver.p.a()     // Catch:{ all -> 0x02ee }
                r1.b()     // Catch:{ all -> 0x02ee }
                com.toutiao.proxyserver.g r1 = com.toutiao.proxyserver.Proxy.f()     // Catch:{ all -> 0x02ee }
                if (r1 == 0) goto L_0x0138
                com.toutiao.proxyserver.g r1 = com.toutiao.proxyserver.Proxy.f()     // Catch:{ all -> 0x02ee }
                java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.g.f80081a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91620(0x165e4, float:1.28387E-40)
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r13 = r1
                r17 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                if (r2 == 0) goto L_0x0130
                java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.g.f80081a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91620(0x165e4, float:1.28387E-40)
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r13 = r1
                r17 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                goto L_0x0138
            L_0x0130:
                com.toutiao.proxyserver.g$1 r2 = new com.toutiao.proxyserver.g$1     // Catch:{ all -> 0x02ee }
                r2.<init>()     // Catch:{ all -> 0x02ee }
                com.toutiao.proxyserver.f.c.a((java.lang.Runnable) r2)     // Catch:{ all -> 0x02ee }
            L_0x0138:
                com.toutiao.proxyserver.h r1 = com.toutiao.proxyserver.Proxy.e()     // Catch:{ all -> 0x02ee }
                if (r1 == 0) goto L_0x02a1
                com.toutiao.proxyserver.h r1 = com.toutiao.proxyserver.Proxy.e()     // Catch:{ all -> 0x02ee }
                java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.h.f80085a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91635(0x165f3, float:1.28408E-40)
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r13 = r1
                r17 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                if (r2 == 0) goto L_0x016b
                java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.h.f80085a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91635(0x165f3, float:1.28408E-40)
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r13 = r1
                r17 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                goto L_0x02a1
            L_0x016b:
                com.toutiao.proxyserver.p r2 = com.toutiao.proxyserver.p.a()     // Catch:{ all -> 0x02ee }
                r2.b()     // Catch:{ all -> 0x02ee }
                android.content.Context r2 = com.toutiao.proxyserver.Proxy.a()     // Catch:{ all -> 0x02ee }
                if (r2 == 0) goto L_0x017f
                com.toutiao.proxyserver.b.c r2 = com.toutiao.proxyserver.b.c.a((android.content.Context) r2)     // Catch:{ all -> 0x02ee }
                r2.b(r0)     // Catch:{ all -> 0x02ee }
            L_0x017f:
                android.os.Handler r2 = r1.j     // Catch:{ all -> 0x02ee }
                java.lang.Runnable r3 = r1.i     // Catch:{ all -> 0x02ee }
                r2.removeCallbacks(r3)     // Catch:{ all -> 0x02ee }
                java.util.concurrent.Executor r2 = r1.h     // Catch:{ all -> 0x02ee }
                com.toutiao.proxyserver.h$6 r3 = new com.toutiao.proxyserver.h$6     // Catch:{ all -> 0x02ee }
                r3.<init>()     // Catch:{ all -> 0x02ee }
                r2.execute(r3)     // Catch:{ all -> 0x02ee }
                goto L_0x02a1
            L_0x0192:
                com.toutiao.proxyserver.p r1 = com.toutiao.proxyserver.p.a()     // Catch:{ all -> 0x02ee }
                r1.b()     // Catch:{ all -> 0x02ee }
                goto L_0x02a1
            L_0x019b:
                com.toutiao.proxyserver.p r1 = com.toutiao.proxyserver.p.a()     // Catch:{ all -> 0x02ee }
                java.lang.String r2 = r11.f76251b     // Catch:{ all -> 0x02ee }
                java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x02ee }
                r12[r0] = r2     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.p.f80167a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91675(0x1661b, float:1.28464E-40)
                java.lang.Class[] r3 = new java.lang.Class[r10]     // Catch:{ all -> 0x02ee }
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r0] = r4     // Catch:{ all -> 0x02ee }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r13 = r1
                r17 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                if (r3 == 0) goto L_0x01d6
                java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x02ee }
                r12[r0] = r2     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.p.f80167a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91675(0x1661b, float:1.28464E-40)
                java.lang.Class[] r2 = new java.lang.Class[r10]     // Catch:{ all -> 0x02ee }
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r2[r0] = r3     // Catch:{ all -> 0x02ee }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r13 = r1
                r17 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                goto L_0x02a1
            L_0x01d6:
                r1.a((boolean) r0, (java.lang.String) r2)     // Catch:{ all -> 0x02ee }
                goto L_0x02a1
            L_0x01db:
                java.lang.String[] r1 = r11.f76252c     // Catch:{ all -> 0x02ee }
                if (r1 == 0) goto L_0x02a1
                java.lang.String[] r1 = r11.f76252c     // Catch:{ all -> 0x02ee }
                int r1 = r1.length     // Catch:{ all -> 0x02ee }
                if (r1 <= 0) goto L_0x02a1
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x02ee }
                r1.<init>()     // Catch:{ all -> 0x02ee }
                java.lang.String[] r2 = r11.f76252c     // Catch:{ all -> 0x02ee }
                int r3 = r2.length     // Catch:{ all -> 0x02ee }
                r4 = 0
            L_0x01ed:
                if (r4 >= r3) goto L_0x01fd
                r5 = r2[r4]     // Catch:{ all -> 0x02ee }
                boolean r6 = com.toutiao.proxyserver.f.c.a((java.lang.String) r5)     // Catch:{ all -> 0x02ee }
                if (r6 == 0) goto L_0x01fa
                r1.add(r5)     // Catch:{ all -> 0x02ee }
            L_0x01fa:
                int r4 = r4 + 1
                goto L_0x01ed
            L_0x01fd:
                int r2 = r1.size()     // Catch:{ all -> 0x02ee }
                java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x02ee }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x02ee }
                r7 = r1
                java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x02ee }
                int r1 = r11.f76253d     // Catch:{ all -> 0x02ee }
                if (r1 >= 0) goto L_0x021f
                com.toutiao.proxyserver.p r2 = com.toutiao.proxyserver.p.a()     // Catch:{ all -> 0x02ee }
                java.lang.String r5 = r11.f76251b     // Catch:{ all -> 0x02ee }
                r3 = 0
                com.toutiao.proxyserver.o r1 = com.toutiao.proxyserver.p.h     // Catch:{ all -> 0x02ee }
                int r4 = r1.f80165b     // Catch:{ all -> 0x02ee }
                r6 = 0
                r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02ee }
                goto L_0x02a1
            L_0x021f:
                com.toutiao.proxyserver.p r1 = com.toutiao.proxyserver.p.a()     // Catch:{ all -> 0x02ee }
                java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.p.f80167a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91685(0x16625, float:1.28478E-40)
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class<com.toutiao.proxyserver.p$a> r18 = com.toutiao.proxyserver.p.a.class
                r13 = r1
                r17 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                if (r2 == 0) goto L_0x024e
                java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.p.f80167a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91685(0x16625, float:1.28478E-40)
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class<com.toutiao.proxyserver.p$a> r18 = com.toutiao.proxyserver.p.a.class
                r13 = r1
                r17 = r2
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                com.toutiao.proxyserver.p$a r1 = (com.toutiao.proxyserver.p.a) r1     // Catch:{ all -> 0x02ee }
                goto L_0x0254
            L_0x024e:
                com.toutiao.proxyserver.p$a r2 = new com.toutiao.proxyserver.p$a     // Catch:{ all -> 0x02ee }
                r2.<init>()     // Catch:{ all -> 0x02ee }
                r1 = r2
            L_0x0254:
                java.lang.String r2 = r11.f76251b     // Catch:{ all -> 0x02ee }
                r1.f80198d = r2     // Catch:{ all -> 0x02ee }
                int r2 = r11.f76253d     // Catch:{ all -> 0x02ee }
                r1.f80197c = r2     // Catch:{ all -> 0x02ee }
                r1.f80200f = r7     // Catch:{ all -> 0x02ee }
                java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.p.a.f80195a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91695(0x1662f, float:1.28492E-40)
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r13 = r1
                r17 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                if (r2 == 0) goto L_0x0286
                java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.p.a.f80195a     // Catch:{ all -> 0x02ee }
                r15 = 0
                r16 = 91695(0x1662f, float:1.28492E-40)
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x02ee }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r13 = r1
                r17 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ee }
                goto L_0x02a1
            L_0x0286:
                com.toutiao.proxyserver.p r2 = com.toutiao.proxyserver.p.this     // Catch:{ all -> 0x02ee }
                boolean r3 = r1.f80196b     // Catch:{ all -> 0x02ee }
                int r4 = r1.f80197c     // Catch:{ all -> 0x02ee }
                java.lang.String r5 = r1.f80198d     // Catch:{ all -> 0x02ee }
                java.util.List<com.toutiao.proxyserver.net.c> r6 = r1.f80199e     // Catch:{ all -> 0x02ee }
                java.lang.String[] r1 = r1.f80200f     // Catch:{ all -> 0x02ee }
                r19 = r2
                r20 = r3
                r21 = r4
                r22 = r5
                r23 = r6
                r24 = r1
                r19.a(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x02ee }
            L_0x02a1:
                java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x02ee }
                r1[r0] = r11     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r3 = f76241a     // Catch:{ all -> 0x02ee }
                r4 = 0
                r5 = 89219(0x15c83, float:1.25022E-40)
                java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x02ee }
                java.lang.Class<com.ss.android.ugc.aweme.video.preload.f$a$a> r2 = com.ss.android.ugc.aweme.video.preload.f.a.C0798a.class
                r6[r0] = r2     // Catch:{ all -> 0x02ee }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r2 = r25
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02ee }
                if (r1 == 0) goto L_0x02d4
                java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x02ee }
                r1[r0] = r11     // Catch:{ all -> 0x02ee }
                com.meituan.robust.ChangeQuickRedirect r3 = f76241a     // Catch:{ all -> 0x02ee }
                r4 = 0
                r5 = 89219(0x15c83, float:1.25022E-40)
                java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x02ee }
                java.lang.Class<com.ss.android.ugc.aweme.video.preload.f$a$a> r2 = com.ss.android.ugc.aweme.video.preload.f.a.C0798a.class
                r6[r0] = r2     // Catch:{ all -> 0x02ee }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02ee }
                r2 = r25
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02ee }
                goto L_0x00d2
            L_0x02d4:
                r11.f76252c = r9     // Catch:{ all -> 0x02ee }
                r11.f76251b = r9     // Catch:{ all -> 0x02ee }
                r1 = -1
                r11.f76250a = r1     // Catch:{ all -> 0x02ee }
                r11.f76255f = r9     // Catch:{ all -> 0x02ee }
                r11.f76253d = r1     // Catch:{ all -> 0x02ee }
                r11.f76254e = r0     // Catch:{ all -> 0x02ee }
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.f$a$a> r1 = r8.f76246f     // Catch:{ all -> 0x02ee }
                r1.offer(r11)     // Catch:{ all -> 0x02ee }
                goto L_0x00d2
            L_0x02e8:
                r25.wait()     // Catch:{ InterruptedException -> 0x02eb }
            L_0x02eb:
                monitor-exit(r25)     // Catch:{ all -> 0x02ee }
                goto L_0x0029
            L_0x02ee:
                r0 = move-exception
                monitor-exit(r25)     // Catch:{ all -> 0x02ee }
                throw r0
            L_0x02f1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.f.a.run():void");
        }

        /* access modifiers changed from: package-private */
        public void a(C0798a aVar) {
            C0798a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76241a, false, 89221, new Class[]{C0798a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76241a, false, 89221, new Class[]{C0798a.class}, Void.TYPE);
                return;
            }
            this.g.onNext(aVar2);
        }

        a() {
            this.i.start();
            this.h = AndroidSchedulers.from(this.i.getLooper());
            this.g = PublishSubject.create();
            this.g.toFlowable(BackpressureStrategy.LATEST).observeOn(this.h).subscribe((FlowableSubscriber<? super T>) new DisposableSubscriber<C0798a>(f.this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76247a;

                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f76247a, false, 89230, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f76247a, false, 89230, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    ExceptionMonitor.ensureNotReachHere(th);
                }

                public final /* synthetic */ void onNext(Object obj) {
                    C0798a aVar = (C0798a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f76247a, false, 89229, new Class[]{C0798a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f76247a, false, 89229, new Class[]{C0798a.class}, Void.TYPE);
                        return;
                    }
                    synchronized (a.this) {
                        if (!aVar.f76254e) {
                            a.this.f76243c.add(aVar);
                        } else {
                            a.this.f76243c.clear();
                            a.this.f76242b.clear();
                            a.this.f76242b.offer(aVar);
                        }
                        a.this.notify();
                    }
                }
            });
        }

        public final void a(int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f76241a, false, 89222, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f76241a, false, 89222, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            C0798a a2 = a((String) null, i2, (String[]) null);
            a2.f76254e = true;
            this.g.onNext(a2);
        }

        public final void a(VideoUrlModel videoUrlModel, int i2) {
            if (PatchProxy.isSupport(new Object[]{videoUrlModel, Integer.valueOf(i2)}, this, f76241a, false, 89227, new Class[]{VideoUrlModel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{videoUrlModel, Integer.valueOf(i2)}, this, f76241a, false, 89227, new Class[]{VideoUrlModel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            a(a(0, videoUrlModel, i2));
        }

        private C0798a a(String str, int i2, String[] strArr) {
            if (PatchProxy.isSupport(new Object[]{null, Integer.valueOf(i2), null}, this, f76241a, false, 89216, new Class[]{String.class, Integer.TYPE, String[].class}, C0798a.class)) {
                return (C0798a) PatchProxy.accessDispatch(new Object[]{null, Integer.valueOf(i2), null}, this, f76241a, false, 89216, new Class[]{String.class, Integer.TYPE, String[].class}, C0798a.class);
            }
            C0798a poll = this.f76246f.poll();
            if (poll == null) {
                poll = new C0798a();
            }
            poll.f76251b = null;
            poll.f76250a = i2;
            poll.f76252c = null;
            return poll;
        }

        /* access modifiers changed from: package-private */
        public C0798a a(int i2, VideoUrlModel videoUrlModel, int i3) {
            VideoUrlModel videoUrlModel2 = videoUrlModel;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), videoUrlModel2, Integer.valueOf(i3)}, this, f76241a, false, 89218, new Class[]{Integer.TYPE, VideoUrlModel.class, Integer.TYPE}, C0798a.class)) {
                return (C0798a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), videoUrlModel2, Integer.valueOf(i3)}, this, f76241a, false, 89218, new Class[]{Integer.TYPE, VideoUrlModel.class, Integer.TYPE}, C0798a.class);
            }
            C0798a poll = this.f76246f.poll();
            if (poll == null) {
                poll = new C0798a();
            }
            C0798a aVar = poll;
            aVar.f76250a = i2;
            aVar.f76255f = videoUrlModel2;
            aVar.f76253d = i3;
            return aVar;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final f f76256a = new f((byte) 0);
    }

    public final String e() {
        if (Proxy.k) {
            return "ttnet";
        }
        return "okhttp";
    }

    private f() {
        this.f76217d = new ConcurrentHashMap<>(11);
        this.f76218e = new LinkedHashMap<String, Integer>(10) {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final boolean removeEldestEntry(Map.Entry entry) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{entry}, this, changeQuickRedirect, false, 89190, new Class[]{Map.Entry.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{entry}, this, changeQuickRedirect, false, 89190, new Class[]{Map.Entry.class}, Boolean.TYPE)).booleanValue();
                }
                if (size() <= 10) {
                    z = false;
                }
                if (z && entry != null) {
                    f.this.f76217d.remove(String.valueOf(entry.getKey()));
                }
                return z;
            }
        };
        this.f76219f = new LinkedHashMap<String, e>() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final boolean removeEldestEntry(Map.Entry entry) {
                if (PatchProxy.isSupport(new Object[]{entry}, this, changeQuickRedirect, false, 89204, new Class[]{Map.Entry.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{entry}, this, changeQuickRedirect, false, 89204, new Class[]{Map.Entry.class}, Boolean.TYPE)).booleanValue();
                } else if (size() > 10) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        this.g = new LinkedHashMap<String, List<e>>() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final boolean removeEldestEntry(Map.Entry entry) {
                if (PatchProxy.isSupport(new Object[]{entry}, this, changeQuickRedirect, false, 89205, new Class[]{Map.Entry.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{entry}, this, changeQuickRedirect, false, 89205, new Class[]{Map.Entry.class}, Boolean.TYPE)).booleanValue();
                } else if (size() > 10) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        this.h = new LinkedHashMap<String, List<com.toutiao.proxyserver.a.b>>() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final boolean removeEldestEntry(Map.Entry entry) {
                if (PatchProxy.isSupport(new Object[]{entry}, this, changeQuickRedirect, false, 89206, new Class[]{Map.Entry.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{entry}, this, changeQuickRedirect, false, 89206, new Class[]{Map.Entry.class}, Boolean.TYPE)).booleanValue();
                } else if (size() > 10) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        this.i = new LinkedHashMap<String, com.toutiao.proxyserver.a.a>() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final boolean removeEldestEntry(Map.Entry entry) {
                if (PatchProxy.isSupport(new Object[]{entry}, this, changeQuickRedirect, false, 89207, new Class[]{Map.Entry.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{entry}, this, changeQuickRedirect, false, 89207, new Class[]{Map.Entry.class}, Boolean.TYPE)).booleanValue();
                } else if (size() > 10) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        this.l = 0;
        this.n = 0;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f76214a, false, 89180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76214a, false, 89180, new Class[0], Void.TYPE);
            return;
        }
        if (a()) {
            this.m.a(2);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76214a, false, 89181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76214a, false, 89181, new Class[0], Void.TYPE);
            return;
        }
        if (a()) {
            this.m.a(3);
        }
    }

    public final c d() {
        if (PatchProxy.isSupport(new Object[0], this, f76214a, false, 89170, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f76214a, false, 89170, new Class[0], c.class);
        }
        c cVar = new c();
        for (String str : this.i.keySet()) {
            com.toutiao.proxyserver.a.a aVar = this.i.get(str);
            if (aVar != null) {
                cVar.f76203a += aVar.f79997d;
                cVar.f76204b += aVar.f79996c;
            }
        }
        return cVar;
    }

    private static h f() {
        long j2;
        h hVar;
        if (PatchProxy.isSupport(new Object[0], null, f76214a, true, 89188, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f76214a, true, 89188, new Class[0], h.class);
        }
        Context a2 = d.a();
        if (a2 == null) {
            return null;
        }
        File b2 = com.ss.android.ugc.aweme.video.b.b(a2);
        if (!com.ss.android.ugc.aweme.video.b.h()) {
            b2 = a2.getCacheDir();
        }
        if (b2 == null) {
            return null;
        }
        File file = new File(b2, "cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            j2 = 104857600;
        } else {
            j2 = (bm.a() * 1048576) / 8;
        }
        if (j2 > 104857600) {
            j2 = 104857600;
        } else if (j2 < 10485760) {
            j2 = 10485760;
        }
        try {
            hVar = new h(file);
            try {
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, hVar, h.f80085a, false, 91633, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2)}, hVar, h.f80085a, false, 91633, new Class[]{Long.TYPE}, Void.TYPE);
                } else {
                    hVar.f80090f = j2;
                    hVar.a();
                }
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            hVar = null;
        }
        return hVar;
    }

    public final boolean a() {
        int i2;
        boolean z;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[0], this, f76214a, false, 89172, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76214a, false, 89172, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.m != null) {
            return true;
        } else {
            h f2 = f();
            if (f2 == null) {
                return false;
            }
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71876, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71876, new Class[0], Integer.TYPE)).intValue();
            } else {
                AbTestModel d2 = a2.d();
                if (d2 == null) {
                    i2 = 10;
                } else {
                    i2 = d2.videoSpeedQueueSize;
                }
            }
            if (com.ss.android.ugc.c.b.f77190e != i2 && i2 > 0) {
                com.ss.android.ugc.c.b.f77190e = i2;
                com.ss.android.ugc.c.b a3 = com.ss.android.ugc.c.b.a();
                if (i2 > 0 && i2 != a3.f77193b.size()) {
                    com.ss.android.ugc.c.b.f77191f.lock();
                    try {
                        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
                        arrayBlockingQueue.addAll(a3.f77193b);
                        a3.f77194c = new c[i2];
                        a3.f77193b = arrayBlockingQueue;
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        com.ss.android.ugc.c.b.f77191f.unlock();
                        throw th;
                    }
                    com.ss.android.ugc.c.b.f77191f.unlock();
                }
            }
            o.f80164a = 1;
            p.h.f80166c = new LinkedBlockingQueue();
            Proxy.u = AbTestManager.a().d().videoCacheWriteAsynchronous;
            Proxy.r = 1;
            Proxy.t = AbTestManager.a().am();
            Proxy.l = com.ss.android.ugc.aweme.video.e.c.a();
            Proxy.q = com.ss.android.ugc.aweme.video.e.c.b();
            AbTestManager a4 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a4, AbTestManager.f63777a, false, 71959, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a4, AbTestManager.f63777a, false, 71959, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                AbTestModel d3 = a4.d();
                if (d3 == null) {
                    z = true;
                } else {
                    z = d3.checkVideoCacheRequestHeader;
                }
            }
            Proxy.n = z;
            Proxy.o = AbTestManager.a().d().isPreloadLocalCachePathVideoPlayEnable;
            Proxy.p = AbTestManager.a().d().isVideoCacheAutoAdustPreloadMax;
            Proxy.m = AbTestManager.a().d().videoCacheReadBufferSize;
            com.toutiao.proxyserver.e.c.f80053c = 300;
            AbTestModel d4 = AbTestManager.a().d();
            if (d4.gatherMode != 0 || d4.useTTNet == 1) {
                Proxy.k = true;
            } else {
                Proxy.k = false;
            }
            AnonymousClass8 r3 = new com.toutiao.proxyserver.d.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76237a;

                public final void a(String str, String str2, String str3) {
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f76237a, false, 89208, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f76237a, false, 89208, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (!com.ss.android.ugc.aweme.player.c.f59110b) {
                        com.ss.android.ugc.playerkit.b.b.a(str, str2);
                    }
                    JSONObject a2 = f.this.a(str4, str5, str6);
                    if (a2 != null) {
                        com.ss.android.ugc.aweme.t.b.b("VideoCache", a2);
                    }
                }

                public final void b(String str, String str2, String str3) {
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f76237a, false, 89210, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f76237a, false, 89210, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (!com.ss.android.ugc.aweme.player.c.f59110b) {
                        String str7 = com.ss.android.ugc.playerkit.session.a.a().b().uri;
                        if (com.ss.android.ugc.playerkit.b.b.f77706c != null) {
                            com.ss.android.ugc.playerkit.b.b.f77706c.b(str4, str5, str7);
                        }
                    }
                    JSONObject a2 = f.this.a(str4, str5, str6);
                    if (a2 != null) {
                        if (PatchProxy.isSupport(new Object[]{"VideoCache", a2}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56317, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{"VideoCache", a2}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56317, new Class[]{String.class, JSONObject.class}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull("VideoCache", "eventName");
                        Intrinsics.checkParameterIsNotNull(a2, "msg");
                        if (AbTestManager.a().bY()) {
                            String a3 = com.ss.android.ugc.aweme.t.b.f74535c.a("VideoCache", a2);
                            if (!TextUtils.isEmpty(a3)) {
                                if (PatchProxy.isSupport(new Object[]{a3}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56318, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{a3}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56318, new Class[]{String.class}, Void.TYPE);
                                    return;
                                }
                                Intrinsics.checkParameterIsNotNull(a3, "msg");
                                if (AbTestManager.a().bY()) {
                                    com.ss.android.ugc.aweme.framework.a.a.a(4, com.ss.android.ugc.aweme.t.b.f74534b, a3);
                                }
                            }
                        }
                    }
                }

                public final void c(String str, String str2, String str3) {
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f76237a, false, 89211, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f76237a, false, 89211, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (!com.ss.android.ugc.aweme.player.c.f59110b) {
                        String str7 = com.ss.android.ugc.playerkit.session.a.a().b().uri;
                        if (com.ss.android.ugc.playerkit.b.b.f77706c != null) {
                            com.ss.android.ugc.playerkit.b.b.f77706c.c(str4, str5, str7);
                        }
                    }
                    JSONObject a2 = f.this.a(str4, str5, str6);
                    if (a2 != null) {
                        if (PatchProxy.isSupport(new Object[]{"VideoCache", a2}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56320, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{"VideoCache", a2}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56320, new Class[]{String.class, JSONObject.class}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull("VideoCache", "eventName");
                        Intrinsics.checkParameterIsNotNull(a2, "msg");
                        if (AbTestManager.a().bY()) {
                            String a3 = com.ss.android.ugc.aweme.t.b.f74535c.a("VideoCache", a2);
                            if (!TextUtils.isEmpty(a3)) {
                                if (PatchProxy.isSupport(new Object[]{a3}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56321, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{a3}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56321, new Class[]{String.class}, Void.TYPE);
                                    return;
                                }
                                Intrinsics.checkParameterIsNotNull(a3, "msg");
                                if (AbTestManager.a().bY()) {
                                    com.ss.android.ugc.aweme.framework.a.a.a(5, com.ss.android.ugc.aweme.t.b.f74534b, a3);
                                }
                            }
                        }
                    }
                }

                public final void d(String str, String str2, String str3) {
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f76237a, false, 89212, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f76237a, false, 89212, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (!com.ss.android.ugc.aweme.player.c.f59110b) {
                        String str7 = com.ss.android.ugc.playerkit.session.a.a().b().uri;
                        if (com.ss.android.ugc.playerkit.b.b.f77706c != null) {
                            com.ss.android.ugc.playerkit.b.b.f77706c.d(str4, str5, str7);
                        }
                    }
                    JSONObject a2 = f.this.a(str4, str5, str6);
                    if (a2 != null) {
                        if (PatchProxy.isSupport(new Object[]{"VideoCache", a2}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56323, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{"VideoCache", a2}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56323, new Class[]{String.class, JSONObject.class}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull("VideoCache", "eventName");
                        Intrinsics.checkParameterIsNotNull(a2, "msg");
                        if (AbTestManager.a().bY()) {
                            String a3 = com.ss.android.ugc.aweme.t.b.f74535c.a("VideoCache", a2);
                            if (!TextUtils.isEmpty(a3)) {
                                if (PatchProxy.isSupport(new Object[]{a3}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56324, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{a3}, null, com.ss.android.ugc.aweme.t.b.f74533a, true, 56324, new Class[]{String.class}, Void.TYPE);
                                    return;
                                }
                                Intrinsics.checkParameterIsNotNull(a3, "msg");
                                if (AbTestManager.a().bY()) {
                                    com.ss.android.ugc.aweme.framework.a.a.a(6, com.ss.android.ugc.aweme.t.b.f74534b, a3);
                                }
                            }
                        }
                    }
                }
            };
            if (PatchProxy.isSupport(new Object[]{r3}, null, Proxy.f79953a, true, 91700, new Class[]{com.toutiao.proxyserver.d.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r3}, null, Proxy.f79953a, true, 91700, new Class[]{com.toutiao.proxyserver.d.a.class}, Void.TYPE);
            } else {
                com.toutiao.proxyserver.d.c.f80042b = r3;
            }
            Proxy.s = new com.toutiao.proxyserver.d.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76239a;

                public final void a(String str, long j, String str2) {
                    String str3 = str;
                    long j2 = j;
                    if (PatchProxy.isSupport(new Object[]{str3, new Long(j2), str2}, this, f76239a, false, 89213, new Class[]{String.class, Long.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str3, new Long(j2), str2}, this, f76239a, false, 89213, new Class[]{String.class, Long.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.playerkit.a.a().a(com.ss.android.ugc.playerkit.session.a.a().b().uri, str3, j2);
                }
            };
            com.toutiao.proxyserver.d.c.f80043c = true;
            Proxy.i = new l() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76220a;

                public final void a(int i, String str, String str2) {
                    int i2 = i;
                    String str3 = str;
                    String str4 = str2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, this, f76220a, false, 89214, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, this, f76220a, false, 89214, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("video_cache_error_code", i2);
                        if (str.length() > 1500) {
                            str3 = str3.substring(0, 1500);
                        }
                        jSONObject.put("video_cache_msg", str3);
                        jSONObject.put("video_cache_use_ttnet", Proxy.k);
                        com.ss.android.ugc.playerkit.b.b.a(str4, i2, jSONObject.toString());
                        n.a("video_cache_error_report", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            };
            Proxy.j = new k() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76222a;

                public final void a(int i, String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f76222a, false, 89215, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f76222a, false, 89215, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i);
                        jSONObject.put(PushConstants.WEB_URL, str2);
                        n.a("aweme_media_play_video_data_download", "aweme_media_play_video_data_download", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            };
            Proxy.h = new m() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76224a;

                public final void a(com.toutiao.proxyserver.a.a aVar) {
                    com.toutiao.proxyserver.a.a aVar2 = aVar;
                    if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76224a, false, 89191, new Class[]{com.toutiao.proxyserver.a.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76224a, false, 89191, new Class[]{com.toutiao.proxyserver.a.a.class}, Void.TYPE);
                    } else if (aVar2.f79994a == null || aVar2.f79997d < 0 || aVar2.f79996c <= 0) {
                    } else {
                        f.this.i.put(aVar2.f79994a, aVar2);
                    }
                }
            };
            Proxy.g = new com.toutiao.proxyserver.n() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76226a;

                public final void a(boolean z, String str, boolean z2, int i, int i2, int i3, int i4, String str2) {
                    String str3 = str;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str3, Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2}, this, f76226a, false, 89192, new Class[]{Boolean.TYPE, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str3, Byte.valueOf(z2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2}, this, f76226a, false, 89192, new Class[]{Boolean.TYPE, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    f.this.f76217d.put(str3, Integer.valueOf(i3));
                    f.this.f76218e.put(str3, Integer.valueOf(i3));
                }

                public final void a(boolean z, String str, int i, long j, long j2) {
                    int i2 = i;
                    long j3 = j;
                    long j4 = j2;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str, Integer.valueOf(i), new Long(j3), new Long(j4)}, this, f76226a, false, 89195, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str, Integer.valueOf(i), new Long(j3), new Long(j4)}, this, f76226a, false, 89195, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i2 > 0) {
                        if (j3 <= 0 || AbTestManager.a().d().videoNetworkSpeedAlgorithm != 2) {
                            if (AbTestManager.a().d().videoDownloadSpeedCostTime != 1) {
                                j3 = j4;
                            }
                            if (j3 > 0) {
                                double d2 = (double) i2;
                                Double.isNaN(d2);
                                double d3 = (double) j3;
                                Double.isNaN(d3);
                                com.ss.android.ugc.c.b.a().a((8.0d * d2) / (d3 / 1000.0d), d2, j3);
                            }
                        } else {
                            com.ss.android.ugc.c.b.a().d();
                        }
                    }
                }

                public final void a(com.toutiao.proxyserver.a.b bVar) {
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f76226a, false, 89194, new Class[]{com.toutiao.proxyserver.a.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f76226a, false, 89194, new Class[]{com.toutiao.proxyserver.a.b.class}, Void.TYPE);
                    } else if (bVar != null && bVar.f79998a != null && bVar.f80001d >= 0 && bVar.f80000c > 0) {
                        List list = f.this.h.get(bVar.f79998a);
                        if (list == null) {
                            list = new ArrayList();
                            f.this.h.put(bVar.f79998a, list);
                        }
                        list.add(bVar);
                    }
                }

                public final void a(com.toutiao.proxyserver.a.c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f76226a, false, 89199, new Class[]{com.toutiao.proxyserver.a.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f76226a, false, 89199, new Class[]{com.toutiao.proxyserver.a.c.class}, Void.TYPE);
                        return;
                    }
                    if (cVar != null && !TextUtils.isEmpty(cVar.f80003b)) {
                        e eVar = new e(cVar);
                        f.this.f76219f.put(cVar.f80003b, eVar);
                        List list = f.this.g.get(cVar.f80003b);
                        if (list == null && !TextUtils.isEmpty(eVar.f76209b)) {
                            list = new ArrayList();
                            f.this.g.put(eVar.f76209b, list);
                        }
                        if (list != null) {
                            list.add(eVar);
                        }
                    }
                }

                public final void a(JSONObject jSONObject) {
                    final JSONObject jSONObject2 = jSONObject;
                    if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f76226a, false, 89193, new Class[]{JSONObject.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f76226a, false, 89193, new Class[]{JSONObject.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.b.a.a.a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f76228a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f76228a, false, 89200, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f76228a, false, 89200, new Class[0], Void.TYPE);
                                return;
                            }
                            try {
                                n.a("aweme_play_416", com.ss.android.ugc.aweme.video.e.c.a(jSONObject2));
                            } catch (JSONException unused) {
                            }
                        }
                    });
                }

                public final void a(String str, String str2) {
                    if (PatchProxy.isSupport(new Object[]{str, str2}, this, f76226a, false, 89198, new Class[]{String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, str2}, this, f76226a, false, 89198, new Class[]{String.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (f.this.j != null) {
                        f.this.j.get();
                    }
                }

                public final void a(boolean z, String str, int i, int i2) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str, Integer.valueOf(i), Integer.valueOf(i2)}, this, f76226a, false, 89196, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str, Integer.valueOf(i), Integer.valueOf(i2)}, this, f76226a, false, 89196, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (f.this.k != null) {
                        a aVar = (a) f.this.k.get();
                        if (aVar != null) {
                            aVar.a(str, (long) i, (long) i2);
                        }
                    }
                }

                public final void a(boolean z, String str, int i, int i2, String str2, String str3) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str, Integer.valueOf(i), Integer.valueOf(i2), str2, str3}, this, f76226a, false, 89197, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                        Object[] objArr = {Byte.valueOf(z), str, Integer.valueOf(i), Integer.valueOf(i2), str2, str3};
                        Object[] objArr2 = objArr;
                        PatchProxy.accessDispatch(objArr2, this, f76226a, false, 89197, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE);
                        return;
                    }
                    final boolean z2 = z;
                    final String str4 = str;
                    final int i3 = i;
                    final int i4 = i2;
                    final String str5 = str3;
                    AnonymousClass2 r0 = new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f76231a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f76231a, false, 89201, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f76231a, false, 89201, new Class[0], Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.app.d.c cVar = new com.ss.android.ugc.aweme.app.d.c();
                            cVar.a("disableAutoDiskCacheManagement", Boolean.valueOf(z2));
                            cVar.a("key", str4);
                            cVar.a("oldContentLength", Integer.valueOf(i3));
                            cVar.a("newContentLength", Integer.valueOf(i4));
                            cVar.a("previousInfo", str5);
                            com.ss.android.ugc.aweme.video.e.c.a(cVar);
                            n.a("aweme_play_content_length_not_match", cVar.b());
                        }
                    };
                    com.ss.android.b.a.a.a.a(r0);
                }
            };
            q a5 = q.a();
            if (PatchProxy.isSupport(new Object[0], a5, q.f80201a, false, 91711, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a5, q.f80201a, false, 91711, new Class[0], Void.TYPE);
            } else if (a5.o.compareAndSet(false, true)) {
                new Thread(a5.n).start();
            }
            try {
                this.m = new a();
                this.m.start();
                Context context = AwemeAppData.p().c().getContext();
                if (PatchProxy.isSupport(new Object[]{f2, context}, null, Proxy.f79953a, true, 91701, new Class[]{h.class, Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{f2, context}, null, Proxy.f79953a, true, 91701, new Class[]{h.class, Context.class}, Void.TYPE);
                } else if (f2 == null || context == null) {
                    throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
                } else {
                    Proxy.f79957e = context.getApplicationContext();
                    if (Proxy.f79955c == null) {
                        g gVar = Proxy.f79954b;
                        if (gVar != null) {
                            if (gVar.f80082b.getAbsolutePath().equals(f2.f80086b.getAbsolutePath())) {
                                throw new IllegalArgumentException("DiskLruCache 和 DiskCache 不能使用相同的目录");
                            }
                        }
                        Proxy.f79955c = f2;
                        Proxy.f79956d = com.toutiao.proxyserver.b.c.a(context);
                        h hVar = Proxy.f79955c;
                        Proxy.AnonymousClass1 r11 = new h.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f79959a;

                            public final void a(String str) {
                                String str2 = str;
                                if (PatchProxy.isSupport(new Object[]{str2}, this, f79959a, false, 91705, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str2}, this, f79959a, false, 91705, new Class[]{String.class}, Void.TYPE);
                                    return;
                                }
                                com.toutiao.proxyserver.d.c.b("TAG_PROXY_DiskLruCache", "new cache created: " + str2);
                            }

                            public final void a(Set<String> set) {
                                Set<String> set2 = set;
                                if (PatchProxy.isSupport(new Object[]{set2}, this, f79959a, false, 91706, new Class[]{Set.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{set2}, this, f79959a, false, 91706, new Class[]{Set.class}, Void.TYPE);
                                    return;
                                }
                                com.toutiao.proxyserver.b.c cVar = Proxy.f79956d;
                                if (PatchProxy.isSupport(new Object[]{set2, 0}, cVar, com.toutiao.proxyserver.b.c.f80015a, false, 91780, new Class[]{Collection.class, Integer.TYPE}, Void.TYPE)) {
                                    Object[] objArr = {set2, 0};
                                    com.toutiao.proxyserver.b.c cVar2 = cVar;
                                    PatchProxy.accessDispatch(objArr, cVar2, com.toutiao.proxyserver.b.c.f80015a, false, 91780, new Class[]{Collection.class, Integer.TYPE}, Void.TYPE);
                                } else if (set2 != null && !set.isEmpty()) {
                                    String[] strArr = new String[(set.size() + 1)];
                                    int i = -1;
                                    Map map = cVar.f80017b.get(0);
                                    for (String next : set) {
                                        if (map != null) {
                                            map.remove(next);
                                        }
                                        i++;
                                        strArr[i] = next;
                                    }
                                    strArr[i + 1] = PushConstants.PUSH_TYPE_NOTIFY;
                                    try {
                                        SQLiteDatabase writableDatabase = cVar.f80018c.getWritableDatabase();
                                        writableDatabase.delete("video_http_header_t", "key IN(" + cVar.a(strArr.length - 1) + ") AND flag" + "=?", strArr);
                                    } catch (Throwable unused) {
                                    }
                                }
                                com.toutiao.proxyserver.d.c.b("TAG_PROXY_DiskLruCache", "cache file removed, " + set2);
                            }
                        };
                        if (PatchProxy.isSupport(new Object[]{r11}, hVar, h.f80085a, false, 91630, new Class[]{h.a.class}, Void.TYPE)) {
                            h hVar2 = hVar;
                            PatchProxy.accessDispatch(new Object[]{r11}, hVar2, h.f80085a, false, 91630, new Class[]{h.a.class}, Void.TYPE);
                        } else {
                            hVar.f80089e.add(r11);
                        }
                        q a6 = q.a();
                        a6.h = f2;
                        a6.g = Proxy.f79956d;
                        p a7 = p.a();
                        a7.f80171e = f2;
                        a7.f80170d = Proxy.f79956d;
                    }
                }
                if (PatchProxy.isSupport(new Object[0], this, f76214a, false, 89174, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f76214a, false, 89174, new Class[0], Void.TYPE);
                } else {
                    int i5 = 30000;
                    if (Proxy.k) {
                        AbTestManager a8 = AbTestManager.a();
                        if (PatchProxy.isSupport(new Object[0], a8, AbTestManager.f63777a, false, 71928, new Class[0], Integer.TYPE)) {
                            i4 = ((Integer) PatchProxy.accessDispatch(new Object[0], a8, AbTestManager.f63777a, false, 71928, new Class[0], Integer.TYPE)).intValue();
                        } else {
                            AbTestModel d5 = a8.d();
                            if (d5 != null) {
                                i4 = d5.videocacheTtnetPreloadTimeout;
                            }
                        }
                        i5 = i4;
                    }
                    p a9 = p.a();
                    a9.i = (long) i5;
                    a9.j = 30000;
                    a9.k = 30000;
                }
                if (PatchProxy.isSupport(new Object[0], this, f76214a, false, 89175, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f76214a, false, 89175, new Class[0], Void.TYPE);
                } else {
                    int i6 = 10000;
                    if (Proxy.k) {
                        AbTestManager a10 = AbTestManager.a();
                        if (PatchProxy.isSupport(new Object[0], a10, AbTestManager.f63777a, false, 71929, new Class[0], Integer.TYPE)) {
                            i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], a10, AbTestManager.f63777a, false, 71929, new Class[0], Integer.TYPE)).intValue();
                        } else {
                            AbTestModel d6 = a10.d();
                            if (d6 != null) {
                                i3 = d6.videocacheTtnetProxyTimeout;
                            }
                        }
                        i6 = i3;
                    }
                    q a11 = q.a();
                    a11.k = (long) i6;
                    a11.l = 10000;
                    a11.m = 10000;
                }
                return true;
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
                return false;
            }
        }
    }

    /* synthetic */ f(byte b2) {
        this();
    }

    public final void a(int i2) {
        p.h.f80165b = i2;
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76214a, false, 89186, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76214a, false, 89186, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.k = new WeakReference<>(aVar2);
    }

    public final int b(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76214a, false, 89167, new Class[]{VideoUrlModel.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76214a, false, 89167, new Class[]{VideoUrlModel.class}, Integer.TYPE)).intValue();
        } else if (videoUrlModel != null) {
            try {
                Integer num = this.f76217d.get(videoUrlModel.getBitRatedRatioUri());
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (Exception unused) {
            }
        } else {
            return 0;
        }
    }

    public final boolean c(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76214a, false, 89176, new Class[]{VideoUrlModel.class}, Boolean.TYPE)) {
            return a(videoUrlModel2, -1);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76214a, false, 89176, new Class[]{VideoUrlModel.class}, Boolean.TYPE)).booleanValue();
    }

    public final d e(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76214a, false, 89168, new Class[]{VideoUrlModel.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76214a, false, 89168, new Class[]{VideoUrlModel.class}, d.class);
        }
        try {
            List<com.toutiao.proxyserver.a.b> list = this.h.get(videoUrlModel.getBitRatedRatioUri());
            if (list != null && list.size() > 0) {
                d dVar = new d();
                dVar.f76207c = list.size();
                for (com.toutiao.proxyserver.a.b bVar : list) {
                    if (bVar != null) {
                        dVar.f76205a += bVar.f80001d;
                        dVar.f76206b += bVar.f80000c;
                    }
                }
                return dVar;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final e f(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76214a, false, 89164, new Class[]{VideoUrlModel.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76214a, false, 89164, new Class[]{VideoUrlModel.class}, e.class);
        }
        try {
            return this.f76219f.get(videoUrlModel.getBitRatedRatioUri());
        } catch (Exception unused) {
            return null;
        }
    }

    public final List<e> g(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76214a, false, 89165, new Class[]{VideoUrlModel.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76214a, false, 89165, new Class[]{VideoUrlModel.class}, List.class);
        }
        return this.g.get(videoUrlModel.getBitRatedRatioUri());
    }

    public final long a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f76214a, false, 89184, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str}, this, f76214a, false, 89184, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        p a2 = p.a();
        if (PatchProxy.isSupport(new Object[]{str}, a2, p.f80167a, false, 91673, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str}, a2, p.f80167a, false, 91673, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        if (PatchProxy.isSupport(new Object[]{(byte) 0, str}, a2, p.f80167a, false, 91674, new Class[]{Boolean.TYPE, String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{(byte) 0, str}, a2, p.f80167a, false, 91674, new Class[]{Boolean.TYPE, String.class}, Long.TYPE)).longValue();
        }
        h hVar = a2.f80171e;
        if (hVar == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        File e2 = hVar.e(com.toutiao.proxyserver.f.a.a(str));
        if (e2 != null) {
            long length = e2.length();
            if (length > 0) {
                return length;
            }
        }
        return 0;
    }

    public final long b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f76214a, false, 89185, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str}, this, f76214a, false, 89185, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        p a2 = p.a();
        if (PatchProxy.isSupport(new Object[]{str}, a2, p.f80167a, false, 91671, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str}, a2, p.f80167a, false, 91671, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        if (PatchProxy.isSupport(new Object[]{(byte) 0, str}, a2, p.f80167a, false, 91672, new Class[]{Boolean.TYPE, String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{(byte) 0, str}, a2, p.f80167a, false, 91672, new Class[]{Boolean.TYPE, String.class}, Long.TYPE)).longValue();
        }
        com.toutiao.proxyserver.b.c cVar = a2.f80170d;
        if (cVar == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        com.toutiao.proxyserver.b.a a3 = cVar.a(com.toutiao.proxyserver.f.a.a(str), com.toutiao.proxyserver.b.b.a(false));
        if (a3 == null) {
            return 0;
        }
        return (long) a3.f80012d;
    }

    public final void d(VideoUrlModel videoUrlModel) {
        a.C0798a aVar;
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76214a, false, 89178, new Class[]{VideoUrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76214a, false, 89178, new Class[]{VideoUrlModel.class}, Void.TYPE);
            return;
        }
        if (a()) {
            a aVar2 = this.m;
            if (PatchProxy.isSupport(new Object[]{videoUrlModel2}, aVar2, a.f76241a, false, 89220, new Class[]{VideoUrlModel.class}, Void.TYPE)) {
                a aVar3 = aVar2;
                PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, aVar3, a.f76241a, false, 89220, new Class[]{VideoUrlModel.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{1, videoUrlModel2}, aVar2, a.f76241a, false, 89217, new Class[]{Integer.TYPE, VideoUrlModel.class}, a.C0798a.class)) {
                a aVar4 = aVar2;
                aVar = (a.C0798a) PatchProxy.accessDispatch(new Object[]{1, videoUrlModel2}, aVar4, a.f76241a, false, 89217, new Class[]{Integer.TYPE, VideoUrlModel.class}, a.C0798a.class);
            } else {
                aVar = aVar2.a(1, videoUrlModel2, -1);
            }
            aVar2.a(aVar);
        }
    }

    public final boolean a(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76214a, false, 89166, new Class[]{VideoUrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76214a, false, 89166, new Class[]{VideoUrlModel.class}, Boolean.TYPE)).booleanValue();
        }
        if (videoUrlModel != null) {
            String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
            try {
                if (this.f76217d.get(bitRatedRatioUri) == null || this.f76217d.get(bitRatedRatioUri).intValue() <= 0) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void b(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f76214a, false, 89187, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f76214a, false, 89187, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.k != null && this.k.get() == aVar) {
            this.k = null;
        }
    }

    public final boolean a(VideoUrlModel videoUrlModel, int i2) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel2, Integer.valueOf(i2)}, this, f76214a, false, 89177, new Class[]{VideoUrlModel.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel2, Integer.valueOf(i2)}, this, f76214a, false, 89177, new Class[]{VideoUrlModel.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (a()) {
            this.m.a(videoUrlModel2, i2);
            return true;
        } else {
            return false;
        }
    }

    public final JSONObject a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f76214a, false, 89171, new Class[]{String.class, String.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f76214a, false, 89171, new Class[]{String.class, String.class, String.class}, JSONObject.class);
        } else if (!AbTestManager.a().bY()) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("tag", str4);
                jSONObject.put("msg", str5);
                jSONObject.put("vid", str6);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(com.ss.android.ugc.aweme.feed.model.VideoUrlModel r22, java.lang.String r23, java.lang.String[] r24) {
        /*
            r21 = this;
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r22
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f76214a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r5 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r13] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r7 = 0
            r8 = 89183(0x15c5f, float:1.24972E-40)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0058
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r22
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f76214a
            r17 = 0
            r18 = 89183(0x15c5f, float:1.24972E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r1 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0058:
            boolean r4 = com.ss.android.ugc.aweme.feed.cache.a.c()
            r5 = 0
            if (r4 == 0) goto L_0x0146
            com.ss.android.ugc.aweme.feed.cache.a r4 = com.ss.android.ugc.aweme.feed.cache.a.f45154c
            java.lang.String r0 = r22.getSourceId()
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.feed.cache.a.f45152a
            r17 = 0
            r18 = 40921(0x9fd9, float:5.7343E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r11] = r7
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r4
            r19 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r6 == 0) goto L_0x009e
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.feed.cache.a.f45152a
            r17 = 0
            r18 = 40921(0x9fd9, float:5.7343E-41)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r0[r11] = r6
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r4
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00ed
        L_0x009e:
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            if (r4 == 0) goto L_0x00ec
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00ae
            goto L_0x00ec
        L_0x00ae:
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r6 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r6)
            java.io.File r4 = r4.getCacheDir()
            java.lang.String r6 = "GlobalContext.getContext().cacheDir"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r6)
            java.lang.String r4 = r4.getAbsolutePath()
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x00ec
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = java.io.File.separator
            r6.append(r4)
            java.lang.String r4 = "feedCache"
            r6.append(r4)
            java.lang.String r4 = java.io.File.separator
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            goto L_0x00ed
        L_0x00ec:
            r0 = r5
        L_0x00ed:
            com.ss.android.ugc.aweme.feed.cache.a r4 = com.ss.android.ugc.aweme.feed.cache.a.f45154c
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.feed.cache.a.f45152a
            r17 = 0
            r18 = 40910(0x9fce, float:5.7327E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r11] = r7
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r15 = r4
            r19 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r6 == 0) goto L_0x012c
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.feed.cache.a.f45152a
            r17 = 0
            r18 = 40910(0x9fce, float:5.7327E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r11] = r7
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r15 = r4
            r19 = r6
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x0143
        L_0x012c:
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0142
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            boolean r4 = r4.exists()
            if (r4 == 0) goto L_0x0142
            r4 = 1
            goto L_0x0143
        L_0x0142:
            r4 = 0
        L_0x0143:
            if (r4 == 0) goto L_0x0146
            return r0
        L_0x0146:
            com.toutiao.proxyserver.q r0 = com.toutiao.proxyserver.q.a()
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r11] = r1
            r14[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = com.toutiao.proxyserver.q.f80201a
            r17 = 0
            r18 = 91709(0x1663d, float:1.28512E-40)
            java.lang.Class[] r4 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r11] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r4[r12] = r6
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r0
            r19 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r4 == 0) goto L_0x018f
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r11] = r1
            r14[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = com.toutiao.proxyserver.q.f80201a
            r17 = 0
            r18 = 91709(0x1663d, float:1.28512E-40)
            java.lang.Class[] r1 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r11] = r2
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r1[r12] = r2
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r0
            r19 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x018f:
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r11)
            r14[r11] = r4
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = com.toutiao.proxyserver.q.f80201a
            r17 = 0
            r18 = 91710(0x1663e, float:1.28513E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r4[r11] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r12] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r4[r13] = r6
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r0
            r19 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r4 == 0) goto L_0x01e8
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r11)
            r14[r11] = r4
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = com.toutiao.proxyserver.q.f80201a
            r17 = 0
            r18 = 91710(0x1663e, float:1.28513E-40)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r11] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r12] = r2
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r1[r13] = r2
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r0
            r19 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x01e8:
            boolean r3 = android.text.TextUtils.isEmpty(r23)
            if (r3 != 0) goto L_0x0271
            if (r2 == 0) goto L_0x0271
            int r3 = r2.length
            if (r3 > 0) goto L_0x01f5
            goto L_0x0271
        L_0x01f5:
            com.toutiao.proxyserver.h r3 = r0.h
            if (r3 == 0) goto L_0x026e
            com.toutiao.proxyserver.b.c r4 = r0.g
            if (r4 != 0) goto L_0x01fe
            goto L_0x026e
        L_0x01fe:
            java.lang.String r4 = com.toutiao.proxyserver.f.a.a(r23)
            boolean r5 = com.toutiao.proxyserver.Proxy.o
            if (r5 == 0) goto L_0x023e
            java.io.File r3 = r3.d(r4)
            boolean r5 = r3.exists()
            if (r5 == 0) goto L_0x023e
            boolean r5 = r3.isFile()
            if (r5 == 0) goto L_0x023e
            com.toutiao.proxyserver.b.c r5 = r0.g
            int r6 = com.toutiao.proxyserver.b.b.a((boolean) r11)
            com.toutiao.proxyserver.b.a r5 = r5.a(r4, r6)
            if (r5 == 0) goto L_0x023e
            long r6 = r3.length()
            int r8 = r5.f80012d
            long r8 = (long) r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x023e
            com.toutiao.proxyserver.n r2 = com.toutiao.proxyserver.Proxy.g
            if (r2 == 0) goto L_0x0239
            com.toutiao.proxyserver.q$3 r2 = new com.toutiao.proxyserver.q$3
            r2.<init>(r1, r5, r11)
            com.toutiao.proxyserver.f.c.b((java.lang.Runnable) r2)
        L_0x0239:
            java.lang.String r0 = r3.getAbsolutePath()
            return r0
        L_0x023e:
            java.util.List r3 = com.toutiao.proxyserver.f.c.a((java.lang.String[]) r24)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f80205d
            int r5 = r5.get()
            if (r5 != r12) goto L_0x026b
            if (r3 == 0) goto L_0x026b
            java.lang.String r1 = com.toutiao.proxyserver.t.a(r1, r4, r3)
            if (r1 == 0) goto L_0x026b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "http://127.0.0.1:"
            r2.<init>(r3)
            int r0 = r0.f80204c
            r2.append(r0)
            java.lang.String r0 = "?"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x026b:
            r0 = r2[r11]
            return r0
        L_0x026e:
            r0 = r2[r11]
            return r0
        L_0x0271:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.f.a(com.ss.android.ugc.aweme.feed.model.VideoUrlModel, java.lang.String, java.lang.String[]):java.lang.Object");
    }
}

package com.bytedance.crash.event;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.crash.i.h;
import com.bytedance.crash.j;
import com.bytedance.services.apm.api.IApmAgent;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Context f19429a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile e<a> f19430b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Runnable f19431c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<a> f19432d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f19433e;

    static class a implements Runnable {
        private a() {
        }

        public final void run() {
            a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00de, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00da */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized void a() {
            /*
                r8 = this;
                monitor-enter(r8)
                com.bytedance.crash.event.c.b()     // Catch:{ all -> 0x00df }
                com.bytedance.crash.event.e r0 = com.bytedance.crash.event.c.c()     // Catch:{ all -> 0x00df }
                int r1 = r0.a()     // Catch:{ all -> 0x00df }
                if (r1 > 0) goto L_0x0010
                monitor-exit(r8)
                return
            L_0x0010:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
                java.lang.String r2 = "collectAndUpload "
                r1.<init>(r2)     // Catch:{ all -> 0x00df }
                int r2 = r0.a()     // Catch:{ all -> 0x00df }
                r1.append(r2)     // Catch:{ all -> 0x00df }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00df }
                com.bytedance.crash.runtime.b r2 = com.bytedance.crash.j.e()     // Catch:{ all -> 0x00df }
                boolean r2 = r2.m     // Catch:{ all -> 0x00df }
                if (r2 == 0) goto L_0x0037
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00df }
                r2.<init>()     // Catch:{ all -> 0x00df }
                java.lang.String r3 = "event"
                r2.put(r3, r1)     // Catch:{ JSONException -> 0x0037 }
                com.bytedance.crash.event.c.a((org.json.JSONObject) r2)     // Catch:{ JSONException -> 0x0037 }
            L_0x0037:
                java.util.ArrayList r1 = r0.b()     // Catch:{ all -> 0x00df }
                boolean r2 = com.bytedance.crash.i.j.a(r1)     // Catch:{ all -> 0x00df }
                if (r2 != 0) goto L_0x00dd
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00df }
                r2.<init>()     // Catch:{ all -> 0x00df }
                org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x00df }
                r3.<init>()     // Catch:{ all -> 0x00df }
                r4 = 0
                r5 = 0
            L_0x004d:
                int r6 = r1.size()     // Catch:{ all -> 0x00df }
                if (r5 >= r6) goto L_0x0065
                java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x00df }
                com.bytedance.crash.event.a r6 = (com.bytedance.crash.event.a) r6     // Catch:{ all -> 0x00df }
                if (r6 == 0) goto L_0x0062
                org.json.JSONObject r6 = r6.a()     // Catch:{ all -> 0x00df }
                r3.put(r6)     // Catch:{ all -> 0x00df }
            L_0x0062:
                int r5 = r5 + 1
                goto L_0x004d
            L_0x0065:
                java.lang.String r5 = "data"
                r2.put(r5, r3)     // Catch:{ JSONException -> 0x006a }
            L_0x006a:
                com.bytedance.crash.upload.g$a r3 = new com.bytedance.crash.upload.g$a     // Catch:{ all -> 0x00df }
                r3.<init>()     // Catch:{ all -> 0x00df }
                java.lang.String r5 = "http://log.snssdk.com/monitor/collect/c/crash_client_event"
                r3.f19582a = r5     // Catch:{ all -> 0x00df }
                java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x00df }
                byte[] r5 = r5.getBytes()     // Catch:{ all -> 0x00df }
                r3.f19586e = r5     // Catch:{ all -> 0x00df }
                r5 = 1
                r3.f19584c = r5     // Catch:{ all -> 0x00df }
                r3.f19585d = r5     // Catch:{ all -> 0x00df }
                com.bytedance.crash.upload.g r6 = new com.bytedance.crash.upload.g     // Catch:{ all -> 0x00df }
                r6.<init>()     // Catch:{ all -> 0x00df }
                java.lang.String r7 = r3.f19582a     // Catch:{ all -> 0x00df }
                r6.f19577a = r7     // Catch:{ all -> 0x00df }
                java.lang.String r7 = r3.f19583b     // Catch:{ all -> 0x00df }
                r6.f19578b = r7     // Catch:{ all -> 0x00df }
                boolean r7 = r3.f19584c     // Catch:{ all -> 0x00df }
                r6.f19579c = r7     // Catch:{ all -> 0x00df }
                boolean r7 = r3.f19585d     // Catch:{ all -> 0x00df }
                r6.f19580d = r7     // Catch:{ all -> 0x00df }
                byte[] r3 = r3.f19586e     // Catch:{ all -> 0x00df }
                r6.f19581e = r3     // Catch:{ all -> 0x00df }
                com.bytedance.crash.upload.h r3 = com.bytedance.crash.upload.b.a((com.bytedance.crash.upload.g) r6)     // Catch:{ all -> 0x00df }
                com.bytedance.crash.event.c.a((org.json.JSONObject) r2)     // Catch:{ all -> 0x00df }
                boolean r2 = r3.a()     // Catch:{ all -> 0x00df }
                if (r2 == 0) goto L_0x00dd
                org.json.JSONObject r2 = r3.f19589c     // Catch:{ all -> 0x00df }
                if (r2 == 0) goto L_0x00b7
                org.json.JSONObject r2 = r3.f19589c     // Catch:{ all -> 0x00df }
                java.lang.String r6 = "state"
                int r2 = r2.optInt(r6)     // Catch:{ all -> 0x00df }
                if (r2 != 0) goto L_0x00b7
                r4 = 1
            L_0x00b7:
                if (r4 == 0) goto L_0x00bc
                r0.a((java.util.ArrayList<T>) r1)     // Catch:{ all -> 0x00df }
            L_0x00bc:
                com.bytedance.crash.runtime.b r0 = com.bytedance.crash.j.e()     // Catch:{ all -> 0x00df }
                boolean r0 = r0.m     // Catch:{ all -> 0x00df }
                if (r0 == 0) goto L_0x00dd
                org.json.JSONObject r0 = r3.f19589c     // Catch:{ all -> 0x00df }
                if (r0 != 0) goto L_0x00cd
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00df }
                r0.<init>()     // Catch:{ all -> 0x00df }
            L_0x00cd:
                java.lang.String r1 = "device_id"
                com.bytedance.crash.runtime.k r2 = com.bytedance.crash.j.c()     // Catch:{ JSONException -> 0x00da }
                java.lang.String r2 = r2.a()     // Catch:{ JSONException -> 0x00da }
                r0.put(r1, r2)     // Catch:{ JSONException -> 0x00da }
            L_0x00da:
                com.bytedance.crash.event.c.a((org.json.JSONObject) r0)     // Catch:{ all -> 0x00df }
            L_0x00dd:
                monitor-exit(r8)
                return
            L_0x00df:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.event.c.a.a():void");
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    private c() {
    }

    private static Runnable d() {
        if (f19431c == null) {
            synchronized (c.class) {
                if (f19431c == null) {
                    f19431c = new a((byte) 0);
                }
            }
        }
        return f19431c;
    }

    public static void a() {
        if (!com.bytedance.crash.i.a.b(j.d())) {
            return;
        }
        if (c().a() > 0 || f19432d.size() > 0) {
            e().execute(d());
        }
    }

    public static void b() {
        e<a> c2 = c();
        for (int i = 0; i < f19432d.size(); i++) {
            a aVar = f19432d.get(i);
            if (aVar != null) {
                c2.a(aVar);
            }
        }
        f19432d.clear();
    }

    public static e<a> c() {
        Context context;
        if (f19430b == null) {
            synchronized (c.class) {
                if (f19430b == null) {
                    if (f19429a == null) {
                        context = j.d();
                    } else {
                        context = f19429a;
                    }
                    f19430b = new d(new File(h.e(context), "monitorLog"));
                }
            }
        }
        return f19430b;
    }

    private static ThreadPoolExecutor e() {
        if (f19433e == null) {
            synchronized (c.class) {
                if (f19433e == null) {
                    ThreadPoolExecutor threadPoolExecutor = j.e().n;
                    if (threadPoolExecutor != null) {
                        f19433e = threadPoolExecutor;
                    } else {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(SearchJediMixFeedAdapter.f42517f), new ThreadFactory() {

                            /* renamed from: a  reason: collision with root package name */
                            AtomicInteger f19434a = new AtomicInteger(1);

                            public final Thread newThread(@NonNull Runnable runnable) {
                                return new Thread(runnable, "npth_event_threadpool-" + this.f19434a.getAndIncrement());
                            }
                        });
                        f19433e = threadPoolExecutor2;
                    }
                }
            }
        }
        return f19433e;
    }

    public static void a(a aVar) {
        if (aVar != null) {
            f19432d.add(aVar);
            if (f19432d.size() > 5) {
                a();
            }
        }
    }

    public static void b(a aVar) {
        b();
        if (aVar != null) {
            aVar.eventTime = System.currentTimeMillis();
            c().a(aVar);
        }
    }

    public static void a(ArrayList<a> arrayList) {
        if (!com.bytedance.crash.i.j.a(arrayList)) {
            f19432d.addAll(arrayList);
            if (f19432d.size() > 5) {
                a();
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        if (j.e().m) {
            IApmAgent iApmAgent = (IApmAgent) com.bytedance.news.common.service.manager.c.a(IApmAgent.class);
            if (iApmAgent != null) {
                iApmAgent.monitorLog("client_funnel_event", jSONObject);
            }
        }
    }
}

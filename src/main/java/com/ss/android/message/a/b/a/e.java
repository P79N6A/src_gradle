package com.ss.android.message.a.b.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.SimpleThreadFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.message.a.a.d;
import com.ss.android.message.b.k;
import com.ss.android.message.h;
import com.ss.android.pushmanager.app.b;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.SocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements WeakHandler.IHandler, com.ss.android.message.a.b.d {
    private static final Set<Integer> L;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29908a;
    static final Object w = new Object();
    protected final AtomicLong A;
    protected final AtomicBoolean B;
    protected final AtomicBoolean C;
    protected IOException D;
    protected int E;
    protected int F;
    protected int G;
    protected final int H;
    protected int I;
    protected int J;
    protected final WeakHandler K;
    private final Map<com.ss.android.message.a.b.b, Set<com.ss.android.message.a.b.a>> M;

    /* renamed from: b  reason: collision with root package name */
    protected final SocketFactory f29909b;

    /* renamed from: c  reason: collision with root package name */
    protected final boolean f29910c = true;

    /* renamed from: d  reason: collision with root package name */
    protected Context f29911d;

    /* renamed from: e  reason: collision with root package name */
    protected com.ss.android.pushmanager.app.e f29912e;

    /* renamed from: f  reason: collision with root package name */
    protected com.ss.android.message.a.a.d f29913f;
    protected g g;
    protected List<g> h;
    protected int i;
    protected int j = -1;
    protected Socket k;
    protected DataInputStream l;
    protected DataOutputStream m;
    protected AtomicInteger n;
    protected ExecutorService o;
    protected Future<?> p;
    protected Future<?> q;
    protected Future<?> r;
    protected Runnable s;
    protected Runnable t;
    protected final b u;
    protected Selector v;
    public volatile com.ss.android.message.a.b.b x;
    protected final Map<Integer, d> y;
    protected final BlockingQueue<d> z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29914a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f29914a, false, 18055, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29914a, false, 18055, new Class[0], Void.TYPE);
                return;
            }
            Logger.debug();
            if (e.this.x == com.ss.android.message.a.b.b.HANDSSHAKEING || e.this.x == com.ss.android.message.a.b.b.REGISTERING) {
                e.this.a("Server Connection Exception", true);
                e.this.t = null;
            }
        }

        private a() {
        }

        /* synthetic */ a(e eVar, byte b2) {
            this();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29916a;

        /* renamed from: c  reason: collision with root package name */
        private long f29918c;

        /* renamed from: d  reason: collision with root package name */
        private PendingIntent f29919d;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f29916a, false, 18057, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29916a, false, 18057, new Class[0], Void.TYPE);
                return;
            }
            if (!(e.this.f29911d == null || this.f29919d == null)) {
                try {
                    ((AlarmManager) e.this.f29911d.getSystemService("alarm")).cancel(this.f29919d);
                } catch (Throwable unused) {
                }
                this.f29919d = null;
            }
        }

        public final void a() {
            boolean z;
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f29916a, false, 18056, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29916a, false, 18056, new Class[0], Void.TYPE);
            } else if (e.this.f29911d != null && !e.this.f()) {
                b();
                e.this.K.removeMessages(4);
                this.f29919d = PendingIntent.getService(e.this.f29911d, 0, h.c(e.this.f29911d), 0);
                AlarmManager alarmManager = (AlarmManager) e.this.f29911d.getSystemService("alarm");
                SimpleDateFormat simpleDateFormat = null;
                try {
                    simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                } catch (Exception unused) {
                }
                com.ss.android.pushmanager.setting.b a2 = com.ss.android.pushmanager.setting.b.a();
                if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19215, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19215, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z = a2.f2546c.a("is_close_alarm_wakeup", false);
                }
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                long currentTimeMillis = this.f29918c + System.currentTimeMillis();
                if (simpleDateFormat != null) {
                    Logger.debug();
                }
                try {
                    PendingIntent pendingIntent = this.f29919d;
                    if (PatchProxy.isSupport(new Object[]{alarmManager, Integer.valueOf(i), new Long(currentTimeMillis), pendingIntent}, null, com.ss.android.message.b.d.f29968a, true, 18138, new Class[]{AlarmManager.class, Integer.TYPE, Long.TYPE, PendingIntent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{alarmManager, Integer.valueOf(i), new Long(currentTimeMillis), pendingIntent}, null, com.ss.android.message.b.d.f29968a, true, 18138, new Class[]{AlarmManager.class, Integer.TYPE, Long.TYPE, PendingIntent.class}, Void.TYPE);
                    } else {
                        com.ss.android.message.b.d.f29969b.a(alarmManager, i, currentTimeMillis, pendingIntent);
                    }
                } catch (Throwable unused2) {
                }
                e.this.K.sendEmptyMessageDelayed(4, this.f29918c);
            }
        }

        public final synchronized void a(long j) {
            this.f29918c = j;
        }

        public b(long j) {
            this.f29918c = j;
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29920a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f29920a, false, 18058, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29920a, false, 18058, new Class[0], Void.TYPE);
                return;
            }
            Logger.debug();
            if (e.this.x == com.ss.android.message.a.b.b.SOCKET_DISCONNECTED && NetworkUtils.isNetworkAvailable(e.this.f29911d)) {
                e.this.a();
            }
            e.this.s = null;
        }

        private c() {
        }

        /* synthetic */ c(e eVar, byte b2) {
            this();
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29922a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f29922a, false, 18059, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29922a, false, 18059, new Class[0], Void.TYPE);
                return;
            }
            Thread.currentThread().setName("SocketConnectionThread");
            Logger.debug();
            try {
                if (!e.this.f()) {
                    if (e.this.x == com.ss.android.message.a.b.b.SOCKET_CONNECTING) {
                        com.ss.android.message.b.h.a();
                        return;
                    }
                    Context context = e.this.f29911d;
                    if (PatchProxy.isSupport(new Object[]{context}, null, com.ss.android.message.b.h.f29985a, true, 18160, new Class[]{Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context}, null, com.ss.android.message.b.h.f29985a, true, 18160, new Class[]{Context.class}, Void.TYPE);
                    } else if (com.ss.android.message.b.h.f29986b == null) {
                        com.ss.android.message.b.h.f29986b = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "PostPushService");
                        if (com.ss.android.message.b.h.f29986b != null) {
                            com.ss.android.message.b.h.f29986b.acquire();
                        }
                    }
                    e.this.a(com.ss.android.message.a.b.b.SOCKET_CONNECTING);
                    e.this.B.compareAndSet(true, false);
                    e.this.n.getAndSet(0);
                    if (e.this.h == null || e.this.h.isEmpty()) {
                        Logger.debug();
                        if (e.this.h == null) {
                            e.this.h = new ArrayList();
                        }
                        List<InetSocketAddress> i = e.this.i();
                        if (i == null || i.isEmpty()) {
                            throw new IOException("push server list is null");
                        }
                        for (InetSocketAddress gVar : i) {
                            e.this.h.add(new g(gVar, 60000));
                        }
                        e.this.h();
                    }
                    com.ss.android.message.a.a.b.a(e.this.f29911d, "setupConnect");
                    e.this.j();
                    com.ss.android.message.b.h.a();
                }
            } catch (IOException e2) {
                com.ss.android.message.b.h.a((Exception) e2);
                e.this.a(e2.getMessage(), true);
            } catch (InterruptedException e3) {
                com.ss.android.message.b.h.a((Exception) e3);
                e.this.a(e3.getMessage(), true);
            } catch (Exception e4) {
                com.ss.android.message.b.h.a(e4);
                e.this.a(e4.getMessage(), true);
            } finally {
                com.ss.android.message.b.h.a();
            }
        }

        private d() {
        }

        /* synthetic */ d(e eVar, byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.message.a.b.a.e$e  reason: collision with other inner class name */
    class C0359e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29924a;

        /* JADX WARNING: Removed duplicated region for block: B:73:0x0151  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x015a A[SYNTHETIC, Splitter:B:76:0x015a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f29924a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 18060(0x468c, float:2.5307E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f29924a
                r5 = 0
                r6 = 18060(0x468c, float:2.5307E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r1 = "SocketReadThread"
                r0.setName(r1)
                com.bytedance.common.utility.Logger.debug()
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this
                java.net.Socket r0 = r0.k
                if (r0 != 0) goto L_0x0036
                return
            L_0x0036:
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this
                java.net.Socket r0 = r0.k
                java.nio.channels.SocketChannel r0 = r0.getChannel()
                r1 = 1
                if (r0 != 0) goto L_0x007b
            L_0x0041:
                boolean r0 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x005e }
                if (r0 != 0) goto L_0x014b
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this     // Catch:{ Exception -> 0x005e }
                boolean r0 = r0.e()     // Catch:{ Exception -> 0x005e }
                if (r0 == 0) goto L_0x014b
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this     // Catch:{ Exception -> 0x005e }
                boolean r0 = r0.f()     // Catch:{ Exception -> 0x005e }
                if (r0 == 0) goto L_0x0058
                return
            L_0x0058:
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this     // Catch:{ Exception -> 0x005e }
                r0.g()     // Catch:{ Exception -> 0x005e }
                goto L_0x0041
            L_0x005e:
                r0 = move-exception
                com.ss.android.message.b.h.a((java.lang.Exception) r0)
                com.ss.android.message.a.b.a.e r2 = com.ss.android.message.a.b.a.e.this
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Unexpected exception receiving call responses e = "
                r3.<init>(r4)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.a((java.lang.String) r0, (boolean) r1)
                goto L_0x014b
            L_0x007b:
                com.ss.android.message.a.b.a.e r2 = com.ss.android.message.a.b.a.e.this
                r3 = 0
                r2.v = r3
                java.nio.channels.spi.SelectorProvider r2 = r0.provider()     // Catch:{ Exception -> 0x011d }
                com.ss.android.message.a.b.a.e r4 = com.ss.android.message.a.b.a.e.this     // Catch:{ Exception -> 0x011d }
                java.nio.channels.spi.AbstractSelector r2 = r2.openSelector()     // Catch:{ Exception -> 0x011d }
                r4.v = r2     // Catch:{ Exception -> 0x011d }
                com.ss.android.message.a.b.a.e r2 = com.ss.android.message.a.b.a.e.this     // Catch:{ Exception -> 0x011d }
                java.nio.channels.Selector r2 = r2.v     // Catch:{ Exception -> 0x011d }
                java.nio.channels.SelectionKey r2 = r0.register(r2, r1)     // Catch:{ Exception -> 0x011d }
            L_0x0094:
                if (r0 == 0) goto L_0x0101
                boolean r3 = r0.isOpen()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                if (r3 == 0) goto L_0x0101
                boolean r3 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                if (r3 == 0) goto L_0x00a7
                boolean r0 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                goto L_0x0101
            L_0x00a7:
                com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                com.ss.android.message.a.b.a.e r3 = com.ss.android.message.a.b.a.e.this     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                java.nio.channels.Selector r3 = r3.v     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                r3.select()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                com.ss.android.message.a.b.a.e r3 = com.ss.android.message.a.b.a.e.this     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                java.nio.channels.Selector r3 = r3.v     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                java.util.Set r3 = r3.selectedKeys()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
            L_0x00c0:
                boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                if (r4 == 0) goto L_0x0094
                java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                java.nio.channels.SelectionKey r4 = (java.nio.channels.SelectionKey) r4     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                r3.remove()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                boolean r4 = r4.isReadable()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                if (r4 == 0) goto L_0x00c0
                com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                com.ss.android.message.a.b.a.e r4 = com.ss.android.message.a.b.a.e.this     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                boolean r4 = r4.f()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                if (r4 == 0) goto L_0x00f6
                if (r2 == 0) goto L_0x00e5
                r2.cancel()
            L_0x00e5:
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this
                java.nio.channels.Selector r0 = r0.v
                if (r0 == 0) goto L_0x00f2
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this     // Catch:{ IOException -> 0x00f2 }
                java.nio.channels.Selector r0 = r0.v     // Catch:{ IOException -> 0x00f2 }
                r0.close()     // Catch:{ IOException -> 0x00f2 }
            L_0x00f2:
                com.bytedance.common.utility.Logger.debug()
                return
            L_0x00f6:
                com.ss.android.message.a.b.a.e r4 = com.ss.android.message.a.b.a.e.this     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                r4.g()     // Catch:{ Exception -> 0x00fe, all -> 0x00fc }
                goto L_0x00c0
            L_0x00fc:
                r0 = move-exception
                goto L_0x014f
            L_0x00fe:
                r0 = move-exception
                r3 = r2
                goto L_0x011e
            L_0x0101:
                if (r2 == 0) goto L_0x0106
                r2.cancel()
            L_0x0106:
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this
                java.nio.channels.Selector r0 = r0.v
                if (r0 == 0) goto L_0x0115
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this     // Catch:{ IOException -> 0x0114 }
                java.nio.channels.Selector r0 = r0.v     // Catch:{ IOException -> 0x0114 }
                r0.close()     // Catch:{ IOException -> 0x0114 }
                goto L_0x0115
            L_0x0114:
            L_0x0115:
                boolean r0 = com.bytedance.common.utility.Logger.debug()
                goto L_0x014b
            L_0x011a:
                r0 = move-exception
                r2 = r3
                goto L_0x014f
            L_0x011d:
                r0 = move-exception
            L_0x011e:
                com.ss.android.message.b.h.a((java.lang.Exception) r0)     // Catch:{ all -> 0x011a }
                com.ss.android.message.a.b.a.e r2 = com.ss.android.message.a.b.a.e.this     // Catch:{ all -> 0x011a }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
                java.lang.String r5 = "Unexpected exception receiving call responses e = "
                r4.<init>(r5)     // Catch:{ all -> 0x011a }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x011a }
                r4.append(r0)     // Catch:{ all -> 0x011a }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x011a }
                r2.a((java.lang.String) r0, (boolean) r1)     // Catch:{ all -> 0x011a }
                if (r3 == 0) goto L_0x013d
                r3.cancel()
            L_0x013d:
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this
                java.nio.channels.Selector r0 = r0.v
                if (r0 == 0) goto L_0x0115
                com.ss.android.message.a.b.a.e r0 = com.ss.android.message.a.b.a.e.this     // Catch:{ IOException -> 0x0114 }
                java.nio.channels.Selector r0 = r0.v     // Catch:{ IOException -> 0x0114 }
                r0.close()     // Catch:{ IOException -> 0x0114 }
                goto L_0x0115
            L_0x014b:
                com.bytedance.common.utility.Logger.debug()
                return
            L_0x014f:
                if (r2 == 0) goto L_0x0154
                r2.cancel()
            L_0x0154:
                com.ss.android.message.a.b.a.e r1 = com.ss.android.message.a.b.a.e.this
                java.nio.channels.Selector r1 = r1.v
                if (r1 == 0) goto L_0x0161
                com.ss.android.message.a.b.a.e r1 = com.ss.android.message.a.b.a.e.this     // Catch:{ IOException -> 0x0161 }
                java.nio.channels.Selector r1 = r1.v     // Catch:{ IOException -> 0x0161 }
                r1.close()     // Catch:{ IOException -> 0x0161 }
            L_0x0161:
                com.bytedance.common.utility.Logger.debug()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.e.C0359e.run():void");
        }

        private C0359e() {
        }

        /* synthetic */ C0359e(e eVar, byte b2) {
            this();
        }
    }

    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29926a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f29926a, false, 18061, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29926a, false, 18061, new Class[0], Void.TYPE);
                return;
            }
            Thread.currentThread().setName("SocketWriteThread");
            Logger.debug();
            while (!Thread.interrupted() && e.this.e()) {
                try {
                    if (!e.this.f()) {
                        e.this.a(e.this.z.take());
                    } else {
                        return;
                    }
                } catch (InterruptedException e2) {
                    e eVar = e.this;
                    eVar.a("Unexpected Thread Interrupted exception receiving call responses e = " + e2.getMessage(), true);
                } catch (Exception e3) {
                    e eVar2 = e.this;
                    eVar2.a("Unexpected exception receiving call responses e = " + e3.getMessage(), true);
                }
            }
            Logger.debug();
        }

        private f() {
        }

        /* synthetic */ f(e eVar, byte b2) {
            this();
        }
    }

    public final void a(d dVar) throws Exception {
        byte[] bArr;
        int i2;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f29908a, false, 18016, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f29908a, false, 18016, new Class[]{d.class}, Void.TYPE);
        } else if (!f() && !this.B.get()) {
            Logger.debug();
            i iVar = new i();
            try {
                Logger.debug();
                if (dVar2.f29903b == 0) {
                    iVar.write(com.ss.android.message.b.h.a(dVar2.f29903b, 1));
                } else {
                    iVar.write(com.ss.android.message.b.h.a(dVar2.f29903b, 1));
                    iVar.write(com.ss.android.message.b.h.a(dVar2.f29902a, 3));
                    int length = dVar2.f29906e == null ? 0 : dVar2.f29906e.length;
                    iVar.write(com.ss.android.message.b.h.a(length, 4));
                    if (length > 0) {
                        iVar.write(dVar2.f29906e);
                    }
                }
                if (PatchProxy.isSupport(new Object[0], iVar, i.f29935a, false, 18070, new Class[0], byte[].class)) {
                    bArr = (byte[]) PatchProxy.accessDispatch(new Object[0], iVar, i.f29935a, false, 18070, new Class[0], byte[].class);
                } else {
                    bArr = iVar.f29936b.a();
                }
                Logger.debug();
                if (PatchProxy.isSupport(new Object[0], iVar, i.f29935a, false, 18071, new Class[0], Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], iVar, i.f29935a, false, 18071, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i2 = iVar.f29936b.b();
                }
                synchronized (this.m) {
                    this.m.write(bArr, 0, i2);
                    this.m.flush();
                }
                a((Closeable) iVar);
            } catch (IOException e2) {
                a(e2.getMessage(), true);
                throw e2;
            } catch (Exception e3) {
                try {
                    a("Unexpected exception receiving call responses e = " + e3.getMessage(), true);
                    throw e3;
                } catch (Throwable th) {
                    a((Closeable) iVar);
                    throw th;
                }
            }
        }
    }

    public final void a(String str, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29908a, false, 18020, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z2)}, this, f29908a, false, 18020, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Message obtainMessage = this.K.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString("close_io_exception", str);
        bundle.putBoolean("close_retry", z2);
        obtainMessage.setData(bundle);
        obtainMessage.what = 3;
        this.K.sendMessage(obtainMessage);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.g.f29930b != null) {
                jSONObject.put("address", this.g.f29930b.toString());
            }
            jSONObject.put("exception", str);
        } catch (Throwable unused) {
        }
    }

    public final void a(com.ss.android.message.a.b.b bVar, com.ss.android.message.a.b.a aVar) {
        com.ss.android.message.a.b.b bVar2 = bVar;
        com.ss.android.message.a.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, aVar2}, this, f29908a, false, 18049, new Class[]{com.ss.android.message.a.b.b.class, com.ss.android.message.a.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, aVar2}, this, f29908a, false, 18049, new Class[]{com.ss.android.message.a.b.b.class, com.ss.android.message.a.b.a.class}, Void.TYPE);
            return;
        }
        this.M.get(bVar2).add(aVar2);
    }

    public final synchronized void a(com.ss.android.message.a.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f29908a, false, 18053, new Class[]{com.ss.android.message.a.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f29908a, false, 18053, new Class[]{com.ss.android.message.a.b.b.class}, Void.TYPE);
            return;
        }
        try {
            com.ss.android.message.a.b.c cVar = new com.ss.android.message.a.b.c(this.x, bVar);
            this.x = bVar;
            HashSet<com.ss.android.message.a.b.a> hashSet = new HashSet<>();
            hashSet.addAll(this.M.get(com.ss.android.message.a.b.b.ALL));
            hashSet.addAll(this.M.get(bVar));
            for (com.ss.android.message.a.b.a a2 : hashSet) {
                a2.a(cVar);
            }
        } catch (IllegalArgumentException e2) {
            com.ss.android.message.b.h.a((Exception) e2);
        } catch (Exception e3) {
            com.ss.android.message.b.h.a(e3);
        }
    }

    public final void a(com.ss.android.message.a.b.a.a.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f29908a, false, 18054, new Class[]{com.ss.android.message.a.b.a.a.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f29908a, false, 18054, new Class[]{com.ss.android.message.a.b.a.a.e.class}, Void.TYPE);
        } else if (!f()) {
            if (this.x == com.ss.android.message.a.b.b.HANDSSHAKEED || this.x == com.ss.android.message.a.b.b.REGISTERED) {
                Logger.debug();
                com.ss.android.message.a.a.b.a(this.f29911d, "registerApps");
                a(com.ss.android.message.a.b.b.REGISTERING);
                d dVar = new d();
                dVar.f29902a = this.n.incrementAndGet();
                dVar.f29903b = 3;
                dVar.f29906e = eVar.a();
                dVar.j = eVar;
                b(dVar);
                o();
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        L = hashSet;
        hashSet.add(0);
        L.add(1);
        L.add(3);
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18030, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18030, new Class[0], Void.TYPE);
            return;
        }
        a(0);
    }

    private void o() {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18040, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18040, new Class[0], Void.TYPE);
            return;
        }
        p();
        this.t = new a(this, (byte) 0);
        this.K.postDelayed(this.t, 300000);
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18041, new Class[0], Void.TYPE);
            return;
        }
        if (this.t != null) {
            this.K.removeCallbacks(this.t);
            this.t = null;
        }
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18043, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.K.removeCallbacks(this.s);
            this.s = null;
        }
    }

    public final synchronized void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18028, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18028, new Class[0], Void.TYPE);
            return;
        }
        a("client close", false);
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18011, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18011, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.B.get()) {
            return true;
        } else {
            return false;
        }
    }

    private synchronized ExecutorService k() {
        ExecutorService executorService;
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18009, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18009, new Class[0], ExecutorService.class);
        }
        if (this.o == null) {
            SimpleThreadFactory simpleThreadFactory = new SimpleThreadFactory("PushConnection");
            if (PatchProxy.isSupport(new Object[]{simpleThreadFactory}, null, f.f29928a, true, 18062, new Class[]{ThreadFactory.class}, ExecutorService.class)) {
                executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[]{simpleThreadFactory}, null, f.f29928a, true, 18062, new Class[]{ThreadFactory.class}, ExecutorService.class);
            } else {
                executorService = com.ss.android.ugc.aweme.thread.h.c();
            }
            this.o = executorService;
        }
        return this.o;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|(1:9)|10|11) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29908a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 18036(0x4674, float:2.5274E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29908a
            r5 = 0
            r6 = 18036(0x4674, float:2.5274E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            java.net.Socket r0 = r9.k
            if (r0 == 0) goto L_0x003d
            java.net.Socket r0 = r9.k     // Catch:{ Exception -> 0x0038 }
            java.nio.channels.SocketChannel r0 = r0.getChannel()     // Catch:{ Exception -> 0x0038 }
            if (r0 == 0) goto L_0x0038
            java.net.Socket r0 = r9.k     // Catch:{ Exception -> 0x0038 }
            java.nio.channels.SocketChannel r0 = r0.getChannel()     // Catch:{ Exception -> 0x0038 }
            r0.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            java.net.Socket r0 = r9.k     // Catch:{ Throwable -> 0x003d }
            r0.close()     // Catch:{ Throwable -> 0x003d }
        L_0x003d:
            r0 = 0
            r9.k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.e.m():void");
    }

    private g n() {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18039, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18039, new Class[0], g.class);
        }
        Logger.debug();
        if (f() || this.h == null || this.h.isEmpty()) {
            return null;
        }
        int size = this.h.size();
        this.j++;
        Logger.debug();
        int i2 = (this.i + this.j) % size;
        Logger.debug();
        if (this.j != size) {
            return this.h.get(i2);
        }
        Logger.debug();
        if (this.h != null && !this.h.isEmpty()) {
            this.h.clear();
        }
        r();
        return null;
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18044, new Class[0], Void.TYPE);
            return;
        }
        b((long) (this.J * 60 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
        this.J <<= 1;
        Logger.debug();
        if (this.J > this.I) {
            this.J = this.I;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x005f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29908a     // Catch:{ all -> 0x005f }
            r4 = 0
            r5 = 18037(0x4675, float:2.5275E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x005f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x005f }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x005f }
            com.meituan.robust.ChangeQuickRedirect r4 = f29908a     // Catch:{ all -> 0x005f }
            r5 = 0
            r6 = 18037(0x4675, float:2.5275E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x005f }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x005f }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005f }
            monitor-exit(r9)
            return
        L_0x0025:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x005f }
            android.content.Context r1 = r9.f29911d     // Catch:{ all -> 0x005f }
            if (r1 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            boolean r1 = r9.f()     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0036
            monitor-exit(r9)
            return
        L_0x0036:
            com.ss.android.message.a.b.b r1 = r9.x     // Catch:{ all -> 0x005f }
            com.ss.android.message.a.b.b r2 = com.ss.android.message.a.b.b.SOCKET_DISCONNECTED     // Catch:{ all -> 0x005f }
            if (r1 != r2) goto L_0x005d
            java.util.concurrent.Future<?> r1 = r9.p     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0048
            java.util.concurrent.Future<?> r1 = r9.p     // Catch:{ all -> 0x005f }
            boolean r1 = r1.isDone()     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x005d
        L_0x0048:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x005f }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x005f }
            java.util.concurrent.ExecutorService r1 = r9.k()     // Catch:{ all -> 0x005f }
            com.ss.android.message.a.b.a.e$d r2 = new com.ss.android.message.a.b.a.e$d     // Catch:{ all -> 0x005f }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x005f }
            java.util.concurrent.Future r0 = r1.submit(r2)     // Catch:{ all -> 0x005f }
            r9.p = r0     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r9)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.e.a():void");
    }

    public final boolean f() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18012, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18012, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[0], null, h.f30010a, true, 17902, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, h.f30010a, true, 17902, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z2 = com.ss.android.pushmanager.setting.b.a().l();
        }
        if (z2) {
            return false;
        }
        a("Push Service Is Not Allow", false);
        return true;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18038, new Class[0], Void.TYPE);
            return;
        }
        Logger.debug();
        if (!f() && this.h != null && !this.h.isEmpty()) {
            int size = this.h.size();
            double random = Math.random();
            double d2 = (double) size;
            Double.isNaN(d2);
            this.i = (int) (random * d2);
            Logger.debug();
            this.j = -1;
            this.g = n();
        }
    }

    public final void c() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18013, new Class[0], Void.TYPE);
        } else if (!f()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.A.get() >= ((long) this.E) && this.x.getStateValue() >= com.ss.android.message.a.b.b.SOCKET_CONNECTED.getStateValue() && this.x.getStateValue() < com.ss.android.message.a.b.b.SOCKET_DISCONNECTING.getStateValue()) {
                this.A.set(currentTimeMillis);
                this.K.removeMessages(4);
                Logger.debug();
                com.ss.android.message.a.a.b.a(this.f29911d, "sendHeartBeat");
                d dVar = new d();
                dVar.f29903b = 0;
                dVar.f29902a = 0;
                b(dVar);
                this.u.a();
            }
        }
    }

    public final com.ss.android.message.a.b.b d() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18051, new Class[0], com.ss.android.message.a.b.b.class)) {
            return (com.ss.android.message.a.b.b) PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18051, new Class[0], com.ss.android.message.a.b.b.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18052, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18052, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((this.q == null || this.q.isDone() || this.r == null || this.r.isDone()) && this.x.getStateValue() >= com.ss.android.message.a.b.b.SOCKET_CONNECTED.getStateValue() && this.x.getStateValue() <= com.ss.android.message.a.b.b.REGISTERED.getStateValue()) {
            b();
        } else {
            z2 = true;
        }
        if (z2) {
            return this.x;
        }
        return com.ss.android.message.a.b.b.SOCKET_DISCONNECTED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f3, code lost:
        if (r4 == -1) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        if (r11.g == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        if (r11.g.f29931c <= 0) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ff, code lost:
        a((long) r11.g.f29931c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        throw new java.io.IOException("Push Server Has Close Connection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014b, code lost:
        if (r11.g.f29931c > 0) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0161, code lost:
        if (r11.g.f29931c > 0) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x016f, code lost:
        if (r11.g.f29931c > 0) goto L_0x00ff;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0164 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:77:0x0164=Splitter:B:77:0x0164, B:68:0x014e=Splitter:B:68:0x014e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() throws java.lang.Exception {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29908a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 18017(0x4661, float:2.5247E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29908a
            r5 = 0
            r6 = 18017(0x4661, float:2.5247E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            boolean r1 = r11.f()
            if (r1 == 0) goto L_0x002a
            return
        L_0x002a:
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.B
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0033
            return
        L_0x0033:
            r1 = 8
            r2 = 1
            byte[] r3 = new byte[r1]     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
        L_0x0038:
            java.io.DataInputStream r4 = r11.l     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            int r4 = r4.read(r3, r0, r1)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            if (r4 <= 0) goto L_0x00f2
            byte[] r4 = com.ss.android.message.b.h.a((byte[]) r3, (int) r0, (int) r2)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            int r4 = com.ss.android.message.b.h.a((byte[]) r4)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r5 = 3
            byte[] r5 = com.ss.android.message.b.h.a((byte[]) r3, (int) r2, (int) r5)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            int r5 = com.ss.android.message.b.h.a((byte[]) r5)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r6 = 4
            byte[] r6 = com.ss.android.message.b.h.a((byte[]) r3, (int) r6, (int) r6)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            int r6 = com.ss.android.message.b.h.a((byte[]) r6)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r7 = 16
            if (r4 != r7) goto L_0x007e
            com.ss.android.message.a.b.a.d r8 = new com.ss.android.message.a.b.a.d     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r8.<init>()     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r8.f29902a = r5     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r8.f29903b = r7     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            com.ss.android.message.a.b.a.a.c r5 = new com.ss.android.message.a.b.a.a.c     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r5.<init>()     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r8.j = r5     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r8.h = r9     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            goto L_0x0090
        L_0x007e:
            java.util.Map<java.lang.Integer, com.ss.android.message.a.b.a.d> r7 = r11.y     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            java.lang.Object r5 = r7.remove(r5)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r8 = r5
            com.ss.android.message.a.b.a.d r8 = (com.ss.android.message.a.b.a.d) r8     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            if (r8 == 0) goto L_0x00dc
            com.bytedance.common.utility.Logger.debug()     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
        L_0x0090:
            r8.f29904c = r4     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r8.f29905d = r6     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            if (r8 == 0) goto L_0x00a1
            byte[] r4 = new byte[r6]     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r8.f29907f = r4     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            java.io.DataInputStream r4 = r11.l     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            byte[] r5 = r8.f29907f     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r4.read(r5)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
        L_0x00a1:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            byte[] r4 = r8.f29907f     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            if (r4 == 0) goto L_0x00b3
            com.ss.android.message.a.b.a.a.d r4 = r8.j     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            if (r4 == 0) goto L_0x00b3
            com.ss.android.message.a.b.a.a.d r4 = r8.j     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            byte[] r5 = r8.f29907f     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r4.a(r5)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
        L_0x00b3:
            java.util.Set<java.lang.Integer> r4 = L     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            int r5 = r8.f29903b     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            boolean r4 = r4.contains(r5)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            if (r4 == 0) goto L_0x00ce
            com.bytedance.common.utility.collection.WeakHandler r4 = r11.K     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            android.os.Message r4 = r4.obtainMessage(r2, r8)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            com.bytedance.common.utility.collection.WeakHandler r5 = r11.K     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r5.sendMessage(r4)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            goto L_0x0038
        L_0x00ce:
            com.bytedance.common.utility.collection.WeakHandler r4 = r11.K     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r5 = 2
            android.os.Message r4 = r4.obtainMessage(r5, r8)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            com.bytedance.common.utility.collection.WeakHandler r5 = r11.K     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            r5.sendMessage(r4)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            goto L_0x0038
        L_0x00dc:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            com.ss.android.message.a.b.a.g r0 = r11.g
            if (r0 == 0) goto L_0x00f1
            com.ss.android.message.a.b.a.g r0 = r11.g
            int r0 = r0.f29931c
            if (r0 <= 0) goto L_0x00f1
            com.ss.android.message.a.b.a.g r0 = r11.g
            int r0 = r0.f29931c
            long r0 = (long) r0
            r11.a((long) r0)
        L_0x00f1:
            return
        L_0x00f2:
            r0 = -1
            if (r4 == r0) goto L_0x0108
            com.ss.android.message.a.b.a.g r0 = r11.g
            if (r0 == 0) goto L_0x0172
            com.ss.android.message.a.b.a.g r0 = r11.g
            int r0 = r0.f29931c
            if (r0 <= 0) goto L_0x0172
        L_0x00ff:
            com.ss.android.message.a.b.a.g r0 = r11.g
            int r0 = r0.f29931c
            long r0 = (long) r0
            r11.a((long) r0)
            return
        L_0x0108:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            java.lang.String r1 = "Push Server Has Close Connection"
            r0.<init>(r1)     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
            throw r0     // Catch:{ c -> 0x0164, UnsupportedOperationException -> 0x0156, IOException -> 0x0129, Exception -> 0x0112 }
        L_0x0110:
            r0 = move-exception
            goto L_0x0173
        L_0x0112:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = "Unexpected exception receiving call responses e = "
            r1.<init>(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0110 }
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0110 }
            r11.a((java.lang.String) r1, (boolean) r2)     // Catch:{ all -> 0x0110 }
            throw r0     // Catch:{ all -> 0x0110 }
        L_0x0129:
            r0 = move-exception
            boolean r1 = r0 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x014e
            com.ss.android.message.a.b.a.g r1 = r11.g     // Catch:{ all -> 0x0110 }
            int r1 = r1.f29931c     // Catch:{ all -> 0x0110 }
            if (r1 <= 0) goto L_0x014e
            r11.D = r0     // Catch:{ all -> 0x0110 }
            com.ss.android.message.b.h.a((java.lang.Exception) r0)     // Catch:{ all -> 0x0110 }
            boolean r1 = com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x0143
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0110 }
        L_0x0143:
            com.ss.android.message.a.b.a.g r0 = r11.g
            if (r0 == 0) goto L_0x0172
            com.ss.android.message.a.b.a.g r0 = r11.g
            int r0 = r0.f29931c
            if (r0 <= 0) goto L_0x0172
            goto L_0x00ff
        L_0x014e:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0110 }
            r11.a((java.lang.String) r1, (boolean) r2)     // Catch:{ all -> 0x0110 }
            throw r0     // Catch:{ all -> 0x0110 }
        L_0x0156:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x0110 }
            com.ss.android.message.a.b.a.g r0 = r11.g
            if (r0 == 0) goto L_0x0172
            com.ss.android.message.a.b.a.g r0 = r11.g
            int r0 = r0.f29931c
            if (r0 <= 0) goto L_0x0172
            goto L_0x00ff
        L_0x0164:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x0110 }
            com.ss.android.message.a.b.a.g r0 = r11.g
            if (r0 == 0) goto L_0x0172
            com.ss.android.message.a.b.a.g r0 = r11.g
            int r0 = r0.f29931c
            if (r0 <= 0) goto L_0x0172
            goto L_0x00ff
        L_0x0172:
            return
        L_0x0173:
            com.ss.android.message.a.b.a.g r1 = r11.g
            if (r1 == 0) goto L_0x0185
            com.ss.android.message.a.b.a.g r1 = r11.g
            int r1 = r1.f29931c
            if (r1 <= 0) goto L_0x0185
            com.ss.android.message.a.b.a.g r1 = r11.g
            int r1 = r1.f29931c
            long r1 = (long) r1
            r11.a((long) r1)
        L_0x0185:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.e.g():void");
    }

    public final List<InetSocketAddress> i() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18045, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18045, new Class[0], List.class);
        }
        ArrayList arrayList = null;
        if (f()) {
            return null;
        }
        Logger.debug();
        if (!NetworkUtils.isNetworkAvailable(this.f29911d)) {
            return null;
        }
        try {
            com.ss.android.message.a.a.b.a(this.f29911d, "get serverAddrsString");
            Map<String, String> c2 = com.ss.android.pushmanager.app.e.a().c();
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.pushmanager.f.f2537a, true, 18937, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.pushmanager.f.f2537a, true, 18937, new Class[0], String.class);
            } else {
                if (com.ss.android.pushmanager.f.k != null) {
                    if (!TextUtils.isEmpty(com.ss.android.pushmanager.f.k.a())) {
                        str = com.ss.android.pushmanager.f.a(com.ss.android.pushmanager.f.k.a(), "/push/get_service_addrs/");
                    }
                }
                str = com.ss.android.pushmanager.f.f2540d;
            }
            String str2 = NetworkClient.getDefault().get(k.a(str, c2));
            if (str2 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str2);
            Logger.debug();
            Context context = this.f29911d;
            com.ss.android.message.a.a.b.a(context, "get getServerList" + jSONObject);
            int optInt = jSONObject.optInt("max_interval");
            if (optInt > 0) {
                this.I = optInt;
            }
            String optString = jSONObject.optString("addrs");
            if (optString != null) {
                JSONArray jSONArray = new JSONArray(optString);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String optString2 = jSONArray.optString(i2);
                    if (optString2 != null) {
                        String[] split = optString2.split(":");
                        if (split != null && split.length == 2) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new InetSocketAddress(split[0], Integer.parseInt(split[1])));
                        }
                    }
                }
            } else {
                String optString3 = jSONObject.optString("err_no");
                String optString4 = jSONObject.optString("err_msg");
                if (!StringUtils.isEmpty(optString3)) {
                    if (!StringUtils.isEmpty(optString4)) {
                        throw new IOException("get server list err : err_no = " + optString3 + " err_msg = " + optString4);
                    }
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            com.ss.android.message.b.h.a((Exception) e2);
        } catch (IOException e3) {
            com.ss.android.message.b.h.a((Exception) e3);
        } catch (Exception e4) {
            com.ss.android.message.b.h.a(e4);
        }
    }

    public final void j() throws IOException, InterruptedException {
        InputStream inputStream;
        OutputStream outputStream;
        Pair<Double, Double> pair;
        double d2;
        if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18046, new Class[0], Void.TYPE);
        } else if (this.k == null && !this.B.get()) {
            Logger.debug();
            if (!f()) {
                Logger.debug();
                char c2 = 2;
                if (PatchProxy.isSupport(new Object[0], this, f29908a, false, 18034, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f29908a, false, 18034, new Class[0], Void.TYPE);
                } else {
                    short s2 = 0;
                    short s3 = 0;
                    while (!f()) {
                        try {
                            Logger.debug();
                            Logger.debug();
                            if (this.C.get()) {
                                Logger.debug();
                                this.k = this.f29909b.createSocket();
                            } else {
                                Logger.debug();
                                SocketChannel open = SocketChannel.open();
                                open.configureBlocking(false);
                                this.k = open.socket();
                            }
                            this.k.setTcpNoDelay(false);
                            this.k.setKeepAlive(true);
                            Socket socket = this.k;
                            InetSocketAddress inetSocketAddress = this.g.f29930b;
                            int i2 = this.G;
                            Object[] objArr = new Object[3];
                            objArr[0] = socket;
                            objArr[1] = inetSocketAddress;
                            objArr[c2] = Integer.valueOf(i2);
                            ChangeQuickRedirect changeQuickRedirect = f29908a;
                            Class[] clsArr = new Class[3];
                            clsArr[0] = Socket.class;
                            clsArr[1] = SocketAddress.class;
                            clsArr[c2] = Integer.TYPE;
                            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 18033, clsArr, Void.TYPE)) {
                                Object[] objArr2 = new Object[3];
                                objArr2[0] = socket;
                                objArr2[1] = inetSocketAddress;
                                try {
                                    objArr2[2] = Integer.valueOf(i2);
                                    ChangeQuickRedirect changeQuickRedirect2 = f29908a;
                                    Class[] clsArr2 = new Class[3];
                                    clsArr2[0] = Socket.class;
                                    clsArr2[1] = SocketAddress.class;
                                    clsArr2[2] = Integer.TYPE;
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, 18033, clsArr2, Void.TYPE);
                                } catch (SocketTimeoutException e2) {
                                    e = e2;
                                    a(s2, 0, e);
                                    s2 = (short) (s2 + 1);
                                    c2 = 2;
                                } catch (IOException e3) {
                                    e = e3;
                                    a(s3, 0, e);
                                    s3 = (short) (s3 + 1);
                                    c2 = 2;
                                } catch (Exception unused) {
                                    a(s3, 0, new IOException("unknown exception"));
                                    s3 = (short) (s3 + 1);
                                    c2 = 2;
                                }
                            } else if (!f()) {
                                if (socket == null || inetSocketAddress == null || i2 < 0) {
                                    throw new IllegalArgumentException("Illegal argument for connect()");
                                }
                                SocketChannel channel = socket.getChannel();
                                if (channel == null) {
                                    socket.connect(inetSocketAddress, i2);
                                } else {
                                    j.a(channel, inetSocketAddress, (long) i2);
                                }
                                if (socket.getLocalPort() == socket.getPort()) {
                                    if (socket.getLocalAddress().equals(socket.getInetAddress())) {
                                        m();
                                        throw new ConnectException("Localhost targeted connection resulted in a loopback. No daemon is listening on the target port.");
                                    }
                                }
                            }
                            a(com.ss.android.message.a.b.b.SOCKET_CONNECTED);
                            this.k.setSoTimeout(this.F);
                            this.J = 1;
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (this.g.f29930b != null) {
                                    jSONObject.put("address", this.g.f29930b.toString());
                                }
                            } catch (Throwable unused2) {
                            }
                        } catch (SocketTimeoutException e4) {
                            e = e4;
                            a(s2, 0, e);
                            s2 = (short) (s2 + 1);
                            c2 = 2;
                        } catch (IOException e5) {
                            e = e5;
                            a(s3, 0, e);
                            s3 = (short) (s3 + 1);
                            c2 = 2;
                        } catch (Exception unused3) {
                            a(s3, 0, new IOException("unknown exception"));
                            s3 = (short) (s3 + 1);
                            c2 = 2;
                        }
                    }
                }
                if (!f()) {
                    Socket socket2 = this.k;
                    long soTimeout = (long) this.k.getSoTimeout();
                    if (PatchProxy.isSupport(new Object[]{socket2, new Long(soTimeout)}, null, f29908a, true, 18047, new Class[]{Socket.class, Long.TYPE}, InputStream.class)) {
                        inputStream = (InputStream) PatchProxy.accessDispatch(new Object[]{socket2, new Long(soTimeout)}, null, f29908a, true, 18047, new Class[]{Socket.class, Long.TYPE}, InputStream.class);
                    } else if (socket2.getChannel() == null) {
                        inputStream = socket2.getInputStream();
                    } else {
                        inputStream = new k(socket2);
                    }
                    this.l = new DataInputStream(new b(inputStream));
                    Socket socket3 = this.k;
                    if (PatchProxy.isSupport(new Object[]{socket3, 0L}, null, f29908a, true, 18048, new Class[]{Socket.class, Long.TYPE}, OutputStream.class)) {
                        outputStream = (OutputStream) PatchProxy.accessDispatch(new Object[]{socket3, 0L}, null, f29908a, true, 18048, new Class[]{Socket.class, Long.TYPE}, OutputStream.class);
                    } else if (socket3.getChannel() == null) {
                        outputStream = socket3.getOutputStream();
                    } else {
                        outputStream = new l(socket3);
                    }
                    this.m = new DataOutputStream(new c(outputStream));
                    if (this.q == null || this.q.isDone()) {
                        this.q = k().submit(new C0359e(this, (byte) 0));
                    }
                    if (this.r == null || this.r.isDone()) {
                        this.r = k().submit(new f(this, (byte) 0));
                    }
                    if (!f()) {
                        com.ss.android.message.a.a.d dVar = this.f29913f;
                        Context context = this.f29911d;
                        if (PatchProxy.isSupport(new Object[]{context, null}, dVar, com.ss.android.message.a.a.d.f29858a, false, 17982, new Class[]{Context.class, d.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, null}, dVar, com.ss.android.message.a.a.d.f29858a, false, 17982, new Class[]{Context.class, d.a.class}, Void.TYPE);
                            return;
                        }
                        if (context != null && com.ss.android.pushmanager.setting.b.a().l()) {
                            Logger.debug();
                            if (dVar.f29862c != null && dVar.f29862c.d() == com.ss.android.message.a.b.b.SOCKET_CONNECTED) {
                                com.ss.android.message.a.a.a aVar = dVar.f29861b.get(Long.valueOf(dVar.f29863f));
                                if (aVar != null) {
                                    try {
                                        com.ss.android.message.a.b.a.a.b bVar = new com.ss.android.message.a.b.a.a.b();
                                        bVar.f29875b = 1;
                                        bVar.f29876c = (byte) NetworkUtils.getNetworkType(context).getValue();
                                        String a2 = aVar.a();
                                        String b2 = aVar.b();
                                        long d3 = aVar.d();
                                        long c3 = aVar.c();
                                        if (!StringUtils.isEmpty(a2) && 0 != d3) {
                                            if (0 != c3) {
                                                Logger.debug();
                                                Logger.debug();
                                                bVar.f29877d = Long.parseLong(b2);
                                                bVar.h = a2 + "_" + d3;
                                                bVar.f29878e = c3;
                                                try {
                                                    pair = com.ss.android.pushmanager.setting.b.a().e();
                                                } catch (Exception unused4) {
                                                    pair = null;
                                                }
                                                double d4 = 0.0d;
                                                if (pair == null) {
                                                    d2 = 0.0d;
                                                } else {
                                                    d2 = ((Double) pair.first).doubleValue();
                                                }
                                                bVar.f29879f = d2;
                                                if (pair != null) {
                                                    d4 = ((Double) pair.second).doubleValue();
                                                }
                                                bVar.g = d4;
                                                dVar.f29862c.a(bVar);
                                                return;
                                            }
                                        }
                                        Logger.debug();
                                    } catch (Exception e6) {
                                        com.ss.android.message.b.h.a(e6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static d a(Message message) {
        if (message == null || message.obj == null) {
            return null;
        }
        return (d) message.obj;
    }

    private void a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, this, f29908a, false, 18031, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, this, f29908a, false, 18031, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
                Logger.debug();
            }
        }
    }

    private void b(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f29908a, false, 18042, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f29908a, false, 18042, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        q();
        this.s = new c(this, (byte) 0);
        this.K.postDelayed(this.s, j2);
    }

    private void c(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f29908a, false, 18026, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f29908a, false, 18026, new Class[]{d.class}, Void.TYPE);
        } else if (!f() && dVar2 != null) {
            Logger.debug();
            com.ss.android.message.a.a.b.a(this.f29911d, "handle TYPE_ERROR");
            com.ss.android.message.a.b.a.a.a aVar = (com.ss.android.message.a.b.a.a.a) dVar2.j;
            if (aVar != null) {
                dVar2.i = new IOException("err_no : " + aVar.f29872b + " err_msg : " + aVar.f29873c);
            }
        }
    }

    private boolean b(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f29908a, false, 18015, new Class[]{d.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar}, this, f29908a, false, 18015, new Class[]{d.class}, Boolean.TYPE)).booleanValue();
        } else if (f() || this.B.get() || dVar == null) {
            return false;
        } else {
            Logger.debug();
            this.z.add(dVar);
            if (L.contains(Integer.valueOf(dVar.f29903b))) {
                this.y.put(Integer.valueOf(dVar.f29902a), dVar);
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7 A[Catch:{ SocketException -> 0x00d5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(long r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r10)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f29908a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Long.TYPE
            r6[r8] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 18032(0x4670, float:2.5268E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003a
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r10)
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f29908a
            r4 = 0
            r5 = 18032(0x4670, float:2.5268E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Long.TYPE
            r6[r8] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x003a:
            java.util.concurrent.BlockingQueue<com.ss.android.message.a.b.a.d> r0 = r9.z
            java.util.Iterator r0 = r0.iterator()
        L_0x0040:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x009d
            java.lang.Object r1 = r0.next()
            com.ss.android.message.a.b.a.d r1 = (com.ss.android.message.a.b.a.d) r1
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.g
            long r2 = r2 - r4
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x009d
            java.io.IOException r4 = r9.D
            if (r4 != 0) goto L_0x0082
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Packet id="
            r5.<init>(r6)
            int r6 = r1.f29902a
            r5.append(r6)
            java.lang.String r6 = ", waitTime="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = ", rpcTimetout="
            r5.append(r2)
            r5.append(r10)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            r9.D = r4
        L_0x0082:
            java.io.IOException r2 = r9.D
            r1.i = r2
            monitor-enter(r1)
            r1.notifyAll()     // Catch:{ all -> 0x009a }
            monitor-exit(r1)     // Catch:{ all -> 0x009a }
            r0.remove()
            java.util.Map<java.lang.Integer, com.ss.android.message.a.b.a.d> r2 = r9.y
            int r1 = r1.f29902a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.remove(r1)
            goto L_0x0040
        L_0x009a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009a }
            throw r0
        L_0x009d:
            java.util.concurrent.BlockingQueue<com.ss.android.message.a.b.a.d> r0 = r9.z     // Catch:{ SocketException -> 0x00d5 }
            boolean r0 = r0.isEmpty()     // Catch:{ SocketException -> 0x00d5 }
            if (r0 != 0) goto L_0x00be
            java.util.concurrent.BlockingQueue<com.ss.android.message.a.b.a.d> r0 = r9.z     // Catch:{ SocketException -> 0x00d5 }
            java.lang.Object r0 = r0.peek()     // Catch:{ SocketException -> 0x00d5 }
            com.ss.android.message.a.b.a.d r0 = (com.ss.android.message.a.b.a.d) r0     // Catch:{ SocketException -> 0x00d5 }
            if (r0 == 0) goto L_0x00be
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ SocketException -> 0x00d5 }
            long r3 = r0.g     // Catch:{ SocketException -> 0x00d5 }
            r0 = 0
            long r1 = r1 - r3
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
            long r1 = r10 - r1
            goto L_0x00bf
        L_0x00be:
            r1 = r10
        L_0x00bf:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.B     // Catch:{ SocketException -> 0x00d5 }
            boolean r0 = r0.get()     // Catch:{ SocketException -> 0x00d5 }
            if (r0 != 0) goto L_0x00d4
            r0 = 0
            r9.D = r0     // Catch:{ SocketException -> 0x00d5 }
            java.net.Socket r0 = r9.k     // Catch:{ SocketException -> 0x00d5 }
            if (r0 == 0) goto L_0x00d4
            java.net.Socket r0 = r9.k     // Catch:{ SocketException -> 0x00d5 }
            int r1 = (int) r1     // Catch:{ SocketException -> 0x00d5 }
            r0.setSoTimeout(r1)     // Catch:{ SocketException -> 0x00d5 }
        L_0x00d4:
            return
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.e.a(long):void");
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29908a, false, 18029, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29908a, false, 18029, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.B.get()) {
            if (this.x == com.ss.android.message.a.b.b.SOCKET_DISCONNECTED) {
                if (!z2) {
                    q();
                }
                p();
                return;
            }
            try {
                if (this.D != null) {
                    Logger.debug();
                    l();
                } else if (!this.y.isEmpty()) {
                    this.D = new IOException("Unexpected closed connection");
                    l();
                }
                if (this.p != null && !this.p.isDone()) {
                    this.p.cancel(true);
                }
                if (this.q != null && !this.q.isDone()) {
                    this.q.cancel(true);
                    try {
                        if (this.v != null && this.v.isOpen()) {
                            Logger.debug();
                            this.v.wakeup();
                        }
                    } catch (Exception e2) {
                        com.ss.android.message.b.h.a(e2);
                    }
                    Logger.debug();
                }
                p();
                if (!z2) {
                    q();
                }
                if (this.r != null && !this.r.isDone()) {
                    this.r.cancel(true);
                    Logger.debug();
                }
                if (this.u != null) {
                    this.u.b();
                }
                if (this.K != null) {
                    this.K.removeMessages(4);
                }
                if (this.o != null && !this.o.isShutdown()) {
                    this.o.shutdown();
                    this.o = null;
                }
                if (this.l != null) {
                    a((Closeable) this.l);
                    this.l = null;
                }
                if (this.m != null) {
                    a((Closeable) this.m);
                    this.m = null;
                }
                if (this.k != null) {
                    m();
                }
                if (this.x != com.ss.android.message.a.b.b.SOCKET_DISCONNECTED) {
                    a(com.ss.android.message.a.b.b.SOCKET_DISCONNECTED);
                }
                Logger.debug();
                if (z2 && !f()) {
                    Logger.debug();
                    r();
                }
            } catch (Exception e3) {
                com.ss.android.message.b.h.a(e3);
            }
        }
    }

    public final synchronized void a(com.ss.android.message.a.b.a.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f29908a, false, 18014, new Class[]{com.ss.android.message.a.b.a.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f29908a, false, 18014, new Class[]{com.ss.android.message.a.b.a.a.b.class}, Void.TYPE);
        } else if (!f()) {
            if (this.x == com.ss.android.message.a.b.b.SOCKET_CONNECTED) {
                Logger.debug();
                com.ss.android.message.a.a.b.a(this.f29911d, "sendHandShake");
                a(com.ss.android.message.a.b.b.HANDSSHAKEING);
                d dVar = new d();
                dVar.f29902a = this.n.incrementAndGet();
                dVar.f29903b = 1;
                dVar.f29906e = bVar.a();
                dVar.j = bVar;
                b(dVar);
                o();
                return;
            }
            Logger.debug();
        }
    }

    public final void handleMsg(Message message) {
        b.a aVar;
        boolean z2;
        Message message2 = message;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f29908a, false, 18018, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f29908a, false, 18018, new Class[]{Message.class}, Void.TYPE);
        } else if (message2 != null) {
            if (message2.what == 3 || !f()) {
                switch (message2.what) {
                    case 1:
                        d a2 = a(message);
                        if (PatchProxy.isSupport(new Object[]{a2}, this, f29908a, false, 18021, new Class[]{d.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{a2}, this, f29908a, false, 18021, new Class[]{d.class}, Void.TYPE);
                            break;
                        } else {
                            if (!f() && a2 != null) {
                                int i2 = a2.f29903b;
                                if (i2 == 3) {
                                    com.ss.android.message.a.a.b.a(this.f29911d, "handle TYPE_REGISTER");
                                    if (!PatchProxy.isSupport(new Object[]{a2}, this, f29908a, false, 18024, new Class[]{d.class}, Void.TYPE)) {
                                        if (!f() && a2 != null) {
                                            switch (a2.f29904c) {
                                                case 254:
                                                    Logger.debug();
                                                    com.ss.android.message.a.a.b.a(this.f29911d, "handle TYPE_OK");
                                                    a(com.ss.android.message.a.b.b.REGISTERED);
                                                    p();
                                                    if (this.t != null) {
                                                        this.K.removeCallbacks(this.t);
                                                        this.t = null;
                                                        break;
                                                    }
                                                    break;
                                                case 255:
                                                    Logger.debug();
                                                    c(a2);
                                                    break;
                                            }
                                        }
                                    } else {
                                        PatchProxy.accessDispatch(new Object[]{a2}, this, f29908a, false, 18024, new Class[]{d.class}, Void.TYPE);
                                        break;
                                    }
                                } else {
                                    switch (i2) {
                                        case 0:
                                            com.ss.android.message.a.a.b.a(this.f29911d, "handle TYPE_HEART_BEAT");
                                            if (PatchProxy.isSupport(new Object[]{a2}, this, f29908a, false, 18023, new Class[]{d.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{a2}, this, f29908a, false, 18023, new Class[]{d.class}, Void.TYPE);
                                            } else if (!f() && a2 != null) {
                                                int i3 = a2.f29904c;
                                                if (i3 != 0) {
                                                    if (i3 == 255) {
                                                        Logger.debug();
                                                        c(a2);
                                                        break;
                                                    }
                                                } else if (Logger.debug()) {
                                                    return;
                                                }
                                            }
                                            break;
                                        case 1:
                                            com.ss.android.message.a.a.b.a(this.f29911d, "handle TYPE_HAND_SHAKE");
                                            if (!PatchProxy.isSupport(new Object[]{a2}, this, f29908a, false, 18022, new Class[]{d.class}, Void.TYPE)) {
                                                if (!f() && a2 != null) {
                                                    int i4 = a2.f29904c;
                                                    if (i4 != 2) {
                                                        if (i4 == 255) {
                                                            Logger.debug();
                                                            com.ss.android.message.a.a.b.a(this.f29911d, "handle TYPE_ERROR");
                                                            c(a2);
                                                            break;
                                                        }
                                                    } else {
                                                        Logger.debug();
                                                        com.ss.android.message.a.a.b.a(this.f29911d, "handle TYPE_HAND_SHAKE_REPLY");
                                                        a(com.ss.android.message.a.b.b.HANDSSHAKEED);
                                                        p();
                                                        this.f29913f.a(this.f29911d, (d.a) null);
                                                        if (a2.j != null) {
                                                            com.ss.android.message.a.b.a.a.b bVar = (com.ss.android.message.a.b.a.a.b) a2.j;
                                                            if (bVar.i != -1) {
                                                                Logger.debug();
                                                                this.u.a((long) (bVar.i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                                                            }
                                                        }
                                                        this.u.a();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                PatchProxy.accessDispatch(new Object[]{a2}, this, f29908a, false, 18022, new Class[]{d.class}, Void.TYPE);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }
                            return;
                        }
                        break;
                    case 2:
                        d a3 = a(message);
                        if (PatchProxy.isSupport(new Object[]{a3}, this, f29908a, false, 18025, new Class[]{d.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{a3}, this, f29908a, false, 18025, new Class[]{d.class}, Void.TYPE);
                            break;
                        } else {
                            if (!f() && a3 != null) {
                                Logger.debug();
                                com.ss.android.message.a.a.b.a(this.f29911d, "handleMessageEvent");
                                com.ss.android.message.a.b.a.a.c cVar = (com.ss.android.message.a.b.a.a.c) a3.j;
                                long j2 = cVar.f29883d;
                                long j3 = a3.h;
                                long j4 = j3;
                                if (PatchProxy.isSupport(new Object[]{new Long(j2), new Long(j3)}, this, f29908a, false, 18027, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)) {
                                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), new Long(j4)}, this, f29908a, false, 18027, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
                                } else {
                                    long j5 = j4;
                                    Logger.debug();
                                    if (!f()) {
                                        h a4 = h.a();
                                        if (PatchProxy.isSupport(new Object[]{new Long(j2), new Long(j5)}, a4, h.f29932a, false, 18066, new Class[]{Long.TYPE, Long.TYPE}, b.a.class)) {
                                            h hVar = a4;
                                            aVar = (b.a) PatchProxy.accessDispatch(new Object[]{new Long(j2), new Long(j5)}, hVar, h.f29932a, false, 18066, new Class[]{Long.TYPE, Long.TYPE}, b.a.class);
                                        } else {
                                            com.ss.android.pushmanager.app.b bVar2 = a4.f29934b;
                                            bVar2.getClass();
                                            b.a aVar2 = new b.a();
                                            aVar2.f30498b = Long.valueOf(j2);
                                            aVar2.f30499c = j5;
                                            aVar = aVar2;
                                        }
                                        h a5 = h.a();
                                        if (PatchProxy.isSupport(new Object[]{aVar}, a5, h.f29932a, false, 18067, new Class[]{b.a.class}, Boolean.TYPE)) {
                                            h hVar2 = a5;
                                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, hVar2, h.f29932a, false, 18067, new Class[]{b.a.class}, Boolean.TYPE)).booleanValue();
                                        } else {
                                            z2 = a5.f29934b.a(aVar);
                                        }
                                        h a6 = h.a();
                                        if (PatchProxy.isSupport(new Object[]{aVar}, a6, h.f29932a, false, 18068, new Class[]{b.a.class}, Void.TYPE)) {
                                            h hVar3 = a6;
                                            PatchProxy.accessDispatch(new Object[]{aVar}, hVar3, h.f29932a, false, 18068, new Class[]{b.a.class}, Void.TYPE);
                                        } else {
                                            a6.f29934b.c(aVar);
                                            com.ss.android.pushmanager.setting.b a7 = com.ss.android.pushmanager.setting.b.a();
                                            String a8 = a6.f29934b.a();
                                            if (PatchProxy.isSupport(new Object[]{a8}, a7, com.ss.android.pushmanager.setting.b.f2543a, false, 19203, new Class[]{String.class}, Void.TYPE)) {
                                                com.ss.android.pushmanager.setting.b bVar3 = a7;
                                                PatchProxy.accessDispatch(new Object[]{a8}, bVar3, com.ss.android.pushmanager.setting.b.f2543a, false, 19203, new Class[]{String.class}, Void.TYPE);
                                            } else {
                                                a7.f2546c.a().a("self_push_message_ids", a8).a();
                                            }
                                        }
                                        z3 = z2;
                                    }
                                }
                                if (z3) {
                                    Logger.debug();
                                    com.ss.android.message.a.a.b.a(this.f29911d, "handleMessageEvent");
                                } else {
                                    this.f29913f.a((long) cVar.f29882c, cVar.f29884e);
                                }
                                a3.f29903b = 17;
                                a3.f29906e = cVar.a();
                                b(a3);
                            }
                            return;
                        }
                    case 3:
                        if (message.getData() != null && !message.getData().isEmpty()) {
                            String string = message.getData().getString("close_io_exception");
                            boolean z4 = message.getData().getBoolean("close_retry", true);
                            Logger.debug();
                            Context context = this.f29911d;
                            com.ss.android.message.a.a.b.a(context, "receive close event ioException : " + string + " isRetry : " + z4);
                            IOException iOException = new IOException(string);
                            if (PatchProxy.isSupport(new Object[]{iOException, Byte.valueOf(z4 ? (byte) 1 : 0)}, this, f29908a, false, 18019, new Class[]{IOException.class, Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{iOException, Byte.valueOf(z4)}, this, f29908a, false, 18019, new Class[]{IOException.class, Boolean.TYPE}, Void.TYPE);
                                break;
                            } else {
                                if (PatchProxy.isSupport(new Object[]{iOException}, this, f29908a, false, 18010, new Class[]{IOException.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{iOException}, this, f29908a, false, 18010, new Class[]{IOException.class}, Void.TYPE);
                                } else if (this.x != com.ss.android.message.a.b.b.SOCKET_DISCONNECTED && this.x.getStateValue() < com.ss.android.message.a.b.b.SOCKET_DISCONNECTING.getStateValue() && this.B.compareAndSet(false, true)) {
                                    a(com.ss.android.message.a.b.b.SOCKET_DISCONNECTING);
                                    this.D = iOException;
                                }
                                a(z4);
                                return;
                            }
                        } else {
                            return;
                        }
                        break;
                    case 4:
                        if (this.f29911d != null) {
                            Logger.debug();
                            try {
                                this.f29911d.startService(h.c(this.f29911d));
                                return;
                            } catch (Exception unused) {
                                break;
                            }
                        } else {
                            return;
                        }
                }
            }
        }
    }

    public e(Context context, com.ss.android.message.a.a.d dVar) throws IOException {
        this.n = new AtomicInteger(0);
        this.M = new HashMap();
        this.x = com.ss.android.message.a.b.b.SOCKET_DISCONNECTED;
        this.y = new ConcurrentHashMap();
        this.z = new LinkedBlockingQueue();
        this.A = new AtomicLong();
        this.B = new AtomicBoolean();
        this.C = new AtomicBoolean(false);
        this.E = 30000;
        this.F = 30000;
        this.G = 30000;
        this.H = 0;
        this.I = 60;
        this.J = 1;
        this.K = new WeakHandler(Looper.getMainLooper(), this);
        this.f29911d = context;
        this.f29912e = com.ss.android.pushmanager.app.e.a();
        this.f29913f = dVar;
        this.f29909b = SocketFactory.getDefault();
        this.u = new b((long) this.E);
        for (com.ss.android.message.a.b.b put : com.ss.android.message.a.b.b.values()) {
            this.M.put(put, new HashSet());
        }
    }

    public final boolean b(com.ss.android.message.a.b.b bVar, com.ss.android.message.a.b.a aVar) {
        com.ss.android.message.a.b.b bVar2 = bVar;
        com.ss.android.message.a.b.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{bVar2, aVar2}, this, f29908a, false, 18050, new Class[]{com.ss.android.message.a.b.b.class, com.ss.android.message.a.b.a.class}, Boolean.TYPE)) {
            return this.M.get(bVar2).remove(aVar2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2, aVar2}, this, f29908a, false, 18050, new Class[]{com.ss.android.message.a.b.b.class, com.ss.android.message.a.b.a.class}, Boolean.TYPE)).booleanValue();
    }

    private void a(int i2, int i3, IOException iOException) throws IOException {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), 0, iOException}, this, f29908a, false, 18035, new Class[]{Integer.TYPE, Integer.TYPE, IOException.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), 0, iOException}, this, f29908a, false, 18035, new Class[]{Integer.TYPE, Integer.TYPE, IOException.class}, Void.TYPE);
        } else if (!f()) {
            Logger.debug();
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.g.f29930b != null) {
                    jSONObject.put("address", this.g.f29930b.toString());
                }
                jSONObject.put("exception", iOException.getMessage());
            } catch (Throwable unused) {
            }
            m();
            if (i2 >= 0) {
                this.g = n();
                if (this.g != null) {
                    a(com.ss.android.message.a.b.b.SOCKET_CONNECTING);
                } else {
                    throw iOException;
                }
            }
        }
    }
}

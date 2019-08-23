package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.q;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public final class Dispatcher {

    /* renamed from: a  reason: collision with root package name */
    final b f27371a = new b();

    /* renamed from: b  reason: collision with root package name */
    final Context f27372b;

    /* renamed from: c  reason: collision with root package name */
    final ExecutorService f27373c;

    /* renamed from: d  reason: collision with root package name */
    final i f27374d;

    /* renamed from: e  reason: collision with root package name */
    final Map<String, c> f27375e;

    /* renamed from: f  reason: collision with root package name */
    final Map<Object, a> f27376f;
    final Map<Object, a> g;
    final Set<Object> h;
    final Handler i;
    final Handler j;
    final d k;
    final z l;
    final List<c> m;
    final NetworkBroadcastReceiver n;
    final boolean o;
    public boolean p;

    static class NetworkBroadcastReceiver extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final Dispatcher f27377a;

        NetworkBroadcastReceiver(Dispatcher dispatcher) {
            this.f27377a = dispatcher;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (!"android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                        Dispatcher dispatcher = this.f27377a;
                        dispatcher.i.sendMessage(dispatcher.i.obtainMessage(9, ((ConnectivityManager) ad.a(context, "connectivity")).getActiveNetworkInfo()));
                    }
                } else if (intent.hasExtra("state")) {
                    Dispatcher dispatcher2 = this.f27377a;
                    dispatcher2.i.sendMessage(dispatcher2.i.obtainMessage(10, intent.getBooleanExtra("state", false) ? 1 : 0, 0));
                }
            }
        }
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final Dispatcher f27378a;

        public final void handleMessage(final Message message) {
            boolean z;
            boolean z2 = false;
            switch (message.what) {
                case 1:
                    this.f27378a.a((a) message.obj, true);
                    return;
                case 2:
                    a aVar = (a) message.obj;
                    Dispatcher dispatcher = this.f27378a;
                    String str = aVar.i;
                    c cVar = dispatcher.f27375e.get(str);
                    if (cVar != null) {
                        cVar.b(aVar);
                        if (cVar.a()) {
                            dispatcher.f27375e.remove(str);
                            if (aVar.f27381a.m) {
                                aVar.f27382b.a();
                            }
                        }
                    }
                    if (dispatcher.h.contains(aVar.j)) {
                        dispatcher.g.remove(aVar.c());
                        if (aVar.f27381a.m) {
                            aVar.f27382b.a();
                        }
                    }
                    a remove = dispatcher.f27376f.remove(aVar.c());
                    if (remove != null && remove.f27381a.m) {
                        remove.f27382b.a();
                    }
                    return;
                case 4:
                    c cVar2 = (c) message.obj;
                    Dispatcher dispatcher2 = this.f27378a;
                    if (o.shouldWriteToMemoryCache(cVar2.h)) {
                        dispatcher2.k.a(cVar2.f27406f, cVar2.m);
                    }
                    dispatcher2.f27375e.remove(cVar2.f27406f);
                    dispatcher2.d(cVar2);
                    if (cVar2.f27402b.m) {
                        ad.a(cVar2);
                    }
                    return;
                case 5:
                    this.f27378a.c((c) message.obj);
                    return;
                case 6:
                    this.f27378a.a((c) message.obj, false);
                    return;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    Dispatcher dispatcher3 = this.f27378a;
                    ArrayList arrayList = new ArrayList(dispatcher3.m);
                    dispatcher3.m.clear();
                    dispatcher3.j.sendMessage(dispatcher3.j.obtainMessage(8, arrayList));
                    Dispatcher.a((List<c>) arrayList);
                    return;
                case 9:
                    this.f27378a.a((NetworkInfo) message.obj);
                    return;
                case 10:
                    Dispatcher dispatcher4 = this.f27378a;
                    if (message.arg1 == 1) {
                        z2 = true;
                    }
                    dispatcher4.p = z2;
                    return;
                case 11:
                    Object obj = message.obj;
                    Dispatcher dispatcher5 = this.f27378a;
                    if (dispatcher5.h.add(obj)) {
                        Iterator<c> it2 = dispatcher5.f27375e.values().iterator();
                        while (it2.hasNext()) {
                            c next = it2.next();
                            boolean z3 = next.f27402b.m;
                            a aVar2 = next.k;
                            List<a> list = next.l;
                            if (list == null || list.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (aVar2 != null || z) {
                                if (aVar2 != null && aVar2.j.equals(obj)) {
                                    next.b(aVar2);
                                    dispatcher5.g.put(aVar2.c(), aVar2);
                                    if (z3) {
                                        aVar2.f27382b.a();
                                        StringBuilder sb = new StringBuilder("because tag '");
                                        sb.append(obj);
                                        sb.append("' was paused");
                                    }
                                }
                                if (z) {
                                    for (int size = list.size() - 1; size >= 0; size--) {
                                        a aVar3 = list.get(size);
                                        if (aVar3.j.equals(obj)) {
                                            next.b(aVar3);
                                            dispatcher5.g.put(aVar3.c(), aVar3);
                                            if (z3) {
                                                aVar3.f27382b.a();
                                                StringBuilder sb2 = new StringBuilder("because tag '");
                                                sb2.append(obj);
                                                sb2.append("' was paused");
                                            }
                                        }
                                    }
                                }
                                if (next.a()) {
                                    it2.remove();
                                    if (z3) {
                                        ad.a(next);
                                    }
                                }
                            }
                        }
                    }
                    return;
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                    this.f27378a.a(message.obj);
                    return;
                default:
                    s.f27437a.post(new Runnable() {
                        public final void run() {
                            throw new AssertionError("Unknown handler message received: " + message.what);
                        }
                    });
                    return;
            }
        }

        public a(Looper looper, Dispatcher dispatcher) {
            super(looper);
            this.f27378a = dispatcher;
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    private void b(a aVar) {
        Object c2 = aVar.c();
        if (c2 != null) {
            aVar.k = true;
            this.f27376f.put(c2, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        this.i.sendMessage(this.i.obtainMessage(2, aVar));
    }

    private void e(c cVar) {
        a aVar = cVar.k;
        if (aVar != null) {
            b(aVar);
        }
        List<a> list = cVar.l;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(list.get(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar) {
        this.i.sendMessageDelayed(this.i.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: package-private */
    public final void b(c cVar) {
        this.i.sendMessage(this.i.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        if (!cVar.b()) {
            this.m.add(cVar);
            if (!this.i.hasMessages(7)) {
                this.i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    static void a(List<c> list) {
        if (!list.isEmpty() && list.get(0).f27402b.m) {
            StringBuilder sb = new StringBuilder();
            for (c next : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ad.a(next));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(NetworkInfo networkInfo) {
        if (this.f27373c instanceof u) {
            u uVar = (u) this.f27373c;
            if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
                uVar.a(3);
            } else {
                int type = networkInfo.getType();
                if (!(type == 6 || type == 9)) {
                    switch (type) {
                        case 0:
                            int subtype = networkInfo.getSubtype();
                            switch (subtype) {
                                case 1:
                                case 2:
                                    uVar.a(1);
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    uVar.a(2);
                                    break;
                                default:
                                    switch (subtype) {
                                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                                            break;
                                        case 13:
                                        case 14:
                                        case 15:
                                            uVar.a(3);
                                            break;
                                        default:
                                            uVar.a(3);
                                            break;
                                    }
                                    uVar.a(2);
                                    break;
                            }
                        case 1:
                            break;
                        default:
                            uVar.a(3);
                            break;
                    }
                }
                uVar.a(4);
            }
        }
        if (networkInfo != null && networkInfo.isConnected() && !this.f27376f.isEmpty()) {
            Iterator<a> it2 = this.f27376f.values().iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                it2.remove();
                if (next.f27381a.m) {
                    next.f27382b.a();
                }
                a(next, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!cVar.b()) {
            boolean z4 = false;
            if (this.f27373c.isShutdown()) {
                a(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.o) {
                networkInfo = ((ConnectivityManager) ad.a(this.f27372b, "connectivity")).getActiveNetworkInfo();
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            boolean z5 = this.p;
            if (cVar.r > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
            } else {
                cVar.r--;
                z3 = cVar.j.a(networkInfo);
            }
            boolean b2 = cVar.j.b();
            if (!z3) {
                if (this.o && b2) {
                    z4 = true;
                }
                a(cVar, z4);
                if (z4) {
                    e(cVar);
                }
            } else if (!this.o || z) {
                if (cVar.f27402b.m) {
                    ad.a(cVar);
                }
                if (cVar.p instanceof q.a) {
                    cVar.i |= p.NO_CACHE.index;
                }
                cVar.n = this.f27373c.submit(cVar);
            } else {
                a(cVar, b2);
                if (b2) {
                    e(cVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj) {
        if (this.h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<a> it2 = this.g.values().iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                if (next.j.equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it2.remove();
                }
            }
            if (arrayList != null) {
                this.j.sendMessage(this.j.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar, boolean z) {
        String str;
        if (cVar.f27402b.m) {
            ad.a(cVar);
            StringBuilder sb = new StringBuilder("for error");
            if (z) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb.append(str);
        }
        this.f27375e.remove(cVar.f27406f);
        d(cVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar, boolean z) {
        if (this.h.contains(aVar.j)) {
            this.g.put(aVar.c(), aVar);
            if (aVar.f27381a.m) {
                aVar.f27382b.a();
                StringBuilder sb = new StringBuilder("because tag '");
                sb.append(aVar.j);
                sb.append("' is paused");
            }
            return;
        }
        c cVar = this.f27375e.get(aVar.i);
        if (cVar != null) {
            cVar.a(aVar);
        } else if (this.f27373c.isShutdown()) {
            if (aVar.f27381a.m) {
                aVar.f27382b.a();
            }
        } else {
            c a2 = c.a(aVar.f27381a, this, this.k, this.l, aVar);
            a2.n = this.f27373c.submit(a2);
            this.f27375e.put(aVar.i, a2);
            if (z) {
                this.f27376f.remove(aVar.c());
            }
            if (aVar.f27381a.m) {
                aVar.f27382b.a();
            }
        }
    }

    public Dispatcher(Context context, ExecutorService executorService, Handler handler, i iVar, d dVar, z zVar) {
        boolean z;
        this.f27371a.start();
        ad.a(this.f27371a.getLooper());
        this.f27372b = context;
        this.f27373c = executorService;
        this.f27375e = new LinkedHashMap();
        this.f27376f = new WeakHashMap();
        this.g = new WeakHashMap();
        this.h = new HashSet();
        this.i = new a(this.f27371a.getLooper(), this);
        this.f27374d = iVar;
        this.j = handler;
        this.k = dVar;
        this.l = zVar;
        this.m = new ArrayList(4);
        this.p = ad.c(this.f27372b);
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        this.o = z;
        this.n = new NetworkBroadcastReceiver(this);
        NetworkBroadcastReceiver networkBroadcastReceiver = this.n;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (networkBroadcastReceiver.f27377a.o) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        networkBroadcastReceiver.f27377a.f27372b.registerReceiver(networkBroadcastReceiver, intentFilter);
    }
}

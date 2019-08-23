package com.ss.android.ugc.effectmanager.link;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.common.i;
import com.ss.android.ugc.effectmanager.link.model.blackRoom.BlackRoom;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class LinkSelector implements i.a {

    /* renamed from: a  reason: collision with root package name */
    public List<Host> f77517a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public NetworkChangeReceiver f77518b;

    /* renamed from: c  reason: collision with root package name */
    public int f77519c;

    /* renamed from: d  reason: collision with root package name */
    public int f77520d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f77521e;

    /* renamed from: f  reason: collision with root package name */
    public Context f77522f;
    public String g;
    public List<Host> h = new ArrayList();
    public String i;
    public boolean j;
    public boolean k;
    private BlackRoom l;
    private a m;
    private Handler n = new i(this);
    private volatile boolean o = false;

    public class NetworkChangeReceiver extends BroadcastReceiver {
        public NetworkChangeReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (LinkSelector.this.f77521e) {
                if (!LinkSelector.this.f77517a.isEmpty() || !LinkSelector.this.j) {
                    try {
                        LinkSelector.this.c();
                    } catch (NullPointerException unused) {
                    }
                }
            }
        }
    }

    public final boolean a() {
        if (!this.f77521e || this.h.size() <= 1) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        if (this.f77522f == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f77522f.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void c() {
        if (a() && !this.o && d()) {
            this.m.f77204a.q.a(new com.ss.android.ugc.effectmanager.link.a.b.a(this, this.n, "SpeedMeasure"));
            this.o = true;
        }
    }

    public final void b() {
        if (!a()) {
            this.i = this.h.get(0).getItemName();
            return;
        }
        Host host = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f77517a.size()) {
                break;
            }
            Host host2 = this.f77517a.get(i2);
            if (this.l.checkHostAvailable(host2)) {
                host = host2;
                break;
            }
            i2++;
        }
        if (host == null) {
            host = this.h.get(0);
            c();
        }
        this.i = host.getItemName();
    }

    public final void a(String str) {
        if (d()) {
            new StringBuilder("on link api error:").append(str);
            b(str);
        }
    }

    public LinkSelector(a aVar) {
        this.f77517a.clear();
        this.l = new BlackRoom();
        this.m = aVar;
        this.f77518b = null;
    }

    private void b(String str) {
        try {
            URI uri = new URL(str.replace(" ", "%20")).toURI();
            Host host = new Host(uri.getHost(), uri.getScheme());
            for (Host next : this.f77517a) {
                if (host.hostEquals(next)) {
                    this.l.lock(next);
                    b();
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void a(Message message) {
        if (message.what == 31 && (message.obj instanceof com.ss.android.ugc.effectmanager.link.a.a.a)) {
            com.ss.android.ugc.effectmanager.link.a.a.a aVar = (com.ss.android.ugc.effectmanager.link.a.a.a) message.obj;
            c cVar = aVar.f77525c;
            List<Host> list = aVar.f77524b;
            if (cVar == null) {
                StringBuilder sb = new StringBuilder("on sort done = ");
                sb.append(list.size());
                sb.append(" selector:");
                sb.append(this);
                sb.append(" thread:");
                sb.append(Thread.currentThread());
                this.f77517a.clear();
                this.f77517a.addAll(list);
                b();
            }
            this.o = false;
        }
    }
}

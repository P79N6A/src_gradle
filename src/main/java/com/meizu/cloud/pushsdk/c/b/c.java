package com.meizu.cloud.pushsdk.c.b;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.meizu.cloud.pushsdk.b.c.e;
import com.meizu.cloud.pushsdk.b.c.g;
import com.meizu.cloud.pushsdk.b.c.i;
import com.meizu.cloud.pushsdk.b.c.j;
import com.meizu.cloud.pushsdk.b.c.k;
import com.meizu.cloud.pushsdk.c.a.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f27105a = 88;

    /* renamed from: b  reason: collision with root package name */
    protected int f27106b = 22;

    /* renamed from: c  reason: collision with root package name */
    protected final g f27107c = g.a("application/json; charset=utf-8");

    /* renamed from: d  reason: collision with root package name */
    protected Context f27108d;

    /* renamed from: e  reason: collision with root package name */
    protected Uri.Builder f27109e;

    /* renamed from: f  reason: collision with root package name */
    protected f f27110f;
    protected d g;
    protected a h;
    protected h i;
    protected SSLSocketFactory j;
    protected HostnameVerifier k;
    protected String l;
    protected int m;
    protected int n;
    protected int o;
    protected long p;
    protected long q;
    protected TimeUnit r;
    protected com.meizu.cloud.pushsdk.b.c.a s;
    public AtomicBoolean t = new AtomicBoolean(false);
    private final String u = c.class.getSimpleName();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected final String f27111a;

        /* renamed from: b  reason: collision with root package name */
        protected final Context f27112b;

        /* renamed from: c  reason: collision with root package name */
        protected f f27113c;

        /* renamed from: d  reason: collision with root package name */
        protected d f27114d = d.POST;

        /* renamed from: e  reason: collision with root package name */
        protected a f27115e = a.Single;

        /* renamed from: f  reason: collision with root package name */
        protected h f27116f = h.HTTPS;
        protected int g = 5;
        protected int h = 250;
        protected int i = 5;
        protected long j = 40000;
        protected long k = 40000;
        protected TimeUnit l = TimeUnit.SECONDS;
        protected SSLSocketFactory m;
        protected HostnameVerifier n;
        protected com.meizu.cloud.pushsdk.b.c.a o = new e();
        private Class<? extends c> p;

        public a(String str, Context context, Class<? extends c> cls) {
            this.f27111a = str;
            this.f27112b = context;
            this.p = cls;
        }

        public a a(int i2) {
            this.g = i2;
            return this;
        }

        public a a(com.meizu.cloud.pushsdk.b.c.a aVar) {
            if (aVar != null) {
                this.o = aVar;
                String simpleName = a.class.getSimpleName();
                com.meizu.cloud.pushsdk.c.f.c.c(simpleName, "set new call " + aVar, new Object[0]);
            }
            return this;
        }

        public a a(a aVar) {
            this.f27115e = aVar;
            return this;
        }

        public a a(f fVar) {
            this.f27113c = fVar;
            return this;
        }

        public a b(int i2) {
            this.h = i2;
            return this;
        }

        public a c(int i2) {
            this.i = i2;
            return this;
        }
    }

    public c(a aVar) {
        this.g = aVar.f27114d;
        this.f27110f = aVar.f27113c;
        this.f27108d = aVar.f27112b;
        this.h = aVar.f27115e;
        this.i = aVar.f27116f;
        this.j = aVar.m;
        this.k = aVar.n;
        this.m = aVar.g;
        this.n = aVar.i;
        this.o = aVar.h;
        this.p = aVar.j;
        this.q = aVar.k;
        this.l = aVar.f27111a;
        this.r = aVar.l;
        this.s = aVar.o;
        c();
        com.meizu.cloud.pushsdk.c.f.c.c(this.u, "Emitter created successfully!", new Object[0]);
    }

    private i a(com.meizu.cloud.pushsdk.c.a.a aVar) {
        a(aVar, "");
        this.f27109e.clearQuery();
        HashMap hashMap = (HashMap) aVar.a();
        for (String str : hashMap.keySet()) {
            this.f27109e.appendQueryParameter(str, (String) hashMap.get(str));
        }
        return new i.a().a(this.f27109e.build().toString()).a().c();
    }

    private i a(ArrayList<com.meizu.cloud.pushsdk.c.a.a> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<com.meizu.cloud.pushsdk.c.a.a> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.meizu.cloud.pushsdk.c.a.a next = it2.next();
            stringBuffer.append(next.toString());
            arrayList2.add(next.a());
        }
        b bVar = new b("push_group_data", arrayList2);
        String str = this.u;
        com.meizu.cloud.pushsdk.c.f.c.b(str, "final SelfDescribingJson " + bVar, new Object[0]);
        String uri = this.f27109e.build().toString();
        return new i.a().a(uri).a(j.a(this.f27107c, bVar.toString())).c();
    }

    private void a(com.meizu.cloud.pushsdk.c.a.a aVar, String str) {
        if (str.equals("")) {
            str = com.meizu.cloud.pushsdk.c.f.e.a();
        }
        aVar.a("stm", str);
    }

    private void c() {
        String str = this.u;
        com.meizu.cloud.pushsdk.c.f.c.a(str, "security " + this.i, new Object[0]);
        StringBuilder sb = this.i == h.HTTP ? new StringBuilder("http://") : new StringBuilder("https://");
        sb.append(this.l);
        this.f27109e = Uri.parse(sb.toString()).buildUpon();
        if (this.g == d.GET) {
            this.f27109e.appendPath("i");
        } else {
            this.f27109e.appendEncodedPath("push_data_report/mobile");
        }
    }

    public int a(i iVar) {
        k kVar = null;
        try {
            com.meizu.cloud.pushsdk.c.f.c.b(this.u, "Sending request: %s", iVar);
            k a2 = this.s.a(iVar);
            try {
                int a3 = a2.a();
                a(a2);
                return a3;
            } catch (IOException e2) {
                IOException iOException = e2;
                kVar = a2;
                e = iOException;
                try {
                    com.meizu.cloud.pushsdk.c.f.c.a(this.u, "Request sending failed: %s", Log.getStackTraceString(e));
                    a(kVar);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    a(kVar);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                kVar = a2;
                a(kVar);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            com.meizu.cloud.pushsdk.c.f.c.a(this.u, "Request sending failed: %s", Log.getStackTraceString(e));
            a(kVar);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public LinkedList<e> a(b bVar) {
        int size = bVar.a().size();
        LinkedList b2 = bVar.b();
        LinkedList<e> linkedList = new LinkedList<>();
        if (this.g == d.GET) {
            for (int i2 = 0; i2 < size; i2++) {
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(b2.get(i2));
                com.meizu.cloud.pushsdk.c.a.a aVar = (com.meizu.cloud.pushsdk.c.a.a) bVar.a().get(i2);
                linkedList.add(new e(aVar.b() + ((long) this.f27106b) > this.p, a(aVar), linkedList2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3 += this.h.a()) {
                LinkedList linkedList3 = new LinkedList();
                ArrayList arrayList = new ArrayList();
                long j2 = 0;
                LinkedList linkedList4 = linkedList3;
                int i4 = i3;
                while (i4 < this.h.a() + i3 && i4 < size) {
                    com.meizu.cloud.pushsdk.c.a.a aVar2 = (com.meizu.cloud.pushsdk.c.a.a) bVar.a().get(i4);
                    ArrayList arrayList2 = arrayList;
                    long b3 = aVar2.b() + ((long) this.f27106b);
                    LinkedList linkedList5 = linkedList4;
                    long j3 = j2;
                    if (((long) this.f27105a) + b3 > this.q) {
                        ArrayList arrayList3 = new ArrayList();
                        LinkedList linkedList6 = new LinkedList();
                        arrayList3.add(aVar2);
                        linkedList6.add(b2.get(i4));
                        linkedList.add(new e(true, a(arrayList3), linkedList6));
                        arrayList = arrayList2;
                        linkedList4 = linkedList5;
                        j2 = j3;
                    } else {
                        long j4 = j3 + b3;
                        long j5 = j4;
                        if (((long) this.f27105a) + j4 + ((long) (arrayList2.size() - 1)) > this.q) {
                            linkedList.add(new e(false, a(arrayList2), linkedList5));
                            ArrayList arrayList4 = new ArrayList();
                            LinkedList linkedList7 = new LinkedList();
                            arrayList4.add(aVar2);
                            linkedList7.add(b2.get(i4));
                            linkedList4 = linkedList7;
                            j2 = b3;
                            arrayList = arrayList4;
                        } else {
                            arrayList = arrayList2;
                            linkedList4 = linkedList5;
                            arrayList.add(aVar2);
                            linkedList4.add(b2.get(i4));
                            j2 = j5;
                        }
                    }
                    i4++;
                }
                if (!arrayList.isEmpty()) {
                    linkedList.add(new e(false, a(arrayList), linkedList4));
                }
            }
        }
        return linkedList;
    }

    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(k kVar) {
        if (kVar != null) {
            try {
                if (kVar.b() != null) {
                    kVar.b().close();
                }
            } catch (Exception unused) {
                com.meizu.cloud.pushsdk.c.f.c.b(this.u, "Unable to close source data", new Object[0]);
            }
        }
    }

    public abstract void a(com.meizu.cloud.pushsdk.c.a.a aVar, boolean z);

    /* access modifiers changed from: protected */
    public boolean a(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    public String b() {
        return this.f27109e.clearQuery().build().toString();
    }
}

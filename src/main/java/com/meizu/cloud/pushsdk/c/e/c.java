package com.meizu.cloud.pushsdk.c.e;

import android.content.Context;
import com.meizu.cloud.pushsdk.PushManager;
import com.meizu.cloud.pushsdk.c.f.b;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class c {
    private static final String n = "c";

    /* renamed from: a  reason: collision with root package name */
    protected final String f27171a = PushManager.TAG;

    /* renamed from: b  reason: collision with root package name */
    protected com.meizu.cloud.pushsdk.c.b.c f27172b;

    /* renamed from: c  reason: collision with root package name */
    protected b f27173c;

    /* renamed from: d  reason: collision with root package name */
    protected a f27174d;

    /* renamed from: e  reason: collision with root package name */
    protected String f27175e;

    /* renamed from: f  reason: collision with root package name */
    protected String f27176f;
    protected boolean g;
    protected b h;
    protected boolean i;
    protected long j;
    protected int k;
    protected TimeUnit l;
    protected AtomicBoolean m = new AtomicBoolean(true);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected final com.meizu.cloud.pushsdk.c.b.c f27177a;

        /* renamed from: b  reason: collision with root package name */
        protected final String f27178b;

        /* renamed from: c  reason: collision with root package name */
        protected final String f27179c;

        /* renamed from: d  reason: collision with root package name */
        protected final Context f27180d;

        /* renamed from: e  reason: collision with root package name */
        protected b f27181e;

        /* renamed from: f  reason: collision with root package name */
        protected boolean f27182f;
        protected b g = b.OFF;
        protected boolean h;
        protected long i = 600;
        protected long j = 300;
        protected long k = 15;
        protected int l = 10;
        protected TimeUnit m = TimeUnit.SECONDS;
        private Class<? extends c> n;

        public a(com.meizu.cloud.pushsdk.c.b.c cVar, String str, String str2, Context context, Class<? extends c> cls) {
            this.f27177a = cVar;
            this.f27178b = str;
            this.f27179c = str2;
            this.f27180d = context;
            this.n = cls;
        }

        public a a(int i2) {
            this.l = i2;
            return this;
        }

        public a a(b bVar) {
            this.f27181e = bVar;
            return this;
        }

        public a a(b bVar) {
            this.g = bVar;
            return this;
        }

        public a a(Boolean bool) {
            this.f27182f = bool.booleanValue();
            return this;
        }
    }

    public c(a aVar) {
        this.f27172b = aVar.f27177a;
        this.f27176f = aVar.f27179c;
        this.g = aVar.f27182f;
        this.f27175e = aVar.f27178b;
        this.f27173c = aVar.f27181e;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.k;
        this.k = aVar.l >= 2 ? aVar.l : 2;
        this.l = aVar.m;
        if (this.i) {
            a aVar2 = new a(aVar.i, aVar.j, aVar.m, aVar.f27180d);
            this.f27174d = aVar2;
        }
        com.meizu.cloud.pushsdk.c.f.c.a(aVar.g);
        com.meizu.cloud.pushsdk.c.f.c.c(n, "Tracker created successfully.", new Object[0]);
    }

    private com.meizu.cloud.pushsdk.c.a.b a(List<com.meizu.cloud.pushsdk.c.a.b> list) {
        if (this.i) {
            list.add(this.f27174d.a());
        }
        if (this.f27173c != null) {
            if (!this.f27173c.a().isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.c.a.b("geolocation", this.f27173c.a()));
            }
            if (!this.f27173c.b().isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.c.a.b("mobileinfo", this.f27173c.b()));
            }
        }
        LinkedList linkedList = new LinkedList();
        for (com.meizu.cloud.pushsdk.c.a.b a2 : list) {
            linkedList.add(a2.a());
        }
        return new com.meizu.cloud.pushsdk.c.a.b("push_extra_info", linkedList);
    }

    private void a(com.meizu.cloud.pushsdk.c.a.c cVar, List<com.meizu.cloud.pushsdk.c.a.b> list, boolean z) {
        if (this.f27173c != null) {
            cVar.a(new HashMap(this.f27173c.c()));
            cVar.a("et", (Object) a(list).a());
        }
        com.meizu.cloud.pushsdk.c.f.c.c(n, "Adding new payload to event storage: %s", cVar);
        this.f27172b.a((com.meizu.cloud.pushsdk.c.a.a) cVar, z);
    }

    public void a() {
        if (this.m.get()) {
            b().a();
        }
    }

    public void a(com.meizu.cloud.pushsdk.c.c.b bVar, boolean z) {
        if (this.m.get()) {
            a(bVar.e(), bVar.a(), z);
        }
    }

    public void a(b bVar) {
        this.f27173c = bVar;
    }

    public com.meizu.cloud.pushsdk.c.b.c b() {
        return this.f27172b;
    }
}

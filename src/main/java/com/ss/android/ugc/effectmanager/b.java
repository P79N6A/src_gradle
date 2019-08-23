package com.ss.android.ugc.effectmanager;

import android.content.res.AssetManager;
import com.ss.android.ugc.effectmanager.c;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.d.d;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f77206a;

    /* renamed from: b  reason: collision with root package name */
    public final String f77207b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.effectmanager.common.d.b f77208c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Host> f77209d;

    /* renamed from: e  reason: collision with root package name */
    public final c f77210e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f77211f;
    public final String g;
    public final String h;
    public final Pattern i;
    public final c.a j;
    public final C0809b k;
    public final String l;
    public final String m;
    public final d n;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        AssetManager f77212a;

        /* renamed from: b  reason: collision with root package name */
        String f77213b;

        /* renamed from: c  reason: collision with root package name */
        com.ss.android.ugc.effectmanager.common.d.b f77214c;

        /* renamed from: d  reason: collision with root package name */
        List<Host> f77215d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        com.ss.android.ugc.effectmanager.common.d.c f77216e;

        /* renamed from: f  reason: collision with root package name */
        Executor f77217f;
        String g;
        String h;
        String i;
        String j;
        d k;
        Pattern l;
        c.a m;
        C0809b n;

        public final b a() {
            return new b(this, (byte) 0);
        }

        public final a a(AssetManager assetManager) {
            this.f77212a = assetManager;
            return this;
        }

        public final a b(String str) {
            this.g = str;
            return this;
        }

        public final a c(String str) {
            this.h = str;
            return this;
        }

        public final a d(String str) {
            this.i = str;
            return this;
        }

        public final a e(String str) {
            this.j = str;
            return this;
        }

        public final a a(C0809b bVar) {
            this.n = bVar;
            return this;
        }

        public final a a(c.a aVar) {
            this.m = aVar;
            return this;
        }

        public final a f(String str) {
            if (str == null) {
                this.l = null;
            } else {
                this.l = Pattern.compile(str);
            }
            return this;
        }

        public final a a(com.ss.android.ugc.effectmanager.common.d.b bVar) {
            this.f77214c = bVar;
            return this;
        }

        public final a a(com.ss.android.ugc.effectmanager.common.d.c cVar) {
            this.f77216e = cVar;
            return this;
        }

        public final a a(d dVar) {
            this.k = dVar;
            return this;
        }

        public final a a(String str) {
            this.f77213b = str;
            return this;
        }

        public final a a(List<Host> list) {
            this.f77215d.addAll(list);
            return this;
        }

        public final a a(Executor executor) {
            this.f77217f = executor;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.b$b  reason: collision with other inner class name */
    public enum C0809b {
        TEST,
        ONLINE
    }

    private b(a aVar) {
        C0809b bVar;
        this.f77206a = (AssetManager) com.ss.android.ugc.effectmanager.c.a.a(aVar.f77212a);
        this.f77207b = (String) com.ss.android.ugc.effectmanager.c.a.a(aVar.f77213b);
        this.f77208c = (com.ss.android.ugc.effectmanager.common.d.b) com.ss.android.ugc.effectmanager.c.a.a(aVar.f77214c);
        this.f77209d = Collections.unmodifiableList(aVar.f77215d);
        this.f77210e = (com.ss.android.ugc.effectmanager.common.d.c) com.ss.android.ugc.effectmanager.c.a.a(aVar.f77216e);
        this.f77211f = (Executor) com.ss.android.ugc.effectmanager.c.a.a(aVar.f77217f);
        this.g = (String) com.ss.android.ugc.effectmanager.c.a.a(aVar.g);
        this.h = (String) com.ss.android.ugc.effectmanager.c.a.a(aVar.h);
        this.l = (String) com.ss.android.ugc.effectmanager.c.a.a(aVar.i);
        this.m = (String) com.ss.android.ugc.effectmanager.c.a.a(aVar.j);
        this.n = aVar.k;
        this.i = aVar.l;
        this.j = aVar.m;
        if (aVar.n == null) {
            bVar = C0809b.ONLINE;
        } else {
            bVar = aVar.n;
        }
        this.k = bVar;
    }

    /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }
}

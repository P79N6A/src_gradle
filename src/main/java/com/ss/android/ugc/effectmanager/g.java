package com.ss.android.ugc.effectmanager;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.d.b;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.d.d;
import com.ss.android.ugc.effectmanager.common.h;
import com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public class g {
    public com.ss.android.ugc.effectmanager.effect.a.a A;

    /* renamed from: a  reason: collision with root package name */
    public String f77475a;

    /* renamed from: b  reason: collision with root package name */
    public String f77476b;

    /* renamed from: c  reason: collision with root package name */
    public String f77477c;

    /* renamed from: d  reason: collision with root package name */
    public String f77478d;

    /* renamed from: e  reason: collision with root package name */
    public String f77479e;

    /* renamed from: f  reason: collision with root package name */
    public String f77480f;
    public String g;
    public String h;
    public File i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public h q;
    public com.ss.android.ugc.effectmanager.common.d.a r;
    public int s;
    public ArrayList<String> t;
    public LinkSelectorConfiguration u;
    public c v;
    public com.ss.android.ugc.effectmanager.d.a w;
    public d x;
    public ExecutorService y;
    public j z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f77481a;

        /* renamed from: b  reason: collision with root package name */
        public String f77482b;

        /* renamed from: c  reason: collision with root package name */
        public String f77483c;

        /* renamed from: d  reason: collision with root package name */
        public String f77484d;

        /* renamed from: e  reason: collision with root package name */
        public String f77485e;

        /* renamed from: f  reason: collision with root package name */
        public String f77486f;
        public String g;
        public File h;
        public String i;
        public String j;
        public b k;
        public c l;
        public com.ss.android.ugc.effectmanager.common.d.a m;
        public int n = 3;
        public String o;
        public String p;
        public com.ss.android.ugc.effectmanager.effect.a.a q;
        public d r;
        public ExecutorService s;
        public String t;
        public String u;
        public String v;
        public LinkSelectorConfiguration w = new LinkSelectorConfiguration();
        public ArrayList<String> x;
    }

    private g(a aVar) {
        String str;
        com.ss.android.ugc.effectmanager.effect.a.a aVar2;
        this.f77480f = "online";
        this.s = 3;
        this.f77475a = "/effect/api";
        this.f77476b = aVar.f77481a;
        this.f77477c = aVar.f77482b;
        this.f77478d = aVar.f77483c;
        this.f77479e = aVar.f77484d;
        if (TextUtils.equals("test", aVar.f77485e) || TextUtils.equals("local_test", aVar.f77485e)) {
            str = "test";
        } else {
            str = "online";
        }
        this.f77480f = str;
        this.g = aVar.f77486f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.w = new com.ss.android.ugc.effectmanager.d.a(aVar.k);
        this.j = aVar.i;
        this.r = aVar.m;
        this.s = aVar.n;
        this.v = aVar.l;
        this.k = aVar.j;
        this.l = aVar.o;
        this.m = aVar.p;
        this.u = aVar.w;
        this.n = aVar.t;
        this.o = aVar.u;
        this.p = aVar.v;
        this.x = aVar.r;
        this.y = aVar.s;
        if (aVar.q == null) {
            aVar2 = new com.ss.android.ugc.effectmanager.effect.e.b.b(this.w, this.x, this.k, this.f77476b);
        } else {
            aVar2 = aVar.q;
        }
        this.A = aVar2;
        this.z = new j();
        this.t = aVar.x;
    }

    public /* synthetic */ g(a aVar, byte b2) {
        this(aVar);
    }
}

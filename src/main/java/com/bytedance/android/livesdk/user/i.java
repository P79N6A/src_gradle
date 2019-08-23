package com.bytedance.android.livesdk.user;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17444a;

    /* renamed from: b  reason: collision with root package name */
    public String f17445b;

    /* renamed from: c  reason: collision with root package name */
    public String f17446c;

    /* renamed from: d  reason: collision with root package name */
    public int f17447d;

    /* renamed from: e  reason: collision with root package name */
    public String f17448e;

    /* renamed from: f  reason: collision with root package name */
    public String f17449f;
    public String g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17450a;

        /* renamed from: b  reason: collision with root package name */
        public String f17451b;

        /* renamed from: c  reason: collision with root package name */
        public String f17452c;

        /* renamed from: d  reason: collision with root package name */
        public int f17453d;

        /* renamed from: e  reason: collision with root package name */
        public String f17454e;

        /* renamed from: f  reason: collision with root package name */
        public String f17455f;
        public String g;

        private a() {
            this.f17451b = "";
            this.f17452c = "";
            this.f17454e = "";
            this.f17455f = "";
            this.g = "";
        }

        public final i a() {
            if (!PatchProxy.isSupport(new Object[0], this, f17450a, false, 13536, new Class[0], i.class)) {
                return new i(this, (byte) 0);
            }
            return (i) PatchProxy.accessDispatch(new Object[0], this, f17450a, false, 13536, new Class[0], i.class);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(int i) {
            this.f17453d = i;
            return this;
        }

        public final a b(String str) {
            this.f17452c = str;
            return this;
        }

        public final a c(String str) {
            this.f17454e = str;
            return this;
        }

        public final a d(String str) {
            this.f17455f = str;
            return this;
        }

        public final a e(String str) {
            this.g = str;
            return this;
        }

        public final a a(String str) {
            this.f17451b = str;
            return this;
        }
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f17444a, true, 13535, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f17444a, true, 13535, new Class[0], a.class);
        }
        return new a((byte) 0);
    }

    private i(a aVar) {
        this.f17445b = aVar.f17451b;
        this.f17446c = aVar.f17452c;
        this.f17447d = aVar.f17453d;
        this.f17448e = aVar.f17454e;
        this.f17449f = aVar.f17455f;
        this.g = aVar.g;
    }

    /* synthetic */ i(a aVar, byte b2) {
        this(aVar);
    }
}

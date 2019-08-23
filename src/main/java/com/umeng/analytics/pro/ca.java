package com.umeng.analytics.pro;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ea;

public class ca {

    public static class a extends h {

        /* renamed from: a  reason: collision with root package name */
        private final long f80550a = ea.f66827f;

        /* renamed from: b  reason: collision with root package name */
        private be f80551b;

        public a(be beVar) {
            this.f80551b = beVar;
        }

        public boolean a(boolean z) {
            if (System.currentTimeMillis() - this.f80551b.f80431c >= ea.f66827f) {
                return true;
            }
            return false;
        }
    }

    public static class b extends h {

        /* renamed from: a  reason: collision with root package name */
        private bh f80552a;

        /* renamed from: b  reason: collision with root package name */
        private be f80553b;

        public boolean a() {
            return this.f80552a.d();
        }

        public boolean a(boolean z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f80553b.f80431c >= this.f80552a.b()) {
                return true;
            }
            return false;
        }

        public b(be beVar, bh bhVar) {
            this.f80553b = beVar;
            this.f80552a = bhVar;
        }
    }

    public static class c extends h {

        /* renamed from: a  reason: collision with root package name */
        private long f80554a;

        /* renamed from: b  reason: collision with root package name */
        private long f80555b = System.currentTimeMillis();

        public boolean a() {
            if (System.currentTimeMillis() - this.f80555b < this.f80554a) {
                return true;
            }
            return false;
        }

        public c(int i) {
            this.f80554a = (long) i;
        }

        public boolean a(boolean z) {
            if (System.currentTimeMillis() - this.f80555b >= this.f80554a) {
                return true;
            }
            return false;
        }
    }

    public static class d extends h {
        public boolean a(boolean z) {
            return z;
        }
    }

    public static class e extends h {

        /* renamed from: a  reason: collision with root package name */
        private static long f80556a = 90000;

        /* renamed from: b  reason: collision with root package name */
        private static long f80557b = 86400000;

        /* renamed from: c  reason: collision with root package name */
        private long f80558c;

        /* renamed from: d  reason: collision with root package name */
        private be f80559d;

        public long b() {
            return this.f80558c;
        }

        public static boolean a(int i) {
            if (((long) i) < f80556a) {
                return false;
            }
            return true;
        }

        public void a(long j) {
            if (j < f80556a || j > f80557b) {
                this.f80558c = f80556a;
            } else {
                this.f80558c = j;
            }
        }

        public boolean a(boolean z) {
            if (System.currentTimeMillis() - this.f80559d.f80431c >= this.f80558c) {
                return true;
            }
            return false;
        }

        public e(be beVar, long j) {
            this.f80559d = beVar;
            a(j);
        }
    }

    public static class f extends h {

        /* renamed from: a  reason: collision with root package name */
        private long f80560a = 86400000;

        /* renamed from: b  reason: collision with root package name */
        private be f80561b;

        public f(be beVar) {
            this.f80561b = beVar;
        }

        public boolean a(boolean z) {
            if (System.currentTimeMillis() - this.f80561b.f80431c >= this.f80560a) {
                return true;
            }
            return false;
        }
    }

    public static class g extends h {
        public boolean a(boolean z) {
            return true;
        }
    }

    public static class h {
        public boolean a() {
            return true;
        }

        public boolean a(boolean z) {
            return true;
        }
    }

    public static class i extends h {

        /* renamed from: a  reason: collision with root package name */
        private Context f80562a;

        public i(Context context) {
            this.f80562a = context;
        }

        public boolean a(boolean z) {
            return bv.k(this.f80562a);
        }
    }

    public static class j extends h {

        /* renamed from: a  reason: collision with root package name */
        private final long f80563a = 10800000;

        /* renamed from: b  reason: collision with root package name */
        private be f80564b;

        public j(be beVar) {
            this.f80564b = beVar;
        }

        public boolean a(boolean z) {
            if (System.currentTimeMillis() - this.f80564b.f80431c >= 10800000) {
                return true;
            }
            return false;
        }
    }

    public static boolean a(int i2) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }
}

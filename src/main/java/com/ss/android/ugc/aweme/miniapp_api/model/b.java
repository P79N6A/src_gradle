package com.ss.android.ugc.aweme.miniapp_api.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b {
    public static final String g = "b";

    /* renamed from: a  reason: collision with root package name */
    public String f56015a;

    /* renamed from: b  reason: collision with root package name */
    public String f56016b;

    /* renamed from: c  reason: collision with root package name */
    public String f56017c;

    /* renamed from: d  reason: collision with root package name */
    public String f56018d;

    /* renamed from: e  reason: collision with root package name */
    public String f56019e;

    /* renamed from: f  reason: collision with root package name */
    public String f56020f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56021a;

        /* renamed from: b  reason: collision with root package name */
        public String f56022b;

        /* renamed from: c  reason: collision with root package name */
        private String f56023c;

        /* renamed from: d  reason: collision with root package name */
        private String f56024d;

        /* renamed from: e  reason: collision with root package name */
        private String f56025e;

        /* renamed from: f  reason: collision with root package name */
        private String f56026f;
        private String g;

        public final b a() {
            if (PatchProxy.isSupport(new Object[0], this, f56021a, false, 59635, new Class[0], b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[0], this, f56021a, false, 59635, new Class[0], b.class);
            }
            b bVar = new b();
            bVar.f56018d = this.f56026f;
            bVar.f56015a = this.f56023c;
            bVar.f56016b = this.f56024d;
            bVar.f56017c = this.f56025e;
            bVar.f56019e = this.f56022b;
            bVar.f56020f = this.g;
            return bVar;
        }

        public final a a(String str) {
            this.f56023c = str;
            return this;
        }

        public final a b(String str) {
            this.f56024d = str;
            return this;
        }

        public final a c(String str) {
            this.f56025e = str;
            return this;
        }

        public final a d(String str) {
            this.g = str;
            return this;
        }

        public final a e(String str) {
            this.f56022b = str;
            return this;
        }
    }
}

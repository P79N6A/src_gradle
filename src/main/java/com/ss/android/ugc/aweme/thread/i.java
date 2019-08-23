package com.ss.android.ugc.aweme.thread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4228a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4229b;

    /* renamed from: c  reason: collision with root package name */
    public List<p> f4230c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f4231d;

    /* renamed from: e  reason: collision with root package name */
    public long f4232e;

    /* renamed from: f  reason: collision with root package name */
    public long f4233f;
    public long g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4234a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4235b;

        /* renamed from: c  reason: collision with root package name */
        public List<p> f4236c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f4237d;

        /* renamed from: e  reason: collision with root package name */
        public long f4238e;

        /* renamed from: f  reason: collision with root package name */
        public long f4239f;
        public long g;

        private a() {
            this.f4236c = Collections.emptyList();
            this.f4237d = Collections.emptyList();
            this.f4238e = TimeUnit.MINUTES.toMillis(5);
            this.f4239f = TimeUnit.MINUTES.toMillis(5);
            this.g = TimeUnit.MINUTES.toMillis(15);
        }

        public final i a() {
            if (!PatchProxy.isSupport(new Object[0], this, f4234a, false, 86899, new Class[0], i.class)) {
                return new i(this, (byte) 0);
            }
            return (i) PatchProxy.accessDispatch(new Object[0], this, f4234a, false, 86899, new Class[0], i.class);
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f4228a, true, 86898, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f4228a, true, 86898, new Class[0], a.class);
        }
        return new a((byte) 0);
    }

    private i(a aVar) {
        this.f4229b = aVar.f4235b;
        this.f4230c = aVar.f4236c;
        this.f4231d = aVar.f4237d;
        this.f4232e = aVar.f4238e;
        this.f4233f = aVar.f4239f;
        this.g = aVar.g;
    }

    /* synthetic */ i(a aVar, byte b2) {
        this(aVar);
    }
}

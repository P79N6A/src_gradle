package com.bytedance.ies.b;

import android.content.Context;
import com.meituan.robust.Patch;
import com.meituan.robust.PatchManipulate;
import com.meituan.robust.RobustCallBack;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public a f20200a;

    /* renamed from: b  reason: collision with root package name */
    public String f20201b;

    /* renamed from: c  reason: collision with root package name */
    public f f20202c;

    /* renamed from: d  reason: collision with root package name */
    private c f20203d;

    /* renamed from: e  reason: collision with root package name */
    private b f20204e;

    /* renamed from: f  reason: collision with root package name */
    private PatchManipulate f20205f;
    private Context g;
    private RobustCallBack h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f20207a;

        /* renamed from: b  reason: collision with root package name */
        public c f20208b;

        /* renamed from: c  reason: collision with root package name */
        public b f20209c;

        /* renamed from: d  reason: collision with root package name */
        public a f20210d;

        /* renamed from: e  reason: collision with root package name */
        public PatchManipulate f20211e;

        /* renamed from: f  reason: collision with root package name */
        public String f20212f;

        public a(Context context) {
            this.f20207a = context;
        }
    }

    public final List<com.bytedance.ies.b.a.a> a() {
        if (this.f20203d != null) {
            try {
                return this.f20203d.a();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private e(a aVar) {
        PatchManipulate patchManipulate;
        String str;
        this.h = new RobustCallBack() {
            public final void onPatchFetched(boolean z, boolean z2, Patch patch) {
            }

            public final void onPatchListFetched(boolean z, boolean z2, List<Patch> list) {
            }

            public final void onPatchApplied(boolean z, Patch patch) {
                if (e.this.f20200a != null) {
                    e.this.f20200a.a(z, patch);
                }
            }

            public final void exceptionNotify(Throwable th, String str) {
                if (e.this.f20200a != null) {
                    a aVar = e.this.f20200a;
                    aVar.a("exceptionNotify: " + th.getMessage() + "[" + str + "]");
                }
            }

            public final void logNotify(String str, String str2) {
                if (e.this.f20200a != null) {
                    a aVar = e.this.f20200a;
                    aVar.a("logNotify: " + str + "[" + str2 + "]");
                }
            }
        };
        if (aVar != null) {
            this.g = aVar.f20207a;
            this.f20203d = aVar.f20208b;
            this.f20204e = aVar.f20209c;
            this.f20200a = aVar.f20210d;
            if (aVar.f20211e == null) {
                patchManipulate = new d(this);
            } else {
                patchManipulate = aVar.f20211e;
            }
            this.f20205f = patchManipulate;
            if (aVar.f20212f == null) {
                str = this.g.getCacheDir().getAbsolutePath();
            } else {
                str = aVar.f20212f;
            }
            this.f20201b = str;
            this.f20202c = new f(this.g, this.f20205f, this.h);
            return;
        }
        throw new NullPointerException("Build could not be null");
    }

    public final boolean a(Patch patch) {
        if (this.f20204e != null) {
            try {
                if (this.f20200a != null) {
                    this.f20200a.a(0, patch.getMd5());
                }
                this.f20204e.f20195a = 0;
                this.f20204e.a(patch.getUrl(), patch.getLocalPath());
                if (this.f20200a != null) {
                    this.f20200a.a(1, patch.getMd5());
                }
                return true;
            } catch (Exception e2) {
                if (this.h != null) {
                    this.h.exceptionNotify(e2, "download");
                }
                if (this.f20200a != null) {
                    this.f20200a.a(2, patch.getMd5());
                }
            }
        }
        return false;
    }

    public /* synthetic */ e(a aVar, byte b2) {
        this(aVar);
    }
}

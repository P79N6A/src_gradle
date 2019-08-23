package com.ss.android.ugc.aweme.story.detail;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.b.a;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.detail.a;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72366a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.api.b.a f72367b;

    /* renamed from: c  reason: collision with root package name */
    public String f72368c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.arch.widgets.base.b<a> f72369d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Boolean> f72370e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f72371f;
    private Runnable g;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f72376a = new b((byte) 0);
    }

    public final void b() {
        this.f72367b = null;
    }

    public static b a() {
        return a.f72376a;
    }

    private b() {
        this.f72371f = new Handler(Looper.getMainLooper());
        this.g = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72372a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f72372a, false, 83095, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72372a, false, 83095, new Class[0], Void.TYPE);
                    return;
                }
                if (b.this.f72367b != null && b.this.f72367b.a() == a.d.IN_PROGRESS) {
                    b.this.f72367b.c();
                    b.this.f72369d.setValue(new a(b.this.f72368c, a.C0754a.STATE_FAIL, a.b.TIME_OUT));
                    b.this.a(b.this.f72368c, false);
                    b.this.b();
                }
            }
        };
        this.f72370e = new HashMap();
        this.f72369d = new com.ss.android.ugc.aweme.arch.widgets.base.b<>();
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f72366a, false, 83091, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f72366a, false, 83091, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f72370e.containsKey(str)) {
            return false;
        } else {
            return this.f72370e.get(str).booleanValue();
        }
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f72366a, false, 83092, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f72366a, false, 83092, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f72370e.put(str2, Boolean.valueOf(z));
    }

    public final void a(Context context, String str, View view, f fVar) {
        Context context2 = context;
        String str2 = str;
        View view2 = view;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{context2, str2, view2, fVar2}, this, f72366a, false, 83093, new Class[]{Context.class, String.class, View.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, view2, fVar2}, this, f72366a, false, 83093, new Class[]{Context.class, String.class, View.class, f.class}, Void.TYPE);
        } else if (this.f72367b == null || !TextUtils.equals(this.f72368c, str2) || this.f72367b.a() != a.d.IN_PROGRESS) {
            this.f72371f.removeCallbacks(this.g);
            if (this.f72367b != null && this.f72367b.a() == a.d.IN_PROGRESS) {
                this.f72367b.c();
                this.f72369d.setValue(new a(this.f72368c, a.C0754a.STATE_FAIL, a.b.OTHER_ERROR));
                a(this.f72368c, false);
            }
            this.f72368c = str2;
            this.f72367b = new c(context2, fVar2, view2, new a.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72374a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f72374a, false, 83096, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72374a, false, 83096, new Class[0], Void.TYPE);
                        return;
                    }
                    b.this.f72369d.setValue(new a(b.this.f72368c, a.C0754a.STATE_SUCCESS));
                    b.this.a(b.this.f72368c, false);
                    b.this.b();
                }

                public final void a(@NotNull a.b bVar) {
                    a.b bVar2 = bVar;
                    if (PatchProxy.isSupport(new Object[]{bVar2}, this, f72374a, false, 83097, new Class[]{a.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar2}, this, f72374a, false, 83097, new Class[]{a.b.class}, Void.TYPE);
                        return;
                    }
                    b.this.f72369d.setValue(new a(b.this.f72368c, a.C0754a.STATE_FAIL, bVar2));
                    b bVar3 = b.this;
                    if (PatchProxy.isSupport(new Object[]{bVar2}, bVar3, b.f72366a, false, 83094, new Class[]{a.b.class}, Void.TYPE)) {
                        b bVar4 = bVar3;
                        PatchProxy.accessDispatch(new Object[]{bVar2}, bVar4, b.f72366a, false, 83094, new Class[]{a.b.class}, Void.TYPE);
                    } else if (bVar2 == a.b.EMPTY) {
                        com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.kd).a();
                    } else if (bVar2 == a.b.NET_ERROR) {
                        com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.cak).a();
                    }
                    b.this.a(b.this.f72368c, false);
                    b.this.b();
                }
            });
            this.f72367b.a(true);
            this.f72367b.b();
            this.f72371f.postDelayed(this.g, 6000);
        }
    }
}

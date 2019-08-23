package com.ss.android.ugc.aweme.shortvideo.c;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform;
import com.ss.android.ugc.aweme.shortvideo.j.d;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65864a;

    /* renamed from: b  reason: collision with root package name */
    public n f65865b;

    /* renamed from: c  reason: collision with root package name */
    public i f65866c;

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f65867d;

    /* renamed from: e  reason: collision with root package name */
    public View f65868e;

    /* renamed from: f  reason: collision with root package name */
    public View f65869f;
    public boolean g = true;
    public boolean h;
    public AppCompatActivity i;
    public a j;
    public h k;
    public AVETParameter l;
    public com.ss.android.ugc.aweme.filter.a m = new com.ss.android.ugc.aweme.filter.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65870a;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75212, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75212, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            c.this.f65866c.e(i);
        }

        public final void b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75213, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75213, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            c.this.f65866c.a(i);
        }

        public final void c(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75214, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75214, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            c.this.f65866c.b(i);
        }

        public final void d(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75215, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75215, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            c.this.f65866c.g(i);
        }

        public final void e(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75216, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75216, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            c.this.f65866c.c(i);
        }

        public final void f(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75217, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65870a, false, 75217, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            c.this.f65866c.d(i);
        }
    };
    public final e n;
    public com.ss.android.ugc.aweme.base.activity.a o = new d(this);

    public interface a {
        void a();

        void b();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65864a, false, 75202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65864a, false, 75202, new Class[0], Void.TYPE);
            return;
        }
        this.g = true;
        if (this.k != null) {
            this.k.b(new com.ss.android.ugc.aweme.shortvideo.sticker.c.c());
        }
        this.f65869f.setVisibility(8);
        this.f65865b.b();
        this.n.b(this.o);
    }

    public c(AppCompatActivity appCompatActivity, e eVar, d dVar, FrameLayout frameLayout) {
        this.i = appCompatActivity;
        this.n = eVar;
        this.f65867d = frameLayout;
        this.h = UlikeBeautyPlatform.a(PushConstants.PUSH_TYPE_UPLOAD_LOG, "3");
        this.f65866c = new l(dVar, this.h);
        this.f65866c.a();
    }
}

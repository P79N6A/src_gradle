package com.ss.android.ugc.aweme.newfollow.util;

import android.app.Dialog;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.freeflowcard.b;
import com.ss.android.ugc.aweme.freeflowcard.b.a;
import com.ss.android.ugc.aweme.longvideo.j;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.h;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57420a;

    /* renamed from: b  reason: collision with root package name */
    public int f57421b;

    /* renamed from: c  reason: collision with root package name */
    public o f57422c;

    /* renamed from: d  reason: collision with root package name */
    public String f57423d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f57424e;

    /* renamed from: f  reason: collision with root package name */
    private Aweme f57425f;
    private Aweme g;
    private h h;
    private a i;
    private d j;
    private j k;
    private VideoViewComponent l;

    public static boolean m() {
        if (PatchProxy.isSupport(new Object[0], null, f57420a, true, 61932, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f57420a, true, 61932, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.g.a.a()) {
            return true;
        }
        return com.ss.android.ugc.aweme.freeflowcard.a.a.a().d();
    }

    private String r() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61933, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61933, new Class[0], String.class);
        }
        String str = "";
        if (this.j != null) {
            str = this.j.l();
        }
        return str;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61912, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57422c != null && this.f57422c.b(this.i)) {
            this.f57422c.a((a) null);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61913, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final long c() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61915, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61915, new Class[0], Long.TYPE)).longValue();
        } else if (this.f57422c != null) {
            return this.f57422c.d();
        } else {
            return 0;
        }
    }

    public final long d() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61916, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61916, new Class[0], Long.TYPE)).longValue();
        } else if (this.f57422c != null) {
            return this.f57422c.c();
        } else {
            return 0;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61917, new Class[0], Void.TYPE);
            return;
        }
        this.f57421b = 1;
        if (this.f57422c != null) {
            this.f57422c.h();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61918, new Class[0], Void.TYPE);
        } else if (q()) {
            this.f57421b = 2;
            h();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61920, new Class[0], Void.TYPE);
        } else if (this.h.c() && !t()) {
            this.f57421b = 2;
            h();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61924, new Class[0], Void.TYPE);
        } else if (q()) {
            this.f57421b = 0;
            l();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61926, new Class[0], Void.TYPE);
        } else if (this.h.c() && !t()) {
            this.f57421b = 0;
            l();
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61936, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57422c != null) {
            this.f57422c.t();
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61937, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57422c != null) {
            this.f57422c.u();
        }
    }

    @Nullable
    private VideoUrlModel p() {
        Aweme aweme;
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61923, new Class[0], VideoUrlModel.class)) {
            return (VideoUrlModel) PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61923, new Class[0], VideoUrlModel.class);
        }
        Video a2 = this.k.a(this.f57425f);
        if (a2 == null) {
            return null;
        }
        VideoUrlModel properPlayAddr = a2.getProperPlayAddr();
        if (properPlayAddr == null) {
            return null;
        }
        if (this.g == null) {
            aweme = this.f57425f;
        } else {
            aweme = this.g;
        }
        a2.setRationAndSourceId(aweme.getAid());
        return properPlayAddr;
    }

    private boolean q() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61930, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61930, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.h.c() || t() || !a(true)) {
            return false;
        } else {
            return true;
        }
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61934, new Class[0], Void.TYPE);
        } else if (this.j != null && this.j.j()) {
            if (!m.a().b() || !TextUtils.isEmpty(b.a().c())) {
                this.j.a((a.C0575a) new a.C0575a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f57426a;

                    public final void a(Dialog dialog) {
                        if (PatchProxy.isSupport(new Object[]{dialog}, this, f57426a, false, 61939, new Class[]{Dialog.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialog}, this, f57426a, false, 61939, new Class[]{Dialog.class}, Void.TYPE);
                        } else if (i.this.f57421b == 2) {
                            i.this.h();
                        } else if (i.this.f57421b == 0) {
                            i.this.l();
                        } else {
                            i.this.f57421b = 2;
                            i.this.h();
                        }
                    }

                    public final void b(Dialog dialog) {
                        if (PatchProxy.isSupport(new Object[]{dialog}, this, f57426a, false, 61940, new Class[]{Dialog.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialog}, this, f57426a, false, 61940, new Class[]{Dialog.class}, Void.TYPE);
                            return;
                        }
                        if (i.this.f57424e) {
                            b.a().j = true;
                        }
                    }
                });
            }
        }
    }

    private boolean t() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61935, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61935, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!(this.f57425f == null || this.f57425f.getStatus() == null || !this.f57425f.getStatus().isDelete())) {
            z = true;
        }
        return z;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61921, new Class[0], Void.TYPE);
            return;
        }
        if (!(p() == null || this.f57422c == null)) {
            this.f57422c.a(this.i);
            this.f57422c.a(this.h.b());
            this.f57422c.a(this.k.a(this.f57425f), true);
        }
    }

    public final boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61927, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61927, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.h.c() || t()) {
            return false;
        } else {
            this.f57421b = 0;
            l();
            return true;
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f57420a, false, 61928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57420a, false, 61928, new Class[0], Void.TYPE);
            return;
        }
        if (!(p() == null || this.f57422c == null)) {
            this.f57422c.a(this.i);
            this.f57422c.a(this.h.b());
            this.f57422c.a(this.k.a(this.f57425f), this.i);
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f57420a, false, 61938, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f57420a, false, 61938, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f57422c != null) {
            this.f57422c.a(f2);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57420a, false, 61919, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57420a, false, 61919, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (q()) {
            this.f57421b = 2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57420a, false, 61922, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57420a, false, 61922, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (!(p() == null || this.f57422c == null)) {
                this.f57422c.a(this.i);
                this.f57422c.a(this.h.b());
                this.f57422c.a(this.k.a(this.f57425f), true, i2);
            }
        }
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f57420a, false, 61911, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f57420a, false, 61911, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                this.g = aweme;
                this.f57425f = aweme.getForwardItem();
                return;
            }
            this.g = null;
            this.f57425f = aweme;
        }
    }

    public final boolean a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57420a, false, 61931, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57420a, false, 61931, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a() || com.ss.android.ugc.aweme.freeflowcard.a.a.a().a(r())) {
            return true;
        } else {
            if (z) {
                s();
            }
            return false;
        }
    }

    public i(KeepSurfaceTextureView keepSurfaceTextureView, com.ss.android.ugc.aweme.video.a.a aVar, d dVar) {
        this(keepSurfaceTextureView, aVar, dVar, j.f53965a);
    }

    private i(KeepSurfaceTextureView keepSurfaceTextureView, com.ss.android.ugc.aweme.video.a.a aVar, d dVar, j jVar) {
        this(h.a(keepSurfaceTextureView), aVar, dVar, jVar);
    }

    public i(VideoViewComponent videoViewComponent, com.ss.android.ugc.aweme.video.a.a aVar, d dVar, j jVar) {
        this.l = videoViewComponent;
        this.h = this.l.f4334b;
        this.i = aVar;
        this.j = null;
        this.k = jVar;
    }

    public i(h hVar, com.ss.android.ugc.aweme.video.a.a aVar, d dVar, j jVar) {
        this.h = hVar;
        this.i = aVar;
        this.j = dVar;
        this.k = jVar;
    }
}

package com.ss.android.ugc.aweme.share.invitefriends.response;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.share.invitefriends.response.a;

public final class c implements a.C0702a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65156a;

    /* renamed from: b  reason: collision with root package name */
    public a.b f65157b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f65158c;

    /* renamed from: d  reason: collision with root package name */
    private i f65159d = new i();

    /* renamed from: e  reason: collision with root package name */
    private int f65160e;

    /* renamed from: f  reason: collision with root package name */
    private String f65161f;

    public final boolean b() {
        return this.f65158c;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f65156a, false, 73576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65156a, false, 73576, new Class[0], Void.TYPE);
            return;
        }
        this.f65157b = null;
        if (this.f65159d != null) {
            this.f65159d.j();
        }
    }

    public final void a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f65156a, false, 73575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65156a, false, 73575, new Class[0], Void.TYPE);
            return;
        }
        if (this.f65160e != 0) {
            i = 1;
        }
        int i2 = i ^ 1;
        if (!(this.f65159d == null || this.f65157b == null)) {
            this.f65157b.a();
            this.f65159d.a(new i.a().a(this.f65161f).a(i2).b(6).a());
        }
    }

    public c(a.b bVar, int i, String str) {
        this.f65157b = bVar;
        this.f65160e = i;
        this.f65161f = str;
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        this.f65158c = z;
        this.f65159d.a(new m() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65162a;

            public final void onFollowFail(Exception exc) {
                if (PatchProxy.isSupport(new Object[]{exc}, this, f65162a, false, 73578, new Class[]{Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc}, this, f65162a, false, 73578, new Class[]{Exception.class}, Void.TYPE);
                    return;
                }
                if (c.this.f65157b != null) {
                    c.this.f65157b.a(exc);
                }
            }

            public final void onFollowSuccess(FollowStatus followStatus) {
                if (PatchProxy.isSupport(new Object[]{followStatus}, this, f65162a, false, 73577, new Class[]{FollowStatus.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{followStatus}, this, f65162a, false, 73577, new Class[]{FollowStatus.class}, Void.TYPE);
                    return;
                }
                if (c.this.f65157b != null) {
                    c.this.f65157b.a(followStatus);
                }
                c.this.f65158c = true;
            }
        });
    }
}

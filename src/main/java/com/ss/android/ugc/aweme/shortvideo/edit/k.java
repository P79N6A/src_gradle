package com.ss.android.ugc.aweme.shortvideo.edit;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.filter.aa;
import com.ss.android.ugc.aweme.filter.as;
import com.ss.android.ugc.aweme.filter.at;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.edit.o;
import com.ss.android.ugc.aweme.shortvideo.filter.b;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;

public final class k implements o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67447a;

    /* renamed from: b  reason: collision with root package name */
    public h f67448b;

    /* renamed from: c  reason: collision with root package name */
    public final cb f67449c;

    /* renamed from: d  reason: collision with root package name */
    public o.a f67450d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f67451e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f67452f;
    private AppCompatActivity g;
    private FrameLayout h;
    private at i;
    private boolean j;
    private final e k;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67447a, false, 76267, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67447a, false, 76267, new Class[0], Void.TYPE);
            return;
        }
        if (this.i == null) {
            this.i = new at.a(this.g, this.h).a(this.k).a((at.d) new at.d() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67453a;

                public final void a(@Nullable h hVar) {
                }

                public final void b(@Nullable h hVar) {
                    if (PatchProxy.isSupport(new Object[]{hVar}, this, f67453a, false, 76268, new Class[]{h.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hVar}, this, f67453a, false, 76268, new Class[]{h.class}, Void.TYPE);
                        return;
                    }
                    if (k.this.f67450d != null) {
                        k.this.f67450d.a();
                    }
                }

                public final void c(@NonNull h hVar) {
                    String str;
                    String str2;
                    if (PatchProxy.isSupport(new Object[]{hVar}, this, f67453a, false, 76269, new Class[]{h.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hVar}, this, f67453a, false, 76269, new Class[]{h.class}, Void.TYPE);
                        return;
                    }
                    k.this.f67448b = hVar;
                    if (k.this.f67450d != null) {
                        k.this.f67450d.a(hVar);
                    }
                    EffectCategoryResponse b2 = a.d().b(hVar);
                    if (b2 == null) {
                        str = "";
                    } else {
                        str = b2.name;
                    }
                    com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                    d a2 = d.a().a("creation_id", k.this.f67449c.creationId).a("shoot_way", k.this.f67449c.mShootWay).a("draft_id", k.this.f67449c.draftId).a("enter_method", "click");
                    if (k.this.f67451e) {
                        str2 = "edit_post_page";
                    } else {
                        str2 = "video_edit_page";
                    }
                    aVar.a("select_filter", a2.a("enter_from", str2).a("filter_name", hVar.f47600d).a("filter_id", hVar.f47598b).a("tab_name", str).f34114b);
                }
            }).a((as) new b(aa.a().f())).a(false).a(this.f67449c.getAvetParameter()).a();
            if (this.f67448b != null) {
                this.i.a(this.f67448b);
            }
        }
        this.i.a();
    }

    public final void a(o.a aVar) {
        this.f67450d = aVar;
    }

    public final void b(boolean z) {
        this.j = true;
    }

    public final void a(boolean z) {
        this.f67452f = true;
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f67447a, false, 76266, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f67447a, false, 76266, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.f67448b = hVar;
        if (this.i != null) {
            this.i.a(hVar);
        }
    }

    public k(AppCompatActivity appCompatActivity, e eVar, FrameLayout frameLayout, h hVar, @NonNull cb cbVar) {
        this.g = appCompatActivity;
        this.k = eVar;
        this.f67448b = hVar;
        this.h = frameLayout;
        this.f67449c = cbVar;
    }
}

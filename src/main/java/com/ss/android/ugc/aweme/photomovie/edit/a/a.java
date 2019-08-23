package com.ss.android.ugc.aweme.photomovie.edit.a;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.filter.aa;
import com.ss.android.ugc.aweme.filter.as;
import com.ss.android.ugc.aweme.filter.at;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.shortvideo.bj;
import com.ss.android.ugc.aweme.shortvideo.edit.n;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.filter.b;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Map;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58880a;

    /* renamed from: b  reason: collision with root package name */
    public AppCompatActivity f58881b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.photomovie.edit.player.a f58882c;

    /* renamed from: d  reason: collision with root package name */
    public h f58883d;

    /* renamed from: e  reason: collision with root package name */
    public View f58884e;

    /* renamed from: f  reason: collision with root package name */
    public n f58885f;
    public JSONObject g;
    private FrameLayout h;
    private at i;

    public final h c() {
        if (PatchProxy.isSupport(new Object[0], this, f58880a, false, 64085, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f58880a, false, 64085, new Class[0], h.class);
        } else if (this.f58883d == null) {
            return w.a(0);
        } else {
            return this.f58883d;
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f58880a, false, 64087, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58880a, false, 64087, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.i == null || this.f58884e.getVisibility() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f58880a, false, 64084, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58880a, false, 64084, new Class[0], Void.TYPE);
            return;
        }
        if (this.i == null) {
            this.i = new at.a(this.f58881b, this.h).a((at.d) new at.d() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58886a;

                public final void a(@Nullable h hVar) {
                }

                public final void b(@Nullable h hVar) {
                    if (PatchProxy.isSupport(new Object[]{hVar}, this, f58886a, false, 64088, new Class[]{h.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hVar}, this, f58886a, false, 64088, new Class[]{h.class}, Void.TYPE);
                        return;
                    }
                    a.this.f58884e.setVisibility(0);
                    if (!fc.a()) {
                        v.a((Activity) a.this.f58881b);
                    }
                    r.a((Context) a.this.f58881b, "filter_confirm", "mid_page", PushConstants.PUSH_TYPE_NOTIFY, 0, a.this.g);
                }

                public final void c(@NonNull h hVar) {
                    String str;
                    h hVar2 = hVar;
                    if (PatchProxy.isSupport(new Object[]{hVar2}, this, f58886a, false, 64089, new Class[]{h.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hVar2}, this, f58886a, false, 64089, new Class[]{h.class}, Void.TYPE);
                        return;
                    }
                    a.this.f58883d = hVar2;
                    a.this.f58882c.a(hVar2.i);
                    if (a.this.f58885f != null) {
                        n nVar = a.this.f58885f;
                        if (PatchProxy.isSupport(new Object[]{hVar2}, nVar, n.f67468a, false, 76280, new Class[]{h.class}, Void.TYPE)) {
                            n nVar2 = nVar;
                            PatchProxy.accessDispatch(new Object[]{hVar2}, nVar2, n.f67468a, false, 76280, new Class[]{h.class}, Void.TYPE);
                        } else {
                            nVar.f67471d = hVar2;
                            nVar.f67473f.a(hVar2);
                        }
                    }
                    EffectCategoryResponse b2 = com.ss.android.ugc.aweme.port.in.a.d().b(a.this.f58883d);
                    if (b2 == null) {
                        str = "";
                    } else {
                        str = b2.name;
                    }
                    r.a("select_filter", (Map) bj.a().a("creation_id", a.this.f58882c.a().creationId).a("shoot_way", a.this.f58882c.a().mShootWay).a("draft_id", a.this.f58882c.a().draftId).a("enter_method", "click").a("filter_name", a.this.f58883d.f47600d).a("filter_id", a.this.f58883d.f47598b).a("tab_name", str).a("content_source", a.this.f58882c.a().getAvetParameter().getContentSource()).a("content_type", a.this.f58882c.a().getAvetParameter().getContentType()).a("enter_from", "video_edit_page").f65805b);
                }
            }).a((as) new b(aa.a().f())).a(this.f58882c.a().getAvetParameter()).a();
            if (this.f58883d != null) {
                this.i.a(this.f58883d);
            }
        }
        this.i.a();
        this.f58884e.setVisibility(8);
    }

    public final void a(n nVar) {
        this.f58885f = nVar;
    }

    public final void a(JSONObject jSONObject) {
        this.g = jSONObject;
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f58880a, false, 64086, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f58880a, false, 64086, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.f58883d = hVar;
        if (this.i != null) {
            this.i.a(this.f58883d);
        }
    }

    public a(@NonNull AppCompatActivity appCompatActivity, @NonNull com.ss.android.ugc.aweme.photomovie.edit.player.a aVar, @NonNull View view, @NonNull FrameLayout frameLayout) {
        this.f58881b = appCompatActivity;
        this.f58882c = aVar;
        this.f58884e = view;
        this.h = frameLayout;
        w.a();
    }
}

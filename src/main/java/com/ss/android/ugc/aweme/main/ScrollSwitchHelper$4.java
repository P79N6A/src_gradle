package com.ss.android.ugc.aweme.main;

import a.i;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.f.j;
import com.ss.android.ugc.aweme.feed.f.l;
import com.ss.android.ugc.aweme.feed.f.u;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.main.bu;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.share.model.b;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import java.util.Map;
import java.util.concurrent.Callable;

class ScrollSwitchHelper$4 implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54275a;

    /* renamed from: b  reason: collision with root package name */
    int f54276b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DetailFragmentPanel f54277c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f54278d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ bu.b f54279e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ f f54280f;
    final /* synthetic */ bu g;
    private boolean h;

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.h = false;
        }
    }

    public void onPageSelected(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String aid;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54275a, false, 57707, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54275a, false, 57707, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f54277c != null) {
            this.f54277c.b(i2);
        }
        String a2 = this.g.a(i2);
        bu buVar = this.g;
        if (PatchProxy.isSupport(new Object[]{a2}, buVar, bu.f54648a, false, 57675, new Class[]{String.class}, Void.TYPE)) {
            bu buVar2 = buVar;
            PatchProxy.accessDispatch(new Object[]{a2}, buVar2, bu.f54648a, false, 57675, new Class[]{String.class}, Void.TYPE);
        } else if (a.a() && buVar.g != null && !buVar.g.getIsPreloadScroll() && TextUtils.equals(a2, "page_profile")) {
            buVar.g.setIsPreloadScroll(true);
            i.a((Callable<TResult>) new Callable<Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54658a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f54658a, false, 57708, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f54658a, false, 57708, new Class[0], Object.class);
                    }
                    AwemeApi.a(true, bu.this.g.getAuthorUid(), bu.this.g.getAuthor().getSecUid(), 0, 0, 20, "profile_preload");
                    return null;
                }
            });
        }
        bu buVar3 = this.g;
        String str6 = this.g.f54649b;
        if (PatchProxy.isSupport(new Object[]{str6}, buVar3, bu.f54648a, false, 57671, new Class[]{String.class}, Boolean.TYPE)) {
            bu buVar4 = buVar3;
            ((Boolean) PatchProxy.accessDispatch(new Object[]{str6}, buVar4, bu.f54648a, false, 57671, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (d.a().isLogin()) {
            boolean equals = TextUtils.equals(str6, d.a().getCurUserId());
        }
        if (i2 == 0) {
            bg.a(new com.ss.android.ugc.aweme.share.model.a());
        }
        if (i2 == 1) {
            bg.a(new b());
        }
        int i3 = this.f54276b;
        this.f54276b = i2;
        if (TextUtils.isEmpty(a.c.f33273e)) {
            a.c.f33270b = a2;
        }
        if (!TextUtils.equals(a2, "page_home")) {
            ag.i().h();
        }
        if (this.g.m != null && !this.g.f54651d) {
            this.g.m.a(i2);
        }
        if (!TextUtils.equals(a2, "page_home")) {
            if (!o.v()) {
                o.b().h();
            } else {
                com.ss.android.ugc.playerkit.videoview.a.a().T();
            }
            com.ss.android.ugc.aweme.video.d.b().c();
        }
        char c2 = 65535;
        int hashCode = a2.hashCode();
        if (hashCode != -1571965031) {
            if (hashCode != 185242617) {
                if (hashCode == 883526799 && a2.equals("page_home")) {
                    c2 = 1;
                }
            } else if (a2.equals("page_profile")) {
                c2 = 2;
            }
        } else if (a2.equals("page_discover")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
                bg.a(new j());
                if (!o.v()) {
                    o.b().h();
                } else {
                    com.ss.android.ugc.playerkit.videoview.a.a().T();
                }
                if (this.g.h != null) {
                    this.g.h.a(i2);
                }
                if (!TextUtils.equals(this.g.a(i3), "page_discover")) {
                    if (TextUtils.equals(this.g.l, "FROM_CLICK")) {
                        str = "click_discovery_button";
                    } else {
                        str = "slide_right";
                    }
                    this.g.l = "";
                    com.ss.android.ugc.aweme.discover.mob.b.a(this.g.f54652e, str);
                    if (com.ss.android.g.a.a()) {
                        z.a(z.c.DISCOVER);
                        break;
                    }
                }
                break;
            case 1:
                if (this.g.h != null) {
                    this.g.h.a(i2);
                }
                if (this.f54279e != null) {
                    this.f54279e.b();
                }
                if (!com.ss.android.g.a.a() && TextUtils.equals("page_profile", this.g.a(i3)) && TextUtils.equals("homepage_hot", this.g.f54652e)) {
                    String str7 = this.g.f54652e;
                    String m = aa.m(this.g.g);
                    String a3 = aa.a(this.g.g);
                    if (!PatchProxy.isSupport(new Object[]{str7, m, a3}, null, com.ss.android.ugc.aweme.main.i.a.f54842a, true, 58184, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                        r.onEvent(MobClick.obtain().setEventName("leave_others_homepage").setLabelName(str7).setJsonObject(c.a().a("group_id", m).a("author_id", a3).b()));
                        r.a("leave_others_homepage", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", m).a("author_id", a3).f34114b);
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[]{str7, m, a3}, null, com.ss.android.ugc.aweme.main.i.a.f54842a, true, 58184, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                        break;
                    }
                }
            case 2:
                bg.a(new j());
                if (this.g.h != null) {
                    this.g.h.a(i2);
                }
                if (this.f54279e != null) {
                    this.f54279e.a();
                }
                if (this.f54280f.getCurrentAweme() != null) {
                    t tVar = new t();
                    tVar.a("enter_from", this.g.f54652e);
                    if (!this.g.f54651d) {
                        Context context = this.g.j.getContext();
                        String lastUserId = this.f54280f.getLastUserId();
                        if (this.f54280f.getCurrentAweme() == null) {
                            aid = "";
                        } else {
                            aid = this.f54280f.getCurrentAweme().getAid();
                        }
                        r.a(context, "slide_left", "left", lastUserId, aid, tVar.a());
                        ((q) new q().b(this.g.f54652e).a("slide_left")).f(this.f54280f.getPlayListIdKey()).g(this.f54280f.getPlayListId()).e(this.f54280f.getPlayListType()).b(this.f54280f.getCurrentAweme(), 0).k(this.f54280f.getLastUserId()).l(this.g.f54653f).e();
                        z.a(z.c.PROFILE);
                    }
                    if (this.f54280f.getCurrentAweme() == null) {
                        str2 = "";
                    } else {
                        str2 = this.f54280f.getCurrentAweme().getAid();
                    }
                    tVar.a("group_id", str2);
                    tVar.a("enter_method", "slide_left");
                    tVar.a("request_id", this.g.f54653f);
                    tVar.a("enter_type", "normal_way");
                    if (!TextUtils.isEmpty(aa.e(this.f54280f.getCurrentAweme()))) {
                        tVar.a("poi_id", aa.e(this.f54280f.getCurrentAweme()));
                    }
                    if (aa.c(this.g.f54652e)) {
                        tVar.a("city_info", aa.a());
                        tVar.a("distance_info", aa.i(this.f54280f.getCurrentAweme()));
                        tVar.a("poi_type", aa.h(this.f54280f.getCurrentAweme()));
                        tVar.a("poi_channel", aa.b());
                    }
                    MobClick labelName = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage");
                    if (this.f54280f.getCurrentAweme() == null) {
                        str3 = "";
                    } else {
                        str3 = this.f54280f.getCurrentAweme().getAuthor().getUid();
                    }
                    r.onEvent(labelName.setValue(str3).setJsonObject(tVar.a()));
                    if (!com.ss.android.g.a.a()) {
                        com.ss.android.ugc.aweme.app.d.d a4 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage");
                        if (this.f54280f.getCurrentAweme() == null) {
                            str4 = "";
                        } else {
                            str4 = this.f54280f.getCurrentAweme().getAuthor().getUid();
                        }
                        com.ss.android.ugc.aweme.app.d.d a5 = a4.a("to_user_id", str4).a("enter_method", "slide_left");
                        if (this.f54280f.getCurrentAweme() == null) {
                            str5 = "";
                        } else {
                            str5 = this.f54280f.getCurrentAweme().getAid();
                        }
                        r.a("enter_personal_detail_backup", (Map) a5.a("group_id", str5).f34114b);
                    }
                }
                if (com.ss.android.g.a.a()) {
                    z.a(z.c.PROFILE);
                }
                this.g.f54651d = false;
                break;
        }
        if (this.g.f54650c != null) {
            this.g.j.getCurrentItem();
        }
        if (TextUtils.equals("page_home", this.g.a(i3)) && (this.g.i instanceof MainActivity)) {
            ((MainActivity) this.g.i).hideAutoPlayTab();
        }
    }

    public void onPageScrolled(int i, float f2, int i2) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f54275a, false, 57706, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f54275a, false, 57706, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f54277c != null) {
            this.f54277c.a(i, f2, i4);
        }
        if (i3 == this.g.k.c("page_home")) {
            if (!this.h) {
                this.h = true;
                bg.a(new j());
                bg.a(new l());
                bg.a(new com.ss.android.ugc.aweme.profile.a.b());
                bg.a(new com.ss.android.ugc.aweme.profile.a.a());
            }
            if (i4 > this.f54278d) {
                if (this.f54277c != null) {
                    this.f54277c.c(false);
                }
            } else if (this.f54277c != null) {
                this.f54277c.c(true);
            }
            bg.a(new u(false));
        }
    }

    ScrollSwitchHelper$4(bu buVar, DetailFragmentPanel detailFragmentPanel, int i, bu.b bVar, f fVar) {
        this.g = buVar;
        this.f54277c = detailFragmentPanel;
        this.f54278d = i;
        this.f54279e = bVar;
        this.f54280f = fVar;
    }
}

package com.ss.android.ugc.aweme.poi.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.favorites.c.a;
import com.ss.android.ugc.aweme.favorites.c.b;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.music.a.h;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.poi.c.a;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.widget.c;
import com.ss.android.ugc.aweme.utils.bg;

public class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60808a;

    /* renamed from: b  reason: collision with root package name */
    public AbsFragment f60809b;

    /* renamed from: c  reason: collision with root package name */
    PoiStruct f60810c;

    /* renamed from: d  reason: collision with root package name */
    c f60811d;

    /* renamed from: e  reason: collision with root package name */
    View f60812e;

    /* renamed from: f  reason: collision with root package name */
    boolean f60813f;
    public l g;
    private CheckableImageView[] h;
    private a i = new a();
    private boolean j;

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60808a, false, 66013, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60808a, false, 66013, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        e();
        c();
    }

    private void e() {
        this.j = !this.j;
    }

    public j() {
        this.i.a(this);
    }

    public final Activity a() {
        if (!PatchProxy.isSupport(new Object[0], this, f60808a, false, 66006, new Class[0], Activity.class)) {
            return this.f60809b.getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f60808a, false, 66006, new Class[0], Activity.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60808a, false, 66015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60808a, false, 66015, new Class[0], Void.TYPE);
            return;
        }
        if (this.f60811d != null && this.f60811d.isShowing()) {
            this.f60811d.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60808a, false, 66008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60808a, false, 66008, new Class[0], Void.TYPE);
        } else if (this.f60810c != null) {
            this.i.a(4, this.f60810c.getPoiId(), Integer.valueOf(true ^ this.j ? 1 : 0));
            e();
            if (this.h != null) {
                for (CheckableImageView checkableImageView : this.h) {
                    checkableImageView.a(checkableImageView.getAlpha());
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60808a, false, 66010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60808a, false, 66010, new Class[0], Void.TYPE);
        } else if (this.h != null) {
            for (CheckableImageView checkableImageView : this.h) {
                Object tag = checkableImageView.getTag(C0906R.id.aqv);
                int i2 = 2130839385;
                if (tag == null || !(tag instanceof Boolean) || !((Boolean) tag).booleanValue()) {
                    if (!this.j) {
                        i2 = 2130838850;
                    }
                    checkableImageView.setImageResource(i2);
                } else {
                    if (!this.j) {
                        i2 = 2130839852;
                    }
                    checkableImageView.setImageResource(i2);
                }
            }
        }
    }

    private void f() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f60808a, false, 66011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60808a, false, 66011, new Class[0], Void.TYPE);
        } else if (this.f60810c != null) {
            a.C0670a c2 = new a.C0670a().a("poi_page").b(this.f60810c.getPoiId()).c(this.f60810c.getTypeCode());
            if (this.g != null) {
                str = this.g.awemeid;
            } else {
                str = "";
            }
            a.C0670a d2 = c2.d(str);
            if (this.g != null) {
                str2 = this.g.from;
            } else {
                str2 = "";
            }
            com.ss.android.ugc.aweme.poi.c.a a2 = d2.e(str2).a(this.f60810c).f("click_button").a();
            if (this.j) {
                com.ss.android.ugc.aweme.poi.c.b.b(a2);
                g.j(a(), com.ss.android.ugc.aweme.commercialize.feed.j.a().a(this.g.awemeid), this.f60810c.getPoiId());
            } else {
                com.ss.android.ugc.aweme.poi.c.b.a(a2);
                g.i(a(), com.ss.android.ugc.aweme.commercialize.feed.j.a().a(this.g.awemeid), this.f60810c.getPoiId());
            }
            if (this.g != null && ((TextUtils.equals(this.g.from, "search_result") || TextUtils.equals(this.g.from, "general_search")) && !this.j)) {
                com.ss.android.ugc.aweme.discover.mob.j.f42669b.b("search_favourite", "poi_page", this.f60810c.getPoiId(), TextUtils.equals(this.g.from, "search_result"));
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60808a, false, 66009, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60808a, false, 66009, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f60810c != null) {
            if (i2 == 0) {
                this.j = false;
            } else {
                this.j = true;
            }
            this.f60810c.setCollectStatus(i2);
            c();
        }
    }

    public final void a(BaseResponse baseResponse) {
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f60808a, false, 66012, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f60808a, false, 66012, new Class[]{BaseResponse.class}, Void.TYPE);
            return;
        }
        if (this.j) {
            this.f60810c.setCollectStatus(1);
            bg.a(new h(1, this.f60810c));
            if (PatchProxy.isSupport(new Object[0], this, f60808a, false, 66014, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60808a, false, 66014, new Class[0], Void.TYPE);
            } else {
                if (this.f60812e != null) {
                    this.f60812e.post(new l(this));
                }
            }
        } else {
            this.f60810c.setCollectStatus(0);
            bg.a(new h(0, this.f60810c));
            d();
        }
    }

    public final void a(View view, boolean z) {
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60808a, false, 66007, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f60808a, false, 66007, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        f();
        if (!d.a().isLogin()) {
            e.a(a(), "poi_page", "click_favorite_poi", (f) new k(this));
            return;
        }
        this.f60812e = view;
        this.f60813f = z;
        b();
    }

    public final void a(AbsFragment absFragment, CheckableImageView... checkableImageViewArr) {
        if (PatchProxy.isSupport(new Object[]{absFragment, checkableImageViewArr}, this, f60808a, false, 66002, new Class[]{AbsFragment.class, CheckableImageView[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absFragment, checkableImageViewArr}, this, f60808a, false, 66002, new Class[]{AbsFragment.class, CheckableImageView[].class}, Void.TYPE);
            return;
        }
        this.f60809b = absFragment;
        this.h = checkableImageViewArr;
        if (this.h != null) {
            for (CheckableImageView onStateChangeListener : this.h) {
                onStateChangeListener.setOnStateChangeListener(new CheckableImageView.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f60814a;

                    public final void a() {
                    }

                    public final void a(int i) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60814a, false, 66020, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60814a, false, 66020, new Class[]{Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i == 1) {
                            j.this.c();
                        }
                    }
                });
            }
        }
    }

    public final void a(View view, PoiDetail poiDetail, boolean z) {
        if (PatchProxy.isSupport(new Object[]{view, poiDetail, (byte) 0}, this, f60808a, false, 66005, new Class[]{View.class, PoiDetail.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, poiDetail, (byte) 0}, this, f60808a, false, 66005, new Class[]{View.class, PoiDetail.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (poiDetail != null) {
            this.f60810c = poiDetail.getPoiStruct();
            this.j = poiDetail.isCollected();
            c();
        }
    }
}

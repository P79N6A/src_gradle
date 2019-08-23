package com.ss.android.ugc.aweme.poi.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.f.b;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.aa;
import com.ss.android.ugc.aweme.poi.model.an;
import com.ss.android.ugc.aweme.poi.model.t;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class h<M extends aa> extends b<M, i> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3760a;

    /* renamed from: b  reason: collision with root package name */
    protected a f3761b;
    private String s = "poi_page";

    public interface a {
        boolean a(PoiDetail poiDetail);

        Fragment m();

        void o();

        void v();
    }

    public final String a(boolean z) {
        return "poi_page";
    }

    public String getEventType() {
        return this.s;
    }

    public final Fragment c() {
        if (!PatchProxy.isSupport(new Object[0], this, f3760a, false, 65978, new Class[0], Fragment.class)) {
            return this.f3761b.m();
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f3760a, false, 65978, new Class[0], Fragment.class);
    }

    public final String n() {
        if (PatchProxy.isSupport(new Object[0], this, f3760a, false, 65965, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f3760a, false, 65965, new Class[0], String.class);
        } else if (this.f3761b != null) {
            return ((AbsPoiAwemeFeedFragment) this.f3761b.m()).n();
        } else {
            return "";
        }
    }

    public boolean s() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3760a, false, 65970, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3760a, false, 65970, new Class[0], Boolean.TYPE)).booleanValue();
        }
        t b2 = ((aa) this.f2978e).b();
        if (b2 != null && b2.isValid()) {
            z = true;
        }
        return z;
    }

    public t t() {
        if (!PatchProxy.isSupport(new Object[0], this, f3760a, false, 65971, new Class[0], t.class)) {
            return ((aa) this.f2978e).b();
        }
        return (t) PatchProxy.accessDispatch(new Object[0], this, f3760a, false, 65971, new Class[0], t.class);
    }

    public void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3760a, false, 65966, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3760a, false, 65966, new Class[0], Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null && ((i) this.f2979f).isViewValid()) {
            if (this.f3761b != null) {
                if (d()) {
                    this.f3761b.o();
                }
                if (c().getActivity() != null) {
                    a((Activity) c().getActivity());
                }
            }
            int i = ((aa) this.f2978e).mListQueryType;
            if (i != 1) {
                switch (i) {
                    case 4:
                    case 5:
                        i iVar = (i) this.f2979f;
                        List<com.ss.android.ugc.aweme.newfollow.e.b> items = ((aa) this.f2978e).getItems();
                        if (((aa) this.f2978e).isHasMore() && !((aa) this.f2978e).isNewDataEmpty()) {
                            z = true;
                        }
                        iVar.b(items, z);
                        break;
                }
            } else if (((aa) this.f2978e).isDataEmpty()) {
                ((i) this.f2979f).a(1);
            } else {
                if (this.f3761b != null) {
                    this.f3761b.v();
                    List<com.ss.android.ugc.aweme.newfollow.e.b> items2 = ((aa) this.f2978e).getItems();
                    if (!CollectionUtils.isEmpty(items2)) {
                        com.ss.android.ugc.aweme.newfollow.e.b bVar = items2.get(0);
                        if (bVar instanceof PoiDetail) {
                            PoiDetail poiDetail = (PoiDetail) bVar;
                            this.f3761b.a(poiDetail);
                            ((i) this.f2979f).a(poiDetail);
                        }
                    }
                }
                ((i) this.f2979f).a(((aa) this.f2978e).getItems(), ((aa) this.f2978e).isHasMore());
            }
        }
    }

    public boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3760a, false, 65968, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3760a, false, 65968, new Class[0], Boolean.TYPE)).booleanValue();
        }
        an a2 = ((aa) this.f2978e).a();
        if (a2 != null && a2.getException() == null && s()) {
            z = true;
        }
        return z;
    }

    public h(a aVar) {
        if (aVar != null) {
            this.f3761b = aVar;
            return;
        }
        throw new IllegalArgumentException("PoiAwemeFeedPresenter should be attached to any Fragment");
    }

    public void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f3760a, false, 65969, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f3760a, false, 65969, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (((aa) this.f2978e).getData() != null) {
            an a2 = ((aa) this.f2978e).a();
            if (!(a2 == null || a2.getException() == null)) {
                com.ss.android.ugc.aweme.app.api.a.a.a((Context) activity, (Throwable) a2.getException());
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.forward.c.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3760a, false, 65977, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3760a, false, 65977, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && aVar.f48271e == 1) {
            if (aVar.f48272f == hashCode()) {
                Aweme aweme = aVar.f48270d;
                if (this.p) {
                    str = "click_repost_button";
                } else {
                    str = "click_comment";
                }
                com.ss.android.ugc.aweme.forward.e.a.a("poi_page", aweme, "list", str, true);
            }
            if (this.m != null) {
                this.m.g();
            }
        }
    }

    public void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3760a, false, 65967, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3760a, false, 65967, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null && ((i) this.f2979f).isViewValid()) {
            ((i) this.f2979f).b(false);
            int i = ((aa) this.f2978e).mListQueryType;
            if (i != 1) {
                switch (i) {
                    case 4:
                        ((i) this.f2979f).c(1);
                        return;
                    case 5:
                        ((i) this.f2979f).c(5);
                        break;
                }
                return;
            }
            ((i) this.f2979f).a(1);
        }
    }

    public final void a(View view, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{view, aweme2}, this, f3760a, false, 65975, new Class[]{View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aweme2}, this, f3760a, false, 65975, new Class[]{View.class, Aweme.class}, Void.TYPE);
            return;
        }
        super.a(view, aweme);
        com.ss.android.ugc.aweme.newfollow.g.a.b(aweme2, "poi_page", "list");
    }

    public final void d(View view, View view2, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2}, this, f3760a, false, 65974, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2}, this, f3760a, false, 65974, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
        } else if (aweme2 != null) {
            ((i) this.f2979f).a(true, aweme2);
            if (this.h != null) {
                this.h.b(new ar(24, aweme2), "click_video_tag", "video_cart_tag", this.s);
                com.ss.android.ugc.aweme.newfollow.g.a.d(aweme2, "poi_page");
            }
        }
    }

    public final void a(Aweme aweme, String str, String str2) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str4}, this, f3760a, false, 65976, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, str4}, this, f3760a, false, 65976, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
            FragmentActivity activity = c().getActivity();
            a2.a((Activity) activity, j.a("aweme://user/profile/" + aweme.getAuthorUid()).a("enter_from", "poi_page").a("sec_user_id", str4).a());
            com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, "click_comment_head", str3);
        }
    }

    public final void b(View view, View view2, Aweme aweme, User user) {
        Aweme aweme2 = aweme;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f3760a, false, 65973, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
            Object[] objArr = {view, view2, aweme2, user2};
            PatchProxy.accessDispatch(objArr, this, f3760a, false, 65973, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.b(aweme2, user2, r(), a(true))) {
            com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, "click_name", com.ss.android.ugc.aweme.u.aa.a(user));
        }
    }

    public final void a(View view, View view2, Aweme aweme, User user) {
        Aweme aweme2 = aweme;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f3760a, false, 65972, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
            Object[] objArr = {view, view2, aweme2, user2};
            PatchProxy.accessDispatch(objArr, this, f3760a, false, 65972, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.a(aweme2, user2, r(), a(true))) {
            if (com.ss.android.ugc.aweme.newfollow.a.b.a(user)) {
                if (PatchProxy.isSupport(new Object[]{aweme2}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61390, new Class[]{Aweme.class}, Void.TYPE)) {
                    Object[] objArr2 = {aweme2};
                    PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61390, new Class[]{Aweme.class}, Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "poi_page");
                    hashMap.put("request_id", com.ss.android.ugc.aweme.u.aa.c(aweme));
                    hashMap.put("position", "poi_page");
                    hashMap.put("host_value", com.ss.android.ugc.aweme.u.aa.a(aweme));
                    hashMap.put("room_value", com.ss.android.ugc.aweme.u.aa.b(aweme));
                    r.a("live_play", (Map) hashMap);
                }
            } else {
                com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, "click_head", com.ss.android.ugc.aweme.u.aa.a(user));
            }
        }
    }
}

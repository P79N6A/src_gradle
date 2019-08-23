package com.ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.model.a;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.story.live.f;
import com.ss.android.ugc.aweme.story.live.g;
import com.ss.android.ugc.aweme.story.model.Story;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends com.ss.android.ugc.aweme.base.mvvm.impl.a<StoryFeedItemView> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f54932c = null;

    /* renamed from: d  reason: collision with root package name */
    public static final String f54933d = "b";

    /* renamed from: e  reason: collision with root package name */
    public String f54934e = "";

    /* renamed from: f  reason: collision with root package name */
    public boolean f54935f = true;
    public long g;
    public com.ss.android.ugc.aweme.base.model.a h;
    public CharSequence i;
    public View.OnClickListener j;
    public com.ss.android.ugc.aweme.main.story.a.a k;
    public a l;
    public int m;
    private c n;

    public enum a {
        NEW,
        DOWNLOADING,
        READ,
        LIVE,
        FOLLOWING_NEW,
        FOLLOWING_READ;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final String f() {
        return this.k.f54907b;
    }

    public final boolean d() {
        if (this.l == a.LIVE) {
            return true;
        }
        return false;
    }

    public final String h() {
        if (this.f54935f) {
            return "toplist_homepage_follow";
        }
        String str = this.n.i;
        if (str == null) {
            return "toplist_homepage_hot";
        }
        return str;
    }

    public final boolean e() {
        if (this.l == a.FOLLOWING_NEW || this.l == a.FOLLOWING_READ) {
            return true;
        }
        return false;
    }

    public final String g() {
        if (PatchProxy.isSupport(new Object[0], this, f54932c, false, 58215, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f54932c, false, 58215, new Class[0], String.class);
        } else if (d()) {
            return this.k.f54907b.replace("live", "");
        } else {
            return this.k.f54907b;
        }
    }

    private void i() {
        com.ss.android.ugc.aweme.base.model.a aVar;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f54932c, false, 58207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54932c, false, 58207, new Class[0], Void.TYPE);
        } else if (this.k.a() != null) {
            final Story story = this.k.a().f73233b;
            final User userInfo = story.getUserInfo();
            UrlModel avatarThumb = userInfo.getAvatarThumb();
            if (PatchProxy.isSupport(new Object[]{avatarThumb}, null, com.ss.android.ugc.aweme.base.model.a.f34764a, true, 24661, new Class[]{UrlModel.class}, com.ss.android.ugc.aweme.base.model.a.class)) {
                aVar = (com.ss.android.ugc.aweme.base.model.a) PatchProxy.accessDispatch(new Object[]{avatarThumb}, null, com.ss.android.ugc.aweme.base.model.a.f34764a, true, 24661, new Class[]{UrlModel.class}, com.ss.android.ugc.aweme.base.model.a.class);
            } else {
                aVar = new com.ss.android.ugc.aweme.base.model.a(a.C0448a.URL_MODEL, avatarThumb);
            }
            this.h = aVar;
            if (!TextUtils.isEmpty(userInfo.getRemarkName())) {
                str = userInfo.getRemarkName();
            } else {
                str = userInfo.getNickname();
            }
            this.i = str;
            switch (this.l) {
                case LIVE:
                    this.g = userInfo.roomId;
                    this.m = story.type;
                    this.j = new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54936a;

                        public final void onClick(View view) {
                            int i;
                            int i2;
                            String str;
                            if (PatchProxy.isSupport(new Object[]{view}, this, f54936a, false, 58217, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f54936a, false, 58217, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            Rect b2 = v.b(view);
                            String h = b.this.h();
                            if (userInfo != null) {
                                userInfo.setRequestId(b.this.f54934e);
                            }
                            Context context = view.getContext();
                            User user = userInfo;
                            List<Story> list = b.this.k.f54908c.f73243e;
                            if (b.this.f54935f) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            boolean z = b.this.k.f54908c.f73244f;
                            if (story == null) {
                                i2 = 1;
                            } else {
                                i2 = story.type;
                            }
                            Object[] objArr = {context, user, b2, list, h, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)};
                            if (PatchProxy.isSupport(objArr, null, f.f73134a, true, 84722, new Class[]{Context.class, User.class, Rect.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                                Object[] objArr2 = {context, user, b2, list, h, Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2)};
                                Object[] objArr3 = objArr2;
                                PatchProxy.accessDispatch(objArr3, null, f.f73134a, true, 84722, new Class[]{Context.class, User.class, Rect.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                            } else if (!(context == null || user == null)) {
                                com.ss.android.ugc.aweme.story.live.b.a(context, 1, user.getRequestId(), user.getUid(), user.roomId, h);
                                g gVar = new g(context);
                                Object[] objArr4 = {user, b2, list, h, Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2)};
                                if (PatchProxy.isSupport(objArr4, gVar, g.f73135a, false, 84747, new Class[]{User.class, Rect.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                                    Object[] objArr5 = {user, b2, list, h, Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2)};
                                    Object[] objArr6 = objArr5;
                                    g gVar2 = gVar;
                                    PatchProxy.accessDispatch(objArr6, gVar2, g.f73135a, false, 84747, new Class[]{User.class, Rect.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                                } else {
                                    c a2 = c.a();
                                    c.a a3 = new c.a(gVar.f73136b, user).b(h).c("others_photo").a(list).a(b2).a("live.intent.extra.REQUEST_ID", user.getRequestId()).a("pageId", String.valueOf(i)).a("hasMore", String.valueOf(z));
                                    if (AbTestManager.a().aH()) {
                                        str = "true";
                                    } else {
                                        str = "false";
                                    }
                                    a2.a(a3.a("isMulti", str).a("roomType", String.valueOf(i2)));
                                }
                            }
                            org.greenrobot.eventbus.c.a().d(new com.ss.android.ugc.aweme.main.c.b(1));
                        }
                    };
                    return;
                case FOLLOWING_NEW:
                case FOLLOWING_READ:
                    this.j = new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54940a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f54940a, false, 58218, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f54940a, false, 58218, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            b.this.l = a.FOLLOWING_READ;
                            b.this.b();
                            b.this.a(view);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("order", b.this.c());
                            } catch (JSONException unused) {
                            }
                            r.onEvent(MobClick.obtain().setEventName("head_click").setLabelName("toplist").setValue(b.this.f()).setJsonObject(jSONObject));
                        }
                    };
                    return;
                default:
                    this.j = new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54942a;

                        public final void onClick(View view) {
                            boolean z;
                            boolean z2;
                            if (PatchProxy.isSupport(new Object[]{view}, this, f54942a, false, 58219, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f54942a, false, 58219, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (b.this.l != a.READ) {
                                com.ss.android.ugc.aweme.story.model.a a2 = b.this.k.a();
                                if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.story.model.a.f73232a, false, 84793, new Class[0], Boolean.TYPE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.story.model.a.f73232a, false, 84793, new Class[0], Boolean.TYPE)).booleanValue();
                                } else {
                                    if (a2.f73234c != null) {
                                        if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.story.model.a.f73232a, false, 84794, new Class[0], Boolean.TYPE)) {
                                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.story.model.a.f73232a, false, 84794, new Class[0], Boolean.TYPE)).booleanValue();
                                        } else if (a2.f73234c == null || !a2.f73234c.needDownloadFirstCover()) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (!z2) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                if (!z) {
                                    b.this.l = a.DOWNLOADING;
                                    b.this.b();
                                    return;
                                }
                            }
                            b bVar = b.this;
                            if (PatchProxy.isSupport(new Object[]{view}, bVar, b.f54932c, false, 58211, new Class[]{View.class}, Void.TYPE)) {
                                Object[] objArr = {view};
                                b bVar2 = bVar;
                                ChangeQuickRedirect changeQuickRedirect = b.f54932c;
                                PatchProxy.accessDispatch(objArr, bVar2, changeQuickRedirect, false, 58211, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            com.ss.android.b.a.a.a.a(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f54946a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f54946a, false, 58221, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f54946a, false, 58221, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    b.this.l = a.READ;
                                    b.this.b();
                                }
                            }, 2000);
                            Story story = bVar.k.a().f73233b;
                            h a3 = h.a();
                            a3.a("aweme://aweme/detail/" + ((Aweme) story.getAwemes().get(0)).getAid());
                        }
                    };
                    return;
            }
        }
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f54932c, false, 58209, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f54932c, false, 58209, new Class[0], Integer.TYPE)).intValue();
        } else if (this.n == null) {
            return -1;
        } else {
            c cVar = this.n;
            String f2 = f();
            if (PatchProxy.isSupport(new Object[]{f2}, cVar, c.f54949c, false, 58260, new Class[]{String.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{f2}, cVar, c.f54949c, false, 58260, new Class[]{String.class}, Integer.TYPE)).intValue();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < cVar.f54951e.d(); i3++) {
                String a2 = cVar.f54951e.a(i3);
                if (cVar.f54951e.a(a2).f73233b.isFollowing()) {
                    i2++;
                    if (com.ss.android.ugc.aweme.base.utils.a.a(f2, a2)) {
                        return i2;
                    }
                }
            }
            return -1;
        }
    }

    public final void a(a aVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54932c, false, 58214, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f54932c, false, 58214, new Class[]{a.class}, Void.TYPE);
        } else if (this.l != aVar) {
            a aVar2 = this.l;
            boolean d2 = d();
            boolean e2 = e();
            this.l = aVar;
            boolean d3 = d();
            boolean e3 = e();
            if (d2 != d3) {
                z = true;
            } else {
                z = false;
            }
            if (e2 != e3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (aVar2 != null && !z && !z2) {
                z3 = false;
            }
            if (z3) {
                i();
            }
        }
    }

    public final void a(View view) {
        List list;
        com.ss.android.ugc.aweme.common.f.a aVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54932c, false, 58208, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54932c, false, 58208, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54944a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f54944a, false, 58220, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54944a, false, 58220, new Class[0], Void.TYPE);
                    return;
                }
                b.this.l = a.FOLLOWING_READ;
                b.this.b();
            }
        }, 2000);
        if (!(this.n == null || this.k == null)) {
            c cVar = this.n;
            Context context = view.getContext();
            String str = this.k.f54907b;
            if (PatchProxy.isSupport(new Object[]{context, str}, cVar, c.f54949c, false, 58258, new Class[]{Context.class, String.class}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{context, str}, cVar2, c.f54949c, false, 58258, new Class[]{Context.class, String.class}, Void.TYPE);
                return;
            }
            try {
                boolean isRead = cVar.f54951e.a(str).f73233b.isRead();
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(isRead ? (byte) 1 : 0)}, cVar, c.f54949c, false, 58259, new Class[]{Boolean.TYPE}, List.class)) {
                    c cVar3 = cVar;
                    list = (List) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(isRead)}, cVar3, c.f54949c, false, 58259, new Class[]{Boolean.TYPE}, List.class);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < cVar.f54951e.d(); i2++) {
                        String a2 = cVar.f54951e.a(i2);
                        Story story = cVar.f54951e.a(a2).f73233b;
                        if (story.isFollowing() && (isRead || !story.isRead())) {
                            arrayList.addAll(cVar.f54951e.a(a2).f73234c.getAwemeList());
                        }
                    }
                    list = arrayList;
                }
                if (PatchProxy.isSupport(new Object[0], cVar, c.f54949c, false, 58263, new Class[0], com.ss.android.ugc.aweme.common.f.a.class)) {
                    aVar = (com.ss.android.ugc.aweme.common.f.a) PatchProxy.accessDispatch(new Object[0], cVar, c.f54949c, false, 58263, new Class[0], com.ss.android.ugc.aweme.common.f.a.class);
                } else {
                    aVar = new com.ss.android.ugc.aweme.common.f.a<Aweme, Object>() {

                        /* renamed from: a  reason: collision with root package name */
                        List<Aweme> f54953a;

                        public final boolean checkParams(Object... objArr) {
                            return false;
                        }

                        public final boolean isHasMore() {
                            return false;
                        }

                        public final void loadMoreList(Object... objArr) {
                        }

                        public final void refreshList(Object... objArr) {
                        }

                        public final List getItems() {
                            return this.f54953a;
                        }

                        public final void setItems(List<Aweme> list) {
                            this.f54953a = list;
                        }
                    };
                }
                aVar.setItems(list);
                com.ss.android.ugc.aweme.feed.a.a().f44610c = aVar;
                String a3 = cVar.a(list, str);
                int b2 = cVar.b(list, str);
                h a4 = h.a();
                a4.a(j.a("aweme://aweme/detail/" + a3).a("refer", "toplist_friend").a("video_from", "from_window_following").a("profile_enterprise_type", b2).a());
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
        }
    }

    public b(com.ss.android.ugc.aweme.main.story.a.a aVar, c cVar, String str) {
        a aVar2;
        this.k = aVar;
        this.n = cVar;
        if (PatchProxy.isSupport(new Object[0], this, f54932c, false, 58212, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54932c, false, 58212, new Class[0], Void.TYPE);
        } else if (this.k != null) {
            if (PatchProxy.isSupport(new Object[0], this, f54932c, false, 58213, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54932c, false, 58213, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.story.model.a a2 = this.k.a();
                if (a2 == null) {
                    com.ss.android.ugc.aweme.framework.a.a.a("loadCommonStatus() called, with appstory = [null], mModel.getUid() = [" + this.k.f54907b + "], UserManager.inst().getCurUserId() = [" + d.a().getCurUserId() + "]");
                } else if (a2.f73233b.isLive()) {
                    a(a.LIVE);
                } else if (a2.f73233b.isFollowing()) {
                    if (a2.f73233b.isRead()) {
                        aVar2 = a.FOLLOWING_READ;
                    } else {
                        aVar2 = a.FOLLOWING_NEW;
                    }
                    a(aVar2);
                } else if (a2.f73233b.isRead()) {
                    a(a.READ);
                } else {
                    a(a.NEW);
                }
            }
        }
        this.f54934e = str;
    }
}

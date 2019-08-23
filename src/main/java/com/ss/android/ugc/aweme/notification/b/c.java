package com.ss.android.ugc.aweme.notification.b;

import a.i;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.message.c.a;
import com.ss.android.ugc.aweme.message.model.NoticeCountMessage;
import com.ss.android.ugc.aweme.message.model.StrangerNoticeMessage;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.d;
import com.ss.android.ugc.aweme.notification.c.h;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3697a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.notification.view.c f3698b;

    public static void i() {
        if (PatchProxy.isSupport(new Object[0], null, f3697a, true, 63159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f3697a, true, 63159, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            com.ss.android.ugc.aweme.notification.d.a.a().a((a.d) new a.d() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57962a;

                public final void a(d dVar) {
                    d dVar2 = dVar;
                    if (PatchProxy.isSupport(new Object[]{dVar2}, this, f57962a, false, 63177, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar2}, this, f57962a, false, 63177, new Class[]{d.class}, Void.TYPE);
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[]{dVar2}, null, c.f3697a, true, 63149, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar2}, null, c.f3697a, true, 63149, new Class[]{d.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.notification.c.c cVar = new com.ss.android.ugc.aweme.notification.c.c();
                    if (!d.a.a(999, (long) dVar2.f57999f)) {
                        cVar.a((long) dVar2.f57999f);
                        cVar.j = dVar2.f57995b;
                        cVar.k = dVar2.f57996c;
                        cVar.f58026b = dVar2.f57998e;
                        cVar.f58027c = dVar2.f57997d;
                        cVar.m = dVar2.f57994a;
                        cVar.q = dVar2.g;
                        cVar.i = dVar2.i;
                        cVar.p = dVar2.h;
                        cVar.o = ((com.ss.android.ugc.aweme.notification.c.d) com.ss.android.ugc.aweme.base.sharedpref.c.a(GlobalContext.getContext(), com.ss.android.ugc.aweme.notification.c.d.class)).a(false) ? 1 : 0;
                        b.a().updateNoticeSession(cVar);
                    }
                }
            });
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63150, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.notification.d.a.a().a(46, (a.b) new d(this));
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63151, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.notification.d.a.a().a(47, (a.b) new e(this));
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63152, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.notification.d.a.a().a(33, (a.b) new g(this));
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63154, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            com.ss.android.ugc.aweme.notification.d.a.a().a(29, (a.b) new i(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63156, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63156, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            com.ss.android.ugc.aweme.notification.d.a.a().a(21, (a.b) new k(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63157, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63157, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            com.ss.android.ugc.aweme.notification.d.a.a().a(31, (a.b) new l(this, 31));
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63160, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            com.ss.android.ugc.aweme.notification.d.a.a().a(103, (a.b) new m(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63161, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.notification.d.a.a().a(45, (a.b) new n(this));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63153, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a() && ((Boolean) x.a().N().c()).booleanValue() && ((Boolean) SharePrefCache.inst().getEnableShoppingUser().c()).booleanValue()) {
            com.ss.android.ugc.aweme.notification.d.a.a().a(16, (a.b) new h(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63155, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a() && com.ss.android.ugc.aweme.aj.b.b().c(GlobalContext.getContext(), "star_atlas_notice_enable")) {
            com.ss.android.ugc.aweme.notification.d.a.a().a(32, (a.b) new j(this));
        }
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3697a, false, 63163, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3697a, false, 63163, new Class[]{String.class}, Void.TYPE);
            return;
        }
        n.a("notice_log", "notice_fetch_failed", com.ss.android.ugc.aweme.app.d.c.a().a("notice_type", str2).b());
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onEvent(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3697a, false, 63165, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3697a, false, 63165, new Class[]{String.class}, Void.TYPE);
        } else if (TextUtils.equals("sessionListFragment-onMain", str2)) {
            i.a((Callable<TResult>) new f<TResult>(this), i.f1052b);
        } else {
            if (TextUtils.equals("sessionListFragment-onMain:game", str2)) {
                i();
            }
        }
    }

    public final void a(@NonNull NoticeCountMessage noticeCountMessage) {
        NoticeCountMessage noticeCountMessage2 = noticeCountMessage;
        if (PatchProxy.isSupport(new Object[]{noticeCountMessage2}, this, f3697a, false, 63145, new Class[]{NoticeCountMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{noticeCountMessage2}, this, f3697a, false, 63145, new Class[]{NoticeCountMessage.class}, Void.TYPE);
            return;
        }
        if (noticeCountMessage2.noticeGroup == 11) {
            int i = noticeCountMessage2.noticeType;
            if (i == 0) {
                if (PatchProxy.isSupport(new Object[]{noticeCountMessage2}, this, f3697a, false, 63148, new Class[]{NoticeCountMessage.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{noticeCountMessage2}, this, f3697a, false, 63148, new Class[]{NoticeCountMessage.class}, Void.TYPE);
                } else {
                    IIMService a2 = b.a(false);
                    if (a2 != null) {
                        Bundle bundle = new Bundle();
                        StrangerNoticeMessage strangerNoticeMessage = noticeCountMessage2.strangerMessage;
                        if (strangerNoticeMessage != null) {
                            bundle.putLong("last_create_time", strangerNoticeMessage.createTime);
                            bundle.putString("from_user_id", strangerNoticeMessage.fromUser.getUid());
                            bundle.putString("from_user_name", strangerNoticeMessage.fromUser.getNickName());
                            bundle.putString("from_user_content", strangerNoticeMessage.content);
                            bundle.putInt("from_user_msg_type", strangerNoticeMessage.msgType);
                            bundle.putBoolean("is_recalled", strangerNoticeMessage.isRecalled());
                        }
                        bundle.putInt("unread_count", com.ss.android.ugc.aweme.message.c.c.a().b(11));
                        a2.onNewNoticeArrived(3, bundle);
                    }
                }
                if (this.f3698b != null) {
                }
            } else {
                if (i == 1) {
                    if (PatchProxy.isSupport(new Object[0], this, f3697a, false, 63146, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3697a, false, 63146, new Class[0], Void.TYPE);
                        return;
                    }
                    b.a().onNewNoticeArrived(4, new Bundle());
                }
            }
        }
    }

    @Subscribe
    public void onAggregatedEvent(com.ss.android.ugc.aweme.notification.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3697a, false, 63164, new Class[]{com.ss.android.ugc.aweme.notification.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3697a, false, 63164, new Class[]{com.ss.android.ugc.aweme.notification.a.class}, Void.TYPE);
            return;
        }
        switch (aVar.f57842a) {
            case 2:
                if (this.f3698b != null) {
                    this.f3698b.a(3, aVar.f57843b);
                    return;
                }
                break;
            case 3:
                if (this.f3698b != null) {
                    this.f3698b.a(1, aVar.f57843b);
                    return;
                }
                break;
            case 6:
                if (this.f3698b != null) {
                    this.f3698b.a(2, aVar.f57843b);
                    return;
                }
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                if (this.f3698b != null) {
                    this.f3698b.a(0, aVar.f57843b);
                    return;
                }
                break;
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                if (this.f3698b != null) {
                    this.f3698b.a();
                    return;
                }
                break;
            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                if (aVar.f57843b > 0) {
                    d();
                    return;
                }
                break;
            case 21:
                if (aVar.f57843b > 0) {
                    g();
                    return;
                }
                break;
            case 24:
                if (this.f3698b != null) {
                    this.f3698b.a(13, aVar.f57843b);
                    return;
                }
                break;
            case 28:
                if (this.f3698b != null) {
                    this.f3698b.a(12, aVar.f57843b);
                    return;
                }
                break;
            case 29:
                if (aVar.f57843b > 0) {
                    e();
                    return;
                }
                break;
            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.f69367f /*31*/:
                if (aVar.f57843b > 0) {
                    h();
                    break;
                }
                break;
            case 32:
                if (aVar.f57843b > 0) {
                    f();
                    return;
                }
                break;
            case 33:
                if (aVar.f57843b > 0) {
                    c();
                    return;
                }
                break;
            case 45:
                if (aVar.f57843b > 0) {
                    k();
                    return;
                }
                break;
            case 46:
                if (aVar.f57843b > 0) {
                    a();
                    return;
                }
                break;
            case 47:
                if (aVar.f57843b > 0) {
                    b();
                    return;
                }
                break;
            case 103:
                j();
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(BaseNotice baseNotice, h hVar, int i) {
        if (PatchProxy.isSupport(new Object[]{baseNotice, hVar, Integer.valueOf(i)}, this, f3697a, false, 63162, new Class[]{BaseNotice.class, h.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{baseNotice, hVar, Integer.valueOf(i)}, this, f3697a, false, 63162, new Class[]{BaseNotice.class, h.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (baseNotice == null) {
            if (i > 0) {
                if (b.a().getNoticeSession(hVar.O_()) == null) {
                    hVar.f();
                }
                a(hVar.O_());
            }
            return true;
        } else {
            return false;
        }
    }
}

package com.ss.android.ugc.aweme.notification.d;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.notification.PoiNotice;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.ChallengeNotice;
import com.ss.android.ugc.aweme.notification.bean.FriendNotice;
import com.ss.android.ugc.aweme.notification.bean.Notice;
import com.ss.android.ugc.aweme.notification.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.bean.WalletNotice;
import com.ss.android.ugc.aweme.notification.bean.f;
import com.ss.android.ugc.aweme.notification.bean.g;
import com.ss.android.ugc.aweme.notification.bean.h;
import com.ss.android.ugc.aweme.notification.bean.i;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58093a;

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f58094b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, b> f58095c;

    /* renamed from: d  reason: collision with root package name */
    public e f58096d;

    /* renamed from: e  reason: collision with root package name */
    public d f58097e;

    /* renamed from: f  reason: collision with root package name */
    private c f58098f;

    /* renamed from: com.ss.android.ugc.aweme.notification.d.a$a  reason: collision with other inner class name */
    static class C0653a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58110a = new a((byte) 0);
    }

    public interface b {
        void a(BaseNotice baseNotice);
    }

    public interface c {
    }

    public interface d {
        void a(com.ss.android.ugc.aweme.notification.bean.d dVar);
    }

    public interface e {
        void a();

        void a(Exception exc);
    }

    public static a a() {
        return C0653a.f58110a;
    }

    private a() {
        this.f58094b = new WeakHandler(this);
        this.f58095c = new HashMap<>();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    private void a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58093a, false, 63249, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58093a, false, 63249, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 >= 16 && i2 <= 29) {
            b bVar = this.f58095c.get(Integer.valueOf(i));
            if (bVar != null) {
                bVar.a(null);
            }
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f58093a, false, 63248, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f58093a, false, 63248, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) obj;
            if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), aVar.getErrorMsg()).a();
            }
            a(i);
        } else if (obj instanceof Exception) {
            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), GlobalContext.getContext().getString(C0906R.string.bgg)).a();
            a(i);
        } else {
            if (obj instanceof Notice) {
                if (i != 9986 || this.f58098f == null) {
                    b bVar = this.f58095c.get(Integer.valueOf(i));
                    if (bVar != null) {
                        List<BaseNotice> list = ((Notice) obj).items;
                        if (list == null || list.isEmpty()) {
                            bVar.a(null);
                            return;
                        } else {
                            bVar.a(list.get(0));
                            return;
                        }
                    }
                } else {
                    this.f58098f = null;
                }
            }
            if ((9984 == i || 9985 == i) && (obj instanceof BaseResponse)) {
                if (((BaseResponse) obj).status_code == 0) {
                    if (this.f58096d != null) {
                        this.f58096d.a();
                    }
                } else if (this.f58096d != null) {
                    this.f58096d.a(new Exception("bad status code"));
                }
                this.f58096d = null;
                return;
            }
            if (9983 == i && (obj instanceof com.ss.android.ugc.aweme.notification.bean.d)) {
                com.ss.android.ugc.aweme.notification.bean.d dVar = (com.ss.android.ugc.aweme.notification.bean.d) obj;
                if (dVar.status_code != 0 || TextUtils.isEmpty(dVar.f57995b)) {
                    if (this.f58096d != null) {
                        this.f58096d.a(new Exception("bad status code"));
                    }
                } else if (this.f58097e != null) {
                    this.f58097e.a(dVar);
                }
                this.f58097e = null;
            }
        }
    }

    public final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f58093a, false, 63245, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f58093a, false, 63245, new Class[]{d.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            this.f58097e = dVar;
            m.a().a(this.f58094b, new Callable<com.ss.android.ugc.aweme.notification.bean.d>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58105a;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public com.ss.android.ugc.aweme.notification.bean.d call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f58105a, false, 63253, new Class[0], com.ss.android.ugc.aweme.notification.bean.d.class)) {
                        return (com.ss.android.ugc.aweme.notification.bean.d) PatchProxy.accessDispatch(new Object[0], this, f58105a, false, 63253, new Class[0], com.ss.android.ugc.aweme.notification.bean.d.class);
                    }
                    try {
                        return NoticeApiManager.a();
                    } catch (ExecutionException e2) {
                        a.this.f58097e = null;
                        throw com.ss.android.ugc.aweme.app.api.m.a(e2);
                    }
                }
            }, 9983);
        }
    }

    public static void a(com.ss.android.ugc.aweme.im.service.session.a aVar, BaseNotice baseNotice) {
        com.ss.android.ugc.aweme.im.service.session.a aVar2 = aVar;
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{aVar2, baseNotice2}, null, f58093a, true, 63250, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class, BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, baseNotice2}, null, f58093a, true, 63250, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class, BaseNotice.class}, Void.TYPE);
        } else if (aVar2 != null && baseNotice2 != null) {
            String str = "";
            String str2 = "";
            AnnouncementNotice announcementNotice = baseNotice2.announcement;
            ChallengeNotice challengeNotice = baseNotice2.challengeNotice;
            UserTextNotice userTextNotice = baseNotice2.textNotice;
            h hVar = baseNotice2.shopNotice;
            FriendNotice friendNotice = baseNotice2.friendNotice;
            g gVar = baseNotice2.lubanNotice;
            i iVar = baseNotice2.starAtlasNotice;
            PoiNotice poiNotice = baseNotice2.poiNotice;
            f fVar = baseNotice2.liveAssistantNotice;
            WalletNotice walletNotice = baseNotice2.walletNotice;
            com.ss.android.ugc.aweme.notification.bean.e eVar = baseNotice2.linkProfitNotice;
            if (announcementNotice != null) {
                Challenge challenge = announcementNotice.challenge;
                if (challenge != null) {
                    str = challenge.getChallengeName();
                    str2 = announcementNotice.content;
                    aVar2.n = 1;
                } else {
                    str = announcementNotice.title;
                }
            }
            if (challengeNotice != null) {
                Challenge challenge2 = challengeNotice.challenge;
                if (challenge2 != null) {
                    str = challenge2.getChallengeName();
                    str2 = challengeNotice.content;
                    aVar2.n = 1;
                } else {
                    str = challengeNotice.title;
                }
            }
            if (userTextNotice != null) {
                str = userTextNotice.title;
                str2 = userTextNotice.content;
            }
            if (hVar != null) {
                str = hVar.f58012b;
                str2 = hVar.f58011a;
            }
            if (gVar != null) {
                str = gVar.f58009b;
                str2 = gVar.f58008a;
            }
            if (iVar != null) {
                str = iVar.f58015b;
                str2 = iVar.f58014a;
            }
            if (friendNotice != null) {
                str2 = friendNotice.content;
            }
            if (poiNotice != null) {
                str = poiNotice.title;
                str2 = poiNotice.content;
            }
            if (fVar != null) {
                str = fVar.f58005b;
                str2 = fVar.f58004a;
            }
            if (walletNotice != null) {
                str = walletNotice.title;
                str2 = walletNotice.content;
            }
            if (eVar != null) {
                str = eVar.f58001b;
                str2 = eVar.f58002c;
            }
            if (!TextUtils.isEmpty(str)) {
                aVar2.k = str;
            } else {
                aVar2.k = str2;
            }
            aVar2.a(baseNotice2.createTime);
        }
    }

    public final void a(int i, b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar2}, this, f58093a, false, 63242, new Class[]{Integer.TYPE, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar2}, this, f58093a, false, 63242, new Class[]{Integer.TYPE, b.class}, Void.TYPE);
            return;
        }
        this.f58095c.put(Integer.valueOf(i), bVar2);
        a(0, 0, 1, i, null, 0);
    }

    private void a(long j, long j2, int i, int i2, Integer num, int i3) {
        if (PatchProxy.isSupport(new Object[]{0L, 0L, 1, Integer.valueOf(i2), null, 0}, this, f58093a, false, 63244, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0L, 0L, 1, Integer.valueOf(i2), null, 0}, this, f58093a, false, 63244, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        m a2 = m.a();
        WeakHandler weakHandler = this.f58094b;
        final int i4 = i2;
        AnonymousClass1 r1 = new Callable<Notice>(0, 0, 1, null, 0) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58099a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f58100b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Notice call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f58099a, false, 63252, new Class[0], Notice.class)) {
                    return (Notice) PatchProxy.accessDispatch(new Object[0], this, f58099a, false, 63252, new Class[0], Notice.class);
                }
                try {
                    return NoticeApiManager.a(this.f58100b, 0, 1, i4, null, 0, com.ss.android.ugc.aweme.utils.permission.e.a(), com.ss.android.ugc.aweme.utils.permission.e.b());
                } catch (ExecutionException e2) {
                    throw com.ss.android.ugc.aweme.app.api.m.a(e2);
                }
            }

            {
                this.f58100b = r2;
            }
        };
        a2.a(weakHandler, r1, i2);
    }
}

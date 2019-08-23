package com.ss.android.ugc.aweme.message.c;

import a.g;
import a.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.message.a.a;
import com.ss.android.ugc.aweme.message.api.NotificationApi;
import com.ss.android.ugc.aweme.message.d.d;
import com.ss.android.ugc.aweme.message.d.f;
import com.ss.android.ugc.aweme.message.model.BaseMessage;
import com.ss.android.ugc.aweme.message.model.FollowTabChannelCountStruct;
import com.ss.android.ugc.aweme.message.model.MessageType;
import com.ss.android.ugc.aweme.message.model.NoticeCount;
import com.ss.android.ugc.aweme.message.model.NoticeCountMessage;
import com.ss.android.ugc.aweme.message.model.NoticeList;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public class c implements WeakHandler.IHandler, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55363a;

    /* renamed from: e  reason: collision with root package name */
    private static long f55364e = System.currentTimeMillis();
    private static volatile c j;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<a> f55365b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f55366c = false;

    /* renamed from: d  reason: collision with root package name */
    public NotificationApi f55367d = ((NotificationApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(NotificationApi.class));

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<Integer> f55368f = new SparseArray<>();
    private int[] g = {7, 3, 2, 6, 24, 28, 47, 46, 9, 12, 4, 5, 16, 999, 21, 51, 50, 29, 33, 11, 998, 99, BaseLoginOrRegisterActivity.o, 103, 43, 45, 32};
    private SharedPreferences h;
    private Handler i = new WeakHandler(Looper.getMainLooper(), this);

    public static boolean e(int i2) {
        return i2 == 99 || i2 == 7 || i2 == 3 || i2 == 28 || i2 == 24 || i2 == 33 || i2 == 16 || i2 == 29 || i2 == 47 || i2 == 103 || i2 == 32 || i2 == 45;
    }

    public static boolean f(int i2) {
        return i2 == 51 || i2 == 50;
    }

    public static boolean g(int i2) {
        return i2 == 42;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f55363a, false, 58756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55363a, false, 58756, new Class[0], Void.TYPE);
            return;
        }
        this.f55368f.clear();
        SharedPreferences.Editor edit = this.h.edit();
        edit.clear();
        SharedPrefsEditorCompat.apply(edit);
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f55363a, true, 58748, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f55363a, true, 58748, new Class[0], c.class);
        }
        if (j == null) {
            synchronized (c.class) {
                if (j == null) {
                    j = new c();
                }
            }
        }
        return j;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f55363a, false, 58750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55363a, false, 58750, new Class[0], Void.TYPE);
            return;
        }
        for (int i2 : this.g) {
            this.f55368f.append(i2, Integer.valueOf(this.h.getInt(h(i2), 0)));
        }
        this.f55368f.append(102, Integer.valueOf(this.h.getInt(h(102), 1)));
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f55363a, false, 58764, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f55363a, false, 58764, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((!d(11) || !d(998)) && !d(BaseLoginOrRegisterActivity.o) && !d(12)) {
            return false;
        } else {
            return true;
        }
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f55363a, false, 58752, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55363a, false, 58752, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.h.getInt(h(7), 0) + this.h.getInt(h(3), 0) + this.h.getInt(h(28), 0) + this.h.getInt(h(24), 0) + this.h.getInt(h(33), 0) + this.h.getInt(h(16), 0) + this.h.getInt(h(29), 0) + this.h.getInt(h(47), 0) + this.h.getInt(h(103), 0) + this.h.getInt(h(32), 0) + this.h.getInt(h(45), 0);
        if (b.b()) {
            i2 += this.h.getInt(h(99), 0);
        }
        return i2;
    }

    private c() {
        k a2 = k.a();
        if (PatchProxy.isSupport(new Object[]{a2}, this, f55363a, false, 58749, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{a2}, this, f55363a, false, 58749, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        d a3 = d.a();
        com.ss.android.ugc.aweme.message.a.b bVar = new com.ss.android.ugc.aweme.message.a.b();
        if (PatchProxy.isSupport(new Object[]{bVar}, a3, d.f55377a, false, 58774, new Class[]{com.ss.android.ugc.aweme.message.d.a.class}, Void.TYPE)) {
            d dVar = a3;
            PatchProxy.accessDispatch(new Object[]{bVar}, dVar, d.f55377a, false, 58774, new Class[]{com.ss.android.ugc.aweme.message.d.a.class}, Void.TYPE);
        } else {
            a3.f55379b.add(bVar);
        }
        f d2 = f.d();
        MessageType messageType = MessageType.NOTICE;
        if (PatchProxy.isSupport(new Object[]{messageType, this}, d2, f.f3570a, false, 58777, new Class[]{MessageType.class, a.class}, Void.TYPE)) {
            f fVar = d2;
            PatchProxy.accessDispatch(new Object[]{messageType, this}, fVar, f.f3570a, false, 58777, new Class[]{MessageType.class, a.class}, Void.TYPE);
        } else {
            Set set = d2.f3574d.get(messageType);
            if (set == null) {
                set = new HashSet();
                d2.f3574d.put(messageType, set);
            }
            set.add(this);
        }
        this.h = com.ss.android.ugc.aweme.q.c.a(a2, "red-point-cache", 0);
        e();
    }

    private String h(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58769, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58769, new Class[]{Integer.TYPE}, String.class);
        }
        return "unread_" + i2;
    }

    /* access modifiers changed from: package-private */
    public void c(final int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58759, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58759, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(this.i, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55369a;

            public final Object call() throws Exception {
                int i = 0;
                if (PatchProxy.isSupport(new Object[0], this, f55369a, false, 58771, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f55369a, false, 58771, new Class[0], Object.class);
                }
                boolean z = !com.ss.android.ugc.aweme.y.a.a().b();
                if (MainPageExperimentHelper.n()) {
                    i = 1;
                } else if (MainPageExperimentHelper.b()) {
                    i = 2;
                }
                return c.this.f55367d.query(i2, z ? 1 : 0, i).execute().body();
            }
        }, i2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58755, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58755, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f55368f.remove(i2);
        SharedPreferences.Editor edit = this.h.edit();
        edit.putInt(h(i2), 0);
        SharedPrefsEditorCompat.apply(edit);
    }

    public final boolean d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58763, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58763, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i2 == 11) {
            if (b(i2) > 0) {
                if (b(998) > 0) {
                    return true;
                }
            }
            return false;
        } else {
            if (b(i2) > 0) {
                return true;
            }
            return false;
        }
    }

    public final int b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58757, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55363a, false, 58757, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f55368f.get(i2) == null) {
            return 0;
        } else {
            return this.f55368f.get(i2).intValue();
        }
    }

    public final void a(BaseMessage baseMessage) {
        if (PatchProxy.isSupport(new Object[]{baseMessage}, this, f55363a, false, 58760, new Class[]{BaseMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseMessage}, this, f55363a, false, 58760, new Class[]{BaseMessage.class}, Void.TYPE);
            return;
        }
        if (baseMessage instanceof NoticeCountMessage) {
            NoticeCountMessage noticeCountMessage = (NoticeCountMessage) baseMessage;
            a(false, 2);
            if (PatchProxy.isSupport(new Object[]{noticeCountMessage}, this, f55363a, false, 58761, new Class[]{NoticeCountMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{noticeCountMessage}, this, f55363a, false, 58761, new Class[]{NoticeCountMessage.class}, Void.TYPE);
            } else if (noticeCountMessage != null) {
                if (noticeCountMessage.noticeGroup == 11) {
                    b(noticeCountMessage.noticeGroup, noticeCountMessage.noticeCount);
                    a(noticeCountMessage.noticeGroup, noticeCountMessage.noticeCount);
                }
                a aVar = this.f55365b.get(2);
                if (aVar != null) {
                    aVar.a(noticeCountMessage);
                }
            }
            com.ss.android.ugc.aweme.follow.c.a.f47760e = noticeCountMessage.authorId;
            com.ss.android.ugc.aweme.follow.c.a.f47759d = noticeCountMessage.itemId;
            r.a("receive_long_link", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("link_type", noticeCountMessage.noticeGroup).f34114b);
        }
    }

    public void handleMsg(Message message) {
        boolean z;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f55363a, false, 58768, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f55363a, false, 58768, new Class[]{Message.class}, Void.TYPE);
        } else if (!(message2.obj instanceof Exception)) {
            NoticeList noticeList = (NoticeList) message2.obj;
            if (!(noticeList == null || noticeList.items == null || noticeList.items.isEmpty())) {
                com.ss.android.ugc.aweme.message.b.a aVar = new com.ss.android.ugc.aweme.message.b.a();
                for (NoticeCount next : noticeList.items) {
                    if (next != null) {
                        int i2 = next.group;
                        if (i2 == 38 || i2 == 39 || i2 == 40 || i2 == 41) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (next.count > 0) {
                                aVar.a().add(next);
                            }
                        } else if (!g(next.group)) {
                            int i3 = next.group;
                            int i4 = next.count;
                            int i5 = i4;
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, this, f55363a, false, 58762, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i5)}, this, f55363a, false, 58762, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            } else if (i3 != 4 || !(AwemeAppData.p().f() instanceof ContactsActivity)) {
                                int i6 = i5;
                                b(i3, i6);
                                a(i3, i6);
                                bg.a(new com.ss.android.ugc.aweme.notification.a(i3, i6));
                                if (e(i3)) {
                                    bg.a(new com.ss.android.ugc.aweme.message.b.c(i3, i6));
                                } else if (d(i3)) {
                                    bg.a(new com.ss.android.ugc.aweme.message.b.c(i3));
                                }
                            }
                        } else if (next.count > 0) {
                            aVar.a().add(next);
                        }
                    }
                }
                if (!CollectionUtils.isEmpty(aVar.a())) {
                    bg.a(aVar);
                }
                com.ss.android.ugc.aweme.follow.c.a.g = true;
                com.ss.android.ugc.aweme.follow.c.a.h = true;
                com.ss.android.ugc.aweme.follow.c.a.f47757b = message2.what;
                if (noticeList.logPb != null) {
                    com.ss.android.ugc.aweme.follow.c.a aVar2 = com.ss.android.ugc.aweme.follow.c.a.i;
                    String imprId = noticeList.logPb.getImprId();
                    if (PatchProxy.isSupport(new Object[]{imprId}, aVar2, com.ss.android.ugc.aweme.follow.c.a.f47756a, false, 44753, new Class[]{String.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.follow.c.a aVar3 = aVar2;
                        PatchProxy.accessDispatch(new Object[]{imprId}, aVar3, com.ss.android.ugc.aweme.follow.c.a.f47756a, false, 44753, new Class[]{String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(imprId, "<set-?>");
                        com.ss.android.ugc.aweme.follow.c.a.f47758c = imprId;
                    }
                }
                if (!CollectionUtils.isEmpty(noticeList.followTabChannelCounts)) {
                    for (FollowTabChannelCountStruct next2 : noticeList.followTabChannelCounts) {
                        com.ss.android.ugc.aweme.follow.c.a.f47761f.put(next2.followTabChannel, Integer.valueOf(next2.count));
                    }
                }
            }
        } else if (message2.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            r.a("homepage_follow_monitor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("error_type", "yellow_dot_error").a("error_code", ((com.ss.android.ugc.aweme.base.api.a.b.a) message2.obj).getErrorCode()).a("launch_type", com.ss.android.ugc.aweme.follow.c.a.a(message2.what)).f34114b);
        } else {
            r.a("homepage_follow_monitor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("error_type", "yellow_dot_error").a("error_code", 4).a("launch_type", com.ss.android.ugc.aweme.follow.c.a.a(message2.what)).f34114b);
        }
    }

    private void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f55363a, false, 58767, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f55363a, false, 58767, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 11) {
            int b2 = i3 - b(11);
            if (!this.f55366c && b2 > 0) {
                a(998, b2);
            }
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f55363a, false, 58751, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f55363a, false, 58751, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f55368f.append(i2, Integer.valueOf(i3));
        SharedPreferences.Editor edit = this.h.edit();
        edit.putInt(h(i2), i3);
        SharedPrefsEditorCompat.apply(edit);
    }

    public final void a(boolean z, int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f55363a, false, 58758, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2)}, this, f55363a, false, 58758, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.account.d.a().isLogin() && !TextUtils.isEmpty(com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z || currentTimeMillis >= f55364e + 300000) {
                if (i2 == 2 || ((Integer) SharePrefCache.inst().getNoticeCountLatency().c()).intValue() > 0) {
                    i.a((long) ((Integer) SharePrefCache.inst().getNoticeCountLatency().c()).intValue()).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(this, i2));
                } else {
                    c(i2);
                }
                f55364e = currentTimeMillis;
            }
        }
    }
}

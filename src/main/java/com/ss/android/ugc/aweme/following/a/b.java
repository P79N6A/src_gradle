package com.ss.android.ugc.aweme.following.a;

import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.following.api.FollowerApi;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.List;
import java.util.concurrent.Callable;

public class b extends a<User, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47871a = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f47872d = "b";

    /* renamed from: b  reason: collision with root package name */
    public c f47873b;

    /* renamed from: c  reason: collision with root package name */
    public FollowerApi f47874c = ((FollowerApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FollowerApi.class));

    /* renamed from: e  reason: collision with root package name */
    private String f47875e;

    /* renamed from: f  reason: collision with root package name */
    private int f47876f;
    private f g;
    private boolean h = true;
    private g i;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public /* bridge */ /* synthetic */ Object getData() {
        return this.f47873b;
    }

    public List<User> getItems() {
        if (this.f47873b == null) {
            return null;
        }
        return this.f47873b.f47880a;
    }

    public boolean isHasMore() {
        if (this.f47873b == null || !this.f47873b.f47881b) {
            return false;
        }
        return true;
    }

    public b(String str) {
        this.f47875e = str;
    }

    private void a(final com.ss.android.ugc.aweme.following.api.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f47871a, false, 44781, new Class[]{com.ss.android.ugc.aweme.following.api.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f47871a, false, 44781, new Class[]{com.ss.android.ugc.aweme.following.api.a.class}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47877a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f47877a, false, 44782, new Class[0], Object.class)) {
                    return b.this.f47874c.fetchFollowingList(aVar.f47907a, aVar.f47909c, aVar.f47908b, aVar.f47911e, aVar.f47912f, aVar.h, aVar.i).get();
                }
                return PatchProxy.accessDispatch(new Object[0], this, f47877a, false, 44782, new Class[0], Object.class);
            }
        }, 0);
    }

    public void loadMoreList(Object... objArr) {
        long j;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f47871a, false, 44778, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f47871a, false, 44778, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.g = new f();
        this.g.f47902b++;
        this.i = null;
        com.ss.android.ugc.aweme.following.api.a a2 = a(false);
        if (this.f47873b == null) {
            j = 0;
        } else {
            j = this.f47873b.f47883d;
        }
        a2.f47909c = j;
        a(a2);
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f47871a, false, 44776, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f47871a, false, 44776, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f47876f = 0;
        this.h = true;
        this.i = new g();
        this.i.f47905b++;
        this.g = null;
        com.ss.android.ugc.aweme.following.api.a a2 = a(true);
        a2.f47909c = 0;
        a(a2);
    }

    private com.ss.android.ugc.aweme.following.api.a a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f47871a, false, 44777, new Class[]{Boolean.TYPE}, com.ss.android.ugc.aweme.following.api.a.class)) {
            return (com.ss.android.ugc.aweme.following.api.a) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f47871a, false, 44777, new Class[]{Boolean.TYPE}, com.ss.android.ugc.aweme.following.api.a.class);
        }
        com.ss.android.ugc.aweme.following.api.a aVar = new com.ss.android.ugc.aweme.following.api.a();
        aVar.f47908b = 20;
        aVar.f47907a = this.f47875e;
        int i3 = 2;
        if (!com.ss.android.g.a.a()) {
            aVar.f47911e = this.f47876f;
            if (!AbTestManager.a().bk()) {
                i3 = 1;
            }
            aVar.f47912f = i3;
            if (AbTestManager.a().bk() && !this.h) {
                aVar.f47912f = 1;
            }
        } else {
            if ((!z || !AbTestManager.a().bk()) && (z || !this.h)) {
                i3 = 1;
            }
            aVar.f47912f = i3;
            if (!z) {
                i2 = this.f47876f;
            }
            aVar.f47911e = i2;
        }
        aVar.h = e.a();
        aVar.i = e.b();
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(c cVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f47871a, false, 44780, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f47871a, false, 44780, new Class[]{c.class}, Void.TYPE);
            return;
        }
        super.handleData(cVar);
        if (cVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            this.f47876f = cVar.f47884e;
            this.h = cVar.f47885f;
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    int size = this.f47873b.f47880a.size();
                    com.ss.android.ugc.aweme.c.a.a(this.f47873b.f47880a, cVar.f47880a);
                    int size2 = this.f47873b.f47880a.size() - size;
                    if (this.g != null) {
                        this.g.f47901a += size2;
                        f fVar = this.g;
                        if (!cVar.f47881b || !this.f47873b.f47881b) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        fVar.f47903c = z2;
                    }
                    this.f47873b.f47882c = cVar.f47882c;
                    this.f47873b.f47883d = cVar.f47883d;
                    c cVar2 = this.f47873b;
                    if (!cVar.f47881b || !this.f47873b.f47881b) {
                        z3 = false;
                    }
                    cVar2.f47881b = z3;
                }
            } else if (this.i == null || this.i.f47905b <= 1 || this.f47873b == null) {
                this.f47873b = cVar;
            } else {
                int size3 = this.f47873b.f47880a.size();
                com.ss.android.ugc.aweme.c.a.a(this.f47873b.f47880a, cVar.f47880a);
                this.i.f47904a += this.f47873b.f47880a.size() - size3;
                this.i.f47906c = cVar.f47881b;
                this.f47873b.f47882c = cVar.f47882c;
                this.f47873b.f47883d = cVar.f47883d;
                c cVar3 = this.f47873b;
                if (!cVar.f47881b || !this.f47873b.f47881b) {
                    z3 = false;
                }
                cVar3.f47881b = z3;
            }
        } else {
            if (this.f47873b != null) {
                this.f47873b.f47881b = false;
            }
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f47871a, false, 44779, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f47871a, false, 44779, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (p a2 : this.mNotifyListeners) {
                    a2.a((Exception) message.obj);
                }
            }
            this.g = null;
            this.i = null;
            return;
        }
        handleData((c) message.obj);
        if (AbTestManager.a().bk() && !com.ss.android.g.a.a()) {
            long j = 0;
            if (this.mListQueryType == 4) {
                if (this.g != null && this.g.f47903c && this.g.f47901a < 5 && this.g.f47902b < 3) {
                    this.g.f47902b++;
                    com.ss.android.ugc.aweme.following.api.a a3 = a(false);
                    if (this.f47873b != null) {
                        j = this.f47873b.f47883d;
                    }
                    a3.f47909c = j;
                    a(a3);
                    return;
                }
            } else if (this.mListQueryType == 1 && this.i != null && this.i.f47906c && this.i.f47905b < 2 && this.i.f47904a < 15) {
                this.i.f47905b++;
                com.ss.android.ugc.aweme.following.api.a a4 = a(false);
                if (this.f47873b != null) {
                    j = this.f47873b.f47883d;
                }
                a4.f47909c = j;
                a(a4);
                return;
            }
        }
        this.g = null;
        this.i = null;
        if (this.mNotifyListeners != null) {
            for (p b2 : this.mNotifyListeners) {
                b2.b();
            }
        }
    }
}

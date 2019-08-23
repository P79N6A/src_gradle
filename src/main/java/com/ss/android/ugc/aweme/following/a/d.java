package com.ss.android.ugc.aweme.following.a;

import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.following.api.FollowingApi;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.List;
import java.util.concurrent.Callable;

public class d extends a<User, e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47886a = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f47887c = "d";

    /* renamed from: b  reason: collision with root package name */
    public FollowingApi f47888b = ((FollowingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FollowingApi.class));

    /* renamed from: d  reason: collision with root package name */
    private e f47889d;

    /* renamed from: e  reason: collision with root package name */
    private String f47890e;

    /* renamed from: f  reason: collision with root package name */
    private int f47891f;
    private boolean g;
    private f h;
    private boolean i = true;
    private g j;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public List<User> getItems() {
        if (this.f47889d == null) {
            return null;
        }
        return this.f47889d.f47895a;
    }

    public boolean isHasMore() {
        if (this.f47889d == null || !this.f47889d.f47896b) {
            return false;
        }
        return true;
    }

    private boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f47886a, false, 44786, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47886a, false, 44786, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.g && !com.ss.android.g.a.a()) {
            z = true;
        }
        return z;
    }

    private void a(final com.ss.android.ugc.aweme.following.api.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f47886a, false, 44790, new Class[]{com.ss.android.ugc.aweme.following.api.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f47886a, false, 44790, new Class[]{com.ss.android.ugc.aweme.following.api.a.class}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47892a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f47892a, false, 44791, new Class[0], Object.class)) {
                    return d.this.f47888b.fetchFollowingList(aVar.f47907a, aVar.f47909c, aVar.f47908b, aVar.f47911e, aVar.f47912f, aVar.h, aVar.i).get();
                }
                return PatchProxy.accessDispatch(new Object[0], this, f47892a, false, 44791, new Class[0], Object.class);
            }
        }, 0);
    }

    private int b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f47886a, false, 44785, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f47886a, false, 44785, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.g) {
            return AbTestManager.a().aq();
        } else {
            if (z) {
                if (AbTestManager.a().bk()) {
                    return 2;
                }
                return 1;
            } else if (this.i) {
                return 2;
            } else {
                return 1;
            }
        }
    }

    public void loadMoreList(Object... objArr) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f47886a, false, 44788, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f47886a, false, 44788, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.h = new f();
        this.h.f47902b++;
        this.j = null;
        com.ss.android.ugc.aweme.following.api.a a2 = a(false);
        if (this.f47889d == null) {
            j2 = 0;
        } else {
            j2 = this.f47889d.f47898d;
        }
        a2.f47909c = j2;
        a(a2);
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f47886a, false, 44783, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f47886a, false, 44783, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f47891f = 0;
        this.i = true;
        this.j = new g();
        this.j.f47905b++;
        this.h = null;
        com.ss.android.ugc.aweme.following.api.a a2 = a(true);
        a2.f47909c = 0;
        a(a2);
    }

    private com.ss.android.ugc.aweme.following.api.a a(boolean z) {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f47886a, false, 44784, new Class[]{Boolean.TYPE}, com.ss.android.ugc.aweme.following.api.a.class)) {
            return (com.ss.android.ugc.aweme.following.api.a) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f47886a, false, 44784, new Class[]{Boolean.TYPE}, com.ss.android.ugc.aweme.following.api.a.class);
        }
        com.ss.android.ugc.aweme.following.api.a aVar = new com.ss.android.ugc.aweme.following.api.a();
        aVar.f47908b = 20;
        aVar.f47907a = this.f47890e;
        aVar.f47910d = this.g;
        if (!z || !com.ss.android.g.a.a()) {
            i3 = this.f47891f;
        }
        aVar.f47911e = i3;
        if (!a()) {
            aVar.f47912f = b(z);
        } else {
            if (AbTestManager.a().bk()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            aVar.f47912f = i2;
            if (AbTestManager.a().bk() && !this.i) {
                aVar.f47912f = 1;
            }
        }
        aVar.h = e.a();
        aVar.i = e.b();
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(e eVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f47886a, false, 44789, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f47886a, false, 44789, new Class[]{e.class}, Void.TYPE);
            return;
        }
        super.handleData(eVar);
        if (eVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            this.f47891f = eVar.f47899e;
            this.i = eVar.f47900f;
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    int size = this.f47889d.f47895a.size();
                    com.ss.android.ugc.aweme.c.a.a(this.f47889d.f47895a, eVar.f47895a);
                    int size2 = this.f47889d.f47895a.size() - size;
                    if (this.h != null) {
                        this.h.f47901a += size2;
                        f fVar = this.h;
                        if (!eVar.f47896b || !this.f47889d.f47896b) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        fVar.f47903c = z2;
                    }
                    this.f47889d.f47897c = eVar.f47897c;
                    this.f47889d.f47898d = eVar.f47898d;
                    e eVar2 = this.f47889d;
                    if (!eVar.f47896b || !this.f47889d.f47896b) {
                        z3 = false;
                    }
                    eVar2.f47896b = z3;
                }
            } else if (this.j == null || this.j.f47905b <= 1 || this.f47889d == null) {
                this.f47889d = eVar;
            } else {
                int size3 = this.f47889d.f47895a.size();
                com.ss.android.ugc.aweme.c.a.a(this.f47889d.f47895a, eVar.f47895a);
                this.j.f47904a += this.f47889d.f47895a.size() - size3;
                this.j.f47906c = eVar.f47896b;
                this.f47889d.f47897c = eVar.f47897c;
                this.f47889d.f47898d = eVar.f47898d;
                e eVar3 = this.f47889d;
                if (!eVar.f47896b || !this.f47889d.f47896b) {
                    z3 = false;
                }
                eVar3.f47896b = z3;
            }
        } else {
            if (this.f47889d != null) {
                this.f47889d.f47896b = false;
            }
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f47886a, false, 44787, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f47886a, false, 44787, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (p a2 : this.mNotifyListeners) {
                    a2.a((Exception) message.obj);
                }
            }
            this.h = null;
            this.j = null;
            return;
        }
        handleData((e) message.obj);
        if (a() && AbTestManager.a().bk()) {
            long j2 = 0;
            if (this.mListQueryType == 4) {
                if (this.h != null && this.h.f47903c && this.h.f47901a < 5 && this.h.f47902b < 3) {
                    this.h.f47902b++;
                    com.ss.android.ugc.aweme.following.api.a a3 = a(false);
                    if (this.f47889d != null) {
                        j2 = this.f47889d.f47898d;
                    }
                    a3.f47909c = j2;
                    a(a3);
                    return;
                }
            } else if (this.mListQueryType == 1 && this.j != null && this.j.f47906c && this.j.f47905b < 2 && this.j.f47904a < 15) {
                this.j.f47905b++;
                com.ss.android.ugc.aweme.following.api.a a4 = a(false);
                if (this.f47889d != null) {
                    j2 = this.f47889d.f47898d;
                }
                a4.f47909c = j2;
                a(a4);
                return;
            }
        }
        this.h = null;
        this.j = null;
        if (this.mNotifyListeners != null) {
            for (p b2 : this.mNotifyListeners) {
                b2.b();
            }
        }
    }

    public d(String str, boolean z) {
        this.f47890e = str;
        this.g = z;
    }
}

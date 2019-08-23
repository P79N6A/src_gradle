package com.ss.android.ugc.aweme.user;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.ae;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.a.a;

public class c implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75317a;

    /* renamed from: f  reason: collision with root package name */
    private static volatile c f75318f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f75319b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f75320c = false;

    /* renamed from: d  reason: collision with root package name */
    public long f75321d = -1;

    /* renamed from: e  reason: collision with root package name */
    public WeakHandler f75322e = new WeakHandler(Looper.getMainLooper(), this);
    private a g = new a();

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f75317a, false, 87553, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f75317a, false, 87553, new Class[]{String.class}, Void.TYPE);
        }
    }

    private c() {
    }

    public final User b() {
        if (!PatchProxy.isSupport(new Object[0], this, f75317a, false, 87496, new Class[0], User.class)) {
            return d.f75329c.a(false);
        }
        return (User) PatchProxy.accessDispatch(new Object[0], this, f75317a, false, 87496, new Class[0], User.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f75317a, false, 87497, new Class[0], Boolean.TYPE)) {
            return d.f75329c.e();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75317a, false, 87497, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f75317a, false, 87499, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75317a, false, 87499, new Class[0], Void.TYPE);
            return;
        }
        d.f75329c.i();
        b(b());
        ae.a(5, null, b(), null);
    }

    public final String e() {
        if (!PatchProxy.isSupport(new Object[0], this, f75317a, false, 87504, new Class[0], String.class)) {
            return d.f75329c.f();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f75317a, false, 87504, new Class[0], String.class);
    }

    public static final c a() {
        if (PatchProxy.isSupport(new Object[0], null, f75317a, true, 87495, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f75317a, true, 87495, new Class[0], c.class);
        }
        if (f75318f == null) {
            synchronized (c.class) {
                if (f75318f == null) {
                    f75318f = new c();
                }
            }
        }
        return f75318f;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f75317a, false, 87552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75317a, false, 87552, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.login.loginlog.a a2 = com.ss.android.ugc.aweme.account.login.loginlog.a.a();
        a2.a("last_uid = " + AppLog.getUserId(), "", false, "user_login_out", a().c());
        a().c(AppLog.getUserId());
        n.b("aweme_user_logout", "", com.ss.android.ugc.aweme.account.a.a.a.a().a("errorDesc", "user_banned").b());
        com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("user_banned", "", false, "user_login_out", a().c());
        ae.a(8, null, b(), null);
    }

    private void b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f75317a, false, 87577, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f75317a, false, 87577, new Class[]{User.class}, Void.TYPE);
        } else if (user != null) {
            com.ss.android.ugc.aweme.account.util.n.a(user.getIsSyncToutiao() ? 1 : 0);
            PlatformInfo[] platformInfos = user.getPlatformInfos();
            if (platformInfos != null && platformInfos.length > 0) {
                for (PlatformInfo patformName : platformInfos) {
                    if (TextUtils.equals("hotsoon", patformName.getPatformName())) {
                        com.ss.android.ugc.aweme.account.util.n.c(true);
                        return;
                    }
                }
            }
        }
    }

    private void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75317a, false, 87576, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f75317a, false, 87576, new Class[]{String.class}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            d.f75329c.b(str2);
        }
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f75317a, false, 87506, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f75317a, false, 87506, new Class[]{User.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(user.getUid())) {
            User b2 = b();
            this.f75320c = false;
            this.f75321d = -1;
            if (user != null && !TextUtils.isEmpty(user.getUid())) {
                this.f75319b = true;
                if (!TextUtils.isEmpty(user.getUid()) && !TextUtils.equals(d.f75329c.g(), user.getUid())) {
                    d.f75329c.b(user.getUid());
                }
                ae.a(4, b2, user, null);
                d.f75329c.a(user);
                d.f75329c.a(user.getUid());
                d();
                com.ss.android.ugc.aweme.account.l.a.a(e());
            }
        }
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75317a, false, 87578, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f75317a, false, 87578, new Class[]{String.class}, Void.TYPE);
        } else if (!d.f75329c.f(str2)) {
            d.f75329c.e(str2);
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f75317a, false, 87574, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f75317a, false, 87574, new Class[]{Message.class}, Void.TYPE);
        } else if (message.obj instanceof Exception) {
            if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) message.obj;
                int errorCode = aVar.getErrorCode();
                if (errorCode != 14) {
                    switch (errorCode) {
                        case 8:
                            return;
                        case 9:
                            f();
                            return;
                    }
                } else {
                    a(aVar.getErrorMsg());
                }
            }
        } else {
            switch (message.what) {
                case SearchJediMixFeedAdapter.f42516e:
                    a((User) message.obj);
                    break;
                case 113:
                    if (PatchProxy.isSupport(new Object[]{message}, this, f75317a, false, 87573, new Class[]{Message.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{message}, this, f75317a, false, 87573, new Class[]{Message.class}, Void.TYPE);
                        break;
                    } else {
                        try {
                            Object obj = message.obj;
                            if (PatchProxy.isSupport(new Object[]{obj}, this, f75317a, false, 87571, new Class[]{Object.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{obj}, this, f75317a, false, 87571, new Class[]{Object.class}, Void.TYPE);
                                return;
                            } else if (!(obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                                ae.a(11, null, null, null);
                                break;
                            } else {
                                ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorCode();
                                throw new Exception("user check in fails");
                            }
                        } catch (Exception unused) {
                        }
                    }
                case 114:
                    return;
            }
        }
    }
}

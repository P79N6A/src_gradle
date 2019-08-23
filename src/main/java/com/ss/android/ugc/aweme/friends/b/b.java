package com.ss.android.ugc.aweme.friends.b;

import android.content.Context;
import com.douyin.share.a.b.b.d;
import com.douyin.share.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.profile.model.User;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48837a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f48838b;

    /* renamed from: c  reason: collision with root package name */
    protected i f48839c;

    /* renamed from: d  reason: collision with root package name */
    private String f48840d;

    /* renamed from: e  reason: collision with root package name */
    private String f48841e;

    /* renamed from: f  reason: collision with root package name */
    private User f48842f;

    public final String i() {
        return null;
    }

    public final long k() {
        return 0;
    }

    public final long l() {
        return 0;
    }

    public final String d() {
        return this.f48840d;
    }

    public final String e() {
        return this.f48841e;
    }

    public final String g() {
        return this.f48839c.f23234c;
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f48837a, false, 46568, new Class[0], String.class)) {
            return this.f48838b.getString(C0906R.string.ak);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f48837a, false, 46568, new Class[0], String.class);
    }

    public final byte[] f() {
        if (!PatchProxy.isSupport(new Object[0], this, f48837a, false, 46569, new Class[0], byte[].class)) {
            return this.f48839c.a();
        }
        return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f48837a, false, 46569, new Class[0], byte[].class);
    }

    public final String h() {
        if (!PatchProxy.isSupport(new Object[0], this, f48837a, false, 46570, new Class[0], String.class)) {
            return this.f48839c.b();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f48837a, false, 46570, new Class[0], String.class);
    }

    public final long j() {
        if (PatchProxy.isSupport(new Object[0], this, f48837a, false, 46571, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f48837a, false, 46571, new Class[0], Long.TYPE)).longValue();
        }
        try {
            return Long.parseLong(this.f48842f.getUid());
        } catch (Exception unused) {
            return 0;
        }
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f48837a, false, 46567, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f48837a, false, 46567, new Class[0], String.class);
        }
        return "https://www.douyin.com/friend/invite/" + this.f48842f.getUid() + "/";
    }

    public b(Context context) {
        this.f48838b = context;
    }

    public final void a(User user, String str, String str2) {
        User user2 = user;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{user2, str3, str4}, this, f48837a, false, 46566, new Class[]{User.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, str3, str4}, this, f48837a, false, 46566, new Class[]{User.class, String.class, String.class}, Void.TYPE);
            return;
        }
        this.f48842f = user2;
        this.f48840d = str3;
        this.f48841e = str4;
        this.f48839c = new i(this.f48838b, c.a(user.getAvatarMedium()));
    }
}

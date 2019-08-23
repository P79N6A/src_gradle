package com.ss.android.ugc.aweme.o;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import javax.annotation.Nonnull;

public final class r implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58309a;

    /* renamed from: b  reason: collision with root package name */
    private User f58310b;

    public final boolean k() {
        if (this.f58310b.roomId > 0) {
            return true;
        }
        return false;
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54819, new Class[0], String.class)) {
            return this.f58310b.getUniqueId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54819, new Class[0], String.class);
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54820, new Class[0], String.class)) {
            return this.f58310b.getShortId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54820, new Class[0], String.class);
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54821, new Class[0], String.class)) {
            return this.f58310b.getUid();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54821, new Class[0], String.class);
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54822, new Class[0], Boolean.TYPE)) {
            return this.f58310b.isSecret();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54822, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final UrlModel e() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54823, new Class[0], UrlModel.class)) {
            return this.f58310b.getAvatarThumb();
        }
        return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54823, new Class[0], UrlModel.class);
    }

    public final UrlModel f() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54824, new Class[0], UrlModel.class)) {
            return this.f58310b.getAvatarMedium();
        }
        return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54824, new Class[0], UrlModel.class);
    }

    public final String g() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54825, new Class[0], String.class)) {
            return this.f58310b.getNickname();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54825, new Class[0], String.class);
    }

    public final String h() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54827, new Class[0], String.class)) {
            return this.f58310b.getCity();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54827, new Class[0], String.class);
    }

    public final int i() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54828, new Class[0], Integer.TYPE)) {
            return this.f58310b.getFansCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54828, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean j() {
        if (!PatchProxy.isSupport(new Object[0], this, f58309a, false, 54829, new Class[0], Boolean.TYPE)) {
            return this.f58310b.isFlowcardMember();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58309a, false, 54829, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public r(@Nonnull User user) {
        this.f58310b = user;
    }
}

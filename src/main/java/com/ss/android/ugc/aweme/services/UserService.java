package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.account.login.loginlog.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.ss.android.ugc.aweme.profile.model.User;

public class UserService implements IUserService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void clearUser() {
    }

    @Deprecated
    public boolean getAuthGoods() {
        return d.a().getAuthGoods();
    }

    public User getCurrentUser() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71499, new Class[0], User.class)) {
            return d.a().getCurUser();
        }
        return (User) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71499, new Class[0], User.class);
    }

    public String getCurrentUserID() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71498, new Class[0], String.class)) {
            return d.a().getCurUserId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71498, new Class[0], String.class);
    }

    public int getVerifyStatus() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71500, new Class[0], Integer.TYPE)) {
            return d.a().getVerifyStatus();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71500, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean isLogin() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71495, new Class[0], Boolean.TYPE)) {
            return d.a().isLogin();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71495, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isOldUser() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71504, new Class[0], Boolean.TYPE)) {
            return ((Boolean) SharePrefCache.inst().getIsOldUser().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71504, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void refreshUser() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71503, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71503, new Class[0], Void.TYPE);
            return;
        }
        d.a().queryUser();
    }

    public void logout() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71496, new Class[0], Void.TYPE);
            return;
        }
        c.b().logout("user_service");
        a.a().a("userservice_loginout", "", false, "user_login_out", d.a().isLogin());
    }

    public boolean isUserEmpty(User user) {
        User user2 = user;
        if (!PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 71497, new Class[]{User.class}, Boolean.TYPE)) {
            return d.a().isUserEmpty(user2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 71497, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
    }

    public void setBroadcasterRoomId(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 71501, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 71501, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        d.a().getCurUser().setBroadcasterRoomId(j2);
    }

    public void setIsOldUser(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71505, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 71505, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharePrefCache.inst().getIsOldUser().a(Boolean.valueOf(z));
    }

    public void enterDouyinHelper(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71502, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71502, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        NotificationDetailActivity.a(context2, 4, i);
    }
}

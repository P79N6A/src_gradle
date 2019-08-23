package com.ss.android.ugc.aweme.profile.d;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.g;
import com.ss.android.ugc.aweme.profile.model.UpdateUserTime;
import com.ss.android.ugc.aweme.profile.model.User;

public final class ab implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61372a;

    public final void b() {
    }

    public final void c() {
    }

    public final void a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f61372a, false, 70046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61372a, false, 70046, new Class[0], Void.TYPE);
            return;
        }
        User curUser = d.a().getCurUser();
        if (ToolUtils.isMainProcess(com.ss.android.ugc.aweme.base.utils.d.a()) && !a.a() && d.a().isLogin() && curUser != null && curUser.getWxTag() != 0 && ((Boolean) SharePrefCache.inst().getIsEnableUpdateUserDialog().c()).booleanValue() && ((Integer) SharePrefCache.inst().getUpdateUserPosition().c()).intValue() != 1) {
            long currentTimeMillis = System.currentTimeMillis();
            UpdateUserTime updateUserTime = null;
            try {
                updateUserTime = (UpdateUserTime) new Gson().fromJson((String) SharePrefCache.inst().getAppEnterForegroundTime().c(), new TypeToken<UpdateUserTime>() {
                }.getType());
            } catch (Exception unused) {
            }
            if (updateUserTime == null) {
                updateUserTime = new UpdateUserTime();
                updateUserTime.setCount(1);
                updateUserTime.setCurrentTime(currentTimeMillis);
            } else if (currentTimeMillis - updateUserTime.getCurrentTime() <= 86400000) {
                updateUserTime.setCount(updateUserTime.getCount() + 1);
            } else {
                updateUserTime.setCurrentTime(currentTimeMillis);
                updateUserTime.setCount(1);
            }
            if (updateUserTime.getCount() == 3) {
                z = true;
            }
            ac.f61375b = z;
            SharePrefCache.inst().getAppEnterForegroundTime().a(new Gson().toJson((Object) updateUserTime));
        }
    }
}

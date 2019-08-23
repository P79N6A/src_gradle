package com.ss.android.ugc.aweme.profile.d;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ex;
import org.json.JSONException;
import org.json.JSONObject;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61382a;

    public static String c(User user) {
        User user2 = user;
        if (!PatchProxy.isSupport(new Object[]{user2}, null, f61382a, true, 70053, new Class[]{User.class}, String.class)) {
            return a(user2, false);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{user2}, null, f61382a, true, 70053, new Class[]{User.class}, String.class);
    }

    public static String a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f61382a, true, 70051, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f61382a, true, 70051, new Class[]{User.class}, String.class);
        } else if (user == null) {
            return "";
        } else {
            if (!a.b()) {
                return user.getNickname();
            }
            if (TextUtils.isEmpty(user.getUniqueId())) {
                return user.getShortId();
            }
            return user.getUniqueId();
        }
    }

    public static String b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f61382a, true, 70052, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f61382a, true, 70052, new Class[]{User.class}, String.class);
        } else if (user == null) {
            return "";
        } else {
            if (AbTestManager.a().m() == 2 || AbTestManager.a().m() == 5) {
                if (a.a()) {
                    return ex.b(user);
                }
                return user.getNickname();
            } else if (!a.b()) {
                return user.getNickname();
            } else {
                if (TextUtils.isEmpty(user.getUniqueId())) {
                    return user.getShortId();
                }
                return user.getUniqueId();
            }
        }
    }

    public static String d(User user) {
        String str;
        if (PatchProxy.isSupport(new Object[]{user}, null, f61382a, true, 70055, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f61382a, true, 70055, new Class[]{User.class}, String.class);
        }
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            str = user.getRemarkName();
        } else {
            str = b(user);
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return str;
    }

    public static void a(JSONObject jSONObject) throws JSONException {
        String str;
        long j;
        String str2;
        boolean z;
        Long l;
        String str3;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f61382a, true, 70056, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f61382a, true, 70056, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        User curUser = d.a().getCurUser();
        if (curUser == null || !d.a().isLogin()) {
            str = "";
            str2 = "";
            j = -1;
            z = false;
        } else {
            long parseLong = Long.parseLong(d.a().getCurUserId());
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                str3 = curUser.getShortId();
            } else {
                str3 = curUser.getUniqueId();
            }
            String bindPhone = curUser.getBindPhone();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (!(avatarMedium == null || avatarMedium.getUrlList() == null || avatarMedium.getUrlList().isEmpty())) {
                jSONObject2.put("avatar_url", avatarMedium.getUrlList().get(0));
            }
            str = bindPhone;
            str2 = str3;
            j = parseLong;
            z = true;
        }
        jSONObject2.put("is_login", z);
        jSONObject2.put("success", z);
        jSONObject2.put("user_id", String.valueOf(j));
        jSONObject2.put("nickname", "");
        jSONObject2.put("unique_id", str2);
        jSONObject2.put("bind_phone", str);
        jSONObject2.put("code", 1);
        if (PatchProxy.isSupport(new Object[]{curUser}, null, b.f39371a, true, 31880, new Class[]{User.class}, Long.class)) {
            l = (Long) PatchProxy.accessDispatch(new Object[]{curUser}, null, b.f39371a, true, 31880, new Class[]{User.class}, Long.class);
        } else {
            l = b.f39372b.b(curUser);
        }
        if (l != null) {
            jSONObject2.put("decoration_id", l);
        }
    }

    public static String a(User user, boolean z) {
        String b2;
        String str;
        if (PatchProxy.isSupport(new Object[]{user, Byte.valueOf(z ? (byte) 1 : 0)}, null, f61382a, true, 70054, new Class[]{User.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user, Byte.valueOf(z)}, null, f61382a, true, 70054, new Class[]{User.class, Boolean.TYPE}, String.class);
        }
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            b2 = user.getRemarkName();
        } else {
            b2 = b(user);
        }
        String str2 = b2;
        if (z) {
            str = "@";
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str + str2;
    }
}

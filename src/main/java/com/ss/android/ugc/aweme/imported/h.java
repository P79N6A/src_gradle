package com.ss.android.ugc.aweme.imported;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.profile.model.User;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52924a;

    public static String a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f52924a, true, 54475, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f52924a, true, 54475, new Class[]{User.class}, String.class);
        } else if (user == null) {
            return "";
        } else {
            if (!a.b()) {
                return user.getNickname();
            }
            if (PatchProxy.isSupport(new Object[]{user}, null, f52924a, true, 54476, new Class[]{User.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f52924a, true, 54476, new Class[]{User.class}, String.class);
            } else if (user == null) {
                return "";
            } else {
                if (!TextUtils.isEmpty(user.getUniqueId())) {
                    return user.getUniqueId();
                }
                if (user.getShortId() == null) {
                    return "";
                }
                return user.getShortId();
            }
        }
    }
}

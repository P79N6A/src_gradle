package com.ss.android.ugc.aweme.newfollow.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57405a;

    public static boolean a(Aweme aweme) {
        User user;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57405a, true, 61870, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57405a, true, 61870, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        if (user == null || !TextUtils.equals(user.getUid(), d.a().getCurUser().getUid())) {
            return false;
        }
        return true;
    }
}

package com.ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39838a;

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39838a, true, 32506, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39838a, true, 32506, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null || !TextUtils.equals(aweme.getAuthorUid(), d.a().getCurUserId())) {
            return false;
        } else {
            if (d.a().getCurUser().getCommerceUserLevel() == 0 && aweme.getAuthor() != null && aweme.getAuthor().getCommerceUserLevel() == 0) {
                return false;
            }
            return true;
        }
    }
}

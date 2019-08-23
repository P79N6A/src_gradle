package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class cr {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75694a;

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75694a, true, 88405, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75694a, true, 88405, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getDescendantsModel() == null || TextUtils.isEmpty(aweme.getDescendantsModel().getNotifyMsg())) {
            return false;
        } else {
            return true;
        }
    }
}

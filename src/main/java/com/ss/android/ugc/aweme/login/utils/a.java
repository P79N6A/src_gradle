package com.ss.android.ugc.aweme.login.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53838a;

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f53838a, true, 56489, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f53838a, true, 56489, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getTakeDownReason() != 6) {
            return false;
        } else {
            return true;
        }
    }

    public static String a(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, null, f53838a, true, 56490, new Class[]{Aweme.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, null, f53838a, true, 56490, new Class[]{Aweme.class, Integer.TYPE}, String.class);
        } else if (aweme == null || TextUtils.isEmpty(aweme.getTakeDownDesc()) || !a(aweme)) {
            return d.a().getString(i);
        } else {
            return aweme.getTakeDownDesc();
        }
    }
}

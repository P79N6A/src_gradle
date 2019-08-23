package com.ss.android.ugc.aweme.miniapp.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55818a;

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f55818a, true, 59535, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f55818a, true, 59535, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getMicroAppInfo() == null || aweme.getMicroAppInfo().getMiniAppCard() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static String b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f55818a, true, 59536, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f55818a, true, 59536, new Class[]{Aweme.class}, String.class);
        } else if (a(aweme)) {
            return aweme.getMicroAppInfo().getMiniAppCard().getImageUrl();
        } else {
            return "";
        }
    }

    public static String c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f55818a, true, 59539, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f55818a, true, 59539, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getMicroAppInfo() == null) {
                return "";
            }
            return aweme.getMicroAppInfo().getSchema();
        }
    }
}

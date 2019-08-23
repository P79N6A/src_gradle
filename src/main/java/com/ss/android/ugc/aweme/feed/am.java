package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45044a;

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45044a, true, 40244, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45044a, true, 40244, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45044a, true, 40245, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45044a, true, 40245, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45044a, true, 40246, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45044a, true, 40246, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null || aweme.getAuthor().getFollowStatus() != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean d(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45044a, true, 40247, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45044a, true, 40247, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null || aweme.getAuthor().getFollowerStatus() != 1) {
            return false;
        } else {
            return true;
        }
    }
}

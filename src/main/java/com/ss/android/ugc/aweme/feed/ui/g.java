package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46667a;

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f46667a, true, 42460, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f46667a, true, 42460, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getShareInfo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f46667a, true, 42461, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f46667a, true, 42461, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (c(aweme)) {
            return d(aweme);
        } else {
            return f(aweme);
        }
    }

    public static boolean c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f46667a, true, 42462, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f46667a, true, 42462, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeType() != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean d(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f46667a, true, 42464, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f46667a, true, 42464, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null || aweme.getImageInfos() == null || aweme.getImageInfos().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f46667a, true, 42465, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f46667a, true, 42465, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getStatus() == null || !aweme.getStatus().isReviewed() || !aweme.getStatus().isSelfSee()) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f46667a, true, 42463, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f46667a, true, 42463, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null || aweme.getVideo() == null) {
            return false;
        } else {
            return true;
        }
    }
}

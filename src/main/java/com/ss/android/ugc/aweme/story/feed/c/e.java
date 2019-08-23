package com.ss.android.ugc.aweme.story.feed.c;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72498a;

    public static f a(FragmentActivity fragmentActivity) {
        if (fragmentActivity instanceof StoryDetailActivity) {
            return ((StoryDetailActivity) fragmentActivity).f72444d;
        }
        return null;
    }

    public static String b(FragmentActivity fragmentActivity) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f72498a, true, 83685, new Class[]{FragmentActivity.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f72498a, true, 83685, new Class[]{FragmentActivity.class}, String.class);
        }
        f a2 = a(fragmentActivity);
        if (a2 == null) {
            return "";
        }
        return a2.eventType;
    }
}

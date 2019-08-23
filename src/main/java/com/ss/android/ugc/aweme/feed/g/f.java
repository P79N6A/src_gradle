package com.ss.android.ugc.aweme.feed.g;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.video.o;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45357a;

    @Nullable
    public static o a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f45357a, true, 41338, new Class[]{Activity.class}, o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[]{activity2}, null, f45357a, true, 41338, new Class[]{Activity.class}, o.class);
        } else if (activity2 instanceof FragmentActivity) {
            return FeedSharePlayerViewModel.getPlayerManager((FragmentActivity) activity2);
        } else {
            return null;
        }
    }

    public static boolean b(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f45357a, true, 41339, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, null, f45357a, true, 41339, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (a.a() || a(activity) == null) {
            return false;
        } else {
            return true;
        }
    }
}

package com.ss.android.ugc.aweme.story.feed.c;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.model.FollowLifeFeedModel;
import com.ss.android.ugc.aweme.story.feed.model.FriendsLifeFeedModel;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import org.jetbrains.annotations.Nullable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72496a;

    @Nullable
    public static LifeFeedModel a(@Nullable Context context, int i) {
        Class cls;
        Context context2 = context;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, null, f72496a, true, 83683, new Class[]{Context.class, Integer.TYPE}, LifeFeedModel.class)) {
            return (LifeFeedModel) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, null, f72496a, true, 83683, new Class[]{Context.class, Integer.TYPE}, LifeFeedModel.class);
        } else if (!(context2 instanceof FragmentActivity)) {
            return null;
        } else {
            ViewModelProvider of = ViewModelProviders.of((FragmentActivity) context2);
            if (i2 == 2) {
                cls = FollowLifeFeedModel.class;
            } else if (i2 == 1) {
                cls = FriendsLifeFeedModel.class;
            } else {
                cls = LifeFeedModel.class;
            }
            return (LifeFeedModel) of.get(cls);
        }
    }
}

package com.ss.android.ugc.aweme.story.detail;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72442a;

    public static boolean a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f72442a, true, 83133, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f72442a, true, 83133, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || user.isHasUnreadStory() == null) {
            return false;
        } else {
            return user.isHasUnreadStory().booleanValue();
        }
    }
}

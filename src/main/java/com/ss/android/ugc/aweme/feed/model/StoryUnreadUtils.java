package com.ss.android.ugc.aweme.feed.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ex;

public class StoryUnreadUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean hasUnreadStory(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, changeQuickRedirect, true, 41474, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, changeQuickRedirect, true, 41474, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || user.isHasUnreadStory() == null) {
            return false;
        } else {
            return user.isHasUnreadStory().booleanValue();
        }
    }

    public static boolean hasUnreadStoryWithCheck(User user, User user2) {
        User user3 = user2;
        if (PatchProxy.isSupport(new Object[]{user, user3}, null, changeQuickRedirect, true, 41475, new Class[]{User.class, User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user, user3}, null, changeQuickRedirect, true, 41475, new Class[]{User.class, User.class}, Boolean.TYPE)).booleanValue();
        }
        if (ex.g(user) && ex.g(user2) && user.isHasUnreadStory() != null) {
            user3.setHasUnreadStory(user.isHasUnreadStory().booleanValue());
        }
        return hasUnreadStory(user2);
    }
}

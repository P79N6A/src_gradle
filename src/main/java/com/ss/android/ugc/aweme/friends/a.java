package com.ss.android.ugc.aweme.friends;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48669a;

    public static int a(List<User> list, User user) {
        List<User> list2 = list;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{list2, user2}, null, f48669a, true, 46213, new Class[]{List.class, User.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list2, user2}, null, f48669a, true, 46213, new Class[]{List.class, User.class}, Integer.TYPE)).intValue();
        } else if (list2 == null || list.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (a(list2.get(i), user2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static boolean b(List<User> list, User user) {
        List<User> list2 = list;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{list2, user2}, null, f48669a, true, 46214, new Class[]{List.class, User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list2, user2}, null, f48669a, true, 46214, new Class[]{List.class, User.class}, Boolean.TYPE)).booleanValue();
        } else if (list2 == null || list.isEmpty()) {
            return false;
        } else {
            for (User next : list) {
                if (a(next, user2)) {
                    return list2.remove(next);
                }
            }
            return false;
        }
    }

    private static boolean a(User user, User user2) {
        if (PatchProxy.isSupport(new Object[]{user, user2}, null, f48669a, true, 46211, new Class[]{User.class, User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user, user2}, null, f48669a, true, 46211, new Class[]{User.class, User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || user2 == null) {
            return false;
        } else {
            return TextUtils.equals(user.getUid(), user2.getUid());
        }
    }

    public static boolean a(Collection<User> collection, User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{collection, user2}, null, f48669a, true, 46212, new Class[]{Collection.class, User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{collection, user2}, null, f48669a, true, 46212, new Class[]{Collection.class, User.class}, Boolean.TYPE)).booleanValue();
        } else if (collection == null || collection.isEmpty()) {
            return false;
        } else {
            for (User a2 : collection) {
                if (a(a2, user2)) {
                    return true;
                }
            }
            return false;
        }
    }
}

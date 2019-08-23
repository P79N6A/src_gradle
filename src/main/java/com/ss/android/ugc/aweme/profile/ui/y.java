package com.ss.android.ugc.aweme.profile.ui;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63168a;

    public static boolean a(User user) {
        if (!PatchProxy.isSupport(new Object[]{user}, null, f63168a, true, 68053, new Class[]{User.class}, Boolean.TYPE)) {
            return b(user);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f63168a, true, 68053, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
    }

    public static List<FollowerDetail> a(List<FollowerDetail> list) {
        List<FollowerDetail> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f63168a, true, 68056, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, null, f63168a, true, 68056, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        arrayList.clear();
        arrayList.addAll(list2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            FollowerDetail followerDetail = (FollowerDetail) it2.next();
            if (followerDetail != null && followerDetail.getFansCount() <= 0) {
                it2.remove();
            }
        }
        return arrayList;
    }

    public static FollowerDetail b(List<FollowerDetail> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f63168a, true, 68057, new Class[]{List.class}, FollowerDetail.class)) {
            return (FollowerDetail) PatchProxy.accessDispatch(new Object[]{list}, null, f63168a, true, 68057, new Class[]{List.class}, FollowerDetail.class);
        } else if (CollectionUtils.isEmpty(list)) {
            return null;
        } else {
            for (FollowerDetail next : list) {
                if (next != null && TextUtils.equals(next.getPackageName(), "com.ss.android.ugc.aweme")) {
                    return next;
                }
            }
            return null;
        }
    }

    private static boolean b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f63168a, true, 68054, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f63168a, true, 68054, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || CollectionUtils.isEmpty(user.getFollowerDetailList())) {
            return false;
        } else {
            List<FollowerDetail> a2 = a(user.getFollowerDetailList());
            if (!CollectionUtils.isEmpty(a2) && a2.size() > 1) {
                return true;
            }
            return false;
        }
    }
}

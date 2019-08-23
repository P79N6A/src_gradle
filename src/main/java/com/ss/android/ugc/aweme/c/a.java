package com.ss.android.ugc.aweme.c;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35250a;

    public static <T extends User> void a(@NotNull List<User> list, List<T> list2) {
        List<User> list3 = list;
        if (PatchProxy.isSupport(new Object[]{list3, list2}, null, f35250a, true, 23866, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list2}, null, f35250a, true, 23866, new Class[]{List.class, List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list2)) {
            for (T t : list2) {
                if (!com.ss.android.ugc.aweme.friends.a.a((Collection<User>) list3, (User) t)) {
                    list3.add(t);
                }
            }
        }
    }
}

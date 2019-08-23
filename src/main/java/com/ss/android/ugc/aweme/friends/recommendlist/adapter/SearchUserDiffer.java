package com.ss.android.ugc.aweme.friends.recommendlist.adapter;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/SearchUserDiffer;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "()V", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchUserDiffer extends DiffUtil.ItemCallback<SearchUser> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48975a;

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        SearchUser searchUser = (SearchUser) obj;
        SearchUser searchUser2 = (SearchUser) obj2;
        if (PatchProxy.isSupport(new Object[]{searchUser, searchUser2}, this, f48975a, false, 46744, new Class[]{SearchUser.class, SearchUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{searchUser, searchUser2}, this, f48975a, false, 46744, new Class[]{SearchUser.class, SearchUser.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(searchUser, "p0");
        Intrinsics.checkParameterIsNotNull(searchUser2, "p1");
        return Intrinsics.areEqual((Object) searchUser.user, (Object) searchUser2.user);
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        SearchUser searchUser = (SearchUser) obj;
        SearchUser searchUser2 = (SearchUser) obj2;
        if (PatchProxy.isSupport(new Object[]{searchUser, searchUser2}, this, f48975a, false, 46743, new Class[]{SearchUser.class, SearchUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{searchUser, searchUser2}, this, f48975a, false, 46743, new Class[]{SearchUser.class, SearchUser.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(searchUser, "p0");
        Intrinsics.checkParameterIsNotNull(searchUser2, "p1");
        User user = searchUser.user;
        Intrinsics.checkExpressionValueIsNotNull(user, "p0.user");
        String uid = user.getUid();
        User user2 = searchUser2.user;
        Intrinsics.checkExpressionValueIsNotNull(user2, "p1.user");
        return Intrinsics.areEqual((Object) uid, (Object) user2.getUid());
    }
}

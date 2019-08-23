package com.ss.android.ugc.aweme.friends.friendlist;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.adapter.c;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListDiffer;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "()V", "areContentsTheSame", "", "old", "new", "areItemsTheSame", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendListDiffer extends DiffUtil.ItemCallback<c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48885a;

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        if (PatchProxy.isSupport(new Object[]{cVar, cVar2}, this, f48885a, false, 46381, new Class[]{c.class, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar, cVar2}, this, f48885a, false, 46381, new Class[]{c.class, c.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(cVar, "old");
        Intrinsics.checkParameterIsNotNull(cVar2, "new");
        if (!Intrinsics.areEqual((Object) cVar.getSortLetters(), (Object) cVar2.getSortLetters()) || !Intrinsics.areEqual((Object) cVar.getUser(), (Object) cVar2.getUser())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        if (PatchProxy.isSupport(new Object[]{cVar, cVar2}, this, f48885a, false, 46380, new Class[]{c.class, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar, cVar2}, this, f48885a, false, 46380, new Class[]{c.class, c.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(cVar, "old");
        Intrinsics.checkParameterIsNotNull(cVar2, "new");
        User user = cVar.getUser();
        Intrinsics.checkExpressionValueIsNotNull(user, "old.user");
        String uid = user.getUid();
        User user2 = cVar2.getUser();
        Intrinsics.checkExpressionValueIsNotNull(user2, "new.user");
        return Intrinsics.areEqual((Object) uid, (Object) user2.getUid());
    }
}

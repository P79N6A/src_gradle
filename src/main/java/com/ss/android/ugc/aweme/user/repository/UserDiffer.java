package com.ss.android.ugc.aweme.user.repository;

import android.support.v7.util.DiffUtil;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/UserDiffer;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "()V", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserDiffer extends DiffUtil.ItemCallback<User> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75359a;

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        User user = (User) obj;
        User user2 = (User) obj2;
        if (PatchProxy.isSupport(new Object[]{user, user2}, this, f75359a, false, 87680, new Class[]{User.class, User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user, user2}, this, f75359a, false, 87680, new Class[]{User.class, User.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(user, "p0");
        Intrinsics.checkParameterIsNotNull(user2, "p1");
        return TextUtils.equals(user.getUid(), user2.getUid());
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        User user = (User) obj;
        User user2 = (User) obj2;
        if (PatchProxy.isSupport(new Object[]{user, user2}, this, f75359a, false, 87679, new Class[]{User.class, User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user, user2}, this, f75359a, false, 87679, new Class[]{User.class, User.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(user, "p0");
        Intrinsics.checkParameterIsNotNull(user2, "p1");
        return TextUtils.equals(user.getUid(), user2.getUid());
    }
}

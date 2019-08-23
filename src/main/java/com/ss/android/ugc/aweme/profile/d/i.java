package com.ss.android.ugc.aweme.profile.d;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.ex;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/util/GuideContactToEditRemarkUtils;", "", "()V", "isEnable", "", "context", "Landroid/content/Context;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "followStatus", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61422a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f61423b = new i();

    private i() {
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context, @NotNull User user, @NotNull FollowStatus followStatus) {
        boolean z;
        User user2 = user;
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{context, user2, followStatus2}, null, f61422a, true, 69927, new Class[]{Context.class, User.class, FollowStatus.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, user2, followStatus2}, null, f61422a, true, 69927, new Class[]{Context.class, User.class, FollowStatus.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        Intrinsics.checkParameterIsNotNull(followStatus2, "followStatus");
        if (!a.a() && !ex.e(user) && !followStatus.getIsEnterprise()) {
            if (context != null) {
                z = ap.b(context);
            } else {
                z = false;
            }
            if (!z || followStatus2.followStatus == 0 || followStatus2.followStatus == 4 || followStatus2.contactName == null) {
                return false;
            }
            return true;
        }
        return false;
    }
}

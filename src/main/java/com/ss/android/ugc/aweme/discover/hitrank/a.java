package com.ss.android.ugc.aweme.discover.hitrank;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hitrank/HitRankUtils;", "", "()V", "isStar", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "shouldShowCommentInput", "taskType", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42382a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f42383b = new a();

    private a() {
    }

    @JvmStatic
    public static final boolean a(@Nullable User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f42382a, true, 36377, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f42382a, true, 36377, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || (user.getStarBillboardRank() <= 0 && !user.isStar())) {
            return false;
        } else {
            return true;
        }
    }
}

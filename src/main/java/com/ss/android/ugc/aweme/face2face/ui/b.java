package com.ss.android.ugc.aweme.face2face.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.constants.a;
import com.ss.android.ugc.aweme.profile.api.FollowApi;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44061a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f44062b;

    b(Object[] objArr) {
        this.f44062b = objArr;
    }

    public final Object call() {
        FollowStatus followStatus;
        if (PatchProxy.isSupport(new Object[0], this, f44061a, false, 39207, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f44061a, false, 39207, new Class[0], Object.class);
        }
        Object[] objArr = this.f44062b;
        if (((Integer) objArr[1]).intValue() == 1) {
            String str = (String) objArr[0];
            if (PatchProxy.isSupport(new Object[]{str}, null, FollowApi.f61317a, true, 67446, new Class[]{String.class}, FollowStatus.class)) {
                followStatus = (FollowStatus) PatchProxy.accessDispatch(new Object[]{str}, null, FollowApi.f61317a, true, 67446, new Class[]{String.class}, FollowStatus.class);
            } else {
                FollowStatus followStatus2 = (FollowStatus) FollowApi.f61318b.face2FaceFollow(str).execute().body();
                followStatus2.userId = str;
                return followStatus2;
            }
        } else {
            String str2 = (String) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            int a2 = a.a((String) objArr[3]);
            String str3 = (String) objArr[4];
            String str4 = (String) objArr[6];
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(a2), str3, str4}, null, FollowApi.f61317a, true, 67444, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, FollowStatus.class)) {
                Object[] objArr2 = {str2, Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(a2), str3, str4};
                return (FollowStatus) PatchProxy.accessDispatch(objArr2, null, FollowApi.f61317a, true, 67444, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, FollowStatus.class);
            }
            followStatus = FollowApi.a(str2, str4, intValue, intValue2, a2, str3, -1);
        }
        return followStatus;
    }
}

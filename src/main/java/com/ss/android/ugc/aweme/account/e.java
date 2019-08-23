package com.ss.android.ugc.aweme.account;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.IAgeGateService;
import com.ss.android.ugc.aweme.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0001H\u0016J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/account/AgeGateService;", "Lcom/ss/android/ugc/aweme/IAgeGateService;", "()V", "disableFtcAgeGate", "", "keepCallback", "showFTCAgeGateForCurrentUser", "activity", "Landroid/app/Activity;", "listener", "Lcom/ss/android/ugc/aweme/IAgeGateResultListener;", "syncAgeGateInfo", "", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class e implements IAgeGateService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31838a;

    public final boolean disableFtcAgeGate() {
        return true;
    }

    @NotNull
    public final IAgeGateService keepCallback() {
        return this;
    }

    public final boolean showFTCAgeGateForCurrentUser(@NotNull Activity activity, @Nullable l lVar) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, lVar}, this, f31838a, false, 19541, new Class[]{Activity.class, l.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, lVar}, this, f31838a, false, 19541, new Class[]{Activity.class, l.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        return false;
    }

    public final void syncAgeGateInfo() {
    }
}

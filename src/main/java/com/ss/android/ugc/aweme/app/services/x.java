package com.ss.android.ugc.aweme.app.services;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.ae.c;
import com.ss.android.ugc.aweme.main.h.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/PushLaunchPageAssistantService;", "Lcom/ss/android/ugc/aweme/main/service/IPushLaunchPageAssistantService;", "()V", "onFinish", "", "activity", "Landroid/app/Activity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class x implements r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34301a;

    public final void a(@NotNull Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f34301a, false, 23660, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f34301a, false, 23660, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        c.a(activity);
    }
}

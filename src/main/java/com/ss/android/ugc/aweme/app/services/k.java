package com.ss.android.ugc.aweme.app.services;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.main.h.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/CurrentContextService;", "Lcom/ss/android/ugc/aweme/main/service/ICurrentContextService;", "()V", "createSmsReceiver", "Landroid/content/BroadcastReceiver;", "context", "Landroid/content/Context;", "smsLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "", "getCurrentActivity", "Landroid/app/Activity;", "getMainActivityIntent", "Landroid/content/Intent;", "gotoMainPageForChildrenMode", "", "activity", "isMainActivityTop", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34280a;

    @Nullable
    public final Activity a() {
        if (PatchProxy.isSupport(new Object[0], this, f34280a, false, 23613, new Class[0], Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[0], this, f34280a, false, 23613, new Class[0], Activity.class);
        }
        p a2 = p.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeRuntime.inst()");
        return a2.e();
    }
}

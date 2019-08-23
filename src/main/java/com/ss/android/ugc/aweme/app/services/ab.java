package com.ss.android.ugc.aweme.app.services;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.h.t;
import com.ss.android.ugc.aweme.services.IAVService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/ShotService;", "Lcom/ss/android/ugc/aweme/main/service/IShotService;", "()V", "turnStoryPublishPage", "", "intent", "Landroid/content/Intent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ab implements t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34269a;

    public final void a(@NotNull Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f34269a, false, 23675, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, f34269a, false, 23675, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(intent2, "intent");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).turnStoryRecordPage(intent2);
    }
}

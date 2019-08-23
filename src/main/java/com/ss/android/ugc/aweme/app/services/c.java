package com.ss.android.ugc.aweme.app.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.h.d;
import com.ss.android.ugc.aweme.sec.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/AntiSpamService;", "Lcom/ss/android/ugc/aweme/main/service/IAntispamService;", "()V", "upload", "", "data", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34273a;

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34273a, false, 23586, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34273a, false, 23586, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "data");
        a.a(str);
    }
}

package com.ss.android.ugc.aweme.app.services;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.main.h.g;
import com.ss.android.ugc.aweme.setting.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/AwemeService;", "Lcom/ss/android/ugc/aweme/main/service/IAwemeService;", "()V", "isAllowDynamicCover", "", "context", "Landroid/content/Context;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34279a;

    public final boolean a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f34279a, false, 23609, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f34279a, false, 23609, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if ((!a.a() || !c.a()) && com.ss.android.ugc.aweme.framework.d.a.a(context) && f.a(context)) {
            return true;
        }
        return false;
    }
}

package com.ss.android.ugc.aweme.commercialize.utils;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.a.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u001d\u0010\u0003\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0007H\b¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/AdLandingPageUtils;", "", "()V", "getAdLandingPageConfig", "Lcom/ss/android/sdk/activity/model/AdLandingPageConfig;", "", "f", "Lkotlin/Function1;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39781a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f39782b = new f();

    private f() {
    }

    @JvmStatic
    @Nullable
    public static final a a() {
        if (PatchProxy.isSupport(new Object[0], null, f39781a, true, 32327, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f39781a, true, 32327, new Class[0], a.class);
        }
        SharePrefCache inst = SharePrefCache.inst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
        an adLandingPageConfig = inst.getAdLandingPageConfig();
        if (adLandingPageConfig != null) {
            String str = (String) adLandingPageConfig.c();
            if (str != null) {
                return (a) new Gson().fromJson(str, a.class);
            }
        }
        return null;
    }
}

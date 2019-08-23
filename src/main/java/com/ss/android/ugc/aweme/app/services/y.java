package com.ss.android.ugc.aweme.app.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.main.h.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/RegionService;", "Lcom/ss/android/ugc/aweme/main/service/IRegionService;", "()V", "getCurRegionLoginType", "", "", "getRegion", "getSimCountry", "isInKorean", "", "isIndonesia", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class y implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34302a;

    @NotNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f34302a, false, 23663, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f34302a, false, 23663, new Class[0], String.class);
        }
        String b2 = e.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "RegionHelper.getRegion()");
        return b2;
    }
}

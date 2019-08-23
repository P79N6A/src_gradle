package com.ss.android.ugc.aweme.discover.helper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/helper/DiscoverHelper;", "", "()V", "formatMoney", "", "cents", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42329a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f42330b = new c();

    private c() {
    }

    @NotNull
    public final String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f42329a, false, 36316, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f42329a, false, 36316, new Class[]{Long.TYPE}, String.class);
        }
        return "¥ " + (((float) j2) / 100.0f);
    }
}

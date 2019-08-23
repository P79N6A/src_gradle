package com.ss.android.ugc.aweme.imported;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52915a;

    @NonNull
    public static String a(@Nullable com.ss.android.ugc.aweme.shortvideo.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, null, f52915a, true, 54462, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{eVar}, null, f52915a, true, 54462, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, String.class);
        }
        String str = null;
        if (eVar != null) {
            str = eVar.getMid();
        }
        if (str != null) {
            return str;
        }
        return "";
    }
}

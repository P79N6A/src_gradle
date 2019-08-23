package com.ss.android.ugc.aweme.language;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52998a;

    public final Locale b() {
        return Locale.CHINA;
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f52998a, false, 55041, new Class[0], String.class)) {
            return Locale.CHINA.getLanguage();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f52998a, false, 55041, new Class[0], String.class);
    }
}

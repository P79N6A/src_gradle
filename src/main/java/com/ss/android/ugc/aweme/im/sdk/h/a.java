package com.ss.android.ugc.aweme.im.sdk.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51676a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f51676a, true, 53233, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f51676a, true, 53233, new Class[]{String.class}, String.class);
        }
        new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        return r1.format(time) + str2;
    }
}

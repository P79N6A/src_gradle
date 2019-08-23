package com.ss.android.ugc.aweme.profile;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.i18n.c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61667a;

    /* renamed from: b  reason: collision with root package name */
    public static final SimpleDateFormat f61668b;

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f61669c;

    /* renamed from: d  reason: collision with root package name */
    private static final SimpleDateFormat f61670d;

    static {
        String str;
        String str2;
        String str3;
        if (c.a()) {
            str = "yyyy-MM-dd";
        } else {
            str = "yyyy年MM月dd日";
        }
        f61668b = new SimpleDateFormat(str, Locale.getDefault());
        if (c.a()) {
            str2 = "MM-dd";
        } else {
            str2 = "MM月dd日";
        }
        f61669c = new SimpleDateFormat(str2, Locale.getDefault());
        if (c.a()) {
            str3 = "hh:mm";
        } else {
            str3 = "hh点mm分";
        }
        f61670d = new SimpleDateFormat(str3, Locale.getDefault());
    }

    public static long a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f61667a, true, 67349, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, null, f61667a, true, 67349, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return simpleDateFormat.parse(str2).getTime() / 1000;
        } catch (ParseException unused) {
            return -1;
        }
    }
}

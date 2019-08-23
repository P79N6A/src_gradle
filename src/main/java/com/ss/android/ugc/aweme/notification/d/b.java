package com.ss.android.ugc.aweme.notification.d;

import android.content.Context;
import android.text.format.DateFormat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.utils.aw;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58111a;

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f58112b = new SimpleDateFormat("MM-dd");

    /* renamed from: c  reason: collision with root package name */
    private static final SimpleDateFormat f58113c = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    /* renamed from: d  reason: collision with root package name */
    private static final SimpleDateFormat f58114d = new SimpleDateFormat("yyyy-MM-dd aa h:mm", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale());

    /* renamed from: e  reason: collision with root package name */
    private static final SimpleDateFormat f58115e = new SimpleDateFormat("HH:mm");

    /* renamed from: f  reason: collision with root package name */
    private static final SimpleDateFormat f58116f = new SimpleDateFormat("aa h:mm", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale());

    private static String a(Date date) {
        Date date2 = date;
        if (PatchProxy.isSupport(new Object[]{date2}, null, f58111a, true, 63257, new Class[]{Date.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{date2}, null, f58111a, true, 63257, new Class[]{Date.class}, String.class);
        }
        String[] strArr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar instance = Calendar.getInstance();
        instance.setTime(date2);
        int i = instance.get(7) - 1;
        if (i < 0) {
            i = 0;
        }
        return strArr[i];
    }

    public static String a(Context context, long j) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j2)}, null, f58111a, true, 63256, new Class[]{Context.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, new Long(j2)}, null, f58111a, true, 63256, new Class[]{Context.class, Long.TYPE}, String.class);
        } else if (j2 == 0) {
            return "";
        } else {
            boolean is24HourFormat = DateFormat.is24HourFormat(context);
            if (is24HourFormat) {
                simpleDateFormat = f58115e;
            } else {
                simpleDateFormat = f58116f;
            }
            if (is24HourFormat) {
                simpleDateFormat2 = f58113c;
            } else {
                simpleDateFormat2 = f58114d;
            }
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            if (instance.get(1) < Calendar.getInstance().get(1)) {
                return f58113c.format(instance.getTime());
            }
            long currentTimeMillis = System.currentTimeMillis() - j2;
            if (currentTimeMillis <= 300000) {
                return context.getResources().getString(C0906R.string.b41);
            }
            if (aw.a(j)) {
                return simpleDateFormat.format(instance.getTime());
            }
            if (aw.b(j)) {
                return context.getResources().getString(C0906R.string.dui) + " " + simpleDateFormat.format(instance.getTime());
            } else if (currentTimeMillis > 259200000) {
                return simpleDateFormat2.format(instance.getTime());
            } else {
                return a(new Date(j2)) + " " + simpleDateFormat.format(instance.getTime());
            }
        }
    }
}

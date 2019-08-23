package com.ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.SSActivity;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34510a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final int f34511b = 2130968710;

    /* renamed from: c  reason: collision with root package name */
    public static final int f34512c = 2130968724;

    /* renamed from: d  reason: collision with root package name */
    public static final int f34513d = 2130968712;

    /* renamed from: e  reason: collision with root package name */
    public static final int f34514e = 2130968721;

    /* renamed from: f  reason: collision with root package name */
    public static final int f34515f = 2130968711;
    public static final int g = 2130968725;
    public static final int h = 2130968714;
    public static final int i = 2130968723;

    /* renamed from: j */
    public static final int r = 2130968593;

    /* renamed from: k */
    public static final int s = 2130968594;

    public static void a(Activity activity, int i2) {
        int i3;
        Activity activity2 = activity;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i2)}, null, f34510a, true, 24056, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i2)}, null, f34510a, true, 24056, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i2) {
            case 0:
                i4 = f34513d;
                i3 = f34514e;
                break;
            case 1:
                break;
            case 2:
                i4 = h;
                i3 = i;
                break;
            case 3:
                i4 = r;
                break;
            case 4:
                i4 = f34511b;
                i3 = f34512c;
                break;
            default:
                i4 = f34513d;
                i3 = f34514e;
                break;
        }
        i3 = 0;
        if (activity2 instanceof SSActivity) {
            ((SSActivity) activity2).a(i4, i3);
        } else {
            activity2.overridePendingTransition(i4, i3);
        }
    }

    public static void b(Activity activity, int i2) {
        int i3;
        Activity activity2 = activity;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i2)}, null, f34510a, true, 24057, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i2)}, null, f34510a, true, 24057, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE);
        } else if (activity2 != null) {
            switch (i2) {
                case 0:
                    i4 = f34511b;
                    i3 = f34512c;
                    break;
                case 1:
                    i3 = 0;
                    break;
                case 2:
                    i4 = f34515f;
                    i3 = g;
                    break;
                case 3:
                    i3 = s;
                    break;
                case 4:
                    i4 = f34513d;
                    i3 = f34514e;
                    break;
                default:
                    i4 = f34511b;
                    i3 = f34512c;
                    break;
            }
            if (activity2 instanceof SSActivity) {
                ((SSActivity) activity2).a(i4, i3);
            } else {
                activity2.overridePendingTransition(i4, i3);
            }
        }
    }
}

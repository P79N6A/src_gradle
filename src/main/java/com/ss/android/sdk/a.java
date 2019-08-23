package com.ss.android.sdk;

import android.app.Activity;
import com.ss.android.sdk.activity.SSActivity;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f30601a = 2130968710;

    /* renamed from: b  reason: collision with root package name */
    public static final int f30602b = 2130968724;

    /* renamed from: c  reason: collision with root package name */
    public static final int f30603c = 2130968712;

    /* renamed from: d  reason: collision with root package name */
    public static final int f30604d = 2130968721;

    /* renamed from: e  reason: collision with root package name */
    public static final int f30605e = 2130968711;

    /* renamed from: f  reason: collision with root package name */
    public static final int f30606f = 2130968725;
    public static final int g = 2130968714;
    public static final int h = 2130968723;

    public static void a(Activity activity, int i) {
        int i2;
        int i3 = 0;
        switch (i) {
            case 0:
                i3 = f30603c;
                i2 = f30604d;
                break;
            case 1:
                i2 = 0;
                break;
            case 2:
                i3 = g;
                i2 = h;
                break;
            default:
                i3 = f30603c;
                i2 = f30604d;
                break;
        }
        if (activity instanceof SSActivity) {
            ((SSActivity) activity).a(i3, i2);
        } else {
            activity.overridePendingTransition(i3, i2);
        }
    }

    public static void b(Activity activity, int i) {
        int i2;
        int i3 = 0;
        switch (i) {
            case 0:
                i3 = f30601a;
                i2 = f30602b;
                break;
            case 1:
                i2 = 0;
                break;
            case 2:
                i3 = f30605e;
                i2 = f30606f;
                break;
            default:
                i3 = f30601a;
                i2 = f30602b;
                break;
        }
        if (activity instanceof SSActivity) {
            ((SSActivity) activity).a(i3, i2);
        } else {
            activity.overridePendingTransition(i3, i2);
        }
    }
}

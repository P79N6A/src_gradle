package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;
import com.vivo.push.model.InsideNotificationItem;

public final class h implements BaseNotifyDataAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Resources f81662a;

    /* renamed from: b  reason: collision with root package name */
    private String f81663b;

    /* renamed from: c  reason: collision with root package name */
    private String f81664c;

    /* renamed from: d  reason: collision with root package name */
    private String f81665d;

    public final int getDefaultNotifyIcon() {
        int i;
        String str = this.f81665d;
        while (true) {
            if (Build.VERSION.SDK_INT < 26) {
                break;
            } else if (TextUtils.isEmpty(str)) {
                o.d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
                break;
            } else {
                String str2 = "vivo_push_ard" + str + "_notifyicon";
                i = this.f81662a.getIdentifier(str2, "drawable", this.f81663b);
                if (i > 0) {
                    o.d("DefaultNotifyDataAdapter", "get notify icon : ".concat(String.valueOf(str2)));
                    break;
                }
                o.d("DefaultNotifyDataAdapter", "get notify error icon : ".concat(String.valueOf(str2)));
                str = str.substring(0, str.length() - 1);
            }
        }
        i = -1;
        if (i != -1) {
            return i;
        }
        return a(this.f81664c);
    }

    public final int getDefaultSmallIconId() {
        int i;
        String str = this.f81665d;
        while (true) {
            if (Build.VERSION.SDK_INT < 26) {
                break;
            } else if (TextUtils.isEmpty(str)) {
                o.d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
                break;
            } else {
                String str2 = "vivo_push_ard" + str + "_icon";
                i = this.f81662a.getIdentifier(str2, "drawable", this.f81663b);
                if (i > 0) {
                    o.d("DefaultNotifyDataAdapter", "get small icon : ".concat(String.valueOf(str2)));
                    break;
                }
                o.d("DefaultNotifyDataAdapter", "get small error icon : ".concat(String.valueOf(str2)));
                str = str.substring(0, str.length() - 1);
            }
        }
        i = -1;
        if (i != -1) {
            return i;
        }
        return b(this.f81664c);
    }

    public final int getNotifyMode(InsideNotificationItem insideNotificationItem) {
        if (Build.VERSION.SDK_INT >= 21) {
            return 2;
        }
        return 1;
    }

    private int a(String str) {
        while (!TextUtils.isEmpty(str)) {
            Resources resources = this.f81662a;
            int identifier = resources.getIdentifier("vivo_push_rom" + str + "_notifyicon", "drawable", this.f81663b);
            if (identifier > 0) {
                return identifier;
            }
            str = str.substring(0, str.length() - 1);
        }
        return this.f81662a.getIdentifier("vivo_push_notifyicon", "drawable", this.f81663b);
    }

    private int b(String str) {
        while (!TextUtils.isEmpty(str)) {
            Resources resources = this.f81662a;
            int identifier = resources.getIdentifier("vivo_push_rom" + str + "_icon", "drawable", this.f81663b);
            if (identifier > 0) {
                return identifier;
            }
            str = str.substring(0, str.length() - 1);
        }
        return this.f81662a.getIdentifier("vivo_push_icon", "drawable", this.f81663b);
    }

    public final void init(Context context) {
        String str;
        this.f81663b = context.getPackageName();
        this.f81662a = context.getResources();
        this.f81664c = j.a();
        String str2 = Build.VERSION.RELEASE;
        if (TextUtils.isEmpty(str2)) {
            str = null;
        } else {
            str = str2.replace(ClassUtils.PACKAGE_SEPARATOR, "");
        }
        this.f81665d = str;
    }
}

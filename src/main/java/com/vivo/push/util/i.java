package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.google.a.a.a.a.a.a;

public final class i implements BaseNotifyLayoutAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Resources f81666a;

    /* renamed from: b  reason: collision with root package name */
    private String f81667b;

    public final int getNotificationLayout() {
        return this.f81666a.getIdentifier("push_notify", "layout", this.f81667b);
    }

    public final int getSuitIconId() {
        Resources resources;
        String str;
        if (j.g) {
            resources = this.f81666a;
            str = "notify_icon_rom30";
        } else if (j.f81673f) {
            resources = this.f81666a;
            str = "notify_icon_rom20";
        } else {
            resources = this.f81666a;
            str = "notify_icon";
        }
        return resources.getIdentifier(str, "id", this.f81667b);
    }

    public final int getTitleColor() {
        int i;
        try {
            i = ((Integer) y.a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e2) {
            a.b(e2);
            i = 0;
        }
        if (i > 0) {
            return this.f81666a.getColor(i);
        }
        if (j.g) {
            return -1;
        }
        if (!j.f81673f) {
            return -16777216;
        }
        if (j.g) {
            return Color.parseColor("#ff999999");
        }
        return -1;
    }

    public final void init(Context context) {
        this.f81667b = context.getPackageName();
        this.f81666a = context.getResources();
    }
}

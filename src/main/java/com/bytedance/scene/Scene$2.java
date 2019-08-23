package com.bytedance.scene;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.view.ContextThemeWrapper;

class Scene$2 extends ContextThemeWrapper {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f21971a;

    public Object getSystemService(@NonNull String str) {
        if ("scene".equals(str)) {
            return this.f21971a;
        }
        if (!"layout_inflater".equals(str) || this.f21971a.f22093a == null) {
            return super.getSystemService(str);
        }
        return this.f21971a.f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Scene$2(e eVar, Context context, Resources.Theme theme) {
        super(context, theme);
        this.f21971a = eVar;
    }
}

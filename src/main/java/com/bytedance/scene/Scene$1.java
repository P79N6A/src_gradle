package com.bytedance.scene;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.ContextThemeWrapper;

class Scene$1 extends ContextThemeWrapper {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f21970a;

    public Object getSystemService(@NonNull String str) {
        if ("scene".equals(str)) {
            return this.f21970a;
        }
        if (!"layout_inflater".equals(str) || this.f21970a.f22093a == null) {
            return super.getSystemService(str);
        }
        return this.f21970a.f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Scene$1(e eVar, Context context, int i) {
        super(context, i);
        this.f21970a = eVar;
    }
}

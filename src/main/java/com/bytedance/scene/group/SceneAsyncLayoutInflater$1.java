package com.bytedance.scene.group;

import android.support.annotation.NonNull;
import android.support.v7.view.ContextThemeWrapper;

class SceneAsyncLayoutInflater$1 extends ContextThemeWrapper {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f22104a;

    public Object getSystemService(@NonNull String str) {
        if ("layout_inflater".equals(str)) {
            return this.f22104a.f22133a;
        }
        return super.getSystemService(str);
    }
}

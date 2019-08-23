package com.bytedance.android.live.core.setting;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class n<T> extends l<T> {
    public static ChangeQuickRedirect h;

    public final T a() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 943, new Class[0], Object.class)) {
            return m.a("TT_APP_SETTING", this.f8181b, this.f8185f, this.f8183d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, h, false, 943, new Class[0], Object.class);
    }

    public n(String str, @NonNull T t) {
        super(str, t);
    }
}

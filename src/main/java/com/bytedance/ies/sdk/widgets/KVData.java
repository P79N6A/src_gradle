package com.bytedance.ies.sdk.widgets;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class KVData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Object data;
    @NonNull
    private String key;

    @NonNull
    public String getKey() {
        return this.key;
    }

    @Nullable
    public <T> T getData() {
        if (this.data == null) {
            return null;
        }
        return this.data;
    }

    @Nullable
    public <T> T getData(T t) {
        T t2 = t;
        if (!PatchProxy.isSupport(new Object[]{t2}, this, changeQuickRedirect, false, 15173, new Class[]{Object.class}, Object.class)) {
            return DataCenter.get(this.data, t2);
        }
        return PatchProxy.accessDispatch(new Object[]{t2}, this, changeQuickRedirect, false, 15173, new Class[]{Object.class}, Object.class);
    }

    public KVData(@NonNull String str, @Nullable Object obj) {
        this.key = str;
        this.data = obj;
    }
}

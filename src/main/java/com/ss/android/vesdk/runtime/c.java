package com.ss.android.vesdk.runtime;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.ss.android.vesdk.runtime.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f78102a;

    /* renamed from: b  reason: collision with root package name */
    private String f78103b;

    @NonNull
    public final String a() {
        if (TextUtils.isEmpty(this.f78103b)) {
            this.f78103b = (String) a.a().b("vesdk_models_dir_sp_key", "");
        }
        return this.f78103b;
    }
}

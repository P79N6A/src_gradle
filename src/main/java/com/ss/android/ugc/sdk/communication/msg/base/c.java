package com.ss.android.ugc.sdk.communication.msg.base;

import android.content.ComponentName;
import android.os.Bundle;
import com.ss.android.ugc.sdk.communication.d;

public abstract class c extends a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final int f77798a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77799b;

    public final int d() {
        return this.f77798a;
    }

    public final ComponentName a() {
        return new ComponentName(d.a(b()), "com.ss.android.ugc.sdk.communication.EntryActivity");
    }

    public c(Bundle bundle) {
        super(bundle);
        this.f77798a = bundle.getInt("KEY_ERROR_CODE", 0);
        this.f77799b = bundle.getString("KEY_ERROR_MSG");
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("KEY_INTENT_TYPE", 1);
        bundle.putInt("KEY_ERROR_CODE", this.f77798a);
        bundle.putString("KEY_ERROR_MSG", this.f77799b);
    }

    public c(String str, int i, String str2, int i2, String str3) {
        super(str, 0, str2);
        this.f77798a = i2;
        this.f77799b = str3;
    }
}

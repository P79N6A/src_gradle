package com.ss.android.ugc.sdk.communication.msg.base;

import android.os.Bundle;
import android.support.annotation.CallSuper;

public abstract class a implements Msg {

    /* renamed from: a  reason: collision with root package name */
    private final String f77794a;

    /* renamed from: b  reason: collision with root package name */
    private final int f77795b;

    /* renamed from: c  reason: collision with root package name */
    private final String f77796c;

    /* renamed from: d  reason: collision with root package name */
    protected final String f77797d;

    public final String b() {
        return this.f77796c;
    }

    public final String c() {
        return this.f77794a;
    }

    @CallSuper
    public void a(Bundle bundle) {
        bundle.putString("KEY_MSG_ID", c());
        bundle.putInt("KEY_MSG_TYPE", this.f77795b);
        bundle.putString("KEY_TARGET_PLATFORM", this.f77796c);
    }

    public a(Bundle bundle) {
        this.f77795b = bundle.getInt("KEY_MSG_TYPE", -1);
        this.f77796c = bundle.getString("KEY_TARGET_PLATFORM");
        this.f77794a = bundle.getString("KEY_MSG_ID");
        this.f77797d = bundle.getString("KEY_SOURCE_PLATFORM");
    }

    public a(String str, int i, String str2) {
        this.f77794a = str;
        this.f77795b = i;
        this.f77796c = str2;
    }
}

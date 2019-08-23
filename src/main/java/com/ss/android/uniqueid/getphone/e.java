package com.ss.android.uniqueid.getphone;

import android.content.Context;

public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f77833a = (e.class.getSimpleName() + " -> ");

    /* renamed from: b  reason: collision with root package name */
    private String f77834b;

    /* renamed from: c  reason: collision with root package name */
    private String f77835c;

    public final void a(Context context) {
        CMCCManager.inst().execute(context, this.f77834b, this.f77835c);
    }

    public e(String str, String str2) {
        this.f77834b = str;
        this.f77835c = str2;
    }
}

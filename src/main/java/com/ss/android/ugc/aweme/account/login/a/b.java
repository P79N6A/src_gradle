package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.api.AccountApiInModule;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32046a;

    /* renamed from: d  reason: collision with root package name */
    private a f32047d;

    /* renamed from: e  reason: collision with root package name */
    private String f32048e;

    /* renamed from: f  reason: collision with root package name */
    private String f32049f;
    private String g;
    private String h;

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32046a, false, 20210, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32046a, false, 20210, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AccountApiInModule.a(this.f32049f, this.f32048e, str, this.g, this.h, this.f32047d);
    }

    public b(@NonNull k kVar, @NonNull a aVar, String str, String str2, String str3, String str4) {
        super(kVar);
        this.f32047d = aVar;
        this.f32048e = str;
        this.f32049f = str2;
        this.g = str3;
        this.h = str4;
    }
}

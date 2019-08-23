package com.ss.android.ugc.aweme.flow.manager.impl;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47677a;
    @SerializedName("desc")

    /* renamed from: b  reason: collision with root package name */
    public String f47678b;
    @SerializedName("msgId")

    /* renamed from: c  reason: collision with root package name */
    public String f47679c;
    @SerializedName("pcId")

    /* renamed from: d  reason: collision with root package name */
    public String f47680d;
    @SerializedName("resultcode")

    /* renamed from: e  reason: collision with root package name */
    public int f47681e;
    @SerializedName("systemTime")

    /* renamed from: f  reason: collision with root package name */
    public String f47682f;

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f47677a, false, 44471, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47677a, false, 44471, new Class[0], String.class);
        }
        return "CMCCCertify{desc='" + this.f47678b + '\'' + ", msgId='" + this.f47679c + '\'' + ", pcId='" + this.f47680d + '\'' + ", resultCode=" + this.f47681e + ", systemTime='" + this.f47682f + '\'' + '}';
    }
}

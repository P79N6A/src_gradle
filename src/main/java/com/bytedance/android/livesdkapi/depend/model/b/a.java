package com.bytedance.android.livesdkapi.depend.model.b;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public long f18689a;

    /* renamed from: b  reason: collision with root package name */
    public String f18690b;

    /* renamed from: c  reason: collision with root package name */
    public String f18691c;
    @SerializedName("follow_status")

    /* renamed from: d  reason: collision with root package name */
    public int f18692d;

    /* renamed from: e  reason: collision with root package name */
    public C0136a f18693e = C0136a.Default;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18694f;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.b.a$a  reason: collision with other inner class name */
    public enum C0136a {
        Default,
        FromWeb;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final int a() {
        if (this.f18692d < 0 || this.f18692d > 2) {
            this.f18692d = 0;
        }
        return this.f18692d;
    }
}

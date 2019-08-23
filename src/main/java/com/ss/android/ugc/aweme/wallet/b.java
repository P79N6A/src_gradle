package com.ss.android.ugc.aweme.wallet;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76566a;
    @SerializedName("page_charge_schema")

    /* renamed from: b  reason: collision with root package name */
    String f76567b;
    @SerializedName("page_index_schema")

    /* renamed from: c  reason: collision with root package name */
    String f76568c;

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f76566a, false, 89786, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76566a, false, 89786, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.f76567b)) {
            return "";
        } else {
            return this.f76567b;
        }
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f76566a, false, 89787, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76566a, false, 89787, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.f76568c)) {
            return "";
        } else {
            return this.f76568c;
        }
    }
}

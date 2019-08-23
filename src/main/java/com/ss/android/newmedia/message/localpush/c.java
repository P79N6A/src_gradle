package com.ss.android.newmedia.message.localpush;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.f;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30248a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30249b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30250c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30251d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30252e;

    /* renamed from: f  reason: collision with root package name */
    public final String f30253f;
    public final String g;
    public final int h;
    public final long i;
    public final String j;

    public static c a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f30248a, true, 18714, new Class[]{String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str2}, null, f30248a, true, 18714, new Class[]{String.class}, c.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int optInt = jSONObject.optInt("id");
                String optString = jSONObject.optString(f.f34168b);
                String optString2 = jSONObject.optString(PushConstants.TITLE);
                String optString3 = jSONObject.optString("text");
                c cVar = new c(optInt, optString, jSONObject.optString("image_url"), jSONObject.optInt("image_type"), optString3, optString2, jSONObject.optInt("use_led"), 1000 * jSONObject.optLong("show_at"), str);
                return cVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private c(int i2, String str, String str2, int i3, String str3, String str4, int i4, long j2, String str5) {
        this.f30249b = i2;
        this.f30250c = str;
        this.f30251d = str2;
        this.f30252e = i3;
        this.f30253f = str3;
        this.g = str4;
        this.h = i4;
        this.i = j2;
        this.j = str5;
    }
}

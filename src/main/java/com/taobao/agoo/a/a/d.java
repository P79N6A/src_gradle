package com.taobao.agoo.a.a;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.d;

public class d extends b {

    /* renamed from: a  reason: collision with root package name */
    public String f79127a;

    /* renamed from: b  reason: collision with root package name */
    public String f79128b;

    /* renamed from: c  reason: collision with root package name */
    public String f79129c;

    public byte[] a() {
        try {
            d.a aVar = new d.a();
            aVar.a("cmd", this.f79121e).a("appKey", this.f79127a);
            if (TextUtils.isEmpty(this.f79128b)) {
                aVar.a("utdid", this.f79129c);
            } else {
                aVar.a("deviceId", this.f79128b);
            }
            String jSONObject = aVar.a().toString();
            ALog.i("SwitchDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("SwitchDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    public static byte[] a(String str, String str2, String str3, boolean z) {
        d dVar = new d();
        dVar.f79127a = str;
        dVar.f79128b = str2;
        dVar.f79129c = str3;
        if (z) {
            dVar.f79121e = "enablePush";
        } else {
            dVar.f79121e = "disablePush";
        }
        return dVar.a();
    }
}

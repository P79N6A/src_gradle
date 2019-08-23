package com.taobao.agoo.a.a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.d;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public String f79117a;

    /* renamed from: b  reason: collision with root package name */
    public String f79118b;

    /* renamed from: c  reason: collision with root package name */
    public String f79119c;

    /* renamed from: d  reason: collision with root package name */
    public String f79120d;

    public byte[] a() {
        try {
            String jSONObject = new d.a().a("cmd", this.f79121e).a("appKey", this.f79117a).a("deviceId", this.f79118b).a("alias", this.f79119c).a("pushAliasToken", this.f79120d).a().toString();
            ALog.i("AliasDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("AliasDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    public static byte[] a(String str, String str2, String str3) {
        a aVar = new a();
        aVar.f79117a = str;
        aVar.f79118b = str2;
        aVar.f79119c = str3;
        aVar.f79121e = "setAlias";
        return aVar.a();
    }

    public static byte[] b(String str, String str2, String str3) {
        a aVar = new a();
        aVar.f79117a = str;
        aVar.f79118b = str2;
        aVar.f79120d = str3;
        aVar.f79121e = "removeAlias";
        return aVar.a();
    }

    public static byte[] c(String str, String str2, String str3) {
        a aVar = new a();
        aVar.f79117a = str;
        aVar.f79118b = str2;
        aVar.f79119c = str3;
        aVar.f79121e = "removeAlias";
        return aVar.a();
    }
}

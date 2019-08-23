package com.bytedance.ies.b.a;

import android.text.TextUtils;
import com.meituan.robust.PatchedClassInfo;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f20189a;

    /* renamed from: b  reason: collision with root package name */
    public String f20190b;

    /* renamed from: c  reason: collision with root package name */
    public String f20191c;

    /* renamed from: d  reason: collision with root package name */
    public String f20192d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20193e;

    /* renamed from: f  reason: collision with root package name */
    public List<PatchedClassInfo> f20194f;

    public final String a() {
        if (this.f20189a == null) {
            return null;
        }
        return this.f20189a.toLowerCase();
    }

    public final int hashCode() {
        return (this.f20189a.hashCode() * 31) + this.f20191c.hashCode();
    }

    public final String toString() {
        return "md5=" + this.f20189a + ",url=" + this.f20190b + ",sign=" + this.f20191c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f20189a.equals(aVar.f20189a)) {
            return false;
        }
        return this.f20191c.equals(aVar.f20191c);
    }

    public a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",");
            if (split != null) {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        String[] split2 = str2.split("=");
                        if (split2 != null && split2.length == 2) {
                            if (TextUtils.equals(split2[0], "sign")) {
                                this.f20191c = split2[1];
                            } else if (TextUtils.equals(split2[0], PushConstants.WEB_URL)) {
                                this.f20190b = split2[1];
                            } else if (TextUtils.equals(split2[0], "md5")) {
                                this.f20189a = split2[1];
                            }
                        }
                    }
                }
            }
        }
    }

    public a(String str, String str2, String str3) {
        this.f20189a = str3;
        this.f20190b = str2;
        this.f20191c = str;
    }
}

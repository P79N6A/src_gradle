package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

public class ar {

    /* renamed from: a  reason: collision with root package name */
    public int f81837a;

    /* renamed from: a  reason: collision with other field name */
    public String f158a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f159a = new HashMap();

    public String a() {
        return this.f158a;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", new Object[]{Integer.valueOf(this.f81837a), this.f159a.toString(), this.f158a});
    }
}

package com.bytedance.sdk.account.c;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.account.c;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f22322a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22323b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f22324c;

    /* renamed from: com.bytedance.sdk.account.c.a$a  reason: collision with other inner class name */
    public static class C0233a {

        /* renamed from: a  reason: collision with root package name */
        private String f22325a;

        /* renamed from: b  reason: collision with root package name */
        private String f22326b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, String> f22327c;

        public final a b() {
            this.f22326b = "get";
            return new a(this.f22325a, this.f22326b, this.f22327c);
        }

        public final a c() {
            this.f22326b = "post";
            return new a(this.f22325a, this.f22326b, this.f22327c);
        }

        public final C0233a a() {
            if (this.f22327c == null) {
                this.f22327c = new HashMap();
            }
            if (c.a().d()) {
                this.f22327c.put("multi_login", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            return this;
        }

        public final C0233a a(String str) {
            this.f22325a = str;
            return this;
        }

        public final C0233a a(Map<String, String> map) {
            if (this.f22327c == null) {
                this.f22327c = map;
            } else if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    this.f22327c.put(next.getKey(), next.getValue());
                }
            }
            return this;
        }

        public final C0233a a(String str, String str2) {
            if (this.f22327c == null) {
                this.f22327c = new HashMap();
            }
            this.f22327c.put(str, str2);
            return this;
        }

        public final C0233a a(Map<String, String> map, Map<String, String> map2) {
            if (this.f22327c == null) {
                this.f22327c = new HashMap();
            }
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    this.f22327c.put(next.getKey(), next.getValue());
                }
            }
            if (map2 != null && !map2.isEmpty()) {
                for (String next2 : map2.keySet()) {
                    if (!TextUtils.isEmpty(next2) && map2.get(next2) != null) {
                        this.f22327c.put(next2, map2.get(next2));
                    }
                }
            }
            return this;
        }
    }

    public final String a(String str) {
        if (this.f22324c == null) {
            return null;
        }
        return this.f22324c.get(str);
    }

    public a(String str, String str2, Map<String, String> map) {
        this.f22322a = str;
        this.f22323b = str2;
        this.f22324c = map;
    }
}

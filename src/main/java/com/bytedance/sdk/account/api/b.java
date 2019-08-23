package com.bytedance.sdk.account.api;

import com.ss.android.account.c;

public final class b {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static String f22239a = "https://";

        /* renamed from: b  reason: collision with root package name */
        public static String f22240b = "http://";

        public static String b() {
            return a("/passport/mobile/send_code/v1/");
        }

        public static String c() {
            return a("/passport/mobile/login/");
        }

        public static String d() {
            return a("/passport/mobile/sms_login/");
        }

        public static String e() {
            return a("/passport/mobile/bind/v1/");
        }

        public static String f() {
            return a("/passport/mobile/validate_code/v1/");
        }

        public static String g() {
            return a("/passport/mobile/send_voice_code/");
        }

        public static String h() {
            return a("/passport/auth/one_login/");
        }

        public static String i() {
            return a("/passport/mobile/bind_login/");
        }

        public static String a() {
            return c.a().a();
        }

        public static String a(String str) {
            com.bytedance.sdk.account.utils.b b2 = c.b();
            if (b2 == null || !b2.a()) {
                return f22239a + a() + str;
            }
            return f22240b + a() + str;
        }
    }

    /* renamed from: com.bytedance.sdk.account.api.b$b  reason: collision with other inner class name */
    public static class C0231b {
        public static String a() {
            return a("/passport/auth/unbind/");
        }

        public static String b() {
            return a("/passport/auth/login/");
        }

        public static String c() {
            return a("/passport/auth/bind/");
        }

        private static String d() {
            return c.a().a();
        }

        public static String a(String str) {
            com.bytedance.sdk.account.utils.b b2 = c.b();
            if (b2 == null || !b2.a()) {
                return "https://" + d() + str;
            }
            return "http://" + d() + str;
        }
    }
}

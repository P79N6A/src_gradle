package com.alimama.tunion.sdk.b;

import android.text.TextUtils;
import com.alimama.tunion.trade.TUnionTradeSDK;
import com.alimama.tunion.trade.abtest.TUnionABTestValue;
import com.alimama.tunion.trade.base.ITUnionUT;
import com.alimama.tunion.trade.convert.TUnionJumpType;
import com.alimama.tunion.utils.TUnionPhoneInfoUtils;
import java.util.HashMap;
import java.util.Map;

public class b {

    public static class a {
        public static void a() {
            b.b("TUnionJump", "jump", b.b());
        }

        public static void a(String str) {
            Map a2 = b.b();
            a2.put("msg", str);
            b.b("TUnionJump", "failed", a2);
        }

        public static void a(TUnionJumpType tUnionJumpType) {
            String str = "";
            if (tUnionJumpType != null) {
                switch (tUnionJumpType) {
                    case NATIVE:
                        str = "tb";
                        break;
                    case H5:
                        str = "h5";
                        break;
                    case BROWSER:
                        str = "br";
                        break;
                }
            }
            Map a2 = b.b();
            a2.put("type", str);
            b.b("TUnionJump", "success", a2);
        }
    }

    /* renamed from: com.alimama.tunion.sdk.b.b$b  reason: collision with other inner class name */
    public static class C0036b {
        public static void a() {
            b.b("TUnionSsoLogin", "loginCancel", b.b());
        }

        public static void a(String str) {
            Map a2 = b.b();
            a2.put("nick", str);
            b.b("TUnionSsoLogin", "loginSuccess", a2);
        }

        public static void b(String str) {
            Map a2 = b.b();
            a2.put("msg", str);
            b.b("TUnionSsoLogin", "loginFailed", a2);
        }

        public static void a(TUnionABTestValue tUnionABTestValue) {
            String str = "";
            switch (tUnionABTestValue) {
                case YES:
                case INVALID:
                    str = "tb";
                    break;
                case NO:
                    str = "ap";
                    break;
            }
            Map a2 = b.b();
            a2.put("type", str);
            b.b("TUnionSsoLogin", "showLogin", a2);
        }
    }

    public static class c {
        public static void a() {
            b.b("TUnionSsoLogout", "logout", b.b());
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, String> b() {
        Map<String, String> c2 = c();
        c2.put("mcid", TUnionPhoneInfoUtils.getInstance().getMcid());
        return c2;
    }

    private static Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("cid", TUnionPhoneInfoUtils.getInstance().getCid());
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static void b(String str, String str2, Map<String, String> map) {
        ITUnionUT tUnionUT = TUnionTradeSDK.getInstance().getTUnionUT();
        if (tUnionUT != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (map == null) {
                map = new HashMap<>();
            }
            tUnionUT.send(str, str2, map);
        }
    }
}

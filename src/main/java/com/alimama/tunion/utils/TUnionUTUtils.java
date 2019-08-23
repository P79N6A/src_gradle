package com.alimama.tunion.utils;

import android.text.TextUtils;
import com.alimama.tunion.trade.TUnionTradeSDK;
import com.alimama.tunion.trade.base.ITUnionUT;
import java.util.HashMap;
import java.util.Map;

public class TUnionUTUtils {

    public static class Config {
        public static void start() {
            TUnionUTUtils.b("TUnionConfig", "start", TUnionUTUtils.d());
        }

        public static void failed(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "None";
            }
            Map b2 = TUnionUTUtils.d();
            b2.put("msg", str);
            TUnionUTUtils.b("TUnionConfig", "failed", b2);
        }
    }

    public static class Convert {
        public static void convert() {
            TUnionUTUtils.b("TUnionConvert", "convert", TUnionUTUtils.c());
        }

        public static void request() {
            TUnionUTUtils.b("TUnionConvert", "request", TUnionUTUtils.c());
        }

        public static void failed(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "None";
            }
            Map a2 = TUnionUTUtils.c();
            a2.put("msg", str);
            TUnionUTUtils.b("TUnionConvert", "failed", a2);
        }
    }

    public static class Error {
        public static void error(String str) {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                str = "None";
            }
            hashMap.put("ErrorDescription", str);
            TUnionUTUtils.b("TUnionError", "ErrorCode", hashMap);
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, String> c() {
        Map<String, String> d2 = d();
        d2.put("mcid", TUnionPhoneInfoUtils.getInstance().getMcid());
        return d2;
    }

    /* access modifiers changed from: private */
    public static Map<String, String> d() {
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

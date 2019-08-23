package com.ss.android.ugc.aweme.flow.manager.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import java.util.TreeMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47686a;

    /* renamed from: b  reason: collision with root package name */
    private static b f47687b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static String f47688c = "MIIBSgIBADCCASsGByqGSM44BAEwggEeAoGBAP1KfX3E3GfvdRXFQY6axz8ET49su6XAmMxQnE6y\nOcy5ISHrtk3LY4TDrP69/YZVXr5n7TPqVvwimh3+Ps2T1O6Vyum2lzzTGsS+oJjDmt9bleQSIMc9\nYX58x5P/7yMEXUYW+9CiiudAe2Kf1xX9+172VYqyRJnV/Rs4poWnqcNDAhUA5OkDUsOYJPi1T9e9\nleOCeB0mlj8CgYB+4ZY6ZHOCVC+rNaW/JrYoZpiKiH/fxkEKE/DwbBbjBflsU27kOfeROlsPiT0d\nMwYJD1VbXmU2EvfGm3wJcf4Z9kuSQZmVrL8lLqf51cX9bt6c3PdeAA0r/2VTrLcPECJnWx9rIlwC\n6iKOzNv3VoF13qYjXbZfk5SzrEkxIgCreAQWAhQXGH99Ax5L3UnAW0sIZD2mwhP7Xw==";

    /* renamed from: d  reason: collision with root package name */
    private static String f47689d = "MIIBtzCCASsGByqGSM44BAEwggEeAoGBAP1KfX3E3GfvdRXFQY6axz8ET49su6XAmMxQnE6yOcy5\nISHrtk3LY4TDrP69/YZVXr5n7TPqVvwimh3+Ps2T1O6Vyum2lzzTGsS+oJjDmt9bleQSIMc9YX58\nx5P/7yMEXUYW+9CiiudAe2Kf1xX9+172VYqyRJnV/Rs4poWnqcNDAhUA5OkDUsOYJPi1T9e9leOC\neB0mlj8CgYB+4ZY6ZHOCVC+rNaW/JrYoZpiKiH/fxkEKE/DwbBbjBflsU27kOfeROlsPiT0dMwYJ\nD1VbXmU2EvfGm3wJcf4Z9kuSQZmVrL8lLqf51cX9bt6c3PdeAA0r/2VTrLcPECJnWx9rIlwC6iKO\nzNv3VoF13qYjXbZfk5SzrEkxIgCreAOBhQACgYEA1saTuDLhAHbcycTbuP4ybR3hInvNYCDWIBdm\naZyRIuc6fUldCFJL1Ci61AWu/Z9P2P50n9FuPzkpfTdXs3OOe8tHbZKO1FTJ5YbMt8jpFYwhVPPF\nROA1tPE32Tp7cmVch9kBZ6DGwRDQinAlk7JEO72McRl0BjA9zZFECahrYIU=";

    /* renamed from: e  reason: collision with root package name */
    private static TreeMap<String, String> f47690e;

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f47690e = treeMap;
        treeMap.put("channelId", "C10000001072");
        f47690e.put("openType", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        f47690e.put("userId", "");
        f47690e.put("message", "");
    }

    private static String a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, null, f47686a, true, 44478, new Class[]{Map.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{map2}, null, f47686a, true, 44478, new Class[]{Map.class}, String.class);
        }
        try {
            map2.put("msgId", System.currentTimeMillis() + "__xxx__" + AppLog.getServerDeviceId());
            return f47687b.a(f47688c, map2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(String str, Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, f47686a, true, 44477, new Class[]{String.class, Map.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, map2}, null, f47686a, true, 44477, new Class[]{String.class, Map.class}, String.class);
        }
        TreeMap treeMap = new TreeMap();
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        if (!treeMap.containsKey("expandParams")) {
            treeMap.put("expandParams", "");
        }
        treeMap.putAll(f47690e);
        String a2 = a(treeMap);
        b(a2, treeMap);
        if (!TextUtils.isEmpty(a2)) {
            treeMap.put("sign", URLEncoder.encode(a2));
        }
        if (map2 != null && map2.containsKey("expandParams")) {
            treeMap.put("expandParams", URLEncoder.encode(map2.get("expandParams")));
        }
        return str2 + f47687b.a(treeMap);
    }

    private static boolean b(String str, Map<String, String> map) {
        PublicKey publicKey;
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, f47686a, true, 44479, new Class[]{String.class, Map.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, map2}, null, f47686a, true, 44479, new Class[]{String.class, Map.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            b bVar = f47687b;
            String str3 = f47689d;
            if (PatchProxy.isSupport(new Object[]{str2, str3, map2}, bVar, b.f47683a, false, 44473, new Class[]{String.class, String.class, Map.class}, Boolean.TYPE)) {
                Object[] objArr = {str2, str3, map2};
                Class[] clsArr = {String.class, String.class, Map.class};
                return ((Boolean) PatchProxy.accessDispatch(objArr, bVar, b.f47683a, false, 44473, clsArr, Boolean.TYPE)).booleanValue();
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3) && map2 != null) {
                if (!map.isEmpty()) {
                    byte[] bytes = bVar.a(map2).getBytes("UTF-8");
                    byte[] decode = Base64.decode(str2.getBytes("UTF-8"), 0);
                    Signature instance = Signature.getInstance("DSA");
                    if (PatchProxy.isSupport(new Object[]{str3}, bVar, b.f47683a, false, 44474, new Class[]{String.class}, PublicKey.class)) {
                        b bVar2 = bVar;
                        publicKey = (PublicKey) PatchProxy.accessDispatch(new Object[]{str3}, bVar2, b.f47683a, false, 44474, new Class[]{String.class}, PublicKey.class);
                    } else if (TextUtils.isEmpty(str3)) {
                        publicKey = null;
                    } else {
                        publicKey = KeyFactory.getInstance("DSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3.getBytes("UTF-8"), 0)));
                    }
                    instance.initVerify(publicKey);
                    instance.update(bytes);
                    return instance.verify(decode);
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}

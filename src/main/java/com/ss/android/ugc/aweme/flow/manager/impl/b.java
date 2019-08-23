package com.ss.android.ugc.aweme.flow.manager.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47683a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47684b = "UTF-8";

    /* renamed from: c  reason: collision with root package name */
    private final String f47685c = "DSA";

    public final String a(Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f47683a, false, 44476, new Class[]{Map.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{map}, this, f47683a, false, 44476, new Class[]{Map.class}, String.class);
        } else if (map == null || map.isEmpty()) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append((String) next.getKey());
                sb.append("=");
                sb.append((String) next.getValue());
            }
            return sb.toString();
        }
    }

    public final String a(String str, Map<String, String> map) throws Exception {
        PrivateKey privateKey;
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, this, f47683a, false, 44472, new Class[]{String.class, Map.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, map2}, this, f47683a, false, 44472, new Class[]{String.class, Map.class}, String.class);
        } else if (TextUtils.isEmpty(str) || map2 == null || map.isEmpty()) {
            return "";
        } else {
            byte[] bytes = a(map2).getBytes("UTF-8");
            Signature instance = Signature.getInstance("DSA");
            if (PatchProxy.isSupport(new Object[]{str2}, this, f47683a, false, 44475, new Class[]{String.class}, PrivateKey.class)) {
                privateKey = (PrivateKey) PatchProxy.accessDispatch(new Object[]{str2}, this, f47683a, false, 44475, new Class[]{String.class}, PrivateKey.class);
            } else if (TextUtils.isEmpty(str)) {
                privateKey = null;
            } else {
                privateKey = KeyFactory.getInstance("DSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2.getBytes("UTF-8"), 0)));
            }
            instance.initSign(privateKey);
            instance.update(bytes);
            return new String(Base64.encode(instance.sign(), 0));
        }
    }
}

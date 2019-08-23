package com.ss.android.common.config;

import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RequestValidator {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean checkSSSign(String str, String str2, String str3) {
        String str4;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, 15757, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, 15757, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str3) || StringUtils.isEmpty(str2)) {
            return false;
        } else {
            String md5Hex = DigestUtils.md5Hex(str3);
            String md5Hex2 = DigestUtils.md5Hex("ByteDance" + md5Hex);
            if (StringUtils.isEmpty(md5Hex2) || md5Hex2.length() != 32) {
                return true;
            }
            try {
                str4 = RSADecoder.decodeSign(str2);
            } catch (Throwable unused) {
                str4 = "";
            }
            return md5Hex2.equals(str4);
        }
    }
}

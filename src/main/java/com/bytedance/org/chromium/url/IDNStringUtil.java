package com.bytedance.org.chromium.url;

import com.bytedance.org.chromium.base.annotations.CalledByNative;
import com.bytedance.org.chromium.base.annotations.JNINamespace;
import java.net.IDN;

@JNINamespace("url::android")
public class IDNStringUtil {
    @CalledByNative
    private static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }
}

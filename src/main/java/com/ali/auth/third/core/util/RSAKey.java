package com.ali.auth.third.core.util;

import android.text.TextUtils;

public class RSAKey {

    /* renamed from: a  reason: collision with root package name */
    private static String f4988a;

    public static String getRsaPubkey() {
        if (TextUtils.isEmpty(f4988a)) {
            f4988a = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC8H6Gp7XP6UvEQzvUgGnt9nPX4exn1aNlmeyloMl6g2rEggeTNMp7I3iLPzQDbt6yedCru971fducKc2DgF/y2CcwAdqaKdxm0dSI2Zs4QLNYbKwWJ65wkgUh8+TJBnk+PGTgoxZ2wzvhJyRGjGhsFvLmZkUYPPxAPSNfjB3+/4wIDAQAB";
        }
        return f4988a;
    }
}

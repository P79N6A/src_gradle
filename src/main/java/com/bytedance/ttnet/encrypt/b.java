package com.bytedance.ttnet.encrypt;

import android.annotation.TargetApi;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ttnet.encrypt.TtTokenConfig;
import java.security.SecureRandom;
import java.util.Arrays;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f22633a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    private static byte[] a() {
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            Logger.debug();
            return bArr;
        } catch (Throwable unused) {
            return f22633a;
        }
    }

    private static byte[] a(byte[]... bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (bArr[i2] != null && bArr[i2].length > 0) {
                i += bArr[i2].length;
            }
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            if (bArr[i4] != null && bArr[i4].length > 0) {
                System.arraycopy(bArr[i4], 0, bArr2, i3, bArr[i4].length);
                i3 += bArr[i4].length;
            }
        }
        return bArr2;
    }

    @TargetApi(8)
    public static Pair<Boolean, String> a(TtTokenConfig.a aVar, String str) {
        if (StringUtils.isEmpty(str) || aVar == null) {
            Logger.debug();
            return new Pair<>(Boolean.FALSE, str);
        }
        try {
            byte[] bArr = aVar.f22631e;
            if (bArr == null) {
                Logger.debug();
                return new Pair<>(Boolean.FALSE, str);
            }
            byte[] a2 = com.bytedance.ttnet.utils.b.a(str.getBytes(), bArr);
            if (a2 != null) {
                if (a2.length > 0) {
                    return new Pair<>(Boolean.TRUE, Base64.encodeToString(a2, 2));
                }
            }
            Logger.debug();
            return new Pair<>(Boolean.FALSE, str);
        } catch (Throwable unused) {
            Logger.debug();
            return new Pair<>(Boolean.FALSE, str);
        }
    }

    @TargetApi(8)
    public static Pair<Boolean, byte[]> a(TtTokenConfig.a aVar, byte[] bArr) {
        if (bArr == null || aVar == null) {
            Logger.debug();
            return new Pair<>(Boolean.FALSE, bArr);
        }
        try {
            byte[] a2 = a();
            byte[] bArr2 = aVar.f22630d;
            if (a2 != null) {
                if (bArr2 != null) {
                    byte[] a3 = com.bytedance.ttnet.utils.b.a(bArr, bArr2, "AES", "AES/CBC/PKCS5Padding", a2, true);
                    if (a3 != null) {
                        if (a3.length > 0) {
                            byte[] bArr3 = aVar.f22631e;
                            if (bArr3 == null) {
                                Logger.debug();
                                return new Pair<>(Boolean.FALSE, bArr);
                            }
                            byte[] a4 = a(a2, a3);
                            byte[] a5 = com.bytedance.ttnet.utils.b.a(a4, bArr3);
                            if (a5 != null) {
                                if (a5.length > 0) {
                                    return new Pair<>(Boolean.TRUE, a(a4, a5));
                                }
                            }
                            Logger.debug();
                            return new Pair<>(Boolean.FALSE, bArr);
                        }
                    }
                    Logger.debug();
                    return new Pair<>(Boolean.FALSE, bArr);
                }
            }
            Logger.debug();
            return new Pair<>(Boolean.FALSE, bArr);
        } catch (Throwable unused) {
            Logger.debug();
            return new Pair<>(Boolean.FALSE, bArr);
        }
    }

    @TargetApi(8)
    public static Pair<Boolean, byte[]> b(TtTokenConfig.a aVar, byte[] bArr) {
        if (bArr == null || aVar == null) {
            Logger.debug();
            return new Pair<>(Boolean.FALSE, bArr);
        }
        int i = 0;
        if (bArr != null) {
            try {
                if (bArr.length >= 64) {
                    byte[] bArr2 = new byte[16];
                    System.arraycopy(bArr, 0, bArr2, 0, 16);
                    int length = bArr.length - 48;
                    byte[] bArr3 = new byte[length];
                    System.arraycopy(bArr, 16, bArr3, 0, length);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(bArr, bArr.length - 32, bArr4, 0, 32);
                    byte[] bArr5 = aVar.f22631e;
                    if (bArr5 == null) {
                        Logger.debug();
                        return new Pair<>(Boolean.FALSE, bArr);
                    }
                    byte[] a2 = com.bytedance.ttnet.utils.b.a(a(bArr2, bArr3), bArr5);
                    if (a2 != null) {
                        if (a2.length > 0) {
                            if (!Arrays.equals(a2, bArr4)) {
                                Logger.debug();
                                return new Pair<>(Boolean.FALSE, bArr);
                            }
                            byte[] bArr6 = aVar.f22630d;
                            if (bArr6 == null) {
                                Logger.debug();
                                return new Pair<>(Boolean.FALSE, bArr);
                            }
                            return new Pair<>(Boolean.TRUE, com.bytedance.ttnet.utils.b.a(bArr3, bArr6, "AES", "AES/CBC/PKCS5Padding", bArr2, false));
                        }
                    }
                    Logger.debug();
                    return new Pair<>(Boolean.FALSE, bArr);
                }
            } catch (Throwable unused) {
                Logger.debug();
                return new Pair<>(Boolean.FALSE, bArr);
            }
        }
        if (Logger.debug()) {
            StringBuilder sb = new StringBuilder("decrypt fail for encrypted_bytes == ");
            sb.append(String.valueOf(bArr));
            sb.append(" || encrypted_bytes.length = ");
            if (bArr != null) {
                i = bArr.length;
            }
            sb.append(i);
            Logger.d("TtTokenEncryptor", sb.toString());
        }
        return new Pair<>(Boolean.FALSE, bArr);
    }
}

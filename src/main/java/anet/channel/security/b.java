package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import java.util.HashMap;
import java.util.Map;

public class b implements ISecurity {

    /* renamed from: a  reason: collision with root package name */
    private static String f1280a = "awcn.DefaultSecurityGuard";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1281b;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Integer> f1282c;

    /* renamed from: d  reason: collision with root package name */
    private String f1283d;

    public boolean isSecOff() {
        return false;
    }

    static {
        try {
            Class.forName("com.alibaba.wireless.security.open.SecurityGuardManager");
            f1281b = true;
            HashMap hashMap = new HashMap();
            f1282c = hashMap;
            hashMap.put("HMAC_SHA1", 3);
            f1282c.put("ASE128", 16);
        } catch (Throwable unused) {
            f1281b = false;
        }
    }

    b(String str) {
        this.f1283d = str;
    }

    public byte[] getBytes(Context context, String str) {
        byte[] bArr = null;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance != null) {
                IDynamicDataStoreComponent dynamicDataStoreComp = instance.getDynamicDataStoreComp();
                if (dynamicDataStoreComp != null) {
                    bArr = dynamicDataStoreComp.getByteArray(str);
                }
            }
        } catch (Throwable th) {
            ALog.e(f1280a, "getBytes", null, th, new Object[0]);
        }
        return bArr;
    }

    public boolean saveBytes(Context context, String str, byte[] bArr) {
        boolean z = false;
        if (context == null || bArr == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance != null) {
                IDynamicDataStoreComponent dynamicDataStoreComp = instance.getDynamicDataStoreComp();
                if (!(dynamicDataStoreComp == null || dynamicDataStoreComp.putByteArray(str, bArr) == 0)) {
                    z = true;
                }
            }
        } catch (Throwable th) {
            ALog.e(f1280a, "saveBytes", null, th, new Object[0]);
        }
        return z;
    }

    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        if (!f1281b || context == null || bArr == null || TextUtils.isEmpty(str2) || !f1282c.containsKey(str)) {
            return null;
        }
        Integer num = f1282c.get(str);
        if (num == null) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance != null) {
                IStaticDataEncryptComponent staticDataEncryptComp = instance.getStaticDataEncryptComp();
                if (staticDataEncryptComp != null) {
                    return staticDataEncryptComp.staticBinarySafeDecryptNoB64(num.intValue(), str2, bArr, this.f1283d);
                }
            }
        } catch (Throwable th) {
            ALog.e(f1280a, "staticBinarySafeDecryptNoB64", null, th, new Object[0]);
        }
        return null;
    }

    public String sign(Context context, String str, String str2, String str3) {
        if (!f1281b || context == null || TextUtils.isEmpty(str2) || !f1282c.containsKey(str)) {
            return null;
        }
        try {
            ISecureSignatureComponent secureSignatureComp = SecurityGuardManager.getInstance(context).getSecureSignatureComp();
            if (secureSignatureComp != null) {
                SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                securityGuardParamContext.appKey = str2;
                securityGuardParamContext.paramMap.put("INPUT", str3);
                securityGuardParamContext.requestType = f1282c.get(str).intValue();
                return secureSignatureComp.signRequest(securityGuardParamContext, this.f1283d);
            }
        } catch (Throwable th) {
            ALog.e(f1280a, "Securityguard sign request failed.", null, th, new Object[0]);
        }
        return null;
    }
}

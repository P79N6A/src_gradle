package com.xiaomi.mipush.sdk;

import com.xiaomi.push.ip;
import java.util.HashMap;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<f, a> f81800a = new HashMap<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f81801a;

        /* renamed from: b  reason: collision with root package name */
        public String f81802b;

        public a(String str, String str2) {
            this.f81801a = str;
            this.f81802b = str2;
        }
    }

    static {
        a(f.ASSEMBLE_PUSH_HUAWEI, new a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        a(f.ASSEMBLE_PUSH_FCM, new a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        a(f.ASSEMBLE_PUSH_COS, new a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        a(f.ASSEMBLE_PUSH_FTOS, new a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    public static bd a(f fVar) {
        switch (n.f81803a[fVar.ordinal()]) {
            case 1:
                return bd.UPLOAD_HUAWEI_TOKEN;
            case 2:
                return bd.UPLOAD_FCM_TOKEN;
            case 3:
                return bd.UPLOAD_COS_TOKEN;
            case 4:
                return bd.UPLOAD_FTOS_TOKEN;
            default:
                return null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static a m75a(f fVar) {
        return f81800a.get(fVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static ip m76a(f fVar) {
        return ip.AggregatePushSwitch;
    }

    private static void a(f fVar, a aVar) {
        if (aVar != null) {
            f81800a.put(fVar, aVar);
        }
    }
}

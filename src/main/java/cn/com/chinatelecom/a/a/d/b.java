package cn.com.chinatelecom.a.a.d;

import android.content.Context;
import cn.com.chinatelecom.a.a.a.c;
import cn.com.chinatelecom.a.a.f.a;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f1700a = "openapi/tysuit/uploadLog.do";

    /* renamed from: b  reason: collision with root package name */
    public static String f1701b = "api/clientSuit/uploadResponseLog.do";

    /* renamed from: c  reason: collision with root package name */
    public static String f1702c = "http://open.e.189.cn/openapi/networkauth/preGetMobile.do";

    /* renamed from: d  reason: collision with root package name */
    private static final String f1703d = "b";

    /* renamed from: e  reason: collision with root package name */
    private static String f1704e = "openapi/tysuit/uploadErrorLog.do";

    public static Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.clear();
        return hashMap;
    }

    public static void a(Context context, String str, String str2, String str3, a aVar) {
        a aVar2 = aVar;
        if (aVar2 != null) {
            try {
                c.a(context, str, str2, str3, Integer.toString(aVar2.f1714a), aVar2.f1715b, null);
            } catch (Exception unused) {
            }
            return;
        }
        c.a(context, str, str2, str3, "", "", null);
    }
}

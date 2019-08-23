package com.ss.android.medialib.log;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.common.c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29687a = null;

    /* renamed from: b  reason: collision with root package name */
    public static IMonitor f29688b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f29689c = "a";

    public static boolean a(IMonitor iMonitor, String str, String str2, Map map) {
        IMonitor iMonitor2 = iMonitor;
        String str3 = str;
        String str4 = str2;
        Map map2 = map;
        if (PatchProxy.isSupport(new Object[]{iMonitor2, str3, str4, map2}, null, f29687a, true, 17463, new Class[]{IMonitor.class, String.class, String.class, Map.class}, Boolean.TYPE)) {
            Object[] objArr = {iMonitor2, str3, str4, map2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f29687a, true, 17463, new Class[]{IMonitor.class, String.class, String.class, Map.class}, Boolean.TYPE)).booleanValue();
        } else if (iMonitor2 == null) {
            c.b(f29689c, "No monitor callback, return");
            return false;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str5 : map.keySet()) {
                    jSONObject.put(str5, map2.get(str5));
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("service", str4);
                    }
                }
                if (iMonitor2 != null) {
                    iMonitor2.monitorLog(str3, jSONObject);
                }
                return true;
            } catch (JSONException unused) {
                c.b(f29689c, "No monitor callback, skip");
                return false;
            }
        }
    }
}

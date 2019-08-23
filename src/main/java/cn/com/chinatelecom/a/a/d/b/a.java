package cn.com.chinatelecom.a.a.d.b;

import android.text.TextUtils;
import cn.com.chinatelecom.a.a.c.g;
import cn.com.chinatelecom.a.a.d.a.b;
import cn.com.chinatelecom.a.a.e.i;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1705a = "a";

    public static cn.com.chinatelecom.a.a.f.a a(b bVar) {
        cn.com.chinatelecom.a.a.f.a aVar = new cn.com.chinatelecom.a.a.f.a();
        if (bVar != null) {
            try {
                if (bVar.f1697a != 200) {
                    aVar.f1714a = -8000;
                    aVar.f1715b = i.a(-8000);
                    return aVar;
                }
                JSONObject jSONObject = new JSONObject(bVar.f1698b);
                aVar.f1714a = jSONObject.optInt("result");
                aVar.f1715b = jSONObject.optString("msg");
            } catch (Exception unused) {
            }
        }
        return aVar;
    }

    public static cn.com.chinatelecom.a.a.f.b a(b bVar, String str) {
        cn.com.chinatelecom.a.a.f.b bVar2 = new cn.com.chinatelecom.a.a.f.b();
        if (bVar != null) {
            try {
                if (bVar.f1697a != 200) {
                    bVar2.f1714a = -8000;
                    bVar2.f1715b = i.a(-8000);
                    return bVar2;
                }
                JSONObject jSONObject = new JSONObject(bVar.f1698b);
                bVar2.f1714a = jSONObject.optInt("result");
                bVar2.f1715b = jSONObject.optString("msg");
                String optString = jSONObject.optString("data");
                String str2 = "";
                if ((bVar2.f1714a == 0 || bVar2.f1714a == 30002) && !TextUtils.isEmpty(optString)) {
                    str2 = g.c(optString, str);
                }
                JSONObject jSONObject2 = null;
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject2 = new JSONObject(str2);
                }
                if (jSONObject2 != null) {
                    if (bVar2.f1714a == 0) {
                        bVar2.f1716c = jSONObject2.optString("accessCode");
                        bVar2.f1717d = jSONObject2.optString("operatorType");
                    } else if (bVar2.f1714a == 30002) {
                        ArrayList arrayList = new ArrayList();
                        JSONArray optJSONArray = jSONObject2.optJSONArray("urls");
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                arrayList.add(optJSONArray.getString(i));
                            }
                        }
                        bVar2.f1718e = arrayList;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return bVar2;
    }
}

package cn.com.chinatelecom.a.a.a;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.a.a.d.a.a;
import cn.com.chinatelecom.a.a.d.a.b;
import cn.com.chinatelecom.a.a.e.c;
import org.json.JSONObject;

public final class e extends b {
    public static long a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return currentTimeMillis + b(context);
        } catch (Exception unused) {
            return currentTimeMillis;
        }
    }

    private static long b(Context context) {
        try {
            return c.b(context, "differenceTimeForServerNew", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean b(Context context, long j) {
        if (0 != j) {
            try {
                return c.a(context, "differenceTimeForServerNew", j);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    static long a(Context context, long j) {
        if (j > 0) {
            long currentTimeMillis = j - System.currentTimeMillis();
            if (currentTimeMillis <= 1000 && currentTimeMillis >= -1000) {
                long b2 = b(context);
                if ((b2 > 1000 || b2 < -1000) && b(context, currentTimeMillis)) {
                    return currentTimeMillis;
                }
            } else if (b(context, currentTimeMillis)) {
                return currentTimeMillis;
            }
        }
        return 0;
    }

    public static void a(final Context context, b bVar) {
        String str;
        if (bVar != null) {
            str = bVar.f1698b;
        } else {
            str = null;
        }
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && str.contains("{")) {
                    JSONObject jSONObject = new JSONObject(str);
                    int i = jSONObject.getInt("result");
                    long optLong = jSONObject.optLong("timeStamp", -1);
                    if ((i == -10009 || i == -30001) && optLong == -1) {
                        a(new Runnable() {
                            public final void run() {
                                try {
                                    String str = a.a("https://open.e.189.cn/openapi/special/getTimeStamp.do", null, "", null).f1698b;
                                    if (str != null && !TextUtils.isEmpty(str) && str.contains("{")) {
                                        e.a(context, new JSONObject(str).optLong("msg", -1));
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        });
                    }
                    a(context, optLong);
                }
            } catch (Exception unused) {
            }
        }
    }
}

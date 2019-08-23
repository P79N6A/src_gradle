package cn.com.chinatelecom.account.a;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.Helper;
import cn.com.chinatelecom.account.api.b.a;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f1721b = "c";

    public static int a(Context context) {
        try {
            return cn.com.chinatelecom.account.api.c.c.b(context, "key_c_l_l_v", 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    static synchronized Queue<String> a(Context context, List<String> list, int i) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (c.class) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            String a2 = b.a(context);
            if (!TextUtils.isEmpty(a2)) {
                try {
                    JSONArray jSONArray = new JSONArray(new String(Helper.dneulret(cn.com.chinatelecom.account.api.a.c.a(a2))));
                    int i2 = 0;
                    int length = jSONArray.length();
                    while (i2 < length && i2 <= 10) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        if (jSONObject != null) {
                            concurrentLinkedQueue.add(jSONObject.toString());
                        }
                        i2++;
                    }
                    b.a(context, "");
                } catch (Exception unused) {
                }
            }
            if (i == -1) {
                for (String next : list) {
                    try {
                        if (new JSONObject(next).getInt("rt") != 0) {
                            concurrentLinkedQueue.add(next);
                        }
                    } catch (Exception unused2) {
                    }
                }
            } else if (i == 0) {
                concurrentLinkedQueue.addAll(list);
            }
            while (concurrentLinkedQueue.size() > 10) {
                concurrentLinkedQueue.poll();
            }
        }
        return concurrentLinkedQueue;
    }

    static String a(Context context, Queue<String> queue) {
        String str;
        JSONArray jSONArray = new JSONArray();
        String jSONArray2 = jSONArray.toString();
        if (!queue.isEmpty()) {
            for (String jSONObject : queue) {
                try {
                    jSONArray.put(new JSONObject(jSONObject));
                } catch (Exception unused) {
                }
            }
        }
        if (jSONArray.length() <= 0) {
            return "";
        }
        String jSONArray3 = jSONArray.toString();
        if (!TextUtils.isEmpty(jSONArray3)) {
            try {
                str = URLEncoder.encode(Helper.guulam(context, jSONArray3), "UTF-8");
            } catch (Exception unused2) {
            }
            return a.a("https://collect.ux.21cn.com/collect/custom/accountMsg", str);
        }
        str = jSONArray2;
        return a.a("https://collect.ux.21cn.com/collect/custom/accountMsg", str);
    }

    static /* synthetic */ void a(Context context, Queue queue, int i) {
        String str = "";
        JSONArray jSONArray = new JSONArray();
        if (queue != null && !queue.isEmpty()) {
            Iterator it2 = queue.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                try {
                    JSONObject jSONObject = new JSONObject((String) it2.next());
                    if (i != -1 || jSONObject.getInt("rt") != 0) {
                        jSONArray.put(jSONObject);
                        i2++;
                        if (i2 > 10) {
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (jSONArray.length() > 0) {
            try {
                str = Helper.eneulret(jSONArray.toString());
            } catch (Exception unused2) {
                str = null;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            b.a(context, str);
        }
    }
}

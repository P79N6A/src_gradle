package com.ss.sys.ck.a;

import android.app.Application;
import android.content.Context;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.sys.ck.SCCheckUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static Context f78550a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f78551b = 25200;

    /* renamed from: c  reason: collision with root package name */
    public static int f78552c = 100;

    /* renamed from: d  reason: collision with root package name */
    private static c f78553d;

    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private String f78554a;

        public a(String str) {
            this.f78554a = str;
        }

        public final void run() {
            String str = this.f78554a;
            if (str != null && !str.equals("")) {
                try {
                    Object nextValue = new JSONTokener(str).nextValue();
                    if (nextValue instanceof JSONObject) {
                        e.a((JSONObject) nextValue);
                    } else if (nextValue instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) nextValue;
                        for (int i = 0; i < jSONArray.length(); i++) {
                            e.a((JSONObject) jSONArray.get(i));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            Context a2 = e.a();
            if (a2 != null) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long currentTimeMillis2 = (System.currentTimeMillis() / 1000) - ((long) e.f78551b);
                String a3 = e.b().a(currentTimeMillis2, ">?", (long) e.f78552c);
                if (!a3.equals("")) {
                    byte[] bytes = a3.getBytes();
                    try {
                        g gVar = new g(a2);
                        ((f) RetrofitUtils.getSsRetrofit(gVar.f78557b).create(f.class)).a(gVar.f78557b, new TypedByteArray("application/json; charset=utf-8", bytes, new String[0])).enqueue(new c<TypedInput>() {
                            public final void a(Call<TypedInput> call, SsResponse<TypedInput> ssResponse) {
                                boolean z;
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    byte[] bArr = new byte[1024];
                                    InputStream in = ((TypedInput) ssResponse.body()).in();
                                    while (true) {
                                        z = false;
                                        int read = in.read(bArr, 0, 1024);
                                        if (read <= 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    }
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    if (byteArray != null && new JSONObject(new String(byteArray)).getInt("code") == 200) {
                                        z = true;
                                    }
                                    e.a(d.f78549f, "<?");
                                    if (z) {
                                        e.a(d.g, "<?");
                                    }
                                } catch (Throwable unused) {
                                }
                            }

                            public final void a(Call<TypedInput> call, Throwable th) {
                            }
                        });
                    } catch (Throwable unused2) {
                        new d(a2, SCCheckUtils.getInstance().getSession()).a(1, 1, bytes);
                    }
                    d.g = currentTimeMillis;
                    d.f78549f = currentTimeMillis2;
                }
            }
        }
    }

    public e() {
        f78553d = c.a(a());
    }

    private static long a(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static Context a() {
        if (f78550a != null) {
            return f78550a;
        }
        try {
            Context applicationContext = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
            f78550a = applicationContext;
            return applicationContext;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean a(long j, String str) {
        try {
            b().a(j, str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static long b(JSONObject jSONObject) {
        long j;
        try {
            j = jSONObject.getLong("time");
        } catch (Throwable unused) {
            j = 0;
        }
        if (j == 0) {
            j = System.currentTimeMillis() / 1000;
            try {
                jSONObject.put("time", j);
            } catch (JSONException unused2) {
            }
        }
        return j;
    }

    public static c b() {
        synchronized (e.class) {
            if (f78553d == null) {
                f78553d = c.a(a());
            }
        }
        return f78553d;
    }

    static boolean a(JSONObject jSONObject) {
        try {
            long b2 = b(jSONObject);
            jSONObject.put("did", a(SCCheckUtils.getInstance().getDid()));
            jSONObject.put("iid", a(SCCheckUtils.getInstance().getIid()));
            jSONObject.put("aid", a(SCCheckUtils.getInstance().getAid()));
            jSONObject.put("ip", i.b());
            jSONObject.put("uid", 0);
            jSONObject.put("version_code", a(i.a()));
            jSONObject.put("os", PushConstants.PUSH_TYPE_NOTIFY);
            jSONObject.put("channel", SCCheckUtils.getInstance().getChannel());
            String jSONObject2 = jSONObject.toString();
            c b3 = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b2);
            sb.append("_");
            int i = c.f78544a;
            c.f78544a++;
            sb.append(i);
            b3.a(sb.toString(), b2, jSONObject2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

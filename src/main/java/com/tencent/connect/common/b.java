package com.tencent.connect.common;

import android.content.Intent;
import com.tencent.open.a.f;
import com.tencent.open.d.h;
import com.tencent.tauth.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f79633a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, a> f79634b = Collections.synchronizedMap(new HashMap());

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f79635a;

        /* renamed from: b  reason: collision with root package name */
        public com.tencent.tauth.b f79636b;

        public a(int i, com.tencent.tauth.b bVar) {
            this.f79635a = i;
            this.f79636b = bVar;
        }
    }

    public static b a() {
        if (f79633a == null) {
            f79633a = new b();
        }
        return f79633a;
    }

    private b() {
        if (this.f79634b == null) {
            this.f79634b = Collections.synchronizedMap(new HashMap());
        }
    }

    public final com.tencent.tauth.b a(String str) {
        a aVar;
        if (str == null) {
            f.e("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.f79634b) {
            aVar = this.f79634b.get(str);
            this.f79634b.remove(str);
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f79636b;
    }

    public final Object a(int i, com.tencent.tauth.b bVar) {
        a put;
        String a2 = com.tencent.open.d.f.a(11101);
        if (a2 == null) {
            f.e("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=" + 11101);
            return null;
        }
        synchronized (this.f79634b) {
            put = this.f79634b.put(a2, new a(11101, bVar));
        }
        if (put == null) {
            return null;
        }
        return put.f79636b;
    }

    public static void a(Intent intent, com.tencent.tauth.b bVar) {
        String str;
        f.c("openSDK_LOG.UIListenerManager", "handleDataToListener");
        if (intent == null) {
            bVar.h();
            return;
        }
        String stringExtra = intent.getStringExtra("key_action");
        if ("action_login".equals(stringExtra)) {
            int intExtra = intent.getIntExtra("key_error_code", 0);
            if (intExtra == 0) {
                String stringExtra2 = intent.getStringExtra("key_response");
                if (stringExtra2 != null) {
                    try {
                        bVar.a((Object) h.d(stringExtra2));
                    } catch (JSONException e2) {
                        bVar.a(new d(-4, "服务器返回数据格式有误!", stringExtra2));
                        f.b("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e2);
                    }
                } else {
                    f.b("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                    bVar.a((Object) new JSONObject());
                }
            } else {
                f.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra);
                bVar.a(new d(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            }
        } else if ("action_share".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra("result");
            String stringExtra4 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra3)) {
                bVar.h();
            } else if ("error".equals(stringExtra3)) {
                bVar.a(new d(-6, "unknown error", stringExtra4));
            } else if ("complete".equals(stringExtra3)) {
                try {
                    if (stringExtra4 == null) {
                        str = "{\"ret\": 0}";
                    } else {
                        str = stringExtra4;
                    }
                    bVar.a((Object) new JSONObject(str));
                } catch (JSONException unused) {
                    bVar.a(new d(-4, "json error", stringExtra4));
                }
            }
        }
    }

    public final boolean a(int i, int i2, Intent intent, com.tencent.tauth.b bVar) {
        com.tencent.tauth.b bVar2;
        String str;
        f.c("openSDK_LOG.UIListenerManager", "onActivityResult req=" + i + " res=" + i2);
        String a2 = com.tencent.open.d.f.a(i);
        if (a2 == null) {
            f.e("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + i);
            bVar2 = null;
        } else {
            bVar2 = a(a2);
        }
        if (bVar2 != null) {
            bVar = bVar2;
        } else if (bVar == null) {
            f.e("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
            return false;
        } else if (i == 11101) {
            f.e("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11105) {
            f.e("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11106) {
            f.e("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        }
        if (i2 != -1) {
            bVar.h();
        } else if (intent == null) {
            bVar.a(new d(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
            return true;
        } else {
            String stringExtra = intent.getStringExtra("key_action");
            if ("action_login".equals(stringExtra)) {
                int intExtra = intent.getIntExtra("key_error_code", 0);
                if (intExtra == 0) {
                    String stringExtra2 = intent.getStringExtra("key_response");
                    if (stringExtra2 != null) {
                        try {
                            bVar.a((Object) h.d(stringExtra2));
                        } catch (JSONException e2) {
                            bVar.a(new d(-4, "服务器返回数据格式有误!", stringExtra2));
                            f.b("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e2);
                        }
                    } else {
                        f.b("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                        bVar.a((Object) new JSONObject());
                    }
                } else {
                    f.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra);
                    bVar.a(new d(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                }
            } else if ("action_share".equals(stringExtra)) {
                String stringExtra3 = intent.getStringExtra("result");
                String stringExtra4 = intent.getStringExtra("response");
                if ("cancel".equals(stringExtra3)) {
                    bVar.h();
                } else if ("error".equals(stringExtra3)) {
                    bVar.a(new d(-6, "unknown error", stringExtra4));
                } else if ("complete".equals(stringExtra3)) {
                    try {
                        if (stringExtra4 == null) {
                            str = "{\"ret\": 0}";
                        } else {
                            str = stringExtra4;
                        }
                        bVar.a((Object) new JSONObject(str));
                    } catch (JSONException unused) {
                        bVar.a(new d(-4, "json error", stringExtra4));
                    }
                }
            } else {
                int intExtra2 = intent.getIntExtra("key_error_code", 0);
                if (intExtra2 == 0) {
                    String stringExtra5 = intent.getStringExtra("key_response");
                    if (stringExtra5 != null) {
                        try {
                            bVar.a((Object) h.d(stringExtra5));
                        } catch (JSONException unused2) {
                            bVar.a(new d(-4, "服务器返回数据格式有误!", stringExtra5));
                        }
                    } else {
                        bVar.a((Object) new JSONObject());
                    }
                } else {
                    bVar.a(new d(intExtra2, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                }
            }
        }
        return true;
    }
}

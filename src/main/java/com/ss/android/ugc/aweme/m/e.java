package com.ss.android.ugc.aweme.m;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.usergrowth.data.a.d;
import com.bytedance.usergrowth.data.deviceinfo.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.e.c;
import com.ss.android.ugc.aweme.framework.e.a;
import org.json.JSONObject;

public class e implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54111a = null;

    /* renamed from: c  reason: collision with root package name */
    public static c<e> f54112c = new c<e>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54117a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f54117a, false, 49500, new Class[0], e.class)) {
                return new e(a.a(), (byte) 0);
            }
            return (e) PatchProxy.accessDispatch(new Object[0], this, f54117a, false, 49500, new Class[0], e.class);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final String f54113d = "e";

    /* renamed from: b  reason: collision with root package name */
    public Handler f54114b;

    /* renamed from: e  reason: collision with root package name */
    private boolean f54115e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f54116f;
    private final Context g;

    private e(Context context) {
        this.f54114b = new WeakHandler(Looper.getMainLooper(), this);
        this.g = context.getApplicationContext();
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f54111a, false, 49498, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f54111a, false, 49498, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message != null && message.what == 1 && (message.obj instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) message.obj;
            if (!this.f54115e && a("get_phone_enable", jSONObject)) {
                this.f54115e = true;
                d.a();
                new com.ss.android.uniqueid.getphone.e("8013818520", "oT5zHGhP2vQBB0Mv8T7voio4tm0fGrrC").a(this.g);
            }
            if (!this.f54116f && a("other_info_enable", jSONObject)) {
                this.f54116f = true;
                d.a();
                d.a(com.bytedance.usergrowth.data.deviceinfo.e.class, new i());
                com.bytedance.usergrowth.data.deviceinfo.e eVar = (com.bytedance.usergrowth.data.deviceinfo.e) d.a(com.bytedance.usergrowth.data.deviceinfo.e.class);
                eVar.b(true);
                eVar.a(true);
                eVar.a(this.g);
            }
        }
    }

    /* synthetic */ e(Context context, byte b2) {
        this(context);
    }

    private static boolean a(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, null, f54111a, true, 49499, new Class[]{String.class, JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, null, f54111a, true, 49499, new Class[]{String.class, JSONObject.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str) || jSONObject2.optInt(str2, 0) <= 0) {
            return false;
        } else {
            return true;
        }
    }
}

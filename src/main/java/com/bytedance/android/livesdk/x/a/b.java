package com.bytedance.android.livesdk.x.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.j.g;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.a;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18586a;

    /* renamed from: b  reason: collision with root package name */
    private String f18587b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHandler f18588c;

    /* renamed from: d  reason: collision with root package name */
    private String f18589d;

    /* renamed from: e  reason: collision with root package name */
    private long f18590e;

    /* renamed from: f  reason: collision with root package name */
    private a f18591f;
    private int g;
    private boolean h;
    private ProgressDialog i;
    private Context j;
    private HashMap<String, String> k;

    public final void a(f.a aVar) {
        HashMap<String, String> hashMap;
        String str;
        String str2;
        boolean z;
        String str3;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f18586a, false, 13333, new Class[]{f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f18586a, false, 13333, new Class[]{f.a.class}, Void.TYPE);
            return;
        }
        this.j = aVar.b().f18760a;
        if (!this.i.isShowing()) {
            this.i.show();
            this.i.setCanceledOnTouchOutside(false);
        }
        String str4 = this.f18587b;
        if (PatchProxy.isSupport(new Object[]{str4}, null, g.f15716a, true, 10897, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4}, null, g.f15716a, true, 10897, new Class[]{String.class}, Void.TYPE);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event_type", "click");
            hashMap2.put("event_belong", "live");
            hashMap2.put("event_page", "live_action");
            hashMap2.put("event_module", PushConstants.TITLE);
            hashMap2.put("live_edit_type", PushConstants.TITLE);
            if (str4.length() == 0) {
                str3 = "off";
            } else {
                str3 = "on";
            }
            hashMap2.put("title_status", str3);
            com.bytedance.android.livesdk.j.a.a().a("live_edit_features", hashMap2, new Object[0]);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event_type", "click");
            hashMap3.put("event_belong", "live");
            hashMap3.put("event_page", "live_action");
            hashMap3.put("event_module", "action");
            hashMap3.put("is_beauty", "off");
            com.bytedance.android.livesdk.j.a.a().a("live_action", hashMap3, new Object[0]);
        }
        if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.livesdk.live.a.f15781a, true, 10233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.livesdk.live.a.f15781a, true, 10233, new Class[0], Void.TYPE);
        } else {
            com.bytedance.android.livesdk.live.a.f15782b = System.currentTimeMillis();
        }
        h a2 = h.a();
        WeakHandler weakHandler = this.f18588c;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f18586a, false, 13334, new Class[]{f.a.class}, HashMap.class)) {
            hashMap = (HashMap) PatchProxy.accessDispatch(new Object[]{aVar}, this, f18586a, false, 13334, new Class[]{f.a.class}, HashMap.class);
        } else {
            o a3 = new o().a(PushConstants.TITLE, this.f18587b).a("cover_uri", this.f18589d);
            if (this.f18590e != 0) {
                str = String.valueOf(this.f18590e);
            } else {
                str = "";
            }
            o a4 = a3.a("game", str);
            if (this.g != -1) {
                str2 = String.valueOf(this.g);
            } else {
                str2 = "";
            }
            hashMap = a4.a("tags", str2).f17622b;
            if (this.f18591f == a.AUDIO) {
                hashMap.put("live_audio", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            } else if (this.f18591f == a.THIRD_PARTY) {
                hashMap.put("third_party", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            } else if (this.f18591f == a.SCREEN_RECORD) {
                hashMap.put("screen_shot", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            String str5 = aVar.b().f18762c.get("has_commerce_goods");
            if (str5 == null || (!str5.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE) && !str5.equals("true"))) {
                z = false;
            } else {
                z = true;
            }
            if (this.h || z) {
                hashMap.put("has_commerce_goods", "true");
            } else {
                aVar.b().f18762c.remove("has_commerce_goods");
            }
            if (this.k != null && !this.k.isEmpty()) {
                hashMap.putAll(this.k);
            }
            hashMap.putAll(aVar.b().f18762c);
            aVar.b().f18762c.clear();
        }
        WeakHandler weakHandler2 = weakHandler;
        if (PatchProxy.isSupport(new Object[]{weakHandler, hashMap, 1}, a2, h.f9797a, false, 3984, new Class[]{Handler.class, HashMap.class, Integer.TYPE}, Void.TYPE)) {
            h hVar = a2;
            PatchProxy.accessDispatch(new Object[]{weakHandler2, hashMap, 1}, hVar, h.f9797a, false, 3984, new Class[]{Handler.class, HashMap.class, Integer.TYPE}, Void.TYPE);
        } else {
            ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).createRoom(hashMap).compose(i.a()).subscribe(new com.bytedance.android.livesdk.chatroom.bl.i(weakHandler2, 1), new com.bytedance.android.livesdk.chatroom.bl.j(weakHandler2, 1));
        }
        com.bytedance.android.livesdk.j.f.a(this.j);
    }

    public final void a(String str, WeakHandler weakHandler, String str2, a aVar, int i2, Long l, boolean z, ProgressDialog progressDialog, HashMap<String, String> hashMap) {
        String str3 = str;
        WeakHandler weakHandler2 = weakHandler;
        String str4 = str2;
        a aVar2 = aVar;
        ProgressDialog progressDialog2 = progressDialog;
        HashMap<String, String> hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{str3, weakHandler2, str4, aVar2, Integer.valueOf(i2), l, Byte.valueOf(z ? (byte) 1 : 0), progressDialog2, hashMap2}, this, f18586a, false, 13332, new Class[]{String.class, WeakHandler.class, String.class, a.class, Integer.TYPE, Long.class, Boolean.TYPE, ProgressDialog.class, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, weakHandler2, str4, aVar2, Integer.valueOf(i2), l, Byte.valueOf(z), progressDialog2, hashMap2}, this, f18586a, false, 13332, new Class[]{String.class, WeakHandler.class, String.class, a.class, Integer.TYPE, Long.class, Boolean.TYPE, ProgressDialog.class, HashMap.class}, Void.TYPE);
            return;
        }
        this.f18587b = str3;
        this.f18588c = weakHandler2;
        this.f18589d = str4;
        this.f18590e = l.longValue();
        this.f18591f = aVar2;
        this.g = i2;
        this.h = z;
        this.i = progressDialog2;
        this.k = hashMap2;
    }
}

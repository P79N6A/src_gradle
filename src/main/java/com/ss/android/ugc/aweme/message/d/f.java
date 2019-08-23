package com.ss.android.ugc.aweme.message.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.ies.geckoclient.model.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.message.a.a;
import com.ss.android.ugc.aweme.message.model.BaseMessage;
import com.ss.android.ugc.aweme.message.model.MessageType;
import com.ss.android.ugc.aweme.net.a.h;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.websocket.b.a.b;
import com.ss.android.websocket.b.a.c;
import com.ss.android.websocket.b.a.d;
import com.ss.android.websocket.b.a.e;
import com.ss.android.websocket.b.b;
import java.util.HashMap;
import java.util.Set;
import okio.ByteString;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3570a = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f3571e = "com.ss.android.ugc.aweme.message.d.f";
    private static f k = new f();

    /* renamed from: b  reason: collision with root package name */
    public String f3572b = "";

    /* renamed from: c  reason: collision with root package name */
    public boolean f3573c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<MessageType, Set<a>> f3574d = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private String f3575f;
    private boolean g;
    private boolean h;
    private boolean i;
    private long j;

    public final void c() {
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.a aVar) {
    }

    public static f d() {
        return k;
    }

    private f() {
    }

    public static int g() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], null, f3570a, true, 58783, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f3570a, true, 58783, new Class[0], Integer.TYPE)).intValue();
        }
        if (p.a().b()) {
            i2 = 1;
        }
        return i2;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3570a, false, 58794, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3570a, false, 58794, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final String e() {
        if (PatchProxy.isSupport(new Object[0], this, f3570a, false, 58780, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f3570a, false, 58780, new Class[0], String.class);
        } else if (g.g.a().f3578b) {
            return g.g.a().f3580d;
        } else {
            return this.f3575f;
        }
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f3570a, false, 58782, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3570a, false, 58782, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String sessionKey = AppLog.getSessionKey();
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || !iUserService.isLogin()) {
            sessionKey = "";
        }
        boolean z = !TextUtils.equals(this.f3572b, sessionKey);
        if (z) {
            this.f3572b = sessionKey;
            this.g = true;
        }
        return z;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3570a, false, 58795, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3570a, false, 58795, new Class[0], Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("IsBackground", String.valueOf(g()));
        e eVar = new e(this.f3575f, 9000, 0, 0, 4, new byte[]{0}, "", "", hashMap);
        bg.a(new d(this.f3575f, eVar));
    }

    public final void f() {
        String str;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f3570a, false, 58781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3570a, false, 58781, new Class[0], Void.TYPE);
        } else if (NetworkUtils.isNetworkAvailable(AwemeAppData.p().c().getContext())) {
            if (((Boolean) SharePrefCache.inst().getUseHttps().c()).booleanValue()) {
                str = "wss://frontier.snssdk.com/ws/v2";
            } else {
                str = "ws://frontier.snssdk.com/ws/v2";
            }
            if (!com.ss.android.g.a.a()) {
                String a2 = h.g().a(AwemeAppData.p().c().getContext(), "frontier_urls", "");
                if (!TextUtils.isEmpty(a2)) {
                    try {
                        JSONArray jSONArray = new JSONArray(a2);
                        while (true) {
                            if (i2 >= jSONArray.length()) {
                                break;
                            }
                            String optString = jSONArray.optString(i2);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith("wss:")) {
                                str = optString;
                                break;
                            }
                            i2++;
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            String str2 = this.f3575f;
            this.f3575f = str;
            if ((!StringUtils.isEmpty(str2) && !StringUtils.equal(this.f3575f, str2)) || h()) {
                a(str2);
            }
            b bVar = new b(this.f3575f, new e(), new c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55386a;

                public final String a() {
                    if (PatchProxy.isSupport(new Object[0], this, f55386a, false, 58796, new Class[0], String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f55386a, false, 58796, new Class[0], String.class);
                    }
                    StringBuilder sb = new StringBuilder();
                    AppLog.appendCommonParams(sb, false);
                    sb.append("&aid=");
                    sb.append(AppLog.getAppId());
                    sb.append("&device_id=");
                    sb.append(AppLog.getServerDeviceId());
                    sb.append("&access_key=");
                    String serverDeviceId = AppLog.getServerDeviceId();
                    sb.append(DigestUtils.md5Hex("9" + "e1bd35ec9db7b8d846de66ed140b1ad9" + serverDeviceId + "f8a69f1719916z"));
                    sb.append("&fpid=");
                    sb.append(9);
                    sb.append("&iid=");
                    sb.append(AppLog.getInstallId());
                    sb.append("&sid=");
                    sb.append(f.this.f3572b);
                    sb.append("&wid=");
                    sb.append(0);
                    sb.append("&pl=");
                    sb.append(0);
                    sb.append("&ne=");
                    sb.append(f.a(NetworkUtils.getNetworkType(GlobalContext.getContext())));
                    if (com.ss.android.g.a.a()) {
                        sb.append("&language=");
                        sb.append(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(AwemeAppData.p().c().getContext()).a());
                    }
                    sb.append("&is_background=");
                    sb.append(f.g());
                    return sb.toString();
                }
            });
            com.ss.android.ugc.aweme.antiaddic.d.d().a(this);
            bg.a(bVar);
            synchronized (this) {
                bg.c(this);
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3570a, false, 58793, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3570a, false, 58793, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public static int a(NetworkUtils.h hVar) {
        if (hVar == NetworkUtils.h.WIFI) {
            return 1;
        }
        if (hVar == NetworkUtils.h.MOBILE_2G) {
            return 2;
        }
        if (hVar == NetworkUtils.h.MOBILE_3G) {
            return 3;
        }
        if (hVar == NetworkUtils.h.MOBILE_4G) {
            return 4;
        }
        return 0;
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3570a, false, 58785, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3570a, false, 58785, new Class[]{String.class}, Void.TYPE);
            return;
        }
        bg.a(new com.ss.android.websocket.b.a.a(str2));
    }

    private void a(BaseMessage baseMessage) {
        BaseMessage baseMessage2 = baseMessage;
        if (PatchProxy.isSupport(new Object[]{baseMessage2}, this, f3570a, false, 58790, new Class[]{BaseMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseMessage2}, this, f3570a, false, 58790, new Class[]{BaseMessage.class}, Void.TYPE);
        } else if (baseMessage2 != null) {
            Set<a> set = this.f3574d.get(baseMessage2.msgType);
            if (set != null) {
                for (a a2 : set) {
                    a2.a(baseMessage2);
                }
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.qrcode.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3570a, false, 58792, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3570a, false, 58792, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE);
        } else if (m.a().c()) {
            f();
        } else {
            if (!p.a().b()) {
                com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.ke).a();
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3570a, false, 58788, new Class[]{com.ss.android.websocket.b.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3570a, false, 58788, new Class[]{com.ss.android.websocket.b.b.b.class}, Void.TYPE);
            return;
        }
        if (this.i) {
            this.h = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.j);
                MonitorUtils.monitorStatusRate("aweme_long_connection_error_rate", 0, jSONObject);
                a(f3571e, "monitor ws connect success");
            } catch (Exception unused) {
            }
        }
        this.i = false;
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f3570a, false, 58789, new Class[]{com.ss.android.websocket.b.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f3570a, false, 58789, new Class[]{com.ss.android.websocket.b.b.c.class}, Void.TYPE);
            return;
        }
        String str = f3571e;
        a(str, "ReceivedMsgEvent receive message method=" + cVar.f78211d + "  service=" + cVar.f78212e + " url=" + cVar.f78208a);
        Object obj = cVar.f78210c;
        if (obj instanceof BaseMessage) {
            a((BaseMessage) obj);
        } else if (!com.ss.android.g.a.a() && cVar.f78211d == 1 && cVar.f78212e == 1004) {
            com.ss.android.ugc.aweme.cloudcontrol.b.b.a(cVar);
        } else {
            if (com.bytedance.ies.geckoclient.e.e.a(cVar.f78212e)) {
                byte[] bArr = cVar.f78209b;
                if (bArr != null) {
                    l lVar = new l(cVar.f78211d, ByteString.of(bArr).utf8());
                    com.bytedance.ies.geckoclient.f fVar = (com.bytedance.ies.geckoclient.f) ServiceManager.get().getService(com.bytedance.ies.geckoclient.f.class);
                    if (fVar != null) {
                        fVar.a(lVar);
                    }
                }
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3570a, false, 58786, new Class[]{com.ss.android.websocket.b.b.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3570a, false, 58786, new Class[]{com.ss.android.websocket.b.b.d.class}, Void.TYPE);
            return;
        }
        a(f3571e, "WSFailEvent and start fetch");
        if (!this.h && this.i) {
            this.h = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.j);
                jSONObject.put("errorCode", dVar.f78214b.value);
                MonitorUtils.monitorStatusRate("aweme_long_connection_error_rate", 1, jSONObject);
                a(f3571e, "monitor ws connect failed");
            } catch (Exception unused) {
            }
        }
        this.i = false;
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.g gVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3570a, false, 58787, new Class[]{com.ss.android.websocket.b.b.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3570a, false, 58787, new Class[]{com.ss.android.websocket.b.b.g.class}, Void.TYPE);
            return;
        }
        if ((gVar.f78219b == null || gVar.f78219b == b.a.CLOSED) && this.g) {
            this.g = false;
            f();
        }
        if (gVar.f78219b == b.a.OPENING) {
            this.j = SystemClock.uptimeMillis();
            this.i = true;
            a(f3571e, "monitor ws connect duration start!");
        }
        if (gVar.f78219b != b.a.CONNECTED) {
            z = false;
        }
        this.f3573c = z;
        if (this.f3573c) {
            com.bytedance.ies.geckoclient.f fVar = (com.bytedance.ies.geckoclient.f) ServiceManager.get().getService(com.bytedance.ies.geckoclient.f.class);
            if (fVar != null) {
                fVar.e();
            }
        }
    }

    private void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f3570a, false, 58791, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f3570a, false, 58791, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Logger.debug();
    }
}

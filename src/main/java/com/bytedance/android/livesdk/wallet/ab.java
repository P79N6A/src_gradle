package com.bytedance.android.livesdk.wallet;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.d.d;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.af;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.a.e;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.bytedance.android.livesdk.wallet.b.b;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ab implements a.C0132a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17897a;

    /* renamed from: b  reason: collision with root package name */
    public c f17898b;

    /* renamed from: c  reason: collision with root package name */
    public long f17899c;

    /* renamed from: d  reason: collision with root package name */
    public long f17900d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, Integer> f17901e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public int f17902f = 0;
    private String g;
    private WeakReference<Context> h;
    private Handler i = new com.bytedance.android.livesdkapi.depend.c.a(this);
    private ProgressDialog j;

    public static class a implements h.b<ab> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17913a;

        @NonNull
        public final h.b.a<ab> a(h.b.a<ab> aVar) {
            h.b.a<ab> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17913a, false, 14030, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new ab()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17913a, false, 14030, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final void a(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f17897a, false, 14012, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f17897a, false, 14012, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (!(message2.what != 1 || this.f17898b == null || this.h == null || this.h.get() == null)) {
            Context context = (Context) this.h.get();
            c cVar = this.f17898b;
            String str = this.g;
            if (PatchProxy.isSupport(new Object[]{context, cVar, "-998", "", str, ""}, this, f17897a, false, 14015, new Class[]{Context.class, c.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, cVar, "-998", "", str, ""}, this, f17897a, false, 14015, new Class[]{Context.class, c.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("channel_id", cVar.f18700f);
                hashMap.put("order_id", cVar.f18695a);
                hashMap.put("error_msg", "");
                hashMap.put("error_code", "-998");
                hashMap.put("product_id", cVar.f18697c);
                if (TextUtils.equals("-998", "-999")) {
                    ai.a((int) C0906R.string.dgk);
                    j.q().f().a("H5_payStatusChange", b(cVar, 2));
                } else if ((cVar.f18696b == r.WEIXIN && TextUtils.equals("-998", PushConstants.PUSH_TYPE_NOTIFY)) || (cVar.f18696b == r.ALIPAY && TextUtils.equals("-998", "9000"))) {
                    if (PatchProxy.isSupport(new Object[]{"-998", hashMap}, this, f17897a, false, 14020, new Class[]{String.class, Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{"-998", hashMap}, this, f17897a, false, 14020, new Class[]{String.class, Map.class}, Void.TYPE);
                    } else {
                        b.a(0, hashMap);
                    }
                    a(context, cVar, "-998", str, "");
                } else if ((cVar.f18696b == r.WEIXIN && TextUtils.equals("-998", "-2")) || (cVar.f18696b == r.ALIPAY && TextUtils.equals("-998", "6001"))) {
                    if (PatchProxy.isSupport(new Object[]{"-998", hashMap}, this, f17897a, false, 14021, new Class[]{String.class, Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{"-998", hashMap}, this, f17897a, false, 14021, new Class[]{String.class, Map.class}, Void.TYPE);
                    } else {
                        b.a(2, hashMap);
                        b.b(2, hashMap);
                    }
                    ai.a((int) C0906R.string.dgi);
                    j.q().f().a("H5_payStatusChange", b(cVar, -1));
                } else if ((cVar.f18696b != r.WEIXIN || !TextUtils.equals("-998", "-998")) && (cVar.f18696b != r.ALIPAY || (!TextUtils.equals("-998", "6002") && !TextUtils.equals("-998", "6004")))) {
                    if (PatchProxy.isSupport(new Object[]{"-998", hashMap}, this, f17897a, false, 14023, new Class[]{String.class, Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{"-998", hashMap}, this, f17897a, false, 14023, new Class[]{String.class, Map.class}, Void.TYPE);
                    } else {
                        b.a(1, hashMap);
                        b.b(1, hashMap);
                    }
                    j.q().f().a("H5_payStatusChange", b(cVar, 2));
                    if (((Integer) LiveSettingKeys.LIVE_RECHARGE_DIALOG_TYPE.a()).intValue() == 0) {
                        ai.a((int) C0906R.string.dgk);
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[]{"-998", hashMap}, this, f17897a, false, 14022, new Class[]{String.class, Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{"-998", hashMap}, this, f17897a, false, 14022, new Class[]{String.class, Map.class}, Void.TYPE);
                    } else {
                        b.a(3, hashMap);
                        b.b(3, hashMap);
                    }
                    a(context, cVar, "-998", str, "");
                }
            }
            this.f17898b = null;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17897a, false, 14019, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17897a, false, 14019, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            if (this.j.isShowing()) {
                this.j.dismiss();
            }
            this.j = null;
        }
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f17897a, false, 14018, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f17897a, false, 14018, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if ((context != null && this.j == null) || !this.j.isShowing()) {
            this.j = af.a(context, ac.a((int) C0906R.string.dgp));
        }
    }

    private HashMap<String, String> a(@NonNull c cVar, String str) {
        c cVar2 = cVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cVar2, str2}, this, f17897a, false, 14024, new Class[]{c.class, String.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{cVar2, str2}, this, f17897a, false, 14024, new Class[]{c.class, String.class}, HashMap.class);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("OrderId", cVar2.f18695a);
        hashMap.put("ChannelParam", str2);
        hashMap.put("ChannelId", cVar2.f18700f);
        TTLiveSDKContext.getHostService().a();
        hashMap.put("AppId", "1128");
        return hashMap;
    }

    public final JSONObject b(@NonNull c cVar, int i2) {
        String str;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i2)}, this, f17897a, false, 14027, new Class[]{c.class, Integer.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i2)}, this, f17897a, false, 14027, new Class[]{c.class, Integer.TYPE}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "pay");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("order_id", cVar2.f18695a);
            jSONObject2.put("channel_param", i2);
            if (cVar2.f18696b == r.ALIPAY) {
                str = "alipay";
            } else {
                str = "wxpay";
            }
            jSONObject2.put("channel", str);
            jSONObject2.put("channel_id", cVar2.f18700f);
            jSONObject.put("args", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final HashMap<String, Object> a(@NonNull c cVar, int i2) {
        c cVar2 = cVar;
        if (!PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i2)}, this, f17897a, false, 14026, new Class[]{c.class, Integer.TYPE}, HashMap.class)) {
            return a(cVar2, i2, null);
        }
        return (HashMap) PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i2)}, this, f17897a, false, 14026, new Class[]{c.class, Integer.TYPE}, HashMap.class);
    }

    public final HashMap<String, Object> a(@NonNull c cVar, int i2, @Nullable Throwable th) {
        c cVar2 = cVar;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i2), th2}, this, f17897a, false, 14025, new Class[]{c.class, Integer.TYPE, Throwable.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i2), th2}, this, f17897a, false, 14025, new Class[]{c.class, Integer.TYPE, Throwable.class}, HashMap.class);
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("order_id", cVar2.f18695a);
        hashMap.put("channel_id", cVar2.f18700f);
        hashMap.put("times", String.valueOf(i2));
        if (th2 != null) {
            if (th2 instanceof com.bytedance.android.live.a.a.a) {
                hashMap.put("error_code", Integer.valueOf(((com.bytedance.android.live.a.a.a) th2).getErrorCode()));
            }
            hashMap.put("error_msg", th.getMessage());
        }
        return hashMap;
    }

    public final void a(Context context, c cVar, String str, String str2, String str3) {
        final c cVar2 = cVar;
        String str4 = str;
        final int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{context, cVar2, str4, str2, str3}, this, f17897a, false, 14016, new Class[]{Context.class, c.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, cVar2, str4, str2, str3}, this, f17897a, false, 14016, new Class[]{Context.class, c.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(context);
        Integer num = this.f17901e.get(cVar2.f18695a);
        if (num != null) {
            i2 = num.intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f17900d = uptimeMillis;
        if (i2 == 0) {
            this.f17899c = uptimeMillis;
        }
        if (i2 > 4) {
            a();
            ai.a((int) C0906R.string.dgl);
            long uptimeMillis2 = SystemClock.uptimeMillis() - this.f17899c;
            b.a(1, uptimeMillis2, a(cVar2, i2));
            b.b(1, uptimeMillis2, a(cVar2, i2));
            j.q().f().a("H5_payStatusChange", b(cVar2, 2));
            return;
        }
        Observable compose = ((WalletApi) j.q().d().a(WalletApi.class)).getOrderStatus(a(cVar2, str4)).compose(i.a());
        final c cVar3 = cVar;
        final int i3 = i2;
        final Context context2 = context;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        AnonymousClass1 r0 = new Consumer<com.bytedance.android.live.core.network.response.b<e, Extra>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17903a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                com.bytedance.android.live.core.network.response.b bVar = (com.bytedance.android.live.core.network.response.b) obj;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f17903a, false, 14028, new Class[]{com.bytedance.android.live.core.network.response.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f17903a, false, 14028, new Class[]{com.bytedance.android.live.core.network.response.b.class}, Void.TYPE);
                    return;
                }
                long uptimeMillis = SystemClock.uptimeMillis() - ab.this.f17899c;
                ab.this.f17901e.put(cVar3.f18695a, Integer.valueOf(i3 + 1));
                switch (((e) bVar.f7871b).f17878a) {
                    case 0:
                        ai.a((int) C0906R.string.dgs);
                        ab.this.a();
                        b.a(1, uptimeMillis, ab.this.a(cVar3, i3));
                        b.b(1, uptimeMillis, ab.this.a(cVar3, i3));
                        j.q().f().a("H5_payStatusChange", ab.this.b(cVar3, 2));
                        break;
                    case 1:
                    case 2:
                        ai.a((int) C0906R.string.dgt);
                        ab.this.a();
                        b.a(2, uptimeMillis, ab.this.a(cVar3, i3));
                        b.b(2, uptimeMillis, ab.this.a(cVar3, i3));
                        j.q().f().a("H5_payStatusChange", ab.this.b(cVar3, 2));
                        break;
                    case 3:
                    case 4:
                        ab.this.a(context2, cVar3, str5, str6, str7);
                        break;
                    case 5:
                        ab abVar = ab.this;
                        c cVar = cVar3;
                        String str = str6;
                        String str2 = str7;
                        if (PatchProxy.isSupport(new Object[]{cVar, str, str2}, abVar, ab.f17897a, false, 14017, new Class[]{c.class, String.class, String.class}, Void.TYPE)) {
                            ab abVar2 = abVar;
                            PatchProxy.accessDispatch(new Object[]{cVar, str, str2}, abVar2, ab.f17897a, false, 14017, new Class[]{c.class, String.class, String.class}, Void.TYPE);
                        } else {
                            HashMap hashMap = new HashMap();
                            if (cVar != null) {
                                String str3 = "";
                                if (cVar.f18696b == r.ALIPAY) {
                                    str3 = "alipay";
                                } else if (cVar.f18696b == r.WEIXIN) {
                                    str3 = "wxpay";
                                }
                                hashMap.put("pay_method", str3);
                                hashMap.put("money", String.valueOf(cVar.f18698d));
                            }
                            hashMap.put("request_page", str);
                            if (abVar.f17902f == 1) {
                                hashMap.put("panel_type", "first_recharge");
                            } else if (abVar.f17902f == 2) {
                                hashMap.put("panel_type", "small_heart");
                            } else {
                                hashMap.put("panel_type", "normal");
                            }
                            hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                            if (!TextUtils.isEmpty(str2)) {
                                hashMap.put("charge_reason", str2);
                            }
                            com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_success", hashMap, com.bytedance.android.livesdk.j.c.j.class, Room.class);
                        }
                        ai.a((int) C0906R.string.dgr);
                        ab.this.a();
                        b.a(0, uptimeMillis, ab.this.a(cVar3, i3));
                        j.q().f().a("H5_payStatusChange", ab.this.b(cVar3, 1));
                        com.bytedance.android.livesdk.g.c cVar2 = new com.bytedance.android.livesdk.g.c(cVar3.f18698d);
                        cVar2.f14631a = ab.this.f17902f;
                        com.bytedance.android.livesdk.u.a.a().a((Object) cVar2);
                        break;
                    default:
                        ai.a((int) C0906R.string.dgl);
                        ab.this.a();
                        b.a(1, uptimeMillis, ab.this.a(cVar3, i3));
                        b.b(1, uptimeMillis, ab.this.a(cVar3, i3));
                        j.q().f().a("H5_payStatusChange", ab.this.b(cVar3, 2));
                        break;
                }
                b.c(0, SystemClock.uptimeMillis() - ab.this.f17900d, ab.this.a(cVar3, i3));
            }
        };
        compose.subscribe(r0, new Consumer<Throwable>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17909a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                Throwable th = (Throwable) obj;
                if (PatchProxy.isSupport(new Object[]{th}, this, f17909a, false, 14029, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f17909a, false, 14029, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                ai.a((int) C0906R.string.dgl);
                ab.this.a();
                j.q().f().a("H5_payStatusChange", ab.this.b(cVar2, 2));
                long uptimeMillis = SystemClock.uptimeMillis() - ab.this.f17899c;
                b.a(1, uptimeMillis, ab.this.a(cVar2, i2, th));
                b.b(1, uptimeMillis, ab.this.a(cVar2, i2, th));
                long uptimeMillis2 = SystemClock.uptimeMillis() - ab.this.f17900d;
                b.c(1, uptimeMillis2, ab.this.a(cVar2, i2, th));
                HashMap<String, Object> a2 = ab.this.a(cVar2, i2, th);
                if (PatchProxy.isSupport(new Object[]{1, new Long(uptimeMillis2), a2}, null, b.f17975a, true, 14237, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{1, new Long(uptimeMillis2), a2}, null, b.f17975a, true, 14237, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.live.core.d.e.a(d.b("ttlive_charge_get_order_status_api"), 1, uptimeMillis2, (Map<String, Object>) a2);
                com.bytedance.android.livesdk.j.a.a.a().a(com.bytedance.android.livesdk.j.a.b.Recharge.info, "ttlive_charge_get_order_status_api", 1, (Map) a2);
            }
        });
    }
}

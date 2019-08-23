package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/web/jsbridge/AdCardMethod;", "Lcom/bytedance/ies/web/jsbridge/IJavaMethod;", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "(Ljava/lang/ref/WeakReference;)V", "call", "", "msg", "Lcom/bytedance/ies/web/jsbridge/JsMsg;", "res", "Lorg/json/JSONObject;", "register", "dmtJsBridge", "Lcom/ss/android/sdk/webview/DMTJsBridge;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76667a;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public static CardStruct f76668c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public static CardStruct f76669d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public static Aweme f76670e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0800a f76671f = new C0800a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f76672b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/web/jsbridge/AdCardMethod$Companion;", "", "()V", "CALL_NATIVE_PHONE", "", "CARD_CLICK", "CARD_STATUS", "CLOSE_AD_MODAL", "CLOSE_CARD_DIALOG", "DOWNLOAD_CLICK", "DURATION_MEASURE", "", "GET_PAGE_DATA", "KEY_CODE", "MESSAGE_TIP", "OPEN_HALF_SCREEN_FORM", "RESULT_FAILED", "RESULT_SUCCEED", "SEND_AD_LOG", "SET_CARD", "SET_MODEL", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "cardInfo", "Lcom/ss/android/ugc/aweme/feed/model/CardStruct;", "getCardInfo", "()Lcom/ss/android/ugc/aweme/feed/model/CardStruct;", "setCardInfo", "(Lcom/ss/android/ugc/aweme/feed/model/CardStruct;)V", "couponDialogInfo", "getCouponDialogInfo", "setCouponDialogInfo", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$a  reason: collision with other inner class name */
    public static final class C0800a {
        private C0800a() {
        }

        @Nullable
        public static Aweme a() {
            return a.f76670e;
        }

        public static void b(@Nullable CardStruct cardStruct) {
            a.f76669d = cardStruct;
        }

        public /* synthetic */ C0800a(byte b2) {
            this();
        }

        public static void a(@Nullable Aweme aweme) {
            a.f76670e = aweme;
        }

        public static void a(@Nullable CardStruct cardStruct) {
            a.f76668c = cardStruct;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "sendLog"}, k = 3, mv = {1, 1, 15})
    static final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76673a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f76674b;

        b(a aVar) {
            this.f76674b = aVar;
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76673a, false, 89920, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76673a, false, 89920, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                Context context = (Context) this.f76674b.f76672b.get();
                if (context == null) {
                    context = GlobalContext.getContext();
                }
                com.ss.android.ugc.aweme.commercialize.log.g.g(context, C0800a.a());
            } else {
                Context context2 = (Context) this.f76674b.f76672b.get();
                if (context2 == null) {
                    context2 = GlobalContext.getContext();
                }
                com.ss.android.ugc.aweme.commercialize.log.g.h(context2, C0800a.a());
            }
        }
    }

    public a(@NotNull WeakReference<Context> weakReference) {
        Intrinsics.checkParameterIsNotNull(weakReference, "contextRef");
        this.f76672b = weakReference;
    }

    public final void call(@NotNull h hVar, @NotNull JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76667a, false, 89919, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76667a, false, 89919, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hVar, "msg");
        Intrinsics.checkParameterIsNotNull(jSONObject, "res");
        String str = hVar.f20622c;
        if (str != null) {
            switch (str.hashCode()) {
                case -1690732780:
                    if (str.equals("messageTip") && hVar.f20623d.has("msg")) {
                        com.bytedance.ies.dmt.ui.d.a.a((Context) this.f76672b.get(), hVar.f20623d.getString("msg")).a();
                        return;
                    }
                case -1358093233:
                    if (str.equals("getPageData")) {
                        StringBuilder sb = new StringBuilder("getPageData ");
                        CardStruct cardStruct = f76668c;
                        JSONObject jSONObject3 = null;
                        if (cardStruct != null) {
                            jSONObject2 = cardStruct.getCardData();
                        } else {
                            jSONObject2 = null;
                        }
                        sb.append(String.valueOf(jSONObject2));
                        if (!hVar.f20623d.has("type") || !TextUtils.equals(hVar.f20623d.get("type").toString(), PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION)) {
                            CardStruct cardStruct2 = f76668c;
                            if (cardStruct2 != null) {
                                jSONObject3 = cardStruct2.getCardData();
                            }
                            jSONObject.put("card_data", String.valueOf(jSONObject3));
                            return;
                        }
                        CardStruct cardStruct3 = f76669d;
                        if (cardStruct3 != null) {
                            jSONObject3 = cardStruct3.getCardData();
                        }
                        jSONObject.put("card_data", String.valueOf(jSONObject3));
                        return;
                    }
                    break;
                case -271137704:
                    if (str.equals("cardClick")) {
                        jSONObject.put("open_status", 0);
                        jSONObject.put("web_status", 0);
                        String optString = hVar.f20623d.optString(f.f34168b);
                        if (g.a((Context) this.f76672b.get(), optString, f76670e, false)) {
                            jSONObject.put("open_status", 1);
                        } else if (g.a((Context) this.f76672b.get(), optString, false)) {
                            jSONObject.put("open_status", 1);
                            com.ss.android.ugc.aweme.commercialize.log.g.f((Context) this.f76672b.get(), f76670e);
                            g.a((g.a) new b(this));
                        } else {
                            String optString2 = hVar.f20623d.optString("web_url");
                            String optString3 = hVar.f20623d.optString("web_title");
                            Aweme aweme = f76670e;
                            if (aweme == null || !aweme.isAd()) {
                                if (g.a((Context) this.f76672b.get(), optString2, optString3)) {
                                    jSONObject.put("web_status", 1);
                                    com.ss.android.ugc.aweme.commercialize.log.g.j((Context) this.f76672b.get(), f76670e);
                                }
                            } else if (g.a((Context) this.f76672b.get(), f76670e, optString2, optString3)) {
                                jSONObject.put("web_status", 1);
                            }
                        }
                        try {
                            Object obj = this.f76672b.get();
                            if (obj != null) {
                                Window window = ((Activity) obj).getWindow();
                                Intrinsics.checkExpressionValueIsNotNull(window, "(contextRef.get() as Activity).window");
                                View findFocus = window.getDecorView().findFocus();
                                Object obj2 = this.f76672b.get();
                                if (obj2 != null) {
                                    Object systemService = ((Activity) obj2).getSystemService("input_method");
                                    if (systemService != null) {
                                        Intrinsics.checkExpressionValueIsNotNull(findFocus, "focused");
                                        ((InputMethodManager) systemService).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
                                        findFocus.clearFocus();
                                        return;
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    break;
                case -160920371:
                    if (str.equals("openHalfScreenForm")) {
                        jSONObject.put("code", 0);
                        if (hVar.f20623d.has("form_url")) {
                            jSONObject.put("code", g.a((Context) this.f76672b.get(), hVar.f20623d.getString("form_url"), f76670e, 10) ? 1 : 0);
                            return;
                        }
                    }
                    break;
                case -32695719:
                    if (str.equals("callNativePhone")) {
                        jSONObject.put("code", 0);
                        if (hVar.f20623d.has("tel_num")) {
                            jSONObject.put("code", g.c((Context) this.f76672b.get(), hVar.f20623d.getString("tel_num")) ? 1 : 0);
                            return;
                        }
                    }
                    break;
                case -1491591:
                    if (str.equals("sendAdLog")) {
                        jSONObject.put("code", 0);
                        if (hVar.f20623d.has("tag") && hVar.f20623d.has("label")) {
                            try {
                                com.ss.android.ugc.aweme.commercialize.log.g.a((Context) this.f76672b.get(), hVar.f20623d.getString("tag"), hVar.f20623d.getString("label"), hVar.f20623d.optJSONObject("extParam"), f76670e);
                                jSONObject.put("code", 1);
                                if (TextUtils.equals(hVar.f20623d.getString("tag"), "draw_ad") && TextUtils.equals(hVar.f20623d.getString("label"), "click")) {
                                    com.ss.android.ugc.aweme.commercialize.log.g.b(f76670e);
                                    return;
                                }
                            } catch (Exception e2) {
                                com.ss.android.ugc.aweme.framework.a.a.a(e2);
                                return;
                            }
                        }
                    }
                    break;
                case 649898786:
                    if (str.equals("cardStatus") && hVar.f20623d.has("status")) {
                        bg.a(new AbsAdCardAction.d(hVar.f20623d.getInt("status")));
                        return;
                    }
                case 714964112:
                    if (str.equals("closeCardDialog") && hVar.f20623d.has("cardStatus")) {
                        bg.a(new AbsAdCardAction.b(hVar.f20623d.getInt("cardStatus")));
                        return;
                    }
                case 972450577:
                    if (str.equals("download_click")) {
                        jSONObject.put("code", 0);
                        if (hVar.f20623d.has("app_id")) {
                            if (g.b((Context) this.f76672b.get(), f76670e)) {
                                jSONObject.put("code", 1);
                                com.ss.android.ugc.aweme.commercialize.log.g.d((Context) this.f76672b.get(), f76670e);
                                bg.a(new AbsAdCardAction.b(-1));
                                return;
                            }
                            jSONObject.put("code", g.b((Context) this.f76672b.get(), hVar.f20623d.getString("app_id")) ? 1 : 0);
                            com.ss.android.ugc.aweme.commercialize.log.g.d((Context) this.f76672b.get(), f76670e);
                            com.ss.android.ugc.aweme.commercialize.log.g.b("click_start", (Context) this.f76672b.get(), f76670e);
                            bg.a(new AbsAdCardAction.b(-1));
                            return;
                        }
                    }
                    break;
                case 1398782827:
                    if (str.equals("setModal")) {
                        bg.a(new AbsAdCardAction.a(hVar.f20623d.optInt("height", 0), hVar.f20623d.optInt("width", 0), (int) (hVar.f20623d.optDouble("duration", 0.0d) * 1000.0d)));
                        break;
                    }
                    break;
                case 1780854578:
                    if (str.equals("closeAdModal")) {
                        bg.a(new AbsAdCardAction.b(-1));
                        return;
                    }
                    break;
                case 1984473746:
                    if (str.equals("setCard")) {
                        jSONObject.put("code", 0);
                        bg.a(new AbsAdCardAction.c(hVar.f20623d.optInt("height", 0), hVar.f20623d.optInt("width", 0)));
                        jSONObject.put("code", 1);
                        return;
                    }
                    break;
            }
        }
    }
}

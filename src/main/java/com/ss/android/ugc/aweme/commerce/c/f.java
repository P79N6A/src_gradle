package com.ss.android.ugc.aweme.commerce.c;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.commerce.c.g;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002%&B\u001f\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0010H\u0002J\u000e\u0010$\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000eR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/pay/PayTransaction;", "Lcom/bytedance/common/utility/collection/WeakHandler$IHandler;", "Lcom/ss/android/ugc/aweme/commerce/pay/WXPay$WXPayResultCallback;", "mContextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "mPaymentDepend", "Lcom/ss/android/ugc/aweme/commerce/pay/IPaymentDepend;", "(Ljava/lang/ref/WeakReference;Lcom/ss/android/ugc/aweme/commerce/pay/IPaymentDepend;)V", "mActivity", "Landroid/app/Activity;", "mHandler", "Lcom/bytedance/common/utility/collection/WeakHandler;", "mParams", "Lorg/json/JSONObject;", "mPayChannel", "", "checkParams", "", "handleAliPayResponse", "", "msg", "Landroid/os/Message;", "handleMsg", "onCreateOrderResult", "order", "Lcom/ss/android/ugc/aweme/commerce/pay/OrderInfo;", "onPayResult", "errorCode", "orderId", "", "pay", "params", "sendResult", "code", "payStatus", "transact", "AliPayResult", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements WeakHandler.IHandler, g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36777a;

    /* renamed from: c  reason: collision with root package name */
    public static final b f36778c = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public Activity f36779b;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHandler f36780d = new WeakHandler(this);

    /* renamed from: e  reason: collision with root package name */
    private int f36781e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f36782f;
    private final WeakReference<Context> g;
    private final b h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/pay/PayTransaction$AliPayResult;", "", "raw", "", "(Ljava/lang/String;)V", "<set-?>", "memo", "getMemo", "()Ljava/lang/String;", "result", "getResult", "status", "getStatus", "getValue", "content", "key", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36783a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String f36784b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String f36785c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f36786d;

        public a(@NotNull String str) {
            List list;
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, "raw");
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                List<String> split = new Regex(";").split(charSequence, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        if (listIterator.previous().length() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            list = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = CollectionsKt.emptyList();
                Collection collection = list;
                if (collection != null) {
                    Object[] array = collection.toArray(new String[0]);
                    if (array != null) {
                        for (String str2 : (String[]) array) {
                            if (StringsKt.startsWith$default(str2, "resultStatus", false, 2, null)) {
                                this.f36784b = a(str2, "resultStatus");
                            } else if (StringsKt.startsWith$default(str2, "result", false, 2, null)) {
                                this.f36785c = a(str2, "result");
                            } else if (StringsKt.startsWith$default(str2, "memo", false, 2, null)) {
                                this.f36786d = a(str2, "memo");
                            }
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
            }
        }

        private final String a(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f36783a, false, 28300, new Class[]{String.class, String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f36783a, false, 28300, new Class[]{String.class, String.class}, String.class);
            }
            String str5 = str4 + "={";
            CharSequence charSequence = str3;
            int length = str5.length() + StringsKt.indexOf$default(charSequence, str5, 0, false, 6, (Object) null);
            int lastIndexOf$default = StringsKt.lastIndexOf$default(charSequence, "}", 0, false, 6, (Object) null);
            if (str3 != null) {
                String substring = str3.substring(length, lastIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/pay/PayTransaction$Companion;", "", "()V", "FIELD_ORDER_INFO", "", "FIELD_SIGN", "FIELD_SIGN_TYPE", "FIELD_URL", "MSG_ALI_PAY_RESPONSE", "", "PAY_WAY_ALI", "PAY_WAY_WX", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/util/Pair;", "Lcom/ss/android/ugc/aweme/commerce/pay/OrderInfo;", "kotlin.jvm.PlatformType", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class c<V> implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36787a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f36788b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f36789c;

        c(f fVar, d dVar) {
            this.f36788b = fVar;
            this.f36789c = dVar;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f36787a, false, 28301, new Class[0], Pair.class)) {
                return (Pair) PatchProxy.accessDispatch(new Object[0], this, f36787a, false, 28301, new Class[0], Pair.class);
            }
            return new Pair(this.f36789c, new com.alipay.sdk.app.b(this.f36788b.f36779b).a(this.f36789c.f36770b, true));
        }
    }

    public final void handleMsg(@NotNull Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f36777a, false, 28295, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f36777a, false, 28295, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(message, "msg");
        if (message.what == 1) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f36777a, false, 28298, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f36777a, false, 28298, new Class[]{Message.class}, Void.TYPE);
            } else if (message.obj instanceof Exception) {
                a(1, -1);
            } else {
                Object obj = message.obj;
                if (obj != null) {
                    Object obj2 = ((Pair) obj).second;
                    if (obj2 != null) {
                        try {
                            Integer valueOf = Integer.valueOf(new a((String) obj2).f36784b);
                            Intrinsics.checkExpressionValueIsNotNull(valueOf, "Integer.valueOf(status)");
                            a(1, valueOf.intValue());
                        } catch (Exception unused) {
                            return;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.util.Pair<*, *>");
                }
            }
            return;
        }
        throw new IllegalArgumentException("Unknown message " + message.what);
    }

    public final void a(@NotNull JSONObject jSONObject) throws Exception {
        boolean z;
        Pair pair;
        Context context;
        Context context2;
        IWXAPI iwxapi;
        JSONObject jSONObject2 = jSONObject;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f36777a, false, 28293, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f36777a, false, 28293, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(jSONObject2, "params");
        this.f36782f = jSONObject2;
        if (this.f36782f != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            JSONObject jSONObject3 = this.f36782f;
            if (PatchProxy.isSupport(new Object[]{jSONObject3}, this, f36777a, false, 28296, new Class[]{JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jSONObject3}, this, f36777a, false, 28296, new Class[]{JSONObject.class}, Void.TYPE);
            } else if (jSONObject3 == null) {
                a(0, -1);
            } else {
                try {
                    b bVar = this.h;
                    IWXAPI iwxapi2 = null;
                    if (bVar != null) {
                        pair = bVar.a(jSONObject3);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        Object obj = pair.first;
                        Intrinsics.checkExpressionValueIsNotNull(obj, "pair.first");
                        this.f36781e = ((Number) obj).intValue();
                        d dVar = (d) pair.second;
                        Intrinsics.checkExpressionValueIsNotNull(dVar, "order");
                        if (PatchProxy.isSupport(new Object[]{dVar}, this, f36777a, false, 28297, new Class[]{d.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dVar}, this, f36777a, false, 28297, new Class[]{d.class}, Void.TYPE);
                        } else {
                            WeakReference<Context> weakReference = this.g;
                            if (weakReference != null) {
                                context = (Context) weakReference.get();
                            } else {
                                context = null;
                            }
                            if (context == null) {
                                a(1, -1);
                            } else if (dVar.f36769a == 0) {
                                Context context3 = (Context) this.g.get();
                                if (!(context3 instanceof Activity)) {
                                    context3 = com.ss.android.ugc.aweme.commerce.live.a.f36962b.a(context3);
                                }
                                if (!(context3 instanceof Activity)) {
                                    a(1, -1);
                                } else {
                                    this.f36779b = (Activity) context3;
                                    m.a().a(this.f36780d, new c(this, dVar), 1);
                                }
                            } else if (dVar.f36769a == 1) {
                                h a2 = h.f36795d.a();
                                Context context4 = (Context) this.g.get();
                                if (context4 != null) {
                                    context2 = context4.getApplicationContext();
                                } else {
                                    context2 = null;
                                }
                                if (PatchProxy.isSupport(new Object[]{context2}, a2, h.f36793a, false, 28304, new Class[]{Context.class}, IWXAPI.class)) {
                                    iwxapi = (IWXAPI) PatchProxy.accessDispatch(new Object[]{context2}, a2, h.f36793a, false, 28304, new Class[]{Context.class}, IWXAPI.class);
                                } else {
                                    if (!StringUtils.isEmpty(a2.f36796b)) {
                                        iwxapi2 = WXAPIFactory.createWXAPI(context2, a2.f36796b, true);
                                    }
                                    iwxapi = iwxapi2;
                                }
                                if (iwxapi != null) {
                                    iwxapi.registerApp(h.f36795d.a().f36796b);
                                }
                                g.f36791b = this;
                                g gVar = g.f36792c;
                                if (PatchProxy.isSupport(new Object[]{dVar, iwxapi}, gVar, g.f36790a, false, 28303, new Class[]{d.class, IWXAPI.class}, Boolean.TYPE)) {
                                    ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar, iwxapi}, gVar, g.f36790a, false, 28303, new Class[]{d.class, IWXAPI.class}, Boolean.TYPE)).booleanValue();
                                } else if (dVar != null) {
                                    if (iwxapi != null) {
                                        if (PatchProxy.isSupport(new Object[]{iwxapi}, gVar, g.f36790a, false, 28302, new Class[]{IWXAPI.class}, Boolean.TYPE)) {
                                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{iwxapi}, gVar, g.f36790a, false, 28302, new Class[]{IWXAPI.class}, Boolean.TYPE)).booleanValue();
                                        } else if (iwxapi.getWXAppSupportAPI() < 570425345) {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            PayReq payReq = new PayReq();
                                            payReq.appId = dVar.f36771c;
                                            payReq.partnerId = dVar.f36772d;
                                            payReq.prepayId = dVar.f36773e;
                                            payReq.packageValue = "Sign=WXPay";
                                            payReq.nonceStr = dVar.f36774f;
                                            payReq.timeStamp = dVar.g;
                                            payReq.sign = dVar.h;
                                            iwxapi.sendReq(payReq);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (NullPointerException unused) {
                    a(0, -1);
                }
            }
        }
    }

    public f(@Nullable WeakReference<Context> weakReference, @Nullable b bVar) {
        this.g = weakReference;
        this.h = bVar;
    }

    private final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f36777a, false, 28299, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f36777a, false, 28299, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.h;
        if (bVar != null) {
            bVar.a(i, this.f36781e, i2);
        }
    }
}

package com.ss.android.ugc.aweme.commerce.promotion;

import a.g;
import a.i;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.utils.cb;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0013H\u0016JL\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u000e0\u0013H\u0016J>\u0010\u0019\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0016J\u0014\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R:\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0006j\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b`\nX\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004`\nX\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/promotion/PromotionManageCenter;", "Lcom/ss/android/ugc/aweme/commerce/promotion/IPromotionManage;", "()V", "EXPIRE_DURATION", "", "awemePromotionMap", "Ljava/util/HashMap;", "", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "Lkotlin/collections/HashMap;", "expireMap", "promotionMap", "getDetailPromotion", "", "promotionId", "productId", "authorId", "pcb", "Lkotlin/Function1;", "fcb", "Lorg/json/JSONObject;", "getDetailPromotions", "awemeId", "pscb", "getSku", "skcb", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuInfo;", "Lkotlin/Function0;", "putSecUid", "promotions", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37667a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f37668b = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<String, List<h>> f37669c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, h> f37670d = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, Long> f37671e = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"onFail", "", "errorCode", "", "errorDesc", "", "invoke", "(Ljava/lang/Integer;Ljava/lang/String;)V"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.promotion.a$a  reason: collision with other inner class name */
    static final class C0485a extends Lambda implements Function2<Integer, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $authorId;
        final /* synthetic */ Function1 $fcb;
        final /* synthetic */ String $productId;
        final /* synthetic */ String $promotionId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0485a(String str, String str2, String str3, Function1 function1) {
            super(2);
            this.$promotionId = str;
            this.$productId = str2;
            this.$authorId = str3;
            this.$fcb = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Integer) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Integer num, @NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{num, str}, this, changeQuickRedirect, false, 29236, new Class[]{Integer.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num, str}, this, changeQuickRedirect, false, 29236, new Class[]{Integer.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "errorDesc");
            JSONObject jSONObject = new JSONObject();
            String str2 = this.$promotionId;
            if (str2 == null) {
                str2 = "null";
            }
            jSONObject.put("promotionId", str2);
            String str3 = this.$productId;
            if (str3 == null) {
                str3 = "null";
            }
            jSONObject.put("productId", str3);
            String str4 = this.$authorId;
            if (str4 == null) {
                str4 = "null";
            }
            jSONObject.put("authorId", str4);
            jSONObject.put("errorDesc", str);
            if (num != null) {
                num.intValue();
                jSONObject.put("errorCode", num.intValue());
            }
            this.$fcb.invoke(jSONObject);
            com.ss.android.ugc.aweme.commerce.service.l.c.f37989a.a(false, jSONObject);
        }

        public static /* synthetic */ void invoke$default(C0485a aVar, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            aVar.invoke(num, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"onSuccess", "", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<h, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $pcb;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Function1 function1) {
            super(1);
            this.$pcb = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull h hVar) {
            h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, changeQuickRedirect, false, 29237, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, changeQuickRedirect, false, 29237, new Class[]{h.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hVar2, "promotion");
            this.$pcb.invoke(hVar2);
            com.ss.android.ugc.aweme.commerce.service.l.c.f37989a.a(true, new JSONObject());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/promotion/api/vo/PromotionsResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class c<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.promotion.api.a.a, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0485a f37673b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37674c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f37675d;

        c(C0485a aVar, String str, b bVar) {
            this.f37673b = aVar;
            this.f37674c = str;
            this.f37675d = bVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37672a, false, 29238, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37672a, false, 29238, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (iVar.d() || iVar.e() == null || ((com.ss.android.ugc.aweme.commerce.promotion.api.a.a) iVar.e()).statusCode != 0) {
                if (iVar.d() || iVar.e() == null) {
                    C0485a.invoke$default(this.f37673b, null, "task fail", 1, null);
                } else {
                    this.f37673b.invoke(Integer.valueOf(((com.ss.android.ugc.aweme.commerce.promotion.api.a.a) iVar.e()).statusCode), "result error");
                }
                return null;
            }
            List b2 = cb.b(((com.ss.android.ugc.aweme.commerce.promotion.api.a.a) iVar.e()).f37687a, h[].class);
            if (b2 == null || b2.size() != 1) {
                C0485a.invoke$default(this.f37673b, null, "result size error", 1, null);
                return null;
            }
            String str = this.f37674c;
            Object obj = b2.get(0);
            Intrinsics.checkExpressionValueIsNotNull(obj, "promotionArr[0]");
            a.f37670d.put(str, obj);
            a.f37671e.put(this.f37674c, Long.valueOf(SystemClock.elapsedRealtime()));
            a.f37668b.a(b2);
            b bVar = this.f37675d;
            Object obj2 = b2.get(0);
            Intrinsics.checkExpressionValueIsNotNull(obj2, "promotionArr[0]");
            bVar.invoke((h) obj2);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"onFail", "", "errorCode", "", "errorDesc", "", "invoke", "(Ljava/lang/Integer;Ljava/lang/String;)V"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<Integer, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $authorId;
        final /* synthetic */ String $awemeId;
        final /* synthetic */ Function1 $fcb;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, String str2, Function1 function1) {
            super(2);
            this.$awemeId = str;
            this.$authorId = str2;
            this.$fcb = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Integer) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Integer num, @NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{num, str}, this, changeQuickRedirect, false, 29239, new Class[]{Integer.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num, str}, this, changeQuickRedirect, false, 29239, new Class[]{Integer.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "errorDesc");
            JSONObject jSONObject = new JSONObject();
            String str2 = this.$awemeId;
            if (str2 == null) {
                str2 = "null";
            }
            jSONObject.put("awemeId", str2);
            String str3 = this.$authorId;
            if (str3 == null) {
                str3 = "null";
            }
            jSONObject.put("authorId", str3);
            jSONObject.put("errorDesc", str);
            if (num != null) {
                num.intValue();
                jSONObject.put("errorCode", num.intValue());
            }
            this.$fcb.invoke(jSONObject);
            com.ss.android.ugc.aweme.commerce.service.l.c.f37989a.a(false, jSONObject);
        }

        public static /* synthetic */ void invoke$default(d dVar, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            dVar.invoke(num, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"onSuccess", "", "promotions", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<List<? extends h>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $pscb;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Function1 function1) {
            super(1);
            this.$pscb = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<h> list) {
            List<h> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 29240, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 29240, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list2, "promotions");
            this.$pscb.invoke(list2);
            com.ss.android.ugc.aweme.commerce.service.l.c.f37989a.a(true, new JSONObject());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/promotion/api/vo/PromotionsResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class f<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.promotion.api.a.a, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37676a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f37677b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37678c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37679d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f37680e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f37681f;

        f(d dVar, String str, String str2, String str3, e eVar) {
            this.f37677b = dVar;
            this.f37678c = str;
            this.f37679d = str2;
            this.f37680e = str3;
            this.f37681f = eVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37676a, false, 29241, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37676a, false, 29241, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (iVar.d() || iVar.e() == null || ((com.ss.android.ugc.aweme.commerce.promotion.api.a.a) iVar.e()).statusCode != 0) {
                if (iVar.d() || iVar.e() == null) {
                    d.invoke$default(this.f37677b, null, "task fail", 1, null);
                } else {
                    this.f37677b.invoke(Integer.valueOf(((com.ss.android.ugc.aweme.commerce.promotion.api.a.a) iVar.e()).statusCode), "result error");
                }
                return null;
            }
            List<h> b2 = cb.b(((com.ss.android.ugc.aweme.commerce.promotion.api.a.a) iVar.e()).f37687a, h[].class);
            if (b2 == null || b2.isEmpty()) {
                d.invoke$default(this.f37677b, null, "empty result", 1, null);
                return null;
            }
            a.f37669c.put(this.f37678c + '-' + this.f37679d, b2);
            a.f37671e.put(this.f37680e, Long.valueOf(SystemClock.elapsedRealtime()));
            for (h hVar : b2) {
                String str = hVar.getPromotionId() + '-' + hVar.getProductId() + '-' + this.f37679d;
                Intrinsics.checkExpressionValueIsNotNull(hVar, "promotion");
                a.f37670d.put(str, hVar);
                a.f37671e.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                if (hVar.isSecKillGood() && a.f37669c.get(this.f37680e) != null) {
                    a.f37669c.put(this.f37680e, null);
                }
            }
            a.f37668b.a(b2);
            this.f37681f.invoke(b2);
            return null;
        }
    }

    private a() {
    }

    public final void a(@NotNull List<h> list) {
        List<h> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f37667a, false, 29233, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f37667a, false, 29233, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "promotions");
        if (!list.isEmpty()) {
            for (h next : list) {
                if (!TextUtils.isEmpty(next.getSecOriginUserId())) {
                    dr.a().a(next.getOriginUserId(), next.getSecOriginUserId());
                }
            }
        }
    }

    public final void a(@Nullable String str, @Nullable String str2, @NotNull Function1<? super List<h>, Unit> function1, @NotNull Function1<? super JSONObject, Unit> function12) {
        String str3 = str;
        String str4 = str2;
        Function1<? super List<h>, Unit> function13 = function1;
        Function1<? super JSONObject, Unit> function14 = function12;
        if (PatchProxy.isSupport(new Object[]{str3, str4, function13, function14}, this, f37667a, false, 29234, new Class[]{String.class, String.class, Function1.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, function13, function14}, this, f37667a, false, 29234, new Class[]{String.class, String.class, Function1.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function13, "pscb");
        Intrinsics.checkParameterIsNotNull(function14, "fcb");
        d dVar = new d(str3, str4, function14);
        e eVar = new e(function13);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            d.invoke$default(dVar, null, "param error", 1, null);
            return;
        }
        String str5 = str3 + '-' + str4;
        List list = f37669c.get(str5);
        if (list != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Long l = f37671e.get(str5);
            if (l == null) {
                l = Long.valueOf(SystemClock.elapsedRealtime());
            }
            if (elapsedRealtime - l.longValue() < 120000) {
                eVar.invoke(list);
                return;
            }
        }
        com.ss.android.ugc.aweme.commerce.promotion.api.a aVar = com.ss.android.ugc.aweme.commerce.promotion.api.a.f37685b;
        if (str4 == null) {
            Intrinsics.throwNpe();
        }
        i a2 = aVar.a(str3, str4);
        f fVar = new f(dVar, str, str2, str5, eVar);
        a2.a((g<TResult, TContinuationResult>) fVar, i.f1052b);
    }

    public final void a(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Function1<? super h, Unit> function1, @NotNull Function1<? super JSONObject, Unit> function12) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Function1<? super h, Unit> function13 = function1;
        Function1<? super JSONObject, Unit> function14 = function12;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, function13, function14}, this, f37667a, false, 29232, new Class[]{String.class, String.class, String.class, Function1.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6, function13, function14}, this, f37667a, false, 29232, new Class[]{String.class, String.class, String.class, Function1.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function13, "pcb");
        Intrinsics.checkParameterIsNotNull(function14, "fcb");
        C0485a aVar = new C0485a(str4, str5, str6, function14);
        b bVar = new b(function13);
        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str6)) {
            C0485a.invoke$default(aVar, null, "param error", 1, null);
            return;
        }
        String str7 = str4 + '-' + str5 + '-' + str6;
        h hVar = f37670d.get(str7);
        if (hVar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Long l = f37671e.get(str7);
            if (l == null) {
                l = Long.valueOf(SystemClock.elapsedRealtime());
            }
            if (elapsedRealtime - l.longValue() < 120000) {
                bVar.invoke(hVar);
                return;
            }
        }
        com.ss.android.ugc.aweme.commerce.promotion.api.a aVar2 = com.ss.android.ugc.aweme.commerce.promotion.api.a.f37685b;
        if (str4 == null) {
            Intrinsics.throwNpe();
        }
        if (str5 == null) {
            Intrinsics.throwNpe();
        }
        if (str6 == null) {
            Intrinsics.throwNpe();
        }
        aVar2.a(str4, str5, str6).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(aVar, str7, bVar), i.f1052b);
    }
}

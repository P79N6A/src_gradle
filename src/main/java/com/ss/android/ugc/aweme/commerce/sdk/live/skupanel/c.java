package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel;

import a.g;
import a.i;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.l.h;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.models.p;
import com.ss.android.ugc.aweme.commerce.service.models.y;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u000223B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0016J\u0006\u0010\"\u001a\u00020\u0015J&\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0 J\u000e\u0010(\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0007J\b\u0010)\u001a\u00020\u0015H\u0002J4\u0010*\u001a\u00020+2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010,\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u000100J\u000e\u00101\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelManager;", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/ILiveRoomDataInfo;", "()V", "cartCount", "", "cartCountListener", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelManager$ICartCountListener;", "initCartCount", "mAnchorUid", "", "mAnchorUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "mGroupId", "secKillClock", "Lcom/ss/android/ugc/aweme/commerce/service/utils/SecKillClock;", "skuPanelDialogFragment", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelDialogFragment;", "uiSkuBean", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/model/UILiveSkuInfo;", "checkVirtualGood", "", "promotionId", "productId", "callBack", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelManager$ISkuUpdateCallback;", "fetchCartCountNum", "getCartCountListener", "getGroupId", "getRoomOwnerId", "getSecKillClock", "getUISkuInfoList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "onCommerceCardRelease", "onReceiveFeedPromotionSuccess", "ownerUser", "awemeId", "promoList", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "registerCartCountListener", "resetCacheData", "showSkuDialogWithPromotionId", "Landroid/support/v4/app/DialogFragment;", "enterFrom", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "dialogDismissListener", "Lkotlin/Function0;", "updateCartCountNum", "ICartCountListener", "ISkuUpdateCallback", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37859a;

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<LiveSkuPanelDialogFragment> f37860b;

    /* renamed from: c  reason: collision with root package name */
    public static User f37861c;

    /* renamed from: d  reason: collision with root package name */
    public static String f37862d;

    /* renamed from: e  reason: collision with root package name */
    public static String f37863e;

    /* renamed from: f  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.commerce.sdk.live.a.a f37864f;
    public static int g;
    public static int h;
    public static WeakReference<a> i;
    public static h j;
    public static final c k = new c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelManager$ICartCountListener;", "", "onReceiveCartCount", "", "cartCount", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J!\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelManager$ISkuUpdateCallback;", "", "onFailure", "", "onSuccess", "isVirtual", "", "isOverLimit", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();

        void a(@Nullable Boolean bool, @Nullable Boolean bool2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionDynamicInfoResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c$c  reason: collision with other inner class name */
    static final class C0492c<TTaskResult, TContinuationResult> implements g<p, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37868d;

        C0492c(b bVar, String str, String str2) {
            this.f37866b = bVar;
            this.f37867c = str;
            this.f37868d = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r22) {
            /*
                r21 = this;
                r7 = r21
                r8 = r22
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37865a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r3 = 0
                r4 = 29296(0x7270, float:4.1052E-41)
                r1 = r21
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37865a
                r3 = 0
                r4 = 29296(0x7270, float:4.1052E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r1 = r21
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Void r0 = (java.lang.Void) r0
                return r0
            L_0x0039:
                java.lang.String r0 = "task"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                boolean r0 = r22.d()
                r1 = 0
                if (r0 != 0) goto L_0x009b
                java.lang.Object r0 = r22.e()
                if (r0 == 0) goto L_0x009b
                java.lang.Object r0 = r22.e()
                com.ss.android.ugc.aweme.commerce.service.models.p r0 = (com.ss.android.ugc.aweme.commerce.service.models.p) r0
                int r0 = r0.statusCode
                if (r0 != 0) goto L_0x009b
                java.lang.Object r0 = r22.e()
                com.ss.android.ugc.aweme.commerce.service.models.p r0 = (com.ss.android.ugc.aweme.commerce.service.models.p) r0
                com.ss.android.ugc.aweme.commerce.service.models.ag r0 = r0.f38227b
                if (r0 == 0) goto L_0x006e
                com.ss.android.ugc.aweme.commerce.service.models.am r0 = r0.getVirtualPromotion()
                if (r0 == 0) goto L_0x006e
                boolean r0 = r0.isVirtualGoods()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                goto L_0x006f
            L_0x006e:
                r0 = r1
            L_0x006f:
                java.lang.Object r2 = r22.e()
                com.ss.android.ugc.aweme.commerce.service.models.p r2 = (com.ss.android.ugc.aweme.commerce.service.models.p) r2
                com.ss.android.ugc.aweme.commerce.service.models.ag r2 = r2.f38227b
                if (r2 == 0) goto L_0x0088
                com.ss.android.ugc.aweme.commerce.service.models.am r2 = r2.getVirtualPromotion()
                if (r2 == 0) goto L_0x0088
                boolean r2 = r2.getAlreadyBuy()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x0089
            L_0x0088:
                r2 = r1
            L_0x0089:
                com.ss.android.ugc.aweme.commerce.service.l.c$a r8 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 30
                com.ss.android.ugc.aweme.commerce.service.l.c.a.a(r8, r9, r10, r11, r12, r13, r14)
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c$b r3 = r7.f37866b
                r3.a(r0, r2)
                goto L_0x00db
            L_0x009b:
                boolean r0 = r22.d()
                if (r0 != 0) goto L_0x00c2
                java.lang.Object r0 = r22.e()
                if (r0 != 0) goto L_0x00a8
                goto L_0x00c2
            L_0x00a8:
                com.ss.android.ugc.aweme.commerce.service.l.c$a r0 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
                r9 = 0
                java.lang.Object r2 = r22.e()
                com.ss.android.ugc.aweme.commerce.service.models.p r2 = (com.ss.android.ugc.aweme.commerce.service.models.p) r2
                int r2 = r2.statusCode
                java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
                java.lang.String r11 = "result error"
                java.lang.String r13 = r7.f37867c
                java.lang.String r12 = r7.f37868d
                r8 = r0
                r8.a(r9, r10, r11, r12, r13)
                goto L_0x00d6
            L_0x00c2:
                com.ss.android.ugc.aweme.commerce.service.l.c$a r14 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
                r15 = 0
                r16 = 0
                java.lang.String r17 = "task fail"
                java.lang.String r0 = r7.f37867c
                java.lang.String r2 = r7.f37868d
                r20 = 2
                r18 = r2
                r19 = r0
                com.ss.android.ugc.aweme.commerce.service.l.c.a.a(r14, r15, r16, r17, r18, r19, r20)
            L_0x00d6:
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c$b r0 = r7.f37866b
                r0.a()
            L_0x00db:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.C0492c.then(a.i):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/sdk/goods/api/CartCountResponseCopy;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class d<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.sdk.goods.api.a, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37869a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f37870b = new d();

        d() {
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f37869a, false, 29297, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f37869a, false, 29297, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            if (!iVar.d() && iVar.e() != null && ((com.ss.android.ugc.aweme.commerce.sdk.goods.api.a) iVar.e()).statusCode == 0) {
                c cVar = c.k;
                if (c.g == 0) {
                    c cVar2 = c.k;
                    c.g = ((com.ss.android.ugc.aweme.commerce.sdk.goods.api.a) iVar.e()).f37735a;
                }
                c cVar3 = c.k;
                c.h = ((com.ss.android.ugc.aweme.commerce.sdk.goods.api.a) iVar.e()).f37735a;
                a e2 = c.k.e();
                if (e2 != null) {
                    c cVar4 = c.k;
                    e2.a(c.h);
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/SkuCheckResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    public static final class e<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.service.g.a.c, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37872b;

        public e(int i) {
            this.f37872b = i;
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f37871a, false, 29298, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f37871a, false, 29298, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            if (!iVar.d() && iVar.e() != null && ((com.ss.android.ugc.aweme.commerce.service.g.a.c) iVar.e()).statusCode == 0) {
                y yVar = (y) new Gson().fromJson(((com.ss.android.ugc.aweme.commerce.service.g.a.c) iVar.e()).f37968a, y.class);
                c cVar = c.k;
                com.ss.android.ugc.aweme.commerce.sdk.live.a.a aVar = c.f37864f;
                if (aVar != null) {
                    List<ak> list = aVar.f37739a;
                    if (list != null) {
                        ak akVar = list.get(this.f37872b);
                        if (akVar != null) {
                            akVar.f38188b = yVar.getPictureMap();
                            akVar.f38189c = yVar.getSkuList();
                            akVar.f38187a = yVar.getSpecificInfoList();
                        }
                        return null;
                    }
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class f extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function0 $dialogDismissListener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Function0 function0) {
            super(0);
            this.$dialogDismissListener = function0;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29299, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29299, new Class[0], Void.TYPE);
                return;
            }
            Function0 function0 = this.$dialogDismissListener;
            if (function0 != null) {
                function0.invoke();
            }
            c cVar = c.k;
            h hVar = c.j;
            if (hVar != null) {
                hVar.a();
            }
            c cVar2 = c.k;
            c.j = null;
        }
    }

    private c() {
    }

    @Nullable
    public static h d() {
        return j;
    }

    @Nullable
    public final String a() {
        return f37862d;
    }

    @Nullable
    public final String c() {
        return f37863e;
    }

    @Nullable
    public final List<ak> b() {
        com.ss.android.ugc.aweme.commerce.sdk.live.a.a aVar = f37864f;
        if (aVar != null) {
            return aVar.f37739a;
        }
        return null;
    }

    public final a e() {
        if (PatchProxy.isSupport(new Object[0], this, f37859a, false, 29287, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f37859a, false, 29287, new Class[0], a.class);
        }
        WeakReference<a> weakReference = i;
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void a(@NotNull String str, @NotNull String str2, @NotNull b bVar) {
        String str3 = str;
        String str4 = str2;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, bVar2}, this, f37859a, false, 29295, new Class[]{String.class, String.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, bVar2}, this, f37859a, false, 29295, new Class[]{String.class, String.class, b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "promotionId");
        Intrinsics.checkParameterIsNotNull(str4, "productId");
        Intrinsics.checkParameterIsNotNull(bVar2, "callBack");
        com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.b(str3, str4, 1).a((g<TResult, TContinuationResult>) new C0492c<TResult,TContinuationResult>(bVar2, str4, str3), i.f1052b);
    }
}

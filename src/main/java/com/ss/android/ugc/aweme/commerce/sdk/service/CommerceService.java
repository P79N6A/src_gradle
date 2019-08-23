package com.ss.android.ugc.aweme.commerce.sdk.service;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.alimama.tunion.sdk.TUnionSDK;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.d;
import com.ss.android.ugc.aweme.commerce.sdk.c.b;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.LiveSkuPanelDialogFragment;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commerce.service.l.h;
import com.ss.android.ugc.aweme.commerce.service.l.j;
import com.ss.android.ugc.aweme.commerce.service.logs.aj;
import com.ss.android.ugc.aweme.commerce.service.logs.p;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.models.m;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commerce.service.models.o;
import com.ss.android.ugc.aweme.commerce.service.models.r;
import com.ss.android.ugc.aweme.commerce.service.models.s;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 R2\u00020\u0001:\u0001RB\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J*\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016JS\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\b2\b\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0004H\u0016J(\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\b2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0016J:\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u00010\b2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000407H\u0016J:\u00108\u001a\u00020\u00042\u0006\u00103\u001a\u0002042\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bH\u0016Jd\u0010=\u001a\u00020\u00042\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\b2\b\u0010>\u001a\u0004\u0018\u00010/2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010?\u001a\u00020&2\b\u0010@\u001a\u0004\u0018\u00010\bH\u0017J\u0010\u0010A\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020DH\u0017J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020DH\u0002J6\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010I\u001a\u0004\u0018\u00010J2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0016J \u0010L\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J2\u0010M\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010N\u001a\u00020O2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016¨\u0006S"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/service/CommerceService;", "Lcom/ss/android/ugc/aweme/commerce/service/ICommerceService;", "()V", "checkLoginAndLawHint", "", "context", "Landroid/content/Context;", "enterFrom", "", "enterMethod", "promotionSource", "", "callback", "Lkotlin/Function0;", "fetchCommerceRights", "generateRegisterRouter", "Lcom/ss/android/ugc/aweme/router/IRouter;", "goBindTaobao", "schema", "gotoGoodShop", "goodsShopIntentData", "Lcom/ss/android/ugc/aweme/commerce/service/models/PortfolioParams;", "enterMethodForAuth", "entranceLocation", "initCommerce", "configs", "Lcom/ss/android/ugc/aweme/commerce/service/configs/CommerceConfigs;", "environment", "Lcom/ss/android/ugc/aweme/commerce/service/env/ICommerceProxy;", "launchPayTest", "logClickCart", "aid", "uid", "commodityId", "commodityType", "carrierType", "destination", "isSelf", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "onCommerceCardRelease", "onReceiveFeedPromotionSuccess", "ownerUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "awemeId", "promotionList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "openApp", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "fromAct", "Landroid/app/Activity;", "url", "jumpAppSuccess", "Lkotlin/Function1;", "openPortfolioAccordingToAB", "userInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "triggerAwemeId", "referFrom", "openTaobao", "good", "withLog", "sourcePage", "shouldNeedGuideFootprint", "showFullPreview", "previewParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "showPreview", "showSkuPanelGoodsDialogFromFeedCard", "Landroid/support/v4/app/DialogFragment;", "promotionId", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "dialogDismissListener", "startAppByUrl", "tryCheckRealName", "verifyStatus", "", "vcb", "Lcom/ss/android/ugc/aweme/commerce/service/callbacks/AuthCB;", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class CommerceService implements ICommerceService {
    public static final a Companion = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/service/CommerceService$Companion;", "", "()V", "VIDEO_TYPE_PROFILE", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ n $previewParams;
        final /* synthetic */ CommerceService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CommerceService commerceService, n nVar) {
            super(0);
            this.this$0 = commerceService;
            this.$previewParams = nVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
            if (r0 != false) goto L_0x010c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke() {
            /*
                r16 = this;
                r7 = r16
                r8 = 0
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 29553(0x7371, float:4.1413E-41)
                r1 = r16
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0027
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                r3 = 0
                r4 = 29553(0x7371, float:4.1413E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r16
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0027:
                com.ss.android.ugc.aweme.commerce.service.models.n r0 = r7.$previewParams
                java.lang.Object[] r9 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.service.models.n.f38219a
                r12 = 0
                r13 = 29847(0x7497, float:4.1825E-41)
                java.lang.Class[] r14 = new java.lang.Class[r8]
                java.lang.Class r15 = java.lang.Boolean.TYPE
                r10 = r0
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0054
                java.lang.Object[] r9 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.service.models.n.f38219a
                r12 = 0
                r13 = 29847(0x7497, float:4.1825E-41)
                java.lang.Class[] r14 = new java.lang.Class[r8]
                java.lang.Class r15 = java.lang.Boolean.TYPE
                r10 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                goto L_0x0077
            L_0x0054:
                com.ss.android.ugc.aweme.commerce.service.models.n$a r1 = com.ss.android.ugc.aweme.commerce.service.models.n.r
                com.ss.android.ugc.aweme.commerce.service.models.b r4 = r0.f38222d
                if (r4 == 0) goto L_0x005d
                java.lang.String r4 = r4.f38197e
                goto L_0x005e
            L_0x005d:
                r4 = r3
            L_0x005e:
                boolean r1 = r1.a(r4)
                if (r1 != 0) goto L_0x0076
                com.ss.android.ugc.aweme.commerce.service.models.n$a r1 = com.ss.android.ugc.aweme.commerce.service.models.n.r
                com.ss.android.ugc.aweme.commerce.service.models.b r0 = r0.f38222d
                if (r0 == 0) goto L_0x006d
                java.lang.String r0 = r0.f38196d
                goto L_0x006e
            L_0x006d:
                r0 = r3
            L_0x006e:
                boolean r0 = r1.a(r0)
                if (r0 != 0) goto L_0x0076
                r0 = 1
                goto L_0x0077
            L_0x0076:
                r0 = 0
            L_0x0077:
                if (r0 == 0) goto L_0x0081
                com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.n r1 = r7.$previewParams
                r0.showPreview(r1)
                return
            L_0x0081:
                com.ss.android.ugc.aweme.commerce.service.models.n r0 = r7.$previewParams
                java.lang.Object[] r9 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.service.models.n.f38219a
                r12 = 0
                r13 = 29848(0x7498, float:4.1826E-41)
                java.lang.Class[] r14 = new java.lang.Class[r8]
                java.lang.Class r15 = java.lang.Boolean.TYPE
                r10 = r0
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                if (r1 == 0) goto L_0x00ac
                java.lang.Object[] r9 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.service.models.n.f38219a
                r12 = 0
                r13 = 29848(0x7498, float:4.1826E-41)
                java.lang.Class[] r14 = new java.lang.Class[r8]
                java.lang.Class r15 = java.lang.Boolean.TYPE
                r10 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                goto L_0x00ba
            L_0x00ac:
                com.ss.android.ugc.aweme.commerce.service.models.n$a r1 = com.ss.android.ugc.aweme.commerce.service.models.n.r
                com.ss.android.ugc.aweme.commerce.service.models.b r0 = r0.f38222d
                if (r0 == 0) goto L_0x00b5
                java.lang.String r0 = r0.f38196d
                goto L_0x00b6
            L_0x00b5:
                r0 = r3
            L_0x00b6:
                boolean r0 = r1.a(r0)
            L_0x00ba:
                if (r0 != 0) goto L_0x010c
                com.ss.android.ugc.aweme.commerce.service.models.n r0 = r7.$previewParams
                java.lang.Object[] r9 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.service.models.n.f38219a
                r12 = 0
                r13 = 29849(0x7499, float:4.1827E-41)
                java.lang.Class[] r14 = new java.lang.Class[r8]
                java.lang.Class r15 = java.lang.Boolean.TYPE
                r10 = r0
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                if (r1 == 0) goto L_0x00e7
                java.lang.Object[] r9 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.service.models.n.f38219a
                r12 = 0
                r13 = 29849(0x7499, float:4.1827E-41)
                java.lang.Class[] r14 = new java.lang.Class[r8]
                java.lang.Class r15 = java.lang.Boolean.TYPE
                r10 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                goto L_0x010a
            L_0x00e7:
                com.ss.android.ugc.aweme.commerce.service.models.n$a r1 = com.ss.android.ugc.aweme.commerce.service.models.n.r
                com.ss.android.ugc.aweme.commerce.service.models.b r4 = r0.f38222d
                if (r4 == 0) goto L_0x00f0
                java.lang.String r4 = r4.f38197e
                goto L_0x00f1
            L_0x00f0:
                r4 = r3
            L_0x00f1:
                boolean r1 = r1.a(r4)
                if (r1 == 0) goto L_0x0109
                com.ss.android.ugc.aweme.commerce.service.models.n$a r1 = com.ss.android.ugc.aweme.commerce.service.models.n.r
                com.ss.android.ugc.aweme.commerce.service.models.b r0 = r0.f38222d
                if (r0 == 0) goto L_0x0100
                java.lang.String r0 = r0.f38196d
                goto L_0x0101
            L_0x0100:
                r0 = r3
            L_0x0101:
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x0109
                r0 = 1
                goto L_0x010a
            L_0x0109:
                r0 = 0
            L_0x010a:
                if (r0 == 0) goto L_0x0169
            L_0x010c:
                com.ss.android.ugc.aweme.commerce.service.models.n r0 = r7.$previewParams
                com.ss.android.ugc.aweme.commerce.service.models.b r0 = r0.f38222d
                if (r0 == 0) goto L_0x0114
                java.lang.String r3 = r0.f38196d
            L_0x0114:
                if (r3 != 0) goto L_0x0119
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0119:
                com.ss.android.ugc.aweme.commerce.sdk.b.a r0 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e
                com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService$b$1 r1 = new com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService$b$1
                r1.<init>(r7)
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                r4 = 2
                java.lang.Object[] r9 = new java.lang.Object[r4]
                r9[r8] = r3
                r9[r2] = r1
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a
                r12 = 0
                r13 = 29494(0x7336, float:4.133E-41)
                java.lang.Class[] r14 = new java.lang.Class[r4]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r14[r8] = r5
                java.lang.Class<kotlin.jvm.functions.Function1> r5 = kotlin.jvm.functions.Function1.class
                r14[r2] = r5
                java.lang.Class r15 = java.lang.Void.TYPE
                r10 = r0
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                if (r5 == 0) goto L_0x015d
                java.lang.Object[] r9 = new java.lang.Object[r4]
                r9[r8] = r3
                r9[r2] = r1
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a
                r12 = 0
                r13 = 29494(0x7336, float:4.133E-41)
                java.lang.Class[] r14 = new java.lang.Class[r4]
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r14[r8] = r1
                java.lang.Class<kotlin.jvm.functions.Function1> r1 = kotlin.jvm.functions.Function1.class
                r14[r2] = r1
                java.lang.Class r15 = java.lang.Void.TYPE
                r10 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                return
            L_0x015d:
                java.lang.String r2 = "ucb"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
                com.ss.android.ugc.aweme.commerce.service.e.a r0 = r0.b()
                r0.a(r3, r1)
            L_0x0169:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService.b.invoke():void");
        }
    }

    public final void fetchCommerceRights() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29548, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29548, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.sdk.verify.a.f37917b.a(com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.a(), (com.ss.android.ugc.aweme.commerce.sdk.verify.b) null);
    }

    @NotNull
    public final d generateRegisterRouter() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29540, new Class[0], d.class)) {
            return new com.ss.android.ugc.aweme.commerce.sdk.c.a();
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29540, new Class[0], d.class);
    }

    public final void onCommerceCardRelease() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29544, new Class[0], Void.TYPE);
            return;
        }
        c cVar = c.k;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f37859a, false, 29294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f37859a, false, 29294, new Class[0], Void.TYPE);
            return;
        }
        h hVar = c.j;
        if (hVar != null) {
            hVar.a();
        }
        c.j = null;
    }

    public final void launchPayTest(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 29542, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 29542, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intent intent = new Intent(context2, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.g());
        intent.setData(Uri.parse("https://haohuo.snssdk.com/views/home/list/jsbridge_test"));
        context2.startActivity(intent);
    }

    public final boolean shouldNeedGuideFootprint(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 29552, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 29552, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(context2);
        if (a2 != null && !a2.o(true)) {
            return false;
        }
        if (a2 != null) {
            a2.p(false);
        }
        return true;
    }

    @SuppressLint({"TooManyMethodParam"})
    public final void showFullPreview(@NotNull n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, changeQuickRedirect, false, 29547, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, changeQuickRedirect, false, 29547, new Class[]{n.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(nVar2, "previewParams");
        com.ss.android.ugc.aweme.commerce.sdk.verify.a.f37917b.a(nVar2.f38220b, nVar2.f38224f, nVar2.g, nVar2.n, (Function0<Unit>) new b<Unit>(this, nVar2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r1 == null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showPreview(com.ss.android.ugc.aweme.commerce.service.models.n r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.n> r3 = com.ss.android.ugc.aweme.commerce.service.models.n.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 29550(0x736e, float:4.1408E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 29550(0x736e, float:4.1408E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.n> r0 = com.ss.android.ugc.aweme.commerce.service.models.n.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            com.ss.android.ugc.aweme.commerce.sdk.b.a r1 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e
            r1.a(r0)
            com.ss.android.ugc.aweme.commerce.service.models.b r1 = r0.f38222d
            if (r1 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.commerce.service.models.k r1 = r0.j
            if (r1 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.commerce.service.models.b r1 = r0.f38222d
            r2 = 0
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = r1.f38194b
            r4 = r1
            goto L_0x004b
        L_0x004a:
            r4 = r2
        L_0x004b:
            if (r4 != 0) goto L_0x0050
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0050:
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r1 = r0.f38221c
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r1.getUid()
            if (r1 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r5 = r1
            goto L_0x0060
        L_0x005d:
            java.lang.String r1 = ""
            goto L_0x005b
        L_0x0060:
            com.ss.android.ugc.aweme.commerce.service.models.k r1 = r0.j
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = r1.f38207b
            r6 = r1
            goto L_0x0069
        L_0x0068:
            r6 = r2
        L_0x0069:
            com.ss.android.ugc.aweme.commerce.service.models.k r1 = r0.j
            if (r1 == 0) goto L_0x0075
            long r7 = r1.f38206a
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r7 = r1
            goto L_0x0076
        L_0x0075:
            r7 = r2
        L_0x0076:
            java.lang.String r8 = r0.i
            java.lang.String r9 = "full_screen_card"
            java.lang.String r10 = r0.f38224f
            com.ss.android.ugc.aweme.commerce.service.models.k r0 = r0.j
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.f38208c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0086:
            if (r2 != 0) goto L_0x008b
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x008b:
            boolean r11 = r2.booleanValue()
            r3 = r17
            r3.logClickCart(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService.showPreview(com.ss.android.ugc.aweme.commerce.service.models.n):void");
    }

    public final void goBindTaobao(@NotNull String str, @Nullable Context context) {
        String str2 = str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, context2}, this, changeQuickRedirect, false, 29541, new Class[]{String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, context2}, this, changeQuickRedirect, false, 29541, new Class[]{String.class, Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "schema");
        if (context2 != null) {
            com.ss.android.ugc.aweme.commerce.sdk.c.b bVar = com.ss.android.ugc.aweme.commerce.sdk.c.b.f37709b;
            if (PatchProxy.isSupport(new Object[]{str2, context2}, bVar, com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a, false, 29526, new Class[]{String.class, Context.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.c.b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{str2, context2}, bVar2, com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a, false, 29526, new Class[]{String.class, Context.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "schema");
            if (context2 != null) {
                if (!ToolUtils.isInstalledApp(context2, "com.taobao.taobao")) {
                    Activity activity = (Activity) context2;
                    String string = context2.getString(C0906R.string.chs);
                    if (PatchProxy.isSupport(new Object[]{"https://h5.m.taobao.com/bcec/downloadTaobao.html", activity, string, (byte) 1, (byte) 1}, null, com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a, true, 29518, new Class[]{String.class, Activity.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{"https://h5.m.taobao.com/bcec/downloadTaobao.html", activity, string, (byte) 1, (byte) 1}, null, com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a, true, 29518, new Class[]{String.class, Activity.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(activity, "fromAct");
                    Intent intent = new Intent(activity, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.g());
                    if (string != null) {
                        intent.putExtra(PushConstants.TITLE, string);
                    }
                    intent.putExtra("hide_nav_bar", true);
                    intent.putExtra("bundle_user_webview_title", true);
                    intent.setData(Uri.parse(com.ss.android.ugc.aweme.commerce.service.l.n.f38045b.a("https://h5.m.taobao.com/bcec/downloadTaobao.html")));
                    activity.startActivity(intent);
                } else if (TextUtils.isEmpty(str2)) {
                    UIUtils.displayToast(context2, (int) C0906R.string.bgf);
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(str));
                    context2.startActivity(intent2);
                }
            }
        }
    }

    public final void startAppByUrl(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, this, changeQuickRedirect, false, 29534, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, this, changeQuickRedirect, false, 29534, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str3, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(str4, "enterFrom");
        com.ss.android.ugc.aweme.commerce.sdk.e.c.f37729b.a(context2, str3, str4);
    }

    public final void initCommerce(@NotNull Context context, @NotNull com.ss.android.ugc.aweme.commerce.service.b.a aVar, @NotNull com.ss.android.ugc.aweme.commerce.service.e.a aVar2) {
        Context context2 = context;
        com.ss.android.ugc.aweme.commerce.service.b.a aVar3 = aVar;
        com.ss.android.ugc.aweme.commerce.service.e.a aVar4 = aVar2;
        if (PatchProxy.isSupport(new Object[]{context2, aVar3, aVar4}, this, changeQuickRedirect, false, 29549, new Class[]{Context.class, com.ss.android.ugc.aweme.commerce.service.b.a.class, com.ss.android.ugc.aweme.commerce.service.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar3, aVar4}, this, changeQuickRedirect, false, 29549, new Class[]{Context.class, com.ss.android.ugc.aweme.commerce.service.b.a.class, com.ss.android.ugc.aweme.commerce.service.e.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(aVar3, "configs");
        Intrinsics.checkParameterIsNotNull(aVar4, "environment");
        try {
            TUnionSDK.init(context2, "24716461", "149584906");
            j.h = true;
        } catch (Throwable unused) {
        }
        com.ss.android.ugc.aweme.commerce.sdk.d.a a2 = com.ss.android.ugc.aweme.commerce.sdk.d.a.g.a();
        if (a2 != null) {
            if (PatchProxy.isSupport(new Object[]{context2}, a2, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29558, new Class[]{Context.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.d.a aVar5 = a2;
                PatchProxy.accessDispatch(new Object[]{context2}, aVar5, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29558, new Class[]{Context.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(context2, "context");
                SharedPreferences a3 = com.ss.android.ugc.aweme.q.c.a(context2, "aweme_user", 0);
                Intrinsics.checkExpressionValueIsNotNull(a3, "context.getSharedPrefere…ER, Context.MODE_PRIVATE)");
                a2.f37719b = a3;
                if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29559, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29559, new Class[0], Void.TYPE);
                } else {
                    SharedPreferences sharedPreferences = a2.f37719b;
                    if (sharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSharedPreferences");
                    }
                    a2.f37720c = sharedPreferences.getBoolean("key_first_jump_to_taobao", true);
                    SharedPreferences sharedPreferences2 = a2.f37719b;
                    if (sharedPreferences2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSharedPreferences");
                    }
                    a2.f37721d = sharedPreferences2.getBoolean("key_first_jump_to_kaola", true);
                    SharedPreferences sharedPreferences3 = a2.f37719b;
                    if (sharedPreferences3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSharedPreferences");
                    }
                    a2.f37722e = sharedPreferences3.getBoolean("key_first_jump_to_jingdong", true);
                }
            }
        }
        com.ss.android.ugc.aweme.commerce.sdk.b.a aVar6 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
        if (PatchProxy.isSupport(new Object[]{context2, aVar4, aVar3}, aVar6, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29490, new Class[]{Context.class, com.ss.android.ugc.aweme.commerce.service.e.a.class, com.ss.android.ugc.aweme.commerce.service.b.a.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.commerce.sdk.b.a aVar7 = aVar6;
            PatchProxy.accessDispatch(new Object[]{context2, aVar4, aVar3}, aVar7, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29490, new Class[]{Context.class, com.ss.android.ugc.aweme.commerce.service.e.a.class, com.ss.android.ugc.aweme.commerce.service.b.a.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(aVar4, "commerceEnvironment");
            Intrinsics.checkParameterIsNotNull(aVar3, "config");
            aVar6.f37704b = aVar4;
            aVar6.f37706d = context2;
            aVar6.f37705c = aVar3;
        }
        j.a aVar8 = j.i;
        if (PatchProxy.isSupport(new Object[]{context2}, aVar8, j.a.f38036a, false, 30015, new Class[]{Context.class}, Void.TYPE)) {
            j.a aVar9 = aVar8;
            PatchProxy.accessDispatch(new Object[]{context2}, aVar9, j.a.f38036a, false, 30015, new Class[]{Context.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(context2, "context");
            int screenWidth = UIUtils.getScreenWidth(context);
            j.f38030a = screenWidth;
            j.f38033d = screenWidth - ((int) UIUtils.dip2Px(context2, 32.0f));
            j.f38032c = (j.f38030a - ((int) UIUtils.dip2Px(context2, 44.0f))) / 2;
            double screenHeight = (double) UIUtils.getScreenHeight(context);
            Double.isNaN(screenHeight);
            j.f38031b = (int) (screenHeight * 0.73d);
        }
        fetchCommerceRights();
    }

    public final boolean onReceiveFeedPromotionSuccess(@NotNull User user, @NotNull String str, @Nullable List<com.ss.android.ugc.aweme.commerce.service.models.h> list) {
        long j;
        User user2 = user;
        String str2 = str;
        List<com.ss.android.ugc.aweme.commerce.service.models.h> list2 = list;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{user2, str2, list2}, this, changeQuickRedirect, false, 29543, new Class[]{User.class, String.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user2, str2, list2}, this, changeQuickRedirect, false, 29543, new Class[]{User.class, String.class, List.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(user2, "ownerUser");
        Intrinsics.checkParameterIsNotNull(str2, "awemeId");
        if (list2 == null) {
            return false;
        }
        c cVar = c.k;
        if (PatchProxy.isSupport(new Object[]{user2, str2, list2}, cVar, c.f37859a, false, 29293, new Class[]{User.class, String.class, List.class}, Void.TYPE)) {
            c cVar2 = cVar;
            PatchProxy.accessDispatch(new Object[]{user2, str2, list2}, cVar2, c.f37859a, false, 29293, new Class[]{User.class, String.class, List.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(user2, "ownerUser");
            Intrinsics.checkParameterIsNotNull(list2, "promoList");
            if (PatchProxy.isSupport(new Object[0], cVar, c.f37859a, false, 29292, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f37859a, false, 29292, new Class[0], Void.TYPE);
            } else {
                WeakReference<LiveSkuPanelDialogFragment> weakReference = c.f37860b;
                if (weakReference != null) {
                    weakReference.clear();
                }
                WeakReference<c.a> weakReference2 = c.i;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                c.f37864f = null;
                c.g = 0;
                c.h = 0;
                c.f37861c = null;
                c.f37862d = null;
                c.f37863e = null;
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.a aVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.a.f37837c;
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.a.f37835a, false, 29302, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.a.f37835a, false, 29302, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.a.f37836b.clear();
                }
            }
            c.f37863e = str2;
            c.f37861c = user2;
            c.f37862d = user.getUid();
            c.f37864f = new com.ss.android.ugc.aweme.commerce.sdk.live.a.a(null, null, 3);
            List<com.ss.android.ugc.aweme.commerce.service.models.h> arrayList = new ArrayList<>();
            for (com.ss.android.ugc.aweme.commerce.service.models.h next : list) {
                if (!next.isThirdParty()) {
                    arrayList.add(next);
                }
            }
            for (com.ss.android.ugc.aweme.commerce.service.models.h hVar : arrayList) {
                ak a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(hVar, user.getUid(), str2);
                a2.s = "pop_up_card";
                com.ss.android.ugc.aweme.commerce.sdk.live.a.a aVar2 = c.f37864f;
                if (aVar2 != null) {
                    List<ak> list3 = aVar2.f37739a;
                    if (list3 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(a2, "uiSkuInfo");
                        list3.add(a2);
                    }
                }
                if (!hVar.isSecKillGood()) {
                    String promotionId = hVar.getPromotionId();
                    if (promotionId == null) {
                        Intrinsics.throwNpe();
                    }
                    String productId = hVar.getProductId();
                    if (productId == null) {
                        Intrinsics.throwNpe();
                    }
                    com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.a(promotionId, productId, 1).a((g<TResult, TContinuationResult>) new c.e<TResult,TContinuationResult>(i), i.f1052b);
                } else {
                    h hVar2 = c.j;
                    if (hVar2 == null || !hVar2.f38019b) {
                        if (c.j == null) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            r toutiao = hVar.getToutiao();
                            if (toutiao != null) {
                                s secKillInfo = toutiao.getSecKillInfo();
                                if (secKillInfo != null) {
                                    j = secKillInfo.getCurrentTime();
                                    c.j = new h(timeUnit.toMillis(j), TimeUnit.SECONDS.toMillis(1));
                                }
                            }
                            j = 0;
                            c.j = new h(timeUnit.toMillis(j), TimeUnit.SECONDS.toMillis(1));
                        }
                        h hVar3 = c.j;
                        if (hVar3 != null) {
                            hVar3.b();
                        }
                    }
                }
                i++;
            }
        }
        return true;
    }

    public final void gotoGoodShop(@Nullable m mVar, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        m mVar2 = mVar;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{mVar2, str4, str5, str6}, this, changeQuickRedirect, false, 29537, new Class[]{m.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {mVar2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 29537, new Class[]{m.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str4, "enterMethodForAuth");
        Intrinsics.checkParameterIsNotNull(str5, "entranceLocation");
        Intrinsics.checkParameterIsNotNull(str6, "enterMethod");
        com.ss.android.ugc.aweme.commerce.sdk.c.b.f37709b.a(mVar2, str4, str5, str6);
    }

    public final void openApp(@Nullable com.ss.android.ugc.aweme.commerce.service.models.c cVar, @Nullable Activity activity, @Nullable String str, @NotNull Function1<? super Boolean, Unit> function1) {
        com.ss.android.ugc.aweme.commerce.service.models.c cVar2 = cVar;
        Activity activity2 = activity;
        String str2 = str;
        Function1<? super Boolean, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{cVar2, activity2, str2, function12}, this, changeQuickRedirect, false, 29539, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class, Activity.class, String.class, Function1.class}, Void.TYPE)) {
            Object[] objArr = {cVar2, activity2, str2, function12};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 29539, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class, Activity.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "jumpAppSuccess");
        com.ss.android.ugc.aweme.commerce.sdk.c.b bVar = com.ss.android.ugc.aweme.commerce.sdk.c.b.f37709b;
        if (PatchProxy.isSupport(new Object[]{cVar2, activity2, str2, function12}, bVar, com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a, false, 29522, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class, Activity.class, String.class, Function1.class}, Void.TYPE)) {
            Object[] objArr3 = {cVar2, activity2, str2, function12};
            Object[] objArr4 = objArr3;
            com.ss.android.ugc.aweme.commerce.sdk.c.b bVar2 = bVar;
            PatchProxy.accessDispatch(objArr4, bVar2, com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a, false, 29522, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class, Activity.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "jumpAppSuccess");
        if (TextUtils.isEmpty(str2) || activity2 == null || cVar2 == null) {
            function12.invoke(Boolean.FALSE);
            return;
        }
        String str3 = "";
        int i = -1;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = null;
        if (cVar.isJDGood()) {
            str3 = "com.jingdong.app.mall";
            i = C0906R.string.dtz;
            com.ss.android.ugc.aweme.commerce.sdk.d.a a2 = com.ss.android.ugc.aweme.commerce.sdk.d.a.g.a();
            if (a2 != null) {
                bool2 = Boolean.valueOf(a2.f37722e);
            }
        } else if (cVar.isKaolaGood()) {
            str3 = "com.kaola";
            i = C0906R.string.du0;
            com.ss.android.ugc.aweme.commerce.sdk.d.a a3 = com.ss.android.ugc.aweme.commerce.sdk.d.a.g.a();
            if (a3 != null) {
                bool2 = Boolean.valueOf(a3.f37721d);
            }
        } else {
            bool2 = bool;
        }
        bVar.a(activity, str3, bool2, i, new b.C0488b(cVar2), new b.c(activity2, str2), function1);
    }

    @NotNull
    public final DialogFragment showSkuPanelGoodsDialogFromFeedCard(@Nullable String str, @Nullable String str2, @Nullable FragmentManager fragmentManager, @Nullable Function0<Unit> function0) {
        String str3 = str;
        String str4 = str2;
        FragmentManager fragmentManager2 = fragmentManager;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{str3, str4, fragmentManager2, function02}, this, changeQuickRedirect, false, 29545, new Class[]{String.class, String.class, FragmentManager.class, Function0.class}, DialogFragment.class)) {
            Object[] objArr = {str3, str4, fragmentManager2, function02};
            return (DialogFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 29545, new Class[]{String.class, String.class, FragmentManager.class, Function0.class}, DialogFragment.class);
        }
        c cVar = c.k;
        if (PatchProxy.isSupport(new Object[]{str3, str4, fragmentManager2, function02}, cVar, c.f37859a, false, 29291, new Class[]{String.class, String.class, FragmentManager.class, Function0.class}, DialogFragment.class)) {
            return (DialogFragment) PatchProxy.accessDispatch(new Object[]{str3, str4, fragmentManager2, function02}, cVar, c.f37859a, false, 29291, new Class[]{String.class, String.class, FragmentManager.class, Function0.class}, DialogFragment.class);
        }
        LiveSkuPanelDialogFragment liveSkuPanelDialogFragment = new LiveSkuPanelDialogFragment();
        liveSkuPanelDialogFragment.f37746d = cVar;
        liveSkuPanelDialogFragment.f37747e = new c.f(function02);
        LiveSkuPanelDialogFragment.a aVar = LiveSkuPanelDialogFragment.f37743f;
        User user = c.f37861c;
        if (PatchProxy.isSupport(new Object[]{liveSkuPanelDialogFragment, user, str3, str4, fragmentManager2}, aVar, LiveSkuPanelDialogFragment.a.f37748a, false, 29284, new Class[]{LiveSkuPanelDialogFragment.class, User.class, String.class, String.class, FragmentManager.class}, Void.TYPE)) {
            Object[] objArr2 = {liveSkuPanelDialogFragment, user, str3, str4, fragmentManager2};
            Object[] objArr3 = objArr2;
            LiveSkuPanelDialogFragment.a aVar2 = aVar;
            PatchProxy.accessDispatch(objArr3, aVar2, LiveSkuPanelDialogFragment.a.f37748a, false, 29284, new Class[]{LiveSkuPanelDialogFragment.class, User.class, String.class, String.class, FragmentManager.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(liveSkuPanelDialogFragment, "dialogFragment");
            if (fragmentManager2 != null) {
                Bundle bundle = new Bundle();
                if (user != null) {
                    bundle.putSerializable("key_anchor_info", user);
                }
                bundle.putString("promotion_id", str3);
                bundle.putString("enter_from", str4);
                liveSkuPanelDialogFragment.setArguments(bundle);
                liveSkuPanelDialogFragment.show(fragmentManager2, "live_goods_dialog");
            }
        }
        c.f37860b = new WeakReference<>(liveSkuPanelDialogFragment);
        return liveSkuPanelDialogFragment;
    }

    public final void checkLoginAndLawHint(@Nullable Context context, @Nullable String str, @Nullable String str2, long j, @NotNull Function0<Unit> function0) {
        long j2 = j;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j2), function02}, this, changeQuickRedirect, false, 29536, new Class[]{Context.class, String.class, String.class, Long.TYPE, Function0.class}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, new Long(j2), function02};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 29536, new Class[]{Context.class, String.class, String.class, Long.TYPE, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "callback");
        com.ss.android.ugc.aweme.commerce.sdk.verify.a.f37917b.a(context, str, str2, j, function0);
    }

    public final void tryCheckRealName(@NotNull Context context, int i, @NotNull String str, @NotNull String str2, @Nullable com.ss.android.ugc.aweme.commerce.service.a.a aVar) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), str3, str4, aVar}, this, changeQuickRedirect, false, 29546, new Class[]{Context.class, Integer.TYPE, String.class, String.class, com.ss.android.ugc.aweme.commerce.service.a.a.class}, Void.TYPE)) {
            Object[] objArr = {context2, Integer.valueOf(i), str3, str4, aVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 29546, new Class[]{Context.class, Integer.TYPE, String.class, String.class, com.ss.android.ugc.aweme.commerce.service.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str3, "enterFrom");
        Intrinsics.checkParameterIsNotNull(str4, "enterMethod");
        com.ss.android.ugc.aweme.commerce.sdk.verify.a.a(context, i, str, str2, aVar);
    }

    public final void openPortfolioAccordingToAB(@NotNull Activity activity, @NotNull CommerceUser commerceUser, @Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Activity activity2 = activity;
        CommerceUser commerceUser2 = commerceUser;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        if (PatchProxy.isSupport(new Object[]{activity2, commerceUser2, str, str5, str6, str7}, this, changeQuickRedirect, false, 29535, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, commerceUser2, str, str5, str6, str7};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 29535, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        Intrinsics.checkParameterIsNotNull(commerceUser2, "userInfo");
        Intrinsics.checkParameterIsNotNull(str5, "entranceLocation");
        Intrinsics.checkParameterIsNotNull(str6, "enterMethod");
        Intrinsics.checkParameterIsNotNull(str7, "referFrom");
        com.ss.android.ugc.aweme.commerce.sdk.c.b.f37709b.a(activity, commerceUser, str, str2, str3, str4);
    }

    @SuppressLint({"TooManyMethodParam"})
    private final void logClickCart(String str, String str2, String str3, Long l, String str4, String str5, String str6, boolean z) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        Long l2 = l;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if (PatchProxy.isSupport(new Object[]{str7, str8, str9, l2, str10, str11, str12, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 29551, new Class[]{String.class, String.class, String.class, Long.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str7, str8, str9, l2, str10, str11, str12, Byte.valueOf(z)}, this, changeQuickRedirect, false, 29551, new Class[]{String.class, String.class, String.class, Long.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        new aj().d(str7).f(str8).a(str11).b(z).b(str10).c(str9).a(l2).e(str12).b();
    }

    @SuppressLint({"TooManyMethodParam"})
    public final void openTaobao(@NotNull Activity activity, @Nullable String str, @Nullable com.ss.android.ugc.aweme.commerce.service.models.h hVar, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6, boolean z, @Nullable String str7) {
        com.ss.android.ugc.aweme.commerce.sdk.c.b bVar;
        char c2;
        Boolean bool;
        String str8;
        boolean z2;
        Activity activity2 = activity;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        if (PatchProxy.isSupport(new Object[]{activity2, str9, hVar, str10, str11, str12, str13, str14, Byte.valueOf(z ? (byte) 1 : 0), str15}, this, changeQuickRedirect, false, 29538, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.commerce.service.models.h.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str9, hVar, str10, str11, str12, str13, str14, Byte.valueOf(z), str15}, this, changeQuickRedirect, false, 29538, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.commerce.service.models.h.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        Intrinsics.checkParameterIsNotNull(str10, "enterFrom");
        Intrinsics.checkParameterIsNotNull(str14, "enterMethod");
        com.ss.android.ugc.aweme.commerce.sdk.c.b bVar2 = com.ss.android.ugc.aweme.commerce.sdk.c.b.f37709b;
        com.ss.android.ugc.aweme.commerce.service.models.c cVar = hVar;
        Object[] objArr = {activity2, str9, cVar, str10, str11, str12, str13, str14, Byte.valueOf(z), str15};
        if (PatchProxy.isSupport(objArr, bVar2, com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a, false, 29521, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.commerce.service.models.c.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str9, cVar, str10, str11, str12, str13, str14, Byte.valueOf(z), str15}, bVar2, com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a, false, 29521, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.commerce.service.models.c.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        Intrinsics.checkParameterIsNotNull(str10, "enterFrom");
        Intrinsics.checkParameterIsNotNull(str14, "enterMethod");
        if (str9 != null && !TextUtils.isEmpty(str9) && cVar != null) {
            if (z) {
                com.ss.android.ugc.aweme.commerce.sdk.e.d dVar = com.ss.android.ugc.aweme.commerce.sdk.e.d.f37732b;
                String promotionId = cVar.getPromotionId();
                if (promotionId == null) {
                    promotionId = "";
                }
                bVar = bVar2;
                c2 = 1;
                com.ss.android.ugc.aweme.common.r.a((Context) activity2, "click_product", str2, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, dVar.a(str3, promotionId, str2, str4, (int) cVar.getPromotionSource()));
                p pVar = new p();
                p f2 = pVar.e(str12).a(cVar.getElasticType()).d(str11).a(str15).c(cVar.getPromotionId()).f(str14);
                if (cVar.hasCoupon()) {
                    str8 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str8 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                f2.g(str8).b(str13).a(Long.valueOf(cVar.getCommodityType()));
                if (cVar instanceof com.ss.android.ugc.aweme.commerce.service.models.h) {
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = (com.ss.android.ugc.aweme.commerce.service.models.h) cVar;
                    p a2 = pVar.a(Boolean.valueOf(hVar2.isSelf()));
                    o activity3 = hVar2.getActivity();
                    if (activity3 == null || !activity3.canBeShown()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    a2.b(z2);
                }
                pVar.b();
            } else {
                bVar = bVar2;
                c2 = 1;
            }
            Object[] objArr2 = new Object[3];
            objArr2[0] = activity2;
            objArr2[c2] = str9;
            objArr2[2] = str10;
            ChangeQuickRedirect changeQuickRedirect2 = com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a;
            Class[] clsArr = new Class[3];
            clsArr[0] = Activity.class;
            clsArr[c2] = String.class;
            clsArr[2] = String.class;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, 29519, clsArr, Void.TYPE)) {
                Object[] objArr3 = new Object[3];
                objArr3[0] = activity2;
                objArr3[c2] = str9;
                objArr3[2] = str10;
                ChangeQuickRedirect changeQuickRedirect3 = com.ss.android.ugc.aweme.commerce.sdk.c.b.f37708a;
                Class[] clsArr2 = new Class[3];
                clsArr2[0] = Activity.class;
                clsArr2[c2] = String.class;
                clsArr2[2] = String.class;
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, 29519, clsArr2, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.sdk.d.a a3 = com.ss.android.ugc.aweme.commerce.sdk.d.a.g.a();
            if (a3 != null) {
                bool = Boolean.valueOf(a3.f37720c);
            } else {
                bool = null;
            }
            bVar.a(activity, "com.taobao.taobao", bool, C0906R.string.du1, b.e.INSTANCE, new b.f(activity2, str9, str10), new b.g(str9, activity2, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.a().getString(C0906R.string.chr)));
        }
    }
}

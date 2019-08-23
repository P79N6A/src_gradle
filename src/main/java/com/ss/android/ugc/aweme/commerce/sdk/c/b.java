package com.ss.android.ugc.aweme.commerce.sdk.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.commerce.service.l.n;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.m;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ(\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002J8\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u0018Je\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u0018H\u0002¢\u0006\u0002\u0010 JB\u0010!\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0002J8\u0010(\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006J \u0010)\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002Jb\u0010+\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010*\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0006J:\u00102\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00104\u001a\u00020\u00102\b\b\u0002\u00105\u001a\u00020\u0010H\u0007J\u0006\u00106\u001a\u00020\u0004¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/router/CommerceRouter;", "", "()V", "goBindTaobao", "", "schema", "", "context", "Landroid/content/Context;", "gotoGoodShop", "goodsShopIntentData", "Lcom/ss/android/ugc/aweme/commerce/service/models/PortfolioParams;", "enterMethodForAuth", "entranceLocation", "enterMethod", "isJumpToAppSuccess", "", "fromAct", "Landroid/app/Activity;", "url", "openApp", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "jumpAppSuccess", "Lkotlin/Function1;", "openAppProcess", "packageName", "isFirstEnter", "dialogTitle", "", "flag", "Lkotlin/Function0;", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "openPortfolio", "userInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "triggerAwemeId", "referFrom", "clickTime", "", "openPortfolioAccordingToAB", "openTaoBaoApp", "enterFrom", "openTaobao", "good", "awemeId", "uid", "carrierType", "withLog", "sourcePage", "openUrl", "title", "hideNav", "autoTitle", "openZhiMaAuth", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37708a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f37709b = new b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/router/CommerceRouter$gotoGoodShop$1", "Lcom/ss/android/ugc/aweme/commerce/service/callbacks/AuthCB;", "onVerified", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class a implements com.ss.android.ugc.aweme.commerce.service.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37710a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f37711b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37710a, false, 29527, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37710a, false, 29527, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.sdk.b.a aVar = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            String bE = b2.bE();
            Map hashMap = new HashMap();
            Context context = this.f37711b;
            if (PatchProxy.isSupport(new Object[]{bE, hashMap, context}, aVar, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29495, new Class[]{String.class, Map.class, Context.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.b.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{bE, hashMap, context}, aVar2, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29495, new Class[]{String.class, Map.class, Context.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hashMap, "options");
            aVar.b().a(bE, hashMap, context);
        }

        a(Activity activity) {
            this.f37711b = activity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isFirstEnterFlag", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.c.b$b  reason: collision with other inner class name */
    public static final class C0488b extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.c $promotion;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0488b(com.ss.android.ugc.aweme.commerce.service.models.c cVar) {
            super(1);
            this.$promotion = cVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            boolean z2 = z;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 29528, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 29528, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (this.$promotion.isKaolaGood()) {
                com.ss.android.ugc.aweme.commerce.sdk.d.a a2 = com.ss.android.ugc.aweme.commerce.sdk.d.a.g.a();
                if (a2 != null) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29557, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.commerce.sdk.d.a aVar = a2;
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, aVar, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29557, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        a2.f37721d = z2;
                        a2.a("key_first_jump_to_kaola", Boolean.valueOf(z));
                    }
                }
            } else if (this.$promotion.isJDGood()) {
                com.ss.android.ugc.aweme.commerce.sdk.d.a a3 = com.ss.android.ugc.aweme.commerce.sdk.d.a.g.a();
                if (a3 != null) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a3, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29556, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.commerce.sdk.d.a aVar2 = a3;
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, aVar2, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29556, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        a3.f37722e = z2;
                        a3.a("key_first_jump_to_jingdong", Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Activity $fromAct;
        final /* synthetic */ String $url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Activity activity, String str) {
            super(0);
            this.$fromAct = activity;
            this.$url = str;
        }

        public final boolean invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29529, new Class[0], Boolean.TYPE)) {
                return b.f37709b.a(this.$fromAct, this.$url);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29529, new Class[0], Boolean.TYPE)).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37712a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f37713b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f37714c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function1 f37715d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Function1 f37716e;

        d(Ref.BooleanRef booleanRef, Function0 function0, Function1 function1, Function1 function12) {
            this.f37713b = booleanRef;
            this.f37714c = function0;
            this.f37715d = function1;
            this.f37716e = function12;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f37712a, false, 29530, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f37712a, false, 29530, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f37713b.element = ((Boolean) this.f37714c.invoke()).booleanValue();
            this.f37715d.invoke(Boolean.valueOf(this.f37713b.element));
            this.f37716e.invoke(Boolean.FALSE);
            dialogInterface.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isFirstEnterFlag", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 29531, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 29531, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.sdk.d.a a2 = com.ss.android.ugc.aweme.commerce.sdk.d.a.g.a();
            if (a2 != null) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29555, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.commerce.sdk.d.a aVar = a2;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, aVar, com.ss.android.ugc.aweme.commerce.sdk.d.a.f37717a, false, 29555, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    a2.f37720c = z;
                    a2.a("key_first_jump_to_taobao", Boolean.valueOf(z));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class f extends Lambda implements Function0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ Activity $fromAct;
        final /* synthetic */ String $url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Activity activity, String str, String str2) {
            super(0);
            this.$fromAct = activity;
            this.$url = str;
            this.$enterFrom = str2;
        }

        public final boolean invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29532, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.commerce.sdk.e.c.f37729b.a(this.$fromAct, this.$url, this.$enterFrom);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29532, new Class[0], Boolean.TYPE)).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isJumpToAppSuccess", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class g extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Activity $fromAct;
        final /* synthetic */ String $proxyTitle;
        final /* synthetic */ String $url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, Activity activity, String str2) {
            super(1);
            this.$url = str;
            this.$fromAct = activity;
            this.$proxyTitle = str2;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 29533, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 29533, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (!z) {
                String str = this.$url;
                Intent intent = new Intent(this.$fromAct, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.g());
                n nVar = n.f38045b;
                String str2 = this.$proxyTitle;
                Intrinsics.checkExpressionValueIsNotNull(str2, "proxyTitle");
                intent.setData(Uri.parse(n.f38045b.a(nVar.a(str, PushConstants.TITLE, str2))));
                this.$fromAct.startActivity(intent);
            }
        }
    }

    private b() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37708a, false, 29524, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37708a, false, 29524, new Class[0], Void.TYPE);
            return;
        }
        h.a().a("aweme://aweme/zhima/commerce");
    }

    public final boolean a(Activity activity, String str) {
        Activity activity2 = activity;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{activity2, str}, this, f37708a, false, 29523, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str}, this, f37708a, false, 29523, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.putExtra("start_only_for_android", true);
            activity2.startActivity(intent);
            z = true;
        } catch (Exception unused) {
        }
        return z;
    }

    public final void a(@Nullable m mVar, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        m mVar2 = mVar;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{mVar2, str4, str5, str6}, this, f37708a, false, 29525, new Class[]{m.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {mVar2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f37708a, false, 29525, new Class[]{m.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str4, "enterMethodForAuth");
        Intrinsics.checkParameterIsNotNull(str5, "entranceLocation");
        Intrinsics.checkParameterIsNotNull(str6, "enterMethod");
        if (mVar2 != null) {
            Activity activity = mVar2.f38214b;
            if (activity != null) {
                int i = mVar2.f38215c;
                CommerceUser commerceUser = mVar2.f38216d;
                if (commerceUser != null) {
                    String str7 = mVar2.f38217e;
                    boolean z = mVar2.f38218f;
                    String str8 = mVar2.g;
                    if (!z) {
                        a(activity, commerceUser, str8, str2, str3, str7);
                        return;
                    }
                    if (TextUtils.isEmpty(commerceUser.getBindPhone())) {
                        com.ss.android.ugc.aweme.commerce.sdk.b.a aVar = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
                        Context context = activity;
                        if (PatchProxy.isSupport(new Object[]{context}, aVar, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29493, new Class[]{Context.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.commerce.sdk.b.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{context}, aVar2, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29493, new Class[]{Context.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(context, "context");
                            aVar.b().a(context);
                        }
                    } else {
                        com.ss.android.ugc.aweme.commerce.sdk.verify.a.a((Context) activity, i, str7, str4, (com.ss.android.ugc.aweme.commerce.service.a.a) new a(activity));
                    }
                }
            }
        }
    }

    public final void a(@NotNull Activity activity, @NotNull CommerceUser commerceUser, @Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Class<?> cls;
        Activity activity2 = activity;
        CommerceUser commerceUser2 = commerceUser;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{activity2, commerceUser2, str5, str6, str7, str8}, this, f37708a, false, 29517, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, commerceUser2, str5, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f37708a, false, 29517, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        Intrinsics.checkParameterIsNotNull(commerceUser2, "userInfo");
        Intrinsics.checkParameterIsNotNull(str6, "entranceLocation");
        Intrinsics.checkParameterIsNotNull(str7, "enterMethod");
        Intrinsics.checkParameterIsNotNull(str8, "referFrom");
        long uptimeMillis = SystemClock.uptimeMillis();
        Object[] objArr3 = {activity2, commerceUser2, str5, str6, str7, str8, new Long(uptimeMillis)};
        if (PatchProxy.isSupport(objArr3, this, f37708a, false, 29516, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr4 = {activity2, commerceUser2, str5, str6, str7, str8, new Long(uptimeMillis)};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, this, f37708a, false, 29516, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Context context = activity2;
        com.ss.android.ugc.aweme.commerce.sdk.b.a aVar = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
        if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29505, new Class[0], Class.class)) {
            cls = (Class) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29505, new Class[0], Class.class);
        } else {
            cls = aVar.b().a();
        }
        Intent intent = new Intent(context, cls);
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_user_info", commerceUser2);
        bundle.putString("key_trigger_aweme_id", str5);
        bundle.putString("key_entrance_location", str6);
        bundle.putString("key_enter_method", str7);
        bundle.putString("key_refer_from", str8);
        bundle.putLong("key_click_time", uptimeMillis);
        intent.putExtras(bundle);
        activity2.startActivity(intent);
    }

    public final void a(Activity activity, String str, Boolean bool, int i, Function1<? super Boolean, Unit> function1, Function0<Boolean> function0, Function1<? super Boolean, Unit> function12) {
        String str2 = str;
        Boolean bool2 = bool;
        Function1<? super Boolean, Unit> function13 = function1;
        Function0<Boolean> function02 = function0;
        Function1<? super Boolean, Unit> function14 = function12;
        if (PatchProxy.isSupport(new Object[]{activity, str2, bool2, Integer.valueOf(i), function13, function02, function14}, this, f37708a, false, 29520, new Class[]{Activity.class, String.class, Boolean.class, Integer.TYPE, Function1.class, Function0.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, str2, bool2, Integer.valueOf(i), function13, function02, function14}, this, f37708a, false, 29520, new Class[]{Activity.class, String.class, Boolean.class, Integer.TYPE, Function1.class, Function0.class, Function1.class}, Void.TYPE);
            return;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Context context = activity;
        if (!ToolUtils.isInstalledApp(context, str2)) {
            booleanRef.element = false;
            function14.invoke(Boolean.valueOf(booleanRef.element));
        } else if (Intrinsics.areEqual((Object) bool2, (Object) Boolean.TRUE)) {
            AlertDialog.Builder a2 = com.ss.android.a.a.a(context);
            a2.setTitle(i).setPositiveButton((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new d(booleanRef, function02, function14, function13)).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) null);
            a2.show();
        } else {
            booleanRef.element = ((Boolean) function0.invoke()).booleanValue();
            function14.invoke(Boolean.valueOf(booleanRef.element));
        }
    }
}

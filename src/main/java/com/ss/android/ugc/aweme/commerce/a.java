package com.ss.android.ugc.aweme.commerce;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.commerce.billshare.a;
import com.ss.android.ugc.aweme.commerce.preview.h;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commercialize.utils.a.a.a;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.music.util.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007J,\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J0\u0010\u0014\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018J\u001e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0006J2\u0010\u001e\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J,\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J$\u0010!\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0007J:\u0010%\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000bH\u0007JX\u0010(\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0007J\u0018\u0010/\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u0006H\u0007JV\u00101\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00062\b\u00103\u001a\u0004\u0018\u00010\u00062\b\u00104\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\b\u00105\u001a\u0004\u0018\u00010\u0006H\u0007JB\u00106\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u00107\u001a\u0004\u0018\u00010\u00062\b\u00108\u001a\u0004\u0018\u00010\u00062\b\u00109\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\b\u00105\u001a\u0004\u0018\u00010\u0006H\u0007J`\u0010:\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00062\b\u00103\u001a\u0004\u0018\u00010\u00062\b\u00104\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\b\u00105\u001a\u0004\u0018\u00010\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0007J\u000e\u0010<\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u000f¨\u0006>"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/CCRouter;", "", "()V", "getDisplayPromotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "promotionId", "", "productId", "detailPromotions", "", "isUrlOrSchemaValid", "", "url", "schema", "context", "Landroid/content/Context;", "openAdWebUrl", "", "webUrl", "title", "openAllSchema", "fromAct", "Landroid/app/Activity;", "options", "", "openLawHintDialog", "yesListener", "Landroid/view/View$OnClickListener;", "noListener", "content", "openRN", "openSchemaWithH5Fallback", "schemaUrl", "openVideo", "good", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "uid", "openWebUrl", "hideNav", "autoTitle", "openWebUrlForResult", "fromFrag", "Landroid/support/v4/app/Fragment;", "requestCode", "", "adWebUrlData", "Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage$AdWebUrlData;", "requestForShopppingAccess", "enterFrom", "schemaToOrderShare", "targetUid", "secTargetUid", "awemeId", "enterMethod", "schemaToPortfolio", "userId", "secUserId", "entranceLocation", "schemaToSeeding", "playId", "toMainActivityProfieTab", "ctx", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36660a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f36661b = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.a$a  reason: collision with other inner class name */
    static final class C0460a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36662a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.views.b f36663b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f36664c;

        C0460a(com.ss.android.ugc.aweme.views.b bVar, View.OnClickListener onClickListener) {
            this.f36663b = bVar;
            this.f36664c = onClickListener;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36662a, false, 27873, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36662a, false, 27873, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f36663b.dismiss();
            this.f36664c.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.views.b f36669b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f36670c;

        b(com.ss.android.ugc.aweme.views.b bVar, View.OnClickListener onClickListener) {
            this.f36669b = bVar;
            this.f36670c = onClickListener;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36668a, false, 27874, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36668a, false, 27874, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f36669b.dismiss();
            this.f36670c.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/CUserResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class c<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36671a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36672b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36673c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f36674d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f36675e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Activity f36676f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;

        c(String str, String str2, String str3, String str4, Activity activity, String str5, String str6) {
            this.f36672b = str;
            this.f36673c = str2;
            this.f36674d = str3;
            this.f36675e = str4;
            this.f36676f = activity;
            this.g = str5;
            this.h = str6;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f36671a, false, 27875, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f36671a, false, 27875, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                if (!iVar.d() && iVar.e() != null && ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).statusCode == 0) {
                    final User user = ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).f37321a;
                    if (n.r.a(this.f36672b)) {
                        com.ss.android.ugc.aweme.commerce.promotion.a.f37668b.a(this.f36672b, this.f36673c, new Function1<List<? extends h>, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ c this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((List) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull List<h> list) {
                                List<h> list2 = list;
                                if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 27876, new Class[]{List.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 27876, new Class[]{List.class}, Void.TYPE);
                                    return;
                                }
                                Intrinsics.checkParameterIsNotNull(list2, "detailPromotions");
                                h a2 = a.a(this.this$0.f36674d, this.this$0.f36675e, list2);
                                if (a2 == null) {
                                    com.bytedance.ies.dmt.ui.d.a.b(this.this$0.f36676f.getApplicationContext(), (int) C0906R.string.yr).a();
                                    return;
                                }
                                a.C0462a aVar = com.ss.android.ugc.aweme.commerce.billshare.a.f36734c;
                                Activity activity = this.this$0.f36676f;
                                CommerceUser a3 = com.ss.android.ugc.aweme.commerce.service.l.d.a(user);
                                Intrinsics.checkExpressionValueIsNotNull(a3, "CommerceUtils.toCommerceUser(userInfo)");
                                String str = this.this$0.g;
                                if (str == null) {
                                    str = f.f34168b;
                                }
                                String str2 = str;
                                String str3 = this.this$0.h;
                                if (str3 == null) {
                                    str3 = "click_open_url";
                                }
                                aVar.a(activity, a2, a3, str2, str3, a2.getOriginMediaId(), true);
                            }
                        }, new Function1<JSONObject, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ c this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((JSONObject) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable JSONObject jSONObject) {
                                if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 27877, new Class[]{JSONObject.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 27877, new Class[]{JSONObject.class}, Void.TYPE);
                                    return;
                                }
                                com.bytedance.ies.dmt.ui.d.a.b(this.this$0.f36676f.getApplicationContext(), (int) C0906R.string.yr).a();
                            }
                        });
                    } else if (!(this.f36674d == null || this.f36675e == null)) {
                        com.ss.android.ugc.aweme.commerce.promotion.a.f37668b.a(this.f36674d, this.f36675e, this.f36673c, new Function1<h, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ c this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((h) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull h hVar) {
                                h hVar2 = hVar;
                                if (PatchProxy.isSupport(new Object[]{hVar2}, this, changeQuickRedirect, false, 27878, new Class[]{h.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{hVar2}, this, changeQuickRedirect, false, 27878, new Class[]{h.class}, Void.TYPE);
                                    return;
                                }
                                Intrinsics.checkParameterIsNotNull(hVar2, "detailPromotion");
                                a.C0462a aVar = com.ss.android.ugc.aweme.commerce.billshare.a.f36734c;
                                Activity activity = this.this$0.f36676f;
                                CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(user);
                                Intrinsics.checkExpressionValueIsNotNull(a2, "CommerceUtils.toCommerceUser(userInfo)");
                                String str = this.this$0.g;
                                if (str == null) {
                                    str = f.f34168b;
                                }
                                String str2 = str;
                                String str3 = this.this$0.h;
                                if (str3 == null) {
                                    str3 = "click_open_url";
                                }
                                aVar.a(activity, hVar, a2, str2, str3, hVar.getOriginMediaId(), true);
                            }
                        }, new Function1<JSONObject, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ c this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((JSONObject) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull JSONObject jSONObject) {
                                JSONObject jSONObject2 = jSONObject;
                                if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 27879, new Class[]{JSONObject.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 27879, new Class[]{JSONObject.class}, Void.TYPE);
                                    return;
                                }
                                Intrinsics.checkParameterIsNotNull(jSONObject2, AdvanceSetting.NETWORK_TYPE);
                                com.bytedance.ies.dmt.ui.d.a.b(this.this$0.f36676f.getApplicationContext(), (int) C0906R.string.yr).a();
                            }
                        });
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/portfolio/UserResponse;", "then"}, k = 3, mv = {1, 1, 15})
    static final class d<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36677a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f36678b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36679c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f36680d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f36681e;

        d(Activity activity, String str, String str2, String str3) {
            this.f36678b = activity;
            this.f36679c = str;
            this.f36680d = str2;
            this.f36681e = str3;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f36677a, false, 27880, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f36677a, false, 27880, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(iVar, "task");
                if (!iVar.d() && ((com.ss.android.ugc.aweme.commerce.portfolio.b) iVar.e()).statusCode == 0) {
                    CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(((com.ss.android.ugc.aweme.commerce.portfolio.b) iVar.e()).f37058a);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "CommerceUtils.toCommerceUser(task.result.user)");
                    Activity activity = this.f36678b;
                    String str = this.f36679c;
                    if (str == null) {
                        str = f.f34168b;
                    }
                    String str2 = str;
                    String str3 = this.f36680d;
                    if (str3 == null) {
                        str3 = "click_open_url";
                    }
                    String str4 = str3;
                    String str5 = this.f36681e;
                    if (str5 == null) {
                        str5 = f.f34168b;
                    }
                    com.ss.android.ugc.aweme.commercialize.g.a(activity, a2, "", str2, str4, str5);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/CUserResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class e<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36683b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36684c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f36685d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f36686e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Activity f36687f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;
        final /* synthetic */ String i;
        final /* synthetic */ long j;

        e(String str, String str2, String str3, String str4, Activity activity, String str5, String str6, String str7, long j2) {
            this.f36683b = str;
            this.f36684c = str2;
            this.f36685d = str3;
            this.f36686e = str4;
            this.f36687f = activity;
            this.g = str5;
            this.h = str6;
            this.i = str7;
            this.j = j2;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f36682a, false, 27881, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f36682a, false, 27881, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                if (!iVar.d() && iVar.e() != null && ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).statusCode == 0) {
                    final User user = ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).f37321a;
                    if (n.r.a(this.f36683b)) {
                        com.ss.android.ugc.aweme.commerce.promotion.a.f37668b.a(this.f36683b, this.f36684c, new Function1<List<? extends h>, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ e this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((List) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull List<h> list) {
                                List<h> list2 = list;
                                if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 27882, new Class[]{List.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 27882, new Class[]{List.class}, Void.TYPE);
                                    return;
                                }
                                Intrinsics.checkParameterIsNotNull(list2, "detailPromotions");
                                h a2 = a.a(this.this$0.f36685d, this.this$0.f36686e, list2);
                                if (a2 == null) {
                                    com.bytedance.ies.dmt.ui.d.a.b(this.this$0.f36687f.getApplicationContext(), (int) C0906R.string.yr).a();
                                    return;
                                }
                                h.a aVar = com.ss.android.ugc.aweme.commerce.preview.h.f37502d;
                                n.a aVar2 = n.r;
                                Context context = this.this$0.f36687f;
                                CommerceUser a3 = com.ss.android.ugc.aweme.commerce.service.l.d.a(user);
                                Intrinsics.checkExpressionValueIsNotNull(a3, "CommerceUtils.toCommerceUser(userInfo)");
                                String str = this.this$0.f36683b;
                                if (str == null) {
                                    Intrinsics.throwNpe();
                                }
                                String promotionId = a2.getPromotionId();
                                if (promotionId == null) {
                                    Intrinsics.throwNpe();
                                }
                                String originUserId = a2.getOriginUserId();
                                String originMediaId = a2.getOriginMediaId();
                                String detailUrl = a2.getDetailUrl();
                                String str2 = this.this$0.g;
                                if (str2 == null) {
                                    str2 = f.f34168b;
                                }
                                String str3 = str2;
                                String str4 = this.this$0.h;
                                if (str4 == null) {
                                    str4 = "click_open_url";
                                }
                                aVar.a(n.a.a(aVar2, context, a3, str, promotionId, originUserId, originMediaId, detailUrl, str3, str4, this.this$0.i, null, f.f34168b, null, this.this$0.j, a2.getPromotionSource(), null, null, null, null, 364544));
                            }
                        }, new Function1<JSONObject, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ e this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((JSONObject) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable JSONObject jSONObject) {
                                if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 27883, new Class[]{JSONObject.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 27883, new Class[]{JSONObject.class}, Void.TYPE);
                                    return;
                                }
                                com.bytedance.ies.dmt.ui.d.a.b(this.this$0.f36687f.getApplicationContext(), (int) C0906R.string.yr).a();
                            }
                        });
                    } else if (!(this.f36685d == null || this.f36686e == null)) {
                        com.ss.android.ugc.aweme.commerce.promotion.a.f37668b.a(this.f36685d, this.f36686e, this.f36684c, new Function1<com.ss.android.ugc.aweme.commerce.service.models.h, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ e this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((com.ss.android.ugc.aweme.commerce.service.models.h) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull com.ss.android.ugc.aweme.commerce.service.models.h hVar) {
                                com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = hVar;
                                if (PatchProxy.isSupport(new Object[]{hVar2}, this, changeQuickRedirect, false, 27884, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{hVar2}, this, changeQuickRedirect, false, 27884, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class}, Void.TYPE);
                                    return;
                                }
                                Intrinsics.checkParameterIsNotNull(hVar2, "detailPromotion");
                                h.a aVar = com.ss.android.ugc.aweme.commerce.preview.h.f37502d;
                                n.a aVar2 = n.r;
                                Context context = this.this$0.f36687f;
                                CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(user);
                                String str = this.this$0.f36685d;
                                String str2 = this.this$0.f36686e;
                                String detailUrl = hVar.getDetailUrl();
                                String str3 = this.this$0.g;
                                if (str3 == null) {
                                    str3 = f.f34168b;
                                }
                                String str4 = str3;
                                String str5 = this.this$0.h;
                                if (str5 == null) {
                                    str5 = "click_open_url";
                                }
                                aVar.a(n.a.a(aVar2, context, a2, str, str2, detailUrl, str4, str5, this.this$0.i, null, f.f34168b, null, null, this.this$0.j, hVar.getPromotionSource(), null, null, null, null, 216064));
                            }
                        }, new Function1<JSONObject, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ e this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((JSONObject) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull JSONObject jSONObject) {
                                JSONObject jSONObject2 = jSONObject;
                                if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 27885, new Class[]{JSONObject.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 27885, new Class[]{JSONObject.class}, Void.TYPE);
                                    return;
                                }
                                Intrinsics.checkParameterIsNotNull(jSONObject2, AdvanceSetting.NETWORK_TYPE);
                                com.bytedance.ies.dmt.ui.d.a.b(this.this$0.f36687f.getApplicationContext(), (int) C0906R.string.yr).a();
                            }
                        });
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    private a() {
    }

    public final void a(@Nullable String str, @NotNull Activity activity, @Nullable Map<String, String> map) {
        String str2 = str;
        Activity activity2 = activity;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, activity2, map2}, this, f36660a, false, 27857, new Class[]{String.class, Activity.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, activity2, map2}, this, f36660a, false, 27857, new Class[]{String.class, Activity.class, Map.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        Context context = activity2;
        if (a(this, str2, (String) null, context, 2) && str2 != null) {
            if (StringsKt.startsWith$default(str2, "http", false, 2, null)) {
                a(str, activity, (String) null, false, false, 28);
                return;
            }
            if (!StringsKt.startsWith$default(str2, "aweme://webview/", false, 2, null)) {
                com.ss.android.ugc.aweme.ag.h.a().a(str2);
            } else if (Uri.parse(str).getQueryParameter("rn_schema") == null || map2 == null) {
                com.ss.android.ugc.aweme.ag.h.a().a(str2);
            } else {
                a(str2, map2, context);
            }
        }
    }

    public final void a(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str3}, this, f36660a, false, 27858, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f36660a, false, 27858, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (a(str4, str5, context2) && !com.ss.android.ugc.aweme.commercialize.utils.g.a(context2, str5, false)) {
            a(str, (Activity) context2, str3, false, TextUtils.isEmpty(str3), 8);
        }
    }

    @JvmStatic
    private static void a(@Nullable String str, @NotNull Activity activity, @Nullable String str2, boolean z, boolean z2) {
        String str3 = str;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{str3, activity2, str2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f36660a, true, 27859, new Class[]{String.class, Activity.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {str3, activity2, str2, Byte.valueOf(z), Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f36660a, true, 27859, new Class[]{String.class, Activity.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        if (a(f36661b, str3, (String) null, (Context) activity2, 2)) {
            a(str, (Fragment) null, activity, str2, z, z2, -1, (a.C0516a) null);
        }
    }

    @JvmStatic
    @SuppressLint({"TooManyMethodParam"})
    public static final void a(@Nullable String str, @Nullable Fragment fragment, @Nullable Activity activity, @Nullable String str2, boolean z, boolean z2, int i, @Nullable a.C0516a aVar) {
        String str3 = str;
        Fragment fragment2 = fragment;
        Activity activity2 = activity;
        String str4 = str2;
        int i2 = i;
        a.C0516a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, fragment2, activity2, str4, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i), aVar2}, null, f36660a, true, 27860, new Class[]{String.class, Fragment.class, Activity.class, String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, a.C0516a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, fragment2, activity2, str4, Byte.valueOf(z), Byte.valueOf(z2), Integer.valueOf(i), aVar2}, null, f36660a, true, 27860, new Class[]{String.class, Fragment.class, Activity.class, String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, a.C0516a.class}, Void.TYPE);
            return;
        }
        if (a(f36661b, str3, (String) null, activity2 != null ? activity2 : fragment2 != null ? fragment.getContext() : null, 2)) {
            Intent intent = new Intent(activity2, CrossPlatformActivity.class);
            if (!TextUtils.isEmpty(str4)) {
                intent.putExtra(PushConstants.TITLE, str4);
            }
            intent.putExtra("hide_nav_bar", z);
            intent.putExtra("bundle_user_webview_title", z2);
            if (aVar2 != null) {
                if (!TextUtils.isEmpty(aVar2.f39633c)) {
                    intent.putExtra("bundle_download_app_log_extra", aVar2.f39633c);
                }
                Long l = aVar2.f39632b;
                if (l == null || l.longValue() != 0) {
                    intent.putExtra("ad_id", aVar2.f39632b);
                }
                if (!TextUtils.isEmpty(aVar2.f39634d)) {
                    intent.putExtra("bundle_download_url", aVar2.f39634d);
                }
            }
            intent.setData(Uri.parse(com.ss.android.ugc.aweme.commerce.service.l.n.f38045b.a(str3)));
            if (fragment2 != null) {
                fragment2.startActivityForResult(intent, i2);
                return;
            }
            if (activity2 != null) {
                activity2.startActivityForResult(intent, i2);
            }
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void a(@Nullable String str, @NotNull Map<String, String> map, @Nullable Context context) {
        String str2 = str;
        Map<String, String> map2 = map;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, map2, context2}, null, f36660a, true, 27861, new Class[]{String.class, Map.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2, context2}, null, f36660a, true, 27861, new Class[]{String.class, Map.class, Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(map2, "options");
        if (a(f36661b, (String) null, str2, context2, 1)) {
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            f.a a2 = com.ss.android.ugc.aweme.music.util.f.a(str);
            for (Map.Entry next : map.entrySet()) {
                String str3 = (String) next.getKey();
                String str4 = (String) next.getValue();
                if (!TextUtils.isEmpty(str4)) {
                    a2.a(str3, str4);
                }
            }
            com.ss.android.ugc.aweme.ag.h.a().a(a2.a().toString());
        }
    }

    private final boolean a(String str, String str2, Context context) {
        Context context2 = context;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str, str2, context2}, this, f36660a, false, 27863, new Class[]{String.class, String.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2, context2}, this, f36660a, false, 27863, new Class[]{String.class, String.class, Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            if (context2 != null) {
                UIUtils.displayToast(context2, (int) C0906R.string.bgf);
            }
            z = false;
        }
        return z;
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @NotNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f36660a, true, 27870, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f36660a, true, 27870, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, "enterFrom");
        Intent intent = new Intent(context2, CrossPlatformActivity.class);
        intent.setData(Uri.parse("https://aweme.snssdk.com/falcon/rn/eshop_access?hide_nav_bar=1&log_entry=" + str2));
        context2.startActivity(intent);
    }

    @JvmStatic
    @Nullable
    public static final com.ss.android.ugc.aweme.commerce.service.models.h a(@Nullable String str, @Nullable String str2, @NotNull List<com.ss.android.ugc.aweme.commerce.service.models.h> list) {
        List<com.ss.android.ugc.aweme.commerce.service.models.h> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str, str2, list2}, null, f36660a, true, 27872, new Class[]{String.class, String.class, List.class}, com.ss.android.ugc.aweme.commerce.service.models.h.class)) {
            return (com.ss.android.ugc.aweme.commerce.service.models.h) PatchProxy.accessDispatch(new Object[]{str, str2, list2}, null, f36660a, true, 27872, new Class[]{String.class, String.class, List.class}, com.ss.android.ugc.aweme.commerce.service.models.h.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "detailPromotions");
        if (list.isEmpty()) {
            return null;
        }
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence charSequence2 = str2;
            if (!TextUtils.isEmpty(charSequence2)) {
                for (com.ss.android.ugc.aweme.commerce.service.models.h next : list) {
                    if (TextUtils.equals(next.getPromotionId(), charSequence) && TextUtils.equals(next.getProductId(), charSequence2)) {
                        return next;
                    }
                }
                return null;
            }
        }
        return list2.get(0);
    }

    private static /* synthetic */ boolean a(a aVar, String str, String str2, Context context, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            context = null;
        }
        return aVar.a(str, str2, context);
    }

    public static /* synthetic */ void a(String str, Activity activity, String str2, boolean z, boolean z2, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        a(str, activity, str2, false, z2);
    }

    @JvmStatic
    public static final void a(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Activity activity2 = activity;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{activity2, str6, str7, str8, str9, str10}, null, f36660a, true, 27871, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str6, str7, str8, str9, str10};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f36660a, true, 27871, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        if (str6 != null) {
            if (!TextUtils.isEmpty(str7)) {
                dr.a().a(str6, str7);
            }
            com.ss.android.ugc.aweme.commerce.portfolio.api.a.a(str).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(activity2, str8, str9, str10));
        }
    }

    @JvmStatic
    @SuppressLint({"TooManyMethodParam"})
    public static final void a(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Activity activity2 = activity;
        String str8 = str3;
        String str9 = str4;
        if (PatchProxy.isSupport(new Object[]{activity2, str, str2, str8, str9, str5, str6, str7}, null, f36660a, true, 27867, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str, str2, str8, str9, str5, str6, str7}, null, f36660a, true, 27867, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        if (str8 != null) {
            if (!TextUtils.isEmpty(str9)) {
                dr.a().a(str8, str9);
            }
            i a2 = com.ss.android.ugc.aweme.commerce.preview.api.a.a(str3);
            c cVar = new c(str5, str3, str, str2, activity, str6, str7);
            a2.a((g<TResult, TContinuationResult>) cVar);
        }
    }

    @JvmStatic
    @SuppressLint({"TooManyMethodParam"})
    public static final void a(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Activity activity2 = activity;
        String str9 = str3;
        String str10 = str4;
        if (PatchProxy.isSupport(new Object[]{activity2, str, str2, str9, str10, str5, str6, str7, str8}, null, f36660a, true, 27866, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str, str2, str9, str10, str5, str6, str7, str8}, null, f36660a, true, 27866, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        if (str9 != null) {
            if (!TextUtils.isEmpty(str10)) {
                dr.a().a(str9, str10);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            i a2 = com.ss.android.ugc.aweme.commerce.preview.api.a.a(str3);
            e eVar = new e(str5, str3, str, str2, activity, str6, str7, str8, uptimeMillis);
            a2.a((g<TResult, TContinuationResult>) eVar);
        }
    }
}

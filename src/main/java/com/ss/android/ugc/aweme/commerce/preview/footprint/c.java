package com.ss.android.ugc.aweme.commerce.preview.footprint;

import a.g;
import a.i;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.preview.api.a.f;
import com.ss.android.ugc.aweme.commerce.preview.footprint.b;
import com.ss.android.ugc.aweme.commerce.service.l.c;
import com.ss.android.ugc.aweme.commerce.service.l.d;
import com.ss.android.ugc.aweme.commerce.service.logs.al;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015J6\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootprintManager;", "", "()V", "isHaveFootprint", "", "()Ljava/lang/Boolean;", "setHaveFootprint", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isNeedShowHideAnimation", "()Z", "setNeedShowHideAnimation", "(Z)V", "getRatio", "", "headerDp", "", "aimDp", "initFootprintRefresh", "", "context", "Landroid/content/Context;", "ptrFrame", "Lcom/ss/android/ugc/aweme/commerce/preview/refresh/PtrFrameLayout;", "handler", "Lcom/ss/android/ugc/aweme/commerce/preview/refresh/PtrDefaultHandler;", "shouldShowFootprint", "showDialog", "Landroid/support/v4/app/FragmentActivity;", "promotionId", "", "authorId", "awemeId", "referFrom", "dialogStartTime", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37474a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Boolean f37475b = Boolean.FALSE;

    /* renamed from: c  reason: collision with root package name */
    public boolean f37476c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/footprint/FootprintManager$showDialog$footPrintDepend$1", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$FootPrintDepend;", "loadData", "", "callBack", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$DataCallBack;", "onFootprintShow", "getDataSuccess", "", "onItemShow", "productItem", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItem;", "openPreviewPage", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements b.C0475b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37477a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37478b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37479c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37480d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FragmentActivity f37481e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f37482f;
        final /* synthetic */ long g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/UserTraceResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commerce.preview.footprint.c$a$a  reason: collision with other inner class name */
        static final class C0478a<TTaskResult, TContinuationResult> implements g<f, Void> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37483a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f37484b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b.a f37485c;

            C0478a(a aVar, b.a aVar2) {
                this.f37484b = aVar;
                this.f37485c = aVar2;
            }

            public final /* synthetic */ Object then(i iVar) {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f37483a, false, 28935, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37483a, false, 28935, new Class[]{i.class}, Void.class);
                }
                Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                if (iVar.d() || ((f) iVar.e()).statusCode != 0) {
                    b.a aVar = this.f37485c;
                    String string = this.f37484b.f37481e.getResources().getString(C0906R.string.y2);
                    Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…commerce_footprint_error)");
                    aVar.a(string);
                } else {
                    List arrayList = new ArrayList();
                    List<f> list = ((f) iVar.e()).f37346a;
                    if (list == null) {
                        Intrinsics.throwNpe();
                    }
                    for (f next : list) {
                        UrlModel image = next.getImage();
                        if (image != null) {
                            String title = next.getTitle();
                            String a2 = d.a(next.getPrice());
                            Intrinsics.checkExpressionValueIsNotNull(a2, "CommerceUtils.getPrice(promotion.price)");
                            e eVar = new e(title, a2, image);
                            arrayList.add(eVar);
                            eVar.f37493b = next.getPromotionId();
                            eVar.f37494c = next.getGid();
                            eVar.f37496e = next.getTraceAuthorId();
                            eVar.f37495d = next.getTraceAwemeId();
                            eVar.f37497f = next.getCommodityType();
                        }
                    }
                    this.f37485c.a(CollectionsKt.toList(arrayList));
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/CUserResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
        static final class b<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37486a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f37487b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f37488c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f37489d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f37490e;

            b(a aVar, e eVar, String str, long j) {
                this.f37487b = aVar;
                this.f37488c = eVar;
                this.f37489d = str;
                this.f37490e = j;
            }

            public final /* synthetic */ Object then(i iVar) {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f37486a, false, 28936, new Class[]{i.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar}, this, f37486a, false, 28936, new Class[]{i.class}, Void.TYPE);
                } else {
                    Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                    if (!iVar.d() && iVar.e() != null && ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).statusCode == 0) {
                        final User user = ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).f37321a;
                        final String str = this.f37488c.f37494c;
                        final String str2 = this.f37488c.f37493b;
                        if (!(str2 == null || str == null)) {
                            com.ss.android.ugc.aweme.commerce.promotion.a.f37668b.a(str2, str, this.f37489d, new Function1<h, Unit>(this) {
                                public static ChangeQuickRedirect changeQuickRedirect;
                                final /* synthetic */ b this$0;

                                {
                                    this.this$0 = r1;
                                }

                                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((h) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull h hVar) {
                                    h hVar2 = hVar;
                                    if (PatchProxy.isSupport(new Object[]{hVar2}, this, changeQuickRedirect, false, 28937, new Class[]{h.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{hVar2}, this, changeQuickRedirect, false, 28937, new Class[]{h.class}, Void.TYPE);
                                        return;
                                    }
                                    Intrinsics.checkParameterIsNotNull(hVar2, "detailPromotion");
                                    com.ss.android.ugc.aweme.commerce.preview.h.f37502d.a(n.a.a(n.r, this.this$0.f37487b.f37481e, d.a(user), str2, str, hVar.getDetailUrl(), this.this$0.f37487b.f37482f, "click_track_card", null, null, "track_card", null, null, this.this$0.f37490e, hVar.getPromotionSource(), null, null, null, null, 248832));
                                }
                            }, AnonymousClass2.INSTANCE);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final void a(@NotNull e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f37477a, false, 28932, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f37477a, false, 28932, new Class[]{e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar, "productItem");
            String str = eVar.f37496e;
            if (str != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                i<com.ss.android.ugc.aweme.commerce.preview.api.a.a> a2 = com.ss.android.ugc.aweme.commerce.preview.api.a.a(str);
                b bVar = new b(this, eVar, str, uptimeMillis);
                a2.a((g<TResult, TContinuationResult>) bVar);
            }
        }

        public final void b(@NotNull e eVar) {
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f37477a, false, 28933, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f37477a, false, 28933, new Class[]{e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar2, "productItem");
            new al().c(eVar2.f37493b).a(Integer.valueOf(eVar2.f37497f)).b("track_card").a(this.f37482f).b();
        }

        public final void a(@NotNull b.a aVar) {
            i<f> iVar;
            b.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f37477a, false, 28931, new Class[]{b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f37477a, false, 28931, new Class[]{b.a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aVar2, "callBack");
            com.ss.android.ugc.aweme.commerce.preview.api.a aVar3 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c;
            String str = this.f37478b;
            String str2 = this.f37479c;
            String str3 = this.f37480d;
            if (PatchProxy.isSupport(new Object[]{str, str2, str3}, aVar3, com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a, false, 28863, new Class[]{String.class, String.class, String.class}, i.class)) {
                com.ss.android.ugc.aweme.commerce.preview.api.a aVar4 = aVar3;
                iVar = (i) PatchProxy.accessDispatch(new Object[]{str, str2, str3}, aVar4, com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a, false, 28863, new Class[]{String.class, String.class, String.class}, i.class);
            } else {
                Intrinsics.checkParameterIsNotNull(str, "promotionId");
                Intrinsics.checkParameterIsNotNull(str2, "authorId");
                Intrinsics.checkParameterIsNotNull(str3, "awemeId");
                iVar = com.ss.android.ugc.aweme.commerce.preview.api.a.f37315b.getUserTrace(str, str2, dr.a().a(str2), str3);
            }
            iVar.a((g<TResult, TContinuationResult>) new C0478a<TResult,TContinuationResult>(this, aVar2), i.f1052b);
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37477a, false, 28934, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37477a, false, 28934, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            c.a aVar = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a;
            long uptimeMillis = SystemClock.uptimeMillis() - this.g;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z), new Long(uptimeMillis), null, null}, aVar, c.a.f37990a, false, 29969, new Class[]{Boolean.TYPE, Long.TYPE, Integer.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(uptimeMillis), null, null}, aVar, c.a.f37990a, false, 29969, new Class[]{Boolean.TYPE, Long.TYPE, Integer.class, String.class}, Void.TYPE);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (!z) {
                jSONObject.put("errorDesc", null);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duration", uptimeMillis);
            com.ss.android.ugc.aweme.base.n.a("aweme_commerce_seeding_footer_display_time", z ^ true ? 1 : 0, jSONObject2, jSONObject);
        }

        public a(String str, String str2, String str3, FragmentActivity fragmentActivity, String str4, long j) {
            this.f37478b = str;
            this.f37479c = str2;
            this.f37480d = str3;
            this.f37481e = fragmentActivity;
            this.f37482f = str4;
            this.g = j;
        }
    }
}

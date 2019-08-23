package com.ss.android.ugc.aweme.commerce.preview;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commerce.service.l.j;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.poi.widget.c;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 92\u00020\u0001:\u00019B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010&\u001a\u0004\u0018\u00010\u001fJ\b\u0010'\u001a\u00020$H\u0002J\u000e\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u001aJ\b\u0010*\u001a\u00020$H\u0002J\u000e\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u0011J\u0016\u0010-\u001a\u00020$2\u000e\u0010.\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0J\u0010\u00101\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u00010\u0003J\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020$H\u0002J\u000e\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u0018J\b\u00107\u001a\u00020$H\u0002J\b\u00108\u001a\u00020$H\u0002R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0012R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006:"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewCollectPresenter;", "", "awemeId", "", "good", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "authorId", "originFeedAwemeId", "startPreviewTime", "", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;Ljava/lang/String;Ljava/lang/String;J)V", "getAuthorId", "()Ljava/lang/String;", "getAwemeId", "getGood", "()Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "isCollectionType", "", "()Z", "isCollectionType$delegate", "Lkotlin/Lazy;", "mActivity", "Lcom/bytedance/ies/uikit/base/AbsActivity;", "mAdd2WillDialogListener", "Lcom/ss/android/ugc/aweme/commerce/service/ICommerceService$Add2WillDialogListener;", "mAnchorView", "Landroid/view/View;", "mCollectSuccessPop", "Lcom/ss/android/ugc/aweme/poi/widget/BubblePopupWindow;", "mHasCollected", "mIvCollect", "Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;", "getOriginFeedAwemeId", "getStartPreviewTime", "()J", "bindView", "", "activity", "view", "dismissCollectPop", "handleCollect", "anchorView", "handleCollectPreview", "init", "isCollected", "onCollectFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onCollectSuccess", "picUrl", "resetCollectStatus", "sendFavouriteEvent", "setAdd2WillDialogListener", "add2WillDialogListener", "showPoiCollectSuccessPop", "updateCollectUI", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37383a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f37384b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(f.class), "isCollectionType", "isCollectionType()Z"))};
    public static final a n = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public AbsActivity f37385c;

    /* renamed from: d  reason: collision with root package name */
    CheckableImageView f37386d;

    /* renamed from: e  reason: collision with root package name */
    boolean f37387e;

    /* renamed from: f  reason: collision with root package name */
    public View f37388f;
    public com.ss.android.ugc.aweme.poi.widget.c g;
    ICommerceService.a h;
    @Nullable
    public final String i;
    @NotNull
    public final h j;
    @NotNull
    public final String k;
    @Nullable
    public final String l;
    public final long m;
    private final Lazy o = LazyKt.lazy(e.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewCollectPresenter$Companion;", "", "()V", "COLLECT", "", "UN_COLLECT", "VALUE_195", "", "VALUE_5000", "", "VALUE_687", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewCollectPresenter$bindView$1", "Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView$OnStateChangeListener;", "onAnimationEnd", "", "onStateChange", "state", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements CheckableImageView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f37390b;

        public final void a() {
        }

        b(f fVar) {
            this.f37390b = fVar;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37389a, false, 28764, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37389a, false, 28764, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 1) {
                this.f37390b.d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onResultOK"}, k = 3, mv = {1, 1, 15})
    static final class c implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f37392b;

        c(f fVar) {
            this.f37392b = fVar;
        }

        public final void a(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f37391a, false, 28766, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f37391a, false, 28766, new Class[]{Bundle.class}, Void.TYPE);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37391a, false, 28765, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37391a, false, 28765, new Class[0], Void.TYPE);
                return;
            }
            this.f37392b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewWillListResponse;", "kotlin.jvm.PlatformType", "then", "com/ss/android/ugc/aweme/commerce/preview/PreviewCollectPresenter$handleCollectPreview$1$1"}, k = 3, mv = {1, 1, 15})
    static final class d<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.preview.api.a.e, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f37394b;

        d(f fVar) {
            this.f37394b = fVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            String str;
            String str2;
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f37393a, false, 28767, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f37393a, false, 28767, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            if (iVar.d() || ((com.ss.android.ugc.aweme.commerce.preview.api.a.e) iVar.e()).statusCode != 0) {
                f fVar = this.f37394b;
                Exception f2 = iVar.f();
                if (PatchProxy.isSupport(new Object[]{f2}, fVar, f.f37383a, false, 28760, new Class[]{Exception.class}, Void.TYPE)) {
                    f fVar2 = fVar;
                    ChangeQuickRedirect changeQuickRedirect = f.f37383a;
                    PatchProxy.accessDispatch(new Object[]{f2}, fVar2, changeQuickRedirect, false, 28760, new Class[]{Exception.class}, Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) f2);
                    fVar.c();
                    fVar.d();
                    com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                    Activity a2 = b2.a();
                    if (a2 != null) {
                        boolean a3 = fVar.a();
                        int i = C0906R.string.xb;
                        if (a3) {
                            if (fVar.f37387e) {
                                i = C0906R.string.wy;
                            }
                            str = a2.getString(i, new Object[]{a2.getString(C0906R.string.xe)});
                        } else {
                            if (fVar.f37387e) {
                                i = C0906R.string.wy;
                            }
                            str = a2.getString(i, new Object[]{a2.getString(C0906R.string.a03)});
                        }
                        com.bytedance.ies.dmt.ui.d.a.a((Context) a2, str).a();
                    }
                }
            } else {
                f fVar3 = this.f37394b;
                String str3 = ((com.ss.android.ugc.aweme.commerce.preview.api.a.e) iVar.e()).f37345a;
                if (PatchProxy.isSupport(new Object[]{str3}, fVar3, f.f37383a, false, 28759, new Class[]{String.class}, Void.TYPE)) {
                    f fVar4 = fVar3;
                    PatchProxy.accessDispatch(new Object[]{str3}, fVar4, f.f37383a, false, 28759, new Class[]{String.class}, Void.TYPE);
                } else {
                    j.f38035f = true;
                    if (fVar3.f37387e) {
                        if (PatchProxy.isSupport(new Object[0], fVar3, f.f37383a, false, 28761, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], fVar3, f.f37383a, false, 28761, new Class[0], Void.TYPE);
                        } else {
                            View view = fVar3.f37388f;
                            if (view == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mAnchorView");
                            }
                            view.post(new C0474f(fVar3));
                        }
                    } else {
                        if (PatchProxy.isSupport(new Object[0], fVar3, f.f37383a, false, 28762, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], fVar3, f.f37383a, false, 28762, new Class[0], Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.poi.widget.c cVar = fVar3.g;
                            if (cVar != null && cVar.isShowing()) {
                                cVar.dismiss();
                            }
                        }
                        com.ss.android.ugc.aweme.framework.core.a b3 = com.ss.android.ugc.aweme.framework.core.a.b();
                        Intrinsics.checkExpressionValueIsNotNull(b3, "AppTracker.get()");
                        Activity a4 = b3.a();
                        if (a4 != null) {
                            if (fVar3.a()) {
                                str2 = a4.getString(C0906R.string.wz, new Object[]{a4.getString(C0906R.string.xe)});
                            } else {
                                str2 = a4.getString(C0906R.string.wz, new Object[]{a4.getString(C0906R.string.a03)});
                            }
                            com.bytedance.ies.dmt.ui.d.a.a((Context) a4, str2).a();
                        }
                    }
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<Boolean> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(0);
        }

        public final boolean invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28768, new Class[0], Boolean.TYPE)) {
                return AbTestManager.a().aV();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28768, new Class[0], Boolean.TYPE)).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.f$f  reason: collision with other inner class name */
    static final class C0474f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f37396b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "clickBubble", "com/ss/android/ugc/aweme/commerce/preview/PreviewCollectPresenter$showPoiCollectSuccessPop$1$3$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commerce.preview.f$f$a */
        static final class a implements c.a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37397a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.poi.widget.c f37398b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C0474f f37399c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ View f37400d;

            a(com.ss.android.ugc.aweme.poi.widget.c cVar, C0474f fVar, View view) {
                this.f37398b = cVar;
                this.f37399c = fVar;
                this.f37400d = view;
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f37397a, false, 28770, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37397a, false, 28770, new Class[0], Void.TYPE);
                    return;
                }
                this.f37398b.dismiss();
                if (this.f37399c.f37396b.a()) {
                    com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                    Activity a2 = b2.a();
                    if (a2 != null) {
                        Intent intent = new Intent(a2, UserFavoritesActivity.class);
                        intent.putExtra("index", PushConstants.PUSH_TYPE_UPLOAD_LOG);
                        intent.putExtra("enter_from", "product_detail");
                        intent.putExtra("enter_method", "click_favorite_hint");
                        intent.putExtra("tab_name", "goods");
                        a2.startActivity(intent);
                    }
                    return;
                }
                SharePrefCache inst = SharePrefCache.inst();
                Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
                an<String> shopWishListUrl = inst.getShopWishListUrl();
                Intrinsics.checkExpressionValueIsNotNull(shopWishListUrl, "SharePrefCache.inst().shopWishListUrl");
                com.ss.android.ugc.aweme.commerce.a.a((String) shopWishListUrl.c(), (Map<String, String>) new HashMap<String,String>(), (Context) null);
            }
        }

        C0474f(f fVar) {
            this.f37396b = fVar;
        }

        public final /* synthetic */ void run() {
            String str;
            CharSequence charSequence;
            if (PatchProxy.isSupport(new Object[0], this, f37395a, false, 28769, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37395a, false, 28769, new Class[0], Void.TYPE);
                return;
            }
            if (this.f37396b.f37385c != null) {
                AbsActivity absActivity = this.f37396b.f37385c;
                if (absActivity == null) {
                    Intrinsics.throwNpe();
                }
                if (absActivity.isViewValid()) {
                    com.ss.android.ugc.aweme.poi.widget.c cVar = this.f37396b.g;
                    if (cVar == null || !cVar.isShowing()) {
                        this.f37396b.g = new com.ss.android.ugc.aweme.poi.widget.c(this.f37396b.f37385c);
                        AbsActivity absActivity2 = this.f37396b.f37385c;
                        if (absActivity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        Object systemService = absActivity2.getApplicationContext().getSystemService("layout_inflater");
                        if (systemService != null) {
                            View inflate = ((LayoutInflater) systemService).inflate(C0906R.layout.a2s, null);
                            if (this.f37396b.a()) {
                                AbsActivity absActivity3 = this.f37396b.f37385c;
                                if (absActivity3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                str = absActivity3.getString(C0906R.string.xf);
                            } else {
                                AbsActivity absActivity4 = this.f37396b.f37385c;
                                if (absActivity4 == null) {
                                    Intrinsics.throwNpe();
                                }
                                str = absActivity4.getString(C0906R.string.a04);
                            }
                            AbsActivity absActivity5 = this.f37396b.f37385c;
                            if (absActivity5 == null) {
                                Intrinsics.throwNpe();
                            }
                            String string = absActivity5.getString(C0906R.string.xc);
                            Intrinsics.checkExpressionValueIsNotNull(string, "mActivity!!.getString(R.…commerce_collect_success)");
                            String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                            CharSequence charSequence2 = format;
                            Intrinsics.checkExpressionValueIsNotNull(str, "textSpan");
                            int indexOf$default = StringsKt.indexOf$default(charSequence2, str, 0, false, 6, (Object) null);
                            int length = str.length() + indexOf$default;
                            SpannableString spannableString = new SpannableString(charSequence2);
                            AbsActivity absActivity6 = this.f37396b.f37385c;
                            if (absActivity6 == null) {
                                Intrinsics.throwNpe();
                            }
                            g.a(spannableString, new ForegroundColorSpan(absActivity6.getResources().getColor(C0906R.color.a1s)), indexOf$default, length, 18);
                            View findViewById = inflate.findViewById(C0906R.id.d06);
                            if (findViewById != null) {
                                ((DmtTextView) findViewById).setText(spannableString);
                                com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                                Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                                Activity a2 = b2.a();
                                if (a2 != null) {
                                    View findViewById2 = inflate.findViewById(C0906R.id.d05);
                                    if (findViewById2 != null) {
                                        DmtTextView dmtTextView = (DmtTextView) findViewById2;
                                        if (this.f37396b.a()) {
                                            charSequence = a2.getString(C0906R.string.xd, new Object[]{a2.getString(C0906R.string.xe)});
                                        } else {
                                            charSequence = a2.getString(C0906R.string.xd, new Object[]{a2.getString(C0906R.string.a03)});
                                        }
                                        dmtTextView.setText(charSequence);
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
                                    }
                                }
                                com.ss.android.ugc.aweme.poi.widget.c cVar2 = this.f37396b.g;
                                if (cVar2 != null) {
                                    cVar2.a(inflate);
                                    cVar2.a((int) UIUtils.dip2Px(this.f37396b.f37385c, 195.0f), (int) UIUtils.dip2Px(this.f37396b.f37385c, 68.7f));
                                    cVar2.o = 5000;
                                    cVar2.u = new a(cVar2, this, inflate);
                                    View view = this.f37396b.f37388f;
                                    if (view == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mAnchorView");
                                    }
                                    cVar2.a(view, 48);
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
                        }
                    }
                }
            }
        }
    }

    public final boolean a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37383a, false, 28752, new Class[0], Boolean.TYPE)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37383a, false, 28752, new Class[0], Boolean.TYPE);
        } else {
            value = this.o.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f37387e = !this.f37387e;
    }

    public final void d() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f37383a, false, 28757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37383a, false, 28757, new Class[0], Void.TYPE);
            return;
        }
        CheckableImageView checkableImageView = this.f37386d;
        if (checkableImageView != null) {
            if (this.f37387e) {
                i2 = 2130838386;
            } else {
                i2 = 2130838387;
            }
            checkableImageView.setImageResource(i2);
        }
    }

    public final void b() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f37383a, false, 28756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37383a, false, 28756, new Class[0], Void.TYPE);
            return;
        }
        String str = this.i;
        if (str != null) {
            com.ss.android.ugc.aweme.commerce.preview.api.a aVar = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c;
            String promotionId = this.j.getPromotionId();
            if (promotionId == null) {
                Intrinsics.throwNpe();
            }
            String str2 = this.k;
            if (this.f37387e) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            aVar.a(str, promotionId, str2, i2).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(this), i.f1052b);
        }
        c();
        CheckableImageView checkableImageView = this.f37386d;
        if (checkableImageView != null) {
            checkableImageView.a(checkableImageView.getAlpha());
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37383a, false, 28754, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37383a, false, 28754, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f37387e = z;
        d();
    }

    public f(@Nullable String str, @NotNull h hVar, @NotNull String str2, @Nullable String str3, long j2) {
        Intrinsics.checkParameterIsNotNull(hVar, "good");
        Intrinsics.checkParameterIsNotNull(str2, "authorId");
        this.i = str;
        this.j = hVar;
        this.k = str2;
        this.l = str3;
        this.m = j2;
    }
}

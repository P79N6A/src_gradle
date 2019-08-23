package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelAdapter;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.view.SnapshotAnimView;
import com.ss.android.ugc.aweme.commerce.service.l.d;
import com.ss.android.ugc.aweme.commerce.service.logs.g;
import com.ss.android.ugc.aweme.commerce.service.logs.h;
import com.ss.android.ugc.aweme.commerce.service.logs.k;
import com.ss.android.ugc.aweme.commerce.service.logs.m;
import com.ss.android.ugc.aweme.commerce.service.logs.p;
import com.ss.android.ugc.aweme.commerce.service.logs.y;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010-\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010.\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010/\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010'2\u0006\u00100\u001a\u000201H\u0016J\u001a\u00102\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010'2\u0006\u00103\u001a\u00020\u000bH\u0016J\u0006\u00104\u001a\u00020\u001eJ\b\u00105\u001a\u0004\u0018\u00010\u0018J\u0010\u00106\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\"\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010=\u001a\u00020+2\b\u0010>\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010?\u001a\u00020+2\u0006\u00108\u001a\u00020\u001eH\u0016J\b\u0010@\u001a\u00020+H\u0002J \u0010A\u001a\u00020+2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010\u000bJ9\u0010E\u001a\u00020+2\u0006\u0010F\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010G\u001a\u0004\u0018\u00010\u001e2\b\u0010H\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010IJ\u000e\u0010J\u001a\u00020+2\u0006\u0010K\u001a\u000201J\u000e\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u000201R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00188BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/LiveSkuPanelController;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelAdapter$ISkuPanelItemHandler;", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelManager$ICartCountListener;", "fragment", "Landroid/support/v4/app/Fragment;", "context", "Landroid/content/Context;", "anchorInfo", "Lcom/ss/android/ugc/aweme/profile/model/User;", "enterFrom", "", "liveRoomDataInfo", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/ILiveRoomDataInfo;", "(Landroid/support/v4/app/Fragment;Landroid/content/Context;Lcom/ss/android/ugc/aweme/profile/model/User;Ljava/lang/String;Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/ILiveRoomDataInfo;)V", "getLiveRoomDataInfo", "()Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/ILiveRoomDataInfo;", "mCartCountView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMCartCountView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mCartCountView$delegate", "Lkotlin/Lazy;", "mCartImageView", "Landroid/view/View;", "mCartLayout", "getMCartLayout", "()Landroid/view/View;", "mCartLayout$delegate", "mCurrentPromotionIndex", "", "mPanelLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "mRootView", "Landroid/view/ViewGroup;", "mSkuAdapter", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelAdapter;", "mSkuListData", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "mSkuPanelRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "clickAddToCart", "", "mProduct", "clickBuy", "clickConsultation", "clickCouponButton", "buttonUnfold", "", "clickInProductCoupon", "coupon_id", "getCurrentItemPosition", "getRootView", "initRecyclerView", "onAddCartSuccess", "cartCount", "productImgLocation", "Landroid/graphics/Rect;", "snapshotBitmap", "Landroid/graphics/Bitmap;", "onClick", "view", "onReceiveCartCount", "renderWithData", "setSkuList", "skuList", "", "targetPromotionId", "startPreview", "product", "requestCode", "action", "(Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;Landroid/content/Context;Landroid/support/v4/app/Fragment;Ljava/lang/Integer;Ljava/lang/String;)V", "updateAppointmentStatus", "isAppointment", "updateVirtualProductData", "isOverLimit", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class b implements View.OnClickListener, SkuPanelAdapter.b, c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37843a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f37844b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "mCartLayout", "getMCartLayout()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "mCartCountView", "getMCartCountView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f37845c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView f37846d;

    /* renamed from: e  reason: collision with root package name */
    public View f37847e;

    /* renamed from: f  reason: collision with root package name */
    public SkuPanelAdapter f37848f;
    public List<ak> g = new ArrayList();
    public int h;
    public final String i;
    @Nullable
    public final com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.b j;
    private LinearLayoutManager k;
    private final Lazy l = LazyKt.lazy(new C0491b(this));
    private final Lazy m = LazyKt.lazy(new a(this));
    private Fragment n;
    private final User o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Nullable
        public final DmtTextView invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29323, new Class[0], DmtTextView.class)) {
                return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29323, new Class[0], DmtTextView.class);
            }
            ViewGroup viewGroup = this.this$0.f37845c;
            if (viewGroup != null) {
                return (DmtTextView) viewGroup.findViewById(C0906R.id.d0g);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b$b  reason: collision with other inner class name */
    static final class C0491b extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0491b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Nullable
        public final View invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29324, new Class[0], View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29324, new Class[0], View.class);
            }
            ViewGroup viewGroup = this.this$0.f37845c;
            if (viewGroup != null) {
                return viewGroup.findViewById(C0906R.id.b84);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37850b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f37851c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Rect f37852d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SnapshotAnimView f37853e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f37854f;
        final /* synthetic */ ViewGroup g;

        c(b bVar, int[] iArr, Rect rect, SnapshotAnimView snapshotAnimView, float f2, ViewGroup viewGroup) {
            this.f37850b = bVar;
            this.f37851c = iArr;
            this.f37852d = rect;
            this.f37853e = snapshotAnimView;
            this.f37854f = f2;
            this.g = viewGroup;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37849a, false, 29325, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37849a, false, 29325, new Class[0], Void.TYPE);
                return;
            }
            int i = this.f37851c[0] - this.f37852d.left;
            int width = this.f37852d.width();
            View view = this.f37850b.f37847e;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f37853e, "translationX", new float[]{(float) (i - ((width - view.getWidth()) / 2))});
            int i2 = this.f37851c[1] - this.f37852d.top;
            int height = this.f37852d.height();
            View view2 = this.f37850b.f37847e;
            if (view2 == null) {
                Intrinsics.throwNpe();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f37853e, "translationY", new float[]{(float) (i2 - ((height - view2.getHeight()) / 2))});
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f37855a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f37856b;

                {
                    this.f37856b = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ValueAnimator valueAnimator2 = valueAnimator;
                    if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f37855a, false, 29326, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f37855a, false, 29326, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "value");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        float floatValue = ((Float) animatedValue).floatValue();
                        SnapshotAnimView snapshotAnimView = this.f37856b.f37853e;
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue)}, snapshotAnimView, SnapshotAnimView.f37895a, false, 29478, new Class[]{Float.TYPE}, Void.TYPE)) {
                            SnapshotAnimView snapshotAnimView2 = snapshotAnimView;
                            PatchProxy.accessDispatch(new Object[]{Float.valueOf(floatValue)}, snapshotAnimView2, SnapshotAnimView.f37895a, false, 29478, new Class[]{Float.TYPE}, Void.TYPE);
                            return;
                        }
                        int width = snapshotAnimView.getWidth() / 2;
                        int i = width * width;
                        int sqrt = (int) Math.sqrt((double) (i + i));
                        snapshotAnimView.f37897c = ((float) sqrt) - (floatValue * ((float) (sqrt - width)));
                        snapshotAnimView.f37896b.reset();
                        snapshotAnimView.invalidate();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            });
            float width2 = this.f37854f / ((float) this.f37853e.getWidth());
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f37853e, "scaleX", new float[]{1.0f, width2});
            float height2 = this.f37854f / ((float) this.f37853e.getHeight());
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f37853e, "scaleY", new float[]{1.0f, height2});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat4, ofFloat5, ofFloat3});
            animatorSet.setDuration(470);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f37853e, "alpha", new float[]{1.0f, 0.0f});
            View view3 = this.f37850b.f37847e;
            if (view3 == null) {
                Intrinsics.throwNpe();
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view3, "scaleX", new float[]{1.0f, 1.2f, 1.0f});
            View view4 = this.f37850b.f37847e;
            if (view4 == null) {
                Intrinsics.throwNpe();
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view4, "scaleY", new float[]{1.0f, 1.2f, 1.0f});
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ofFloat6, ofFloat7, ofFloat8});
            animatorSet2.setDuration(250);
            animatorSet2.setStartDelay(370);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(new Animator[]{animatorSet, animatorSet2});
            animatorSet3.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f37857a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f37858b;

                {
                    this.f37858b = r1;
                }

                public final void onAnimationEnd(@Nullable Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f37857a, false, 29327, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f37857a, false, 29327, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    this.f37858b.g.removeView(this.f37858b.f37853e);
                }
            });
            animatorSet3.start();
        }
    }

    private final DmtTextView b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37843a, false, 29306, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37843a, false, 29306, new Class[0], DmtTextView.class);
        } else {
            value = this.m.getValue();
        }
        return (DmtTextView) value;
    }

    public final View a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37843a, false, 29305, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37843a, false, 29305, new Class[0], View.class);
        } else {
            value = this.l.getValue();
        }
        return (View) value;
    }

    public final void a(@Nullable ak akVar, boolean z) {
        ak akVar2 = akVar;
        if (PatchProxy.isSupport(new Object[]{akVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f37843a, false, 29318, new Class[]{ak.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{akVar2, Byte.valueOf(z)}, this, f37843a, false, 29318, new Class[]{ak.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(akVar2 == null || this.j == null)) {
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37755b;
            String c2 = this.j.c();
            String str = akVar2.f38190d;
            String a2 = this.j.a();
            long j2 = akVar2.j;
            String str2 = z ? "open" : "close";
            if (PatchProxy.isSupport(new Object[]{c2, str, a2, new Long(j2), "pop_up_card", str2}, aVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29275, new Class[]{String.class, String.class, String.class, Long.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{c2, str, a2, new Long(j2), "pop_up_card", str2}, aVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29275, new Class[]{String.class, String.class, String.class, Long.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, PushConstants.CLICK_TYPE);
            k d2 = new k().a(c2).b(str).c(a2).a(j2).d("pop_up_card");
            d2.f38138f = str2;
            d2.b();
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37843a, false, 29313, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37843a, false, 29313, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 > 0) {
            DmtTextView b2 = b();
            if (b2 != null) {
                b2.setVisibility(0);
                b2.setText(String.valueOf(i2));
            }
        } else {
            DmtTextView b3 = b();
            if (b3 != null) {
                b3.setVisibility(8);
                b3.setText(PushConstants.PUSH_TYPE_NOTIFY);
            }
        }
    }

    public final void a(@Nullable ak akVar) {
        ak akVar2 = akVar;
        if (PatchProxy.isSupport(new Object[]{akVar2}, this, f37843a, false, 29315, new Class[]{ak.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{akVar2}, this, f37843a, false, 29315, new Class[]{ak.class}, Void.TYPE);
            return;
        }
        if (!(akVar2 == null || this.j == null)) {
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37755b;
            String c2 = this.j.c();
            String str = akVar2.f38190d;
            String a2 = this.j.a();
            long j2 = akVar2.j;
            if (PatchProxy.isSupport(new Object[]{c2, str, a2, new Long(j2), "pop_up_card"}, aVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29271, new Class[]{String.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{c2, str, a2, new Long(j2), "pop_up_card"}, aVar2, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29271, new Class[]{String.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
                return;
            }
            y yVar = new y();
            yVar.f38166f = c2;
            yVar.h = str;
            yVar.g = a2;
            yVar.i = Long.valueOf(j2);
            yVar.j = "pop_up_card";
            yVar.b();
        }
    }

    public final void b(@Nullable ak akVar) {
        ak akVar2 = akVar;
        if (PatchProxy.isSupport(new Object[]{akVar2}, this, f37843a, false, 29316, new Class[]{ak.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{akVar2}, this, f37843a, false, 29316, new Class[]{ak.class}, Void.TYPE);
            return;
        }
        if (!(akVar2 == null || this.j == null)) {
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37755b;
            String c2 = this.j.c();
            String str = akVar2.f38190d;
            String a2 = this.j.a();
            long j2 = akVar2.j;
            Object[] objArr = {c2, null, str, a2, new Long(j2), "pop_up_card"};
            ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a;
            Class[] clsArr = {String.class, Long.class, String.class, String.class, Long.TYPE, String.class};
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, 29272, clsArr, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{c2, null, str, a2, new Long(j2), "pop_up_card"}, aVar2, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29272, new Class[]{String.class, Long.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
                return;
            }
            g a3 = new g().a(c2);
            a3.f38130f = null;
            a3.b(str).c(a2).a(j2).d("pop_up_card").b();
        }
    }

    public final void c(@Nullable ak akVar) {
        String str;
        String str2;
        ak akVar2 = akVar;
        if (PatchProxy.isSupport(new Object[]{akVar2}, this, f37843a, false, 29317, new Class[]{ak.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{akVar2}, this, f37843a, false, 29317, new Class[]{ak.class}, Void.TYPE);
            return;
        }
        if (!(akVar2 == null || this.j == null)) {
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37755b;
            String c2 = this.j.c();
            String str3 = akVar2.f38190d;
            String a2 = this.j.a();
            long j2 = akVar2.j;
            Boolean bool = akVar2.H;
            Boolean bool2 = akVar2.I;
            String str4 = this.i;
            String str5 = str4;
            Boolean bool3 = bool;
            String str6 = "click_pop_up_card";
            if (PatchProxy.isSupport(new Object[]{c2, null, str3, a2, new Long(j2), "pop_up_card", "click_pop_up_card", bool, bool2, str4}, aVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29273, new Class[]{String.class, Long.class, String.class, String.class, Long.TYPE, String.class, String.class, Boolean.class, Boolean.class, String.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{c2, null, str3, a2, new Long(j2), "pop_up_card", str6, bool3, bool2, str5}, aVar2, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29273, new Class[]{String.class, Long.class, String.class, String.class, Long.TYPE, String.class, String.class, Boolean.class, Boolean.class, String.class}, Void.TYPE);
                return;
            }
            String str7 = str5;
            String str8 = str6;
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                str = str2;
            } else {
                str = null;
            }
            p d2 = new p().d(c2);
            d2.f38148f = null;
            d2.c(str3).a(Long.valueOf(j2)).e(a2).b("pop_up_card").f(str8).g(str).a(bool2).a(str7).b();
        }
    }

    public final void onClick(@Nullable View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f37843a, false, 29309, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f37843a, false, 29309, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (Intrinsics.areEqual((Object) view2, (Object) this.f37847e) && this.h >= 0 && this.h < this.g.size()) {
            if (this.j != null) {
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37755b;
                String c2 = this.j.c();
                String str = this.g.get(this.h).f38190d;
                String a2 = this.j.a();
                long j2 = this.g.get(this.h).j;
                Object[] objArr = {c2, str, a2, new Long(j2), "pop_up_card"};
                ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a;
                Class[] clsArr = {String.class, String.class, String.class, Long.TYPE, String.class};
                if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, 29269, clsArr, Void.TYPE)) {
                    com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{c2, str, a2, new Long(j2), "pop_up_card"}, aVar2, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29269, new Class[]{String.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
                } else {
                    h c3 = new h().a(c2).c(a2);
                    c3.f38132f = "pop_up_card";
                    c3.b(str).a(j2).b();
                }
            }
            String str2 = this.g.get(this.h).x;
            com.ss.android.ugc.aweme.commerce.sdk.b.a aVar3 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
            if (view2 == null) {
                Intrinsics.throwNpe();
            }
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view!!.context");
            aVar3.a(context, str2, "");
        }
    }

    public final void a(@Nullable ak akVar, @NotNull String str) {
        ak akVar2 = akVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{akVar2, str2}, this, f37843a, false, 29314, new Class[]{ak.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{akVar2, str2}, this, f37843a, false, 29314, new Class[]{ak.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "coupon_id");
        if (!(akVar2 == null || this.j == null)) {
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37755b;
            String c2 = this.j.c();
            String str3 = akVar2.f38190d;
            String a2 = this.j.a();
            long j2 = akVar2.j;
            if (PatchProxy.isSupport(new Object[]{c2, str3, a2, new Long(j2), str2, "pop_up_card"}, aVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29270, new Class[]{String.class, String.class, String.class, Long.TYPE, String.class, String.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{c2, str3, a2, new Long(j2), str2, "pop_up_card"}, aVar2, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a.f37754a, false, 29270, new Class[]{String.class, String.class, String.class, Long.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            new m().a(c2).b(str3).c(a2).a(j2).e(str2).d("pop_up_card").b();
        }
    }

    public final void a(int i2, @NotNull Rect rect, @Nullable Bitmap bitmap) {
        Rect rect2 = rect;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), rect2, bitmap2}, this, f37843a, false, 29320, new Class[]{Integer.TYPE, Rect.class, Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), rect2, bitmap2}, this, f37843a, false, 29320, new Class[]{Integer.TYPE, Rect.class, Bitmap.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(rect2, "productImgLocation");
        com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c cVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.k;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, cVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.f37859a, false, 29289, new Class[]{Integer.TYPE}, Void.TYPE)) {
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c cVar2 = cVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, cVar2, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.f37859a, false, 29289, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.h = i2;
            c.a e2 = cVar.e();
            if (e2 != null) {
                e2.a(com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.h);
            }
        }
        if (!(this.f37845c == null || this.f37847e == null || bitmap2 == null)) {
            ViewGroup viewGroup = this.f37845c;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int i3 = rect2.left - iArr[0];
            int i4 = rect2.top - iArr[1];
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
            SnapshotAnimView snapshotAnimView = new SnapshotAnimView(context);
            View view = this.f37847e;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            float dip2Px = UIUtils.dip2Px(view.getContext(), 10.0f);
            snapshotAnimView.setImageBitmap(bitmap2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.leftMargin = i3;
            layoutParams.topMargin = i4;
            snapshotAnimView.setLayoutParams(layoutParams);
            viewGroup.addView(snapshotAnimView);
            int[] iArr2 = new int[2];
            View view2 = this.f37847e;
            if (view2 == null) {
                Intrinsics.throwNpe();
            }
            view2.getLocationOnScreen(iArr2);
            c cVar3 = new c(this, iArr2, rect, snapshotAnimView, dip2Px, viewGroup);
            snapshotAnimView.post(cVar3);
        }
    }

    public b(@NotNull Fragment fragment, @NotNull Context context, @Nullable User user, @Nullable String str, @Nullable com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.b bVar) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.n = fragment;
        this.o = user;
        this.i = str;
        this.j = bVar;
        Context context2 = null;
        this.f37845c = (ViewGroup) View.inflate(context, C0906R.layout.lo, null);
        com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c cVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.k;
        c.a aVar = this;
        if (PatchProxy.isSupport(new Object[]{aVar}, cVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.f37859a, false, 29290, new Class[]{c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, cVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.f37859a, false, 29290, new Class[]{c.a.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(aVar, "cartCountListener");
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.i = new WeakReference<>(aVar);
        }
        if (PatchProxy.isSupport(new Object[0], this, f37843a, false, 29307, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37843a, false, 29307, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup viewGroup = this.f37845c;
        if (viewGroup != null) {
            this.f37846d = (RecyclerView) viewGroup.findViewById(C0906R.id.cc_);
            this.f37847e = viewGroup.findViewById(C0906R.id.ark);
            Context context3 = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            if (PatchProxy.isSupport(new Object[]{context3}, this, f37843a, false, 29308, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context3}, this, f37843a, false, 29308, new Class[]{Context.class}, Void.TYPE);
            } else {
                this.k = new LinearLayoutManager(context3);
                LinearLayoutManager linearLayoutManager = this.k;
                if (linearLayoutManager != null) {
                    linearLayoutManager.setOrientation(0);
                }
                RecyclerView recyclerView = this.f37846d;
                if (recyclerView != null) {
                    RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
                    if (itemAnimator != null) {
                        itemAnimator.setChangeDuration(0);
                    }
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    if (layoutParams != null) {
                        RecyclerView recyclerView2 = this.f37846d;
                        context2 = recyclerView2 != null ? recyclerView2.getContext() : context2;
                        if (context2 == null) {
                            Intrinsics.throwNpe();
                        }
                        layoutParams.height = (int) UIUtils.dip2Px(context2, 400.0f);
                    }
                    recyclerView.setLayoutManager(this.k);
                    this.f37848f = new SkuPanelAdapter(this.o, this.n);
                    recyclerView.setAdapter(this.f37848f);
                    new SkuPanelPagerSnapHelper().attachToRecyclerView(this.f37846d);
                    recyclerView.addOnScrollListener(new LiveSkuPanelController$initRecyclerView$$inlined$apply$lambda$1(this));
                }
            }
        }
        View view = this.f37847e;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    public final void a(@NotNull ak akVar, @NotNull Context context, @NotNull Fragment fragment, @Nullable Integer num, @Nullable String str) {
        ak akVar2 = akVar;
        Context context2 = context;
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{akVar2, context2, fragment2, num, str}, this, f37843a, false, 29319, new Class[]{ak.class, Context.class, Fragment.class, Integer.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{akVar2, context2, fragment2, num, str}, this, f37843a, false, 29319, new Class[]{ak.class, Context.class, Fragment.class, Integer.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(akVar2, "product");
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.j != null) {
            String str2 = akVar2.f38190d;
            objectRef.element = this.i;
            objectRef2.element = "click_pop_up_card";
            objectRef3.element = "pop_up_card";
            if (!(this.o == null || TextUtils.isEmpty(akVar2.G) || str2 == null)) {
                com.ss.android.ugc.aweme.commerce.sdk.b.a aVar = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
                n.a aVar2 = n.r;
                CommerceUser a2 = d.a(this.o);
                Intrinsics.checkExpressionValueIsNotNull(a2, "CommerceUtils.toCommerceUser(anchorInfo)");
                String str3 = akVar2.G;
                if (str3 == null) {
                    Intrinsics.throwNpe();
                }
                String str4 = akVar2.f38192f;
                String str5 = akVar2.g;
                String str6 = akVar2.C;
                String str7 = (String) objectRef.element;
                String str8 = (String) objectRef2.element;
                String str9 = akVar2.G;
                if (str9 == null) {
                    Intrinsics.throwNpe();
                }
                aVar.a(n.a.a(aVar2, context, a2, str3, str2, str4, str5, str6, str7, str8, str9, null, (String) objectRef3.element, akVar2.h, uptimeMillis, akVar2.j, fragment, num, null, str, 131072));
            }
        }
    }
}

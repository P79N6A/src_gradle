package com.ss.android.ugc.aweme.commercialize.symphony;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.ad.symphony.ad.nativead.INativeAd;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longvideo.feature.VolumeController;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0019\u0010 \u001a\u00020\u001f2\u000e\b\u0006\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\"H\bJ\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0003J\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020\u001fH\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\b\u0010,\u001a\u00020\u0010H\u0002J\b\u0010-\u001a\u00020\u001fH\u0002JP\u0010.\u001a\u00020\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\tJ\b\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\b\u00102\u001a\u00020\u001fH\u0002J\b\u00103\u001a\u00020\u001fH\u0002J\b\u00104\u001a\u00020\u001fH\u0002J\b\u00105\u001a\u00020\u001fH\u0002J\u0010\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u0010H\u0002J\b\u00108\u001a\u00020\u001fH\u0002J\b\u00109\u001a\u00020\u001fH\u0002J\b\u0010:\u001a\u00020\u001fH\u0016J\b\u0010;\u001a\u00020\u001fH\u0016J\u0006\u0010<\u001a\u00020\u001fJ\b\u0010=\u001a\u00020\u001fH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/ugc/aweme/commercialize/symphony/ThirdPartPlayer;", "Lcom/ss/android/ugc/aweme/common/widget/VerticalViewPager$ISkipScrollCheck;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adLabel", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "dislikeShowing", "", "holderSelected", "iDislikeClick", "Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislikeClick;", "iNativeAd", "Lcom/bytedance/ad/symphony/ad/nativead/INativeAd;", "isPlaying", "maskPlayTime", "nativeAdListener", "Lcom/bytedance/ad/symphony/listener/nativead/NativeAdListener;", "playNumber", "soundDesc", "volumeController", "Lcom/ss/android/ugc/aweme/longvideo/feature/VolumeController;", "adaptBottom", "", "hideAdMask", "fOnEnd", "Lkotlin/Function0;", "hideMainRegion", "initAdMaskRegion", "initDescRegion", "initMenuRegion", "initMusicRegion", "initPlayRegion", "initSymphony", "initSymphonyAdCard", "initVolume", "isFbAd", "resetViewScaleIfNeed", "select", "dislikeClick", "showAdMask", "showMainRegion", "showNotSupportToast", "startAnim", "startMusicAnimation", "stopAnim", "toggleMaskMode", "isNewMode", "translationInDescCommerce", "translationOutDescCommerce", "tryPause", "tryPlay", "unSelect", "unregisterVolume", "DislikeLongClickListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends FrameLayout implements f, VerticalViewPager.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39558a;

    /* renamed from: b  reason: collision with root package name */
    VolumeController f39559b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ad.symphony.c.a.a f39560c;

    /* renamed from: d  reason: collision with root package name */
    public INativeAd f39561d;

    /* renamed from: e  reason: collision with root package name */
    String f39562e;

    /* renamed from: f  reason: collision with root package name */
    String f39563f;
    public boolean g;
    AdDislikeLayout.b h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public Aweme m;
    private HashMap n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView$DislikeLongClickListener;", "Landroid/view/View$OnLongClickListener;", "(Lcom/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView;)V", "onLongClick", "", "v", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    final class a implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39564a;

        public a() {
        }

        public final boolean onLongClick(@Nullable View view) {
            Resources resources;
            int i;
            int i2;
            ObjectAnimator objectAnimator;
            if (PatchProxy.isSupport(new Object[]{view}, this, f39564a, false, 32162, new Class[]{View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f39564a, false, 32162, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            d dVar = d.this;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f39558a, false, 32156, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f39558a, false, 32156, new Class[0], Void.TYPE);
            } else {
                FrameLayout frameLayout = (FrameLayout) dVar.a(C0906R.id.bo9);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "musicRegion");
                frameLayout.setVisibility(8);
                FrameLayout frameLayout2 = (FrameLayout) dVar.a(C0906R.id.a3o);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "descRegion");
                frameLayout2.setVisibility(8);
                LinearLayout linearLayout = (LinearLayout) dVar.a(C0906R.id.bmc);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "menuRegion");
                linearLayout.setVisibility(8);
            }
            AdDislikeLayout adDislikeLayout = (AdDislikeLayout) d.this.a(C0906R.id.a5j);
            if (PatchProxy.isSupport(new Object[0], adDislikeLayout, AdDislikeLayout.f39501a, false, 32076, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], adDislikeLayout, AdDislikeLayout.f39501a, false, 32076, new Class[0], Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(AbTestManager.a(), "AbTestManager.getInstance()");
                TextView textView = (TextView) adDislikeLayout.a(C0906R.id.gz);
                Intrinsics.checkExpressionValueIsNotNull(textView, "autoPlay");
                textView.setVisibility(8);
                TextView textView2 = (TextView) adDislikeLayout.a(C0906R.id.gz);
                AwemeAppData p = AwemeAppData.p();
                Intrinsics.checkExpressionValueIsNotNull(p, "AwemeAppData.inst()");
                if (p.ap) {
                    resources = adDislikeLayout.getResources();
                    i = 2130839763;
                } else {
                    resources = adDislikeLayout.getResources();
                    i = 2130839759;
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(null, com.ss.android.ugc.bytex.a.a.a.a(resources, i), null, null);
                TextView textView3 = (TextView) adDislikeLayout.a(C0906R.id.gz);
                AwemeAppData p2 = AwemeAppData.p();
                Intrinsics.checkExpressionValueIsNotNull(p2, "AwemeAppData.inst()");
                if (p2.ap) {
                    i2 = C0906R.string.pn;
                } else {
                    i2 = C0906R.string.qf;
                }
                textView3.setText(i2);
                LinearLayout linearLayout2 = (LinearLayout) adDislikeLayout.a(C0906R.id.d3a);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "titleAndOptions");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(linearLayout2.getLayoutParams());
                int i3 = adDislikeLayout.h - adDislikeLayout.f39506f;
                if (i3 < adDislikeLayout.f39504d) {
                    i3 = adDislikeLayout.h;
                    adDislikeLayout.f39502b = false;
                } else {
                    if (i3 > adDislikeLayout.f39505e - adDislikeLayout.f39506f) {
                        i3 = adDislikeLayout.f39505e - adDislikeLayout.f39506f;
                    }
                    adDislikeLayout.f39502b = true;
                }
                layoutParams.setMargins(0, i3, 0, 0);
                LinearLayout linearLayout3 = (LinearLayout) adDislikeLayout.a(C0906R.id.d3a);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "titleAndOptions");
                linearLayout3.setLayoutParams(layoutParams);
                LinearLayout linearLayout4 = (LinearLayout) adDislikeLayout.a(C0906R.id.bv8);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "option");
                linearLayout4.setVisibility(0);
                LinearLayout linearLayout5 = (LinearLayout) adDislikeLayout.a(C0906R.id.d3a);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "titleAndOptions");
                linearLayout5.setVisibility(0);
                View a2 = adDislikeLayout.a(C0906R.id.aez);
                Intrinsics.checkExpressionValueIsNotNull(a2, "flDislikeBg");
                a2.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adDislikeLayout.a(C0906R.id.aez), "alpha", new float[]{0.0f, 1.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat, "fadeInBg");
                ofFloat.setDuration(150);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((LinearLayout) adDislikeLayout.a(C0906R.id.d3a), "alpha", new float[]{0.0f, 1.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "fadeInContent");
                ofFloat2.setDuration(300);
                if (adDislikeLayout.f39502b) {
                    objectAnimator = ObjectAnimator.ofFloat((LinearLayout) adDislikeLayout.a(C0906R.id.d3a), "translationY", new float[]{adDislikeLayout.f39503c, 0.0f});
                    Intrinsics.checkExpressionValueIsNotNull(objectAnimator, "ObjectAnimator.ofFloat(t…translationYDistance, 0f)");
                } else {
                    objectAnimator = ObjectAnimator.ofFloat((LinearLayout) adDislikeLayout.a(C0906R.id.d3a), "translationY", new float[]{0.0f, adDislikeLayout.f39503c});
                    Intrinsics.checkExpressionValueIsNotNull(objectAnimator, "ObjectAnimator.ofFloat(t…0f, translationYDistance)");
                }
                ObjectAnimator duration = objectAnimator.setDuration(300);
                Intrinsics.checkExpressionValueIsNotNull(duration, "jumpContent.setDuration(300)");
                duration.setInterpolator(new OvershootInterpolator(1.04f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(objectAnimator).with(ofFloat2);
                animatorSet.start();
                AdDislikeLayout.a aVar = adDislikeLayout.g;
                if (aVar != null) {
                    aVar.b();
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39567b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView$hideAdMask$2"}, k = 3, mv = {1, 1, 15})
        public static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39568a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f39569b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f39570c;

            public a(d dVar, b bVar) {
                this.f39569b = dVar;
                this.f39570c = bVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f39568a, false, 32165, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f39568a, false, 32165, new Class[0], Void.TYPE);
                    return;
                }
                LinearLayout linearLayout = (LinearLayout) this.f39569b.a(C0906R.id.bll);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "maskAdLayout");
                linearLayout.setVisibility(8);
                this.f39570c.f39567b.a();
            }
        }

        b(d dVar) {
            this.f39567b = dVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39566a, false, 32164, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39566a, false, 32164, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            d dVar = this.f39567b;
            LinearLayout linearLayout = (LinearLayout) dVar.a(C0906R.id.bll);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "maskAdLayout");
            if (linearLayout.getVisibility() != 0) {
                this.f39567b.a();
            } else {
                LinearLayout linearLayout2 = (LinearLayout) dVar.a(C0906R.id.bll);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "maskAdLayout");
                linearLayout2.setAlpha(1.0f);
                ((LinearLayout) dVar.a(C0906R.id.bll)).animate().alpha(0.0f).setDuration(150).withEndAction(new a(dVar, this)).start();
                ((FrameLayout) dVar.a(C0906R.id.bo9)).animate().alpha(1.0f).setDuration(150).start();
                ((FrameLayout) dVar.a(C0906R.id.a3o)).animate().alpha(1.0f).setDuration(150).start();
                ((LinearLayout) dVar.a(C0906R.id.bmc)).animate().alpha(1.0f).setDuration(150).start();
            }
            com.bytedance.ad.symphony.b.e.a("ad_sdk_replay", this.f39567b.f39561d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39571a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f39572b = new c();

        c() {
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39571a, false, 32166, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39571a, false, 32166, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.d$d  reason: collision with other inner class name */
    static final class C0515d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39573a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39574b;

        C0515d(d dVar) {
            this.f39574b = dVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39573a, false, 32167, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39573a, false, 32167, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39574b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39575a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39576b;

        e(d dVar) {
            this.f39576b = dVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39575a, false, 32168, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39575a, false, 32168, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39576b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39577a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39578b;

        f(d dVar) {
            this.f39578b = dVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39577a, false, 32169, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39577a, false, 32169, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39578b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39580b;

        g(d dVar) {
            this.f39580b = dVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39579a, false, 32170, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39579a, false, 32170, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Context context = this.f39580b.getContext();
            if (context != null) {
                new SymphonySharePanel((MainActivity) context, this.f39580b.f39561d, this.f39580b.m).show();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39581a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39582b;

        h(d dVar) {
            this.f39582b = dVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39581a, false, 32171, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39581a, false, 32171, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39582b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39584b;

        i(d dVar) {
            this.f39584b = dVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39583a, false, 32172, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39583a, false, 32172, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f39584b.g) {
                ImageView imageView = (ImageView) this.f39584b.a(C0906R.id.bwl);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "pauseIcon");
                imageView.setVisibility(0);
                com.bytedance.ad.symphony.b.e.a("ad_sdk_pause", this.f39584b.f39561d);
                this.f39584b.b();
                return;
            }
            ImageView imageView2 = (ImageView) this.f39584b.a(C0906R.id.bwl);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "pauseIcon");
            imageView2.setVisibility(8);
            com.bytedance.ad.symphony.b.e.a("ad_sdk_continue", this.f39584b.f39561d);
            this.f39584b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView$initPlayRegion$2", "Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislike;", "onDismiss", "", "onShow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j implements AdDislikeLayout.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39585a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39586b;

        public final void b() {
            this.f39586b.l = true;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f39585a, false, 32173, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39585a, false, 32173, new Class[0], Void.TYPE);
                return;
            }
            this.f39586b.l = false;
            d dVar = this.f39586b;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f39558a, false, 32150, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f39558a, false, 32150, new Class[0], Void.TYPE);
                return;
            }
            FrameLayout frameLayout = (FrameLayout) dVar.a(C0906R.id.bo9);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "musicRegion");
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = (FrameLayout) dVar.a(C0906R.id.a3o);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "descRegion");
            frameLayout2.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) dVar.a(C0906R.id.bmc);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "menuRegion");
            linearLayout.setVisibility(0);
        }

        j(d dVar) {
            this.f39586b = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView$initSymphony$2", "Lcom/bytedance/ad/symphony/listener/nativead/NativeAdListener;", "onAdClick", "", "onAdShow", "onVideoComplete", "onVideoPause", "onVideoPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class k implements com.bytedance.ad.symphony.c.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f39587a;

        k(d dVar) {
            this.f39587a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ long $delayTime = 240;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(d dVar, long j) {
            super(0);
            this.this$0 = dVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32180, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32180, new Class[0], Void.TYPE);
                return;
            }
            ((SymphonyCard) this.this$0.a(C0906R.id.cyf)).b();
            this.this$0.postDelayed(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f39588a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ l f39589b;

                {
                    this.f39589b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f39588a, false, 32181, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f39588a, false, 32181, new Class[0], Void.TYPE);
                        return;
                    }
                    this.f39589b.this$0.d();
                }
            }, this.$delayTime);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39590a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39591b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f39592c = 240;

        m(d dVar, long j) {
            this.f39591b = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0218, code lost:
            if (r2 == null) goto L_0x021a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
            if (r2 == null) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x010d, code lost:
            if (r2 == null) goto L_0x010f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0182, code lost:
            if (r2 == null) goto L_0x0184;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f39590a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 32182(0x7db6, float:4.5097E-41)
                r2 = r12
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f39590a
                r5 = 0
                r6 = 32182(0x7db6, float:4.5097E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r12
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                com.ss.android.ugc.aweme.commercialize.symphony.d r1 = r12.f39591b
                r2 = 2131170223(0x7f0713af, float:1.7954798E38)
                android.view.View r1 = r1.a(r2)
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r1 = (com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r1
                com.ss.android.ugc.aweme.commercialize.symphony.d r2 = r12.f39591b
                com.bytedance.ad.symphony.ad.nativead.INativeAd r9 = r2.f39561d
                r10 = 1
                java.lang.Object[] r2 = new java.lang.Object[r10]
                r2[r0] = r9
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard.f39519a
                r5 = 0
                r6 = 32115(0x7d73, float:4.5003E-41)
                java.lang.Class[] r7 = new java.lang.Class[r10]
                java.lang.Class<com.bytedance.ad.symphony.ad.nativead.INativeAd> r3 = com.bytedance.ad.symphony.ad.nativead.INativeAd.class
                r7[r0] = r3
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r3 = r1
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                r11 = 0
                if (r2 == 0) goto L_0x006a
                java.lang.Object[] r2 = new java.lang.Object[r10]
                r2[r0] = r9
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard.f39519a
                r5 = 0
                r6 = 32115(0x7d73, float:4.5003E-41)
                java.lang.Class[] r7 = new java.lang.Class[r10]
                java.lang.Class<com.bytedance.ad.symphony.ad.nativead.INativeAd> r3 = com.bytedance.ad.symphony.ad.nativead.INativeAd.class
                r7[r0] = r3
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r3 = r1
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                goto L_0x01cb
            L_0x006a:
                if (r9 == 0) goto L_0x0071
                java.lang.String r1 = r9.c()
                goto L_0x0072
            L_0x0071:
                r1 = r11
            L_0x0072:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                if (r1 == 0) goto L_0x007f
                int r1 = r1.length()
                if (r1 != 0) goto L_0x007d
                goto L_0x007f
            L_0x007d:
                r1 = 0
                goto L_0x0080
            L_0x007f:
                r1 = 1
            L_0x0080:
                if (r1 == 0) goto L_0x00e0
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
                if (r9 == 0) goto L_0x0098
                com.bytedance.ad.symphony.model.b r2 = r9.a()
                if (r2 == 0) goto L_0x0098
                org.json.JSONObject r2 = r2.f7649e
                if (r2 == 0) goto L_0x0098
                java.lang.String r2 = r2.toString()
                if (r2 != 0) goto L_0x009a
            L_0x0098:
                java.lang.String r2 = ""
            L_0x009a:
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.g(r2)
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((boolean) r10)
                java.lang.String r2 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r2)
                java.lang.String r2 = "show_fail"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r2)
                if (r9 == 0) goto L_0x00d0
                com.bytedance.ad.symphony.model.b r2 = r9.a()
                if (r2 == 0) goto L_0x00d0
                java.util.concurrent.ConcurrentHashMap r2 = r2.a()
                if (r2 == 0) goto L_0x00d0
                r3 = r2
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = "error_message"
                java.lang.String r5 = "card_name_missing"
                r3.put(r4, r5)
                com.google.gson.Gson r3 = new com.google.gson.Gson
                r3.<init>()
                java.lang.String r2 = r3.toJson((java.lang.Object) r2)
                goto L_0x00d1
            L_0x00d0:
                r2 = r11
            L_0x00d1:
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r2)
                java.lang.String r2 = "card"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.d(r2)
                r1.b()
                r1 = 0
                goto L_0x00e1
            L_0x00e0:
                r1 = 1
            L_0x00e1:
                if (r9 == 0) goto L_0x00e8
                java.lang.String r2 = r9.d()
                goto L_0x00e9
            L_0x00e8:
                r2 = r11
            L_0x00e9:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r2 == 0) goto L_0x00f6
                int r2 = r2.length()
                if (r2 != 0) goto L_0x00f4
                goto L_0x00f6
            L_0x00f4:
                r2 = 0
                goto L_0x00f7
            L_0x00f6:
                r2 = 1
            L_0x00f7:
                if (r2 == 0) goto L_0x0156
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
                if (r9 == 0) goto L_0x010f
                com.bytedance.ad.symphony.model.b r2 = r9.a()
                if (r2 == 0) goto L_0x010f
                org.json.JSONObject r2 = r2.f7649e
                if (r2 == 0) goto L_0x010f
                java.lang.String r2 = r2.toString()
                if (r2 != 0) goto L_0x0111
            L_0x010f:
                java.lang.String r2 = ""
            L_0x0111:
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.g(r2)
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((boolean) r10)
                java.lang.String r2 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r2)
                java.lang.String r2 = "show_fail"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r2)
                if (r9 == 0) goto L_0x0147
                com.bytedance.ad.symphony.model.b r2 = r9.a()
                if (r2 == 0) goto L_0x0147
                java.util.concurrent.ConcurrentHashMap r2 = r2.a()
                if (r2 == 0) goto L_0x0147
                r3 = r2
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = "error_message"
                java.lang.String r5 = "card_title_missing"
                r3.put(r4, r5)
                com.google.gson.Gson r3 = new com.google.gson.Gson
                r3.<init>()
                java.lang.String r2 = r3.toJson((java.lang.Object) r2)
                goto L_0x0148
            L_0x0147:
                r2 = r11
            L_0x0148:
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r2)
                java.lang.String r2 = "card"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.d(r2)
                r1.b()
                r1 = 0
            L_0x0156:
                if (r9 == 0) goto L_0x015d
                java.lang.String r2 = r9.g()
                goto L_0x015e
            L_0x015d:
                r2 = r11
            L_0x015e:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r2 == 0) goto L_0x016b
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0169
                goto L_0x016b
            L_0x0169:
                r2 = 0
                goto L_0x016c
            L_0x016b:
                r2 = 1
            L_0x016c:
                if (r2 == 0) goto L_0x01cb
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
                if (r9 == 0) goto L_0x0184
                com.bytedance.ad.symphony.model.b r2 = r9.a()
                if (r2 == 0) goto L_0x0184
                org.json.JSONObject r2 = r2.f7649e
                if (r2 == 0) goto L_0x0184
                java.lang.String r2 = r2.toString()
                if (r2 != 0) goto L_0x0186
            L_0x0184:
                java.lang.String r2 = ""
            L_0x0186:
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.g(r2)
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((boolean) r10)
                java.lang.String r2 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r2)
                java.lang.String r2 = "show_fail"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r2)
                if (r9 == 0) goto L_0x01bc
                com.bytedance.ad.symphony.model.b r2 = r9.a()
                if (r2 == 0) goto L_0x01bc
                java.util.concurrent.ConcurrentHashMap r2 = r2.a()
                if (r2 == 0) goto L_0x01bc
                r3 = r2
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = "error_message"
                java.lang.String r5 = "card_download_button_missing"
                r3.put(r4, r5)
                com.google.gson.Gson r3 = new com.google.gson.Gson
                r3.<init>()
                java.lang.String r2 = r3.toJson((java.lang.Object) r2)
                goto L_0x01bd
            L_0x01bc:
                r2 = r11
            L_0x01bd:
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r2)
                java.lang.String r2 = "card"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.d(r2)
                r1.b()
                r1 = 0
            L_0x01cb:
                if (r1 == 0) goto L_0x029c
                com.ss.android.ugc.aweme.commercialize.symphony.d r1 = r12.f39591b
                r2 = 2131168381(0x7f070c7d, float:1.7951062E38)
                android.view.View r1 = r1.a(r2)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                java.lang.String r2 = "maskAdLayout"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                int r1 = r1.getVisibility()
                if (r1 == 0) goto L_0x029c
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
                com.google.gson.Gson r2 = new com.google.gson.Gson
                r2.<init>()
                com.ss.android.ugc.aweme.commercialize.symphony.d r3 = r12.f39591b
                com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r3.f39561d
                if (r3 == 0) goto L_0x01fc
                com.bytedance.ad.symphony.model.b r3 = r3.a()
                if (r3 == 0) goto L_0x01fc
                java.util.concurrent.ConcurrentHashMap r11 = r3.a()
            L_0x01fc:
                java.lang.String r2 = r2.toJson((java.lang.Object) r11)
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r2)
                com.ss.android.ugc.aweme.commercialize.symphony.d r2 = r12.f39591b
                com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r2.f39561d
                if (r2 == 0) goto L_0x021a
                com.bytedance.ad.symphony.model.b r2 = r2.a()
                if (r2 == 0) goto L_0x021a
                org.json.JSONObject r2 = r2.f7649e
                if (r2 == 0) goto L_0x021a
                java.lang.String r2 = r2.toString()
                if (r2 != 0) goto L_0x021c
            L_0x021a:
                java.lang.String r2 = ""
            L_0x021c:
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.g(r2)
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((boolean) r10)
                java.lang.String r2 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r2)
                java.lang.String r2 = "othershow"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r2)
                java.lang.String r2 = "card"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.d(r2)
                r1.b()
                com.ss.android.ugc.aweme.commercialize.symphony.d r1 = r12.f39591b
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
                r5 = 0
                r6 = 32157(0x7d9d, float:4.5062E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r1
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x025d
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
                r5 = 0
                r6 = 32157(0x7d9d, float:4.5062E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x028e
            L_0x025d:
                r0 = 2131166136(0x7f0703b8, float:1.7946509E38)
                android.view.View r0 = r1.a(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                android.view.ViewPropertyAnimator r0 = r0.animate()
                android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator
                r2.<init>()
                android.animation.TimeInterpolator r2 = (android.animation.TimeInterpolator) r2
                android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r2)
                r2 = 200(0xc8, double:9.9E-322)
                android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
                r2 = 0
                android.view.ViewPropertyAnimator r0 = r0.alpha(r2)
                com.ss.android.ugc.aweme.commercialize.symphony.d$o r2 = new com.ss.android.ugc.aweme.commercialize.symphony.d$o
                r2.<init>(r1)
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                android.view.ViewPropertyAnimator r0 = r0.withEndAction(r2)
                r0.start()
            L_0x028e:
                com.ss.android.ugc.aweme.commercialize.symphony.d r0 = r12.f39591b
                com.ss.android.ugc.aweme.commercialize.symphony.d$m$1 r1 = new com.ss.android.ugc.aweme.commercialize.symphony.d$m$1
                r1.<init>(r12)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                long r2 = r12.f39592c
                r0.postDelayed(r1, r2)
            L_0x029c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.symphony.d.m.run():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39595a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39596b;

        n(d dVar) {
            this.f39596b = dVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39595a, false, 32184, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39595a, false, 32184, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39596b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39597a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39598b;

        o(d dVar) {
            this.f39598b = dVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39597a, false, 32189, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39597a, false, 32189, new Class[0], Void.TYPE);
                return;
            }
            LinearLayout linearLayout = (LinearLayout) this.f39598b.a(C0906R.id.yu);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentView");
            linearLayout.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView$hideAdMask$2"}, k = 3, mv = {1, 1, 15})
    public static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39599a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39600b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f39601c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView$tryPlay$1$1"}, k = 3, mv = {1, 1, 15})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39602a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f39603b;

            a(p pVar) {
                this.f39603b = pVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f39602a, false, 32191, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f39602a, false, 32191, new Class[0], Void.TYPE);
                }
            }
        }

        public p(d dVar, d dVar2) {
            this.f39600b = dVar;
            this.f39601c = dVar2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39599a, false, 32190, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39599a, false, 32190, new Class[0], Void.TYPE);
                return;
            }
            LinearLayout linearLayout = (LinearLayout) this.f39600b.a(C0906R.id.bll);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "maskAdLayout");
            linearLayout.setVisibility(8);
            this.f39601c.postDelayed(new a(this), 300);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView$tryPlay$1$1"}, k = 3, mv = {1, 1, 15})
    static final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f39605b;

        q(d dVar) {
            this.f39605b = dVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39604a, false, 32192, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39604a, false, 32192, new Class[0], Void.TYPE);
            }
        }
    }

    @JvmOverloads
    public d(@NotNull Context context) {
        this(context, null, 0, 6);
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f39558a, false, 32160, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f39558a, false, 32160, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.n.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39558a, false, 32134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39558a, false, 32134, new Class[0], Void.TYPE);
        } else if (this.k && this.g) {
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f39558a, false, 32152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39558a, false, 32152, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.c_, 0).a();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f39558a, false, 32158, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39558a, false, 32158, new Class[0], Void.TYPE);
            return;
        }
        LinearLayout linearLayout = (LinearLayout) a(C0906R.id.yu);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentView");
        linearLayout.setTranslationY((float) u.a(17.0d));
        LinearLayout linearLayout2 = (LinearLayout) a(C0906R.id.yu);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "contentView");
        linearLayout2.setVisibility(0);
        ((LinearLayout) a(C0906R.id.yu)).animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(280).start();
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f39558a, false, 32159, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39558a, false, 32159, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.bytedance.ad.symphony.g.b.a(this.f39561d) || com.bytedance.ad.symphony.g.b.b(this.f39561d) || com.bytedance.ad.symphony.g.b.c(this.f39561d)) {
            return true;
        } else {
            return false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39558a, false, 32133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39558a, false, 32133, new Class[0], Void.TYPE);
        } else if (this.k && !this.g) {
            LinearLayout linearLayout = (LinearLayout) a(C0906R.id.bll);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "maskAdLayout");
            if (linearLayout.getVisibility() != 0) {
                postDelayed(new q(this), 300);
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) a(C0906R.id.bll);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "maskAdLayout");
            linearLayout2.setAlpha(1.0f);
            ((LinearLayout) a(C0906R.id.bll)).animate().alpha(0.0f).setDuration(150).withEndAction(new p(this, this)).start();
            ((FrameLayout) a(C0906R.id.bo9)).animate().alpha(1.0f).setDuration(150).start();
            ((FrameLayout) a(C0906R.id.a3o)).animate().alpha(1.0f).setDuration(150).start();
            ((LinearLayout) a(C0906R.id.bmc)).animate().alpha(1.0f).setDuration(150).start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private d(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f39563f = "Ad";
        this.j = 2;
        LayoutInflater.from(context).inflate(C0906R.layout.adq, this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (PatchProxy.isSupport(new Object[0], this, f39558a, false, 32135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39558a, false, 32135, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.profile.a.a().l) {
            Space space = (Space) a(C0906R.id.ms);
            Intrinsics.checkExpressionValueIsNotNull(space, "bottom_space");
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            com.ss.android.ugc.aweme.profile.a a2 = com.ss.android.ugc.aweme.profile.a.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AdaptationManager.getInstance()");
            layoutParams.height = a2.b();
            Space space2 = (Space) a(C0906R.id.ms);
            Intrinsics.checkExpressionValueIsNotNull(space2, "bottom_space");
            space2.setLayoutParams(layoutParams);
        }
    }

    private /* synthetic */ d(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, null, 0);
    }
}

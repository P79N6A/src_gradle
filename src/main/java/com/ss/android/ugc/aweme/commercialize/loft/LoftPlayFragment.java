package com.ss.android.ugc.aweme.commercialize.loft;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity;
import com.ss.android.ugc.aweme.commercialize.loft.adapter.LoftPagerAdapter;
import com.ss.android.ugc.aweme.commercialize.loft.c.a;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.commercialize.loft.model.j;
import com.ss.android.ugc.aweme.commercialize.loft.viewpager.LoftViewPager;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001?B\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\bH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u0002J\u0012\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010.\u001a\u00020$H\u0016J\b\u0010/\u001a\u00020$H\u0016J\u0012\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u000102H\u0007J\u0012\u00103\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u0017H\u0016J \u00107\u001a\u00020$2\u0006\u00106\u001a\u00020\u00172\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0017H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u00106\u001a\u00020\u0017H\u0016J\b\u0010<\u001a\u00020$H\u0016J\b\u0010=\u001a\u00020$H\u0016J\u0010\u0010>\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/LoftPlayFragment;", "Landroid/support/v4/app/Fragment;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "Lcom/ss/android/ugc/aweme/feed/listener/IGetEnterFromListener;", "()V", "isFirstSelected", "", "isScrollDown", "mDialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "mEventType", "", "mImage", "Landroid/widget/ImageView;", "mIntermediateStateViewController", "Lcom/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController;", "mLoftAnimationStyle", "mLoftId", "mLoftPagerAdapter", "Lcom/ss/android/ugc/aweme/commercialize/loft/adapter/LoftPagerAdapter;", "mPageType", "", "mRoot", "Landroid/view/View;", "mViewPager", "Lcom/ss/android/ugc/aweme/commercialize/loft/viewpager/LoftViewPager;", "getCurrentViewHolder", "Lcom/ss/android/ugc/aweme/commercialize/loft/adapter/ILoftViewHolder;", "getEnterFrom", "eventV3", "getLastViewHolder", "getViewHolderByChildPosition", "position", "initViews", "", "view", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onEvent", "loftScrollEvent", "Lcom/ss/android/ugc/aweme/commercialize/loft/event/LoftScrollEvent;", "onInternalEvent", "event", "onPageScrollStateChanged", "p0", "onPageScrolled", "p1", "", "p2", "onPageSelected", "onPause", "onResume", "playAnimation", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoftPlayFragment extends Fragment implements ViewPager.OnPageChangeListener, aa<ar>, com.ss.android.ugc.aweme.feed.listener.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2902a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f2903f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public View f2904b;

    /* renamed from: c  reason: collision with root package name */
    public LoftViewPager f2905c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.loft.c.a f2906d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f2907e;
    private LoftPagerAdapter g;
    private com.ss.android.ugc.aweme.feed.d h;
    private String i = "";
    private int j = -1;
    private String k;
    private boolean l;
    private boolean m;
    private boolean n = true;
    private HashMap o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/LoftPlayFragment$Companion;", "", "()V", "LOFT_EVENT_TYPE", "", "LOFT_ID", "LOFT_PAGE_TYPE", "LOFT_STYLE", "newInstance", "Lcom/ss/android/ugc/aweme/commercialize/loft/LoftPlayFragment;", "eventType", "pageType", "", "id", "loftStyle", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39101a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        public final LoftPlayFragment a(@Nullable String str, int i, @NotNull String str2, boolean z) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f39101a, false, 31076, new Class[]{String.class, Integer.TYPE, String.class, Boolean.TYPE}, LoftPlayFragment.class)) {
                return (LoftPlayFragment) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4, Byte.valueOf(z)}, this, f39101a, false, 31076, new Class[]{String.class, Integer.TYPE, String.class, Boolean.TYPE}, LoftPlayFragment.class);
            }
            Intrinsics.checkParameterIsNotNull(str4, "id");
            LoftPlayFragment loftPlayFragment = new LoftPlayFragment();
            Bundle bundle = new Bundle();
            bundle.putString("loft_event_type", str3);
            bundle.putInt("loft_page_type", i);
            bundle.putString("loft_id", str4);
            bundle.putBoolean("loft_style", z);
            loftPlayFragment.setArguments(bundle);
            return loftPlayFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/commercialize/loft/LoftPlayFragment$initViews$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftPlayFragment f39103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f39104c;

        b(LoftPlayFragment loftPlayFragment, View view) {
            this.f39103b = loftPlayFragment;
            this.f39104c = view;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39102a, false, 31082, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39102a, false, 31082, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f39103b.getActivity();
            if (activity != null) {
                activity.finish();
            }
            com.ss.android.ugc.aweme.base.activity.c.b(this.f39103b.getActivity(), 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/loft/LoftPlayFragment$initViews$1$2"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftPlayFragment f39106b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f39107c;

        c(LoftPlayFragment loftPlayFragment, View view) {
            this.f39106b = loftPlayFragment;
            this.f39107c = view;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39105a, false, 31083, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39105a, false, 31083, new Class[0], Void.TYPE);
                return;
            }
            this.f39106b.a(LoftPlayFragment.a(this.f39106b).w());
            this.f39107c.postDelayed(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f39108a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f39109b;

                {
                    this.f39109b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f39108a, false, 31084, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f39108a, false, 31084, new Class[0], Void.TYPE);
                        return;
                    }
                    ((ViewGroup) this.f39109b.f39107c).removeView(LoftPlayFragment.a(this.f39109b.f39106b).w());
                    if (this.f39109b.f39106b.getContext() != null) {
                        View view = this.f39109b.f39106b.f2904b;
                        if (view == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mRoot");
                        }
                        view.setBackgroundColor(this.f39109b.f39106b.getResources().getColor(C0906R.color.d5));
                    }
                    if (this.f39109b.f39106b.isResumed()) {
                        com.ss.android.ugc.aweme.commercialize.loft.adapter.a a2 = this.f39109b.f39106b.a();
                        if (a2 != null) {
                            a2.e();
                        }
                    }
                }
            }, 200);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/loft/LoftPlayFragment$initViews$1$3"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftPlayFragment f39111b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f39112c;

        d(LoftPlayFragment loftPlayFragment, View view) {
            this.f39111b = loftPlayFragment;
            this.f39112c = view;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39110a, false, 31085, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39110a, false, 31085, new Class[0], Void.TYPE);
                return;
            }
            this.f39111b.a((View) LoftPlayFragment.b(this.f39111b));
            this.f39112c.postDelayed(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f39113a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f39114b;

                {
                    this.f39114b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f39113a, false, 31086, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f39113a, false, 31086, new Class[0], Void.TYPE);
                        return;
                    }
                    ((ViewGroup) this.f39114b.f39112c).removeView(LoftPlayFragment.b(this.f39114b.f39111b));
                    if (this.f39114b.f39111b.isResumed()) {
                        com.ss.android.ugc.aweme.commercialize.loft.adapter.a a2 = this.f39114b.f39111b.a();
                        if (a2 != null) {
                            a2.e();
                        }
                    }
                }
            }, 200);
        }
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    public static final LoftPlayFragment a(@Nullable String str, int i2, @NotNull String str2) {
        if (!PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), str2}, null, f2902a, true, 31073, new Class[]{String.class, Integer.TYPE, String.class}, LoftPlayFragment.class)) {
            return f2903f.a(str, i2, str2, false);
        }
        return (LoftPlayFragment) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), str2}, null, f2902a, true, 31073, new Class[]{String.class, Integer.TYPE, String.class}, LoftPlayFragment.class);
    }

    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2902a, false, 31074, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2902a, false, 31074, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPageScrollStateChanged(int i2) {
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2902a, false, 31075, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2902a, false, 31075, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2902a, false, 31058, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2902a, false, 31058, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.feed.d dVar = this.h;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogController");
        }
        dVar.b();
        org.greenrobot.eventbus.c.a().c(this);
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2902a, false, 31061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2902a, false, 31061, new Class[0], Void.TYPE);
            return;
        }
        FragmentInstrumentation.onPause(this);
        super.onPause();
        com.ss.android.ugc.aweme.commercialize.loft.adapter.a a2 = a();
        if (a2 != null) {
            a2.g();
        }
        com.ss.android.ugc.aweme.commercialize.loft.adapter.a a3 = a();
        if (a3 != null) {
            a3.f();
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2902a, false, 31060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2902a, false, 31060, new Class[0], Void.TYPE);
            return;
        }
        FragmentInstrumentation.onResume(this);
        super.onResume();
        com.ss.android.ugc.aweme.commercialize.loft.adapter.a a2 = a();
        if (a2 != null) {
            a2.e();
        }
    }

    private final com.ss.android.ugc.aweme.commercialize.loft.adapter.a b() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f2902a, false, 31065, new Class[0], com.ss.android.ugc.aweme.commercialize.loft.adapter.a.class)) {
            return (com.ss.android.ugc.aweme.commercialize.loft.adapter.a) PatchProxy.accessDispatch(new Object[0], this, f2902a, false, 31065, new Class[0], com.ss.android.ugc.aweme.commercialize.loft.adapter.a.class);
        } else if (this.f2905c == null) {
            return null;
        } else {
            LoftViewPager loftViewPager = this.f2905c;
            if (loftViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            int currentItem = loftViewPager.getCurrentItem();
            if (this.m) {
                i2 = currentItem + 1;
            } else {
                i2 = currentItem - 1;
            }
            LoftViewPager loftViewPager2 = this.f2905c;
            if (loftViewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            int childCount = loftViewPager2.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                com.ss.android.ugc.aweme.commercialize.loft.adapter.a a2 = a(i3);
                if (a2 != null && a2.c() == i2) {
                    return a2;
                }
            }
            return null;
        }
    }

    public final void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2902a, false, 31057, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2902a, false, 31057, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        com.ss.android.ugc.aweme.commercialize.loft.adapter.a a2 = a();
        if (a2 != null) {
            a2.h();
        }
        if (PatchProxy.isSupport(new Object[0], this, f2902a, false, 31071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2902a, false, 31071, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.clear();
        }
    }

    public final com.ss.android.ugc.aweme.commercialize.loft.adapter.a a() {
        if (PatchProxy.isSupport(new Object[0], this, f2902a, false, 31066, new Class[0], com.ss.android.ugc.aweme.commercialize.loft.adapter.a.class)) {
            return (com.ss.android.ugc.aweme.commercialize.loft.adapter.a) PatchProxy.accessDispatch(new Object[0], this, f2902a, false, 31066, new Class[0], com.ss.android.ugc.aweme.commercialize.loft.adapter.a.class);
        } else if (this.f2905c == null) {
            return null;
        } else {
            LoftViewPager loftViewPager = this.f2905c;
            if (loftViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            int currentItem = loftViewPager.getCurrentItem();
            LoftViewPager loftViewPager2 = this.f2905c;
            if (loftViewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            int childCount = loftViewPager2.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                com.ss.android.ugc.aweme.commercialize.loft.adapter.a a2 = a(i2);
                if (a2 != null && a2.c() == currentItem) {
                    return a2;
                }
            }
            return null;
        }
    }

    @NotNull
    public final String a(boolean z) {
        return this.i;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.commercialize.loft.c.a a(LoftPlayFragment loftPlayFragment) {
        com.ss.android.ugc.aweme.commercialize.loft.c.a aVar = loftPlayFragment.f2906d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIntermediateStateViewController");
        }
        return aVar;
    }

    public static final /* synthetic */ ImageView b(LoftPlayFragment loftPlayFragment) {
        ImageView imageView = loftPlayFragment.f2907e;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImage");
        }
        return imageView;
    }

    @Subscribe
    public final void onEvent(@Nullable com.ss.android.ugc.aweme.commercialize.loft.a.a aVar) {
        com.ss.android.ugc.aweme.commercialize.loft.a.a aVar2 = aVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2902a, false, 31069, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2902a, false, 31069, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.a.a.class}, Void.TYPE);
            return;
        }
        LoftViewPager loftViewPager = this.f2905c;
        if (loftViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        if (aVar2 != null) {
            z = aVar2.f39125a;
        }
        loftViewPager.setForbidScroll(z);
    }

    private final com.ss.android.ugc.aweme.commercialize.loft.adapter.a a(int i2) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2902a, false, 31067, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.commercialize.loft.adapter.a.class)) {
            return (com.ss.android.ugc.aweme.commercialize.loft.adapter.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2902a, false, 31067, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.commercialize.loft.adapter.a.class);
        }
        LoftViewPager loftViewPager = this.f2905c;
        if (loftViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        View childAt = loftViewPager.getChildAt(i2);
        if (childAt != null) {
            obj = childAt.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof com.ss.android.ugc.aweme.commercialize.loft.adapter.a)) {
            obj = null;
        }
        return (com.ss.android.ugc.aweme.commercialize.loft.adapter.a) obj;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2902a, false, 31055, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2902a, false, 31055, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("loft_event_type", "");
            Intrinsics.checkExpressionValueIsNotNull(string, "it.getString(LOFT_EVENT_TYPE, \"\")");
            this.i = string;
            this.j = arguments.getInt("loft_page_type");
        }
        org.greenrobot.eventbus.c.a().a((Object) this);
        this.h = new com.ss.android.ugc.aweme.feed.d(this.i, this.j, this, this);
        com.ss.android.ugc.aweme.feed.d dVar = this.h;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogController");
        }
        dVar.a(getActivity(), this);
        com.ss.android.ugc.aweme.feed.d dVar2 = this.h;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogController");
        }
        dVar2.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageSelected(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2902a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 31064(0x7958, float:4.353E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2902a
            r3 = 0
            r4 = 31064(0x7958, float:4.353E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.commercialize.loft.adapter.a r0 = r9.b()
            com.ss.android.ugc.aweme.commercialize.loft.adapter.a r1 = r9.a()
            boolean r2 = r9.n
            if (r2 == 0) goto L_0x0048
            r9.n = r8
            goto L_0x00d0
        L_0x0048:
            r2 = 0
            if (r0 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.d()
            goto L_0x0051
        L_0x0050:
            r3 = r2
        L_0x0051:
            if (r1 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r1.d()
            goto L_0x0059
        L_0x0058:
            r4 = r2
        L_0x0059:
            boolean r5 = r9.m
            if (r5 == 0) goto L_0x0097
            java.lang.String r5 = "discovery_second_floor_slide_right"
            com.ss.android.ugc.aweme.app.d.d r6 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r7 = "from_group_id"
            if (r3 == 0) goto L_0x006c
            java.lang.String r8 = r3.getAid()
            goto L_0x006d
        L_0x006c:
            r8 = r2
        L_0x006d:
            com.ss.android.ugc.aweme.app.d.d r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "author_id"
            if (r3 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x0080
            java.lang.String r3 = r3.getUid()
            goto L_0x0081
        L_0x0080:
            r3 = r2
        L_0x0081:
            com.ss.android.ugc.aweme.app.d.d r3 = r6.a((java.lang.String) r7, (java.lang.String) r3)
            java.lang.String r6 = "to_group_id"
            if (r4 == 0) goto L_0x008d
            java.lang.String r2 = r4.getAid()
        L_0x008d:
            com.ss.android.ugc.aweme.app.d.d r2 = r3.a((java.lang.String) r6, (java.lang.String) r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r5, (java.util.Map) r2)
            goto L_0x00d0
        L_0x0097:
            java.lang.String r5 = "discovery_second_floor_slide_left"
            com.ss.android.ugc.aweme.app.d.d r6 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r7 = "from_group_id"
            if (r3 == 0) goto L_0x00a6
            java.lang.String r8 = r3.getAid()
            goto L_0x00a7
        L_0x00a6:
            r8 = r2
        L_0x00a7:
            com.ss.android.ugc.aweme.app.d.d r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "author_id"
            if (r3 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x00ba
            java.lang.String r3 = r3.getUid()
            goto L_0x00bb
        L_0x00ba:
            r3 = r2
        L_0x00bb:
            com.ss.android.ugc.aweme.app.d.d r3 = r6.a((java.lang.String) r7, (java.lang.String) r3)
            java.lang.String r6 = "to_group_id"
            if (r4 == 0) goto L_0x00c7
            java.lang.String r2 = r4.getAid()
        L_0x00c7:
            com.ss.android.ugc.aweme.app.d.d r2 = r3.a((java.lang.String) r6, (java.lang.String) r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r5, (java.util.Map) r2)
        L_0x00d0:
            if (r0 == 0) goto L_0x00d5
            r0.b()
        L_0x00d5:
            if (r1 == 0) goto L_0x00db
            r1.a()
            return
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.loft.LoftPlayFragment.onPageSelected(int):void");
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f2902a, false, 31062, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f2902a, false, 31062, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 1.2f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 1.2f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(200);
        animatorSet.start();
    }

    public final /* synthetic */ void a(Object obj) {
        Integer num;
        ar arVar = (ar) obj;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f2902a, false, 31068, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f2902a, false, 31068, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        if (arVar != null) {
            num = Integer.valueOf(arVar.f45292b);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                m a2 = m.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "NetworkStateManager.getInstance()");
                if (!a2.c()) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                    return;
                }
                Object obj2 = arVar.f45293c;
                if (!(obj2 instanceof Aweme)) {
                    obj2 = null;
                }
                Aweme aweme = (Aweme) obj2;
                if (aweme != null) {
                    if (aweme.getAuthor() != null) {
                        com.ss.android.ugc.aweme.feed.d dVar = this.h;
                        if (dVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mDialogController");
                        }
                        dVar.h(aweme);
                    }
                    return;
                }
            }
        }
    }

    public final void onPageScrolled(int i2, float f2, int i3) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f2902a, false, 31063, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f2902a, false, 31063, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        LoftViewPager loftViewPager = this.f2905c;
        if (loftViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        if (i2 != loftViewPager.getCurrentItem()) {
            z = true;
        } else {
            z = false;
        }
        this.m = z;
        boolean z4 = this.n;
        if (f2 == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z4 & z2;
        if (i3 != 0) {
            z3 = false;
        }
        if (z5 && z3) {
            onPageSelected(0);
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        List<j> list;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2902a, false, 31056, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2902a, false, 31056, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(C0906R.layout.og, viewGroup2, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("loft_id", "");
            Intrinsics.checkExpressionValueIsNotNull(string, "it.getString(LOFT_ID, \"\")");
            this.k = string;
            this.l = arguments.getBoolean("loft_style", false);
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f2902a, false, 31059, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f2902a, false, 31059, new Class[]{View.class}, Void.TYPE);
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                View findViewById = inflate.findViewById(C0906R.id.y9);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.container)");
                this.f2904b = findViewById;
                FragmentActivity activity2 = getActivity();
                if (activity2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(activity2, "activity!!");
                LayoutInflater from = LayoutInflater.from(getActivity());
                Intrinsics.checkExpressionValueIsNotNull(from, "LayoutInflater.from(activity)");
                com.ss.android.ugc.aweme.feed.d dVar = this.h;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDialogController");
                }
                LoftPagerAdapter loftPagerAdapter = new LoftPagerAdapter(activity2, from, 1, dVar, this.l);
                this.g = loftPagerAdapter;
                LoftPagerAdapter loftPagerAdapter2 = this.g;
                if (loftPagerAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftPagerAdapter");
                }
                e.a aVar = e.m;
                Intrinsics.checkExpressionValueIsNotNull(activity, AdvanceSetting.NETWORK_TYPE);
                e eVar = (e) aVar.a(activity);
                String str = this.k;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftId");
                }
                com.ss.android.ugc.aweme.commercialize.loft.model.a a2 = eVar.a(str);
                if (a2 != null) {
                    list = a2.getVideoList();
                } else {
                    list = null;
                }
                loftPagerAdapter2.f39128c = list;
                LoftPagerAdapter loftPagerAdapter3 = this.g;
                if (loftPagerAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftPagerAdapter");
                }
                String str2 = this.k;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftId");
                }
                loftPagerAdapter3.f39127b = str2;
                View findViewById2 = inflate.findViewById(C0906R.id.duu);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.viewpager)");
                this.f2905c = (LoftViewPager) findViewById2;
                LoftViewPager loftViewPager = this.f2905c;
                if (loftViewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                }
                LoftPagerAdapter loftPagerAdapter4 = this.g;
                if (loftPagerAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftPagerAdapter");
                }
                loftViewPager.setAdapter(loftPagerAdapter4);
                LoftViewPager loftViewPager2 = this.f2905c;
                if (loftViewPager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                }
                loftViewPager2.addOnPageChangeListener(this);
                if (!this.l) {
                    Context context = activity;
                    if (inflate != null) {
                        ViewGroup viewGroup3 = (ViewGroup) inflate;
                        this.f2906d = new com.ss.android.ugc.aweme.commercialize.loft.c.a(context, viewGroup3, this.l);
                        com.ss.android.ugc.aweme.commercialize.loft.c.a aVar2 = this.f2906d;
                        if (aVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mIntermediateStateViewController");
                        }
                        aVar2.v();
                        com.ss.android.ugc.aweme.commercialize.loft.c.a aVar3 = this.f2906d;
                        if (aVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mIntermediateStateViewController");
                        }
                        e eVar2 = (e) e.m.a(activity);
                        String str3 = this.k;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mLoftId");
                        }
                        aVar3.a(eVar2.a(str3), a.c.VIDEO_PLACEHOLDER, (View.OnClickListener) new b(this, inflate));
                        com.ss.android.ugc.aweme.commercialize.loft.c.a aVar4 = this.f2906d;
                        if (aVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mIntermediateStateViewController");
                        }
                        viewGroup3.addView(aVar4.w());
                        inflate.postDelayed(new c(this, inflate), 1000);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                } else {
                    this.f2907e = new ImageView(activity);
                    ImageView imageView = this.f2907e;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mImage");
                    }
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    if (LoftPlayActivity.a.a() != null) {
                        ImageView imageView2 = this.f2907e;
                        if (imageView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mImage");
                        }
                        imageView2.setImageBitmap(LoftPlayActivity.a.a());
                    }
                    if (inflate != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.topMargin = StatusBarUtils.getStatusBarHeight(getContext());
                        ViewGroup viewGroup4 = (ViewGroup) inflate;
                        ImageView imageView3 = this.f2907e;
                        if (imageView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mImage");
                        }
                        viewGroup4.addView(imageView3, layoutParams);
                        inflate.postDelayed(new d(this, inflate), 100);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
            }
        }
        return inflate;
    }
}

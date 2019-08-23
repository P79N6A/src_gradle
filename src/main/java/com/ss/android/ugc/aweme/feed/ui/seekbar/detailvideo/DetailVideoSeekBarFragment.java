package com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo;

import android.app.Dialog;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.livedata.SlideData;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DispatchTouchEventLinearLayout;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u000eH\u0016J\u0012\u0010*\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010.\u001a\u0004\u0018\u00010\u00162\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00103\u001a\u00020(H\u0016J\b\u00104\u001a\u00020(H\u0016J\u000e\u00105\u001a\u00020(2\u0006\u00106\u001a\u000207J\u001e\u00108\u001a\u00020(2\u0006\u00106\u001a\u0002072\u0006\u00109\u001a\u00020\u001b2\u0006\u0010:\u001a\u000207J\u001a\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0006\u0010=\u001a\u00020(J\u000e\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020\u0004J\u000e\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020\u000eJ\u0010\u0010B\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006E"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DetailVideoSeekBarFragment;", "Lcom/ss/android/ugc/aweme/common/ui/BaseDialogFragment;", "()V", "mBaseListFragmentPanel", "Lcom/ss/android/ugc/aweme/feed/panel/BaseListFragmentPanel;", "mDetailVideoSeekBarControl", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DetailVideoSeekBarControl;", "mDispatchTouchEventLinearLayout", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DispatchTouchEventLinearLayout;", "getMDispatchTouchEventLinearLayout", "()Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DispatchTouchEventLinearLayout;", "setMDispatchTouchEventLinearLayout", "(Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DispatchTouchEventLinearLayout;)V", "mLiveMode", "", "mPreBaseDialogFragment", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DispatchTouchEventLinearLayout$DispatchTouchEventCallBack;", "getMPreBaseDialogFragment", "()Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DispatchTouchEventLinearLayout$DispatchTouchEventCallBack;", "setMPreBaseDialogFragment", "(Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DispatchTouchEventLinearLayout$DispatchTouchEventCallBack;)V", "mRootView", "Landroid/view/View;", "mSlideData", "Lcom/ss/android/ugc/aweme/base/livedata/SlideData;", "mSlideDataObserver", "Landroid/arch/lifecycle/Observer;", "", "mVideoSeekBar", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;", "getMVideoSeekBar", "()Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;", "setMVideoSeekBar", "(Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;)V", "transY", "getTransY", "()Z", "setTransY", "(Z)V", "adapterView", "", "isViewValid", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onHorizontalPageSelected", "position", "", "onPageScrolled", "positionOffset", "positionOffsetPixels", "onViewCreated", "view", "seekBarGone", "setBaseListFragmentPanel", "baseListFragmentPanel", "setLiveMode", "isLive", "setPreBaseDialogFragment", "baseDialogFragment", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DetailVideoSeekBarFragment extends BaseDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46872a;
    public static final a i = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public VideoSeekBar f46873b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public DispatchTouchEventLinearLayout f46874c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public DispatchTouchEventLinearLayout.a f46875d;

    /* renamed from: e  reason: collision with root package name */
    public b f46876e;

    /* renamed from: f  reason: collision with root package name */
    public BaseListFragmentPanel f46877f;
    public View g;
    public boolean h;
    private SlideData j;
    private Observer<Float> k;
    private boolean l;
    private HashMap q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DetailVideoSeekBarFragment$Companion;", "", "()V", "DURATION_VIEW_BOTTOM_MARGIN", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DetailVideoSeekBarFragment$onActivityCreated$1", "Landroid/content/DialogInterface$OnKeyListener;", "onKey", "", "dialog", "Landroid/content/DialogInterface;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46878a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailVideoSeekBarFragment f46879b;

        b(DetailVideoSeekBarFragment detailVideoSeekBarFragment) {
            this.f46879b = detailVideoSeekBarFragment;
        }

        public final boolean onKey(@NotNull DialogInterface dialogInterface, int i, @NotNull KeyEvent keyEvent) {
            DialogInterface dialogInterface2 = dialogInterface;
            KeyEvent keyEvent2 = keyEvent;
            if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i), keyEvent2}, this, f46878a, false, 43533, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i), keyEvent2}, this, f46878a, false, 43533, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
            Intrinsics.checkParameterIsNotNull(keyEvent2, "event");
            if (!this.f46879b.isAdded()) {
                return false;
            }
            DispatchTouchEventLinearLayout.a aVar = this.f46879b.f46875d;
            if (aVar != null) {
                return aVar.a(keyEvent2);
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aFloat", "", "onChanged", "(Ljava/lang/Float;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46880a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailVideoSeekBarFragment f46881b;

        c(DetailVideoSeekBarFragment detailVideoSeekBarFragment) {
            this.f46881b = detailVideoSeekBarFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            VideoSeekBar videoSeekBar;
            Float f2 = (Float) obj;
            if (PatchProxy.isSupport(new Object[]{f2}, this, f46880a, false, 43534, new Class[]{Float.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{f2}, this, f46880a, false, 43534, new Class[]{Float.class}, Void.TYPE);
                return;
            }
            if (f2 != null) {
                DetailVideoSeekBarFragment detailVideoSeekBarFragment = this.f46881b;
                if (PatchProxy.isSupport(new Object[0], detailVideoSeekBarFragment, DetailVideoSeekBarFragment.f46872a, false, 43514, new Class[0], VideoSeekBar.class)) {
                    videoSeekBar = (VideoSeekBar) PatchProxy.accessDispatch(new Object[0], detailVideoSeekBarFragment, DetailVideoSeekBarFragment.f46872a, false, 43514, new Class[0], VideoSeekBar.class);
                } else {
                    videoSeekBar = detailVideoSeekBarFragment.f46873b;
                    if (videoSeekBar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mVideoSeekBar");
                    }
                }
                videoSeekBar.setTranslationX(((float) p.b(this.f46881b.getContext())) * f2.floatValue());
            }
        }
    }

    public final boolean i() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f46872a, false, 43524, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46872a, false, 43524, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (super.i() && getContext() != null) {
            z = true;
        }
        return z;
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f46872a, false, 43529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46872a, false, 43529, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        b bVar = this.f46876e;
        if (bVar != null) {
            if (PatchProxy.isSupport(new Object[0], bVar, b.f3218a, false, 43506, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f3218a, false, 43506, new Class[0], Void.TYPE);
            } else {
                bg.d(bVar);
            }
        }
    }

    public final void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f46872a, false, 43522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46872a, false, 43522, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.k != null) {
            SlideData slideData = this.j;
            if (slideData != null) {
                MutableLiveData<Float> a2 = slideData.a();
                if (a2 != null) {
                    Observer<Float> observer = this.k;
                    if (observer == null) {
                        Intrinsics.throwNpe();
                    }
                    a2.removeObserver(observer);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f46872a, false, 43532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46872a, false, 43532, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.clear();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f46872a, false, 43519, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f46872a, false, 43519, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.sn);
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f46872a, false, 43528, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f46872a, false, 43528, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        Intrinsics.checkExpressionValueIsNotNull(dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(48);
            }
        }
        getDialog().setOnKeyListener(new b(this));
        getDialog().setCanceledOnTouchOutside(false);
        getDialog().setCancelable(false);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f46872a, false, 43530, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f46872a, false, 43530, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.g == null) {
            this.l = z;
        } else {
            View view = this.g;
            if (view != null) {
                if (z) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f46872a, false, 43521, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f46872a, false, 43521, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            this.j = (SlideData) ViewModelProviders.of(activity).get(SlideData.class);
            this.k = new c(this);
            if (this.k != null) {
                SlideData slideData = this.j;
                if (slideData != null) {
                    MutableLiveData<Float> a2 = slideData.a();
                    if (a2 != null) {
                        FragmentActivity activity2 = getActivity();
                        if (activity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        LifecycleOwner lifecycleOwner = activity2;
                        Observer<Float> observer = this.k;
                        if (observer == null) {
                            Intrinsics.throwNpe();
                        }
                        a2.observe(lifecycleOwner, observer);
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f46872a, false, 43523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46872a, false, 43523, new Class[0], Void.TYPE);
        } else if (i() && com.ss.android.ugc.aweme.profile.a.d()) {
            DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout = this.f46874c;
            if (dispatchTouchEventLinearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDispatchTouchEventLinearLayout");
            }
            ViewGroup.LayoutParams layoutParams = dispatchTouchEventLinearLayout.getLayoutParams();
            layoutParams.height += u.a(11.0d);
            DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout2 = this.f46874c;
            if (dispatchTouchEventLinearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDispatchTouchEventLinearLayout");
            }
            dispatchTouchEventLinearLayout2.setLayoutParams(layoutParams);
        }
        a(this.l);
    }

    public final void a(int i2, float f2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f46872a, false, 43525, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f46872a, false, 43525, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.f46876e;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup viewGroup2;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup3 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup3, bundle}, this, f46872a, false, 43520, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup3, bundle}, this, f46872a, false, 43520, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getActivity()).inflate(C0906R.layout.nh, viewGroup3, false);
        this.g = inflate;
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        VideoSeekBar videoSeekBar = (VideoSeekBar) inflate.findViewById(C0906R.id.dsu);
        Intrinsics.checkExpressionValueIsNotNull(videoSeekBar, "view.video_seek_bar");
        this.f46873b = videoSeekBar;
        DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout = (DispatchTouchEventLinearLayout) inflate.findViewById(C0906R.id.ms);
        Intrinsics.checkExpressionValueIsNotNull(dispatchTouchEventLinearLayout, "view.bottom_space");
        this.f46874c = dispatchTouchEventLinearLayout;
        if (this.h) {
            DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout2 = this.f46874c;
            if (dispatchTouchEventLinearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDispatchTouchEventLinearLayout");
            }
            ViewGroup.LayoutParams layoutParams2 = dispatchTouchEventLinearLayout2.getLayoutParams();
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) UIUtils.dip2Px(getContext(), 13.0f);
                DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout3 = this.f46874c;
                if (dispatchTouchEventLinearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDispatchTouchEventLinearLayout");
                }
                dispatchTouchEventLinearLayout3.setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        Dialog dialog = getDialog();
        Intrinsics.checkExpressionValueIsNotNull(dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (window != null) {
            window.setSoftInputMode(34);
        }
        if (window != null) {
            window.addFlags(32);
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        if (window != null) {
            window.setGravity(80);
        }
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout4 = this.f46874c;
        if (dispatchTouchEventLinearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDispatchTouchEventLinearLayout");
        }
        dispatchTouchEventLinearLayout4.setDispatchTouchEventCallBack(this.f46875d);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            viewGroup2 = (ViewGroup) activity.findViewById(16908290);
        } else {
            viewGroup2 = null;
        }
        View inflate2 = LayoutInflater.from(getActivity()).inflate(C0906R.layout.ij, null, false);
        if (inflate2 != null) {
            LinearLayout linearLayout = (LinearLayout) inflate2;
            if (viewGroup2 != null) {
                viewGroup2.addView(linearLayout);
            }
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                layoutParams3.width = -1;
                layoutParams3.height = -2;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 80;
                layoutParams4.bottomMargin = (int) com.bytedance.ad.symphony.g.c.a(getActivity(), 116.0f);
                linearLayout.setLayoutParams(layoutParams3);
            }
            VideoSeekBar videoSeekBar2 = this.f46873b;
            if (videoSeekBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoSeekBar");
            }
            this.f46876e = new b(videoSeekBar2, linearLayout, this.f46877f);
            BaseListFragmentPanel baseListFragmentPanel = this.f46877f;
            if (baseListFragmentPanel != null) {
                b bVar = this.f46876e;
                if (bVar != null) {
                    bVar.p = baseListFragmentPanel.ag();
                }
                b bVar2 = this.f46876e;
                if (bVar2 != null) {
                    bVar2.onFullFeedVideoChangeEvent(new com.ss.android.ugc.aweme.feed.ui.seekbar.a(baseListFragmentPanel.ag(), baseListFragmentPanel.f(), baseListFragmentPanel.bh(), baseListFragmentPanel));
                }
            }
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }
}

package com.ss.android.ugc.aweme.main.guide;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.feed.f.aq;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017J\b\u0010\u0019\u001a\u00020\u000eH\u0003J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guide/StoryGuideDialogFragment;", "Landroid/support/v4/app/DialogFragment;", "()V", "mAnimationImageView", "Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "mDmtButton", "Landroid/widget/TextView;", "mLinearLayout", "Landroid/widget/LinearLayout;", "mRootview", "Landroid/view/View;", "mTextView1", "mTextView2", "dismiss", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showGuide", "startAnim", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryGuideDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54785a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f54786b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f54787c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f54788d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f54789e;

    /* renamed from: f  reason: collision with root package name */
    private AnimationImageView f54790f;
    private View g;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54791a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryGuideDialogFragment f54792b;

        a(StoryGuideDialogFragment storyGuideDialogFragment) {
            this.f54792b = storyGuideDialogFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54791a, false, 58104, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54791a, false, 58104, new Class[0], Void.TYPE);
                return;
            }
            StoryGuideDialogFragment.super.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54793a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryGuideDialogFragment f54794b;

        b(StoryGuideDialogFragment storyGuideDialogFragment) {
            this.f54794b = storyGuideDialogFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f54793a, false, 58105, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f54793a, false, 58105, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        TextView textView = this.f54794b.f54786b;
                        if (textView == null) {
                            Intrinsics.throwNpe();
                        }
                        textView.animate().alpha(0.5f).setDuration(150).start();
                        break;
                    case 1:
                        break;
                }
            }
            TextView textView2 = this.f54794b.f54786b;
            if (textView2 == null) {
                Intrinsics.throwNpe();
            }
            textView2.animate().alpha(1.0f).setDuration(150).start();
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryGuideDialogFragment f54796b;

        c(StoryGuideDialogFragment storyGuideDialogFragment) {
            this.f54796b = storyGuideDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f54795a, false, 58106, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f54795a, false, 58106, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f54796b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryGuideDialogFragment f54798b;

        d(StoryGuideDialogFragment storyGuideDialogFragment) {
            this.f54798b = storyGuideDialogFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f54797a, false, 58107, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f54797a, false, 58107, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 0:
                    TextView textView = this.f54798b.f54786b;
                    if (textView == null) {
                        Intrinsics.throwNpe();
                    }
                    textView.animate().alpha(0.75f).setDuration(150).start();
                    break;
                case 1:
                    TextView textView2 = this.f54798b.f54786b;
                    if (textView2 == null) {
                        Intrinsics.throwNpe();
                    }
                    textView2.animate().alpha(1.0f).setDuration(150).start();
                    break;
            }
            return true;
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f54785a, false, 58103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54785a, false, 58103, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f54785a, false, 58100, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54785a, false, 58100, new Class[0], Void.TYPE);
            return;
        }
        View view = this.g;
        if (view == null) {
            Intrinsics.throwNpe();
        }
        an.a(view, 1.0f, 0.0f, 200);
        bg.a(new aq());
        View view2 = this.g;
        if (view2 != null) {
            view2.postDelayed(new a(this), 200);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f54785a, false, 58096, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f54785a, false, 58096, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 16973840);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f54785a, false, 58098, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f54785a, false, 58098, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0906R.color.a7l)));
            }
        }
        this.f54787c = (TextView) view.findViewById(C0906R.id.d05);
        this.f54788d = (TextView) view.findViewById(C0906R.id.d06);
        this.f54786b = (TextView) view.findViewById(C0906R.id.ph);
        this.f54789e = (LinearLayout) view.findViewById(C0906R.id.bi6);
        this.g = view.findViewById(C0906R.id.ci6);
        this.f54790f = (AnimationImageView) view.findViewById(C0906R.id.bkv);
        if (PatchProxy.isSupport(new Object[0], this, f54785a, false, 58099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54785a, false, 58099, new Class[0], Void.TYPE);
        } else {
            View view2 = this.g;
            if (view2 == null) {
                Intrinsics.throwNpe();
            }
            an.a(view2, 0.0f, 1.0f, 200);
            if (PatchProxy.isSupport(new Object[0], this, f54785a, false, 58101, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54785a, false, 58101, new Class[0], Void.TYPE);
            } else {
                AnimationImageView animationImageView = this.f54790f;
                if (animationImageView == null) {
                    Intrinsics.throwNpe();
                }
                animationImageView.setImageAssetsFolder("images");
                AnimationImageView animationImageView2 = this.f54790f;
                if (animationImageView2 == null) {
                    Intrinsics.throwNpe();
                }
                animationImageView2.setAnimation("story_feed_guide.json");
                AnimationImageView animationImageView3 = this.f54790f;
                if (animationImageView3 == null) {
                    Intrinsics.throwNpe();
                }
                animationImageView3.playAnimation();
                AnimationImageView animationImageView4 = this.f54790f;
                if (animationImageView4 == null) {
                    Intrinsics.throwNpe();
                }
                animationImageView4.loop(false);
            }
            if (!o.v()) {
                o.b().h();
            } else {
                com.ss.android.ugc.playerkit.videoview.a.a().T();
            }
            TextView textView = this.f54786b;
            if (textView == null) {
                Intrinsics.throwNpe();
            }
            textView.setOnTouchListener(new d(this));
        }
        TextView textView2 = this.f54786b;
        if (textView2 == null) {
            Intrinsics.throwNpe();
        }
        textView2.setOnTouchListener(new b(this));
        View view3 = this.g;
        if (view3 == null) {
            Intrinsics.throwNpe();
        }
        view3.setOnClickListener(new c(this));
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f54785a, false, 58097, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f54785a, false, 58097, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.qk, viewGroup2, false);
    }
}

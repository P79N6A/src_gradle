package com.ss.android.ugc.aweme.main.guide;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextPaint;
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
import com.ss.android.ugc.aweme.main.by;
import com.ss.android.ugc.aweme.main.c.d;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017J\b\u0010\u001d\u001a\u00020\u000eH\u0003J\b\u0010\u001e\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guide/FriendTabGuideDialogFragment;", "Landroid/support/v4/app/DialogFragment;", "()V", "mAnimationImageView", "Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "mDmtButton", "Landroid/widget/TextView;", "mLinearLayout", "Landroid/widget/LinearLayout;", "mRootView", "Landroid/view/View;", "mTextView", "mTextView1", "dismiss", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onScrollPublishEvent", "event", "Lcom/ss/android/ugc/aweme/main/event/Scroll2StoryPublishPageEvent;", "onViewCreated", "view", "showGuide", "startAnim", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendTabGuideDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3558a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f3559b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f3560c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f3561d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f3562e;

    /* renamed from: f  reason: collision with root package name */
    private AnimationImageView f3563f;
    private View g;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendTabGuideDialogFragment f54776b;

        a(FriendTabGuideDialogFragment friendTabGuideDialogFragment) {
            this.f54776b = friendTabGuideDialogFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f54775a, false, 58074, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f54775a, false, 58074, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        TextView textView = this.f54776b.f3559b;
                        if (textView == null) {
                            Intrinsics.throwNpe();
                        }
                        textView.animate().alpha(0.5f).setDuration(150).start();
                        break;
                    case 1:
                        break;
                }
            }
            TextView textView2 = this.f54776b.f3559b;
            if (textView2 == null) {
                Intrinsics.throwNpe();
            }
            textView2.animate().alpha(1.0f).setDuration(150).start();
            TextView textView3 = this.f54776b.f3559b;
            if (textView3 == null) {
                Intrinsics.throwNpe();
            }
            textView3.postDelayed(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54777a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f54778b;

                {
                    this.f54778b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f54777a, false, 58075, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f54777a, false, 58075, new Class[0], Void.TYPE);
                        return;
                    }
                    this.f54778b.f54776b.dismiss();
                }
            }, 150);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendTabGuideDialogFragment f54780b;

        b(FriendTabGuideDialogFragment friendTabGuideDialogFragment) {
            this.f54780b = friendTabGuideDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f54779a, false, 58076, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f54779a, false, 58076, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f54780b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54781a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendTabGuideDialogFragment f54782b;

        c(FriendTabGuideDialogFragment friendTabGuideDialogFragment) {
            this.f54782b = friendTabGuideDialogFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f54781a, false, 58077, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f54781a, false, 58077, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 0:
                    TextView textView = this.f54782b.f3559b;
                    if (textView == null) {
                        Intrinsics.throwNpe();
                    }
                    textView.animate().alpha(0.75f).setDuration(150).start();
                    break;
                case 1:
                    TextView textView2 = this.f54782b.f3559b;
                    if (textView2 == null) {
                        Intrinsics.throwNpe();
                    }
                    textView2.animate().alpha(1.0f).setDuration(150).start();
                    break;
            }
            return true;
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f3558a, false, 58068, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3558a, false, 58068, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3558a, false, 58071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3558a, false, 58071, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        by.c();
        bg.d(this);
        if (PatchProxy.isSupport(new Object[0], this, f3558a, false, 58073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3558a, false, 58073, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3558a, false, 58064, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3558a, false, 58064, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 16973840);
    }

    @Subscribe
    public final void onScrollPublishEvent(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3558a, false, 58069, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3558a, false, 58069, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "event");
        Dialog dialog = getDialog();
        Intrinsics.checkExpressionValueIsNotNull(dialog, "dialog");
        if (dialog.isShowing()) {
            dismiss();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3558a, false, 58066, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3558a, false, 58066, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        bg.c(this);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0906R.color.a7l)));
            }
        }
        this.f3560c = (TextView) view.findViewById(C0906R.id.d05);
        this.f3561d = (TextView) view.findViewById(C0906R.id.text);
        this.f3559b = (TextView) view.findViewById(C0906R.id.ph);
        this.f3562e = (LinearLayout) view.findViewById(C0906R.id.bi6);
        this.f3563f = (AnimationImageView) view.findViewById(C0906R.id.bkv);
        this.g = view.findViewById(C0906R.id.ci6);
        TextView textView = this.f3561d;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3558a, false, 58067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3558a, false, 58067, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f3558a, false, 58070, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3558a, false, 58070, new Class[0], Void.TYPE);
            } else {
                AnimationImageView animationImageView = this.f3563f;
                if (animationImageView == null) {
                    Intrinsics.throwNpe();
                }
                animationImageView.setImageAssetsFolder("images");
                AnimationImageView animationImageView2 = this.f3563f;
                if (animationImageView2 == null) {
                    Intrinsics.throwNpe();
                }
                animationImageView2.setAnimation("story_feed_guide.json");
                AnimationImageView animationImageView3 = this.f3563f;
                if (animationImageView3 == null) {
                    Intrinsics.throwNpe();
                }
                animationImageView3.playAnimation();
                AnimationImageView animationImageView4 = this.f3563f;
                if (animationImageView4 == null) {
                    Intrinsics.throwNpe();
                }
                animationImageView4.loop(false);
            }
            View view2 = this.g;
            if (view2 == null) {
                Intrinsics.throwNpe();
            }
            an.a(view2, 0.0f, 1.0f, 200);
            TextView textView2 = this.f3559b;
            if (textView2 == null) {
                Intrinsics.throwNpe();
            }
            textView2.setOnTouchListener(new c(this));
        }
        TextView textView3 = this.f3559b;
        if (textView3 == null) {
            Intrinsics.throwNpe();
        }
        textView3.setOnTouchListener(new a(this));
        View view3 = this.g;
        if (view3 == null) {
            Intrinsics.throwNpe();
        }
        view3.setOnClickListener(new b(this));
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3558a, false, 58065, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3558a, false, 58065, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.ob, viewGroup2, false);
    }
}

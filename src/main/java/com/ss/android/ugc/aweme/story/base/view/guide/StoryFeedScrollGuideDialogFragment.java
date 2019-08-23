package com.ss.android.ugc.aweme.story.base.view.guide;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0018\u001a\u00020\fH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/view/guide/StoryFeedScrollGuideDialogFragment;", "Landroid/support/v4/app/DialogFragment;", "()V", "mAnimationImageView1", "Landroid/widget/ImageView;", "mRootView", "Landroid/view/View;", "mTextView1", "Landroid/widget/TextView;", "onDismissCallBack", "Lcom/ss/android/ugc/aweme/story/base/view/guide/StoryFeedScrollGuideDialogFragment$OnDismissCallBack;", "dismiss", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setOnDimissCallBack", "showGuide", "OnDismissCallBack", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryFeedScrollGuideDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72042a;

    /* renamed from: b  reason: collision with root package name */
    View f72043b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f72044c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f72045d;

    /* renamed from: e  reason: collision with root package name */
    private a f72046e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f72047f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/view/guide/StoryFeedScrollGuideDialogFragment$OnDismissCallBack;", "", "onDismiss", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedScrollGuideDialogFragment f72049b;

        b(StoryFeedScrollGuideDialogFragment storyFeedScrollGuideDialogFragment) {
            this.f72049b = storyFeedScrollGuideDialogFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72048a, false, 82557, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72048a, false, 82557, new Class[0], Void.TYPE);
                return;
            }
            StoryFeedScrollGuideDialogFragment.super.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedScrollGuideDialogFragment f72051b;

        c(StoryFeedScrollGuideDialogFragment storyFeedScrollGuideDialogFragment) {
            this.f72051b = storyFeedScrollGuideDialogFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72050a, false, 82558, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72050a, false, 82558, new Class[0], Void.TYPE);
                return;
            }
            StoryFeedScrollGuideDialogFragment storyFeedScrollGuideDialogFragment = this.f72051b;
            if (PatchProxy.isSupport(new Object[0], storyFeedScrollGuideDialogFragment, StoryFeedScrollGuideDialogFragment.f72042a, false, 82553, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyFeedScrollGuideDialogFragment, StoryFeedScrollGuideDialogFragment.f72042a, false, 82553, new Class[0], Void.TYPE);
                return;
            }
            View view = storyFeedScrollGuideDialogFragment.f72043b;
            if (view != null) {
                com.ss.android.ugc.aweme.story.base.view.a.a.a(view, 0.0f, 1.0f, 200);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72052a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedScrollGuideDialogFragment f72053b;

        d(StoryFeedScrollGuideDialogFragment storyFeedScrollGuideDialogFragment) {
            this.f72053b = storyFeedScrollGuideDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f72052a, false, 82559, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f72052a, false, 82559, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f72053b.dismiss();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f72042a, false, 82556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72042a, false, 82556, new Class[0], Void.TYPE);
            return;
        }
        if (this.f72047f != null) {
            this.f72047f.clear();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f72042a, false, 82552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72042a, false, 82552, new Class[0], Void.TYPE);
            return;
        }
        try {
            View view = this.f72043b;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            com.ss.android.ugc.aweme.story.base.view.a.a.a(view, 1.0f, 0.0f, 200);
            View view2 = this.f72043b;
            if (view2 != null) {
                view2.postDelayed(new b(this), 200);
            }
            a aVar = this.f72046e;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception unused) {
        }
    }

    public final void a(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f72042a, false, 82554, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f72042a, false, 82554, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "onDismissCallBack");
        this.f72046e = aVar2;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f72042a, false, 82549, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f72042a, false, 82549, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 16973840);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f72042a, false, 82551, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f72042a, false, 82551, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
                window.setFlags(1024, 1024);
                window.setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0906R.color.a7l)));
            }
        }
        this.f72044c = (TextView) view.findViewById(C0906R.id.dcl);
        this.f72045d = (ImageView) view.findViewById(C0906R.id.b1p);
        this.f72043b = view.findViewById(C0906R.id.ci6);
        TextView textView = this.f72044c;
        if (textView != null) {
            textView.post(new c(this));
        }
        view.setOnClickListener(new d(this));
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f72042a, false, 82550, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f72042a, false, 82550, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.a8y, viewGroup2, false);
    }
}

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u001a\u001a\u00020\u000eH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/view/guide/StoryFeedClickGuideDialogFragment;", "Landroid/support/v4/app/DialogFragment;", "()V", "mAnimationImageView1", "Landroid/widget/ImageView;", "mAnimationImageView2", "mRootView", "Landroid/view/View;", "mTextView1", "Landroid/widget/TextView;", "mTextView2", "onDismissCallBack", "Lcom/ss/android/ugc/aweme/story/base/view/guide/StoryFeedClickGuideDialogFragment$OnDismissCallBack;", "dismiss", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setOnDimissCallBack", "showGuide", "OnDismissCallBack", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryFeedClickGuideDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72030a;

    /* renamed from: b  reason: collision with root package name */
    View f72031b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f72032c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f72033d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f72034e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f72035f;
    private a g;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/view/guide/StoryFeedClickGuideDialogFragment$OnDismissCallBack;", "", "onDismiss", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedClickGuideDialogFragment f72037b;

        b(StoryFeedClickGuideDialogFragment storyFeedClickGuideDialogFragment) {
            this.f72037b = storyFeedClickGuideDialogFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72036a, false, 82546, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72036a, false, 82546, new Class[0], Void.TYPE);
                return;
            }
            try {
                StoryFeedClickGuideDialogFragment.super.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedClickGuideDialogFragment f72039b;

        c(StoryFeedClickGuideDialogFragment storyFeedClickGuideDialogFragment) {
            this.f72039b = storyFeedClickGuideDialogFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72038a, false, 82547, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72038a, false, 82547, new Class[0], Void.TYPE);
                return;
            }
            StoryFeedClickGuideDialogFragment storyFeedClickGuideDialogFragment = this.f72039b;
            if (PatchProxy.isSupport(new Object[0], storyFeedClickGuideDialogFragment, StoryFeedClickGuideDialogFragment.f72030a, false, 82542, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyFeedClickGuideDialogFragment, StoryFeedClickGuideDialogFragment.f72030a, false, 82542, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.story.base.view.a.a.a(storyFeedClickGuideDialogFragment.f72031b, 0.0f, 1.0f, 200);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedClickGuideDialogFragment f72041b;

        d(StoryFeedClickGuideDialogFragment storyFeedClickGuideDialogFragment) {
            this.f72041b = storyFeedClickGuideDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f72040a, false, 82548, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f72040a, false, 82548, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f72041b.dismiss();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f72030a, false, 82545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72030a, false, 82545, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f72030a, false, 82541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72030a, false, 82541, new Class[0], Void.TYPE);
            return;
        }
        try {
            View view = this.f72031b;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            com.ss.android.ugc.aweme.story.base.view.a.a.a(view, 1.0f, 0.0f, 200);
            View view2 = this.f72031b;
            if (view2 != null) {
                view2.postDelayed(new b(this), 200);
            }
            a aVar = this.g;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception unused) {
        }
    }

    public final void a(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f72030a, false, 82543, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f72030a, false, 82543, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "onDismissCallBack");
        this.g = aVar2;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f72030a, false, 82538, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f72030a, false, 82538, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 16973840);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f72030a, false, 82540, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f72030a, false, 82540, new Class[]{View.class, Bundle.class}, Void.TYPE);
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
        this.f72032c = (TextView) view.findViewById(C0906R.id.dcl);
        this.f72033d = (TextView) view.findViewById(C0906R.id.dcm);
        this.f72034e = (ImageView) view.findViewById(C0906R.id.b1p);
        this.f72035f = (ImageView) view.findViewById(C0906R.id.b1q);
        this.f72031b = view.findViewById(C0906R.id.ci6);
        TextView textView = this.f72032c;
        if (textView != null) {
            textView.post(new c(this));
        }
        view.setOnClickListener(new d(this));
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f72030a, false, 82539, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f72030a, false, 82539, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.a8x, viewGroup2, false);
    }
}

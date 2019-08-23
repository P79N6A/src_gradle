package com.ss.android.ugc.aweme.share.invitefriends.textcode;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.c.h;
import com.ss.android.ugc.aweme.share.c.i;
import com.ss.android.ugc.aweme.share.invitefriends.textcode.a;
import com.ss.android.ugc.aweme.u.ae;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020 J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0015H\u0016J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u001cJ\u0012\u0010&\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020 H\u0016J\u0012\u0010*\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020 H\u0016J\b\u0010.\u001a\u00020 H\u0016J\u0012\u0010/\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020 H\u0016J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u0006H\u0016J\u0010\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/share/invitefriends/textcode/TextTokenShareDialog;", "Landroid/app/Dialog;", "Lcom/ss/android/ugc/aweme/share/invitefriends/textcode/IInviteFriendsWithTextContract$View;", "context", "Landroid/content/Context;", "mEnterFrom", "", "(Landroid/content/Context;Ljava/lang/String;)V", "mActivity", "Landroid/app/Activity;", "mAvatarImageView", "Lcom/ss/android/ugc/aweme/base/ui/AvatarWithBorderView;", "mChannelId", "", "mDelegate", "Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate;", "getMDelegate", "()Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate;", "mDelegate$delegate", "Lkotlin/Lazy;", "mIsViewValid", "", "mPresenter", "Lcom/ss/android/ugc/aweme/share/invitefriends/textcode/InviteFriendsWithTextTokenPresenter;", "getMPresenter", "()Lcom/ss/android/ugc/aweme/share/invitefriends/textcode/InviteFriendsWithTextTokenPresenter;", "mPresenter$delegate", "mRootView", "Landroid/view/View;", "mTextTokenTextView", "Landroid/widget/TextView;", "dismiss", "", "initView", "isAutoMode", "isViewValid", "onClick", "view", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetachedFromWindow", "setGenerateFailState", "tr", "", "setGeneratedOKState", "setGeneratingState", "setPresenter", "presenter", "Lcom/ss/android/ugc/aweme/share/basic/texttoken/ITextTokenDialogContract$Presenter;", "show", "showDummyTextToken", "dummyTextToken", "showTextToken", "textToken", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends Dialog implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65196a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f65197b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(d.class), "mPresenter", "getMPresenter()Lcom/ss/android/ugc/aweme/share/invitefriends/textcode/InviteFriendsWithTextTokenPresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(d.class), "mDelegate", "getMDelegate()Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate;"))};

    /* renamed from: c  reason: collision with root package name */
    public View f65198c;

    /* renamed from: d  reason: collision with root package name */
    final Activity f65199d;

    /* renamed from: e  reason: collision with root package name */
    int f65200e;

    /* renamed from: f  reason: collision with root package name */
    final String f65201f;
    private AvatarWithBorderView g;
    private TextView h;
    private boolean i;
    private final Lazy j = LazyKt.lazy(new e(this));
    private final Lazy k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65202a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f65203b;

        a(d dVar) {
            this.f65203b = dVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f65202a, false, 73638, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65202a, false, 73638, new Class[0], Void.TYPE);
                return;
            }
            e.a(this.f65203b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 15})
    static final class b implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f65205b;

        b(d dVar) {
            this.f65205b = dVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f65204a, false, 73639, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f65204a, false, 73639, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f65205b.d().a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class c implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65206a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f65207b;

        c(d dVar) {
            this.f65207b = dVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f65206a, false, 73640, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f65206a, false, 73640, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f65207b.d().d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.share.invitefriends.textcode.d$d  reason: collision with other inner class name */
    static final class C0704d extends Lambda implements Function0<com.ss.android.ugc.aweme.share.invitefriends.a> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0704d(d dVar, Context context) {
            super(0);
            this.this$0 = dVar;
            this.$context = context;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.share.invitefriends.a invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73641, new Class[0], com.ss.android.ugc.aweme.share.invitefriends.a.class)) {
                return (com.ss.android.ugc.aweme.share.invitefriends.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73641, new Class[0], com.ss.android.ugc.aweme.share.invitefriends.a.class);
            }
            Context context = this.$context;
            Dialog dialog = this.this$0;
            View view = this.this$0.f65198c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            com.ss.android.ugc.aweme.share.invitefriends.a aVar = new com.ss.android.ugc.aweme.share.invitefriends.a(context, dialog, view, new Function1<View, Unit>(this.this$0) {
                public static ChangeQuickRedirect changeQuickRedirect;

                public final String getName() {
                    return "onClick";
                }

                public final KDeclarationContainer getOwner() {
                    if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73643, new Class[0], KDeclarationContainer.class)) {
                        return Reflection.getOrCreateKotlinClass(d.class);
                    }
                    return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73643, new Class[0], KDeclarationContainer.class);
                }

                public final String getSignature() {
                    return "onClick(Landroid/view/View;)V";
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((View) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull View view) {
                    View view2 = view;
                    int i = 1;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 73642, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 73642, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(view2, "p1");
                    d dVar = (d) this.receiver;
                    if (PatchProxy.isSupport(new Object[]{view2}, dVar, d.f65196a, false, 73633, new Class[]{View.class}, Void.TYPE)) {
                        d dVar2 = dVar;
                        PatchProxy.accessDispatch(new Object[]{view2}, dVar2, d.f65196a, false, 73633, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(view2, "view");
                    if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        int id = view.getId();
                        if (id == C0906R.id.a4p || id == C0906R.id.a4m) {
                            if (view.getId() == C0906R.id.a4p) {
                                i = 0;
                            }
                            dVar.f65200e = i;
                            if (dVar.d().b()) {
                                new h(dVar.f65199d).a(dVar.f65200e).a().a(dVar.d().c()).c().a();
                                dVar.dismiss();
                            } else {
                                dVar.d().a();
                            }
                            r.a("add_profile_friends", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", dVar.f65201f).a("platform", i.a(dVar.f65200e)).f34114b);
                        } else if (id == C0906R.id.cva) {
                            if (!dVar.d().b()) {
                                dVar.d().a();
                            }
                        } else if (id == C0906R.id.ti) {
                            dVar.dismiss();
                        }
                    }
                }
            }, false, 16);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/share/invitefriends/textcode/InviteFriendsWithTextTokenPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<c> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @NotNull
        public final c invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73644, new Class[0], c.class)) {
                return new c(this.this$0);
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73644, new Class[0], c.class);
        }
    }

    private final com.ss.android.ugc.aweme.share.invitefriends.a e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f65196a, false, 73625, new Class[0], com.ss.android.ugc.aweme.share.invitefriends.a.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f65196a, false, 73625, new Class[0], com.ss.android.ugc.aweme.share.invitefriends.a.class);
        } else {
            value = this.k.getValue();
        }
        return (com.ss.android.ugc.aweme.share.invitefriends.a) value;
    }

    public final c d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f65196a, false, 73624, new Class[0], c.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f65196a, false, 73624, new Class[0], c.class);
        } else {
            value = this.j.getValue();
        }
        return (c) value;
    }

    public final boolean c() {
        return this.i;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65196a, false, 73630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65196a, false, 73630, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextTokenTextView");
        }
        textView.setAlpha(0.34f);
        textView.setPadding(0, 0, 0, 0);
        e().b(0);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f65196a, false, 73636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65196a, false, 73636, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.i = false;
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f65196a, false, 73634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65196a, false, 73634, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        com.ss.android.ugc.aweme.share.invitefriends.a e2 = e();
        View view = this.f65198c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        e2.a(true, view);
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f65196a, false, 73635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65196a, false, 73635, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.share.invitefriends.a e2 = e();
        View view = this.f65198c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        e2.a(false, view);
        new Handler().postDelayed(new a(this), 100);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65196a, false, 73631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65196a, false, 73631, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextTokenTextView");
        }
        textView.setAlpha(1.0f);
        textView.setPadding(0, 0, 0, 0);
        e().c(0);
        new ae().a(this.f65201f).b(i.a(this.f65200e)).c("code").e();
        r.a("qr_code_generate", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", this.f65201f).a("platform", i.a(this.f65200e)).a("qr_code_type", "code").f34114b);
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65196a, false, 73628, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f65196a, false, 73628, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "dummyTextToken");
        TextView textView = this.h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextTokenTextView");
        }
        textView.setText(str2);
    }

    public final void b(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65196a, false, 73629, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f65196a, false, 73629, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "textToken");
        TextView textView = this.h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextTokenTextView");
        }
        textView.setText(str2);
    }

    public final void a(@Nullable Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f65196a, false, 73632, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f65196a, false, 73632, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        TextView textView = this.h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextTokenTextView");
        }
        textView.setAlpha(1.0f);
        textView.setPadding(0, (int) UIUtils.dip2Px(textView.getContext(), 4.0f), 0, 0);
        e().d(0);
        if (th2 != null) {
            com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), th2);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f65196a, false, 73626, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f65196a, false, 73626, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.js);
        if (PatchProxy.isSupport(new Object[0], this, f65196a, false, 73627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65196a, false, 73627, new Class[0], Void.TYPE);
        } else {
            if (getWindow() != null) {
                setCanceledOnTouchOutside(true);
            }
            View findViewById = findViewById(C0906R.id.a4n);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.dialog_root)");
            this.f65198c = findViewById;
            View findViewById2 = findViewById(C0906R.id.ayr);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.iv_avatar)");
            this.g = (AvatarWithBorderView) findViewById2;
            View findViewById3 = findViewById(C0906R.id.d20);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.text_token)");
            this.h = (TextView) findViewById3;
            TextView textView = this.h;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextTokenTextView");
            }
            try {
                Context context = textView.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "DINCond-BoldAlternate.otf"));
            } catch (Exception unused) {
            }
            e().a(0);
            setOnShowListener(new b(this));
            setOnDismissListener(new c(this));
            AvatarWithBorderView avatarWithBorderView = this.g;
            if (avatarWithBorderView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAvatarImageView");
            }
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            User curUser = a2.getCurUser();
            Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
            com.ss.android.ugc.aweme.base.c.b(avatarWithBorderView, curUser.getAvatarThumb());
        }
        this.i = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, @NotNull String str) {
        super(context, C0906R.style.su);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "mEnterFrom");
        this.f65201f = str;
        this.f65199d = (Activity) context;
        this.k = LazyKt.lazy(new C0704d(this, context));
    }
}

package com.ss.android.ugc.aweme.im.sdk.group.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupTipsDialog;", "Landroid/support/v7/app/AppCompatDialog;", "builder", "Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupTipsDialog$Builder;", "(Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupTipsDialog$Builder;)V", "getBuilder", "()Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupTipsDialog$Builder;", "mCancelBtn", "Lcom/bytedance/ies/dmt/ui/widget/DmtButton;", "kotlin.jvm.PlatformType", "mConfirmBtn", "mContentTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mRootView", "Landroid/view/View;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Builder", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupTipsDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51630a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final a f51631b;

    /* renamed from: c  reason: collision with root package name */
    private final View f51632c;

    /* renamed from: d  reason: collision with root package name */
    private final DmtTextView f51633d = ((DmtTextView) this.f51632c.findViewById(C0906R.id.yp));

    /* renamed from: e  reason: collision with root package name */
    private final DmtButton f51634e = ((DmtButton) this.f51632c.findViewById(C0906R.id.q2));

    /* renamed from: f  reason: collision with root package name */
    private final DmtButton f51635f = ((DmtButton) this.f51632c.findViewById(C0906R.id.y0));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J+\u0010\u000b\u001a\u00020\u00002#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J+\u0010\u0019\u001a\u00020\u00002#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fJ\u0010\u0010\u0002\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u0006\u0010!\u001a\u00020\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR7\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR7\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupTipsDialog$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cancel", "", "getCancel", "()Ljava/lang/String;", "setCancel", "(Ljava/lang/String;)V", "cancelAction", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "getCancelAction", "()Lkotlin/jvm/functions/Function1;", "setCancelAction", "(Lkotlin/jvm/functions/Function1;)V", "confirm", "getConfirm", "setConfirm", "confirmAction", "getConfirmAction", "setConfirmAction", "content", "getContent", "setContent", "getContext", "()Landroid/content/Context;", "create", "Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupTipsDialog;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51636a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String f51637b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String f51638c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f51639d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public Function1<? super View, Unit> f51640e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public Function1<? super View, Unit> f51641f;
        @NotNull
        public final Context g;

        public a(@NotNull Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.g = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupTipsDialog f51643b;

        b(GroupTipsDialog groupTipsDialog) {
            this.f51643b = groupTipsDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51642a, false, 52320, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51642a, false, 52320, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function1<? super View, Unit> function1 = this.f51643b.f51631b.f51640e;
            if (function1 != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                function1.invoke(view);
            }
            this.f51643b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupTipsDialog f51645b;

        c(GroupTipsDialog groupTipsDialog) {
            this.f51645b = groupTipsDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51644a, false, 52321, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51644a, false, 52321, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function1<? super View, Unit> function1 = this.f51645b.f51631b.f51641f;
            if (function1 != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                function1.invoke(view);
            }
            this.f51645b.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupTipsDialog(@NotNull a aVar) {
        super(aVar.g);
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.f51631b = aVar;
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.a4p, null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…_group_tips_dialog, null)");
        this.f51632c = inflate;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51630a, false, 52318, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51630a, false, 52318, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f51632c);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        String str = this.f51631b.f51637b;
        if (str != null) {
            DmtTextView dmtTextView = this.f51633d;
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mContentTv");
            dmtTextView.setText(str);
        }
        String str2 = this.f51631b.f51638c;
        if (str2 != null) {
            DmtButton dmtButton = this.f51635f;
            Intrinsics.checkExpressionValueIsNotNull(dmtButton, "mConfirmBtn");
            dmtButton.setText(str2);
        }
        String str3 = this.f51631b.f51639d;
        if (str3 != null) {
            DmtButton dmtButton2 = this.f51634e;
            Intrinsics.checkExpressionValueIsNotNull(dmtButton2, "mCancelBtn");
            dmtButton2.setText(str3);
        }
        this.f51634e.setOnClickListener(new b(this));
        this.f51635f.setOnClickListener(new c(this));
    }
}

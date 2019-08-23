package com.ss.android.ugc.aweme.im.sdk.group.view;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 H2\u00020\u0001:\u0001HB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u00108\u001a\u000209H\u0002J\u001c\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010\u00052\b\u0010<\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010=\u001a\u000209H\u0002J\b\u0010>\u001a\u000209H\u0002J\b\u0010?\u001a\u000209H\u0002J\u0012\u0010@\u001a\u0002092\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J\b\u0010C\u001a\u000209H\u0002J\u001a\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020\u00072\b\u0010F\u001a\u0004\u0018\u00010GH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\u00130\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0017\u001a\n \r*\u0004\u0018\u00010\u00130\u00138BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u0015R#\u0010\u001a\u001a\n \r*\u0004\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u001f\u001a\n \r*\u0004\u0018\u00010 0 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b!\u0010\"R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R#\u0010'\u001a\n \r*\u0004\u0018\u00010 0 8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b(\u0010\"R#\u0010*\u001a\n \r*\u0004\u0018\u00010 0 8BX\u0002¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b+\u0010\"R#\u0010-\u001a\n \r*\u0004\u0018\u00010 0 8BX\u0002¢\u0006\f\n\u0004\b/\u0010\u0011\u001a\u0004\b.\u0010\"R#\u00100\u001a\n \r*\u0004\u0018\u00010 0 8BX\u0002¢\u0006\f\n\u0004\b2\u0010\u0011\u001a\u0004\b1\u0010\"R#\u00103\u001a\n \r*\u0004\u0018\u00010 0 8BX\u0002¢\u0006\f\n\u0004\b5\u0010\u0011\u001a\u0004\b4\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006I"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupInvitePasswordDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "conversationId", "", "type", "", "(Landroid/content/Context;Ljava/lang/String;I)V", "getConversationId", "()Ljava/lang/String;", "mAvatarView", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "kotlin.jvm.PlatformType", "getMAvatarView", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "mAvatarView$delegate", "Lkotlin/Lazy;", "mCloseBtn", "Landroid/widget/ImageView;", "getMCloseBtn", "()Landroid/widget/ImageView;", "mCloseBtn$delegate", "mConfirmImageView", "getMConfirmImageView", "mConfirmImageView$delegate", "mConfirmLayout", "Landroid/widget/LinearLayout;", "getMConfirmLayout", "()Landroid/widget/LinearLayout;", "mConfirmLayout$delegate", "mConfirmTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMConfirmTextView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mConfirmTextView$delegate", "mConversationInfo", "Lcom/bytedance/im/core/model/Conversation;", "mExpirationDateFormat", "mExpirationDateTextView", "getMExpirationDateTextView", "mExpirationDateTextView$delegate", "mLoadingTextView", "getMLoadingTextView", "mLoadingTextView$delegate", "mPasswordTextView", "getMPasswordTextView", "mPasswordTextView$delegate", "mRetryTextView", "getMRetryTextView", "mRetryTextView$delegate", "mTitleTextView", "getMTitleTextView", "mTitleTextView$delegate", "getType", "()I", "addPasswordShowEvent", "", "clipToBoard", "passwordDescription", "password", "initEvents", "initParams", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updatePasswordInfo", "updateState", "state", "groupShareInfo", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupShareInfo;", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupInvitePasswordDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51596a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f51597b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mCloseBtn", "getMCloseBtn()Landroid/widget/ImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mAvatarView", "getMAvatarView()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mTitleTextView", "getMTitleTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mRetryTextView", "getMRetryTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mLoadingTextView", "getMLoadingTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mPasswordTextView", "getMPasswordTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mExpirationDateTextView", "getMExpirationDateTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mConfirmLayout", "getMConfirmLayout()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mConfirmImageView", "getMConfirmImageView()Landroid/widget/ImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupInvitePasswordDialog.class), "mConfirmTextView", "getMConfirmTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final a f51598e = new a((byte) 0);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f51599c;

    /* renamed from: d  reason: collision with root package name */
    public final int f51600d;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f51601f = LazyKt.lazy(new f(this));
    private final Lazy g = LazyKt.lazy(new e(this));
    private final Lazy h = LazyKt.lazy(new n(this));
    private final Lazy i = LazyKt.lazy(new m(this));
    private final Lazy j = LazyKt.lazy(new k(this));
    private final Lazy k = LazyKt.lazy(new l(this));
    private final Lazy l = LazyKt.lazy(new j(this));
    private final Lazy m = LazyKt.lazy(new h(this));
    private final Lazy n = LazyKt.lazy(new g(this));
    private final Lazy o = LazyKt.lazy(new i(this));
    private com.bytedance.im.core.d.b p;
    private String q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupInvitePasswordDialog$Companion;", "", "()V", "SEPARATOR_PASSWORD_SHARER", "", "SHARE_CHANNEL_QQ", "", "SHARE_CHANNEL_WECHAT", "SHARE_SCENE_INVITE_FRIENDS", "SHARE_TYPE_ADD_GROUP", "STATE_FAILED", "STATE_LOADING", "STATE_SUCCESS", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51602a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupInvitePasswordDialog f51603b;

        b(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f51603b = groupInvitePasswordDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51602a, false, 52285, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51602a, false, 52285, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f51603b.f51600d == 3) {
                com.ss.android.ugc.aweme.im.sdk.d.a a2 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeImManager.instance()");
                com.ss.android.ugc.aweme.im.service.c e2 = a2.e();
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                e2.shareToTargetChannel(view.getContext(), "qq");
                z.a().c(this.f51603b.f51599c, "group_qq_command_copy_click");
            } else {
                com.ss.android.ugc.aweme.im.sdk.d.a a3 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AwemeImManager.instance()");
                com.ss.android.ugc.aweme.im.service.c e3 = a3.e();
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                e3.shareToTargetChannel(view.getContext(), "weixin");
                z.a().c(this.f51603b.f51599c, "group_wx_command_copy_click");
            }
            this.f51603b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupInvitePasswordDialog f51605b;

        c(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f51605b = groupInvitePasswordDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51604a, false, 52286, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51604a, false, 52286, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f51605b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupInvitePasswordDialog f51607b;

        d(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f51607b = groupInvitePasswordDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51606a, false, 52287, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51606a, false, 52287, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f51607b.a(0, (com.ss.android.ugc.aweme.im.sdk.detail.a.d) null);
            this.f51607b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<AvatarImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final AvatarImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52288, new Class[0], AvatarImageView.class)) {
                return (AvatarImageView) this.this$0.findViewById(C0906R.id.ayr);
            }
            return (AvatarImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52288, new Class[0], AvatarImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<ImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final ImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52289, new Class[0], ImageView.class)) {
                return (ImageView) this.this$0.findViewById(C0906R.id.azy);
            }
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52289, new Class[0], ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<ImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final ImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52290, new Class[0], ImageView.class)) {
                return (ImageView) this.this$0.findViewById(C0906R.id.b04);
            }
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52290, new Class[0], ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52291, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.findViewById(C0906R.id.b86);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52291, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52292, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.findViewById(C0906R.id.d_u);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52292, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52293, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.findViewById(C0906R.id.dbj);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52293, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52294, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.findViewById(C0906R.id.de6);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52294, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52295, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.findViewById(C0906R.id.dfv);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52295, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52296, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.findViewById(C0906R.id.dhi);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52296, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupInvitePasswordDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            super(0);
            this.this$0 = groupInvitePasswordDialog;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52297, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.findViewById(C0906R.id.dkk);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52297, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupShareInfo;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class o<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.im.sdk.detail.a.d, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupInvitePasswordDialog f51609b;

        o(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f51609b = groupInvitePasswordDialog;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f51608a, false, 52298, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f51608a, false, 52298, new Class[]{a.i.class}, Void.class);
            }
            if (iVar != null && iVar.b()) {
                com.ss.android.ugc.aweme.im.sdk.detail.a.d dVar = (com.ss.android.ugc.aweme.im.sdk.detail.a.d) iVar.e();
                if (dVar != null && dVar.status_code == 0) {
                    this.f51609b.a(1, (com.ss.android.ugc.aweme.im.sdk.detail.a.d) iVar.e());
                    return null;
                }
            }
            this.f51609b.a(2, (com.ss.android.ugc.aweme.im.sdk.detail.a.d) null);
            return null;
        }
    }

    private final ImageView b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52267, new Class[0], ImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52267, new Class[0], ImageView.class);
        } else {
            value = this.f51601f.getValue();
        }
        return (ImageView) value;
    }

    private final DmtTextView c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52269, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52269, new Class[0], DmtTextView.class);
        } else {
            value = this.h.getValue();
        }
        return (DmtTextView) value;
    }

    private final DmtTextView d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52270, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52270, new Class[0], DmtTextView.class);
        } else {
            value = this.i.getValue();
        }
        return (DmtTextView) value;
    }

    private final DmtTextView e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52271, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52271, new Class[0], DmtTextView.class);
        } else {
            value = this.j.getValue();
        }
        return (DmtTextView) value;
    }

    private final DmtTextView f() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52272, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52272, new Class[0], DmtTextView.class);
        } else {
            value = this.k.getValue();
        }
        return (DmtTextView) value;
    }

    private final DmtTextView g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52273, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52273, new Class[0], DmtTextView.class);
        } else {
            value = this.l.getValue();
        }
        return (DmtTextView) value;
    }

    private final LinearLayout h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52274, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52274, new Class[0], LinearLayout.class);
        } else {
            value = this.m.getValue();
        }
        return (LinearLayout) value;
    }

    private final ImageView i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52275, new Class[0], ImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52275, new Class[0], ImageView.class);
        } else {
            value = this.n.getValue();
        }
        return (ImageView) value;
    }

    private final DmtTextView j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52276, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52276, new Class[0], DmtTextView.class);
        } else {
            value = this.o.getValue();
        }
        return (DmtTextView) value;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52281, new Class[0], Void.TYPE);
            return;
        }
        r.a(12, 2, this.f51599c, (a.g<com.ss.android.ugc.aweme.im.sdk.detail.a.d, Void>) new o<com.ss.android.ugc.aweme.im.sdk.detail.a.d,Void>(this));
    }

    private final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f51596a, false, 52283, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51596a, false, 52283, new Class[0], Void.TYPE);
        } else if (this.f51600d == 3) {
            z.a().c(this.f51599c, "group_qq_command_copy_show");
        } else {
            z.a().c(this.f51599c, "group_wx_command_copy_show");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r19) {
        /*
            r18 = this;
            r7 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 52277(0xcc35, float:7.3256E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            r3 = 0
            r4 = 52277(0xcc35, float:7.3256E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            super.onCreate(r19)
            r7.requestWindowFeature(r9)
            r0 = 2131690643(0x7f0f0493, float:1.9010335E38)
            r7.setContentView((int) r0)
            android.view.Window r0 = r18.getWindow()
            if (r0 == 0) goto L_0x004c
            r1 = -2
            r0.setLayout(r1, r1)
        L_0x004c:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            r3 = 0
            r4 = 52278(0xcc36, float:7.3257E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r8 = 0
            if (r0 == 0) goto L_0x0074
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            r3 = 0
            r4 = 52278(0xcc36, float:7.3257E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00ed
        L_0x0074:
            com.ss.android.ugc.aweme.im.sdk.group.a$a r0 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = r0.a()
            java.lang.String r1 = r7.f51599c
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.group.a.f51527a
            r14 = 0
            r15 = 52129(0xcba1, float:7.3048E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3
            java.lang.Class<com.bytedance.im.core.d.b> r17 = com.bytedance.im.core.d.b.class
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x00b3
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.group.a.f51527a
            r14 = 0
            r15 = 52129(0xcba1, float:7.3048E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class<com.bytedance.im.core.d.b> r17 = com.bytedance.im.core.d.b.class
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.bytedance.im.core.d.b r0 = (com.bytedance.im.core.d.b) r0
            goto L_0x00d9
        L_0x00b3:
            java.lang.String r2 = "conversationId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.im.core.d.b> r2 = r0.f51531c
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.im.core.d.b r2 = (com.bytedance.im.core.d.b) r2
            if (r2 != 0) goto L_0x00d8
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = (com.ss.android.ugc.aweme.im.sdk.group.a) r0
            com.bytedance.im.core.d.d r2 = com.bytedance.im.core.d.d.a()
            com.bytedance.im.core.d.b r2 = r2.a((java.lang.String) r1)
            if (r2 == 0) goto L_0x00d6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.im.core.d.b> r0 = r0.f51531c
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r1, r2)
            goto L_0x00d8
        L_0x00d6:
            r0 = r8
            goto L_0x00d9
        L_0x00d8:
            r0 = r2
        L_0x00d9:
            r7.p = r0
            android.content.Context r0 = r18.getContext()
            r1 = 2131560480(0x7f0d0820, float:1.8746333E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.getString(R.stri…password_expiration_date)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.q = r0
        L_0x00ed:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            r3 = 0
            r4 = 52279(0xcc37, float:7.3258E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r11 = 3
            if (r0 == 0) goto L_0x0115
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            r3 = 0
            r4 = 52279(0xcc37, float:7.3258E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x019e
        L_0x0115:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            r3 = 0
            r4 = 52268(0xcc2c, float:7.3243E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.AvatarImageView> r6 = com.ss.android.ugc.aweme.base.ui.AvatarImageView.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x013e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            r3 = 0
            r4 = 52268(0xcc2c, float:7.3243E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.AvatarImageView> r6 = com.ss.android.ugc.aweme.base.ui.AvatarImageView.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x013b:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = (com.ss.android.ugc.aweme.base.ui.AvatarImageView) r0
            goto L_0x0145
        L_0x013e:
            kotlin.Lazy r0 = r7.g
            java.lang.Object r0 = r0.getValue()
            goto L_0x013b
        L_0x0145:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            com.bytedance.im.core.d.b r1 = r7.p
            if (r1 == 0) goto L_0x0156
            com.bytedance.im.core.d.c r1 = r1.getCoreInfo()
            if (r1 == 0) goto L_0x0156
            java.lang.String r1 = r1.getIcon()
            goto L_0x0157
        L_0x0156:
            r1 = r8
        L_0x0157:
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1)
            int r0 = r7.f51600d
            if (r0 != r11) goto L_0x017d
            android.widget.LinearLayout r0 = r18.h()
            r1 = 2130839898(0x7f02095a, float:1.728482E38)
            r0.setBackgroundResource(r1)
            android.widget.ImageView r0 = r18.i()
            r1 = 2130840067(0x7f020a03, float:1.7285162E38)
            r0.setImageResource(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r18.j()
            r1 = 2131560434(0x7f0d07f2, float:1.874624E38)
            r0.setText(r1)
            goto L_0x019b
        L_0x017d:
            android.widget.LinearLayout r0 = r18.h()
            r1 = 2130839899(0x7f02095b, float:1.7284822E38)
            r0.setBackgroundResource(r1)
            android.widget.ImageView r0 = r18.i()
            r1 = 2130840068(0x7f020a04, float:1.7285164E38)
            r0.setImageResource(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r18.j()
            r1 = 2131560435(0x7f0d07f3, float:1.8746242E38)
            r0.setText(r1)
        L_0x019b:
            r7.a((int) r10, (com.ss.android.ugc.aweme.im.sdk.detail.a.d) r8)
        L_0x019e:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            r3 = 0
            r4 = 52280(0xcc38, float:7.326E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01c4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f51596a
            r3 = 0
            r4 = 52280(0xcc38, float:7.326E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0210
        L_0x01c4:
            com.ss.android.ugc.aweme.im.sdk.utils.au$a r0 = com.ss.android.ugc.aweme.im.sdk.utils.au.a.h()
            android.view.View[] r1 = new android.view.View[r11]
            android.widget.LinearLayout r2 = r18.h()
            android.view.View r2 = (android.view.View) r2
            r1[r10] = r2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r18.d()
            android.view.View r2 = (android.view.View) r2
            r1[r9] = r2
            r2 = 2
            android.widget.ImageView r3 = r18.b()
            android.view.View r3 = (android.view.View) r3
            r1[r2] = r3
            r0.a(r1)
            android.widget.LinearLayout r0 = r18.h()
            com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$b r1 = new com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$b
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r18.b()
            com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$c r1 = new com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$c
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r18.d()
            com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$d r1 = new com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$d
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0210:
            r18.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog.onCreate(android.os.Bundle):void");
    }

    private final void a(String str, String str2) {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f51596a, false, 52284, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f51596a, false, 52284, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
        Activity a2 = b2.a();
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CharSequence charSequence2 = str;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            }
            if (!z2 && a2 != null && !a2.isFinishing()) {
                ClipboardManager clipboardManager = (ClipboardManager) a2.getSystemService("clipboard");
                ClipData newPlainText = ClipData.newPlainText("", charSequence2);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                com.ss.android.ugc.aweme.im.sdk.d.a a3 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AwemeImManager.instance()");
                a3.e().saveShareCommandToSp(StringsKt.replace$default(str2, "\n", "", false, 4, (Object) null));
            }
        }
    }

    public final void a(int i2, com.ss.android.ugc.aweme.im.sdk.detail.a.d dVar) {
        com.ss.android.ugc.aweme.im.sdk.detail.a.c cVar;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        int i3 = i2;
        com.ss.android.ugc.aweme.im.sdk.detail.a.d dVar2 = dVar;
        while (true) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), dVar2}, this, f51596a, false, 52282, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.im.sdk.detail.a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), dVar2}, this, f51596a, false, 52282, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.im.sdk.detail.a.d.class}, Void.TYPE);
                return;
            }
            switch (i3) {
                case 0:
                    g().setText(C0906R.string.ard);
                    c().setText(C0906R.string.aw7);
                    DmtTextView f2 = f();
                    Intrinsics.checkExpressionValueIsNotNull(f2, "mPasswordTextView");
                    f2.setVisibility(4);
                    DmtTextView e2 = e();
                    Intrinsics.checkExpressionValueIsNotNull(e2, "mLoadingTextView");
                    e2.setVisibility(0);
                    DmtTextView d2 = d();
                    Intrinsics.checkExpressionValueIsNotNull(d2, "mRetryTextView");
                    d2.setVisibility(8);
                    LinearLayout h2 = h();
                    Intrinsics.checkExpressionValueIsNotNull(h2, "mConfirmLayout");
                    h2.setEnabled(false);
                    LinearLayout h3 = h();
                    Intrinsics.checkExpressionValueIsNotNull(h3, "mConfirmLayout");
                    h3.setAlpha(0.5f);
                    return;
                case 1:
                    if (dVar2 != null) {
                        cVar = dVar2.getGroupPasswordInfo();
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        com.ss.android.ugc.aweme.im.sdk.detail.a.c groupPasswordInfo = dVar2.getGroupPasswordInfo();
                        if (groupPasswordInfo == null) {
                            Intrinsics.throwNpe();
                        }
                        Collection groupPasswordDetailList = groupPasswordInfo.getGroupPasswordDetailList();
                        if (groupPasswordDetailList == null || groupPasswordDetailList.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            com.ss.android.ugc.aweme.im.sdk.detail.a.c groupPasswordInfo2 = dVar2.getGroupPasswordInfo();
                            if (groupPasswordInfo2 == null) {
                                Intrinsics.throwNpe();
                            }
                            List<com.ss.android.ugc.aweme.im.sdk.detail.a.b> groupPasswordDetailList2 = groupPasswordInfo2.getGroupPasswordDetailList();
                            if (groupPasswordDetailList2 == null) {
                                break;
                            } else {
                                com.ss.android.ugc.aweme.im.sdk.detail.a.b bVar = null;
                                for (com.ss.android.ugc.aweme.im.sdk.detail.a.b bVar2 : groupPasswordDetailList2) {
                                    if (bVar2.getShareChannel() == this.f51600d) {
                                        bVar = bVar2;
                                    }
                                }
                                if (bVar != null) {
                                    str = bVar.getToken();
                                } else {
                                    str = null;
                                }
                                CharSequence charSequence = str;
                                if (charSequence == null || charSequence.length() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    continue;
                                } else {
                                    if (bVar != null) {
                                        str2 = bVar.getDescription();
                                    } else {
                                        str2 = null;
                                    }
                                    CharSequence charSequence2 = str2;
                                    if (charSequence2 == null || charSequence2.length() == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        com.ss.android.ugc.aweme.im.sdk.detail.a.c groupPasswordInfo3 = dVar2.getGroupPasswordInfo();
                                        if (groupPasswordInfo3 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        long expireTime = currentTimeMillis + (groupPasswordInfo3.getExpireTime() * 1000);
                                        String str3 = this.q;
                                        if (str3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mExpirationDateFormat");
                                        }
                                        String format = new SimpleDateFormat(str3, Locale.getDefault()).format(Long.valueOf(expireTime));
                                        DmtTextView g2 = g();
                                        Intrinsics.checkExpressionValueIsNotNull(g2, "mExpirationDateTextView");
                                        g2.setText(getContext().getString(C0906R.string.aw4, new Object[]{format}));
                                        if (bVar == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        String token = bVar.getToken();
                                        DmtTextView f3 = f();
                                        Intrinsics.checkExpressionValueIsNotNull(f3, "mPasswordTextView");
                                        f3.setVisibility(0);
                                        DmtTextView f4 = f();
                                        Intrinsics.checkExpressionValueIsNotNull(f4, "mPasswordTextView");
                                        f4.setText(token);
                                        if (bVar == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        String description = bVar.getDescription();
                                        if (description == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        int indexOf$default = StringsKt.indexOf$default((CharSequence) description, "\n", 0, false, 6, (Object) null) + 1;
                                        if (bVar == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        String description2 = bVar.getDescription();
                                        if (description2 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StringBuilder sb = new StringBuilder(description2);
                                        IMUser fromUser = IMUser.fromUser(com.ss.android.ugc.aweme.im.sdk.utils.d.c());
                                        Intrinsics.checkExpressionValueIsNotNull(fromUser, "IMUser.fromUser(AppUtil.getCurrentUser())");
                                        a(sb.insert(indexOf$default, fromUser.getDisplayName()).toString(), token);
                                        break;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    dVar2 = null;
                    i3 = 2;
                    break;
                default:
                    g().setText(C0906R.string.arc);
                    c().setText(C0906R.string.aw6);
                    DmtTextView f5 = f();
                    Intrinsics.checkExpressionValueIsNotNull(f5, "mPasswordTextView");
                    f5.setVisibility(4);
                    DmtTextView d3 = d();
                    Intrinsics.checkExpressionValueIsNotNull(d3, "mRetryTextView");
                    d3.setVisibility(0);
                    DmtTextView e3 = e();
                    Intrinsics.checkExpressionValueIsNotNull(e3, "mLoadingTextView");
                    e3.setVisibility(8);
                    LinearLayout h4 = h();
                    Intrinsics.checkExpressionValueIsNotNull(h4, "mConfirmLayout");
                    h4.setEnabled(false);
                    LinearLayout h5 = h();
                    Intrinsics.checkExpressionValueIsNotNull(h5, "mConfirmLayout");
                    h5.setAlpha(0.5f);
                    return;
            }
        }
        c().setText(C0906R.string.axd);
        DmtTextView e4 = e();
        Intrinsics.checkExpressionValueIsNotNull(e4, "mLoadingTextView");
        e4.setVisibility(8);
        DmtTextView d4 = d();
        Intrinsics.checkExpressionValueIsNotNull(d4, "mRetryTextView");
        d4.setVisibility(8);
        LinearLayout h6 = h();
        Intrinsics.checkExpressionValueIsNotNull(h6, "mConfirmLayout");
        h6.setEnabled(true);
        LinearLayout h7 = h();
        Intrinsics.checkExpressionValueIsNotNull(h7, "mConfirmLayout");
        h7.setAlpha(1.0f);
        k();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupInvitePasswordDialog(@NotNull Context context, @NotNull String str, int i2) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "conversationId");
        this.f51599c = str;
        this.f51600d = i2;
    }
}

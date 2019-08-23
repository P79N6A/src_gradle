package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.FollowNotice;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.Cdo;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;
import java.util.HashMap;
import java.util.Map;
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
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fJ\"\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u001d2\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\nH\u0016J\u0018\u0010R\u001a\u00020N2\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u000eH\u0002J\u000e\u0010U\u001a\u00020N2\u0006\u0010I\u001a\u00020JJ\u0018\u0010V\u001a\u00020N2\u0006\u0010I\u001a\u00020J2\u0006\u0010S\u001a\u00020\u000eH\u0002J\u0018\u0010W\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u000eH\u0002J\b\u0010Z\u001a\u00020\u000bH\u0014J\u0010\u0010[\u001a\u00020N2\u0006\u0010\\\u001a\u00020\u0005H\u0016J\u0014\u0010]\u001a\u00020N2\n\u0010^\u001a\u00060_j\u0002``H\u0016J\u0010\u0010a\u001a\u00020N2\u0006\u0010S\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020N2\u0006\u0010P\u001a\u00020\u000bH\u0016J\u0010\u0010d\u001a\u00020N2\u0006\u0010e\u001a\u00020\u000eH\u0002R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R#\u0010\u001e\u001a\n \u0018*\u0004\u0018\u00010\u001f0\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b \u0010!R#\u0010#\u001a\n \u0018*\u0004\u0018\u00010$0$8BX\u0002¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b%\u0010&R\u000e\u0010(\u001a\u00020\nX.¢\u0006\u0002\n\u0000R#\u0010)\u001a\n \u0018*\u0004\u0018\u00010*0*8BX\u0002¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X.¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b4\u0010\u0012\u001a\u0004\b2\u00103R#\u00105\u001a\n \u0018*\u0004\u0018\u000106068BX\u0002¢\u0006\f\n\u0004\b9\u0010\u0012\u001a\u0004\b7\u00108R#\u0010:\u001a\n \u0018*\u0004\u0018\u00010\u001f0\u001f8BX\u0002¢\u0006\f\n\u0004\b<\u0010\u0012\u001a\u0004\b;\u0010!R#\u0010=\u001a\n \u0018*\u0004\u0018\u00010>0>8BX\u0002¢\u0006\f\n\u0004\bA\u0010\u0012\u001a\u0004\b?\u0010@R#\u0010B\u001a\n \u0018*\u0004\u0018\u00010\u001f0\u001f8BX\u0002¢\u0006\f\n\u0004\bD\u0010\u0012\u001a\u0004\bC\u0010!R#\u0010E\u001a\n \u0018*\u0004\u0018\u00010\u00050\u00058BX\u0002¢\u0006\f\n\u0004\bH\u0010\u0012\u001a\u0004\bF\u0010GR\u0013\u0010I\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006g"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/adapter/FansHolder;", "Lcom/ss/android/ugc/aweme/notification/adapter/BaseNotificationHolder;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/profile/presenter/IFollowView;", "view", "Landroid/view/View;", "mActivity", "Landroid/app/Activity;", "mFollowClickMap", "Ljava/util/HashMap;", "", "", "(Landroid/view/View;Landroid/app/Activity;Ljava/util/HashMap;)V", "horizontalWidthForFour", "", "getHorizontalWidthForFour", "()I", "horizontalWidthForFour$delegate", "Lkotlin/Lazy;", "horizontalWidthForTwo", "getHorizontalWidthForTwo", "horizontalWidthForTwo$delegate", "mAvatar", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "kotlin.jvm.PlatformType", "getMAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "mAvatar$delegate", "mBaseNotice", "Lcom/ss/android/ugc/aweme/notification/bean/BaseNotice;", "mDescription", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMDescription", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mDescription$delegate", "mEditRemark", "Lcom/ss/android/ugc/aweme/views/AutoRTLImageView;", "getMEditRemark", "()Lcom/ss/android/ugc/aweme/views/AutoRTLImageView;", "mEditRemark$delegate", "mEnterFrom", "mFollow", "Lcom/bytedance/ies/dmt/ui/widget/DmtButton;", "getMFollow", "()Lcom/bytedance/ies/dmt/ui/widget/DmtButton;", "mFollow$delegate", "mFollowNotice", "Lcom/ss/android/ugc/aweme/notification/bean/FollowNotice;", "mFollowPresenter", "Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;", "getMFollowPresenter", "()Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;", "mFollowPresenter$delegate", "mLabel", "Lcom/ss/android/ugc/aweme/views/RelationLabelTextView;", "getMLabel", "()Lcom/ss/android/ugc/aweme/views/RelationLabelTextView;", "mLabel$delegate", "mName", "getMName", "mName$delegate", "mRoot", "Landroid/support/constraint/ConstraintLayout;", "getMRoot", "()Landroid/support/constraint/ConstraintLayout;", "mRoot$delegate", "mTime", "getMTime", "mTime$delegate", "mUnread", "getMUnread", "()Landroid/view/View;", "mUnread$delegate", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "bind", "", "notice", "isAlreadyRead", "enterFrom", "displayFollowStatus", "followStatus", "followerStatus", "displayName", "displayRemarkEditView", "getHorizontalPadding", "drawableWidth", "textLength", "needLongClick", "onClick", "v", "onFollowFail", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onFollowSuccess", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "refreshReadState", "setFollowButtonStyle", "resId", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FansHolder extends BaseNotificationHolder implements View.OnClickListener, com.ss.android.ugc.aweme.profile.presenter.m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57878a;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f57879d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mUnread", "getMUnread()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mRoot", "getMRoot()Landroid/support/constraint/ConstraintLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mAvatar", "getMAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mName", "getMName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mDescription", "getMDescription()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mEditRemark", "getMEditRemark()Lcom/ss/android/ugc/aweme/views/AutoRTLImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mLabel", "getMLabel()Lcom/ss/android/ugc/aweme/views/RelationLabelTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mTime", "getMTime()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mFollow", "getMFollow()Lcom/bytedance/ies/dmt/ui/widget/DmtButton;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "mFollowPresenter", "getMFollowPresenter()Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "horizontalWidthForTwo", "getHorizontalWidthForTwo()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansHolder.class), "horizontalWidthForFour", "getHorizontalWidthForFour()I"))};
    public static final a h = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    final Lazy f57880e = LazyKt.lazy(new h(this));

    /* renamed from: f  reason: collision with root package name */
    public FollowNotice f57881f;
    public final Activity g;
    private final Lazy i;
    private final Lazy j;
    private final Lazy k;
    private final Lazy l;
    private final Lazy m;
    private final Lazy n;
    private final Lazy o;
    private final Lazy p;
    private final Lazy q;
    private final Lazy r = LazyKt.lazy(new c(this));
    private final Lazy s = LazyKt.lazy(new b(this));
    private BaseNotice t;
    private String u;
    private final HashMap<String, Boolean> v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/adapter/FansHolder$Companion;", "", "()V", "DP_80", "", "DRAWABLE_WIDTH", "", "MILLIONSECOND", "TEXT_LENGHT_2", "TEXT_LENGHT_4", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FansHolder fansHolder) {
            super(0);
            this.this$0 = fansHolder;
        }

        public final int invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62988, new Class[0], Integer.TYPE)) {
                return this.this$0.b(12, 4);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62988, new Class[0], Integer.TYPE)).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FansHolder fansHolder) {
            super(0);
            this.this$0 = fansHolder;
        }

        public final int invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62989, new Class[0], Integer.TYPE)) {
                return this.this$0.b(12, 2);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62989, new Class[0], Integer.TYPE)).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<AvatarImageWithVerify> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$view = view;
        }

        public final AvatarImageWithVerify invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62990, new Class[0], AvatarImageWithVerify.class)) {
                return (AvatarImageWithVerify) this.$view.findViewById(C0906R.id.hk);
            }
            return (AvatarImageWithVerify) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62990, new Class[0], AvatarImageWithVerify.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$view = view;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62991, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.$view.findViewById(C0906R.id.a3u);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62991, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/views/AutoRTLImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<AutoRTLImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.$view = view;
        }

        public final AutoRTLImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62992, new Class[0], AutoRTLImageView.class)) {
                return (AutoRTLImageView) this.$view.findViewById(C0906R.id.a8t);
            }
            return (AutoRTLImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62992, new Class[0], AutoRTLImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtButton;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<DmtButton> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(0);
            this.$view = view;
        }

        public final DmtButton invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62993, new Class[0], DmtButton.class)) {
                return (DmtButton) this.$view.findViewById(C0906R.id.agq);
            }
            return (DmtButton) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62993, new Class[0], DmtButton.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<com.ss.android.ugc.aweme.profile.presenter.i> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(FansHolder fansHolder) {
            super(0);
            this.this$0 = fansHolder;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.profile.presenter.i invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62994, new Class[0], com.ss.android.ugc.aweme.profile.presenter.i.class)) {
                return (com.ss.android.ugc.aweme.profile.presenter.i) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62994, new Class[0], com.ss.android.ugc.aweme.profile.presenter.i.class);
            }
            com.ss.android.ugc.aweme.profile.presenter.i iVar = new com.ss.android.ugc.aweme.profile.presenter.i();
            iVar.a(this.this$0);
            return iVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/views/RelationLabelTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<RelationLabelTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(View view) {
            super(0);
            this.$view = view;
        }

        public final RelationLabelTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62995, new Class[0], RelationLabelTextView.class)) {
                return (RelationLabelTextView) this.$view.findViewById(C0906R.id.b79);
            }
            return (RelationLabelTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62995, new Class[0], RelationLabelTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(View view) {
            super(0);
            this.$view = view;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62996, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.$view.findViewById(C0906R.id.bpn);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62996, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/support/constraint/ConstraintLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<ConstraintLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(View view) {
            super(0);
            this.$view = view;
        }

        public final ConstraintLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62997, new Class[0], ConstraintLayout.class)) {
                return (ConstraintLayout) this.$view.findViewById(C0906R.id.b__);
            }
            return (ConstraintLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62997, new Class[0], ConstraintLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(View view) {
            super(0);
            this.$view = view;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62998, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.$view.findViewById(C0906R.id.time);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62998, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(View view) {
            super(0);
            this.$view = view;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62999, new Class[0], View.class)) {
                return this.$view.findViewById(C0906R.id.do4);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62999, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FansHolder f57883b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f57884c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f57885d;

        n(FansHolder fansHolder, int i, boolean z) {
            this.f57883b = fansHolder;
            this.f57884c = i;
            this.f57885d = z;
        }

        public final void run() {
            Object value;
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f57882a, false, 63000, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57882a, false, 63000, new Class[0], Void.TYPE);
                return;
            }
            FansHolder fansHolder = this.f57883b;
            if (PatchProxy.isSupport(new Object[0], fansHolder, FansHolder.f57878a, false, 62974, new Class[0], com.ss.android.ugc.aweme.profile.presenter.i.class)) {
                value = PatchProxy.accessDispatch(new Object[0], fansHolder, FansHolder.f57878a, false, 62974, new Class[0], com.ss.android.ugc.aweme.profile.presenter.i.class);
            } else {
                value = fansHolder.f57880e.getValue();
            }
            com.ss.android.ugc.aweme.profile.presenter.i iVar = (com.ss.android.ugc.aweme.profile.presenter.i) value;
            i.a aVar = new i.a();
            User user = FansHolder.a(this.f57883b).user;
            Intrinsics.checkExpressionValueIsNotNull(user, "mFollowNotice.user");
            i.a a2 = aVar.a(user.getUid());
            User user2 = FansHolder.a(this.f57883b).user;
            Intrinsics.checkExpressionValueIsNotNull(user2, "mFollowNotice.user");
            iVar.a(a2.b(user2.getSecUid()).a(this.f57884c).b(7).a());
            MobClick mobClick = new MobClick();
            if (this.f57885d) {
                str = "follow_cancel";
            } else {
                str = "follow";
            }
            MobClick labelName = mobClick.setEventName(str).setLabelName("message");
            User user3 = FansHolder.a(this.f57883b).user;
            Intrinsics.checkExpressionValueIsNotNull(user3, "mFollowNotice.user");
            r.onEvent(labelName.setValue(user3.getUid()));
            if (!this.f57885d) {
                s c2 = new s().b("message_fans").f("message").g("other_places").c("follow_button");
                User user4 = FansHolder.a(this.f57883b).user;
                Intrinsics.checkExpressionValueIsNotNull(user4, "mFollowNotice.user");
                c2.h(user4.getUid()).i("").e();
                Intent intent = this.f57883b.g.getIntent();
                if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                    String stringExtra = intent.getStringExtra("rule_id");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        s b2 = new s("follow_from_push").b("message");
                        User user5 = FansHolder.a(this.f57883b).user;
                        Intrinsics.checkExpressionValueIsNotNull(user5, "mFollowNotice.user");
                        b2.h(user5.getUid()).f("previous_page").g("other_places").q(stringExtra).e();
                    }
                }
            } else {
                com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "message_fans").a("previous_page", "message");
                User user6 = FansHolder.a(this.f57883b).user;
                Intrinsics.checkExpressionValueIsNotNull(user6, "mFollowNotice.user");
                r.a("follow_cancel", (Map) a3.a("to_user_id", user6.getUid()).f34114b);
            }
            FansHolder fansHolder2 = this.f57883b;
            int i = this.f57884c;
            User user7 = FansHolder.a(this.f57883b).user;
            Intrinsics.checkExpressionValueIsNotNull(user7, "mFollowNotice.user");
            fansHolder2.a(i, user7.getFollowerStatus());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRemarkEditSuccess"}, k = 3, mv = {1, 1, 15})
    static final class o implements RemarkEditDialog.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FansHolder f57887b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f57888c;

        o(FansHolder fansHolder, User user) {
            this.f57887b = fansHolder;
            this.f57888c = user;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f57886a, false, 63003, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57886a, false, 63003, new Class[0], Void.TYPE);
                return;
            }
            this.f57887b.a(this.f57888c);
        }
    }

    private final View d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57878a, false, 62965, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62965, new Class[0], View.class);
        } else {
            value = this.i.getValue();
        }
        return (View) value;
    }

    private final ConstraintLayout e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57878a, false, 62966, new Class[0], ConstraintLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62966, new Class[0], ConstraintLayout.class);
        } else {
            value = this.j.getValue();
        }
        return (ConstraintLayout) value;
    }

    private final AvatarImageWithVerify f() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57878a, false, 62967, new Class[0], AvatarImageWithVerify.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62967, new Class[0], AvatarImageWithVerify.class);
        } else {
            value = this.k.getValue();
        }
        return (AvatarImageWithVerify) value;
    }

    private final DmtTextView g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57878a, false, 62968, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62968, new Class[0], DmtTextView.class);
        } else {
            value = this.l.getValue();
        }
        return (DmtTextView) value;
    }

    private final DmtTextView h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57878a, false, 62969, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62969, new Class[0], DmtTextView.class);
        } else {
            value = this.m.getValue();
        }
        return (DmtTextView) value;
    }

    private final AutoRTLImageView i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57878a, false, 62970, new Class[0], AutoRTLImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62970, new Class[0], AutoRTLImageView.class);
        } else {
            value = this.n.getValue();
        }
        return (AutoRTLImageView) value;
    }

    private final RelationLabelTextView j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57878a, false, 62971, new Class[0], RelationLabelTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62971, new Class[0], RelationLabelTextView.class);
        } else {
            value = this.o.getValue();
        }
        return (RelationLabelTextView) value;
    }

    private final DmtButton k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57878a, false, 62973, new Class[0], DmtButton.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62973, new Class[0], DmtButton.class);
        } else {
            value = this.q.getValue();
        }
        return (DmtButton) value;
    }

    private final int l() {
        if (!PatchProxy.isSupport(new Object[0], this, f57878a, false, 62975, new Class[0], Integer.TYPE)) {
            return ((Number) this.r.getValue()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62975, new Class[0], Integer.TYPE)).intValue();
    }

    private final int m() {
        if (!PatchProxy.isSupport(new Object[0], this, f57878a, false, 62976, new Class[0], Integer.TYPE)) {
            return ((Number) this.s.getValue()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62976, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean a() {
        return true;
    }

    @Nullable
    public final User c() {
        if (PatchProxy.isSupport(new Object[0], this, f57878a, false, 62977, new Class[0], User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[0], this, f57878a, false, 62977, new Class[0], User.class);
        } else if (this.f57881f == null) {
            return null;
        } else {
            FollowNotice followNotice = this.f57881f;
            if (followNotice == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
            }
            return followNotice.user;
        }
    }

    public static final /* synthetic */ FollowNotice a(FansHolder fansHolder) {
        FollowNotice followNotice = fansHolder.f57881f;
        if (followNotice == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
        }
        return followNotice;
    }

    public final void a(@NotNull User user) {
        User user2 = user;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f57878a, false, 62979, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f57878a, false, 62979, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        CharSequence remarkName = user.getRemarkName();
        if (!(remarkName == null || remarkName.length() == 0)) {
            z = false;
        }
        if (z) {
            DmtTextView g2 = g();
            Intrinsics.checkExpressionValueIsNotNull(g2, "mName");
            g2.setText(user.getNickname());
            return;
        }
        DmtTextView g3 = g();
        Intrinsics.checkExpressionValueIsNotNull(g3, "mName");
        g3.setText(user.getRemarkName());
    }

    public final void onFollowFail(@NotNull Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f57878a, false, 62987, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f57878a, false, 62987, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc, "e");
        if (this.f57881f != null) {
            FollowNotice followNotice = this.f57881f;
            if (followNotice == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
            }
            if (followNotice.user != null) {
                FollowNotice followNotice2 = this.f57881f;
                if (followNotice2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                }
                User user = followNotice2.user;
                Intrinsics.checkExpressionValueIsNotNull(user, "mFollowNotice.user");
                int followStatus = user.getFollowStatus();
                FollowNotice followNotice3 = this.f57881f;
                if (followNotice3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                }
                User user2 = followNotice3.user;
                Intrinsics.checkExpressionValueIsNotNull(user2, "mFollowNotice.user");
                a(followStatus, user2.getFollowerStatus());
            }
        }
    }

    private final void a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57878a, false, 62982, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57878a, false, 62982, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i3 == -1) {
            k().setPadding(0, 0, 0, 0);
            DmtButton k2 = k();
            Intrinsics.checkExpressionValueIsNotNull(k2, "mFollow");
            k2.setGravity(17);
            k().setCompoundDrawables(null, null, null, null);
        } else {
            Context context = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), i3);
            Intrinsics.checkExpressionValueIsNotNull(a2, "mButtonStyle");
            a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
            k().setCompoundDrawables(a2, null, null, null);
            DmtButton k3 = k();
            Intrinsics.checkExpressionValueIsNotNull(k3, "mFollow");
            k3.setGravity(16);
        }
    }

    public final void onFollowSuccess(@NotNull FollowStatus followStatus) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f57878a, false, 62986, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f57878a, false, 62986, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(followStatus, "followStatus");
        User c2 = c();
        if (c2 != null) {
            if (TextUtils.equals(followStatus.userId, c2.getUid())) {
                String uid = c2.getUid();
                Intrinsics.checkExpressionValueIsNotNull(uid, "followUser.uid");
                this.v.put(uid, Boolean.TRUE);
                a(followStatus.followStatus, c2.getFollowerStatus());
                bg.a(new com.ss.android.ugc.aweme.challenge.a.d(followStatus.followStatus, c2));
            }
            if (!this.g.isFinishing()) {
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                if (com.ss.android.ugc.aweme.profile.d.i.a(view.getContext(), c2, followStatus)) {
                    View view2 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    RemarkEditDialog remarkEditDialog = new RemarkEditDialog(view2.getContext());
                    remarkEditDialog.g = c();
                    remarkEditDialog.h = followStatus.contactName;
                    remarkEditDialog.i = 1;
                    remarkEditDialog.f63095f = new o(this, c2);
                    remarkEditDialog.show();
                }
            }
            if (followStatus.followStatus == 0) {
                CharSequence remarkName = c2.getRemarkName();
                if (!(remarkName == null || remarkName.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    c2.setRemarkName("");
                    a(c2);
                }
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57878a, false, 62980, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57878a, false, 62980, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (z) {
            View d2 = d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "mUnread");
            d2.setVisibility(8);
            Cdo.a(e());
            return;
        }
        View d3 = d();
        Intrinsics.checkExpressionValueIsNotNull(d3, "mUnread");
        d3.setVisibility(0);
        Cdo.a(e(), 2130841684, C0906R.color.z3);
    }

    public final void onClick(@NotNull View view) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f57878a, false, 62985, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57878a, false, 62985, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        if (!b()) {
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.t;
            if (baseNotice == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBaseNotice");
            }
            View d2 = d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "mUnread");
            if (d2.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            String str = this.u;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEnterFrom");
            }
            a("click", "fans", adapterPosition, baseNotice, z, str);
            super.onClick(view);
            int id = view.getId();
            if (id == C0906R.id.b__ || id == C0906R.id.hk || id == C0906R.id.bpn) {
                Activity activity = this.g;
                FollowNotice followNotice = this.f57881f;
                if (followNotice == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                }
                a(activity, followNotice.user, "message_fans");
                FollowNotice followNotice2 = this.f57881f;
                if (followNotice2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                }
                User user = followNotice2.user;
                Intrinsics.checkExpressionValueIsNotNull(user, "mFollowNotice.user");
                a(user.getUid(), "message_fans", "click_head");
                a((Context) this.g);
            } else if (id == C0906R.id.agq) {
                FollowNotice followNotice3 = this.f57881f;
                if (followNotice3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                }
                User user2 = followNotice3.user;
                Intrinsics.checkExpressionValueIsNotNull(user2, "mFollowNotice.user");
                if (user2.getFollowStatus() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = !z2;
                IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
                Context context = view.getContext();
                FollowNotice followNotice4 = this.f57881f;
                if (followNotice4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                }
                User user3 = followNotice4.user;
                Intrinsics.checkExpressionValueIsNotNull(user3, "mFollowNotice.user");
                if (user3.getFollowStatus() != 2) {
                    z3 = false;
                }
                a2.wrapperSyncXAlert(context, 2, z3, new n(this, z4 ? 1 : 0, z2));
            } else {
                if (id == C0906R.id.b79) {
                    FollowNotice followNotice5 = this.f57881f;
                    if (followNotice5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                    }
                    if (followNotice5.relationLabel != null) {
                        FollowNotice followNotice6 = this.f57881f;
                        if (followNotice6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                        }
                        RelationDynamicLabel relationDynamicLabel = followNotice6.relationLabel;
                        Intrinsics.checkExpressionValueIsNotNull(relationDynamicLabel, "mFollowNotice.relationLabel");
                        if (!TextUtils.isEmpty(relationDynamicLabel.getUserId())) {
                            Context context2 = this.g;
                            FollowNotice followNotice7 = this.f57881f;
                            if (followNotice7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                            }
                            RelationDynamicLabel relationDynamicLabel2 = followNotice7.relationLabel;
                            Intrinsics.checkExpressionValueIsNotNull(relationDynamicLabel2, "mFollowNotice.relationLabel");
                            String userId = relationDynamicLabel2.getUserId();
                            FollowNotice followNotice8 = this.f57881f;
                            if (followNotice8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mFollowNotice");
                            }
                            User user4 = followNotice8.user;
                            Intrinsics.checkExpressionValueIsNotNull(user4, "mFollowNotice.user");
                            UserProfileActivity.a(context2, userId, user4.getSecUid(), "like_banner");
                        }
                    }
                }
            }
        }
    }

    public final int b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{12, Integer.valueOf(i3)}, this, f57878a, false, 62983, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{12, Integer.valueOf(i3)}, this, f57878a, false, 62983, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        float dip2Px = UIUtils.dip2Px(this.g, 80.0f);
        DmtButton k2 = k();
        Intrinsics.checkExpressionValueIsNotNull(k2, "mFollow");
        return (int) Math.max(0.0f, ((dip2Px - k2.getPaint().measureText(StringsKt.repeat("一", i3))) - UIUtils.dip2Px(this.g, 14.0f)) / 2.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0134, code lost:
        if (r12 != 1) goto L_0x0137;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r11, int r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f57878a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62981(0xf605, float:8.8255E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f57878a
            r3 = 0
            r4 = 62981(0xf605, float:8.8255E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Integer r0 = r0.k()
            r1 = 2130839876(0x7f020944, float:1.7284775E38)
            if (r0 != 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            int r2 = r0.intValue()
            if (r2 == 0) goto L_0x0081
        L_0x0068:
            if (r0 != 0) goto L_0x006b
            goto L_0x0075
        L_0x006b:
            int r2 = r0.intValue()
            if (r2 != r9) goto L_0x0075
            r10.a((int) r1)
            goto L_0x0081
        L_0x0075:
            if (r0 != 0) goto L_0x0078
            goto L_0x0081
        L_0x0078:
            int r0 = r0.intValue()
            if (r0 != r7) goto L_0x0081
            r10.a((int) r1)
        L_0x0081:
            r0 = 2131559674(0x7f0d04fa, float:1.8744699E38)
            r2 = 2131624932(0x7f0e03e4, float:1.8877058E38)
            r3 = 2130838010(0x7f0201fa, float:1.728099E38)
            r4 = 2131559673(0x7f0d04f9, float:1.8744697E38)
            r5 = -1
            switch(r11) {
                case 0: goto L_0x0178;
                case 1: goto L_0x0100;
                case 2: goto L_0x0093;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x021f
        L_0x0093:
            r10.a((int) r5)
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r5 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
            java.lang.Integer r1 = r1.k()
            if (r1 != 0) goto L_0x00a6
            goto L_0x00ac
        L_0x00a6:
            int r5 = r1.intValue()
            if (r5 == 0) goto L_0x00bf
        L_0x00ac:
            if (r1 != 0) goto L_0x00af
            goto L_0x00b5
        L_0x00af:
            int r5 = r1.intValue()
            if (r5 == r9) goto L_0x00bf
        L_0x00b5:
            if (r1 != 0) goto L_0x00b8
            goto L_0x00bf
        L_0x00b8:
            int r1 = r1.intValue()
            if (r1 != r7) goto L_0x00bf
            goto L_0x00c2
        L_0x00bf:
            r0 = 2131559673(0x7f0d04f9, float:1.8744697E38)
        L_0x00c2:
            com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r10.k()
            java.lang.String r4 = "mFollow"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r5 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.content.res.Resources r4 = r4.getResources()
            java.lang.CharSequence r0 = r4.getText(r0)
            r1.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r10.k()
            r0.setBackgroundResource(r3)
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r10.k()
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r3 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x021f
        L_0x0100:
            r10.a((int) r5)
            r1 = 2131560075(0x7f0d068b, float:1.8745512E38)
            com.ss.android.ugc.aweme.setting.AbTestManager r5 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r6 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.Integer r5 = r5.k()
            if (r5 != 0) goto L_0x0116
            goto L_0x011c
        L_0x0116:
            int r6 = r5.intValue()
            if (r6 == 0) goto L_0x0137
        L_0x011c:
            if (r5 != 0) goto L_0x011f
            goto L_0x012b
        L_0x011f:
            int r6 = r5.intValue()
            if (r6 != r9) goto L_0x012b
            if (r12 != r9) goto L_0x0137
            r0 = 2131559673(0x7f0d04f9, float:1.8744697E38)
            goto L_0x013a
        L_0x012b:
            if (r5 != 0) goto L_0x012e
            goto L_0x0137
        L_0x012e:
            int r4 = r5.intValue()
            if (r4 != r7) goto L_0x0137
            if (r12 != r9) goto L_0x0137
            goto L_0x013a
        L_0x0137:
            r0 = 2131560075(0x7f0d068b, float:1.8745512E38)
        L_0x013a:
            com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r10.k()
            java.lang.String r4 = "mFollow"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r5 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.content.res.Resources r4 = r4.getResources()
            java.lang.CharSequence r0 = r4.getText(r0)
            r1.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r10.k()
            r0.setBackgroundResource(r3)
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r10.k()
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r3 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x021f
        L_0x0178:
            r0 = 2131560037(0x7f0d0665, float:1.8745435E38)
            com.bytedance.ies.dmt.ui.widget.DmtButton r2 = r10.k()
            int r3 = r10.l()
            int r4 = r10.l()
            r2.setPadding(r3, r8, r4, r8)
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r3 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Integer r2 = r2.k()
            if (r2 != 0) goto L_0x019a
            goto L_0x01a0
        L_0x019a:
            int r3 = r2.intValue()
            if (r3 == 0) goto L_0x01dd
        L_0x01a0:
            r3 = 2130839877(0x7f020945, float:1.7284777E38)
            if (r2 != 0) goto L_0x01a6
            goto L_0x01b9
        L_0x01a6:
            int r4 = r2.intValue()
            if (r4 != r9) goto L_0x01b9
            if (r12 != r9) goto L_0x01b5
            r0 = 2131560038(0x7f0d0666, float:1.8745437E38)
            r10.a((int) r3)
            goto L_0x01dd
        L_0x01b5:
            r10.a((int) r1)
            goto L_0x01dd
        L_0x01b9:
            if (r2 != 0) goto L_0x01bc
            goto L_0x01dd
        L_0x01bc:
            int r2 = r2.intValue()
            if (r2 != r7) goto L_0x01dd
            if (r12 != r9) goto L_0x01da
            r0 = 2131560041(0x7f0d0669, float:1.8745443E38)
            com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r10.k()
            int r2 = r10.m()
            int r4 = r10.m()
            r1.setPadding(r2, r8, r4, r8)
            r10.a((int) r3)
            goto L_0x01dd
        L_0x01da:
            r10.a((int) r1)
        L_0x01dd:
            com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r10.k()
            java.lang.String r2 = "mFollow"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r3 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.res.Resources r2 = r2.getResources()
            java.lang.CharSequence r0 = r2.getText(r0)
            r1.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r10.k()
            r1 = 2130838061(0x7f02022d, float:1.7281094E38)
            r0.setBackgroundResource(r1)
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r10.k()
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r2 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131624928(0x7f0e03e0, float:1.887705E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x021f:
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r0 = r10.f57881f
            if (r0 != 0) goto L_0x0228
            java.lang.String r1 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0228:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r1 = "mFollowNotice.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setFollowStatus(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.FansHolder.a(int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FansHolder(@NotNull View view, @NotNull Activity activity, @NotNull HashMap<String, Boolean> hashMap) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(hashMap, "mFollowClickMap");
        this.g = activity;
        this.v = hashMap;
        this.i = LazyKt.lazy(new m(view));
        this.j = LazyKt.lazy(new k(view));
        this.k = LazyKt.lazy(new d(view));
        this.l = LazyKt.lazy(new j(view));
        this.m = LazyKt.lazy(new e(view));
        this.n = LazyKt.lazy(new f(view));
        this.o = LazyKt.lazy(new i(view));
        this.p = LazyKt.lazy(new l(view));
        this.q = LazyKt.lazy(new g(view));
        com.bytedance.ies.dmt.ui.e.b.a(f());
        com.bytedance.ies.dmt.ui.e.b.a(g());
        View.OnClickListener onClickListener = this;
        k().setOnClickListener(onClickListener);
        e().setOnClickListener(onClickListener);
        g().setOnClickListener(onClickListener);
        f().setOnClickListener(onClickListener);
        j().setOnClickListener(onClickListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0216, code lost:
        if (r0.bc() == 3) goto L_0x0218;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.notification.bean.BaseNotice r21, boolean r22, @org.jetbrains.annotations.NotNull java.lang.String r23) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r23
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r12 = 1
            r0[r12] = r1
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57878a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.BaseNotice> r1 = com.ss.android.ugc.aweme.notification.bean.BaseNotice.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62978(0xf602, float:8.8251E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r0[r12] = r1
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f57878a
            r3 = 0
            r4 = 62978(0xf602, float:8.8251E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.notification.bean.BaseNotice> r1 = com.ss.android.ugc.aweme.notification.bean.BaseNotice.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005c:
            java.lang.String r0 = "enterFrom"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            if (r8 == 0) goto L_0x028e
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r0 = r8.followNotice
            if (r0 != 0) goto L_0x0069
            goto L_0x028e
        L_0x0069:
            super.a((com.ss.android.ugc.aweme.notification.bean.BaseNotice) r21, (boolean) r22, (java.lang.String) r23)
            r7.t = r8
            r7.u = r9
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r0 = r8.followNotice
            java.lang.String r1 = "notice.followNotice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.f57881f = r0
            java.lang.String r1 = "show"
            java.lang.String r2 = "fans"
            int r3 = r20.getAdapterPosition()
            r0 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r0.a(r1, r2, r3, r4, r5, r6)
            r0 = r22
            r7.a((boolean) r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f57878a
            r3 = 0
            r4 = 62972(0xf5fc, float:8.8243E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r6 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ba
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f57878a
            r3 = 0
            r4 = 62972(0xf5fc, float:8.8243E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r6 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x00b7:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            goto L_0x00c1
        L_0x00ba:
            kotlin.Lazy r0 = r7.p
            java.lang.Object r0 = r0.getValue()
            goto L_0x00b7
        L_0x00c1:
            java.lang.String r1 = "mTime"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.app.Activity r1 = r7.g
            android.content.Context r1 = (android.content.Context) r1
            long r2 = r8.createTime
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.String r1 = com.ss.android.ugc.aweme.utils.eo.b(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r20.f()
            java.lang.String r1 = "mAvatar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r1 = r7.f57881f
            if (r1 != 0) goto L_0x00eb
            java.lang.String r2 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00eb:
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.user
            r0.setData((com.ss.android.ugc.aweme.profile.model.User) r1)
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r0 = r7.f57881f
            if (r0 != 0) goto L_0x00f9
            java.lang.String r1 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00f9:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r1 = "mFollowNotice.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.a((com.ss.android.ugc.aweme.profile.model.User) r0)
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r0 = r7.f57881f
            if (r0 != 0) goto L_0x010c
            java.lang.String r1 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x010c:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r1 = "mFollowNotice.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r0 = r0.getRecommendReason()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0142
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r20.h()
            java.lang.String r1 = "mDescription"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r1 = r7.f57881f
            if (r1 != 0) goto L_0x0131
            java.lang.String r2 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0131:
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.user
            java.lang.String r2 = "mFollowNotice.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getRecommendReason()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            goto L_0x0164
        L_0x0142:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r20.h()
            java.lang.String r1 = "mDescription"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r2 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131560478(0x7f0d081e, float:1.874633E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0164:
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r0 = r7.f57881f
            if (r0 != 0) goto L_0x016d
            java.lang.String r1 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x016d:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r1 = "mFollowNotice.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.getFollowStatus()
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r1 = r7.f57881f
            if (r1 != 0) goto L_0x0181
            java.lang.String r2 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0181:
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.user
            java.lang.String r2 = "mFollowNotice.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            int r1 = r1.getFollowerStatus()
            r7.a(r0, r1)
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r0 = r7.f57881f
            if (r0 != 0) goto L_0x0198
            java.lang.String r1 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0198:
            com.ss.android.ugc.aweme.profile.model.User r8 = r0.user
            java.lang.String r0 = "mFollowNotice.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r0 = r7.f57881f
            if (r0 != 0) goto L_0x01a8
            java.lang.String r1 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01a8:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r1 = "mFollowNotice.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r15 = r0.getFollowStatus()
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f57878a
            r3 = 0
            r4 = 62984(0xf608, float:8.826E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01fa
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f57878a
            r3 = 0
            r4 = 62984(0xf608, float:8.826E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x027b
        L_0x01fa:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.bc()
            if (r0 == r13) goto L_0x0218
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.bc()
            if (r0 != r10) goto L_0x027b
        L_0x0218:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r7.v
            java.lang.String r1 = r8.getUid()
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0267
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r20.g()
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            com.ss.android.ugc.aweme.views.AutoRTLImageView r0 = r20.i()
            r17 = r0
            android.view.View r17 = (android.view.View) r17
            java.lang.String r18 = "message_fans"
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r7.v
            java.lang.String r1 = r8.getUid()
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0245
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0245:
            java.lang.String r1 = "mFollowClickMap[user.uid]!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r19 = r0.booleanValue()
            r14 = r8
            com.ss.android.ugc.aweme.profile.d.s.a((com.ss.android.ugc.aweme.profile.model.User) r14, (int) r15, (android.widget.TextView) r16, (android.view.View) r17, (java.lang.String) r18, (boolean) r19)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r7.v
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r8.getUid()
            java.lang.String r2 = "user.uid"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r1, r2)
            goto L_0x027b
        L_0x0267:
            com.ss.android.ugc.aweme.views.AutoRTLImageView r0 = r20.i()
            if (r0 == 0) goto L_0x027b
            com.ss.android.ugc.aweme.views.AutoRTLImageView r0 = r20.i()
            java.lang.String r1 = "mEditRemark"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
        L_0x027b:
            com.ss.android.ugc.aweme.views.RelationLabelTextView r0 = r20.j()
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r1 = r7.f57881f
            if (r1 != 0) goto L_0x0288
            java.lang.String r2 = "mFollowNotice"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0288:
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r1 = r1.relationLabel
            r0.a(r1)
            return
        L_0x028e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.FansHolder.a(com.ss.android.ugc.aweme.notification.bean.BaseNotice, boolean, java.lang.String):void");
    }
}

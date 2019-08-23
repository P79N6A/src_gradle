package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeAdapter;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.profile.d.q;
import com.ss.android.ugc.aweme.profile.d.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.ex;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 ]2\u00020\u0001:\u0001]B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020#2\u0006\u0010L\u001a\u00020MH\u0016J\u0018\u0010O\u001a\u00020#2\u0006\u0010P\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0016J\u0018\u0010R\u001a\u00020#2\u0006\u0010L\u001a\u00020M2\u0006\u0010S\u001a\u00020\u0017H\u0016J\u0018\u0010T\u001a\u00020#2\u0006\u0010L\u001a\u00020M2\u0006\u0010P\u001a\u00020\u0007H\u0016J\u0018\u0010U\u001a\u00020#2\u0006\u0010S\u001a\u00020\u00172\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010V\u001a\u00020\u0007H\u0016J>\u0010W\u001a\u00020#26\u0010X\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0\u001dJ\u000e\u0010Y\u001a\u00020#2\u0006\u0010Z\u001a\u00020\u0007J\u0016\u0010[\u001a\u00020#2\u0006\u0010L\u001a\u00020M2\u0006\u0010S\u001a\u00020\u0017J\u000e\u0010\\\u001a\u00020#2\u0006\u0010L\u001a\u00020MR\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR@\u0010\u001c\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00100\"\u0004\b=\u00102R\u001a\u0010>\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00100\"\u0004\b@\u00102R\u000e\u0010A\u001a\u00020BX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0019\"\u0004\bJ\u0010\u001b¨\u0006^"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/RecommendUserItemView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAdapterPosition", "mAvatarIv", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "getMAvatarIv", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "setMAvatarIv", "(Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;)V", "mBlockUserIv", "Landroid/widget/ImageView;", "getMBlockUserIv", "()Landroid/widget/ImageView;", "setMBlockUserIv", "(Landroid/widget/ImageView;)V", "mDescTv", "Landroid/widget/TextView;", "getMDescTv", "()Landroid/widget/TextView;", "setMDescTv", "(Landroid/widget/TextView;)V", "mEventListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "actionId", "", "extra", "", "mFollowInfoTv", "getMFollowInfoTv", "setMFollowInfoTv", "mFollowUserBtn", "Lcom/ss/android/ugc/aweme/following/ui/view/FollowUserBtn;", "getMFollowUserBtn", "()Lcom/ss/android/ugc/aweme/following/ui/view/FollowUserBtn;", "setMFollowUserBtn", "(Lcom/ss/android/ugc/aweme/following/ui/view/FollowUserBtn;)V", "mNewFriendRecommendMask", "Landroid/view/View;", "getMNewFriendRecommendMask", "()Landroid/view/View;", "setMNewFriendRecommendMask", "(Landroid/view/View;)V", "mRecViewRecommendItem", "Landroid/support/v7/widget/RecyclerView;", "getMRecViewRecommendItem", "()Landroid/support/v7/widget/RecyclerView;", "setMRecViewRecommendItem", "(Landroid/support/v7/widget/RecyclerView;)V", "mRelativeUserAvatars", "Lcom/ss/android/ugc/aweme/friends/ui/RelativeUserAvatarListView;", "mRemarkEdit", "getMRemarkEdit", "setMRemarkEdit", "mRootView", "getMRootView", "setMRootView", "mShowBlockIcon", "", "mTagLayout", "Landroid/widget/LinearLayout;", "mTagLayoutManager", "Lcom/ss/android/ugc/aweme/profile/util/ProfileTagLayoutManager;", "mTagWidth", "mUserNameTv", "getMUserNameTv", "setMUserNameTv", "bind", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "displayDislikeIcon", "displayFollowStatus", "followStatus", "followerStatus", "displayRecommendReason", "textView", "displayRemarkEditView", "displayUserInfo", "getLayoutResId", "setActionEventListener", "listener", "setAdapterPosition", "position", "showRelativeUserAvatar", "showUserTag", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class an extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f49427b = null;

    /* renamed from: d  reason: collision with root package name */
    public static final int f49428d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f49429e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f49430f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final a i = new a((byte) 0);
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private View f49431a;

    /* renamed from: c  reason: collision with root package name */
    public Function2<? super Integer, ? super String, Unit> f49432c;
    @NotNull
    private TextView j;
    @NotNull
    private AvatarImageWithVerify k;
    @NotNull
    private TextView l;
    @NotNull
    private FollowUserBtn m;
    @NotNull
    private TextView n;
    @NotNull
    private View o;
    @NotNull
    private ImageView p;
    @NotNull
    private View q;
    @NotNull
    private RecyclerView r;
    private final boolean s;
    private int t;
    private RelativeUserAvatarListView u;
    private LinearLayout v;
    private int w;
    private q x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/RecommendUserItemView$Companion;", "", "()V", "ACTION_CLICK_USER_AWEME_ITEM", "", "getACTION_CLICK_USER_AWEME_ITEM", "()I", "ACTION_CLICK_USER_BLOCK", "getACTION_CLICK_USER_BLOCK", "ACTION_CLICK_USER_DETAIL", "getACTION_CLICK_USER_DETAIL", "ACTION_CLICK_USER_FOLLOW", "getACTION_CLICK_USER_FOLLOW", "ACTION_CLICK_USER_HEAD", "getACTION_CLICK_USER_HEAD", "ACTION_SHOW", "getACTION_SHOW", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public static int a() {
            return an.f49428d;
        }

        public static int b() {
            return an.f49429e;
        }

        public static int c() {
            return an.f49430f;
        }

        public static int d() {
            return an.g;
        }

        public static int e() {
            return an.h;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ an f49434b;

        b(an anVar) {
            this.f49434b = anVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49433a, false, 47458, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49433a, false, 47458, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function2<? super Integer, ? super String, Unit> function2 = this.f49434b.f49432c;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(a.a()), "click_head");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ an f49436b;

        c(an anVar) {
            this.f49436b = anVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49435a, false, 47459, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49435a, false, 47459, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function2<? super Integer, ? super String, Unit> function2 = this.f49436b.f49432c;
            if (function2 != null) {
                function2.invoke(0, "click_name");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ an f49438b;

        d(an anVar) {
            this.f49438b = anVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49437a, false, 47460, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49437a, false, 47460, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function2<? super Integer, ? super String, Unit> function2 = this.f49438b.f49432c;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(a.b()), "");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ an f49440b;

        e(an anVar) {
            this.f49440b = anVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49439a, false, 47461, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49439a, false, 47461, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function2<? super Integer, ? super String, Unit> function2 = this.f49440b.f49432c;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(a.c()), "");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "aid", "", "kotlin.jvm.PlatformType", "position", "", "onRecommendAwemeItemClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements RecommendAwemeViewHolder.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ an f49442b;

        f(an anVar) {
            this.f49442b = anVar;
        }

        public final void a(String str, int i) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f49441a, false, 47462, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f49441a, false, 47462, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            h a2 = h.a();
            a2.a(j.a("aweme://aweme/detail/" + str2).a("refer", "find_friends").a());
            Function2<? super Integer, ? super String, Unit> function2 = this.f49442b.f49432c;
            if (function2 != null) {
                Integer valueOf = Integer.valueOf(a.d());
                Intrinsics.checkExpressionValueIsNotNull(str2, "aid");
                function2.invoke(valueOf, str2);
            }
        }
    }

    public int getLayoutResId() {
        return C0906R.layout.zg;
    }

    @NotNull
    public final AvatarImageWithVerify getMAvatarIv() {
        return this.k;
    }

    @NotNull
    public final ImageView getMBlockUserIv() {
        return this.p;
    }

    @NotNull
    public final TextView getMDescTv() {
        return this.n;
    }

    @NotNull
    public final TextView getMFollowInfoTv() {
        return this.l;
    }

    @NotNull
    public final FollowUserBtn getMFollowUserBtn() {
        return this.m;
    }

    @NotNull
    public final View getMNewFriendRecommendMask() {
        return this.q;
    }

    @NotNull
    public final RecyclerView getMRecViewRecommendItem() {
        return this.r;
    }

    @NotNull
    public final View getMRemarkEdit() {
        return this.o;
    }

    @NotNull
    public final View getMRootView() {
        return this.f49431a;
    }

    @NotNull
    public final TextView getMUserNameTv() {
        return this.j;
    }

    public final void setAdapterPosition(int i2) {
        this.t = i2;
    }

    public final void setActionEventListener(@NotNull Function2<? super Integer, ? super String, Unit> function2) {
        Function2<? super Integer, ? super String, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{function22}, this, f49427b, false, 47447, new Class[]{Function2.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function22}, this, f49427b, false, 47447, new Class[]{Function2.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function22, "listener");
        this.f49432c = function22;
    }

    public final void setMAvatarIv(@NotNull AvatarImageWithVerify avatarImageWithVerify) {
        AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
        if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2}, this, f49427b, false, 47439, new Class[]{AvatarImageWithVerify.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2}, this, f49427b, false, 47439, new Class[]{AvatarImageWithVerify.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(avatarImageWithVerify2, "<set-?>");
        this.k = avatarImageWithVerify2;
    }

    public final void setMBlockUserIv(@NotNull ImageView imageView) {
        ImageView imageView2 = imageView;
        if (PatchProxy.isSupport(new Object[]{imageView2}, this, f49427b, false, 47444, new Class[]{ImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2}, this, f49427b, false, 47444, new Class[]{ImageView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(imageView2, "<set-?>");
        this.p = imageView2;
    }

    public final void setMDescTv(@NotNull TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2}, this, f49427b, false, 47442, new Class[]{TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2}, this, f49427b, false, 47442, new Class[]{TextView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(textView2, "<set-?>");
        this.n = textView2;
    }

    public final void setMFollowInfoTv(@NotNull TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2}, this, f49427b, false, 47440, new Class[]{TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2}, this, f49427b, false, 47440, new Class[]{TextView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(textView2, "<set-?>");
        this.l = textView2;
    }

    public final void setMFollowUserBtn(@NotNull FollowUserBtn followUserBtn) {
        FollowUserBtn followUserBtn2 = followUserBtn;
        if (PatchProxy.isSupport(new Object[]{followUserBtn2}, this, f49427b, false, 47441, new Class[]{FollowUserBtn.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followUserBtn2}, this, f49427b, false, 47441, new Class[]{FollowUserBtn.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(followUserBtn2, "<set-?>");
        this.m = followUserBtn2;
    }

    public final void setMNewFriendRecommendMask(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f49427b, false, 47445, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f49427b, false, 47445, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "<set-?>");
        this.q = view2;
    }

    public final void setMRecViewRecommendItem(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f49427b, false, 47446, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f49427b, false, 47446, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "<set-?>");
        this.r = recyclerView2;
    }

    public final void setMRemarkEdit(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f49427b, false, 47443, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f49427b, false, 47443, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "<set-?>");
        this.o = view2;
    }

    public final void setMRootView(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f49427b, false, 47437, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f49427b, false, 47437, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "<set-?>");
        this.f49431a = view2;
    }

    public final void setMUserNameTv(@NotNull TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2}, this, f49427b, false, 47438, new Class[]{TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2}, this, f49427b, false, 47438, new Class[]{TextView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(textView2, "<set-?>");
        this.j = textView2;
    }

    public void b(@NotNull User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f49427b, false, 47454, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f49427b, false, 47454, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        if (!this.s) {
            this.p.setVisibility(8);
        } else if (user.getFollowStatus() == 0) {
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(4);
        }
    }

    public void a(@NotNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f49427b, false, 47448, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f49427b, false, 47448, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        this.f49431a.setOnClickListener(new b(this));
        if (TextUtils.isEmpty(user.getRemarkName())) {
            this.j.setText(user.getNickname());
        } else {
            this.j.setText(user.getRemarkName());
        }
        this.j.setOnClickListener(new c(this));
        this.k.setData(user2);
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        AbTestModel d2 = a2.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "AbTestManager.getInstance().abTestSettingModel");
        if (d2.isRecommendItemShowMoreInfo) {
            TextView textView = this.n;
            if (PatchProxy.isSupport(new Object[]{user2, textView}, this, f49427b, false, 47449, new Class[]{User.class, TextView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user2, textView}, this, f49427b, false, 47449, new Class[]{User.class, TextView.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
                Intrinsics.checkParameterIsNotNull(textView, "textView");
                this.u.setVisibility(0);
                textView.setMaxLines(2);
                a(user2, textView);
                this.u.a(user2, textView);
            }
            if (PatchProxy.isSupport(new Object[]{user2}, this, f49427b, false, 47450, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user2}, this, f49427b, false, 47450, new Class[]{User.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
                this.x.a(user2, this.w);
            }
        } else {
            a(user2, this.n);
            a(this.l, user2);
        }
        int followStatus = user.getFollowStatus();
        int followerStatus = user.getFollowerStatus();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(followStatus), Integer.valueOf(followerStatus)}, this, f49427b, false, 47453, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(followStatus), Integer.valueOf(followerStatus)}, this, f49427b, false, 47453, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            if (ex.b()) {
                this.m.setVisibility(8);
            }
            this.m.a(followStatus, followerStatus);
        }
        b(user);
        this.m.setOnClickListener(new d(this));
        a(user2, user.getFollowStatus());
        this.p.setOnClickListener(new e(this));
        if (!CollectionUtils.isEmpty(user.getRecommendAwemeItems())) {
            this.r.setVisibility(0);
            RecommendAwemeAdapter recommendAwemeAdapter = new RecommendAwemeAdapter();
            recommendAwemeAdapter.f48746c = new f(this);
            recommendAwemeAdapter.setData(user.getRecommendAwemeItems());
            recommendAwemeAdapter.f48745b = this.t;
            this.r.setAdapter(recommendAwemeAdapter);
            return;
        }
        this.r.setVisibility(8);
    }

    private void a(@NotNull User user, @NotNull TextView textView) {
        User user2 = user;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{user2, textView2}, this, f49427b, false, 47452, new Class[]{User.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, textView2}, this, f49427b, false, 47452, new Class[]{User.class, TextView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        Intrinsics.checkParameterIsNotNull(textView2, "textView");
        textView2.setVisibility(0);
        if (!TextUtils.isEmpty(user.getRecommendReason())) {
            textView2.setText(user.getRecommendReason());
        } else if (!TextUtils.isEmpty(user.getSignature())) {
            textView2.setText(user.getSignature());
        } else if (com.ss.android.g.a.a()) {
            textView2.setText(C0906R.string.c8h);
        } else {
            textView2.setVisibility(8);
        }
    }

    public void a(@NotNull TextView textView, @NotNull User user) {
        TextView textView2 = textView;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{textView2, user2}, this, f49427b, false, 47451, new Class[]{TextView.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, user2}, this, f49427b, false, 47451, new Class[]{TextView.class, User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(textView2, "textView");
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        textView2.setVisibility(0);
        textView2.setText(getContext().getString(C0906R.string.du7) + ":" + com.ss.android.ugc.aweme.i18n.b.a((long) user.getAwemeCount()) + "  " + getContext().getString(C0906R.string.agu) + ":" + com.ss.android.ugc.aweme.i18n.b.a((long) user.getFollowerCount()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0069, code lost:
        if (r0.bc() == 3) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.profile.model.User r11, int r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f49427b
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 47455(0xb95f, float:6.6499E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f49427b
            r3 = 0
            r4 = 47455(0xb95f, float:6.6499E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            java.lang.String r0 = "user"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.bc()
            if (r0 == r7) goto L_0x006b
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.bc()
            r1 = 3
            if (r0 != r1) goto L_0x0085
        L_0x006b:
            int r0 = r11.getFollowStatus()
            if (r0 == 0) goto L_0x007e
            android.widget.TextView r2 = r10.j
            android.view.View r3 = r10.o
            java.lang.String r4 = "find_friends"
            r5 = 1
            r0 = r11
            r1 = r12
            com.ss.android.ugc.aweme.profile.d.s.a((com.ss.android.ugc.aweme.profile.model.User) r0, (int) r1, (android.widget.TextView) r2, (android.view.View) r3, (java.lang.String) r4, (boolean) r5)
            return
        L_0x007e:
            android.view.View r0 = r10.o
            r1 = 8
            r0.setVisibility(r1)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.an.a(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public an(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float dip2Px;
        Intrinsics.checkParameterIsNotNull(context, "context");
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        this.s = a2.C();
        View inflate = LayoutInflater.from(context).inflate(getLayoutResId(), this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…e(getLayoutResId(), this)");
        this.f49431a = inflate;
        setBackground(com.bytedance.ies.dmt.ui.common.c.e(context));
        View findViewById = this.f49431a.findViewById(C0906R.id.dnq);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById<T…View>(R.id.txt_user_name)");
        this.j = (TextView) findViewById;
        View findViewById2 = this.f49431a.findViewById(C0906R.id.ayr);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById<A…thVerify>(R.id.iv_avatar)");
        this.k = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = this.f49431a.findViewById(C0906R.id.dn1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById<T…ew>(R.id.txt_follow_info)");
        this.l = (TextView) findViewById3;
        View findViewById4 = this.f49431a.findViewById(C0906R.id.o2);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.findViewById<F…UserBtn>(R.id.btn_follow)");
        this.m = (FollowUserBtn) findViewById4;
        View findViewById5 = this.f49431a.findViewById(C0906R.id.dau);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mRootView.findViewById<TextView>(R.id.tv_desc)");
        this.n = (TextView) findViewById5;
        View findViewById6 = this.f49431a.findViewById(C0906R.id.b0u);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mRootView.findViewById<View>(R.id.iv_edit_remark)");
        this.o = findViewById6;
        View findViewById7 = this.f49431a.findViewById(C0906R.id.az7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "mRootView.findViewById<I…(R.id.iv_block_recommend)");
        this.p = (ImageView) findViewById7;
        View findViewById8 = this.f49431a.findViewById(C0906R.id.bqb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "mRootView.findViewById<V…ew_friend_recommend_mask)");
        this.q = findViewById8;
        View findViewById9 = this.f49431a.findViewById(C0906R.id.bcv);
        RecyclerView recyclerView = (RecyclerView) findViewById9;
        recyclerView.addItemDecoration(new DividerItemDecoration(0, (int) UIUtils.dip2Px(context, 4.0f), 0));
        recyclerView.setLayoutManager(new RecommendUserItemView$$special$$inlined$apply$lambda$1(context, 0, false, context));
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "mRootView.findViewById<R…}\n            }\n        }");
        this.r = recyclerView;
        View findViewById10 = this.f49431a.findViewById(C0906R.id.cd2);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "mRootView.findViewById(R.id.relative_user_avatar)");
        this.u = (RelativeUserAvatarListView) findViewById10;
        View findViewById11 = this.f49431a.findViewById(C0906R.id.czc);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "mRootView.findViewById(R.id.tag_layout)");
        this.v = (LinearLayout) findViewById11;
        int screenWidth = UIUtils.getScreenWidth(this.f49431a.getContext());
        if (this.s) {
            dip2Px = UIUtils.dip2Px(this.f49431a.getContext(), 210.0f);
        } else {
            dip2Px = UIUtils.dip2Px(this.f49431a.getContext(), 185.0f);
        }
        this.w = screenWidth - ((int) dip2Px);
        this.x = new r(this.v, this.w);
    }

    public /* synthetic */ an(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, null, 0);
    }
}

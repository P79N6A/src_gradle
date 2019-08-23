package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseItemWidgetViewHolder;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.friends.ui.RelativeUserAvatarListView;
import com.ss.android.ugc.aweme.notification.view.FansFollowUserBtn;
import com.ss.android.ugc.aweme.profile.d.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.user.repository.l;
import com.ss.android.ugc.aweme.utils.ex;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020(2\u0006\u0010B\u001a\u00020(J\u000e\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020,J\u0016\u0010E\u001a\u00020@2\u0006\u0010D\u001a\u00020,2\u0006\u0010F\u001a\u000202J\u0016\u0010G\u001a\u00020@2\u0006\u0010D\u001a\u00020,2\u0006\u0010A\u001a\u00020(J\u0016\u0010H\u001a\u00020@2\u0006\u0010F\u001a\u0002022\u0006\u0010D\u001a\u00020,J\u000e\u0010I\u001a\u00020J2\u0006\u0010D\u001a\u00020,J\u000e\u0010K\u001a\u00020@2\u0006\u0010A\u001a\u00020LJ\u0016\u0010M\u001a\u00020@2\u0006\u0010D\u001a\u00020,2\u0006\u0010F\u001a\u000202J\u000e\u0010N\u001a\u00020@2\u0006\u0010D\u001a\u00020,R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00100\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u00140\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n \b*\u0004\u0018\u00010\u00180\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u001f\u001a\n \b*\u0004\u0018\u00010 0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0019\u00101\u001a\n \b*\u0004\u0018\u00010202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u00105\u001a\n \b*\u0004\u0018\u00010606¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u00109\u001a\n \b*\u0004\u0018\u00010202¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0019\u0010;\u001a\n \b*\u0004\u0018\u00010202¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0019\u0010=\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\n¨\u0006O"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendListWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/user/repository/UserWrapper;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "editRemark", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getEditRemark", "()Landroid/view/View;", "ivAvatar", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "getIvAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "ivBlockUser", "Landroid/widget/ImageView;", "getIvBlockUser", "()Landroid/widget/ImageView;", "mRecViewRecommendItem", "Landroid/support/v7/widget/RecyclerView;", "getMRecViewRecommendItem", "()Landroid/support/v7/widget/RecyclerView;", "mRelativeUserAvatars", "Lcom/ss/android/ugc/aweme/friends/ui/RelativeUserAvatarListView;", "getMRelativeUserAvatars", "()Lcom/ss/android/ugc/aweme/friends/ui/RelativeUserAvatarListView;", "mShowBlockIcon", "", "getMShowBlockIcon", "()Z", "mTagLayout", "Landroid/widget/LinearLayout;", "getMTagLayout", "()Landroid/widget/LinearLayout;", "mTagLayoutManager", "Lcom/ss/android/ugc/aweme/profile/util/ProfileTagLayoutManager;", "getMTagLayoutManager", "()Lcom/ss/android/ugc/aweme/profile/util/ProfileTagLayoutManager;", "mTagWidth", "", "getMTagWidth", "()I", "mUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getMUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "setMUser", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "txtDesc", "Landroid/widget/TextView;", "getTxtDesc", "()Landroid/widget/TextView;", "txtFollow", "Lcom/ss/android/ugc/aweme/notification/view/FansFollowUserBtn;", "getTxtFollow", "()Lcom/ss/android/ugc/aweme/notification/view/FansFollowUserBtn;", "txtFollowInfo", "getTxtFollowInfo", "txtUserName", "getTxtUserName", "viewNewFriendRecommendMask", "getViewNewFriendRecommendMask", "displayFollowStatus", "", "followStatus", "followerStatus", "displayName", "user", "displayRecommendReason", "textView", "displayRemarkEditView", "displayUserInfo", "getUserInfo", "", "onFollowSuccess", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "showRelativeUserAvatar", "showUserTag", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendListWidgetViewHolder extends JediBaseItemWidgetViewHolder<l> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f49100d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public User f49101e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f49102f = ((TextView) this.itemView.findViewById(C0906R.id.dnq));
    public final AvatarImageWithVerify g = ((AvatarImageWithVerify) this.itemView.findViewById(C0906R.id.ayr));
    public final TextView h = ((TextView) this.itemView.findViewById(C0906R.id.dn1));
    public final FansFollowUserBtn i = ((FansFollowUserBtn) this.itemView.findViewById(C0906R.id.o2));
    public final TextView j = ((TextView) this.itemView.findViewById(C0906R.id.dau));
    public final View k = this.itemView.findViewById(C0906R.id.b0u);
    public final ImageView l = ((ImageView) this.itemView.findViewById(C0906R.id.az7));
    public final View m = this.itemView.findViewById(C0906R.id.bqb);
    public final RecyclerView n = ((RecyclerView) this.itemView.findViewById(C0906R.id.bcv));
    public final LinearLayout o = ((LinearLayout) this.itemView.findViewById(C0906R.id.czc));
    public final RelativeUserAvatarListView p = ((RelativeUserAvatarListView) this.itemView.findViewById(C0906R.id.cd2));
    public final boolean q;
    public final int r;
    @NotNull
    public final q s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRemarkEditSuccess"}, k = 3, mv = {1, 1, 15})
    static final class a implements RemarkEditDialog.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendListWidgetViewHolder f49105b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f49106c;

        a(RecommendListWidgetViewHolder recommendListWidgetViewHolder, User user) {
            this.f49105b = recommendListWidgetViewHolder;
            this.f49106c = user;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f49104a, false, 46968, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49104a, false, 46968, new Class[0], Void.TYPE);
                return;
            }
            this.f49105b.b(this.f49106c);
        }
    }

    public final void a(@NotNull User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f49100d, false, 46961, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f49100d, false, 46961, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        this.s.a(user, this.r);
    }

    public final void b(@NotNull User user) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{user}, this, f49100d, false, 46966, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f49100d, false, 46966, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        CharSequence remarkName = user.getRemarkName();
        if (!(remarkName == null || remarkName.length() == 0)) {
            z = false;
        }
        if (z) {
            TextView textView = this.f49102f;
            Intrinsics.checkExpressionValueIsNotNull(textView, "txtUserName");
            textView.setText(user.getNickname());
            return;
        }
        TextView textView2 = this.f49102f;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "txtUserName");
        textView2.setText(user.getRemarkName());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecommendListWidgetViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            r2 = 2131690450(0x7f0f03d2, float:1.9009944E38)
            android.view.View r5 = r0.inflate(r2, r5, r1)
            java.lang.String r0 = "LayoutInflater.from(pare…dget_item, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            r4.<init>(r5)
            android.view.View r5 = r4.itemView
            r0 = 2131171197(0x7f07177d, float:1.7956774E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f49102f = r5
            android.view.View r5 = r4.itemView
            r0 = 2131167499(0x7f07090b, float:1.7949273E38)
            android.view.View r5 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r5 = (com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify) r5
            r4.g = r5
            android.view.View r5 = r4.itemView
            r0 = 2131171171(0x7f071763, float:1.7956721E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.h = r5
            android.view.View r5 = r4.itemView
            r0 = 2131165740(0x7f07022c, float:1.7945706E38)
            android.view.View r5 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.notification.view.FansFollowUserBtn r5 = (com.ss.android.ugc.aweme.notification.view.FansFollowUserBtn) r5
            r4.i = r5
            android.view.View r5 = r4.itemView
            r0 = 2131170722(0x7f0715a2, float:1.795581E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.j = r5
            android.view.View r5 = r4.itemView
            r0 = 2131167576(0x7f070958, float:1.794943E38)
            android.view.View r5 = r5.findViewById(r0)
            r4.k = r5
            android.view.View r5 = r4.itemView
            r0 = 2131167515(0x7f07091b, float:1.7949306E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.l = r5
            android.view.View r5 = r4.itemView
            r0 = 2131168556(0x7f070d2c, float:1.7951417E38)
            android.view.View r5 = r5.findViewById(r0)
            r4.m = r5
            android.view.View r5 = r4.itemView
            r0 = 2131168058(0x7f070b3a, float:1.7950407E38)
            android.view.View r5 = r5.findViewById(r0)
            android.support.v7.widget.RecyclerView r5 = (android.support.v7.widget.RecyclerView) r5
            r4.n = r5
            android.view.View r5 = r4.itemView
            r0 = 2131170257(0x7f0713d1, float:1.7954867E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r4.o = r5
            android.view.View r5 = r4.itemView
            r0 = 2131169434(0x7f07109a, float:1.7953198E38)
            android.view.View r5 = r5.findViewById(r0)
            com.ss.android.ugc.aweme.friends.ui.RelativeUserAvatarListView r5 = (com.ss.android.ugc.aweme.friends.ui.RelativeUserAvatarListView) r5
            r4.p = r5
            com.ss.android.ugc.aweme.setting.AbTestManager r5 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            boolean r5 = r5.C()
            r4.q = r5
            android.view.View r5 = r4.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            android.content.Context r5 = r5.getContext()
            int r5 = com.bytedance.common.utility.UIUtils.getScreenWidth(r5)
            boolean r0 = r4.q
            if (r0 == 0) goto L_0x00dd
            android.view.View r0 = r4.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.content.Context r0 = r0.getContext()
            r2 = 1129447424(0x43520000, float:210.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r2)
        L_0x00db:
            int r0 = (int) r0
            goto L_0x00ef
        L_0x00dd:
            android.view.View r0 = r4.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.content.Context r0 = r0.getContext()
            r2 = 1127809024(0x43390000, float:185.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r2)
            goto L_0x00db
        L_0x00ef:
            int r5 = r5 - r0
            r4.r = r5
            com.ss.android.ugc.aweme.profile.d.r r5 = new com.ss.android.ugc.aweme.profile.d.r
            android.widget.LinearLayout r0 = r4.o
            int r2 = r4.r
            r5.<init>(r0, r2)
            com.ss.android.ugc.aweme.profile.d.q r5 = (com.ss.android.ugc.aweme.profile.d.q) r5
            r4.s = r5
            android.support.v7.widget.RecyclerView r5 = r4.n
            com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration r0 = new com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration
            android.support.v7.widget.RecyclerView r2 = r4.n
            java.lang.String r3 = "mRecViewRecommendItem"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.Context r2 = r2.getContext()
            r3 = 1082130432(0x40800000, float:4.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            int r2 = (int) r2
            r0.<init>(r1, r2, r1)
            android.support.v7.widget.RecyclerView$ItemDecoration r0 = (android.support.v7.widget.RecyclerView.ItemDecoration) r0
            r5.addItemDecoration(r0)
            android.support.v7.widget.RecyclerView r5 = r4.n
            java.lang.String r0 = "mRecViewRecommendItem"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendListWidgetViewHolder$1 r0 = new com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendListWidgetViewHolder$1
            android.support.v7.widget.RecyclerView r2 = r4.n
            java.lang.String r3 = "mRecViewRecommendItem"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.Context r2 = r2.getContext()
            r0.<init>(r4, r2, r1, r1)
            android.support.v7.widget.RecyclerView$LayoutManager r0 = (android.support.v7.widget.RecyclerView.LayoutManager) r0
            r5.setLayoutManager(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendListWidgetViewHolder.<init>(android.view.ViewGroup):void");
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49100d, false, 46964, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49100d, false, 46964, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (ex.b()) {
            FansFollowUserBtn fansFollowUserBtn = this.i;
            Intrinsics.checkExpressionValueIsNotNull(fansFollowUserBtn, "txtFollow");
            fansFollowUserBtn.setVisibility(8);
        }
        this.i.a(i2, i3);
    }

    private void b(@NotNull User user, @NotNull TextView textView) {
        User user2 = user;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{user2, textView2}, this, f49100d, false, 46962, new Class[]{User.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, textView2}, this, f49100d, false, 46962, new Class[]{User.class, TextView.class}, Void.TYPE);
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006b, code lost:
        if (r0.bc() == 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.profile.model.User r11, int r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f49100d
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 46965(0xb775, float:6.5812E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f49100d
            r3 = 0
            r4 = 46965(0xb775, float:6.5812E-41)
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
            r6 = 8
            if (r0 == r7) goto L_0x006d
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.bc()
            r1 = 3
            if (r0 != r1) goto L_0x0089
        L_0x006d:
            int r0 = r11.getFollowStatus()
            if (r0 == 0) goto L_0x0080
            android.widget.TextView r2 = r10.f49102f
            android.view.View r3 = r10.k
            java.lang.String r4 = "find_friends"
            r5 = 1
            r0 = r11
            r1 = r12
            com.ss.android.ugc.aweme.profile.d.s.a((com.ss.android.ugc.aweme.profile.model.User) r0, (int) r1, (android.widget.TextView) r2, (android.view.View) r3, (java.lang.String) r4, (boolean) r5)
            goto L_0x0089
        L_0x0080:
            android.view.View r0 = r10.k
            if (r0 == 0) goto L_0x0089
            android.view.View r0 = r10.k
            r0.setVisibility(r6)
        L_0x0089:
            boolean r0 = r10.q
            if (r0 == 0) goto L_0x00aa
            int r0 = r11.getFollowStatus()
            if (r0 != 0) goto L_0x009e
            android.widget.ImageView r0 = r10.l
            java.lang.String r1 = "ivBlockUser"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r8)
            return
        L_0x009e:
            android.widget.ImageView r0 = r10.l
            java.lang.String r1 = "ivBlockUser"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 4
            r0.setVisibility(r1)
            return
        L_0x00aa:
            android.widget.ImageView r0 = r10.l
            java.lang.String r1 = "ivBlockUser"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendListWidgetViewHolder.a(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    public final void a(@NotNull User user, @NotNull TextView textView) {
        if (PatchProxy.isSupport(new Object[]{user, textView}, this, f49100d, false, 46963, new Class[]{User.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, textView}, this, f49100d, false, 46963, new Class[]{User.class, TextView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        RelativeUserAvatarListView relativeUserAvatarListView = this.p;
        Intrinsics.checkExpressionValueIsNotNull(relativeUserAvatarListView, "mRelativeUserAvatars");
        relativeUserAvatarListView.setVisibility(0);
        textView.setMaxLines(2);
        b(user, textView);
        this.p.a(user, textView);
    }
}

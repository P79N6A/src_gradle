package com.ss.android.ugc.aweme.friends.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.base.BaseViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.a.b;
import com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsAdapter$AtViewHolder;", "()V", "value", "Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel$Companion$AllFriends;", "allFriends", "getAllFriends", "()Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel$Companion$AllFriends;", "setAllFriends", "(Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel$Companion$AllFriends;)V", "data", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AtViewHolder", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AtFriendsAdapter extends RecyclerView.Adapter<AtViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48671a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f48672d = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<? extends IMUser> f48673b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public AtFriendsViewModel.Companion.AllFriends f48674c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020(H\u0014J\u0018\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u000200H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017¨\u00061"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsAdapter$AtViewHolder;", "Lcom/bytedance/ies/dmt/ui/base/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "container", "Landroid/view/View;", "adapter", "Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsAdapter;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsAdapter;)V", "getAdapter", "()Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsAdapter;", "avatar", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "getAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "setAvatar", "(Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;)V", "getContainer", "()Landroid/view/View;", "desc", "Landroid/widget/TextView;", "getDesc", "()Landroid/widget/TextView;", "setDesc", "(Landroid/widget/TextView;)V", "indexLabel", "getIndexLabel", "setIndexLabel", "name", "getName", "setName", "relation", "Landroid/widget/ImageView;", "getRelation", "()Landroid/widget/ImageView;", "setRelation", "(Landroid/widget/ImageView;)V", "sectionLabel", "getSectionLabel", "setSectionLabel", "bind", "", "user", "position", "", "initListeners", "setDrawableRight", "tv", "drawableRight", "Landroid/graphics/drawable/Drawable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class AtViewHolder extends BaseViewHolder<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48675a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public TextView f48676b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public TextView f48677c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public AvatarImageWithVerify f48678d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public TextView f48679e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public TextView f48680f;
        @NotNull
        public ImageView g;
        @NotNull
        public final View h;
        @NotNull
        public final AtFriendsAdapter i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48681a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AtViewHolder f48682b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ IMUser f48683c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ User f48684d;

            a(AtViewHolder atViewHolder, IMUser iMUser, User user) {
                this.f48682b = atViewHolder;
                this.f48683c = iMUser;
                this.f48684d = user;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48681a, false, 46227, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48681a, false, 46227, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                IAccountUserService a2 = d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                if (!TextUtils.equals(a2.getCurUserId(), this.f48683c.getUid())) {
                    r.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f48683c.getUid()));
                    bg.a(new b(this.f48684d));
                    return;
                }
                View view2 = this.f48682b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                com.bytedance.ies.dmt.ui.d.a.b(view2.getContext(), (int) C0906R.string.bh5).a();
            }
        }

        public final void b() {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AtViewHolder(@NotNull View view, @NotNull AtFriendsAdapter atFriendsAdapter) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "container");
            Intrinsics.checkParameterIsNotNull(atFriendsAdapter, "adapter");
            this.h = view;
            this.i = atFriendsAdapter;
            View findViewById = this.h.findViewById(C0906R.id.cmg);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "container.findViewById(R.id.sectionLabel)");
            this.f48676b = (TextView) findViewById;
            View findViewById2 = this.h.findViewById(C0906R.id.au0);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "container.findViewById(R.id.indexLabel)");
            this.f48677c = (TextView) findViewById2;
            View findViewById3 = this.h.findViewById(C0906R.id.hk);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "container.findViewById(R.id.avatar)");
            this.f48678d = (AvatarImageWithVerify) findViewById3;
            View findViewById4 = this.h.findViewById(C0906R.id.bpn);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "container.findViewById(R.id.name)");
            this.f48679e = (TextView) findViewById4;
            View findViewById5 = this.h.findViewById(C0906R.id.a3m);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "container.findViewById(R.id.desc)");
            this.f48680f = (TextView) findViewById5;
            View findViewById6 = this.h.findViewById(C0906R.id.ccz);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "container.findViewById(R.id.relation)");
            this.g = (ImageView) findViewById6;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsAdapter$Companion;", "", "()V", "convert2User", "Lcom/ss/android/ugc/aweme/profile/model/User;", "imUser", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48685a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final User a(@NotNull IMUser iMUser) {
            IMUser iMUser2 = iMUser;
            if (PatchProxy.isSupport(new Object[]{iMUser2}, this, f48685a, false, 46228, new Class[]{IMUser.class}, User.class)) {
                return (User) PatchProxy.accessDispatch(new Object[]{iMUser2}, this, f48685a, false, 46228, new Class[]{IMUser.class}, User.class);
            }
            Intrinsics.checkParameterIsNotNull(iMUser2, "imUser");
            User user = new User();
            user.setUid(iMUser.getUid());
            user.setNickname(iMUser.getNickName());
            user.setSignature(iMUser.getSignature());
            user.setAvatarThumb(iMUser.getAvatarThumb());
            user.setUniqueId(iMUser.getUniqueId());
            user.setShortId(iMUser.getShortId());
            user.setFollowStatus(iMUser.getFollowStatus());
            user.setCustomVerify(iMUser.getCustomVerify());
            user.setWeiboVerify(iMUser.getWeiboVerify());
            user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
            user.setVerificationType(iMUser.getVerificationType());
            user.setRemarkName(iMUser.getRemarkName());
            user.isBlock = iMUser.isBlock();
            user.setRegion("");
            return user;
        }
    }

    public final int getItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f48671a, false, 46217, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48671a, false, 46217, new Class[0], Integer.TYPE)).intValue();
        }
        List<? extends IMUser> list = this.f48673b;
        if (list != null) {
            i = list.size();
        }
        return i;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AtViewHolder atViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48671a, false, 46216, new Class[]{ViewGroup.class, Integer.TYPE}, AtViewHolder.class)) {
            atViewHolder = (AtViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48671a, false, 46216, new Class[]{ViewGroup.class, Integer.TYPE}, AtViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sc, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…at_friend, parent, false)");
            atViewHolder = new AtViewHolder(inflate, this);
        }
        return atViewHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ec, code lost:
        if (android.text.TextUtils.equals(r1, r14) == false) goto L_0x01ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder r22, int r23) {
        /*
            r21 = this;
            r1 = r23
            r9 = r22
            com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$AtViewHolder r9 = (com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.AtViewHolder) r9
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r10 = 0
            r2[r10] = r9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r11 = 1
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f48671a
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$AtViewHolder> r3 = com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.AtViewHolder.class
            r7[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 46218(0xb48a, float:6.4765E-41)
            r3 = r21
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0051
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r10] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f48671a
            r15 = 0
            r16 = 46218(0xb48a, float:6.4765E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$AtViewHolder> r1 = com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.AtViewHolder.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r21
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0051:
            java.lang.String r2 = "holder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r2)
            r12 = r21
            java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r2 = r12.f48673b
            if (r2 != 0) goto L_0x005f
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x005f:
            java.lang.Object r2 = r2.get(r1)
            r13 = r2
            com.ss.android.ugc.aweme.im.service.model.IMUser r13 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r13
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r10] = r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.AtViewHolder.f48675a
            r5 = 0
            r6 = 46225(0xb491, float:6.4775E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r3 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r7[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x00b0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r10] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r2[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.AtViewHolder.f48675a
            r4 = 0
            r5 = 46225(0xb491, float:6.4775E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r6[r10] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r0 = r2
            r1 = r9
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00b0:
            java.lang.String r2 = "user"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r2)
            android.view.View r2 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.view.View r3 = r9.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.content.Context r3 = r3.getContext()
            android.graphics.drawable.Drawable r3 = com.bytedance.ies.dmt.ui.common.c.e(r3)
            r2.setBackground(r3)
            com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter r2 = r9.i
            java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r2 = r2.f48673b
            r14 = 0
            if (r1 <= 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00da
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00da:
            int r3 = r1 + -1
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r2
            r15 = r2
            goto L_0x00e5
        L_0x00e4:
            r15 = r14
        L_0x00e5:
            android.widget.TextView r2 = r9.f48676b
            r2.setVisibility(r10)
            com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter r2 = r9.i
            com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends r2 = r2.f48674c
            r8 = 8
            if (r2 == 0) goto L_0x0200
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r3 = r2.recentFriends
            int r3 = r3.size()
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r4 = r2.mutualFriends
            int r4 = r4.size()
            int r7 = r3 + r4
            if (r1 != 0) goto L_0x011b
            android.widget.TextView r2 = r9.f48676b
            r2.setVisibility(r10)
            android.widget.TextView r2 = r9.f48676b
            java.lang.String r3 = ""
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            android.widget.TextView r2 = r9.f48676b
            r2.setCompoundDrawables(r14, r14, r14, r14)
            r3 = r7
            r4 = r14
        L_0x0117:
            r5 = 8
            goto L_0x01cf
        L_0x011b:
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r3 = r2.recentFriends
            int r3 = r3.size()
            if (r1 != r3) goto L_0x01a8
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r3 = r2.mutualFriends
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r11
            if (r3 == 0) goto L_0x01a8
            android.widget.TextView r2 = r9.f48676b
            r3 = 2131563075(0x7f0d1243, float:1.8751597E38)
            r2.setText(r3)
            android.widget.TextView r6 = r9.f48676b
            android.view.View r2 = r9.h
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2130839001(0x7f0205d9, float:1.7283E38)
            android.graphics.drawable.Drawable r5 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r2, (int) r3)
            java.lang.String r2 = "container.resources.getD…rawable.ic_im_friends_32)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r2)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r10] = r6
            r2[r11] = r5
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.AtViewHolder.f48675a
            r16 = 0
            r17 = 46226(0xb492, float:6.4776E-41)
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class<android.widget.TextView> r18 = android.widget.TextView.class
            r3[r10] = r18
            java.lang.Class<android.graphics.drawable.Drawable> r18 = android.graphics.drawable.Drawable.class
            r3[r11] = r18
            java.lang.Class r18 = java.lang.Void.TYPE
            r19 = r3
            r3 = r9
            r14 = r5
            r5 = r16
            r11 = r6
            r6 = r17
            r20 = r7
            r7 = r19
            r8 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x019a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r10] = r11
            r3 = 1
            r2[r3] = r14
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.AtViewHolder.f48675a
            r5 = 0
            r6 = 46226(0xb492, float:6.4776E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.widget.TextView> r8 = android.widget.TextView.class
            r7[r10] = r8
            java.lang.Class<android.graphics.drawable.Drawable> r8 = android.graphics.drawable.Drawable.class
            r7[r3] = r8
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
        L_0x0195:
            r3 = r20
            r4 = 0
            goto L_0x0117
        L_0x019a:
            r2 = 0
            r11.setCompoundDrawables(r2, r2, r14, r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 17
            if (r3 < r4) goto L_0x0195
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r2, r14, r2)
            goto L_0x0195
        L_0x01a8:
            r3 = r7
            if (r1 != r3) goto L_0x01c7
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r2 = r2.allFollowingFriends
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r4 = 1
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x01c7
            android.widget.TextView r2 = r9.f48676b
            r4 = 2131558688(0x7f0d0120, float:1.8742699E38)
            r2.setText(r4)
            android.widget.TextView r2 = r9.f48676b
            r4 = 0
            r2.setCompoundDrawables(r4, r4, r4, r4)
            goto L_0x0117
        L_0x01c7:
            r4 = 0
            android.widget.TextView r2 = r9.f48676b
            r5 = 8
            r2.setVisibility(r5)
        L_0x01cf:
            android.widget.TextView r2 = r9.f48677c
            r2.setVisibility(r10)
            if (r1 < r3) goto L_0x01fa
            if (r1 == r3) goto L_0x01ee
            java.lang.String r1 = r13.getInitialLetter()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r15 == 0) goto L_0x01e5
            java.lang.String r14 = r15.getInitialLetter()
            goto L_0x01e6
        L_0x01e5:
            r14 = r4
        L_0x01e6:
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r1 = android.text.TextUtils.equals(r1, r14)
            if (r1 != 0) goto L_0x01fa
        L_0x01ee:
            android.widget.TextView r1 = r9.f48677c
            java.lang.String r2 = r13.getInitialLetter()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            goto L_0x0202
        L_0x01fa:
            android.widget.TextView r1 = r9.f48677c
            r1.setVisibility(r5)
            goto L_0x0202
        L_0x0200:
            r5 = 8
        L_0x0202:
            com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$a r1 = f48672d
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.a(r13)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r2 = r9.f48678d
            r2.setData((com.ss.android.ugc.aweme.profile.model.User) r1)
            android.widget.TextView r2 = r9.f48680f
            r2.setVisibility(r10)
            boolean r2 = com.ss.android.g.a.a()
            if (r2 != 0) goto L_0x0242
            android.widget.TextView r2 = r9.f48679e
            java.lang.String r3 = r13.getRemarkName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x022d
            java.lang.String r3 = r13.getNickName()
        L_0x022a:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L_0x0232
        L_0x022d:
            java.lang.String r3 = r13.getRemarkName()
            goto L_0x022a
        L_0x0232:
            r2.setText(r3)
            android.widget.TextView r2 = r9.f48680f
            java.lang.String r3 = r13.getSignature()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            goto L_0x0304
        L_0x0242:
            boolean r2 = com.ss.android.g.a.c()
            if (r2 == 0) goto L_0x02c0
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r3 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            int r2 = r2.m()
            r3 = 4
            if (r2 == r3) goto L_0x0281
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r3 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            int r2 = r2.m()
            r3 = 5
            if (r2 != r3) goto L_0x0269
            goto L_0x0281
        L_0x0269:
            android.widget.TextView r2 = r9.f48679e
            java.lang.String r3 = r13.getNickName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            android.widget.TextView r2 = r9.f48680f
            java.lang.String r3 = r13.getSignature()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            goto L_0x0304
        L_0x0281:
            android.widget.TextView r2 = r9.f48679e
            java.lang.String r3 = r13.getNickName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "@"
            r2.<init>(r3)
            java.lang.String r3 = r13.getUniqueId()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x02ad
            java.lang.String r3 = r13.getShortId()
            if (r3 != 0) goto L_0x02a8
            java.lang.String r3 = ""
            goto L_0x02b1
        L_0x02a8:
            java.lang.String r3 = r13.getShortId()
            goto L_0x02b1
        L_0x02ad:
            java.lang.String r3 = r13.getUniqueId()
        L_0x02b1:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.widget.TextView r3 = r9.f48680f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
            goto L_0x0304
        L_0x02c0:
            boolean r2 = com.ss.android.g.a.b()
            if (r2 == 0) goto L_0x0304
            android.widget.TextView r2 = r9.f48679e
            java.lang.String r3 = r13.getNickName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "@"
            r2.<init>(r3)
            java.lang.String r3 = r13.getUniqueId()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x02f2
            java.lang.String r3 = r13.getShortId()
            if (r3 != 0) goto L_0x02ed
            java.lang.String r3 = ""
            goto L_0x02f6
        L_0x02ed:
            java.lang.String r3 = r13.getShortId()
            goto L_0x02f6
        L_0x02f2:
            java.lang.String r3 = r13.getUniqueId()
        L_0x02f6:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.widget.TextView r3 = r9.f48680f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
        L_0x0304:
            android.widget.TextView r2 = r9.f48680f
            java.lang.CharSequence r2 = r2.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0315
            android.widget.TextView r2 = r9.f48680f
            r2.setVisibility(r5)
        L_0x0315:
            int r2 = r13.getFollowStatus()
            if (r2 != r0) goto L_0x0329
            android.widget.ImageView r0 = r9.g
            r0.setVisibility(r10)
            android.widget.ImageView r0 = r9.g
            r2 = 2130838743(0x7f0204d7, float:1.7282477E38)
            r0.setImageResource(r2)
            goto L_0x032e
        L_0x0329:
            android.widget.ImageView r0 = r9.g
            r0.setVisibility(r5)
        L_0x032e:
            android.view.View r0 = r9.h
            com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$AtViewHolder$a r2 = new com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$AtViewHolder$a
            r2.<init>(r9, r13, r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }
}

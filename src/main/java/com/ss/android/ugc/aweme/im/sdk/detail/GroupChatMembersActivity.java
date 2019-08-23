package com.ss.android.ugc.aweme.im.sdk.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.im.sdk.detail.adapter.MemberListAdapter;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020/H\u0002J\b\u00101\u001a\u00020/H\u0002J\b\u00102\u001a\u00020/H\u0002J\b\u00103\u001a\u00020/H\u0002J\b\u00104\u001a\u00020/H\u0002J\u0012\u00105\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u000107H\u0014J\b\u00108\u001a\u00020/H\u0014J\b\u00109\u001a\u00020/H\u0014J\b\u0010:\u001a\u00020/H\u0002J\b\u0010;\u001a\u00020/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001aj\b\u0012\u0004\u0012\u00020\u0018`\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R#\u0010 \u001a\n \t*\u0004\u0018\u00010!0!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b\"\u0010#R#\u0010%\u001a\n \t*\u0004\u0018\u00010&0&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b'\u0010(R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X.¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/GroupChatMembersActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "mAddMemberItem", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/AddMemberItem;", "mAvatarListAdapter", "Lcom/ss/android/ugc/aweme/im/sdk/detail/adapter/MemberListAdapter;", "mAvatarListView", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "getMAvatarListView", "()Landroid/support/v7/widget/RecyclerView;", "mAvatarListView$delegate", "Lkotlin/Lazy;", "mClearSearchImage", "Landroid/widget/ImageView;", "getMClearSearchImage", "()Landroid/widget/ImageView;", "mClearSearchImage$delegate", "mConversation", "Lcom/bytedance/im/core/model/Conversation;", "mConversationModel", "Lcom/bytedance/im/core/model/ConversationModel;", "mCurImMember", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "mDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMemberItem;", "Lkotlin/collections/ArrayList;", "mMemberList", "mRemoveMemberItem", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/RemoveMemberItem;", "mSearchMemberEdit", "Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "getMSearchMemberEdit", "()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "mSearchMemberEdit$delegate", "mTitleBar", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "getMTitleBar", "()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "mTitleBar$delegate", "searchMemberLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "viewMemberLayoutManager", "Landroid/support/v7/widget/GridLayoutManager;", "addCommonActionItem", "", "addManageActionItem", "addOrRemoveMemberPermission", "initEvents", "initParams", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setStatusBarColor", "updateCountState", "updateGroupMemberList", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupChatMembersActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51388a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f51389b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatMembersActivity.class), "mTitleBar", "getMTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatMembersActivity.class), "mAvatarListView", "getMAvatarListView()Landroid/support/v7/widget/RecyclerView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatMembersActivity.class), "mClearSearchImage", "getMClearSearchImage()Landroid/widget/ImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatMembersActivity.class), "mSearchMemberEdit", "getMSearchMemberEdit()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;"))};
    public static final a h = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public GridLayoutManager f51390c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayoutManager f51391d;

    /* renamed from: e  reason: collision with root package name */
    public MemberListAdapter f51392e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> f51393f = new ArrayList<>();
    public ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> g = new ArrayList<>();
    private final Lazy i = LazyKt.lazy(new j(this));
    private final Lazy j = LazyKt.lazy(new g(this));
    private final Lazy k = LazyKt.lazy(new h(this));
    private final Lazy l = LazyKt.lazy(new i(this));
    private com.bytedance.im.core.d.e m;
    private com.bytedance.im.core.d.b n;
    private com.ss.android.ugc.aweme.im.sdk.detail.a.g o;
    private com.ss.android.ugc.aweme.im.sdk.detail.a.a p;
    private com.ss.android.ugc.aweme.im.sdk.chat.b.a.a q;
    private HashMap r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/GroupChatMembersActivity$Companion;", "", "()V", "AVATAR_CACHE_SIZE", "", "AVATAR_SPAN_COUNT", "KEY_CONVERSATION", "", "start", "", "context", "Landroid/content/Context;", "conversation", "Lcom/bytedance/im/core/model/Conversation;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51394a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/GroupChatMembersActivity$initEvents$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatMembersActivity f51396b;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        b(GroupChatMembersActivity groupChatMembersActivity) {
            this.f51396b = groupChatMembersActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:106:0x021a, code lost:
            if (r6.a(r11, r12, r1, r4) != false) goto L_0x021c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0291, code lost:
            if (r6.a(r11, r12, r1, r4) != false) goto L_0x0293;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x02e6, code lost:
            if (r6.a(r11, r1) == false) goto L_0x02e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x0308, code lost:
            if (r6.a(r11, r12, r1, r4) != false) goto L_0x030a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a3, code lost:
            if (r6.a(r11, r12, r1, r4) != false) goto L_0x01a5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(@org.jetbrains.annotations.Nullable android.text.Editable r18) {
            /*
                r17 = this;
                r7 = r17
                r8 = 1
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r9 = 0
                r0[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r2 = f51395a
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<android.text.Editable> r1 = android.text.Editable.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 52010(0xcb2a, float:7.2882E-41)
                r1 = r17
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0036
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r2 = f51395a
                r3 = 0
                r4 = 52010(0xcb2a, float:7.2882E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<android.text.Editable> r1 = android.text.Editable.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0036:
                r0 = r18
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x007b
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r7.f51396b
                android.support.v7.widget.RecyclerView r0 = r0.a()
                java.lang.String r1 = "mAvatarListView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r1 = r7.f51396b
                android.support.v7.widget.GridLayoutManager r1 = r1.f51390c
                if (r1 != 0) goto L_0x0056
                java.lang.String r2 = "viewMemberLayoutManager"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x0056:
                android.support.v7.widget.RecyclerView$LayoutManager r1 = (android.support.v7.widget.RecyclerView.LayoutManager) r1
                r0.setLayoutManager(r1)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r7.f51396b
                com.ss.android.ugc.aweme.im.sdk.detail.adapter.MemberListAdapter r0 = com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity.a((com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity) r0)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r1 = r7.f51396b
                java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> r1 = r1.f51393f
                java.util.List r1 = (java.util.List) r1
                r0.a(r1)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r7.f51396b
                android.widget.ImageView r0 = r0.b()
                java.lang.String r1 = "mClearSearchImage"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r1 = 8
                r0.setVisibility(r1)
                return
            L_0x007b:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r7.f51396b
                java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r0 = r0.g
                java.util.List r0 = (java.util.List) r0
                java.lang.String r1 = java.lang.String.valueOf(r18)
                r2 = 2
                java.lang.Object[] r10 = new java.lang.Object[r2]
                r10[r9] = r0
                r10[r8] = r1
                r11 = 0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.sdk.detail.b.a.f51426a
                r13 = 1
                r14 = 52053(0xcb55, float:7.2942E-41)
                java.lang.Class[] r3 = new java.lang.Class[r2]
                java.lang.Class<java.util.List> r4 = java.util.List.class
                r3[r9] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r8] = r4
                java.lang.Class<java.util.List> r16 = java.util.List.class
                r15 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                if (r3 == 0) goto L_0x00c8
                java.lang.Object[] r10 = new java.lang.Object[r2]
                r10[r9] = r0
                r10[r8] = r1
                r11 = 0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.sdk.detail.b.a.f51426a
                r13 = 1
                r14 = 52053(0xcb55, float:7.2942E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<java.util.List> r1 = java.util.List.class
                r0[r9] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r8] = r1
                java.lang.Class<java.util.List> r16 = java.util.List.class
                r15 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.util.List r0 = (java.util.List) r0
                goto L_0x039b
            L_0x00c8:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4 = r0
                java.util.Collection r4 = (java.util.Collection) r4
                if (r4 == 0) goto L_0x00db
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x00d9
                goto L_0x00db
            L_0x00d9:
                r4 = 0
                goto L_0x00dc
            L_0x00db:
                r4 = 1
            L_0x00dc:
                if (r4 != 0) goto L_0x037e
                r4 = r1
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                if (r4 == 0) goto L_0x00ec
                int r4 = r4.length()
                if (r4 != 0) goto L_0x00ea
                goto L_0x00ec
            L_0x00ea:
                r4 = 0
                goto L_0x00ed
            L_0x00ec:
                r4 = 1
            L_0x00ed:
                if (r4 != 0) goto L_0x037e
                int r4 = r1.length()
                r5 = 0
            L_0x00f4:
                if (r5 >= r4) goto L_0x0120
                char r6 = r1.charAt(r5)
                boolean r6 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a((char) r6)
                if (r6 == 0) goto L_0x011d
                java.lang.String r4 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.c((java.lang.String) r1)
                java.lang.String r5 = "CharacterUtil.hanziToPinyin(keyWord)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
                if (r4 == 0) goto L_0x0115
                java.lang.String r4 = r4.toLowerCase()
                java.lang.String r5 = "(this as java.lang.String).toLowerCase()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
                goto L_0x0121
            L_0x0115:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x011d:
                int r5 = r5 + 1
                goto L_0x00f4
            L_0x0120:
                r4 = r1
            L_0x0121:
                if (r1 == 0) goto L_0x0376
                java.lang.String r1 = r1.toLowerCase()
                java.lang.String r5 = "(this as java.lang.String).toLowerCase()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                java.util.Iterator r0 = r0.iterator()
            L_0x0130:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L_0x037e
                java.lang.Object r5 = r0.next()
                com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r5 = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) r5
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                r10 = 0
                if (r6 == 0) goto L_0x0148
                java.lang.String r6 = r6.getRemarkName()
                goto L_0x0149
            L_0x0148:
                r6 = r10
            L_0x0149:
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x01b4
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x0160
                java.lang.String r11 = r11.getRemarkName()
                goto L_0x0161
            L_0x0160:
                r11 = r10
            L_0x0161:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r1)
                if (r6 != 0) goto L_0x01a5
                boolean r6 = com.ss.android.ugc.aweme.im.sdk.utils.m.a()
                if (r6 != 0) goto L_0x01b4
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x017c
                java.lang.String r11 = r11.getRemarkInitial()
                goto L_0x017d
            L_0x017c:
                r11 = r10
            L_0x017d:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r1)
                if (r6 != 0) goto L_0x01a5
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x0192
                java.lang.String r11 = r11.getRemarkName()
                goto L_0x0193
            L_0x0192:
                r11 = r10
            L_0x0193:
                com.ss.android.ugc.aweme.im.service.model.IMUser r12 = r5.getUser()
                if (r12 == 0) goto L_0x019e
                java.lang.String r12 = r12.getRemarkPinyin()
                goto L_0x019f
            L_0x019e:
                r12 = r10
            L_0x019f:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r1, (java.lang.String) r4)
                if (r6 == 0) goto L_0x01b4
            L_0x01a5:
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                if (r6 == 0) goto L_0x01af
                r10 = 5
                r6.setSearchType(r10)
            L_0x01af:
                r3.add(r5)
                goto L_0x0130
            L_0x01b4:
                com.bytedance.im.core.d.m r6 = r5.getMember()
                if (r6 == 0) goto L_0x01bf
                java.lang.String r6 = r6.getAlias()
                goto L_0x01c0
            L_0x01bf:
                r6 = r10
            L_0x01c0:
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x022b
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.bytedance.im.core.d.m r11 = r5.getMember()
                if (r11 == 0) goto L_0x01d7
                java.lang.String r11 = r11.getAlias()
                goto L_0x01d8
            L_0x01d7:
                r11 = r10
            L_0x01d8:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r1)
                if (r6 != 0) goto L_0x021c
                boolean r6 = com.ss.android.ugc.aweme.im.sdk.utils.m.a()
                if (r6 != 0) goto L_0x022b
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.bytedance.im.core.d.m r11 = r5.getMember()
                if (r11 == 0) goto L_0x01f3
                java.lang.String r11 = r11.getAlias()
                goto L_0x01f4
            L_0x01f3:
                r11 = r10
            L_0x01f4:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r1)
                if (r6 != 0) goto L_0x021c
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.bytedance.im.core.d.m r11 = r5.getMember()
                if (r11 == 0) goto L_0x0209
                java.lang.String r11 = r11.getAlias()
                goto L_0x020a
            L_0x0209:
                r11 = r10
            L_0x020a:
                com.bytedance.im.core.d.m r12 = r5.getMember()
                if (r12 == 0) goto L_0x0215
                java.lang.String r12 = r12.getAlias()
                goto L_0x0216
            L_0x0215:
                r12 = r10
            L_0x0216:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r1, (java.lang.String) r4)
                if (r6 == 0) goto L_0x022b
            L_0x021c:
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                if (r6 == 0) goto L_0x0226
                r10 = 4
                r6.setSearchType(r10)
            L_0x0226:
                r3.add(r5)
                goto L_0x0130
            L_0x022b:
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                if (r6 == 0) goto L_0x0236
                java.lang.String r6 = r6.getNickName()
                goto L_0x0237
            L_0x0236:
                r6 = r10
            L_0x0237:
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x02a2
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x024e
                java.lang.String r11 = r11.getNickName()
                goto L_0x024f
            L_0x024e:
                r11 = r10
            L_0x024f:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r1)
                if (r6 != 0) goto L_0x0293
                boolean r6 = com.ss.android.ugc.aweme.im.sdk.utils.m.a()
                if (r6 != 0) goto L_0x02a2
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x026a
                java.lang.String r11 = r11.getNickNameInitial()
                goto L_0x026b
            L_0x026a:
                r11 = r10
            L_0x026b:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r1)
                if (r6 != 0) goto L_0x0293
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x0280
                java.lang.String r11 = r11.getNickName()
                goto L_0x0281
            L_0x0280:
                r11 = r10
            L_0x0281:
                com.ss.android.ugc.aweme.im.service.model.IMUser r12 = r5.getUser()
                if (r12 == 0) goto L_0x028c
                java.lang.String r12 = r12.getNickNamePinyin()
                goto L_0x028d
            L_0x028c:
                r12 = r10
            L_0x028d:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r1, (java.lang.String) r4)
                if (r6 == 0) goto L_0x02a2
            L_0x0293:
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                if (r6 == 0) goto L_0x029d
                r10 = 3
                r6.setSearchType(r10)
            L_0x029d:
                r3.add(r5)
                goto L_0x0130
            L_0x02a2:
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                if (r6 == 0) goto L_0x02ad
                java.lang.String r6 = r6.getContactName()
                goto L_0x02ae
            L_0x02ad:
                r6 = r10
            L_0x02ae:
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x0318
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x02c5
                java.lang.String r11 = r11.getContactName()
                goto L_0x02c6
            L_0x02c5:
                r11 = r10
            L_0x02c6:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r1)
                if (r6 != 0) goto L_0x030a
                boolean r6 = com.ss.android.ugc.aweme.im.sdk.utils.m.a()
                if (r6 != 0) goto L_0x02e8
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x02e1
                java.lang.String r11 = r11.getContactNameInitial()
                goto L_0x02e2
            L_0x02e1:
                r11 = r10
            L_0x02e2:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r1)
                if (r6 != 0) goto L_0x030a
            L_0x02e8:
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x02f7
                java.lang.String r11 = r11.getContactName()
                goto L_0x02f8
            L_0x02f7:
                r11 = r10
            L_0x02f8:
                com.ss.android.ugc.aweme.im.service.model.IMUser r12 = r5.getUser()
                if (r12 == 0) goto L_0x0303
                java.lang.String r12 = r12.getContactNamePinyin()
                goto L_0x0304
            L_0x0303:
                r12 = r10
            L_0x0304:
                boolean r6 = r6.a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r1, (java.lang.String) r4)
                if (r6 == 0) goto L_0x0318
            L_0x030a:
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                if (r6 == 0) goto L_0x0313
                r6.setSearchType(r2)
            L_0x0313:
                r3.add(r5)
                goto L_0x0130
            L_0x0318:
                boolean r6 = com.ss.android.ugc.aweme.im.sdk.utils.m.b()
                if (r6 != 0) goto L_0x0130
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                if (r6 == 0) goto L_0x0329
                java.lang.String r6 = r6.getUniqueId()
                goto L_0x032a
            L_0x0329:
                r6 = r10
            L_0x032a:
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x0354
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x0340
                java.lang.String r10 = r11.getUniqueId()
            L_0x0340:
                boolean r6 = r6.a((java.lang.String) r10, (java.lang.String) r1)
                if (r6 == 0) goto L_0x0130
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                if (r6 == 0) goto L_0x034f
                r6.setSearchType(r8)
            L_0x034f:
                r3.add(r5)
                goto L_0x0130
            L_0x0354:
                com.ss.android.ugc.aweme.im.sdk.d.e r6 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r5.getUser()
                if (r11 == 0) goto L_0x0362
                java.lang.String r10 = r11.getShortId()
            L_0x0362:
                boolean r6 = r6.a((java.lang.String) r10, (java.lang.String) r1)
                if (r6 == 0) goto L_0x0130
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r5.getUser()
                if (r6 == 0) goto L_0x0371
                r6.setSearchType(r8)
            L_0x0371:
                r3.add(r5)
                goto L_0x0130
            L_0x0376:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x037e:
                boolean r0 = com.ss.android.ugc.aweme.im.sdk.utils.m.b()
                if (r0 != 0) goto L_0x0398
                r0 = r3
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r8
                if (r0 == 0) goto L_0x0398
                r0 = r3
                java.util.List r0 = (java.util.List) r0
                com.ss.android.ugc.aweme.im.sdk.detail.b.a$a r1 = com.ss.android.ugc.aweme.im.sdk.detail.b.a.C0599a.f51429b
                java.util.Comparator r1 = (java.util.Comparator) r1
                kotlin.collections.CollectionsKt.sortWith(r0, r1)
            L_0x0398:
                r0 = r3
                java.util.List r0 = (java.util.List) r0
            L_0x039b:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r1 = r7.f51396b
                android.support.v7.widget.LinearLayoutManager r1 = r1.f51391d
                if (r1 != 0) goto L_0x03ba
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r1 = r7.f51396b
                android.support.v7.widget.LinearLayoutManager r2 = new android.support.v7.widget.LinearLayoutManager
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r3 = r7.f51396b
                android.content.Context r3 = (android.content.Context) r3
                r2.<init>(r3)
                r1.f51391d = r2
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r1 = r7.f51396b
                android.support.v7.widget.LinearLayoutManager r1 = r1.f51391d
                if (r1 != 0) goto L_0x03b7
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x03b7:
                r1.setOrientation(r8)
            L_0x03ba:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r1 = r7.f51396b
                android.support.v7.widget.RecyclerView r1 = r1.a()
                java.lang.String r2 = "mAvatarListView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r2 = r7.f51396b
                android.support.v7.widget.LinearLayoutManager r2 = r2.f51391d
                android.support.v7.widget.RecyclerView$LayoutManager r2 = (android.support.v7.widget.RecyclerView.LayoutManager) r2
                r1.setLayoutManager(r2)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r1 = r7.f51396b
                com.ss.android.ugc.aweme.im.sdk.detail.adapter.MemberListAdapter r1 = com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity.a((com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity) r1)
                java.lang.String r2 = java.lang.String.valueOf(r18)
                r1.a(r0, r2)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r7.f51396b
                android.widget.ImageView r0 = r0.b()
                java.lang.String r1 = "mClearSearchImage"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity.b.afterTextChanged(android.text.Editable):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/GroupChatMembersActivity$initEvents$2", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar$OnTitlebarClickListener;", "onLeftClick", "", "onRightClick", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatMembersActivity f51398b;

        public final void b() {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f51397a, false, 52011, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51397a, false, 52011, new Class[0], Void.TYPE);
                return;
            }
            this.f51398b.finish();
        }

        c(GroupChatMembersActivity groupChatMembersActivity) {
            this.f51398b = groupChatMembersActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatMembersActivity f51400b;

        d(GroupChatMembersActivity groupChatMembersActivity) {
            this.f51400b = groupChatMembersActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51399a, false, 52012, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51399a, false, 52012, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f51400b.c().setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/GroupChatMembersActivity$initEvents$4", "Lcom/ss/android/ugc/aweme/im/sdk/core/ChatObserverAdapter;", "onAddMembers", "", "list", "", "Lcom/bytedance/im/core/model/Member;", "onRemoveMembers", "onUpdateConversation", "conversation", "Lcom/bytedance/im/core/model/Conversation;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends com.ss.android.ugc.aweme.im.sdk.d.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatMembersActivity f51402b;

        e(GroupChatMembersActivity groupChatMembersActivity) {
            this.f51402b = groupChatMembersActivity;
        }

        public final void a(@Nullable List<m> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f51401a, false, 52014, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51401a, false, 52014, new Class[]{List.class}, Void.TYPE);
                return;
            }
            super.a(list);
            this.f51402b.d();
        }

        public final void b(@Nullable com.bytedance.im.core.d.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51401a, false, 52013, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51401a, false, 52013, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            super.b(bVar);
            this.f51402b.d();
        }

        public final void b(@Nullable List<m> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f51401a, false, 52015, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51401a, false, 52015, new Class[]{List.class}, Void.TYPE);
                return;
            }
            super.b(list);
            this.f51402b.d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51403a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatMembersActivity f51404b;

        f(GroupChatMembersActivity groupChatMembersActivity) {
            this.f51404b = groupChatMembersActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f51403a, false, 52016, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51403a, false, 52016, new Class[0], Void.TYPE);
                return;
            }
            RecyclerView a2 = this.f51404b.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "mAvatarListView");
            a2.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<RecyclerView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatMembersActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(GroupChatMembersActivity groupChatMembersActivity) {
            super(0);
            this.this$0 = groupChatMembersActivity;
        }

        public final RecyclerView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52017, new Class[0], RecyclerView.class)) {
                return (RecyclerView) this.this$0.a((int) C0906R.id.cij);
            }
            return (RecyclerView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52017, new Class[0], RecyclerView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<ImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatMembersActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(GroupChatMembersActivity groupChatMembersActivity) {
            super(0);
            this.this$0 = groupChatMembersActivity;
        }

        public final ImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52018, new Class[0], ImageView.class)) {
                return (ImageView) this.this$0.a((int) C0906R.id.azx);
            }
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52018, new Class[0], ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<DmtEditText> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatMembersActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(GroupChatMembersActivity groupChatMembersActivity) {
            super(0);
            this.this$0 = groupChatMembersActivity;
        }

        public final DmtEditText invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52019, new Class[0], DmtEditText.class)) {
                return (DmtEditText) this.this$0.a((int) C0906R.id.aaj);
            }
            return (DmtEditText) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52019, new Class[0], DmtEditText.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<ImTextTitleBar> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatMembersActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(GroupChatMembersActivity groupChatMembersActivity) {
            super(0);
            this.this$0 = groupChatMembersActivity;
        }

        public final ImTextTitleBar invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52020, new Class[0], ImTextTitleBar.class)) {
                return (ImTextTitleBar) this.this$0.a((int) C0906R.id.d3m);
            }
            return (ImTextTitleBar) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52020, new Class[0], ImTextTitleBar.class);
        }
    }

    private final ImTextTitleBar e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 51990, new Class[0], ImTextTitleBar.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 51990, new Class[0], ImTextTitleBar.class);
        } else {
            value = this.i.getValue();
        }
        return (ImTextTitleBar) value;
    }

    public final RecyclerView a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 51991, new Class[0], RecyclerView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 51991, new Class[0], RecyclerView.class);
        } else {
            value = this.j.getValue();
        }
        return (RecyclerView) value;
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51388a, false, 52004, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51388a, false, 52004, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.r == null) {
            this.r = new HashMap();
        }
        View view = (View) this.r.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.r.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final ImageView b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 51992, new Class[0], ImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 51992, new Class[0], ImageView.class);
        } else {
            value = this.k.getValue();
        }
        return (ImageView) value;
    }

    public final DmtEditText c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 51993, new Class[0], DmtEditText.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 51993, new Class[0], DmtEditText.class);
        } else {
            value = this.l.getValue();
        }
        return (DmtEditText) value;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 52007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 52007, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51388a, false, 52008, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51388a, false, 52008, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 51995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 51995, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.bytedance.im.core.d.e eVar = this.m;
        if (eVar != null) {
            eVar.b();
        }
    }

    private final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 51999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 51999, new Class[0], Void.TYPE);
            return;
        }
        e().setTitle(getString(C0906R.string.asu, new Object[]{Integer.valueOf(this.g.size())}));
    }

    private final void h() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 52001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 52001, new Class[0], Void.TYPE);
            return;
        }
        if (this.o == null) {
            com.bytedance.im.core.d.b bVar = this.n;
            if (bVar != null) {
                str = bVar.getConversationId();
            } else {
                str = null;
            }
            this.o = new com.ss.android.ugc.aweme.im.sdk.detail.a.g(str);
        }
        ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList = this.f51393f;
        com.ss.android.ugc.aweme.im.sdk.detail.a.a aVar = this.p;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddMemberItem");
        }
        arrayList.add(aVar);
        ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList2 = this.f51393f;
        com.ss.android.ugc.aweme.im.sdk.detail.a.g gVar = this.o;
        if (gVar == null) {
            Intrinsics.throwNpe();
        }
        arrayList2.add(gVar);
        MemberListAdapter memberListAdapter = this.f51392e;
        if (memberListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarListAdapter");
        }
        memberListAdapter.a(this.f51393f);
    }

    private final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 52002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 52002, new Class[0], Void.TYPE);
            return;
        }
        ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList = this.f51393f;
        com.ss.android.ugc.aweme.im.sdk.detail.a.a aVar = this.p;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddMemberItem");
        }
        arrayList.add(aVar);
        MemberListAdapter memberListAdapter = this.f51392e;
        if (memberListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarListAdapter");
        }
        memberListAdapter.a(this.f51393f);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 51998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 51998, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.group.a a2 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a();
        com.bytedance.im.core.d.b bVar = this.n;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        String conversationId = bVar.getConversationId();
        Intrinsics.checkExpressionValueIsNotNull(conversationId, "mConversation!!.conversationId");
        List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> a3 = a2.a(conversationId);
        if (a3 != null) {
            this.f51393f.clear();
            this.g.clear();
            Collection collection = a3;
            this.f51393f.addAll(collection);
            this.g.addAll(collection);
            g();
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r0.getRole() == com.bytedance.im.core.proto.GroupRole.OWNER.getValue()) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r0.getRole() == com.bytedance.im.core.proto.GroupRole.MANAGER.getValue()) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        r0 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a();
        r1 = r9.n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        if (r1 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r1 = r1.getConversationId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if (r0.b(r1) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ad, code lost:
        h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51388a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 52000(0xcb20, float:7.2868E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51388a
            r5 = 0
            r6 = 52000(0xcb20, float:7.2868E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.profile.model.User r1 = com.ss.android.ugc.aweme.im.sdk.utils.d.c()
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r1)
            if (r1 != 0) goto L_0x0030
            return
        L_0x0030:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r2 = r9.g
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x003f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r5 = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) r5
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = r5.getUser()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x003f
            r3.add(r4)
            goto L_0x003f
        L_0x005a:
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L_0x00b4
            java.lang.Object r0 = r3.get(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) r0
            r9.q = r0
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = r9.q
            if (r0 == 0) goto L_0x0081
            com.bytedance.im.core.d.m r0 = r0.getMember()
            if (r0 == 0) goto L_0x0081
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.im.core.proto.GroupRole.OWNER
            int r1 = r1.getValue()
            if (r0 == r1) goto L_0x0097
        L_0x0081:
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = r9.q
            if (r0 == 0) goto L_0x00b1
            com.bytedance.im.core.d.m r0 = r0.getMember()
            if (r0 == 0) goto L_0x00b1
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.im.core.proto.GroupRole.MANAGER
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x00b1
        L_0x0097:
            com.ss.android.ugc.aweme.im.sdk.group.a$a r0 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = r0.a()
            com.bytedance.im.core.d.b r1 = r9.n
            if (r1 == 0) goto L_0x00a6
            java.lang.String r1 = r1.getConversationId()
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            boolean r0 = r0.b((java.lang.String) r1)
            if (r0 != 0) goto L_0x00b1
            r9.h()
            return
        L_0x00b1:
            r9.i()
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity.g():void");
    }

    public static final /* synthetic */ MemberListAdapter a(GroupChatMembersActivity groupChatMembersActivity) {
        MemberListAdapter memberListAdapter = groupChatMembersActivity.f51392e;
        if (memberListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarListAdapter");
        }
        return memberListAdapter;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Serializable serializable;
        String str;
        String str2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51388a, false, 51994, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51388a, false, 51994, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bq);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 51996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 51996, new Class[0], Void.TYPE);
        } else {
            Intent intent = getIntent();
            String str3 = null;
            if (intent != null) {
                serializable = intent.getSerializableExtra("conversation");
            } else {
                serializable = null;
            }
            if (serializable != null) {
                this.n = (com.bytedance.im.core.d.b) serializable;
                com.bytedance.im.core.d.b bVar = this.n;
                if (bVar != null) {
                    str = bVar.getConversationId();
                } else {
                    str = null;
                }
                CharSequence charSequence = str;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    z = false;
                }
                if (z) {
                    finish();
                } else {
                    com.bytedance.im.core.d.b bVar2 = this.n;
                    if (bVar2 != null) {
                        str2 = bVar2.getConversationId();
                    } else {
                        str2 = null;
                    }
                    this.m = new com.bytedance.im.core.d.e(str2);
                    com.bytedance.im.core.d.b bVar3 = this.n;
                    if (bVar3 != null) {
                        str3 = bVar3.getConversationId();
                    }
                    this.p = new com.ss.android.ugc.aweme.im.sdk.detail.a.a(str3);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.im.core.model.Conversation");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 51997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 51997, new Class[0], Void.TYPE);
        } else {
            this.f51390c = new GridLayoutManager(this, 5);
            RecyclerView a2 = a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "mAvatarListView");
            GridLayoutManager gridLayoutManager = this.f51390c;
            if (gridLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewMemberLayoutManager");
            }
            a2.setLayoutManager(gridLayoutManager);
            a().setItemViewCacheSize(25);
            this.f51392e = new MemberListAdapter(this.g);
            RecyclerView a3 = a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "mAvatarListView");
            MemberListAdapter memberListAdapter = this.f51392e;
            if (memberListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAvatarListAdapter");
            }
            a3.setAdapter(memberListAdapter);
            a().postDelayed(new f(this), 400);
            d();
        }
        if (PatchProxy.isSupport(new Object[0], this, f51388a, false, 52003, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51388a, false, 52003, new Class[0], Void.TYPE);
        } else {
            c().addTextChangedListener(new b(this));
            e().setOnTitlebarClickListener(new c(this));
            b().setOnClickListener(new d(this));
            com.bytedance.im.core.d.e eVar = this.m;
            if (eVar != null) {
                eVar.a((com.bytedance.im.core.d.h) new e(this));
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onCreate", false);
    }
}

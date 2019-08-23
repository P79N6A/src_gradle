package com.ss.android.ugc.aweme.im.sdk.detail;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.detail.adapter.MemberListAdapter;
import com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import java.io.Serializable;
import java.util.ArrayList;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020>H\u0002J \u0010@\u001a\u00020>2\u0016\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0014j\b\u0012\u0004\u0012\u00020\u0012`\u0016H\u0002J\b\u0010B\u001a\u00020>H\u0002J\b\u0010C\u001a\u00020>H\u0002J\u0012\u0010D\u001a\u00020>2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J\b\u0010G\u001a\u00020>H\u0002J\b\u0010H\u001a\u00020>H\u0016J\b\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020>H\u0016J\b\u0010L\u001a\u00020>H\u0016J\"\u0010M\u001a\u00020>2\u0006\u0010N\u001a\u00020J2\u0006\u0010O\u001a\u00020J2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u0010\u0010P\u001a\u00020>2\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020>H\u0014J\b\u0010T\u001a\u00020>H\u0014J\b\u0010U\u001a\u00020>H\u0002J\u0010\u0010V\u001a\u00020>2\u0006\u0010W\u001a\u00020JH\u0002J\b\u0010X\u001a\u00020>H\u0002J\b\u0010Y\u001a\u00020>H\u0002J\u0016\u0010Y\u001a\u00020>2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00120ZH\u0002J\b\u0010[\u001a\u00020>H\u0002J\b\u0010\\\u001a\u00020>H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\n \n*\u0004\u0018\u00010\u00180\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001c\u001a\n \n*\u0004\u0018\u00010\u00180\u00188BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001d\u0010\u001aR#\u0010\u001f\u001a\n \n*\u0004\u0018\u00010\u00180\u00188BX\u0002¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b \u0010\u001aR#\u0010\"\u001a\n \n*\u0004\u0018\u00010#0#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b$\u0010%R#\u0010'\u001a\n \n*\u0004\u0018\u00010#0#8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b(\u0010%R#\u0010*\u001a\n \n*\u0004\u0018\u00010+0+8BX\u0002¢\u0006\f\n\u0004\b.\u0010\u000e\u001a\u0004\b,\u0010-R#\u0010/\u001a\n \n*\u0004\u0018\u00010+0+8BX\u0002¢\u0006\f\n\u0004\b1\u0010\u000e\u001a\u0004\b0\u0010-R\u001e\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0014j\b\u0012\u0004\u0012\u00020\u0012`\u0016X\u000e¢\u0006\u0002\n\u0000R#\u00103\u001a\n \n*\u0004\u0018\u000104048BX\u0002¢\u0006\f\n\u0004\b7\u0010\u000e\u001a\u0004\b5\u00106R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R#\u0010:\u001a\n \n*\u0004\u0018\u00010\u00180\u00188BX\u0002¢\u0006\f\n\u0004\b<\u0010\u000e\u001a\u0004\b;\u0010\u001a¨\u0006^"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/GroupChatDetailActivity;", "Lcom/ss/android/ugc/aweme/im/sdk/detail/BaseChatDetailActivity;", "Landroid/view/View$OnClickListener;", "()V", "mAddMemberItem", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/AddMemberItem;", "mAvatarListAdapter", "Lcom/ss/android/ugc/aweme/im/sdk/detail/adapter/MemberListAdapter;", "mAvatarListView", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "getMAvatarListView", "()Landroid/support/v7/widget/RecyclerView;", "mAvatarListView$delegate", "Lkotlin/Lazy;", "mConversation", "Lcom/bytedance/im/core/model/Conversation;", "mCurImMember", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "mDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMemberItem;", "Lkotlin/collections/ArrayList;", "mEditGroupNameLayout", "Landroid/widget/RelativeLayout;", "getMEditGroupNameLayout", "()Landroid/widget/RelativeLayout;", "mEditGroupNameLayout$delegate", "mEditGroupNicknameLayout", "getMEditGroupNicknameLayout", "mEditGroupNicknameLayout$delegate", "mExitGroupChatLayout", "getMExitGroupChatLayout", "mExitGroupChatLayout$delegate", "mGroupNameView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMGroupNameView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mGroupNameView$delegate", "mGroupNickName", "getMGroupNickName", "mGroupNickName$delegate", "mInviteQQFriendsLayout", "Landroid/widget/FrameLayout;", "getMInviteQQFriendsLayout", "()Landroid/widget/FrameLayout;", "mInviteQQFriendsLayout$delegate", "mInviteWechatFriendsLayout", "getMInviteWechatFriendsLayout", "mInviteWechatFriendsLayout$delegate", "mMemberList", "mMoreMemberView", "Landroid/widget/TextView;", "getMMoreMemberView", "()Landroid/widget/TextView;", "mMoreMemberView$delegate", "mRemoveMemberItem", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/RemoveMemberItem;", "mReportLayout", "getMReportLayout", "mReportLayout$delegate", "addCommonActionItem", "", "addManageActionItem", "addMemberToDataList", "memberList", "addOrRemoveMemberPermission", "editGroupName", "editGroupNameResult", "data", "Landroid/content/Intent;", "exitGroupChat", "initEvents", "initLayoutRes", "", "initParams", "initViews", "onActivityResult", "requestCode", "resultCode", "onClick", "v", "Landroid/view/View;", "onDestroy", "onResume", "reportGroup", "showPasswordDialog", "shareChannel", "updateMemberCount", "updateMemberList", "", "updateMoreViewState", "viewMoreMembers", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupChatDetailActivity extends BaseChatDetailActivity implements View.OnClickListener {
    public static ChangeQuickRedirect g;
    static final /* synthetic */ KProperty[] h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mAvatarListView", "getMAvatarListView()Landroid/support/v7/widget/RecyclerView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mMoreMemberView", "getMMoreMemberView()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mGroupNameView", "getMGroupNameView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mGroupNickName", "getMGroupNickName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mInviteQQFriendsLayout", "getMInviteQQFriendsLayout()Landroid/widget/FrameLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mInviteWechatFriendsLayout", "getMInviteWechatFriendsLayout()Landroid/widget/FrameLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mReportLayout", "getMReportLayout()Landroid/widget/RelativeLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mExitGroupChatLayout", "getMExitGroupChatLayout()Landroid/widget/RelativeLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mEditGroupNameLayout", "getMEditGroupNameLayout()Landroid/widget/RelativeLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupChatDetailActivity.class), "mEditGroupNicknameLayout", "getMEditGroupNicknameLayout()Landroid/widget/RelativeLayout;"))};
    public static final a j = new a((byte) 0);
    private HashMap A;
    public com.bytedance.im.core.d.b i;
    private final Lazy k = LazyKt.lazy(new e(this));
    private final Lazy l = LazyKt.lazy(new m(this));
    private final Lazy m = LazyKt.lazy(new i(this));
    private final Lazy n = LazyKt.lazy(new j(this));
    private final Lazy o = LazyKt.lazy(new k(this));
    private final Lazy p = LazyKt.lazy(new l(this));
    private final Lazy q = LazyKt.lazy(new n(this));
    private final Lazy r = LazyKt.lazy(new h(this));
    private final Lazy s = LazyKt.lazy(new f(this));
    private final Lazy t = LazyKt.lazy(new g(this));
    private MemberListAdapter u;
    private ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> v = new ArrayList<>();
    private final ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> w = new ArrayList<>();
    private com.ss.android.ugc.aweme.im.sdk.detail.a.g x;
    private com.ss.android.ugc.aweme.im.sdk.detail.a.a y;
    private com.ss.android.ugc.aweme.im.sdk.chat.b.a.a z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/GroupChatDetailActivity$Companion;", "", "()V", "AVATAR_SPAN_COUNT", "", "KEY_CONVERSATION", "", "KEY_NAME_OPERATOR", "MAX_AVATAR_COUNT", "VALUE_NAME_UNCHANGED", "start", "", "context", "Landroid/content/Context;", "conversation", "Lcom/bytedance/im/core/model/Conversation;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51377a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51378a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f51379b;

        b(GroupChatDetailActivity groupChatDetailActivity) {
            this.f51379b = groupChatDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51378a, false, 51972, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51378a, false, 51972, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            com.bytedance.im.core.d.e eVar = this.f51379b.f51335f;
            if (eVar != null) {
                eVar.b((com.bytedance.im.core.a.a.b<String>) new com.bytedance.im.core.a.a.b<String>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51380a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ b f51381b;

                    {
                        this.f51381b = r1;
                    }

                    public final void a(@Nullable com.bytedance.im.core.d.j jVar) {
                        com.bytedance.im.core.d.j jVar2 = jVar;
                        if (PatchProxy.isSupport(new Object[]{jVar2}, this, f51380a, false, 51974, new Class[]{com.bytedance.im.core.d.j.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jVar2}, this, f51380a, false, 51974, new Class[]{com.bytedance.im.core.d.j.class}, Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.im.sdk.group.b.b.a(this.f51381b.f51379b, jVar2);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f51380a, false, 51973, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f51380a, false, 51973, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.ag.h.a().a((Activity) this.f51381b.f51379b, "aweme://main");
                    }
                });
            }
            z a2 = z.a();
            com.bytedance.im.core.d.b bVar = this.f51379b.i;
            if (bVar != null) {
                str = bVar.getConversationId();
            } else {
                str = null;
            }
            a2.c(str, "quit_group");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/GroupChatDetailActivity$initEvents$1", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar$OnTitlebarClickListener;", "onLeftClick", "", "onRightClick", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51382a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f51383b;

        public final void b() {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f51382a, false, 51975, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51382a, false, 51975, new Class[0], Void.TYPE);
                return;
            }
            this.f51383b.finish();
        }

        c(GroupChatDetailActivity groupChatDetailActivity) {
            this.f51383b = groupChatDetailActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/GroupChatDetailActivity$initEvents$2", "Lcom/ss/android/ugc/aweme/im/sdk/core/ChatObserverAdapter;", "onAddMembers", "", "list", "", "Lcom/bytedance/im/core/model/Member;", "onRemoveMembers", "onUpdateConversation", "conversation", "Lcom/bytedance/im/core/model/Conversation;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends com.ss.android.ugc.aweme.im.sdk.d.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51384a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f51385b;

        d(GroupChatDetailActivity groupChatDetailActivity) {
            this.f51385b = groupChatDetailActivity;
        }

        public final void a(@Nullable List<com.bytedance.im.core.d.m> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f51384a, false, 51977, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51384a, false, 51977, new Class[]{List.class}, Void.TYPE);
                return;
            }
            super.a(list);
            this.f51385b.h();
        }

        public final void b(@Nullable com.bytedance.im.core.d.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51384a, false, 51976, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51384a, false, 51976, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            super.b(bVar);
            this.f51385b.i = bVar;
            this.f51385b.h();
        }

        public final void b(@Nullable List<com.bytedance.im.core.d.m> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f51384a, false, 51978, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51384a, false, 51978, new Class[]{List.class}, Void.TYPE);
                return;
            }
            super.b(list);
            this.f51385b.h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<RecyclerView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final RecyclerView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51979, new Class[0], RecyclerView.class)) {
                return (RecyclerView) this.this$0.a((int) C0906R.id.cij);
            }
            return (RecyclerView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51979, new Class[0], RecyclerView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/RelativeLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<RelativeLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final RelativeLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51980, new Class[0], RelativeLayout.class)) {
                return (RelativeLayout) this.this$0.a((int) C0906R.id.b8h);
            }
            return (RelativeLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51980, new Class[0], RelativeLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/RelativeLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<RelativeLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final RelativeLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51981, new Class[0], RelativeLayout.class)) {
                return (RelativeLayout) this.this$0.a((int) C0906R.id.b8i);
            }
            return (RelativeLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51981, new Class[0], RelativeLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/RelativeLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<RelativeLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final RelativeLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51982, new Class[0], RelativeLayout.class)) {
                return (RelativeLayout) this.this$0.a((int) C0906R.id.b8k);
            }
            return (RelativeLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51982, new Class[0], RelativeLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51983, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.a((int) C0906R.id.dch);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51983, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51984, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.a((int) C0906R.id.dci);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51984, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<FrameLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final FrameLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51985, new Class[0], FrameLayout.class)) {
                return (FrameLayout) this.this$0.a((int) C0906R.id.b92);
            }
            return (FrameLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51985, new Class[0], FrameLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<FrameLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final FrameLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51986, new Class[0], FrameLayout.class)) {
                return (FrameLayout) this.this$0.a((int) C0906R.id.b93);
            }
            return (FrameLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51986, new Class[0], FrameLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51987, new Class[0], TextView.class)) {
                return (TextView) this.this$0.a((int) C0906R.id.dep);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51987, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/RelativeLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<RelativeLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupChatDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        public final RelativeLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51988, new Class[0], RelativeLayout.class)) {
                return (RelativeLayout) this.this$0.a((int) C0906R.id.b_8);
            }
            return (RelativeLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51988, new Class[0], RelativeLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f51387b;

        o(GroupChatDetailActivity groupChatDetailActivity) {
            this.f51387b = groupChatDetailActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f51386a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 51989(0xcb15, float:7.2852E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f51386a
                r5 = 0
                r6 = 51989(0xcb15, float:7.2852E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r0 = r9.f51387b
                com.bytedance.im.core.d.b r0 = r0.i
                r1 = 0
                if (r0 == 0) goto L_0x003b
                com.bytedance.im.core.d.c r0 = r0.getCoreInfo()
                if (r0 == 0) goto L_0x003b
                long r2 = r0.getOwner()
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                goto L_0x003c
            L_0x003b:
                r0 = r1
            L_0x003c:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r2 = r9.f51387b
                com.bytedance.im.core.d.b r2 = r2.i
                if (r2 == 0) goto L_0x004b
                long r2 = r2.getConversationShortId()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                goto L_0x004c
            L_0x004b:
                r2 = r1
            L_0x004c:
                if (r2 == 0) goto L_0x00b6
                if (r0 == 0) goto L_0x00b6
                long r3 = r0.longValue()
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 > 0) goto L_0x005b
                goto L_0x00b6
            L_0x005b:
                android.net.Uri$Builder r3 = new android.net.Uri$Builder
                r3.<init>()
                java.lang.String r4 = "owner_id"
                long r5 = r0.longValue()
                java.lang.String r0 = java.lang.String.valueOf(r5)
                android.net.Uri$Builder r0 = r3.appendQueryParameter(r4, r0)
                java.lang.String r3 = "object_id"
                long r4 = r2.longValue()
                java.lang.String r2 = java.lang.String.valueOf(r4)
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r3, r2)
                java.lang.String r2 = "report_type"
                java.lang.String r3 = "im_group"
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
                com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IReportService> r3 = com.ss.android.ugc.aweme.framework.services.IReportService.class
                java.lang.Object r2 = r2.getService(r3)
                com.ss.android.ugc.aweme.framework.services.IReportService r2 = (com.ss.android.ugc.aweme.framework.services.IReportService) r2
                if (r2 == 0) goto L_0x00a2
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r3 = r9.f51387b
                android.app.Activity r3 = (android.app.Activity) r3
                java.lang.String r4 = "im_group"
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$o$1 r5 = new com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$o$1
                r5.<init>()
                com.ss.android.ugc.aweme.framework.services.IReportService$IReportCallback r5 = (com.ss.android.ugc.aweme.framework.services.IReportService.IReportCallback) r5
                r2.showReportDialog(r3, r4, r0, r5)
            L_0x00a2:
                com.ss.android.ugc.aweme.im.sdk.utils.z r0 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r2 = r9.f51387b
                com.bytedance.im.core.d.b r2 = r2.i
                if (r2 == 0) goto L_0x00b0
                java.lang.String r1 = r2.getConversationId()
            L_0x00b0:
                java.lang.String r2 = "group"
                r0.e(r1, r2)
                return
            L_0x00b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity.o.run():void");
        }
    }

    private final RecyclerView i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51935, new Class[0], RecyclerView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51935, new Class[0], RecyclerView.class);
        } else {
            value = this.k.getValue();
        }
        return (RecyclerView) value;
    }

    private final TextView j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51936, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51936, new Class[0], TextView.class);
        } else {
            value = this.l.getValue();
        }
        return (TextView) value;
    }

    private final DmtTextView k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51937, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51937, new Class[0], DmtTextView.class);
        } else {
            value = this.m.getValue();
        }
        return (DmtTextView) value;
    }

    private final DmtTextView l() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51938, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51938, new Class[0], DmtTextView.class);
        } else {
            value = this.n.getValue();
        }
        return (DmtTextView) value;
    }

    private final FrameLayout m() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51939, new Class[0], FrameLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51939, new Class[0], FrameLayout.class);
        } else {
            value = this.o.getValue();
        }
        return (FrameLayout) value;
    }

    private final FrameLayout n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51940, new Class[0], FrameLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51940, new Class[0], FrameLayout.class);
        } else {
            value = this.p.getValue();
        }
        return (FrameLayout) value;
    }

    private final RelativeLayout o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51941, new Class[0], RelativeLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51941, new Class[0], RelativeLayout.class);
        } else {
            value = this.q.getValue();
        }
        return (RelativeLayout) value;
    }

    private final RelativeLayout p() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51942, new Class[0], RelativeLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51942, new Class[0], RelativeLayout.class);
        } else {
            value = this.r.getValue();
        }
        return (RelativeLayout) value;
    }

    private final RelativeLayout q() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51943, new Class[0], RelativeLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51943, new Class[0], RelativeLayout.class);
        } else {
            value = this.s.getValue();
        }
        return (RelativeLayout) value;
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 51966, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 51966, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.A == null) {
            this.A = new HashMap();
        }
        View view = (View) this.A.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.A.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final int d() {
        return C0906R.layout.bp;
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, g, false, 51969, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, g, false, 51969, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onCreate", false);
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, g, false, 51970, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, g, false, 51970, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51949, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.bytedance.im.core.d.e eVar = this.f51335f;
        if (eVar != null) {
            eVar.b();
        }
    }

    private final void s() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51953, new Class[0], Void.TYPE);
            return;
        }
        if (this.v.size() >= 20) {
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList = this.w;
            com.ss.android.ugc.aweme.im.sdk.detail.a.a aVar = this.y;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAddMemberItem");
            }
            arrayList.set(19, aVar);
        } else {
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList2 = this.w;
            com.ss.android.ugc.aweme.im.sdk.detail.a.a aVar2 = this.y;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAddMemberItem");
            }
            arrayList2.add(aVar2);
        }
        MemberListAdapter memberListAdapter = this.u;
        if (memberListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarListAdapter");
        }
        memberListAdapter.a(this.w);
    }

    private final void t() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51957, new Class[0], Void.TYPE);
            return;
        }
        a().setTitle(getString(C0906R.string.as3, new Object[]{Integer.valueOf(this.v.size())}));
        u();
    }

    private final void u() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51958, new Class[0], Void.TYPE);
            return;
        }
        int i2 = 19;
        if (this.x != null) {
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList = this.w;
            com.ss.android.ugc.aweme.im.sdk.detail.a.g gVar = this.x;
            if (gVar == null) {
                Intrinsics.throwNpe();
            }
            if (arrayList.contains(gVar)) {
                i2 = 18;
            }
        }
        if (this.v.size() > i2) {
            TextView j2 = j();
            Intrinsics.checkExpressionValueIsNotNull(j2, "mMoreMemberView");
            j2.setVisibility(0);
            return;
        }
        TextView j3 = j();
        Intrinsics.checkExpressionValueIsNotNull(j3, "mMoreMemberView");
        j3.setVisibility(8);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51947, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        RecyclerView i2 = i();
        Intrinsics.checkExpressionValueIsNotNull(i2, "mAvatarListView");
        i2.setLayoutManager(new GridLayoutManager(this, 5));
        this.u = new MemberListAdapter(this.w);
        RecyclerView i3 = i();
        Intrinsics.checkExpressionValueIsNotNull(i3, "mAvatarListView");
        MemberListAdapter memberListAdapter = this.u;
        if (memberListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarListAdapter");
        }
        i3.setAdapter(memberListAdapter);
    }

    private final void r() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51952, new Class[0], Void.TYPE);
            return;
        }
        if (this.x == null) {
            com.bytedance.im.core.d.b bVar = this.i;
            if (bVar != null) {
                str = bVar.getConversationId();
            } else {
                str = null;
            }
            this.x = new com.ss.android.ugc.aweme.im.sdk.detail.a.g(str);
        }
        if (this.v.size() >= 20) {
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList = this.w;
            com.ss.android.ugc.aweme.im.sdk.detail.a.a aVar = this.y;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAddMemberItem");
            }
            arrayList.set(18, aVar);
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList2 = this.w;
            com.ss.android.ugc.aweme.im.sdk.detail.a.g gVar = this.x;
            if (gVar == null) {
                Intrinsics.throwNpe();
            }
            arrayList2.set(19, gVar);
        } else if (this.v.size() >= 19) {
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList3 = this.w;
            com.ss.android.ugc.aweme.im.sdk.detail.a.a aVar2 = this.y;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAddMemberItem");
            }
            arrayList3.set(18, aVar2);
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList4 = this.w;
            com.ss.android.ugc.aweme.im.sdk.detail.a.g gVar2 = this.x;
            if (gVar2 == null) {
                Intrinsics.throwNpe();
            }
            arrayList4.add(gVar2);
        } else {
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList5 = this.w;
            com.ss.android.ugc.aweme.im.sdk.detail.a.a aVar3 = this.y;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAddMemberItem");
            }
            arrayList5.add(aVar3);
            ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> arrayList6 = this.w;
            com.ss.android.ugc.aweme.im.sdk.detail.a.g gVar3 = this.x;
            if (gVar3 == null) {
                Intrinsics.throwNpe();
            }
            arrayList6.add(gVar3);
        }
        MemberListAdapter memberListAdapter = this.u;
        if (memberListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarListAdapter");
        }
        memberListAdapter.a(this.w);
    }

    public final void e() {
        Serializable serializable;
        String str;
        String str2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51945, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        Intent intent = getIntent();
        String str3 = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("conversation");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.i = (com.bytedance.im.core.d.b) serializable;
            com.bytedance.im.core.d.b bVar = this.i;
            if (bVar != null) {
                str = bVar.getConversationId();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (z2) {
                finish();
                return;
            }
            com.bytedance.im.core.d.b bVar2 = this.i;
            if (bVar2 != null) {
                str2 = bVar2.getConversationId();
            } else {
                str2 = null;
            }
            this.f51335f = new com.bytedance.im.core.d.e(str2);
            com.bytedance.im.core.d.b bVar3 = this.i;
            if (bVar3 != null) {
                str3 = bVar3.getConversationId();
            }
            this.y = new com.ss.android.ugc.aweme.im.sdk.detail.a.a(str3);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.im.core.model.Conversation");
    }

    public final void g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51954, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        View.OnClickListener onClickListener = this;
        o().setOnClickListener(onClickListener);
        j().setOnClickListener(onClickListener);
        q().setOnClickListener(onClickListener);
        p().setOnClickListener(onClickListener);
        m().setOnClickListener(onClickListener);
        n().setOnClickListener(onClickListener);
        a().setOnTitlebarClickListener(new c(this));
        com.bytedance.im.core.d.e eVar = this.f51335f;
        if (eVar != null) {
            eVar.a((com.bytedance.im.core.d.h) new d(this));
        }
        Context context = this;
        int color = ContextCompat.getColor(context, C0906R.color.a7l);
        int color2 = ContextCompat.getColor(context, C0906R.color.pm);
        View[] viewArr = new View[4];
        viewArr[0] = q();
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51944, new Class[0], RelativeLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 51944, new Class[0], RelativeLayout.class);
        } else {
            value = this.t.getValue();
        }
        viewArr[1] = (RelativeLayout) value;
        viewArr[2] = o();
        viewArr[3] = p();
        au.a(color, color2, viewArr);
        au.a.h().a(j(), m(), n());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        if (r0.getRole() == com.bytedance.im.core.proto.GroupRole.OWNER.getValue()) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r0.getRole() == com.bytedance.im.core.proto.GroupRole.MANAGER.getValue()) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        r0 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a();
        r1 = r9.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r1 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        r1 = r1.getConversationId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r0.b(r1) != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        r();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = g
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 51956(0xcaf4, float:7.2806E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = g
            r5 = 0
            r6 = 51956(0xcaf4, float:7.2806E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.im.sdk.group.a$a r0 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = r0.a()
            com.bytedance.im.core.d.b r1 = r9.i
            if (r1 != 0) goto L_0x0032
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0032:
            java.lang.String r1 = r1.getConversationId()
            java.lang.String r2 = "mConversation!!.conversationId"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.util.List r0 = r0.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x009f
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r1 = r9.v
            r1.clear()
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r1 = r9.v
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r0 = r9.v
            r9.a((java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>) r0)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = r9.z
            if (r0 == 0) goto L_0x0068
            com.bytedance.im.core.d.m r0 = r0.getMember()
            if (r0 == 0) goto L_0x0068
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.im.core.proto.GroupRole.OWNER
            int r1 = r1.getValue()
            if (r0 == r1) goto L_0x007e
        L_0x0068:
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = r9.z
            if (r0 == 0) goto L_0x0098
            com.bytedance.im.core.d.m r0 = r0.getMember()
            if (r0 == 0) goto L_0x0098
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.im.core.proto.GroupRole.MANAGER
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x0098
        L_0x007e:
            com.ss.android.ugc.aweme.im.sdk.group.a$a r0 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = r0.a()
            com.bytedance.im.core.d.b r1 = r9.i
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r1.getConversationId()
            goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            boolean r0 = r0.b((java.lang.String) r1)
            if (r0 != 0) goto L_0x0098
            r9.r()
            goto L_0x009b
        L_0x0098:
            r9.s()
        L_0x009b:
            r9.t()
            return
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity.h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0134, code lost:
        if (r2.getRole() == com.bytedance.im.core.proto.GroupRole.OWNER.getValue()) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014a, code lost:
        if (r2.getRole() == com.bytedance.im.core.proto.GroupRole.MANAGER.getValue()) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014c, code lost:
        r1 = l();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, "mGroupNickName");
        r2 = r12.z;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0158, code lost:
        if (r2 == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015a, code lost:
        r2 = r2.getMemberDisplayName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015f, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0160, code lost:
        r1.setText(r2);
        r1 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a();
        r2 = r12.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016d, code lost:
        if (r2 == null) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016f, code lost:
        r3 = r2.getConversationId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0177, code lost:
        if (r1.b(r3) == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0179, code lost:
        s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017d, code lost:
        r();
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = g
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 51948(0xcaec, float:7.2795E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = g
            r5 = 0
            r6 = 51948(0xcaec, float:7.2795E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r1 = "com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity"
            java.lang.String r2 = "onResume"
            r3 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r1, r2, r3)
            super.onResume()
            com.ss.android.ugc.aweme.im.sdk.group.a$a r1 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e
            com.ss.android.ugc.aweme.im.sdk.group.a r1 = r1.a()
            com.bytedance.im.core.d.b r2 = r12.i
            if (r2 != 0) goto L_0x003d
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x003d:
            java.lang.String r2 = r2.getConversationId()
            java.lang.String r4 = "mConversation!!.conversationId"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            java.util.List r1 = r1.a((java.lang.String) r2)
            if (r1 == 0) goto L_0x0199
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r12.k()
            java.lang.String r4 = "mGroupNameView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.bytedance.im.core.d.b r4 = r12.i
            if (r4 == 0) goto L_0x0068
            com.bytedance.im.core.d.c r4 = r4.getCoreInfo()
            if (r4 == 0) goto L_0x0068
            java.lang.String r4 = r4.getName()
            if (r4 == 0) goto L_0x0068
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            goto L_0x0071
        L_0x0068:
            r4 = 2131560498(0x7f0d0832, float:1.874637E38)
            java.lang.String r4 = r12.getString(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L_0x0071:
            r2.setText(r4)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = g
            r8 = 0
            r9 = 51950(0xcaee, float:7.2797E-41)
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r10[r0] = r2
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x00a4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = g
            r7 = 0
            r8 = 51950(0xcaee, float:7.2797E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r9[r0] = r1
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00b0
        L_0x00a4:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r2 = r12.v
            r2.clear()
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r2 = r12.v
            java.util.Collection r1 = (java.util.Collection) r1
            r2.addAll(r1)
        L_0x00b0:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r1 = r12.v
            r12.a((java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>) r1)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = g
            r7 = 0
            r8 = 51951(0xcaef, float:7.2799E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x00da
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = g
            r7 = 0
            r8 = 51951(0xcaef, float:7.2799E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0196
        L_0x00da:
            com.ss.android.ugc.aweme.profile.model.User r1 = com.ss.android.ugc.aweme.im.sdk.utils.d.c()
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r1)
            if (r1 != 0) goto L_0x00e6
            goto L_0x0196
        L_0x00e6:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r2 = r12.v
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r2 = r2.iterator()
        L_0x00f5:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0110
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r6 = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) r6
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r6.getUser()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00f5
            r4.add(r5)
            goto L_0x00f5
        L_0x0110:
            java.util.List r4 = (java.util.List) r4
            int r2 = r4.size()
            if (r2 != r3) goto L_0x0196
            java.lang.Object r2 = r4.get(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r2 = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) r2
            r12.z = r2
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r2 = r12.z
            if (r2 == 0) goto L_0x0136
            com.bytedance.im.core.d.m r2 = r2.getMember()
            if (r2 == 0) goto L_0x0136
            int r2 = r2.getRole()
            com.bytedance.im.core.proto.GroupRole r3 = com.bytedance.im.core.proto.GroupRole.OWNER
            int r3 = r3.getValue()
            if (r2 == r3) goto L_0x014c
        L_0x0136:
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r2 = r12.z
            if (r2 == 0) goto L_0x0181
            com.bytedance.im.core.d.m r2 = r2.getMember()
            if (r2 == 0) goto L_0x0181
            int r2 = r2.getRole()
            com.bytedance.im.core.proto.GroupRole r3 = com.bytedance.im.core.proto.GroupRole.MANAGER
            int r3 = r3.getValue()
            if (r2 != r3) goto L_0x0181
        L_0x014c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r12.l()
            java.lang.String r2 = "mGroupNickName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r2 = r12.z
            r3 = 0
            if (r2 == 0) goto L_0x015f
            java.lang.String r2 = r2.getMemberDisplayName()
            goto L_0x0160
        L_0x015f:
            r2 = r3
        L_0x0160:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            com.ss.android.ugc.aweme.im.sdk.group.a$a r1 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e
            com.ss.android.ugc.aweme.im.sdk.group.a r1 = r1.a()
            com.bytedance.im.core.d.b r2 = r12.i
            if (r2 == 0) goto L_0x0173
            java.lang.String r3 = r2.getConversationId()
        L_0x0173:
            boolean r1 = r1.b((java.lang.String) r3)
            if (r1 == 0) goto L_0x017d
            r12.s()
            goto L_0x0196
        L_0x017d:
            r12.r()
            goto L_0x0196
        L_0x0181:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r12.l()
            java.lang.String r3 = "mGroupNickName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r1 = r1.getDisplayName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            r12.s()
        L_0x0196:
            r12.t()
        L_0x0199:
            java.lang.String r1 = "com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity"
            java.lang.String r2 = "onResume"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity.onResume():void");
    }

    private final void a(ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, this, g, false, 51946, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList}, this, g, false, 51946, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        this.w.clear();
        if (arrayList.size() <= 20) {
            this.w.addAll(arrayList);
        } else {
            this.w.addAll(arrayList.subList(0, 20));
        }
    }

    private final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 51965, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 51965, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.im.core.d.b bVar = this.i;
        if (bVar != null && bVar.getConversationId() != null) {
            Context context = this;
            com.bytedance.im.core.d.b bVar2 = this.i;
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            String conversationId = bVar2.getConversationId();
            if (conversationId == null) {
                Intrinsics.throwNpe();
            }
            new GroupInvitePasswordDialog(context, conversationId, i2).show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x029a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(@org.jetbrains.annotations.NotNull android.view.View r22) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = g
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 51960(0xcaf8, float:7.2811E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51960(0xcaf8, float:7.2811E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r22)
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            super.onClick(r22)
            android.widget.RelativeLayout r0 = r21.o()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r0)
            r11 = 0
            if (r0 == 0) goto L_0x008b
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51964(0xcafc, float:7.2817E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0075
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51964(0xcafc, float:7.2817E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0356
        L_0x0075:
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            com.bytedance.im.core.d.b r1 = r7.i
            if (r1 == 0) goto L_0x0080
            java.lang.String r11 = r1.getConversationId()
        L_0x0080:
            com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$o r1 = new com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$o
            r1.<init>(r7)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a(r0, r11, r1)
            return
        L_0x008b:
            android.widget.TextView r0 = r21.j()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r0)
            r12 = 2
            if (r0 == 0) goto L_0x0159
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51961(0xcaf9, float:7.2813E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00bd
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51961(0xcaf9, float:7.2813E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0356
        L_0x00bd:
            com.bytedance.im.core.d.b r0 = r7.i
            if (r0 == 0) goto L_0x0356
            com.bytedance.im.core.d.b r0 = r7.i
            if (r0 != 0) goto L_0x00c8
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00c8:
            java.lang.String r0 = r0.getConversationId()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00d9
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r0 = 0
            goto L_0x00da
        L_0x00d9:
            r0 = 1
        L_0x00da:
            if (r0 == 0) goto L_0x00de
            goto L_0x0356
        L_0x00de:
            com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$a r0 = com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity.h
            r1 = r7
            android.content.Context r1 = (android.content.Context) r1
            com.bytedance.im.core.d.b r2 = r7.i
            if (r2 != 0) goto L_0x00ea
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ea:
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r10] = r1
            r13[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity.a.f51394a
            r16 = 0
            r17 = 52009(0xcb29, float:7.288E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r10] = r4
            java.lang.Class<com.bytedance.im.core.d.b> r4 = com.bytedance.im.core.d.b.class
            r3[r9] = r4
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x012c
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r10] = r1
            r13[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity.a.f51394a
            r16 = 0
            r17 = 52009(0xcb29, float:7.288E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2
            java.lang.Class<com.bytedance.im.core.d.b> r2 = com.bytedance.im.core.d.b.class
            r1[r9] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0147
        L_0x012c:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.String r0 = "conversation"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity> r3 = com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity.class
            r0.<init>(r1, r3)
            java.lang.String r3 = "conversation"
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putExtra(r3, r2)
            r1.startActivity(r0)
        L_0x0147:
            com.ss.android.ugc.aweme.im.sdk.utils.z r0 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
            com.bytedance.im.core.d.b r1 = r7.i
            if (r1 == 0) goto L_0x0153
            java.lang.String r11 = r1.getConversationId()
        L_0x0153:
            java.lang.String r1 = "group_more_member_click"
            r0.c(r11, r1)
            return
        L_0x0159:
            android.widget.RelativeLayout r0 = r21.q()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r0)
            r13 = 3
            if (r0 == 0) goto L_0x02a4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51962(0xcafa, float:7.2814E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x018b
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51962(0xcafa, float:7.2814E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0356
        L_0x018b:
            java.lang.String r0 = ""
            com.bytedance.im.core.d.b r1 = r7.i
            if (r1 == 0) goto L_0x01a6
            com.bytedance.im.core.d.c r1 = r1.getCoreInfo()
            if (r1 == 0) goto L_0x01a6
            java.util.Map r1 = r1.getExt()
            if (r1 == 0) goto L_0x01a6
            java.lang.String r2 = "a:s_name_operator"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01a7
        L_0x01a6:
            r1 = r11
        L_0x01a7:
            if (r1 == 0) goto L_0x01cc
            java.lang.String r2 = "0"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r1 = r1 ^ r9
            if (r1 == 0) goto L_0x01cc
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r21.k()
            java.lang.String r1 = "mGroupNameView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.ss.android.ugc.aweme.im.sdk.utils.ap.a(r0)
            java.lang.String r1 = "StringHelper.trim(mGroupNameView.text.toString())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
        L_0x01cc:
            int r1 = r0.length()
            r2 = 20
            if (r1 <= r2) goto L_0x01e8
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = r0.substring(r10, r2)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            goto L_0x01e8
        L_0x01e0:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x01e8:
            com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$a r1 = com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity.f51350e
            r2 = r7
            android.app.Activity r2 = (android.app.Activity) r2
            com.bytedance.im.core.d.b r3 = r7.i
            if (r3 == 0) goto L_0x01f6
            java.lang.String r3 = r3.getConversationId()
            goto L_0x01f7
        L_0x01f6:
            r3 = r11
        L_0x01f7:
            r4 = 5
            java.lang.Object[] r14 = new java.lang.Object[r4]
            r14[r10] = r2
            r14[r9] = r3
            r14[r12] = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r14[r13] = r5
            r5 = 222(0xde, float:3.11E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8 = 4
            r14[r8] = r6
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity.a.f51354a
            r17 = 0
            r18 = 51895(0xcab7, float:7.272E-41)
            java.lang.Class[] r6 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r15 = android.app.Activity.class
            r6[r10] = r15
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r6[r9] = r15
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r6[r12] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r6[r13] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r6[r8] = r15
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r1
            r19 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r6 == 0) goto L_0x0271
            java.lang.Object[] r14 = new java.lang.Object[r4]
            r14[r10] = r2
            r14[r9] = r3
            r14[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r14[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r14[r8] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity.a.f51354a
            r17 = 0
            r18 = 51895(0xcab7, float:7.272E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r0[r10] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r12] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r13] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r8] = r2
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r1
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0292
        L_0x0271:
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r1)
            android.content.Intent r1 = new android.content.Intent
            r4 = r2
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity> r6 = com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity.class
            r1.<init>(r4, r6)
            java.lang.String r4 = "conversationId"
            r1.putExtra(r4, r3)
            java.lang.String r3 = "editInfo"
            r1.putExtra(r3, r0)
            java.lang.String r0 = "type"
            r1.putExtra(r0, r10)
            r2.startActivityForResult(r1, r5)
        L_0x0292:
            com.ss.android.ugc.aweme.im.sdk.utils.z r0 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
            com.bytedance.im.core.d.b r1 = r7.i
            if (r1 == 0) goto L_0x029e
            java.lang.String r11 = r1.getConversationId()
        L_0x029e:
            java.lang.String r1 = "group_name_click"
            r0.c(r11, r1)
            return
        L_0x02a4:
            android.widget.RelativeLayout r0 = r21.p()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0319
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51963(0xcafb, float:7.2816E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02d5
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51963(0xcafb, float:7.2816E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0356
        L_0x02d5:
            com.bytedance.ies.dmt.ui.b.a$a r0 = new com.bytedance.ies.dmt.ui.b.a$a
            r1 = r7
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            r1 = 2131560565(0x7f0d0875, float:1.8746506E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.b((int) r1)
            r1 = 2131493316(0x7f0c01c4, float:1.8610109E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.e(r1)
            r1 = 2131560428(0x7f0d07ec, float:1.8746228E38)
            com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$b r2 = new com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$b
            r2.<init>(r7)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.a((int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r1 = 2131560400(0x7f0d07d0, float:1.8746171E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.b((int) r1, (android.content.DialogInterface.OnClickListener) r11)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.a()
            r0.a()
            com.ss.android.ugc.aweme.im.sdk.utils.z r0 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
            com.bytedance.im.core.d.b r1 = r7.i
            if (r1 == 0) goto L_0x0313
            java.lang.String r11 = r1.getConversationId()
        L_0x0313:
            java.lang.String r1 = "group_quit_click"
            r0.c(r11, r1)
            return
        L_0x0319:
            android.widget.FrameLayout r0 = r21.m()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0338
            r7.b(r13)
            com.ss.android.ugc.aweme.im.sdk.utils.z r0 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
            com.bytedance.im.core.d.b r1 = r7.i
            if (r1 == 0) goto L_0x0332
            java.lang.String r11 = r1.getConversationId()
        L_0x0332:
            java.lang.String r1 = "group_qq_invite_click"
            r0.c(r11, r1)
            return
        L_0x0338:
            android.widget.FrameLayout r0 = r21.n()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0356
            r7.b(r9)
            com.ss.android.ugc.aweme.im.sdk.utils.z r0 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
            com.bytedance.im.core.d.b r1 = r7.i
            if (r1 == 0) goto L_0x0351
            java.lang.String r11 = r1.getConversationId()
        L_0x0351:
            java.lang.String r1 = "group_wx_invite_click"
            r0.c(r11, r1)
        L_0x0356:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity.onClick(android.view.View):void");
    }

    public final void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        String str;
        Intent intent2 = intent;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, g, false, 51955, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, g, false, 51955, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 222) {
            if (PatchProxy.isSupport(new Object[]{intent2}, this, g, false, 51959, new Class[]{Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{intent2}, this, g, false, 51959, new Class[]{Intent.class}, Void.TYPE);
                return;
            }
            if (intent2 != null) {
                str = intent2.getStringExtra("editInfo");
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                DmtTextView k2 = k();
                Intrinsics.checkExpressionValueIsNotNull(k2, "mGroupNameView");
                k2.setText(charSequence);
            }
        }
    }
}

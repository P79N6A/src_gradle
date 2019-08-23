package com.ss.android.ugc.aweme.im.sdk.group;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment;
import com.ss.android.ugc.aweme.im.sdk.relations.select.a;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupCreateFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "()V", "addGroupHeaderView", "", "createViewModel", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "enableSingleSelect", "", "getLayoutResId", "", "getLeftIcon", "isMultiSelect", "getTitle", "", "initViewModel", "initViews", "onTitlebarRightClick", "updateTitleBar", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupCreateFragment extends BaseSelectFragment<RelationMemberListViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51472a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f51473b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupCreateFragment f51475b;

        a(GroupCreateFragment groupCreateFragment) {
            this.f51475b = groupCreateFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51474a, false, 52096, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51474a, false, 52096, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            z.a("my_groups_click", (Map<String, String>) null);
            FragmentActivity activity = this.f51475b.getActivity();
            if (activity != null) {
                GroupListActivity.a aVar = GroupListActivity.f51478c;
                Intrinsics.checkExpressionValueIsNotNull(activity, "this");
                Activity activity2 = activity;
                if (PatchProxy.isSupport(new Object[]{activity2, 2, 224}, aVar, GroupListActivity.a.f51482a, false, 52110, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    GroupListActivity.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{activity2, 2, 224}, aVar2, GroupListActivity.a.f51482a, false, 52110, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
                    aVar.a(activity2, 2, null, null, 224);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "conversation", "Lcom/bytedance/im/core/model/Conversation;", "imError", "Lcom/bytedance/im/core/model/IMError;", "invoke", "com/ss/android/ugc/aweme/im/sdk/group/GroupCreateFragment$onTitlebarRightClick$1$2"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<com.bytedance.im.core.d.b, j, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ List $this_apply;
        final /* synthetic */ GroupCreateFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list, GroupCreateFragment groupCreateFragment) {
            super(2);
            this.$this_apply = list;
            this.this$0 = groupCreateFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.im.core.d.b) obj, (j) obj2);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0124, code lost:
            if (r8 == null) goto L_0x0126;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0154, code lost:
            if (r1 == null) goto L_0x0156;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(@org.jetbrains.annotations.Nullable com.bytedance.im.core.d.b r21, @org.jetbrains.annotations.Nullable com.bytedance.im.core.d.j r22) {
            /*
                r20 = this;
                r7 = r20
                r8 = r21
                r9 = r22
                r10 = 2
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r11 = 0
                r0[r11] = r8
                r12 = 1
                r0[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<com.bytedance.im.core.d.b> r1 = com.bytedance.im.core.d.b.class
                r5[r11] = r1
                java.lang.Class<com.bytedance.im.core.d.j> r1 = com.bytedance.im.core.d.j.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 52097(0xcb81, float:7.3003E-41)
                r1 = r20
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0047
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r8
                r0[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                r3 = 0
                r4 = 52097(0xcb81, float:7.3003E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<com.bytedance.im.core.d.b> r1 = com.bytedance.im.core.d.b.class
                r5[r11] = r1
                java.lang.Class<com.bytedance.im.core.d.j> r1 = com.bytedance.im.core.d.j.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r20
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0047:
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r0 = r7.this$0
                r0.s()
                r0 = 0
                if (r8 == 0) goto L_0x0126
                com.ss.android.ugc.aweme.im.sdk.group.a$a r1 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e
                com.ss.android.ugc.aweme.im.sdk.group.a r1 = r1.a()
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r13[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.group.a.f51527a
                r16 = 0
                r17 = 52145(0xcbb1, float:7.3071E-41)
                java.lang.Class[] r2 = new java.lang.Class[r12]
                java.lang.Class<com.bytedance.im.core.d.b> r3 = com.bytedance.im.core.d.b.class
                r2[r11] = r3
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r1
                r18 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r2 == 0) goto L_0x008b
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r13[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.group.a.f51527a
                r16 = 0
                r17 = 52145(0xcbb1, float:7.3071E-41)
                java.lang.Class[] r2 = new java.lang.Class[r12]
                java.lang.Class<com.bytedance.im.core.d.b> r3 = com.bytedance.im.core.d.b.class
                r2[r11] = r3
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r1
                r18 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                goto L_0x00c2
            L_0x008b:
                java.lang.String r1 = "conversation"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r1)
                com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent r1 = new com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent
                r1.<init>()
                r2 = 100121(0x18719, float:1.403E-40)
                r1.setType(r2)
                com.bytedance.im.core.d.n$a r2 = new com.bytedance.im.core.d.n$a
                r2.<init>()
                com.bytedance.im.core.d.n$a r2 = r2.a((com.bytedance.im.core.d.b) r8)
                java.lang.String r1 = com.ss.android.ugc.aweme.im.sdk.utils.l.a(r1)
                com.bytedance.im.core.d.n$a r1 = r2.a((java.lang.String) r1)
                r2 = 1001(0x3e9, float:1.403E-42)
                com.bytedance.im.core.d.n$a r1 = r1.a((int) r2)
                com.bytedance.im.core.d.n r1 = r1.a()
                java.lang.String r2 = "it"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                r2 = 5
                r1.setMsgStatus(r2)
                com.ss.android.ugc.aweme.im.sdk.utils.ad.b(r1)
            L_0x00c2:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                if (r9 == 0) goto L_0x00cc
                java.lang.String r2 = r9.f21287e
                goto L_0x00cd
            L_0x00cc:
                r2 = r0
            L_0x00cd:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.a.b> r3 = com.ss.android.ugc.aweme.im.sdk.group.a.b.class
                java.lang.Object r2 = com.ss.android.ugc.aweme.im.sdk.utils.l.a(r2, r3)
                com.ss.android.ugc.aweme.im.sdk.group.a.b r2 = (com.ss.android.ugc.aweme.im.sdk.group.a.b) r2
                java.lang.Integer r3 = r2.getStatusCode()
                if (r3 != 0) goto L_0x00dc
                goto L_0x00e2
            L_0x00dc:
                int r3 = r3.intValue()
                if (r3 == 0) goto L_0x00e9
            L_0x00e2:
                java.lang.String r3 = "key_group_create_error"
                java.io.Serializable r2 = (java.io.Serializable) r2
                r1.putSerializable(r3, r2)
            L_0x00e9:
                java.lang.String r2 = "key_enter_from"
                r3 = 9
                r1.putInt(r2, r3)
                java.lang.String r2 = r21.getConversationId()
                java.lang.String r3 = "success"
                com.ss.android.ugc.aweme.im.sdk.utils.z.h(r2, r3)
                com.ss.android.ugc.aweme.im.sdk.utils.z r10 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
                java.lang.String r11 = r21.getConversationId()
                java.lang.String r12 = ""
                java.lang.String r13 = "group"
                java.lang.String r14 = "create_group"
                java.lang.String r15 = ""
                r10.a(r11, r12, r13, r14, r15)
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r2 = r7.this$0
                android.content.Context r2 = r2.getContext()
                java.lang.String r3 = r21.getConversationId()
                com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity.a((android.content.Context) r2, (java.lang.String) r3, (android.os.Bundle) r1)
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r1 = r7.this$0
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                if (r1 == 0) goto L_0x0124
                r1.finish()
            L_0x0124:
                if (r8 != 0) goto L_0x0170
            L_0x0126:
                if (r9 == 0) goto L_0x012b
                java.lang.String r1 = r9.f21287e
                goto L_0x012c
            L_0x012b:
                r1 = r0
            L_0x012c:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.a.b> r2 = com.ss.android.ugc.aweme.im.sdk.group.a.b.class
                java.lang.Object r1 = com.ss.android.ugc.aweme.im.sdk.utils.l.a(r1, r2)
                com.ss.android.ugc.aweme.im.sdk.group.a.b r1 = (com.ss.android.ugc.aweme.im.sdk.group.a.b) r1
                r2 = 2131560497(0x7f0d0831, float:1.8746368E38)
                if (r1 == 0) goto L_0x0156
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r3 = r7.this$0
                android.content.Context r3 = r3.getContext()
                java.lang.String r4 = r1.getStatusMsg()
                if (r4 != 0) goto L_0x014d
                android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r4 = r4.getString(r2)
            L_0x014d:
                com.bytedance.ies.dmt.ui.d.a r3 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r3, (java.lang.String) r4)
                r3.a()
                if (r1 != 0) goto L_0x016b
            L_0x0156:
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r1 = r7.this$0
                android.content.Context r1 = r1.getContext()
                android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r2 = r3.getString(r2)
                com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r1, (java.lang.String) r2)
                r1.a()
            L_0x016b:
                java.lang.String r1 = "failure"
                com.ss.android.ugc.aweme.im.sdk.utils.z.h(r0, r1)
            L_0x0170:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment.b.invoke(com.bytedance.im.core.d.b, com.bytedance.im.core.d.j):void");
        }
    }

    public final int a(boolean z) {
        return 2130840083;
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51472a, false, 52094, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51472a, false, 52094, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f51473b == null) {
            this.f51473b = new HashMap();
        }
        View view = (View) this.f51473b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f51473b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f51472a, false, 52095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51472a, false, 52095, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51473b != null) {
            this.f51473b.clear();
        }
    }

    public final int g() {
        return C0906R.layout.pw;
    }

    public final boolean h() {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51472a, false, 52089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51472a, false, 52089, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        ((RelationMemberListViewModel) o()).a(3);
    }

    @NotNull
    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f51472a, false, 52090, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51472a, false, 52090, new Class[0], String.class);
        }
        Context context = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        String string = context.getResources().getString(C0906R.string.az2);
        Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…tle_select_follow_friend)");
        return string;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f51472a, false, 52088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51472a, false, 52088, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        if (PatchProxy.isSupport(new Object[0], this, f51472a, false, 52093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51472a, false, 52093, new Class[0], Void.TYPE);
            return;
        }
        View inflate = View.inflate(getContext(), C0906R.layout.vc, null);
        inflate.setOnClickListener(new a(this));
        Intrinsics.checkExpressionValueIsNotNull(inflate, "headerView");
        inflate.setBackground(c.e(getContext()));
        a(inflate);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f51472a, false, 52091, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51472a, false, 52091, new Class[0], Void.TYPE);
            return;
        }
        super.i();
        if (((RelationMemberListViewModel) o()).b() && ((RelationMemberListViewModel) o()).e() > 1) {
            Context context = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
            ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightText(context.getResources().getString(C0906R.string.aqk, new Object[]{Integer.valueOf(((RelationMemberListViewModel) o()).e())}));
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) a((int) C0906R.id.d3m);
            Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar, "title_bar");
            View rightView = imTextTitleBar.getRightView();
            Intrinsics.checkExpressionValueIsNotNull(rightView, "title_bar.rightView");
            rightView.setEnabled(true);
            ImTextTitleBar imTextTitleBar2 = (ImTextTitleBar) a((int) C0906R.id.d3m);
            Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar2, "title_bar");
            DmtTextView rightTexView = imTextTitleBar2.getRightTexView();
            Intrinsics.checkExpressionValueIsNotNull(rightTexView, "title_bar.rightTexView");
            TextPaint paint = rightTexView.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint, "title_bar.rightTexView.paint");
            paint.setFakeBoldText(true);
            Context context2 = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
            ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightTextColor(context2.getResources().getColor(C0906R.color.a1z));
        }
    }

    public final void j() {
        HashMap hashMap;
        if (PatchProxy.isSupport(new Object[0], this, f51472a, false, 52092, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51472a, false, 52092, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        List list = (List) ((RelationMemberListViewModel) o()).o.getValue();
        if (list != null) {
            if (list.size() == 1) {
                ((RelationMemberListViewModel) o()).o.getValue();
                if (list.get(0) instanceof IMUser) {
                    Object obj = list.get(0);
                    if (obj != null) {
                        IMUser iMUser = (IMUser) obj;
                        z.a("create_private_chat_click", (Map<String, String>) null);
                        z a2 = z.a();
                        String uid = iMUser.getUid();
                        Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
                        a2.a(e.a(Long.parseLong(uid)), iMUser.getUid(), PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, "click_contact", "contact_list");
                        ChatRoomActivity.a(getContext(), iMUser, 4);
                        FragmentActivity activity = getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    }
                }
            } else {
                r();
                z.a("create_group_click", (Map<String, String>) null);
                a a3 = a.f51529e.a();
                Intrinsics.checkExpressionValueIsNotNull(list, "this");
                Iterable<IMContact> iterable = list;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (IMContact iMContact : iterable) {
                    if (iMContact != null) {
                        arrayList.add((IMUser) iMContact);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    }
                }
                List list2 = (List) arrayList;
                com.ss.android.ugc.aweme.im.sdk.group.a.a aVar = com.ss.android.ugc.aweme.im.sdk.group.a.a.f51535b;
                if (PatchProxy.isSupport(new Object[]{6}, aVar, com.ss.android.ugc.aweme.im.sdk.group.a.a.f51534a, false, 52243, new Class[]{Integer.TYPE}, HashMap.class)) {
                    com.ss.android.ugc.aweme.im.sdk.group.a.a aVar2 = aVar;
                    hashMap = (HashMap) PatchProxy.accessDispatch(new Object[]{6}, aVar2, com.ss.android.ugc.aweme.im.sdk.group.a.a.f51534a, false, 52243, new Class[]{Integer.TYPE}, HashMap.class);
                } else {
                    hashMap = new HashMap();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("source_app_id", AppLog.getAppId());
                    jSONObject.put("source_type", 6);
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "params.toString()");
                    hashMap.put("create", jSONObject2);
                }
                a3.a(list2, (Map<String, String>) hashMap, (Function2<? super com.bytedance.im.core.d.b, ? super j, Unit>) new b<Object,Object,Unit>(list, this));
            }
        }
    }

    public final /* synthetic */ BaseMemberListViewModel a(LifecycleOwner lifecycleOwner) {
        RelationMemberListViewModel relationMemberListViewModel;
        ViewModel viewModel;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2}, this, f51472a, false, 52087, new Class[]{LifecycleOwner.class}, RelationMemberListViewModel.class)) {
            relationMemberListViewModel = (RelationMemberListViewModel) PatchProxy.accessDispatch(new Object[]{lifecycleOwner2}, this, f51472a, false, 52087, new Class[]{LifecycleOwner.class}, RelationMemberListViewModel.class);
        } else {
            Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "lifecycleOwner");
            Class cls = RelationMemberListViewModel.class;
            Function1 function1 = a.C0607a.INSTANCE;
            if (lifecycleOwner2 instanceof Fragment) {
                ViewModelProvider of = ViewModelProviders.of((Fragment) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
                viewModel = of.get(name, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                function1.invoke(viewModel);
            } else if (lifecycleOwner2 instanceof FragmentActivity) {
                ViewModelProvider of2 = ViewModelProviders.of((FragmentActivity) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name2 = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name2, "viewModelClass.java.name");
                viewModel = of2.get(name2, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                function1.invoke(viewModel);
            } else {
                throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
            }
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "when (lifecycleOwner) {\n…)\n            }\n        }");
            relationMemberListViewModel = (RelationMemberListViewModel) viewModel;
        }
        return relationMemberListViewModel;
    }
}

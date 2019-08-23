package com.ss.android.ugc.aweme.im.sdk.group;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u001e\u0010\u001a\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J.\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0005H\u0002J\u001e\u0010\u001d\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0018\u0010!\u001a\u00020\n2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupMemberAddFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "()V", "mConversationId", "", "mUnselectedMemberList", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "addMember", "", "contactList", "createViewModel", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "enableSingleSelect", "", "finishAddActivity", "getLeftIcon", "", "isMultiSelect", "getTitle", "getUidList", "initParams", "initViewModel", "onTitlebarRightClick", "parseCheckMsg", "checkMsg", "Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupCheckMsg;", "showInvitationDialog", "message", "setResult", "type", "updateSelectedState", "memberList", "Lcom/bytedance/im/core/model/Member;", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupMemberAddFragment extends BaseSelectFragment<RelationMemberListViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51492a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f51493d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f51494b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends IMContact> f51495c;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f51496e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupMemberAddFragment$Companion;", "", "()V", "SEPARATOR_SLIGHT_PAUSE_MARK", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\"\u0010\n\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupMemberAddFragment$addMember$2", "Lcom/bytedance/im/core/client/callback/IRequestListener2;", "", "Lcom/bytedance/im/core/model/Member;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "result", "onSuccessWithInfo", "memberList", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.bytedance.im.core.a.a.c<List<? extends m>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupMemberAddFragment f51498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f51499c;

        public final /* synthetic */ void a(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f51497a, false, 52194, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51497a, false, 52194, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f51498b.s();
            this.f51498b.l();
        }

        public final void a(@Nullable j jVar) {
            if (PatchProxy.isSupport(new Object[]{jVar}, this, f51497a, false, 52195, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar}, this, f51497a, false, 52195, new Class[]{j.class}, Void.TYPE);
                return;
            }
            this.f51498b.s();
            if (this.f51498b.getContext() != null) {
                Context context = this.f51498b.getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                com.ss.android.ugc.aweme.im.sdk.group.b.b.a(context, jVar);
            }
        }

        b(GroupMemberAddFragment groupMemberAddFragment, List list) {
            this.f51498b = groupMemberAddFragment;
            this.f51499c = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0136, code lost:
            if (r3.intValue() != 7504) goto L_0x021b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r21, com.bytedance.im.core.d.j r22) {
            /*
                r20 = this;
                r7 = r20
                r8 = r22
                r9 = r21
                java.util.List r9 = (java.util.List) r9
                r10 = 2
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r11 = 0
                r0[r11] = r9
                r12 = 1
                r0[r12] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f51497a
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<java.util.List> r1 = java.util.List.class
                r5[r11] = r1
                java.lang.Class<com.bytedance.im.core.d.j> r1 = com.bytedance.im.core.d.j.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 52193(0xcbe1, float:7.3138E-41)
                r1 = r20
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0049
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r9
                r0[r12] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f51497a
                r3 = 0
                r4 = 52193(0xcbe1, float:7.3138E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<java.util.List> r1 = java.util.List.class
                r5[r11] = r1
                java.lang.Class<com.bytedance.im.core.d.j> r1 = com.bytedance.im.core.d.j.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r20
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0049:
                com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment r0 = r7.f51498b
                r0.s()
                if (r8 == 0) goto L_0x0053
                java.lang.String r0 = r8.f21287e
                goto L_0x0054
            L_0x0053:
                r0 = 0
            L_0x0054:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.a.b> r1 = com.ss.android.ugc.aweme.im.sdk.group.a.b.class
                java.lang.Object r0 = com.ss.android.ugc.aweme.im.sdk.utils.l.a(r0, r1)
                com.ss.android.ugc.aweme.im.sdk.group.a.b r0 = (com.ss.android.ugc.aweme.im.sdk.group.a.b) r0
                if (r0 == 0) goto L_0x0221
                java.lang.Integer r1 = r0.getStatusCode()
                if (r1 != 0) goto L_0x0065
                goto L_0x006d
            L_0x0065:
                int r1 = r1.intValue()
                if (r1 != 0) goto L_0x006d
                goto L_0x0221
            L_0x006d:
                com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment r1 = r7.f51498b
                java.util.List r2 = r7.f51499c
                java.lang.Object[] r13 = new java.lang.Object[r10]
                r13[r11] = r2
                r13[r12] = r0
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment.f51492a
                r16 = 0
                r17 = 52185(0xcbd9, float:7.3127E-41)
                java.lang.Class[] r3 = new java.lang.Class[r10]
                java.lang.Class<java.util.List> r4 = java.util.List.class
                r3[r11] = r4
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.a.b> r4 = com.ss.android.ugc.aweme.im.sdk.group.a.b.class
                r3[r12] = r4
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r1
                r18 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r3 == 0) goto L_0x00b4
                java.lang.Object[] r13 = new java.lang.Object[r10]
                r13[r11] = r2
                r13[r12] = r0
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment.f51492a
                r16 = 0
                r17 = 52185(0xcbd9, float:7.3127E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class<java.util.List> r2 = java.util.List.class
                r0[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.a.b> r2 = com.ss.android.ugc.aweme.im.sdk.group.a.b.class
                r0[r12] = r2
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r1
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                goto L_0x021b
            L_0x00b4:
                java.lang.Integer r3 = r0.getStatusCode()
                if (r3 != 0) goto L_0x00bb
                goto L_0x0119
            L_0x00bb:
                int r3 = r3.intValue()
                r4 = 7508(0x1d54, float:1.0521E-41)
                if (r3 != r4) goto L_0x0119
                java.lang.String r0 = "member_agree"
                java.lang.Object[] r13 = new java.lang.Object[r10]
                r13[r11] = r2
                r13[r12] = r0
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment.f51492a
                r16 = 0
                r17 = 52188(0xcbdc, float:7.3131E-41)
                java.lang.Class[] r3 = new java.lang.Class[r10]
                java.lang.Class<java.util.List> r4 = java.util.List.class
                r3[r11] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r12] = r4
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r1
                r18 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r3 == 0) goto L_0x0108
                java.lang.Object[] r13 = new java.lang.Object[r10]
                r13[r11] = r2
                r13[r12] = r0
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment.f51492a
                r16 = 0
                r17 = 52188(0xcbdc, float:7.3131E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class<java.util.List> r2 = java.util.List.class
                r0[r11] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r12] = r2
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r1
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                goto L_0x021b
            L_0x0108:
                r3 = 2131560560(0x7f0d0870, float:1.8746496E38)
                java.lang.String r3 = r1.getString(r3)
                java.lang.String r4 = "getString(R.string.im_invitation_need_allow)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r1.a(r3, r2, r11, r0)
                goto L_0x021b
            L_0x0119:
                java.lang.Integer r3 = r0.getStatusCode()
                if (r3 != 0) goto L_0x0120
                goto L_0x0128
            L_0x0120:
                int r3 = r3.intValue()
                r4 = 7511(0x1d57, float:1.0525E-41)
                if (r3 == r4) goto L_0x013a
            L_0x0128:
                java.lang.Integer r3 = r0.getStatusCode()
                if (r3 != 0) goto L_0x0130
                goto L_0x021b
            L_0x0130:
                int r3 = r3.intValue()
                r4 = 7504(0x1d50, float:1.0515E-41)
                if (r3 == r4) goto L_0x013a
                goto L_0x021b
            L_0x013a:
                java.util.List r3 = r0.getInvalidMembers()
                if (r3 == 0) goto L_0x021b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r5 = r3
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x014c:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0182
                java.lang.Object r6 = r5.next()
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r6
                com.ss.android.ugc.aweme.im.sdk.d.e r8 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                java.lang.String r13 = r6.getUid()
                com.ss.android.ugc.aweme.im.service.model.IMUser r8 = r8.b((java.lang.String) r13)
                if (r8 == 0) goto L_0x0175
                java.lang.String r13 = r8.getDisplayName()
                r4.append(r13)
                java.lang.String r13 = "、"
                r4.append(r13)
                if (r8 == 0) goto L_0x0175
                goto L_0x014c
            L_0x0175:
                java.lang.String r6 = r6.getDisplayName()
                r4.append(r6)
                java.lang.String r6 = "、"
                r4.append(r6)
                goto L_0x014c
            L_0x0182:
                r5 = r4
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                int r5 = r5.length()
                if (r5 <= 0) goto L_0x018d
                r5 = 1
                goto L_0x018e
            L_0x018d:
                r5 = 0
            L_0x018e:
                if (r5 == 0) goto L_0x0198
                int r5 = r4.length()
                int r5 = r5 - r12
                r4.setLength(r5)
            L_0x0198:
                int r5 = r3.size()
                if (r5 <= r12) goto L_0x01c5
                android.content.Context r5 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r6 = "GlobalContext.getContext()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                android.content.res.Resources r5 = r5.getResources()
                r6 = 2131560516(0x7f0d0844, float:1.8746406E38)
                java.lang.Object[] r8 = new java.lang.Object[r10]
                java.lang.String r4 = r4.toString()
                r8[r11] = r4
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r8[r12] = r3
                java.lang.String r3 = r5.getString(r6, r8)
                goto L_0x01e1
            L_0x01c5:
                android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r5 = "GlobalContext.getContext()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
                android.content.res.Resources r3 = r3.getResources()
                r5 = 2131560515(0x7f0d0843, float:1.8746404E38)
                java.lang.Object[] r6 = new java.lang.Object[r12]
                java.lang.String r4 = r4.toString()
                r6[r11] = r4
                java.lang.String r3 = r3.getString(r5, r6)
            L_0x01e1:
                java.util.List r4 = r0.getInvalidMembers()
                if (r4 != 0) goto L_0x01ea
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x01ea:
                int r4 = r4.size()
                int r2 = r2.size()
                if (r4 != r2) goto L_0x0208
                java.lang.String r2 = "showMsg"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r2)
                java.util.List r0 = r0.getInvalidMembers()
                if (r0 != 0) goto L_0x0202
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0202:
                java.lang.String r2 = "group_agree"
                r1.a(r3, r0, r11, r2)
                goto L_0x021b
            L_0x0208:
                java.lang.String r2 = "showMsg"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r2)
                java.util.List r0 = r0.getInvalidMembers()
                if (r0 != 0) goto L_0x0216
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0216:
                java.lang.String r2 = "group_agree"
                r1.a(r3, r0, r12, r2)
            L_0x021b:
                com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment r0 = r7.f51498b
                r0.c(r9)
                return
            L_0x0221:
                com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment r0 = r7.f51498b
                r0.l()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment.b.a(java.lang.Object, com.bytedance.im.core.d.j):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<RelationMemberListViewModel, RelationMemberListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupMemberAddFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(GroupMemberAddFragment groupMemberAddFragment) {
            super(1);
            this.this$0 = groupMemberAddFragment;
        }

        @NotNull
        public final RelationMemberListViewModel invoke(@NotNull RelationMemberListViewModel relationMemberListViewModel) {
            if (PatchProxy.isSupport(new Object[]{relationMemberListViewModel}, this, changeQuickRedirect, false, 52196, new Class[]{RelationMemberListViewModel.class}, RelationMemberListViewModel.class)) {
                return (RelationMemberListViewModel) PatchProxy.accessDispatch(new Object[]{relationMemberListViewModel}, this, changeQuickRedirect, false, 52196, new Class[]{RelationMemberListViewModel.class}, RelationMemberListViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(relationMemberListViewModel, "$receiver");
            relationMemberListViewModel.i = this.this$0.k;
            relationMemberListViewModel.f52170c = this.this$0.f51494b;
            List<? extends IMContact> list = this.this$0.f51495c;
            if (list != null) {
                relationMemberListViewModel.a(list);
            }
            return relationMemberListViewModel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/im/sdk/group/GroupMemberAddFragment$onTitlebarRightClick$1$1"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51500a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51501b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GroupMemberAddFragment f51502c;

        d(List list, GroupMemberAddFragment groupMemberAddFragment) {
            this.f51501b = list;
            this.f51502c = groupMemberAddFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f51500a, false, 52197, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51500a, false, 52197, new Class[0], Void.TYPE);
                return;
            }
            z a2 = z.a();
            String str = this.f51502c.f51494b;
            Object value = ((RelationMemberListViewModel) this.f51502c.o()).o.getValue();
            if (value == null) {
                Intrinsics.throwNpe();
            }
            a2.d(str, String.valueOf(((List) value).size()));
            GroupMemberAddFragment groupMemberAddFragment = this.f51502c;
            List list = this.f51501b;
            Intrinsics.checkExpressionValueIsNotNull(list, "this");
            if (PatchProxy.isSupport(new Object[]{list}, groupMemberAddFragment, GroupMemberAddFragment.f51492a, false, 52184, new Class[]{List.class}, Void.TYPE)) {
                GroupMemberAddFragment groupMemberAddFragment2 = groupMemberAddFragment;
                PatchProxy.accessDispatch(new Object[]{list}, groupMemberAddFragment2, GroupMemberAddFragment.f51492a, false, 52184, new Class[]{List.class}, Void.TYPE);
                return;
            }
            groupMemberAddFragment.r();
            HashMap<String, String> a3 = com.ss.android.ugc.aweme.im.sdk.group.a.a.f51535b.a(com.ss.android.ugc.aweme.im.sdk.utils.d.d(), 6, null);
            a a4 = a.f51529e.a();
            String str2 = groupMemberAddFragment.f51494b;
            Iterable<IMContact> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (IMContact iMContact : iterable) {
                if (iMContact != null) {
                    arrayList.add((IMUser) iMContact);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
            a4.a(str2, (List) arrayList, a3, new b(groupMemberAddFragment, list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupMemberAddFragment f51504b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f51505c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f51506d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f51507e;

        e(GroupMemberAddFragment groupMemberAddFragment, List list, String str, boolean z) {
            this.f51504b = groupMemberAddFragment;
            this.f51505c = list;
            this.f51506d = str;
            this.f51507e = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51503a, false, 52198, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51503a, false, 52198, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            List<String> d2 = this.f51504b.d(this.f51505c);
            CharSequence charSequence = this.f51504b.f51494b;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Collection collection = d2;
                if (collection == null || collection.isEmpty()) {
                    z2 = true;
                }
                if (!z2) {
                    a a2 = a.f51529e.a();
                    String str = this.f51504b.f51494b;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    a2.c(str, d2);
                    com.bytedance.ies.dmt.ui.d.a.a(this.f51504b.getContext(), (int) C0906R.string.asr).a();
                    String str2 = this.f51506d;
                    Iterable<IMContact> iterable = this.f51505c;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (IMContact iMContact : iterable) {
                        if (iMContact != null) {
                            arrayList.add((IMUser) iMContact);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                        }
                    }
                    z.a("add", str2, (List) arrayList, "confirm");
                    if (this.f51507e) {
                        FragmentActivity activity = this.f51504b.getActivity();
                        if (activity != null) {
                            activity.setResult(220);
                        }
                    }
                    FragmentActivity activity2 = this.f51504b.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51508a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51509b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f51510c;

        f(String str, List list) {
            this.f51509b = str;
            this.f51510c = list;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51508a, false, 52199, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51508a, false, 52199, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            String str = this.f51509b;
            Iterable<IMContact> iterable = this.f51510c;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (IMContact iMContact : iterable) {
                if (iMContact != null) {
                    arrayList.add((IMUser) iMContact);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
            z.a("add", str, (List) arrayList, "cancel");
        }
    }

    public final int a(boolean z) {
        return 2130841646;
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51492a, false, 52191, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51492a, false, 52191, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f51496e == null) {
            this.f51496e = new HashMap();
        }
        View view = (View) this.f51496e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f51496e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f51492a, false, 52192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51492a, false, 52192, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51496e != null) {
            this.f51496e.clear();
        }
    }

    public final boolean h() {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51492a, false, 52181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51492a, false, 52181, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        ((RelationMemberListViewModel) o()).a(3);
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f51492a, false, 52187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51492a, false, 52187, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(220);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @NotNull
    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f51492a, false, 52183, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51492a, false, 52183, new Class[0], String.class);
        }
        Context context = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        String string = context.getResources().getString(C0906R.string.az2);
        Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…tle_select_follow_friend)");
        return string;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f51492a, false, 52182, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51492a, false, 52182, new Class[0], Void.TYPE);
            return;
        }
        List list = (List) ((RelationMemberListViewModel) o()).o.getValue();
        if (list != null) {
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a(getContext(), this.f51494b, new d(list, this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r0 == null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51492a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 52180(0xcbd4, float:7.312E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51492a
            r5 = 0
            r6 = 52180(0xcbd4, float:7.312E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.a()
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = "session_id"
            java.lang.String r1 = r0.getString(r1)
            r9.f51494b = r1
            java.lang.String r1 = "key_unselected_contact"
            java.io.Serializable r1 = r0.getSerializable(r1)
            boolean r2 = r1 instanceof java.util.List
            if (r2 != 0) goto L_0x0041
            r1 = 0
        L_0x0041:
            java.util.List r1 = (java.util.List) r1
            r9.f51495c = r1
            if (r0 != 0) goto L_0x005e
        L_0x0047:
            r0 = r9
            com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment r0 = (com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment) r0
            android.support.v4.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x0055
            r2 = 220(0xdc, float:3.08E-43)
            r1.setResult(r2)
        L_0x0055:
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x005e
            r0.finish()
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment.a():void");
    }

    public final /* synthetic */ BaseMemberListViewModel a(LifecycleOwner lifecycleOwner) {
        RelationMemberListViewModel relationMemberListViewModel;
        ViewModel viewModel;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2}, this, f51492a, false, 52179, new Class[]{LifecycleOwner.class}, RelationMemberListViewModel.class)) {
            relationMemberListViewModel = (RelationMemberListViewModel) PatchProxy.accessDispatch(new Object[]{lifecycleOwner2}, this, f51492a, false, 52179, new Class[]{LifecycleOwner.class}, RelationMemberListViewModel.class);
        } else {
            Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "lifecycleOwner");
            Function1 cVar = new c(this);
            Class cls = RelationMemberListViewModel.class;
            if (lifecycleOwner2 instanceof Fragment) {
                ViewModelProvider of = ViewModelProviders.of((Fragment) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
                viewModel = of.get(name, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                cVar.invoke(viewModel);
            } else if (lifecycleOwner2 instanceof FragmentActivity) {
                ViewModelProvider of2 = ViewModelProviders.of((FragmentActivity) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name2 = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name2, "viewModelClass.java.name");
                viewModel = of2.get(name2, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                cVar.invoke(viewModel);
            } else {
                throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
            }
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "when (lifecycleOwner) {\n…)\n            }\n        }");
            relationMemberListViewModel = (RelationMemberListViewModel) viewModel;
        }
        return relationMemberListViewModel;
    }

    public final void c(List<? extends m> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51492a, false, 52186, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51492a, false, 52186, new Class[]{List.class}, Void.TYPE);
            return;
        }
        List arrayList = new ArrayList();
        if (list != null) {
            for (m uid : list) {
                IMUser b2 = com.ss.android.ugc.aweme.im.sdk.d.e.a().b(String.valueOf(uid.getUid()));
                if (b2 != null) {
                    List<? extends IMContact> list2 = ((RelationMemberListViewModel) o()).f52173f;
                    if (list2 != null) {
                        ((ArrayList) list2).add(b2);
                        arrayList.add(b2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.im.service.model.IMContact>");
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((RelationMemberListViewModel) o()).b(arrayList);
        }
    }

    public final List<String> d(List<? extends IMContact> list) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{list}, this, f51492a, false, 52190, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f51492a, false, 52190, new Class[]{List.class}, List.class);
        }
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        }
        if (z) {
            return null;
        }
        List<String> arrayList = new ArrayList<>();
        for (IMContact iMContact : list) {
            if (iMContact instanceof IMUser) {
                String uid = ((IMUser) iMContact).getUid();
                Intrinsics.checkExpressionValueIsNotNull(uid, "it.uid");
                arrayList.add(uid);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, List<? extends IMContact> list, boolean z, String str2) {
        String str3 = str;
        List<? extends IMContact> list2 = list;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, list2, Byte.valueOf(z ? (byte) 1 : 0), str4}, this, f51492a, false, 52189, new Class[]{String.class, List.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, list2, Byte.valueOf(z), str4}, this, f51492a, false, 52189, new Class[]{String.class, List.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            new a.C0185a(context).b(str3).e(C0906R.style.kx).a((int) C0906R.string.atx, (DialogInterface.OnClickListener) new e(this, list2, str4, z)).b((int) C0906R.string.apk, (DialogInterface.OnClickListener) new f(str4, list2)).a().a();
        }
    }
}

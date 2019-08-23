package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/GroupInviteViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/ShareSimpleBaseViewHolder;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "baseContent", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "position", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class GroupInviteViewHolder extends ShareSimpleBaseViewHolder {
    public static ChangeQuickRedirect p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupInviteViewHolder(@NotNull View view, int i) {
        super(view, i);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c5, code lost:
        if (r4 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ec, code lost:
        if (r4 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x014a, code lost:
        if (r0 != null) goto L_0x01a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(@org.jetbrains.annotations.Nullable com.bytedance.im.core.d.n r15, @org.jetbrains.annotations.Nullable com.bytedance.im.core.d.n r16, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r17, int r18) {
        /*
            r14 = this;
            r7 = r14
            r9 = 4
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r15
            r11 = 1
            r0[r11] = r16
            r12 = 2
            r0[r12] = r17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r13 = 3
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = p
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.im.core.d.n> r1 = com.bytedance.im.core.d.n.class
            r5[r10] = r1
            java.lang.Class<com.bytedance.im.core.d.n> r1 = com.bytedance.im.core.d.n.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent> r1 = com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 51475(0xc913, float:7.2132E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0062
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r15
            r0[r11] = r16
            r0[r12] = r17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = p
            r3 = 0
            r4 = 51475(0xc913, float:7.2132E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.im.core.d.n> r1 = com.bytedance.im.core.d.n.class
            r5[r10] = r1
            java.lang.Class<com.bytedance.im.core.d.n> r1 = com.bytedance.im.core.d.n.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent> r1 = com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0062:
            super.a(r15, r16, r17, r18)
            if (r17 == 0) goto L_0x01c7
            r0 = r17
            com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent r0 = (com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent) r0
            android.view.View r1 = r7.i
            r2 = 50331648(0x3000000, float:3.761582E-37)
            r3 = 37
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.setTag(r2, r3)
            android.view.View r1 = r7.i
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            com.bytedance.im.core.d.n r3 = r7.m
            r1.setTag(r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.s
            java.lang.String r2 = "titleView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r3 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131560517(0x7f0d0845, float:1.8746409E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            com.ss.android.ugc.aweme.im.sdk.group.a.c r0 = r0.getGroupInviteCardInfo()
            r1 = 2131560499(0x7f0d0833, float:1.8746372E38)
            r2 = 2131560513(0x7f0d0841, float:1.87464E38)
            if (r0 == 0) goto L_0x014c
            com.bytedance.im.core.d.d r3 = com.bytedance.im.core.d.d.a()
            java.lang.String r4 = r0.getConversationId()
            com.bytedance.im.core.d.b r3 = r3.a((java.lang.String) r4)
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r0.getGroupIcon()
            r5 = 0
            if (r4 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r7.r
            com.ss.android.ugc.aweme.base.c.b(r6, r4)
            if (r4 != 0) goto L_0x00da
        L_0x00c7:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r7.r
            if (r3 == 0) goto L_0x00d6
            com.bytedance.im.core.d.c r6 = r3.getCoreInfo()
            if (r6 == 0) goto L_0x00d6
            java.lang.String r6 = r6.getIcon()
            goto L_0x00d7
        L_0x00d6:
            r6 = r5
        L_0x00d7:
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r4, (java.lang.String) r6)
        L_0x00da:
            com.ss.android.ugc.aweme.im.sdk.d.e r4 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
            java.lang.String r6 = r0.getFromUserId()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r4.a((java.lang.String) r6)
            if (r4 == 0) goto L_0x00ee
            java.lang.String r4 = r4.getDisplayName()
            if (r4 != 0) goto L_0x00ff
        L_0x00ee:
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r6 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r6)
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getString(r1)
        L_0x00ff:
            java.lang.String r6 = r0.getGroupName()
            if (r6 != 0) goto L_0x0112
            if (r3 == 0) goto L_0x0113
            com.bytedance.im.core.d.c r3 = r3.getCoreInfo()
            if (r3 == 0) goto L_0x0113
            java.lang.String r5 = r3.getName()
            goto L_0x0113
        L_0x0112:
            r5 = r6
        L_0x0113:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r7.t
            java.lang.String r6 = "descView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r6)
            r3.setMaxLines(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r7.t
            java.lang.String r6 = "descView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r6)
            android.content.Context r6 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r8 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r8[r10] = r4
            r8[r11] = r5
            java.lang.String r4 = r6.getString(r2, r8)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r7.t
            java.lang.String r4 = "descView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r3.setVisibility(r10)
            if (r0 != 0) goto L_0x01a8
        L_0x014c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.t
            java.lang.String r3 = "descView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            r0.setMaxLines(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.t
            java.lang.String r3 = "descView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            r0.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.t
            java.lang.String r3 = "descView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r4 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r12]
            android.content.Context r5 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r6 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r1 = r5.getString(r1)
            r4[r10] = r1
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r5 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2131560498(0x7f0d0832, float:1.874637E38)
            java.lang.String r1 = r1.getString(r5)
            r4[r11] = r1
            java.lang.String r1 = r3.getString(r2, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x01a8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.u
            java.lang.String r1 = "tagView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r2 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131560519(0x7f0d0847, float:1.8746413E38)
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setText(r1)
            return
        L_0x01c7:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GroupInviteViewHolder.a(com.bytedance.im.core.d.n, com.bytedance.im.core.d.n, com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent, int):void");
    }
}

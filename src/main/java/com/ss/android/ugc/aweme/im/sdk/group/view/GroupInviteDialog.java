package com.ss.android.ugc.aweme.im.sdk.group.view;

import a.g;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.detail.a.f;
import com.ss.android.ugc.aweme.im.sdk.group.a;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020!H\u0002J\u0012\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\b\u0010(\u001a\u00020!H\u0002J\u000e\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u0016J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/H\u0002R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u001a\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupInviteDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "mTicket", "", "type", "", "(Landroid/content/Context;Ljava/lang/String;I)V", "mAvatarIv", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "kotlin.jvm.PlatformType", "mCloseBtn", "Landroid/widget/ImageButton;", "mConfirmBtn", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mConversationId", "mConversationShortId", "mCountTv", "mCurrentType", "mDescriptionTv", "mGroupCardInfo", "Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupInviteCardInfo;", "mInviteUserId", "mMemberCount", "Ljava/lang/Integer;", "mNameTv", "mRootView", "Landroid/view/View;", "convertStatusCode", "statusCode", "(Ljava/lang/Integer;)I", "enterGroup", "", "initData", "initGroupInfo", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "refreshGroupInfo", "setGroupCardInfo", "groupInviteCardInfo", "startGroupChat", "updateConfirmButton", "updateGroupInfo", "groupVerifyInfo", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupVerifyInfo;", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupInviteDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51581a;
    public static final a n = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final AvatarImageView f51582b = ((AvatarImageView) this.o.findViewById(C0906R.id.i4));

    /* renamed from: c  reason: collision with root package name */
    final DmtTextView f51583c = ((DmtTextView) this.o.findViewById(C0906R.id.bps));

    /* renamed from: d  reason: collision with root package name */
    final DmtTextView f51584d = ((DmtTextView) this.o.findViewById(C0906R.id.a0h));

    /* renamed from: e  reason: collision with root package name */
    public final DmtTextView f51585e = ((DmtTextView) this.o.findViewById(C0906R.id.a3u));

    /* renamed from: f  reason: collision with root package name */
    public String f51586f;
    public String g;
    String h;
    Integer i;
    public int j = 1;
    public com.ss.android.ugc.aweme.im.sdk.group.a.c k;
    public String l;
    public final int m;
    private final View o;
    private final DmtTextView p = ((DmtTextView) this.o.findViewById(C0906R.id.y0));
    private final ImageButton q = ((ImageButton) this.o.findViewById(C0906R.id.ti));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupInviteDialog$Companion;", "", "()V", "STATUS_EXPIRED", "", "STATUS_JOIN", "STATUS_SEND", "TYPE_EXPIRED", "", "TYPE_FAIL", "TYPE_GROUP_FULL", "TYPE_INVITE", "TYPE_IN_GROUP", "TYPE_LOADING", "TYPE_PASSWORD_EXPIRED", "TYPE_SELF", "TYPE_SELF_PASSWORD", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\"\u0010\n\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/view/GroupInviteDialog$enterGroup$1$1", "Lcom/bytedance/im/core/client/callback/IRequestListener2;", "", "Lcom/bytedance/im/core/model/Member;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "result", "onSuccessWithInfo", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.bytedance.im.core.a.a.c<List<? extends m>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51587a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupInviteDialog f51588b;

        b(GroupInviteDialog groupInviteDialog) {
            this.f51588b = groupInviteDialog;
        }

        public final /* synthetic */ void a(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f51587a, false, 52262, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51587a, false, 52262, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f51588b.dismiss();
            this.f51588b.c();
        }

        public final void a(@Nullable j jVar) {
            if (PatchProxy.isSupport(new Object[]{jVar}, this, f51587a, false, 52263, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar}, this, f51587a, false, 52263, new Class[]{j.class}, Void.TYPE);
                return;
            }
            Context context = this.f51588b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a(context, jVar);
            if (jVar != null) {
                String str = jVar.f21287e;
                if (str != null) {
                    try {
                        Object a2 = l.a(str, com.ss.android.ugc.aweme.im.sdk.group.a.b.class);
                        Intrinsics.checkExpressionValueIsNotNull(a2, "GsonUtil.parse(this, GroupCheckMsg::class.java)");
                        this.f51588b.j = this.f51588b.a(((com.ss.android.ugc.aweme.im.sdk.group.a.b) a2).getStatusCode());
                        this.f51588b.d();
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public final /* synthetic */ void a(Object obj, j jVar) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list, jVar}, this, f51587a, false, 52261, new Class[]{List.class, j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list, jVar}, this, f51587a, false, 52261, new Class[]{List.class, j.class}, Void.TYPE);
                return;
            }
            this.f51588b.dismiss();
            this.f51588b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupInviteDialog f51590b;

        c(GroupInviteDialog groupInviteDialog) {
            this.f51590b = groupInviteDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51589a, false, 52264, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51589a, false, 52264, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f51590b.j == 6) {
                this.f51590b.a();
                return;
            }
            this.f51590b.b();
            if (this.f51590b.m == 1) {
                z.a().c(this.f51590b.g, "group_inflow_toast_click");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupInviteDialog f51592b;

        d(GroupInviteDialog groupInviteDialog) {
            this.f51592b = groupInviteDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51591a, false, 52265, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51591a, false, 52265, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f51592b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupVerifyResponse;", "kotlin.jvm.PlatformType", "then", "com/ss/android/ugc/aweme/im/sdk/group/view/GroupInviteDialog$refreshGroupInfo$1$2"}, k = 3, mv = {1, 1, 15})
    static final class e<TTaskResult, TContinuationResult> implements g<f, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GroupInviteDialog f51595c;

        e(String str, GroupInviteDialog groupInviteDialog) {
            this.f51594b = str;
            this.f51595c = groupInviteDialog;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a2, code lost:
            if (r6 == null) goto L_0x01a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0247, code lost:
            if (r5 == null) goto L_0x0249;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x027c, code lost:
            if (r0 == null) goto L_0x027e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f51593a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r3 = 0
                r4 = 52266(0xcc2a, float:7.324E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003b
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f51593a
                r3 = 0
                r4 = 52266(0xcc2a, float:7.324E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r1 = r18
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Void r0 = (java.lang.Void) r0
                return r0
            L_0x003b:
                java.lang.String r0 = "task"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                boolean r0 = r19.b()
                r1 = 2131560509(0x7f0d083d, float:1.8746392E38)
                r2 = 6
                r3 = 0
                if (r0 == 0) goto L_0x029a
                java.lang.Object r0 = r19.e()
                if (r0 == 0) goto L_0x029a
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.im.sdk.detail.a.f r0 = (com.ss.android.ugc.aweme.im.sdk.detail.a.f) r0
                int r0 = r0.status_code
                if (r0 != 0) goto L_0x0283
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.im.sdk.detail.a.f r0 = (com.ss.android.ugc.aweme.im.sdk.detail.a.f) r0
                if (r0 == 0) goto L_0x0068
                com.ss.android.ugc.aweme.im.sdk.detail.a.e r0 = r0.getGroupVerifyInfo()
                goto L_0x0069
            L_0x0068:
                r0 = r3
            L_0x0069:
                if (r0 == 0) goto L_0x027e
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r4 = r7.f51595c
                java.lang.String r5 = r0.getInviterUserId()
                r4.f51586f = r5
                java.lang.String r4 = r0.getTicket()
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                if (r4 == 0) goto L_0x0084
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0082
                goto L_0x0084
            L_0x0082:
                r4 = 0
                goto L_0x0085
            L_0x0084:
                r4 = 1
            L_0x0085:
                if (r4 != 0) goto L_0x008f
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r4 = r7.f51595c
                java.lang.String r5 = r0.getTicket()
                r4.l = r5
            L_0x008f:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r4 = r7.f51595c
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog.f51581a
                r14 = 0
                r15 = 52256(0xcc20, float:7.3226E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.detail.a.e> r6 = com.ss.android.ugc.aweme.im.sdk.detail.a.e.class
                r5[r10] = r6
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r4
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r5 == 0) goto L_0x00c6
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog.f51581a
                r14 = 0
                r15 = 52256(0xcc20, float:7.3226E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.detail.a.e> r6 = com.ss.android.ugc.aweme.im.sdk.detail.a.e.class
                r5[r10] = r6
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r4
                r16 = r5
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0278
            L_0x00c6:
                java.lang.String r5 = r0.getInviterUserId()
                r4.f51586f = r5
                java.lang.String r5 = r0.getConversationId()
                r4.g = r5
                java.lang.String r5 = r0.getConversationShortId()
                r4.h = r5
                com.bytedance.im.core.d.d r5 = com.bytedance.im.core.d.d.a()
                java.lang.String r6 = r0.getConversationId()
                com.bytedance.im.core.d.b r5 = r5.a((java.lang.String) r6)
                java.lang.String r6 = r0.getGroupAvatar()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                if (r6 == 0) goto L_0x00f5
                int r6 = r6.length()
                if (r6 != 0) goto L_0x00f3
                goto L_0x00f5
            L_0x00f3:
                r6 = 0
                goto L_0x00f6
            L_0x00f5:
                r6 = 1
            L_0x00f6:
                if (r6 == 0) goto L_0x010e
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r6 = r4.f51582b
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r6
                if (r5 == 0) goto L_0x0109
                com.bytedance.im.core.d.c r8 = r5.getCoreInfo()
                if (r8 == 0) goto L_0x0109
                java.lang.String r8 = r8.getIcon()
                goto L_0x010a
            L_0x0109:
                r8 = r3
            L_0x010a:
                com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r6, (java.lang.String) r8)
                goto L_0x0119
            L_0x010e:
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r6 = r4.f51582b
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r6
                java.lang.String r8 = r0.getGroupAvatar()
                com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r6, (java.lang.String) r8)
            L_0x0119:
                java.lang.String r6 = r0.getGroupName()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                if (r6 == 0) goto L_0x012a
                int r6 = r6.length()
                if (r6 != 0) goto L_0x0128
                goto L_0x012a
            L_0x0128:
                r6 = 0
                goto L_0x012b
            L_0x012a:
                r6 = 1
            L_0x012b:
                if (r6 == 0) goto L_0x0148
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f51583c
                java.lang.String r8 = "mNameTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
                if (r5 == 0) goto L_0x0141
                com.bytedance.im.core.d.c r8 = r5.getCoreInfo()
                if (r8 == 0) goto L_0x0141
                java.lang.String r8 = r8.getName()
                goto L_0x0142
            L_0x0141:
                r8 = r3
            L_0x0142:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                r6.setText(r8)
                goto L_0x0158
            L_0x0148:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f51583c
                java.lang.String r8 = "mNameTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
                java.lang.String r8 = r0.getGroupName()
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                r6.setText(r8)
            L_0x0158:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f51583c
                r6.requestLayout()
                java.lang.Integer r6 = r0.getGroupMemberCount()
                r8 = 2131560520(0x7f0d0848, float:1.8746415E38)
                if (r6 == 0) goto L_0x01a4
                r11 = r6
                java.lang.Number r11 = (java.lang.Number) r11
                int r11 = r11.intValue()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
                r4.i = r12
                com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r4.f51584d
                java.lang.String r13 = "mCountTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r13)
                r12.setVisibility(r10)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r4.f51584d
                java.lang.String r13 = "mCountTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r13)
                android.content.Context r13 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r14 = "GlobalContext.getContext()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r13, r14)
                android.content.res.Resources r13 = r13.getResources()
                java.lang.Object[] r14 = new java.lang.Object[r9]
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r14[r10] = r11
                java.lang.String r11 = r13.getString(r8, r14)
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r12.setText(r11)
                if (r6 != 0) goto L_0x01e1
            L_0x01a4:
                if (r5 == 0) goto L_0x01e1
                int r5 = r5.getMemberCount()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r4.i = r6
                if (r5 <= 0) goto L_0x01e1
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f51584d
                java.lang.String r11 = "mCountTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r11)
                r6.setVisibility(r10)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f51584d
                java.lang.String r11 = "mCountTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r11)
                android.content.Context r11 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r12 = "GlobalContext.getContext()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
                android.content.res.Resources r11 = r11.getResources()
                java.lang.Object[] r12 = new java.lang.Object[r9]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r12[r10] = r5
                java.lang.String r5 = r11.getString(r8, r12)
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r6.setText(r5)
            L_0x01e1:
                java.lang.String r5 = r0.getInviterUserId()
                java.lang.CharSequence r6 = com.ss.android.ugc.aweme.im.sdk.utils.d.b()
                java.lang.String r6 = r6.toString()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
                if (r5 == 0) goto L_0x0211
                com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r4.f51585e
                java.lang.String r6 = "mDescriptionTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                android.content.Context r6 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r8 = "GlobalContext.getContext()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
                android.content.res.Resources r6 = r6.getResources()
                java.lang.String r6 = r6.getString(r1)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r5.setText(r6)
                goto L_0x0269
            L_0x0211:
                com.ss.android.ugc.aweme.im.sdk.d.e r5 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
                java.lang.String r6 = r0.getInviterUserId()
                com.ss.android.ugc.aweme.im.service.model.IMUser r5 = r5.a((java.lang.String) r6)
                if (r5 == 0) goto L_0x0249
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f51585e
                java.lang.String r8 = "mDescriptionTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
                android.content.Context r8 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r11 = "GlobalContext.getContext()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r11)
                android.content.res.Resources r8 = r8.getResources()
                r11 = 2131560512(0x7f0d0840, float:1.8746398E38)
                java.lang.Object[] r12 = new java.lang.Object[r9]
                java.lang.String r13 = r5.getDisplayName()
                r12[r10] = r13
                java.lang.String r8 = r8.getString(r11, r12)
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                r6.setText(r8)
                if (r5 != 0) goto L_0x0269
            L_0x0249:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r4.f51585e
                java.lang.String r6 = "mDescriptionTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                android.content.Context r6 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r8 = "GlobalContext.getContext()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
                android.content.res.Resources r6 = r6.getResources()
                r8 = 2131560501(0x7f0d0835, float:1.8746376E38)
                java.lang.String r6 = r6.getString(r8)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r5.setText(r6)
            L_0x0269:
                int r5 = r4.m
                if (r5 != r9) goto L_0x0278
                com.ss.android.ugc.aweme.im.sdk.utils.z r5 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
                java.lang.String r4 = r4.g
                java.lang.String r6 = "group_inflow_toast_show"
                r5.c(r4, r6)
            L_0x0278:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r4 = r7.f51595c
                r4.j = r9
                if (r0 != 0) goto L_0x02c9
            L_0x027e:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                r0.j = r2
                goto L_0x02c9
            L_0x0283:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r2 = r7.f51595c
                java.lang.Object r4 = r19.e()
                com.ss.android.ugc.aweme.im.sdk.detail.a.f r4 = (com.ss.android.ugc.aweme.im.sdk.detail.a.f) r4
                int r4 = r4.status_code
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                int r2 = r2.a(r4)
                r0.j = r2
                goto L_0x02c9
            L_0x029a:
                java.lang.Exception r0 = r19.f()
                boolean r0 = r0 instanceof com.ss.android.ugc.aweme.base.api.a.b.a
                if (r0 == 0) goto L_0x02c5
                java.lang.Exception r0 = r19.f()
                if (r0 == 0) goto L_0x02bd
                com.ss.android.ugc.aweme.base.api.a.b.a r0 = (com.ss.android.ugc.aweme.base.api.a.b.a) r0
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r2 = r7.f51595c
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r4 = r7.f51595c
                int r0 = r0.getErrorCode()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r0 = r4.a(r0)
                r2.j = r0
                goto L_0x02c9
            L_0x02bd:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException"
                r0.<init>(r1)
                throw r0
            L_0x02c5:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                r0.j = r2
            L_0x02c9:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                java.lang.String r0 = r0.f51586f
                if (r0 == 0) goto L_0x02d9
                boolean r0 = com.ss.android.ugc.aweme.im.sdk.utils.d.a((java.lang.String) r0)
                if (r0 == 0) goto L_0x02d9
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                r0.j = r10
            L_0x02d9:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                r0.d()
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                int r0 = r0.j
                if (r0 == 0) goto L_0x02ec
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                int r0 = r0.j
                r2 = 8
                if (r0 != r2) goto L_0x0302
            L_0x02ec:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f51585e
                java.lang.String r2 = "mDescriptionTv"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r1 = r2.getString(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
            L_0x0302:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                int r0 = r0.m
                r1 = 4
                if (r0 != r1) goto L_0x0356
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                int r0 = r0.j
                switch(r0) {
                    case 0: goto L_0x033d;
                    case 1: goto L_0x0327;
                    case 2: goto L_0x0311;
                    default: goto L_0x0310;
                }
            L_0x0310:
                goto L_0x0356
            L_0x0311:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                java.lang.String r0 = r0.g
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r1 = r7.f51595c
                java.lang.String r1 = r1.f51586f
                java.lang.CharSequence r2 = com.ss.android.ugc.aweme.im.sdk.utils.d.b()
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "expired"
                com.ss.android.ugc.aweme.im.sdk.utils.z.c(r0, r1, r2, r4)
                goto L_0x0356
            L_0x0327:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                java.lang.String r0 = r0.g
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r1 = r7.f51595c
                java.lang.String r1 = r1.f51586f
                java.lang.CharSequence r2 = com.ss.android.ugc.aweme.im.sdk.utils.d.b()
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "join"
                com.ss.android.ugc.aweme.im.sdk.utils.z.c(r0, r1, r2, r4)
                goto L_0x0356
            L_0x033d:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog r0 = r7.f51595c
                java.lang.String r0 = r0.g
                java.lang.CharSequence r1 = com.ss.android.ugc.aweme.im.sdk.utils.d.b()
                java.lang.String r1 = r1.toString()
                java.lang.CharSequence r2 = com.ss.android.ugc.aweme.im.sdk.utils.d.b()
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "send"
                com.ss.android.ugc.aweme.im.sdk.utils.z.c(r0, r1, r2, r4)
            L_0x0356:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog.e.then(a.i):java.lang.Object");
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51581a, false, 52255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51581a, false, 52255, new Class[0], Void.TYPE);
            return;
        }
        String str = this.l;
        if (str != null) {
            String str2 = this.f51586f;
            if (str2 != null && !com.ss.android.ugc.aweme.im.sdk.utils.d.a(str2)) {
                this.j = 5;
                d();
            }
            r.a(this.l, this.m, this.g, (g<f, Void>) new e<f,Void>(str, this));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f51581a, false, 52258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51581a, false, 52258, new Class[0], Void.TYPE);
        } else if (this.m == 1) {
            com.ss.android.ugc.aweme.im.sdk.d.a a2 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeImManager.instance()");
            com.ss.android.ugc.aweme.im.service.c e2 = a2.e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "AwemeImManager.instance().proxy");
            if (e2.isMainPage()) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_enter_from", 8);
                ChatRoomActivity.a(getContext(), this.g, bundle);
                z.a().a(this.g, "", "group", "command", "");
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.ar_).a();
        } else {
            if (this.m == 4) {
                com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.ar_).a();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("key_enter_from", 8);
                ChatRoomActivity.a(getContext(), this.g, bundle2);
                z.a().a(this.g, "", "group", "invite_card", "");
            }
        }
    }

    public final void b() {
        int i2;
        boolean z;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f51581a, false, 52257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51581a, false, 52257, new Class[0], Void.TYPE);
            return;
        }
        if (this.m == 4) {
            String str = this.g;
            String str2 = this.f51586f;
            Integer num = this.i;
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            z.a(str, str2, i3);
        }
        String str3 = this.f51586f;
        if (str3 != null) {
            int i4 = this.m;
            boolean z2 = true;
            if (i4 == 1) {
                i2 = 2;
            } else if (i4 != 4) {
                i2 = 6;
            } else {
                i2 = 5;
            }
            com.ss.android.ugc.aweme.im.sdk.group.a a2 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a();
            String str4 = this.g;
            String str5 = this.h;
            List listOf = CollectionsKt.listOf(IMUser.fromUser(com.ss.android.ugc.aweme.im.sdk.utils.d.c()));
            Map a3 = com.ss.android.ugc.aweme.im.sdk.group.a.a.f51535b.a(Long.parseLong(str3), i2, this.l);
            com.bytedance.im.core.a.a.c bVar = new b(this);
            List list = listOf;
            String str6 = str5;
            String str7 = str4;
            if (PatchProxy.isSupport(new Object[]{str4, str5, listOf, a3, bVar}, a2, com.ss.android.ugc.aweme.im.sdk.group.a.f51527a, false, 52139, new Class[]{String.class, String.class, List.class, Map.class, com.bytedance.im.core.a.a.c.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.im.sdk.group.a aVar = a2;
                PatchProxy.accessDispatch(new Object[]{str7, str6, list, a3, bVar}, aVar, com.ss.android.ugc.aweme.im.sdk.group.a.f51527a, false, 52139, new Class[]{String.class, String.class, List.class, Map.class, com.bytedance.im.core.a.a.c.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(list, "addMemberList");
                Intrinsics.checkParameterIsNotNull(a3, "map");
                CharSequence charSequence = str7;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    CharSequence charSequence2 = str6;
                    if (!(charSequence2 == null || charSequence2.length() == 0)) {
                        z2 = false;
                    }
                    if (!z2) {
                        new com.bytedance.im.core.d.e(str7).a(Long.parseLong(str6), a2.c(list), a3, new a.d(a2, str7, bVar));
                    }
                }
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f51581a, false, 52260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51581a, false, 52260, new Class[0], Void.TYPE);
            return;
        }
        switch (this.j) {
            case 0:
                DmtTextView dmtTextView = this.p;
                if (dmtTextView != null) {
                    dmtTextView.setAlpha(0.5f);
                    dmtTextView.setEnabled(false);
                    Context context = dmtTextView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    dmtTextView.setText(context.getResources().getString(C0906R.string.asf));
                    break;
                } else {
                    return;
                }
            case 1:
                DmtTextView dmtTextView2 = this.p;
                if (dmtTextView2 != null) {
                    dmtTextView2.setAlpha(1.0f);
                    dmtTextView2.setEnabled(true);
                    Context context2 = dmtTextView2.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    dmtTextView2.setText(context2.getResources().getString(C0906R.string.asd));
                    break;
                } else {
                    return;
                }
            case 2:
                DmtTextView dmtTextView3 = this.p;
                if (dmtTextView3 != null) {
                    dmtTextView3.setAlpha(0.5f);
                    dmtTextView3.setEnabled(false);
                    Context context3 = dmtTextView3.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                    dmtTextView3.setText(context3.getResources().getString(C0906R.string.ase));
                    break;
                } else {
                    return;
                }
            case 3:
                DmtTextView dmtTextView4 = this.p;
                if (dmtTextView4 != null) {
                    dmtTextView4.setAlpha(0.5f);
                    dmtTextView4.setEnabled(false);
                    Context context4 = dmtTextView4.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                    dmtTextView4.setText(context4.getResources().getString(C0906R.string.asc));
                    break;
                } else {
                    return;
                }
            case 4:
                DmtTextView dmtTextView5 = this.p;
                if (dmtTextView5 != null) {
                    dmtTextView5.setAlpha(0.5f);
                    dmtTextView5.setEnabled(false);
                    Context context5 = dmtTextView5.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context5, "context");
                    dmtTextView5.setText(context5.getResources().getString(C0906R.string.asb));
                    break;
                } else {
                    return;
                }
            case 5:
                DmtTextView dmtTextView6 = this.p;
                if (dmtTextView6 != null) {
                    dmtTextView6.setAlpha(1.0f);
                    dmtTextView6.setEnabled(true);
                    Context context6 = dmtTextView6.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context6, "context");
                    dmtTextView6.setText(context6.getResources().getString(C0906R.string.ash));
                    break;
                } else {
                    return;
                }
            case 6:
                DmtTextView dmtTextView7 = this.p;
                if (dmtTextView7 != null) {
                    dmtTextView7.setAlpha(1.0f);
                    dmtTextView7.setEnabled(true);
                    Context context7 = dmtTextView7.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context7, "context");
                    dmtTextView7.setText(context7.getResources().getString(C0906R.string.asg));
                    return;
                }
                break;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
            case 8:
                DmtTextView dmtTextView8 = this.p;
                if (dmtTextView8 != null) {
                    dmtTextView8.setAlpha(0.5f);
                    dmtTextView8.setEnabled(false);
                    Context context8 = dmtTextView8.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context8, "context");
                    dmtTextView8.setText(context8.getResources().getString(C0906R.string.aw5));
                    break;
                } else {
                    return;
                }
        }
    }

    public final int a(Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, f51581a, false, 52259, new Class[]{Integer.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{num}, this, f51581a, false, 52259, new Class[]{Integer.class}, Integer.TYPE)).intValue();
        } else if ((num != null && num.intValue() == 7515) || ((num != null && num.intValue() == 7516) || (num != null && num.intValue() == 7517))) {
            return 2;
        } else {
            if (num != null && num.intValue() == 7519) {
                return 3;
            }
            if (num != null && num.intValue() == 7507) {
                return 4;
            }
            if (num != null && num.intValue() == 7520) {
                return 8;
            }
            if ((num != null && num.intValue() == 7521) || (num != null && num.intValue() == 7522)) {
                return 7;
            }
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0141, code lost:
        if (r2 == null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0161, code lost:
        if (r3 != null) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f51581a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 52251(0xcc1b, float:7.3219E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f51581a
            r3 = 0
            r4 = 52251(0xcc1b, float:7.3219E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.onCreate(r10)
            r9.requestWindowFeature(r7)
            android.view.View r0 = r9.o
            r9.setContentView((android.view.View) r0)
            android.view.Window r0 = r9.getWindow()
            if (r0 == 0) goto L_0x0047
            r1 = -2
            r0.setLayout(r1, r1)
        L_0x0047:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51581a
            r3 = 0
            r4 = 52252(0xcc1c, float:7.322E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51581a
            r3 = 0
            r4 = 52252(0xcc1c, float:7.322E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0083
        L_0x006b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.p
            com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog$c r1 = new com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog$c
            r1.<init>(r9)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.widget.ImageButton r0 = r9.q
            com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog$d r1 = new com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog$d
            r1.<init>(r9)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0083:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51581a
            r3 = 0
            r4 = 52253(0xcc1d, float:7.3222E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51581a
            r3 = 0
            r4 = 52253(0xcc1d, float:7.3222E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00a7:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51581a
            r3 = 0
            r4 = 52254(0xcc1e, float:7.3223E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00cc
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51581a
            r3 = 0
            r4 = 52254(0xcc1e, float:7.3223E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x021b
        L_0x00cc:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.f51583c
            java.lang.String r1 = "mNameTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r2 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131560498(0x7f0d0832, float:1.874637E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.f51585e
            java.lang.String r1 = "mDescriptionTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r2 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131560501(0x7f0d0835, float:1.8746376E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.im.sdk.group.a.c r0 = r9.k
            if (r0 == 0) goto L_0x021b
            java.lang.String r1 = r0.getConversationId()
            r9.g = r1
            java.lang.String r1 = r9.h
            r9.h = r1
            java.lang.String r1 = r0.getFromUserId()
            r9.f51586f = r1
            com.bytedance.im.core.d.d r1 = com.bytedance.im.core.d.d.a()
            java.lang.String r2 = r0.getConversationId()
            com.bytedance.im.core.d.b r1 = r1.a((java.lang.String) r2)
            if (r1 == 0) goto L_0x0143
            com.bytedance.im.core.d.c r2 = r1.getCoreInfo()
            if (r2 == 0) goto L_0x0143
            java.lang.String r2 = r2.getIcon()
            if (r2 == 0) goto L_0x0143
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = r9.f51582b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r3
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r3, (java.lang.String) r2)
            if (r2 != 0) goto L_0x014e
        L_0x0143:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r9.f51582b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r2
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getGroupIcon()
            com.ss.android.ugc.aweme.base.c.b(r2, r3)
        L_0x014e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r9.f51583c
            java.lang.String r3 = "mNameTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            if (r1 == 0) goto L_0x0164
            com.bytedance.im.core.d.c r3 = r1.getCoreInfo()
            if (r3 == 0) goto L_0x0164
            java.lang.String r3 = r3.getName()
            if (r3 == 0) goto L_0x0164
            goto L_0x0168
        L_0x0164:
            java.lang.String r3 = r0.getGroupName()
        L_0x0168:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            if (r1 == 0) goto L_0x01ad
            int r1 = r1.getMemberCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r9.i = r2
            if (r1 <= 0) goto L_0x01ad
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r9.f51584d
            java.lang.String r3 = "mCountTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r2.setVisibility(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r9.f51584d
            java.lang.String r3 = "mCountTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r4 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131560520(0x7f0d0848, float:1.8746415E38)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r8] = r1
            java.lang.String r1 = r3.getString(r4, r5)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
        L_0x01ad:
            java.lang.String r1 = r0.getFromUserId()
            java.lang.CharSequence r2 = com.ss.android.ugc.aweme.im.sdk.utils.d.b()
            java.lang.String r2 = r2.toString()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x01e2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.f51585e
            java.lang.String r1 = "mDescriptionTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r2 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131560509(0x7f0d083d, float:1.8746392E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            r9.j = r8
            goto L_0x0218
        L_0x01e2:
            com.ss.android.ugc.aweme.im.sdk.d.e r1 = com.ss.android.ugc.aweme.im.sdk.d.e.a()
            java.lang.String r0 = r0.getFromUserId()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r1.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0218
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.f51585e
            java.lang.String r2 = "mDescriptionTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r3 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131560512(0x7f0d0840, float:1.8746398E38)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getDisplayName()
            r4[r8] = r0
            java.lang.String r0 = r2.getString(r3, r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x0218:
            r9.d()
        L_0x021b:
            r9.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupInviteDialog(@NotNull Context context, @Nullable String str, int i2) {
        super(context, C0906R.style.sm);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.l = str;
        this.m = i2;
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a4m, null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…roup_invite_dialog, null)");
        this.o = inflate;
    }
}

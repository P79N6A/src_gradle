package com.ss.android.ugc.aweme.im.sdk.d;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.ay;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0007¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0007J&\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0007¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/core/IMContactManager;", "", "()V", "convertToIMConversation", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "conversation", "Lcom/bytedance/im/core/model/Conversation;", "enterPersonalDetail", "", "context", "Landroid/content/Context;", "contact", "enterFrom", "", "getConversationIdFromIMContact", "getConversationIdListFromIMContact", "", "contactArray", "", "([Lcom/ss/android/ugc/aweme/im/service/model/IMContact;)Ljava/util/List;", "manageIMContactAction", "defaultAction", "Lkotlin/Function0;", "openIMContactPageActivity", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51215a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f51216b = new d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ IMContact $contact;
        final /* synthetic */ String $enterFrom;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(IMContact iMContact, String str) {
            super(0);
            this.$contact = iMContact;
            this.$enterFrom = str;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51720, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51720, new Class[0], Void.TYPE);
                return;
            }
            IMUser a2 = e.a(this.$contact);
            if (a2 != null) {
                j.f51270d.c(a2.getUid());
                ay.f52524b.a(a2.getUid());
                z.a().b(a2.getUid(), this.$enterFrom, "click_contact_head");
            }
        }
    }

    private d() {
    }

    @JvmStatic
    @Nullable
    public static final String a(@NotNull IMContact iMContact) {
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{iMContact2}, null, f51215a, true, 51715, new Class[]{IMContact.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iMContact2}, null, f51215a, true, 51715, new Class[]{IMContact.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(iMContact2, "contact");
        if (iMContact2 instanceof IMConversation) {
            return ((IMConversation) iMContact2).getConversationId();
        }
        if (!(iMContact2 instanceof IMUser)) {
            return null;
        }
        String uid = ((IMUser) iMContact2).getUid();
        Intrinsics.checkExpressionValueIsNotNull(uid, "contact.uid");
        return e.a(Long.parseLong(uid));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.String> a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.im.service.model.IMContact[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51215a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact[]> r3 = com.ss.android.ugc.aweme.im.service.model.IMContact[].class
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = 0
            r5 = 1
            r6 = 51714(0xca02, float:7.2467E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f51215a
            r13 = 1
            r14 = 51714(0xca02, float:7.2467E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact[]> r0 = com.ss.android.ugc.aweme.im.service.model.IMContact[].class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0037:
            java.lang.String r1 = "contactArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
        L_0x0042:
            if (r9 >= r2) goto L_0x0071
            r3 = r0[r9]
            boolean r4 = r3 instanceof com.ss.android.ugc.aweme.im.service.model.IMConversation
            if (r4 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.im.service.model.IMConversation r3 = (com.ss.android.ugc.aweme.im.service.model.IMConversation) r3
            java.lang.String r3 = r3.getConversationId()
            r1.add(r3)
            goto L_0x006e
        L_0x0054:
            boolean r4 = r3 instanceof com.ss.android.ugc.aweme.im.service.model.IMUser
            if (r4 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.im.service.model.IMUser r3 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r3
            java.lang.String r3 = r3.getUid()
            java.lang.String r4 = "contact.uid"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            long r3 = java.lang.Long.parseLong(r3)
            java.lang.String r3 = com.bytedance.im.core.d.e.a((long) r3)
            r1.add(r3)
        L_0x006e:
            int r9 = r9 + 1
            goto L_0x0042
        L_0x0071:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.d.d.a(com.ss.android.ugc.aweme.im.service.model.IMContact[]):java.util.List");
    }

    @JvmStatic
    public static final void b(@NotNull Context context, @NotNull IMContact iMContact, @NotNull Function0<Unit> function0) {
        Context context2 = context;
        IMContact iMContact2 = iMContact;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{context2, iMContact2, function02}, null, f51215a, true, 51717, new Class[]{Context.class, IMContact.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, iMContact2, function02}, null, f51215a, true, 51717, new Class[]{Context.class, IMContact.class, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(iMContact2, "contact");
        Intrinsics.checkParameterIsNotNull(function02, "defaultAction");
        if (iMContact2 instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact2;
            if (iMConversation.getConversationType() == d.a.f20887b) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_enter_from", 6);
                ChatRoomActivity.a(context2, iMConversation.getConversationId(), bundle);
                z.a().a(iMConversation.getConversationId(), "", "group", "share_toast", "");
                return;
            }
        }
        function0.invoke();
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @NotNull IMContact iMContact, @NotNull String str) {
        Context context2 = context;
        IMContact iMContact2 = iMContact;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, iMContact2, str2}, null, f51215a, true, 51719, new Class[]{Context.class, IMContact.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, iMContact2, str2}, null, f51215a, true, 51719, new Class[]{Context.class, IMContact.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(iMContact2, "contact");
        Intrinsics.checkParameterIsNotNull(str2, "enterFrom");
        a(context2, iMContact2, (Function0<Unit>) new a<Unit>(iMContact2, str2));
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @NotNull IMContact iMContact, @NotNull Function0<Unit> function0) {
        Context context2 = context;
        IMContact iMContact2 = iMContact;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{context2, iMContact2, function02}, null, f51215a, true, 51716, new Class[]{Context.class, IMContact.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, iMContact2, function02}, null, f51215a, true, 51716, new Class[]{Context.class, IMContact.class, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(iMContact2, "contact");
        Intrinsics.checkParameterIsNotNull(function02, "defaultAction");
        if (!(iMContact2 instanceof IMConversation) || ((IMConversation) iMContact2).getConversationType() != d.a.f20887b) {
            function0.invoke();
        } else {
            com.bytedance.ies.dmt.ui.d.a.c(context2, (int) C0906R.string.azx).a();
        }
    }
}

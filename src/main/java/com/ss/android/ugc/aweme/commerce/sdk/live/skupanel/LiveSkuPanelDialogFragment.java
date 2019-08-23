package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelAdapter;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c;
import com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010'\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0011H\u0016J\u0016\u0010+\u001a\u00020\u00112\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010(\u001a\u00020&H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelDialogFragment;", "Landroid/support/v4/app/DialogFragment;", "()V", "anchorInfo", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getAnchorInfo", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "setAnchorInfo", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "liveRoomDataInfo", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/ILiveRoomDataInfo;", "getLiveRoomDataInfo", "()Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/ILiveRoomDataInfo;", "setLiveRoomDataInfo", "(Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/ILiveRoomDataInfo;)V", "mDialogDismissListener", "Lkotlin/Function0;", "", "mEnterFrom", "", "mPromotionId", "mSkuPanelController", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/LiveSkuPanelController;", "uid", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onResume", "setDialogDismissListener", "dialogDismissListener", "setDialogFullWidth", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class LiveSkuPanelDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37742a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f37743f = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public User f37744b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b f37745c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public b f37746d;

    /* renamed from: e  reason: collision with root package name */
    public Function0<Unit> f37747e;
    private String g;
    private String h;
    private HashMap i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelDialogFragment$Companion;", "", "()V", "ARGS_ENTER_FROM", "", "ARGS_PROMOTION_ID", "KEY_ANCHOR_INFO", "LIVE_GOODS_DIALOG", "REQUEST_CODE_H5_PURCHASE", "", "REQUEST_CODE_SEEDING", "show", "", "dialogFragment", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelDialogFragment;", "anchorInfo", "Lcom/ss/android/ugc/aweme/profile/model/User;", "promotionId", "enterFrom", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37748a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelDialogFragment$onCreateDialog$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveSkuPanelDialogFragment f37750b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Dialog f37751c;

        b(LiveSkuPanelDialogFragment liveSkuPanelDialogFragment, Dialog dialog) {
            this.f37750b = liveSkuPanelDialogFragment;
            this.f37751c = dialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37749a, false, 29285, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37749a, false, 29285, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37750b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J!\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelDialogFragment$onResume$2", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelManager$ISkuUpdateCallback;", "onFailure", "", "onSuccess", "isVirtual", "", "isOverLimit", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class c implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveSkuPanelDialogFragment f37753b;

        public final void a() {
        }

        c(LiveSkuPanelDialogFragment liveSkuPanelDialogFragment) {
            this.f37753b = liveSkuPanelDialogFragment;
        }

        public final void a(@Nullable Boolean bool, @Nullable Boolean bool2) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{bool, bool2}, this, f37752a, false, 29286, new Class[]{Boolean.class, Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool, bool2}, this, f37752a, false, 29286, new Class[]{Boolean.class, Boolean.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b bVar = this.f37753b.f37745c;
            if (bVar != null) {
                if (bool2 != null) {
                    z = bool2.booleanValue();
                } else {
                    z = false;
                }
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, bVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b.f37843a, false, 29311, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, bVar2, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b.f37843a, false, 29311, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    if (bVar.h >= 0 && bVar.h < bVar.g.size() && z) {
                        b bVar3 = bVar.j;
                        if (bVar3 != null) {
                            List b2 = bVar3.b();
                            if (b2 != null) {
                                ak akVar = (ak) b2.get(bVar.h);
                                if (akVar != null) {
                                    akVar.L = Boolean.valueOf(z);
                                }
                            }
                        }
                        SkuPanelAdapter skuPanelAdapter = bVar.f37848f;
                        if (skuPanelAdapter != null) {
                            skuPanelAdapter.notifyItemChanged(bVar.h);
                        }
                    }
                }
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f37742a, false, 29283, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37742a, false, 29283, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f37742a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 29279(0x725f, float:4.1029E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f37742a
            r5 = 0
            r6 = 29279(0x725f, float:4.1029E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            super.onResume()
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b r1 = r12.f37745c
            r2 = 0
            if (r1 == 0) goto L_0x0032
            int r1 = r1.h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0033
        L_0x0032:
            r1 = r2
        L_0x0033:
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.b r3 = r12.f37746d
            if (r3 == 0) goto L_0x003c
            java.util.List r3 = r3.b()
            goto L_0x003d
        L_0x003c:
            r3 = r2
        L_0x003d:
            if (r1 == 0) goto L_0x00af
            r4 = r1
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r5 = kotlin.collections.CollectionsKt.getOrNull(r3, r4)
            com.ss.android.ugc.aweme.commerce.service.models.ak r5 = (com.ss.android.ugc.aweme.commerce.service.models.ak) r5
            if (r5 == 0) goto L_0x0052
            java.lang.Boolean r2 = r5.K
        L_0x0052:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            r5 = 1
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r3.get(r4)
            com.ss.android.ugc.aweme.commerce.service.models.ak r2 = (com.ss.android.ugc.aweme.commerce.service.models.ak) r2
            java.lang.Boolean r2 = r2.L
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r2 == 0) goto L_0x006d
            r2 = 1
            goto L_0x006e
        L_0x006d:
            r2 = 0
        L_0x006e:
            if (r2 != r5) goto L_0x00af
            if (r3 == 0) goto L_0x00af
            int r2 = r1.intValue()
            if (r2 < 0) goto L_0x00af
            int r2 = r1.intValue()
            int r4 = r3.size()
            int r4 = r4 - r5
            if (r2 > r4) goto L_0x00af
            int r2 = r1.intValue()
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.commerce.service.models.ak r2 = (com.ss.android.ugc.aweme.commerce.service.models.ak) r2
            java.lang.String r2 = r2.f38190d
            if (r2 != 0) goto L_0x0093
            java.lang.String r2 = ""
        L_0x0093:
            int r1 = r1.intValue()
            java.lang.Object r1 = r3.get(r1)
            com.ss.android.ugc.aweme.commerce.service.models.ak r1 = (com.ss.android.ugc.aweme.commerce.service.models.ak) r1
            java.lang.String r1 = r1.f38191e
            if (r1 != 0) goto L_0x00a3
            java.lang.String r1 = ""
        L_0x00a3:
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c r3 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.k
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.LiveSkuPanelDialogFragment$c r4 = new com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.LiveSkuPanelDialogFragment$c
            r4.<init>(r12)
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c$b r4 = (com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.b) r4
            r3.a(r2, r1, r4)
        L_0x00af:
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c r1 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.k
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.f37859a
            r8 = 0
            r9 = 29288(0x7268, float:4.1041E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x00d3
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.f37859a
            r8 = 0
            r9 = 29288(0x7268, float:4.1041E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00d3:
            com.ss.android.ugc.aweme.commerce.sdk.live.a.a r1 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.f37864f
            if (r1 == 0) goto L_0x00e0
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.ak> r1 = r1.f37739a
            if (r1 == 0) goto L_0x00e0
            int r1 = r1.size()
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            if (r1 <= 0) goto L_0x0117
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.f37736a
            r5 = 1
            r6 = 29264(0x7250, float:4.1008E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<a.i> r8 = a.i.class
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r1 == 0) goto L_0x0108
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.f37736a
            r5 = 1
            r6 = 29264(0x7250, float:4.1008E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<a.i> r8 = a.i.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            a.i r0 = (a.i) r0
            goto L_0x010e
        L_0x0108:
            com.ss.android.ugc.aweme.commerce.sdk.goods.api.GoodsApi r0 = com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.f37737b
            a.i r0 = r0.getCartCount()
        L_0x010e:
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c$d r1 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.d.f37870b
            a.g r1 = (a.g) r1
            java.util.concurrent.Executor r2 = a.i.f1052b
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.LiveSkuPanelDialogFragment.onResume():void");
    }

    public final void onDismiss(@Nullable DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f37742a, false, 29280, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f37742a, false, 29280, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.f37747e;
        if (function0 != null) {
            function0.invoke();
        }
        this.f37747e = null;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Serializable serializable;
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37742a, false, 29276, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f37742a, false, 29276, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(0, C0906R.style.qv);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_anchor_info");
        } else {
            serializable = null;
        }
        this.f37744b = (User) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("promotion_id");
        } else {
            str = null;
        }
        this.g = str;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("enter_from");
        }
        this.h = str2;
    }

    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        View view;
        List list;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37742a, false, 29278, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f37742a, false, 29278, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkExpressionValueIsNotNull(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        Fragment fragment = this;
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b bVar = new com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b(fragment, context, this.f37744b, this.h, this.f37746d);
        this.f37745c = bVar;
        com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b bVar2 = this.f37745c;
        if (bVar2 != null) {
            b bVar3 = this.f37746d;
            if (bVar3 != null) {
                list = bVar3.b();
            } else {
                list = null;
            }
            String str = this.g;
            if (PatchProxy.isSupport(new Object[]{list, str}, bVar2, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b.f37843a, false, 29310, new Class[]{List.class, String.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b bVar4 = bVar2;
                PatchProxy.accessDispatch(new Object[]{list, str}, bVar4, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b.f37843a, false, 29310, new Class[]{List.class, String.class}, Void.TYPE);
            } else {
                bVar2.g.clear();
                if (list == null || list.isEmpty()) {
                    SkuPanelAdapter skuPanelAdapter = bVar2.f37848f;
                    if (skuPanelAdapter != null) {
                        skuPanelAdapter.notifyDataSetChanged();
                    }
                    View a2 = bVar2.a();
                    if (a2 != null) {
                        a2.setVisibility(8);
                    }
                    i2 = 0;
                } else {
                    Collection collection = list;
                    bVar2.g.addAll(collection);
                    int size = bVar2.g.size();
                    i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            i2 = 0;
                            break;
                        } else if (TextUtils.equals(bVar2.g.get(i2).f38190d, str)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    SkuPanelAdapter skuPanelAdapter2 = bVar2.f37848f;
                    if (skuPanelAdapter2 != null) {
                        if (PatchProxy.isSupport(new Object[]{list}, skuPanelAdapter2, SkuPanelAdapter.f37758a, false, 29336, new Class[]{List.class}, Void.TYPE)) {
                            SkuPanelAdapter skuPanelAdapter3 = skuPanelAdapter2;
                            PatchProxy.accessDispatch(new Object[]{list}, skuPanelAdapter3, SkuPanelAdapter.f37758a, false, 29336, new Class[]{List.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(list, "goodsList");
                            skuPanelAdapter2.f37760b.clear();
                            skuPanelAdapter2.f37760b.addAll(collection);
                        }
                        SkuPanelAdapter.b bVar5 = bVar2;
                        if (PatchProxy.isSupport(new Object[]{bVar5}, skuPanelAdapter2, SkuPanelAdapter.f37758a, false, 29328, new Class[]{SkuPanelAdapter.b.class}, Void.TYPE)) {
                            SkuPanelAdapter skuPanelAdapter4 = skuPanelAdapter2;
                            PatchProxy.accessDispatch(new Object[]{bVar5}, skuPanelAdapter4, SkuPanelAdapter.f37758a, false, 29328, new Class[]{SkuPanelAdapter.b.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(bVar5, "skuPanelItemHandler");
                            skuPanelAdapter2.f37761c = bVar5;
                        }
                        skuPanelAdapter2.notifyDataSetChanged();
                    }
                    RecyclerView recyclerView = bVar2.f37846d;
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(i2);
                    }
                    View a3 = bVar2.a();
                    if (a3 != null) {
                        a3.setVisibility(0);
                    }
                }
                if (bVar2.g.size() > 0 && i2 < bVar2.g.size()) {
                    bVar2.h = i2;
                    b bVar6 = bVar2.j;
                    if (bVar6 != null) {
                        a.f37755b.a(null, "pop_up_card", bVar6.a(), null, bVar2.g.get(i2).f38190d, bVar2.g.get(i2).j, bVar2.i, bVar6.c(), bVar2.g.get(i2).H, bVar2.g.get(i2).I, bVar2.g.get(i2).J, "click_transform_card");
                    }
                }
            }
        }
        com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b bVar7 = this.f37745c;
        if (bVar7 != null) {
            view = bVar7.f37845c;
        } else {
            view = null;
        }
        if (view != null) {
            onCreateDialog.setContentView(view);
            if (PatchProxy.isSupport(new Object[]{onCreateDialog}, this, f37742a, false, 29277, new Class[]{Dialog.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{onCreateDialog}, this, f37742a, false, 29277, new Class[]{Dialog.class}, Void.TYPE);
            } else {
                Window window = onCreateDialog.getWindow();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = -1;
                    attributes.height = -2;
                    window.setAttributes(attributes);
                    window.setGravity(80);
                    window.getDecorView().setPadding(0, 0, 0, 0);
                    window.setBackgroundDrawableResource(17170445);
                }
            }
            view.setOnClickListener(new b(this, onCreateDialog));
        }
        return onCreateDialog;
    }

    public final void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f37742a, false, 29281, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f37742a, false, 29281, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 2 && intent2 != null && intent2.hasExtra("key_appointment_status")) {
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b bVar = this.f37745c;
            if (bVar != null) {
                boolean booleanExtra = intent2.getBooleanExtra("key_appointment_status", false);
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanExtra ? (byte) 1 : 0)}, bVar, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b.f37843a, false, 29312, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanExtra)}, bVar2, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.b.f37843a, false, 29312, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    if (bVar.h >= 0 && bVar.h < bVar.g.size()) {
                        b bVar3 = bVar.j;
                        if (bVar3 != null) {
                            List b2 = bVar3.b();
                            if (b2 != null) {
                                ak akVar = (ak) b2.get(bVar.h);
                                if (akVar != null) {
                                    PromotionAppointment promotionAppointment = akVar.v;
                                    if (promotionAppointment != null) {
                                        promotionAppointment.setAppointment(booleanExtra);
                                    }
                                }
                            }
                        }
                        SkuPanelAdapter skuPanelAdapter = bVar.f37848f;
                        if (skuPanelAdapter != null) {
                            skuPanelAdapter.notifyItemChanged(bVar.h, "updateAppointmentStatus");
                        }
                    }
                }
            }
        }
    }
}

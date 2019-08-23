package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10955a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkDialog f10956b;

    /* renamed from: c  reason: collision with root package name */
    private final InteractDialogFragmentBaseContract.View f10957c;

    g(LinkDialog linkDialog, InteractDialogFragmentBaseContract.View view) {
        this.f10956b = linkDialog;
        this.f10957c = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b0, code lost:
        if (r1 != null) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f10955a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 4337(0x10f1, float:6.077E-42)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f10955a
            r3 = 0
            r4 = 4337(0x10f1, float:6.077E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0027:
            com.bytedance.android.livesdk.chatroom.interact.LinkDialog r0 = r7.f10956b
            com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View r1 = r7.f10957c
            r0.e()
            android.support.v4.app.FragmentManager r2 = r0.getChildFragmentManager()
            android.support.v4.app.FragmentTransaction r3 = r2.beginTransaction()
            java.util.Stack<com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View> r4 = r0.i
            boolean r4 = r4.empty()
            if (r4 != 0) goto L_0x0047
            r4 = 2130968744(0x7f0400a8, float:1.754615E38)
            r5 = 2130968743(0x7f0400a7, float:1.7546148E38)
            r3.setCustomAnimations(r5, r4, r5, r4)
        L_0x0047:
            r4 = 2131166894(0x7f0706ae, float:1.7948046E38)
            if (r1 == 0) goto L_0x005a
            r3.add((int) r4, (android.support.v4.app.Fragment) r1)
            java.lang.String r2 = "link_dialog"
            r3.addToBackStack(r2)
            java.util.Stack<com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View> r2 = r0.i
            r2.add(r1)
            goto L_0x006b
        L_0x005a:
            r2.popBackStack()
            android.support.v4.app.Fragment r2 = r2.findFragmentById(r4)
            if (r2 == 0) goto L_0x0066
            r3.remove(r2)
        L_0x0066:
            java.util.Stack<com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View> r2 = r0.i
            r2.pop()
        L_0x006b:
            r3.commitAllowingStateLoss()
            r2 = 1
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.bytedance.android.livesdk.chatroom.interact.LinkDialog.f10229a
            r12 = 0
            r13 = 4328(0x10e8, float:6.065E-42)
            java.lang.Class[] r14 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View> r3 = com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.View.class
            r14[r8] = r3
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r3 == 0) goto L_0x009e
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.bytedance.android.livesdk.chatroom.interact.LinkDialog.f10229a
            r11 = 0
            r12 = 4328(0x10e8, float:6.065E-42)
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View> r1 = com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.View.class
            r13[r8] = r1
            java.lang.Class r14 = java.lang.Void.TYPE
            r8 = r3
            r9 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x009e:
            if (r1 != 0) goto L_0x00b2
            java.util.Stack<com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View> r1 = r0.i
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x010c
            java.util.Stack<com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View> r1 = r0.i
            java.lang.Object r1 = r1.peek()
            com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View r1 = (com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.View) r1
            if (r1 == 0) goto L_0x010c
        L_0x00b2:
            float r1 = r1.d()
            int r1 = com.bytedance.android.live.core.utils.ac.a((float) r1)
            android.view.ViewGroup r3 = r0.f10231c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            java.util.Stack<com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View> r4 = r0.i
            boolean r4 = r4.empty()
            if (r4 != 0) goto L_0x0100
            int r4 = r3.height
            android.animation.ValueAnimator r5 = r0.k
            if (r5 == 0) goto L_0x00dd
            android.animation.ValueAnimator r5 = r0.k
            r5.removeAllUpdateListeners()
            android.animation.ValueAnimator r5 = r0.k
            r5.removeAllListeners()
            android.animation.ValueAnimator r5 = r0.k
            r5.cancel()
        L_0x00dd:
            r5 = 2
            int[] r5 = new int[r5]
            r5[r8] = r4
            r5[r2] = r1
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r5)
            r0.k = r1
            android.animation.ValueAnimator r1 = r0.k
            com.bytedance.android.livesdk.chatroom.interact.h r2 = new com.bytedance.android.livesdk.chatroom.interact.h
            r2.<init>(r0, r3)
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r1 = r0.k
            r4 = 300(0x12c, double:1.48E-321)
            android.animation.ValueAnimator r1 = r1.setDuration(r4)
            r1.start()
            goto L_0x0107
        L_0x0100:
            r3.height = r1
            android.view.ViewGroup r1 = r0.f10231c
            r1.setLayoutParams(r3)
        L_0x0107:
            android.view.ViewGroup r0 = r0.f10231c
            r0.setLayoutParams(r3)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.g.run():void");
    }
}

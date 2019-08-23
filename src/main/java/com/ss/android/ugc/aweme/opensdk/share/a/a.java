package com.ss.android.ugc.aweme.opensdk.share.a;

import android.app.Activity;
import android.app.Dialog;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import javax.annotation.Nonnull;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58379a;

    /* renamed from: b  reason: collision with root package name */
    public C0657a f58380b;

    /* renamed from: c  reason: collision with root package name */
    private String f58381c;

    /* renamed from: d  reason: collision with root package name */
    private String f58382d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f58383e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f58384f;
    private DmtTextView g;
    private RelativeLayout h;
    private RelativeLayout i;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.a.a$a  reason: collision with other inner class name */
    public interface C0657a {
        void a();

        void b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 63460(0xf7e4, float:8.8926E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            r3 = 0
            r4 = 63460(0xf7e4, float:8.8926E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.onCreate(r13)
            r0 = 2131689883(0x7f0f019b, float:1.9008794E38)
            r12.setContentView(r0)
            java.lang.String r0 = r12.f58381c
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -2076320574(0xffffffff843ddcc2, float:-2.231821E-36)
            if (r2 == r3) goto L_0x0066
            r3 = -1846572353(0xffffffff91ef8abf, float:-3.779306E-28)
            if (r2 == r3) goto L_0x005c
            r3 = -1397149946(0xffffffffacb92f06, float:-5.263237E-12)
            if (r2 == r3) goto L_0x0052
            goto L_0x0070
        L_0x0052:
            java.lang.String r2 = "share saved"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0071
        L_0x005c:
            java.lang.String r2 = "share fail"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0070
            r0 = 2
            goto L_0x0071
        L_0x0066:
            java.lang.String r2 = "share success"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0070
            r0 = 0
            goto L_0x0071
        L_0x0070:
            r0 = -1
        L_0x0071:
            r7 = 2130839231(0x7f0206bf, float:1.7283467E38)
            r10 = 2131169923(0x7f071283, float:1.795419E38)
            r11 = 2131169921(0x7f071281, float:1.7954186E38)
            switch(r0) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00a2;
                default: goto L_0x007d;
            }
        L_0x007d:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            r3 = 0
            r4 = 63462(0xf7e6, float:8.8929E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0127
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            r3 = 0
            r4 = 63462(0xf7e6, float:8.8929E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0147
        L_0x00a2:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            r3 = 0
            r4 = 63463(0xf7e7, float:8.893E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00c7
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            r3 = 0
            r4 = 63463(0xf7e7, float:8.893E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0147
        L_0x00c7:
            android.view.View r0 = r12.findViewById(r11)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.f58383e = r0
            android.view.View r0 = r12.findViewById(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r12.f58384f = r0
            android.widget.ImageView r0 = r12.f58383e
            r0.setImageResource(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r12.f58384f
            r1 = 2131562904(0x7f0d1198, float:1.875125E38)
            r0.setText(r1)
            goto L_0x0147
        L_0x00e5:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            r3 = 0
            r4 = 63461(0xf7e5, float:8.8928E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0109
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            r3 = 0
            r4 = 63461(0xf7e5, float:8.8928E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0147
        L_0x0109:
            android.view.View r0 = r12.findViewById(r11)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.f58383e = r0
            android.view.View r0 = r12.findViewById(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r12.f58384f = r0
            android.widget.ImageView r0 = r12.f58383e
            r0.setImageResource(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r12.f58384f
            r1 = 2131562905(0x7f0d1199, float:1.8751252E38)
            r0.setText(r1)
            goto L_0x0147
        L_0x0127:
            android.view.View r0 = r12.findViewById(r11)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.f58383e = r0
            android.view.View r0 = r12.findViewById(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r12.f58384f = r0
            android.widget.ImageView r0 = r12.f58383e
            r1 = 2130839227(0x7f0206bb, float:1.7283459E38)
            r0.setImageResource(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r12.f58384f
            r1 = 2131562903(0x7f0d1197, float:1.8751248E38)
            r0.setText(r1)
        L_0x0147:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            r3 = 0
            r4 = 63464(0xf7e8, float:8.8932E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x016b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f58379a
            r3 = 0
            r4 = 63464(0xf7e8, float:8.8932E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0190
        L_0x016b:
            r0 = 2131169919(0x7f07127f, float:1.7954182E38)
            android.view.View r0 = r12.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r12.g = r0
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r12.g
            android.content.Context r1 = r12.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131562902(0x7f0d1196, float:1.8751246E38)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r4 = r12.f58382d
            r3[r9] = r4
            java.lang.String r1 = r1.getString(r2, r3)
            r0.setText(r1)
        L_0x0190:
            r0 = 2131169918(0x7f07127e, float:1.795418E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r12.h = r0
            r0 = 2131169922(0x7f071282, float:1.7954188E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r12.i = r0
            android.widget.RelativeLayout r0 = r12.h
            com.ss.android.ugc.aweme.opensdk.share.a.a$1 r1 = new com.ss.android.ugc.aweme.opensdk.share.a.a$1
            r1.<init>()
            r0.setOnClickListener(r1)
            android.widget.RelativeLayout r0 = r12.i
            com.ss.android.ugc.aweme.opensdk.share.a.a$2 r1 = new com.ss.android.ugc.aweme.opensdk.share.a.a$2
            r1.<init>()
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.opensdk.share.a.a.onCreate(android.os.Bundle):void");
    }

    public a(Activity activity, @Nonnull String str, String str2, C0657a aVar) {
        super(activity, C0906R.style.tx);
        this.f58382d = str;
        this.f58381c = str2;
        this.f58380b = aVar;
    }
}

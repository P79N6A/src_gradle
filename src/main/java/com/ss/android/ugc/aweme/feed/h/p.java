package com.ss.android.ugc.aweme.feed.h;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class p extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45518a;

    /* renamed from: b  reason: collision with root package name */
    private Aweme f45519b;

    /* renamed from: c  reason: collision with root package name */
    private int f45520c;
    private Context g;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (r0 == 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        com.bytedance.ies.dmt.ui.d.a.a(r9.g, r0).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        com.ss.android.ugc.aweme.utils.bg.a(new com.ss.android.ugc.aweme.feed.f.ad((com.ss.android.ugc.aweme.feed.model.PrivateUrlModel) r9.f2978e.getData(), r9.f45519b, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f45518a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 42055(0xa447, float:5.8932E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f45518a
            r5 = 0
            r6 = 42055(0xa447, float:5.8932E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.b()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f45519b
            if (r1 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f45519b
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r1 = r1.getStatus()
            int r2 = r9.f45520c
            r1.setPrivateStatus(r2)
            int r1 = r9.f45520c
            switch(r1) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0044;
                case 2: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            r1 = 0
            goto L_0x0050
        L_0x003e:
            r0 = 2131562335(0x7f0d0f5f, float:1.8750096E38)
            r1 = 11
            goto L_0x0050
        L_0x0044:
            r0 = 2131561840(0x7f0d0d70, float:1.8749092E38)
            r1 = 1
            goto L_0x0050
        L_0x0049:
            r1 = 2131561906(0x7f0d0db2, float:1.8749226E38)
            r0 = 2131561906(0x7f0d0db2, float:1.8749226E38)
            goto L_0x003c
        L_0x0050:
            if (r0 == 0) goto L_0x005b
            android.content.Context r2 = r9.g
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r2, (int) r0)
            r0.a()
        L_0x005b:
            com.ss.android.ugc.aweme.feed.f.ad r0 = new com.ss.android.ugc.aweme.feed.f.ad
            com.ss.android.ugc.aweme.common.a r2 = r9.f2978e
            java.lang.Object r2 = r2.getData()
            com.ss.android.ugc.aweme.feed.model.PrivateUrlModel r2 = (com.ss.android.ugc.aweme.feed.model.PrivateUrlModel) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f45519b
            r0.<init>(r2, r3, r1)
            com.ss.android.ugc.aweme.utils.bg.a(r0)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.h.p.b():void");
    }

    public p(Context context) {
        this.g = context;
    }

    public void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f45518a, false, 42056, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f45518a, false, 42056, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (exc2 instanceof a) {
            a aVar = (a) exc2;
            if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                com.bytedance.ies.dmt.ui.d.a.b(this.g, aVar.getErrorMsg()).a();
                return;
            }
        }
        super.a(exc);
    }

    public final void a(Aweme aweme, int i) {
        this.f45519b = aweme;
        this.f45520c = i;
    }
}

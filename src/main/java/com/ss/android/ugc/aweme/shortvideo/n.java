package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.story.widget.TabHost;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68782a;

    private static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f68782a, true, 73916, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f68782a, true, 73916, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.v.b() && a.u.a()) {
            z = true;
        }
        return z;
    }

    private void a(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, TabHost tabHost) {
        ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment2 = shortVideoRecordingOperationPanelFragment;
        TabHost tabHost2 = tabHost;
        if (PatchProxy.isSupport(new Object[]{shortVideoRecordingOperationPanelFragment2, tabHost2}, this, f68782a, false, 73913, new Class[]{ShortVideoRecordingOperationPanelFragment.class, TabHost.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shortVideoRecordingOperationPanelFragment2, tabHost2}, this, f68782a, false, 73913, new Class[]{ShortVideoRecordingOperationPanelFragment.class, TabHost.class}, Void.TYPE);
            return;
        }
        tabHost2.setOnIndexChangedListener(new p(tabHost2, shortVideoRecordingOperationPanelFragment2));
    }

    /* access modifiers changed from: package-private */
    public boolean a(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, fh fhVar) {
        ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment2 = shortVideoRecordingOperationPanelFragment;
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{shortVideoRecordingOperationPanelFragment2, fhVar2}, this, f68782a, false, 73915, new Class[]{ShortVideoRecordingOperationPanelFragment.class, fh.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shortVideoRecordingOperationPanelFragment2, fhVar2}, this, f68782a, false, 73915, new Class[]{ShortVideoRecordingOperationPanelFragment.class, fh.class}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.b()) {
            if (!a() || fhVar.b() || fhVar.c() || !"direct_shoot".equals(fhVar2.r)) {
                return false;
            }
            return true;
        } else if (!"direct_shoot".equals(fhVar2.r) || !shortVideoRecordingOperationPanelFragment2.S.a()) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0168, code lost:
        r0 = com.ss.android.ugc.aweme.C0906R.string.bww;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0174, code lost:
        if (r9.V != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0176, code lost:
        r0 = r24.getContext().getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x019c, code lost:
        if (com.ss.android.g.a.b() != false) goto L_0x01a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment r23, com.ss.android.ugc.aweme.story.widget.TabHost r24) {
        /*
            r22 = this;
            r7 = r23
            r8 = r24
            r22.<init>()
            android.support.v4.app.FragmentActivity r0 = r23.getActivity()
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r0
            com.ss.android.ugc.aweme.shortvideo.fh r9 = r0.f65401b
            int r0 = r9.f67719b
            r1 = 2
            if (r0 != r1) goto L_0x0025
            com.ss.android.ugc.aweme.shortvideo.model.RecordScene r0 = com.ss.android.ugc.aweme.shortvideo.d.a.b()
            int r0 = r0.shootMode
            goto L_0x0026
        L_0x0025:
            r0 = -1
        L_0x0026:
            int r2 = r9.f67719b
            r10 = 1
            if (r2 != r10) goto L_0x002d
            int r0 = r9.N
        L_0x002d:
            r11 = r0
            boolean r0 = com.ss.android.g.a.b()
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.shortvideo.record.k r0 = new com.ss.android.ugc.aweme.shortvideo.record.k
            r0.<init>(r8, r9)
        L_0x0039:
            r6 = r22
            r5 = r0
            goto L_0x0043
        L_0x003d:
            com.ss.android.ugc.aweme.shortvideo.record.e r0 = new com.ss.android.ugc.aweme.shortvideo.record.e
            r0.<init>(r8, r9)
            goto L_0x0039
        L_0x0043:
            boolean r0 = r6.a((com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment) r7, (com.ss.android.ugc.aweme.shortvideo.fh) r9)
            int r4 = r24.getCurrentIndex()
            boolean r2 = com.ss.android.ugc.aweme.i18n.c.a()
            r19 = 0
            if (r2 != 0) goto L_0x005f
            com.ss.android.ugc.aweme.property.a r2 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r3 = com.ss.android.ugc.aweme.property.a.C0682a.LiveMvTabOrder
            int r2 = r2.b(r3)
            if (r2 != r10) goto L_0x005f
            r3 = 1
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            r5.a(r0, r3)
            if (r0 != 0) goto L_0x00f5
            r0 = 5
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r19] = r9
            r12[r10] = r8
            r12[r1] = r5
            r2 = 3
            r12[r2] = r7
            java.lang.Byte r13 = java.lang.Byte.valueOf(r3)
            r20 = 4
            r12[r20] = r13
            com.meituan.robust.ChangeQuickRedirect r14 = f68782a
            r15 = 0
            r16 = 73914(0x120ba, float:1.03576E-40)
            java.lang.Class[] r13 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.fh> r17 = com.ss.android.ugc.aweme.shortvideo.fh.class
            r13[r19] = r17
            java.lang.Class<com.ss.android.ugc.aweme.story.widget.TabHost> r17 = com.ss.android.ugc.aweme.story.widget.TabHost.class
            r13[r10] = r17
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.record.m> r17 = com.ss.android.ugc.aweme.shortvideo.record.m.class
            r13[r1] = r17
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment> r17 = com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment.class
            r13[r2] = r17
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r13[r20] = r17
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r13
            r13 = r22
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r12 == 0) goto L_0x00d7
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r19] = r9
            r12[r10] = r8
            r12[r1] = r5
            r12[r2] = r7
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r12[r20] = r3
            com.meituan.robust.ChangeQuickRedirect r14 = f68782a
            r15 = 0
            r16 = 73914(0x120ba, float:1.03576E-40)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.fh> r3 = com.ss.android.ugc.aweme.shortvideo.fh.class
            r0[r19] = r3
            java.lang.Class<com.ss.android.ugc.aweme.story.widget.TabHost> r3 = com.ss.android.ugc.aweme.story.widget.TabHost.class
            r0[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.record.m> r3 = com.ss.android.ugc.aweme.shortvideo.record.m.class
            r0[r1] = r3
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment> r1 = com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment.class
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r20] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r22
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00f5
        L_0x00d7:
            com.ss.android.ugc.aweme.shortvideo.LiveSettingApi$API r0 = com.ss.android.ugc.aweme.shortvideo.LiveSettingApi.f65350a
            a.i r12 = r0.getLivePodCast()
            com.ss.android.ugc.aweme.shortvideo.q r13 = new com.ss.android.ugc.aweme.shortvideo.q
            r0 = r13
            r1 = r22
            r2 = r24
            r14 = r3
            r3 = r23
            r15 = r4
            r4 = r9
            r21 = r5
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.concurrent.Executor r0 = a.i.f1052b
            r12.a((a.g<TResult, TContinuationResult>) r13, (java.util.concurrent.Executor) r0)
            goto L_0x00f8
        L_0x00f5:
            r15 = r4
            r21 = r5
        L_0x00f8:
            boolean r0 = r9.ao
            if (r0 == 0) goto L_0x010d
            android.content.Context r0 = r24.getContext()
            r1 = 2131562046(0x7f0d0e3e, float:1.874951E38)
            java.lang.String r0 = r0.getString(r1)
            r1 = r0
            r4 = r15
        L_0x0109:
            r0 = r21
            goto L_0x01ab
        L_0x010d:
            com.ss.android.ugc.aweme.shortvideo.aj r0 = com.ss.android.ugc.aweme.shortvideo.aj.f65581d
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x018e
            com.ss.android.ugc.aweme.shortvideo.aj r0 = com.ss.android.ugc.aweme.shortvideo.aj.f65581d
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x017f
            r0 = 2131562040(0x7f0d0e38, float:1.8749498E38)
            r1 = 2131562039(0x7f0d0e37, float:1.8749496E38)
            switch(r11) {
                case 10: goto L_0x0167;
                case 11: goto L_0x0165;
                default: goto L_0x0126;
            }
        L_0x0126:
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r12[r19] = r9
            com.meituan.robust.ChangeQuickRedirect r14 = f68782a
            r2 = 0
            r16 = 73912(0x120b8, float:1.03573E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.fh> r4 = com.ss.android.ugc.aweme.shortvideo.fh.class
            r3[r19] = r4
            java.lang.Class r18 = java.lang.Integer.TYPE
            r13 = r22
            r4 = r15
            r15 = r2
            r17 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x016c
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r12[r19] = r9
            com.meituan.robust.ChangeQuickRedirect r14 = f68782a
            r15 = 0
            r16 = 73912(0x120b8, float:1.03573E-40)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.fh> r1 = com.ss.android.ugc.aweme.shortvideo.fh.class
            r0[r19] = r1
            java.lang.Class r18 = java.lang.Integer.TYPE
            r13 = r22
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0176
        L_0x0165:
            r4 = r15
            goto L_0x0176
        L_0x0167:
            r4 = r15
        L_0x0168:
            r0 = 2131562039(0x7f0d0e37, float:1.8749496E38)
            goto L_0x0176
        L_0x016c:
            boolean r2 = com.ss.android.g.a.b()
            if (r2 == 0) goto L_0x0168
            boolean r2 = r9.V
            if (r2 == 0) goto L_0x0168
        L_0x0176:
            android.content.Context r1 = r24.getContext()
            java.lang.String r0 = r1.getString(r0)
            goto L_0x018b
        L_0x017f:
            r4 = r15
            android.content.Context r0 = r24.getContext()
            r1 = 2131562041(0x7f0d0e39, float:1.87495E38)
            java.lang.String r0 = r0.getString(r1)
        L_0x018b:
            r1 = r0
            goto L_0x0109
        L_0x018e:
            r4 = r15
            r0 = 2131562050(0x7f0d0e42, float:1.8749518E38)
            r1 = 2131562037(0x7f0d0e35, float:1.8749491E38)
            switch(r11) {
                case 0: goto L_0x019f;
                case 1: goto L_0x01a2;
                default: goto L_0x0198;
            }
        L_0x0198:
            boolean r2 = com.ss.android.g.a.b()
            if (r2 == 0) goto L_0x019f
            goto L_0x01a2
        L_0x019f:
            r0 = 2131562037(0x7f0d0e35, float:1.8749491E38)
        L_0x01a2:
            android.content.Context r1 = r24.getContext()
            java.lang.String r0 = r1.getString(r0)
            goto L_0x018b
        L_0x01ab:
            int r0 = r0.a((java.lang.String) r1)
            boolean r2 = com.ss.android.g.a.b()
            if (r2 == 0) goto L_0x01be
            boolean r2 = r9.ao
            if (r2 == 0) goto L_0x01be
            r22.a((com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment) r23, (com.ss.android.ugc.aweme.story.widget.TabHost) r24)
            r19 = 1
        L_0x01be:
            r8.setIndexWithoutAnim(r0)
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r0 = new com.ss.android.ugc.aweme.shortvideo.SafeHandler
            r0.<init>(r7)
            com.ss.android.ugc.aweme.shortvideo.o r2 = new com.ss.android.ugc.aweme.shortvideo.o
            r2.<init>(r1, r4, r7, r8)
            r0.post(r2)
            if (r19 != 0) goto L_0x01d3
            r22.a((com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment) r23, (com.ss.android.ugc.aweme.story.widget.TabHost) r24)
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.n.<init>(com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment, com.ss.android.ugc.aweme.story.widget.TabHost):void");
    }
}

package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.a.c;
import com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage;

public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f60212b;

    /* renamed from: c  reason: collision with root package name */
    protected h f60213c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f60214d;

    public abstract TransferImage a(int i);

    public abstract void a(TransferImage transferImage, int i);

    public abstract void b(int i);

    public abstract TransferImage c(int i);

    private int a() {
        if (PatchProxy.isSupport(new Object[0], this, f60212b, false, 65479, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60212b, false, 65479, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return this.f60214d.getResources().getDimensionPixelSize(((Integer) cls.getField("status_bar_height").get(cls.newInstance())).intValue());
        } catch (Exception unused) {
            return 0;
        }
    }

    i(h hVar) {
        this.f60213c = hVar;
        this.f60214d = hVar.getContext();
    }

    public final int d(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60212b, false, 65478, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return i - a();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60212b, false, 65478, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x016a  */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage a(android.widget.ImageView r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f60212b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.widget.ImageView> r1 = android.widget.ImageView.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage> r6 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.class
            r3 = 0
            r4 = 65481(0xffc9, float:9.1758E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f60212b
            r3 = 0
            r4 = 65481(0xffc9, float:9.1758E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.widget.ImageView> r1 = android.widget.ImageView.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage> r6 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = (com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage) r0
            return r0
        L_0x003b:
            com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = r7.f60213c
            com.ss.android.ugc.aweme.poi.preview.transfer.g r6 = r0.getTransConfig()
            r5 = 2
            int[] r0 = new int[r5]
            r0 = {0, 0} // fill-array
            boolean r1 = r6.A
            if (r1 != 0) goto L_0x0083
            boolean r1 = r6.d()
            if (r1 == 0) goto L_0x0085
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.preview.transfer.g.f60179a
            r14 = 0
            r15 = 65451(0xffab, float:9.1716E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<int[]> r17 = int[].class
            r12 = r6
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x007c
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.preview.transfer.g.f60179a
            r14 = 0
            r15 = 65451(0xffab, float:9.1716E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<int[]> r17 = int[].class
            r12 = r6
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            int[] r0 = (int[]) r0
            goto L_0x0083
        L_0x007c:
            int[] r0 = new int[r5]
            android.support.v4.view.ViewPager r1 = r6.v
            r1.getLocationInWindow(r0)
        L_0x0083:
            r15 = r6
            goto L_0x00c5
        L_0x0085:
            if (r8 == 0) goto L_0x0083
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f60212b
            r3 = 0
            r4 = 65480(0xffc8, float:9.1757E-41)
            java.lang.Class[] r11 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r11[r10] = r1
            java.lang.Class<int[]> r12 = int[].class
            r1 = r18
            r13 = 2
            r5 = r11
            r15 = r6
            r6 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00c0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f60212b
            r3 = 0
            r4 = 65480(0xffc8, float:9.1757E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<int[]> r6 = int[].class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            int[] r0 = (int[]) r0
            goto L_0x00c5
        L_0x00c0:
            int[] r0 = new int[r13]
            r8.getLocationInWindow(r0)
        L_0x00c5:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r1 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage
            android.content.Context r2 = r7.f60214d
            r1.<init>(r2)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r2)
            boolean r2 = r15.A
            if (r2 != 0) goto L_0x016a
            boolean r2 = r15.d()
            if (r2 == 0) goto L_0x0153
            r2 = r0[r10]
            r0 = r0[r9]
            int r0 = r7.d(r0)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.preview.transfer.g.f60179a
            r14 = 0
            r3 = 65452(0xffac, float:9.1718E-41)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r15
            r5 = r15
            r15 = r3
            r16 = r4
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x0114
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.preview.transfer.g.f60179a
            r14 = 0
            r15 = 65452(0xffac, float:9.1718E-41)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r5
            r16 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x011a
        L_0x0114:
            android.support.v4.view.ViewPager r3 = r5.v
            int r3 = r3.getWidth()
        L_0x011a:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.preview.transfer.g.f60179a
            r14 = 0
            r15 = 65453(0xffad, float:9.1719E-41)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r5
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0149
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.preview.transfer.g.f60179a
            r14 = 0
            r15 = 65453(0xffad, float:9.1719E-41)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r5
            r16 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x014f
        L_0x0149:
            android.support.v4.view.ViewPager r4 = r5.v
            int r4 = r4.getHeight()
        L_0x014f:
            r1.a(r2, r0, r3, r4)
            goto L_0x0176
        L_0x0153:
            r5 = r15
            if (r8 == 0) goto L_0x016b
            r2 = r0[r10]
            r0 = r0[r9]
            int r0 = r7.d(r0)
            int r3 = r19.getWidth()
            int r4 = r19.getHeight()
            r1.a(r2, r0, r3, r4)
            goto L_0x0176
        L_0x016a:
            r5 = r15
        L_0x016b:
            r2 = r0[r10]
            r0 = r0[r9]
            int r0 = r7.d(r0)
            r1.a(r2, r0, r10, r10)
        L_0x0176:
            int r0 = r5.f60184f
            r1.setBackgroundColor(r0)
            long r2 = r5.g
            r1.setDuration(r2)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r0.<init>(r2, r2)
            r1.setLayoutParams(r0)
            com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = r7.f60213c
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$b r0 = r0.getTransListener()
            r1.setOnTransferListener(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.preview.transfer.i.a(android.widget.ImageView):com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage");
    }

    private void b(String str, TransferImage transferImage, boolean z) {
        String str2 = str;
        TransferImage transferImage2 = transferImage;
        if (PatchProxy.isSupport(new Object[]{str2, transferImage2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60212b, false, 65483, new Class[]{String.class, TransferImage.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, transferImage2, Byte.valueOf(z)}, this, f60212b, false, 65483, new Class[]{String.class, TransferImage.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        g transConfig = this.f60213c.getTransConfig();
        Drawable a2 = transConfig.r.a(str, transConfig);
        if (a2 == null) {
            transferImage2.setImageDrawable(transConfig.a(this.f60214d));
        } else {
            transferImage2.setImageDrawable(a2);
        }
        if (z) {
            transferImage.e();
        } else {
            transferImage.f();
        }
    }

    public final void a(String str, TransferImage transferImage, boolean z) {
        String str2 = str;
        TransferImage transferImage2 = transferImage;
        if (PatchProxy.isSupport(new Object[]{str2, transferImage2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60212b, false, 65482, new Class[]{String.class, TransferImage.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, transferImage2, Byte.valueOf(z)}, this, f60212b, false, 65482, new Class[]{String.class, TransferImage.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        g transConfig = this.f60213c.getTransConfig();
        c cVar = transConfig.r;
        if (!(this instanceof e) || cVar.a(str)) {
            b(str, transferImage, z);
            return;
        }
        transferImage2.setImageDrawable(transConfig.a(this.f60214d));
        if (z) {
            transferImage.e();
        } else {
            transferImage.f();
        }
    }
}

package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage;

public class TransferAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60139a;

    /* renamed from: b  reason: collision with root package name */
    public a f60140b;

    /* renamed from: c  reason: collision with root package name */
    private h f60141c;

    /* renamed from: d  reason: collision with root package name */
    private int f60142d;

    /* renamed from: e  reason: collision with root package name */
    private int f60143e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<FrameLayout> f60144f;

    interface a {
        void a();
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public int getCount() {
        return this.f60143e;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage a(int r17) {
        /*
            r16 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f60139a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r8] = r2
            java.lang.Class<com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage> r7 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.class
            r4 = 0
            r5 = 65440(0xffa0, float:9.1701E-41)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003f
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r9[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = f60139a
            r12 = 0
            r13 = 65440(0xffa0, float:9.1701E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r14[r8] = r0
            java.lang.Class<com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage> r15 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.class
            r10 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = (com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage) r0
            return r0
        L_0x003f:
            r0 = 0
            r1 = r16
            android.util.SparseArray<android.widget.FrameLayout> r2 = r1.f60144f
            r3 = r17
            java.lang.Object r2 = r2.get(r3)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            if (r2 == 0) goto L_0x0063
            int r3 = r2.getChildCount()
        L_0x0052:
            if (r8 >= r3) goto L_0x0063
            android.view.View r4 = r2.getChildAt(r8)
            boolean r5 = r4 instanceof android.widget.ImageView
            if (r5 == 0) goto L_0x0060
            r0 = r4
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = (com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage) r0
            goto L_0x0063
        L_0x0060:
            int r8 = r8 + 1
            goto L_0x0052
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.preview.transfer.TransferAdapter.a(int):com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage");
    }

    /* access modifiers changed from: package-private */
    public final FrameLayout b(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60139a, false, 65441, new Class[]{Integer.TYPE}, FrameLayout.class)) {
            return this.f60144f.get(i);
        }
        return (FrameLayout) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60139a, false, 65441, new Class[]{Integer.TYPE}, FrameLayout.class);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60139a, false, 65442, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60139a, false, 65442, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        FrameLayout frameLayout = this.f60144f.get(i);
        if (frameLayout == null) {
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60139a, false, 65443, new Class[]{ViewGroup.class, Integer.TYPE}, FrameLayout.class)) {
                frameLayout = (FrameLayout) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60139a, false, 65443, new Class[]{ViewGroup.class, Integer.TYPE}, FrameLayout.class);
            } else {
                Context context = viewGroup.getContext();
                g transConfig = this.f60141c.getTransConfig();
                TransferImage transferImage = new TransferImage(context);
                transferImage.setDuration(transConfig.g);
                transferImage.setBackgroundColor(transConfig.f60184f);
                transferImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                transferImage.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout2.addView(transferImage);
                if (transConfig.h) {
                    this.f60141c.a(i).a(transferImage, i);
                }
                frameLayout = frameLayout2;
            }
            this.f60144f.put(i, frameLayout);
            if (i == this.f60142d && this.f60140b != null) {
                this.f60140b.a();
            }
        }
        try {
            viewGroup.addView(frameLayout);
        } catch (Exception unused) {
        }
        return frameLayout;
    }

    TransferAdapter(h hVar, int i, int i2) {
        int i3;
        this.f60141c = hVar;
        this.f60143e = i;
        this.f60142d = i2 + 1 == i ? i2 - 1 : i2 + 1;
        if (this.f60142d < 0) {
            i3 = 0;
        } else {
            i3 = this.f60142d;
        }
        this.f60142d = i3;
        this.f60144f = new SparseArray<>();
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f60139a, false, 65439, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f60139a, false, 65439, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        viewGroup2.removeView((View) obj);
    }
}

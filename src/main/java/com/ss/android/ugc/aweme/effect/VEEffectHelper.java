package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.u;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.aweme.shortvideo.ui.n;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import dmt.av.video.VEVideoPublishEditViewModel;
import dmt.av.video.h;
import dmt.av.video.j;
import dmt.av.video.o;
import dmt.av.video.p;
import dmt.av.video.s;
import dmt.av.video.v;
import dmt.av.video.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class VEEffectHelper implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3085a;
    public int A;
    public Context B;
    public boolean C = false;
    public EffectTabPagerAdapter D;
    public boolean E;
    public boolean F;
    public FragmentActivity G;
    public EffectPointModel H;
    x I;
    public long J;
    public String K;
    public ArrayList<EffectPointModel> L;
    public ArrayList<EffectPointModel> M;
    public int N = -1;
    boolean O;
    public MutableLiveData<Bitmap> P;
    public MutableLiveData<Boolean> Q;
    public SafeHandler R;
    public Runnable S = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43568a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43568a, false, 38734, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43568a, false, 38734, new Class[0], Void.TYPE);
            } else if (VEEffectHelper.this.r != null) {
                VEEffectHelper.this.p.f66182d.setValue(Long.valueOf((long) VEEffectHelper.this.r.u()));
                VEEffectHelper.this.b();
                VEEffectHelper.this.R.post(VEEffectHelper.this.S);
            }
        }
    };
    public Observer<s> T = new Observer<s>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43590a;

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            s sVar = (s) obj;
            if (PatchProxy.isSupport(new Object[]{sVar}, this, f43590a, false, 38742, new Class[]{s.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sVar}, this, f43590a, false, 38742, new Class[]{s.class}, Void.TYPE);
                return;
            }
            if (sVar.f83061b == 0) {
                p pVar = (p) VEEffectHelper.this.f3089e.getValue();
                if (VEEffectHelper.this.mVideoEditView.getVisibility() == 0) {
                    VEEffectHelper.this.R.post(VEEffectHelper.this.S);
                } else if (pVar == null || pVar.f83054e != 0 || e.a(pVar.l)) {
                    VEEffectHelper.this.y = new a();
                    VEEffectHelper.this.o.post(VEEffectHelper.this.y);
                } else {
                    VEEffectHelper.this.x = new b(pVar.f83051b[0]);
                    VEEffectHelper.this.o.post(VEEffectHelper.this.x);
                }
            } else {
                VEEffectHelper.this.a();
            }
        }
    };
    public Observer<p> U = new Observer<p>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43594a;

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            long j;
            p pVar = (p) obj;
            if (PatchProxy.isSupport(new Object[]{pVar}, this, f43594a, false, 38743, new Class[]{p.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pVar}, this, f43594a, false, 38743, new Class[]{p.class}, Void.TYPE);
                return;
            }
            if (pVar.f83055f) {
                j = ((long) VEEffectHelper.this.r.t()) - pVar.f83052c;
            } else {
                j = pVar.f83052c;
            }
            long j2 = j;
            if (pVar.f83054e == 0) {
                try {
                    VEEffectHelper.this.mEffectSeekLayout.a(pVar.f83051b[0], j2, pVar.g, VEEffectHelper.this.s.c());
                } catch (NullPointerException e2) {
                    throw new NullPointerException(e2.getMessage() + " " + pVar.toString());
                }
            } else if (pVar.f83054e == 5) {
                VEEffectHelper.this.mVideoEditView.a(true, true, (com.ss.android.ugc.aweme.base.a<Void>) null);
                VEEffectHelper.this.a((int) pVar.f83052c, (int) pVar.f83053d);
            } else if (pVar.f83054e == 7) {
                VEEffectHelper.this.mVideoEditView.a(false, true, (com.ss.android.ugc.aweme.base.a<Void>) null);
            } else if (pVar.f83054e == 8) {
                VEEffectHelper.this.a((int) pVar.f83052c, (int) pVar.f83053d);
                VEEffectHelper.this.mVideoEditView.a(false, true, (com.ss.android.ugc.aweme.base.a<Void>) new ah<Void>(this, pVar, j2));
            } else {
                ArrayList effectPointModels = VEEffectHelper.this.mEffectSeekLayout.getEffectPointModels();
                if (pVar.f83054e == 1) {
                    if (!effectPointModels.isEmpty()) {
                        VEEffectSeekLayout vEEffectSeekLayout = VEEffectHelper.this.mEffectSeekLayout;
                        int index = ((EffectPointModel) effectPointModels.get(effectPointModels.size() - 1)).getIndex();
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(index), new Long(j2)}, vEEffectSeekLayout, VEEffectSeekLayout.f43611a, false, 38769, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(index), new Long(j2)}, vEEffectSeekLayout, VEEffectSeekLayout.f43611a, false, 38769, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE);
                        } else {
                            vEEffectSeekLayout.a(index).setEndPoint((int) j2);
                            vEEffectSeekLayout.f43612b.setEffectPointModels(vEEffectSeekLayout.f43613c);
                        }
                    }
                } else if (pVar.f83054e == 2) {
                    VEEffectHelper.this.a(pVar.f83051b[0]);
                } else if (pVar.f83054e == 3) {
                    if (VEEffectHelper.this.f3090f != null) {
                        VEEffectHelper.this.f3090f.setValue(s.b(0));
                    }
                    VEEffectHelper.this.mEffectSeekLayout.b((int) VEEffectHelper.this.s.a(0));
                    VEEffectSeekLayout vEEffectSeekLayout2 = VEEffectHelper.this.mEffectSeekLayout;
                    if (PatchProxy.isSupport(new Object[0], vEEffectSeekLayout2, VEEffectSeekLayout.f43611a, false, 38780, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], vEEffectSeekLayout2, VEEffectSeekLayout.f43611a, false, 38780, new Class[0], Void.TYPE);
                    } else {
                        vEEffectSeekLayout2.f43613c.clear();
                    }
                } else if (pVar.f83054e == 4 && VEEffectHelper.this.M != null) {
                    for (int length = pVar.f83051b.length - 1; length >= 0; length--) {
                        VEEffectHelper.this.a(pVar.f83051b[length]);
                    }
                }
            }
        }
    };
    public Observer<VEEffectSelectOp> V = new Observer<VEEffectSelectOp>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43596a;

        /* JADX WARNING: Removed duplicated region for block: B:69:0x04ff  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0533  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x053a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r23) {
            /*
                r22 = this;
                r7 = r22
                r8 = r23
                com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp r8 = (com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp) r8
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f43596a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp> r1 = com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 38745(0x9759, float:5.4293E-41)
                r1 = r22
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003a
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f43596a
                r3 = 0
                r4 = 38745(0x9759, float:5.4293E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp> r1 = com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r22
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x003a:
                int r0 = r8.mType
                r2 = 1003(0x3eb, float:1.406E-42)
                r3 = 0
                r5 = 3
                r6 = 2
                switch(r0) {
                    case 1: goto L_0x03a4;
                    case 2: goto L_0x02d2;
                    case 3: goto L_0x01d4;
                    case 4: goto L_0x0047;
                    default: goto L_0x0045;
                }
            L_0x0045:
                goto L_0x0543
            L_0x0047:
                com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = com.ss.android.ugc.aweme.effect.VEEffectHelper.this
                com.ss.android.ugc.aweme.effect.EffectModel r2 = r8.mEffectModel
                com.ss.android.ugc.aweme.effect.EffectPointModel r8 = r8.mPreviousModel
                java.lang.Object[] r11 = new java.lang.Object[r6]
                r11[r10] = r2
                r11[r9] = r8
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
                r14 = 0
                r15 = 38667(0x970b, float:5.4184E-41)
                java.lang.Class[] r12 = new java.lang.Class[r6]
                java.lang.Class<com.ss.android.ugc.aweme.effect.EffectModel> r16 = com.ss.android.ugc.aweme.effect.EffectModel.class
                r12[r10] = r16
                java.lang.Class<com.ss.android.ugc.aweme.effect.EffectPointModel> r16 = com.ss.android.ugc.aweme.effect.EffectPointModel.class
                r12[r9] = r16
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r12
                r12 = r0
                boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r11 == 0) goto L_0x008d
                java.lang.Object[] r11 = new java.lang.Object[r6]
                r11[r10] = r2
                r11[r9] = r8
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
                r14 = 0
                r15 = 38667(0x970b, float:5.4184E-41)
                java.lang.Class[] r1 = new java.lang.Class[r6]
                java.lang.Class<com.ss.android.ugc.aweme.effect.EffectModel> r2 = com.ss.android.ugc.aweme.effect.EffectModel.class
                r1[r10] = r2
                java.lang.Class<com.ss.android.ugc.aweme.effect.EffectPointModel> r2 = com.ss.android.ugc.aweme.effect.EffectPointModel.class
                r1[r9] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                return
            L_0x008d:
                dmt.av.video.s r11 = dmt.av.video.s.b(r3)
                android.arch.lifecycle.MutableLiveData<dmt.av.video.s> r12 = r0.f3090f
                r12.setValue(r11)
                if (r8 != 0) goto L_0x0116
                java.lang.String r1 = r2.resDir
                com.ss.android.vesdk.p r8 = r0.r
                int r8 = r8.t()
                long r11 = (long) r8
                java.lang.Object[] r13 = new java.lang.Object[r5]
                r13[r10] = r1
                java.lang.Long r8 = java.lang.Long.valueOf(r3)
                r13[r9] = r8
                java.lang.Long r8 = new java.lang.Long
                r8.<init>(r11)
                r13[r6] = r8
                r14 = 0
                com.meituan.robust.ChangeQuickRedirect r15 = dmt.av.video.p.f83050a
                r16 = 1
                r17 = 92000(0x16760, float:1.2892E-40)
                java.lang.Class[] r8 = new java.lang.Class[r5]
                java.lang.Class<java.lang.String> r18 = java.lang.String.class
                r8[r10] = r18
                java.lang.Class r18 = java.lang.Long.TYPE
                r8[r9] = r18
                java.lang.Class r18 = java.lang.Long.TYPE
                r8[r6] = r18
                java.lang.Class<dmt.av.video.p> r19 = dmt.av.video.p.class
                r18 = r8
                boolean r8 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r8 == 0) goto L_0x0105
                java.lang.Object[] r13 = new java.lang.Object[r5]
                r13[r10] = r1
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r13[r9] = r1
                java.lang.Long r1 = new java.lang.Long
                r1.<init>(r11)
                r13[r6] = r1
                r14 = 0
                com.meituan.robust.ChangeQuickRedirect r15 = dmt.av.video.p.f83050a
                r16 = 1
                r17 = 92000(0x16760, float:1.2892E-40)
                java.lang.Class[] r1 = new java.lang.Class[r5]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r1[r10] = r3
                java.lang.Class r3 = java.lang.Long.TYPE
                r1[r9] = r3
                java.lang.Class r3 = java.lang.Long.TYPE
                r1[r6] = r3
                java.lang.Class<dmt.av.video.p> r19 = dmt.av.video.p.class
                r18 = r1
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                dmt.av.video.p r1 = (dmt.av.video.p) r1
                goto L_0x01b2
            L_0x0105:
                dmt.av.video.p r5 = new dmt.av.video.p
                r5.<init>()
                r6 = 5
                r5.f83054e = r6
                r5.h = r1
                r5.f83052c = r3
                r5.f83053d = r11
                r1 = r5
                goto L_0x01b2
            L_0x0116:
                java.lang.String r11 = r2.resDir
                com.ss.android.vesdk.p r12 = r0.r
                int r12 = r12.t()
                long r12 = (long) r12
                int r8 = r8.getIndex()
                r14 = 4
                java.lang.Object[] r15 = new java.lang.Object[r14]
                r15[r10] = r11
                java.lang.Long r16 = java.lang.Long.valueOf(r3)
                r15[r9] = r16
                java.lang.Long r1 = new java.lang.Long
                r1.<init>(r12)
                r15[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                r15[r5] = r1
                r16 = 0
                com.meituan.robust.ChangeQuickRedirect r17 = dmt.av.video.p.f83050a
                r18 = 1
                r19 = 92002(0x16762, float:1.28922E-40)
                java.lang.Class[] r1 = new java.lang.Class[r14]
                java.lang.Class<java.lang.String> r20 = java.lang.String.class
                r1[r10] = r20
                java.lang.Class r20 = java.lang.Long.TYPE
                r1[r9] = r20
                java.lang.Class r20 = java.lang.Long.TYPE
                r1[r6] = r20
                java.lang.Class r20 = java.lang.Integer.TYPE
                r1[r5] = r20
                java.lang.Class<dmt.av.video.p> r21 = dmt.av.video.p.class
                r20 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                if (r1 == 0) goto L_0x019d
                java.lang.Object[] r15 = new java.lang.Object[r14]
                r15[r10] = r11
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r15[r9] = r1
                java.lang.Long r1 = new java.lang.Long
                r1.<init>(r12)
                r15[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                r15[r5] = r1
                r16 = 0
                com.meituan.robust.ChangeQuickRedirect r17 = dmt.av.video.p.f83050a
                r18 = 1
                r19 = 92002(0x16762, float:1.28922E-40)
                java.lang.Class[] r1 = new java.lang.Class[r14]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r1[r10] = r3
                java.lang.Class r3 = java.lang.Long.TYPE
                r1[r9] = r3
                java.lang.Class r3 = java.lang.Long.TYPE
                r1[r6] = r3
                java.lang.Class r3 = java.lang.Integer.TYPE
                r1[r5] = r3
                java.lang.Class<dmt.av.video.p> r21 = dmt.av.video.p.class
                r20 = r1
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                dmt.av.video.p r1 = (dmt.av.video.p) r1
                goto L_0x01b2
            L_0x019d:
                dmt.av.video.p r1 = new dmt.av.video.p
                r1.<init>()
                r5 = 8
                r1.f83054e = r5
                r1.h = r11
                r1.f83052c = r3
                r1.f83053d = r12
                int[] r3 = new int[r9]
                r3[r10] = r8
                r1.f83051b = r3
            L_0x01b2:
                int r3 = r2.color
                r1.g = r3
                java.lang.String r3 = r2.key
                r1.i = r3
                java.lang.String r3 = r2.name
                r1.j = r3
                com.ss.android.ugc.aweme.effect.a r3 = r0.s
                boolean r3 = r3.c()
                r1.f83055f = r3
                java.lang.String r2 = r2.category
                r1.l = r2
                android.arch.lifecycle.MutableLiveData<dmt.av.video.p> r2 = r0.f3089e
                r2.setValue(r1)
                r0.g()
                goto L_0x0543
            L_0x01d4:
                com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = com.ss.android.ugc.aweme.effect.VEEffectHelper.this
                int r1 = r8.action
                com.ss.android.ugc.aweme.effect.EffectModel r3 = r8.mEffectModel
                java.lang.Object[] r11 = new java.lang.Object[r6]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
                r11[r10] = r4
                r11[r9] = r3
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
                r14 = 0
                r15 = 38670(0x970e, float:5.4188E-41)
                java.lang.Class[] r4 = new java.lang.Class[r6]
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r10] = r5
                java.lang.Class<com.ss.android.ugc.aweme.effect.EffectModel> r5 = com.ss.android.ugc.aweme.effect.EffectModel.class
                r4[r9] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r4
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r4 == 0) goto L_0x0222
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r8[r10] = r1
                r8[r9] = r3
                com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
                r11 = 0
                r12 = 38670(0x970e, float:5.4188E-41)
                java.lang.Class[] r13 = new java.lang.Class[r6]
                java.lang.Class r2 = java.lang.Integer.TYPE
                r13[r10] = r2
                java.lang.Class<com.ss.android.ugc.aweme.effect.EffectModel> r2 = com.ss.android.ugc.aweme.effect.EffectModel.class
                r13[r9] = r2
                java.lang.Class r14 = java.lang.Void.TYPE
                r9 = r0
                r10 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x0543
            L_0x0222:
                if (r1 != 0) goto L_0x02a4
                com.ss.android.ugc.aweme.effect.a r1 = r0.s
                boolean r1 = r1.b()
                if (r1 != 0) goto L_0x02d1
                java.lang.String r1 = r3.resDir
                com.ss.android.vesdk.p r4 = r0.r
                int r4 = r4.u()
                long r4 = (long) r4
                dmt.av.video.p r1 = dmt.av.video.p.a(r1, r4)
                int r4 = r3.color
                r1.g = r4
                java.lang.String r4 = r3.key
                r1.i = r4
                java.lang.String r4 = r3.name
                r1.j = r4
                com.ss.android.ugc.aweme.effect.a r4 = r0.s
                boolean r4 = r4.c()
                r1.f83055f = r4
                java.lang.String r4 = r3.category
                r1.l = r4
                android.arch.lifecycle.MutableLiveData<dmt.av.video.p> r4 = r0.f3089e
                r4.setValue(r1)
                r0.g()
                com.ss.android.ugc.aweme.utils.a r1 = com.ss.android.ugc.aweme.utils.a.f75468b
                java.lang.String r4 = "effect_click"
                com.ss.android.ugc.aweme.shortvideo.bj r5 = com.ss.android.ugc.aweme.shortvideo.bj.a()
                java.lang.String r6 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r8 = r0.f3086b
                java.lang.String r8 = r8.creationId
                com.ss.android.ugc.aweme.shortvideo.bj r5 = r5.a((java.lang.String) r6, (java.lang.String) r8)
                java.lang.String r6 = "scene_id"
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r5.a((java.lang.String) r6, (int) r2)
                java.lang.String r5 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r0.f3086b
                java.lang.String r6 = r6.mShootWay
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r2.a((java.lang.String) r5, (java.lang.String) r6)
                java.lang.String r5 = "draft_id"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r0.f3086b
                int r6 = r6.draftId
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r2.a((java.lang.String) r5, (int) r6)
                java.lang.String r5 = "tab_name"
                java.lang.String r0 = r0.K
                com.ss.android.ugc.aweme.shortvideo.bj r0 = r2.a((java.lang.String) r5, (java.lang.String) r0)
                java.lang.String r2 = "effect_name"
                java.lang.String r5 = r3.name
                com.ss.android.ugc.aweme.shortvideo.bj r0 = r0.a((java.lang.String) r2, (java.lang.String) r5)
                java.lang.String r2 = "effect_id"
                java.lang.String r3 = r3.key
                com.ss.android.ugc.aweme.shortvideo.bj r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f65805b
                r1.a(r4, r0)
                goto L_0x0543
            L_0x02a4:
                if (r1 != r9) goto L_0x02d1
                android.arch.lifecycle.MutableLiveData<dmt.av.video.p> r1 = r0.f3089e
                java.lang.Object r1 = r1.getValue()
                dmt.av.video.p r1 = (dmt.av.video.p) r1
                if (r1 == 0) goto L_0x0543
                int r1 = r1.f83054e
                if (r1 == 0) goto L_0x02b6
                goto L_0x0543
            L_0x02b6:
                r0.h()
                com.ss.android.vesdk.p r1 = r0.r
                int r1 = r1.u()
                long r1 = (long) r1
                dmt.av.video.p r1 = dmt.av.video.p.a((long) r1)
                com.ss.android.ugc.aweme.effect.a r2 = r0.s
                boolean r2 = r2.c()
                r1.f83055f = r2
                android.arch.lifecycle.MutableLiveData<dmt.av.video.p> r0 = r0.f3089e
                r0.setValue(r1)
            L_0x02d1:
                return
            L_0x02d2:
                com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = com.ss.android.ugc.aweme.effect.VEEffectHelper.this
                com.ss.android.ugc.aweme.effect.EffectModel r1 = r8.mEffectModel
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
                r14 = 0
                r15 = 38666(0x970a, float:5.4183E-41)
                java.lang.Class[] r3 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.effect.EffectModel> r4 = com.ss.android.ugc.aweme.effect.EffectModel.class
                r3[r10] = r4
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r3 == 0) goto L_0x030a
                java.lang.Object[] r8 = new java.lang.Object[r9]
                r8[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
                r11 = 0
                r12 = 38666(0x970a, float:5.4183E-41)
                java.lang.Class[] r13 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.effect.EffectModel> r2 = com.ss.android.ugc.aweme.effect.EffectModel.class
                r13[r10] = r2
                java.lang.Class r14 = java.lang.Void.TYPE
                r9 = r0
                r10 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x0543
            L_0x030a:
                com.ss.android.ugc.aweme.effect.a r3 = r0.s
                boolean r3 = r3.b()
                if (r3 != 0) goto L_0x03a3
                java.lang.String r3 = r1.resDir
                com.ss.android.vesdk.p r4 = r0.r
                int r4 = r4.u()
                long r4 = (long) r4
                dmt.av.video.p r3 = dmt.av.video.p.a(r3, r4)
                int r4 = r1.color
                r3.g = r4
                java.lang.String r4 = r1.key
                r3.i = r4
                java.lang.String r4 = r1.name
                r3.j = r4
                com.ss.android.ugc.aweme.effect.a r4 = r0.s
                boolean r4 = r4.c()
                r3.f83055f = r4
                java.lang.String r4 = r1.category
                r3.l = r4
                int r4 = r1.duration
                r3.k = r4
                android.arch.lifecycle.MutableLiveData<dmt.av.video.p> r4 = r0.f3089e
                r4.setValue(r3)
                r0.g()
                long r3 = r3.f83052c
                int r5 = r1.duration
                long r5 = (long) r5
                long r3 = r3 + r5
                dmt.av.video.p r3 = dmt.av.video.p.a((long) r3)
                com.ss.android.ugc.aweme.effect.a r4 = r0.s
                boolean r4 = r4.c()
                r3.f83055f = r4
                android.arch.lifecycle.MutableLiveData<dmt.av.video.p> r4 = r0.f3089e
                r4.setValue(r3)
                com.ss.android.ugc.aweme.utils.a r3 = com.ss.android.ugc.aweme.utils.a.f75468b
                java.lang.String r4 = "effect_click"
                com.ss.android.ugc.aweme.shortvideo.bj r5 = com.ss.android.ugc.aweme.shortvideo.bj.a()
                java.lang.String r6 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r8 = r0.f3086b
                java.lang.String r8 = r8.creationId
                com.ss.android.ugc.aweme.shortvideo.bj r5 = r5.a((java.lang.String) r6, (java.lang.String) r8)
                java.lang.String r6 = "scene_id"
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r5.a((java.lang.String) r6, (int) r2)
                java.lang.String r5 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r0.f3086b
                java.lang.String r6 = r6.mShootWay
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r2.a((java.lang.String) r5, (java.lang.String) r6)
                java.lang.String r5 = "draft_id"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r0.f3086b
                int r6 = r6.draftId
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r2.a((java.lang.String) r5, (int) r6)
                java.lang.String r5 = "tab_name"
                java.lang.String r0 = r0.K
                com.ss.android.ugc.aweme.shortvideo.bj r0 = r2.a((java.lang.String) r5, (java.lang.String) r0)
                java.lang.String r2 = "effect_name"
                java.lang.String r5 = r1.name
                com.ss.android.ugc.aweme.shortvideo.bj r0 = r0.a((java.lang.String) r2, (java.lang.String) r5)
                java.lang.String r2 = "effect_id"
                java.lang.String r1 = r1.key
                com.ss.android.ugc.aweme.shortvideo.bj r0 = r0.a((java.lang.String) r2, (java.lang.String) r1)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f65805b
                r3.a(r4, r0)
            L_0x03a3:
                return
            L_0x03a4:
                com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = com.ss.android.ugc.aweme.effect.VEEffectHelper.this
                int r1 = r8.mTimePosition
                java.lang.Object[] r11 = new java.lang.Object[r9]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
                r11[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
                r14 = 0
                r15 = 38671(0x970f, float:5.419E-41)
                java.lang.Class[] r8 = new java.lang.Class[r9]
                java.lang.Class r12 = java.lang.Integer.TYPE
                r8[r10] = r12
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r8
                boolean r8 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r8 == 0) goto L_0x03e4
                java.lang.Object[] r8 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r8[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
                r11 = 0
                r12 = 38671(0x970f, float:5.419E-41)
                java.lang.Class[] r13 = new java.lang.Class[r9]
                java.lang.Class r2 = java.lang.Integer.TYPE
                r13[r10] = r2
                java.lang.Class r14 = java.lang.Void.TYPE
                r9 = r0
                r10 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x0543
            L_0x03e4:
                android.arch.lifecycle.MutableLiveData<dmt.av.video.x> r8 = r0.h
                java.lang.Object r8 = r8.getValue()
                dmt.av.video.x r8 = (dmt.av.video.x) r8
                if (r8 == 0) goto L_0x0405
                java.lang.String r11 = r8.f83082b
                java.lang.String r12 = "0"
                boolean r11 = r11.equals(r12)
                if (r11 != 0) goto L_0x0405
                java.lang.String r11 = r8.f83082b
                java.lang.String r12 = "1"
                boolean r11 = r11.equals(r12)
                if (r11 != 0) goto L_0x0405
                long r11 = r8.f83083c
                goto L_0x040d
            L_0x0405:
                com.ss.android.vesdk.p r11 = r0.r
                int r11 = r11.t()
                int r11 = r11 / r6
                long r11 = (long) r11
            L_0x040d:
                com.ss.android.ugc.aweme.utils.a r14 = com.ss.android.ugc.aweme.utils.a.f75468b
                java.lang.String r15 = "effect_click"
                com.ss.android.ugc.aweme.shortvideo.bj r13 = com.ss.android.ugc.aweme.shortvideo.bj.a()
                java.lang.String r5 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r0.f3086b
                java.lang.String r3 = r3.creationId
                com.ss.android.ugc.aweme.shortvideo.bj r3 = r13.a((java.lang.String) r5, (java.lang.String) r3)
                java.lang.String r4 = "scene_id"
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r3.a((java.lang.String) r4, (int) r2)
                java.lang.String r3 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r0.f3086b
                java.lang.String r4 = r4.mShootWay
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
                java.lang.String r3 = "draft_id"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r0.f3086b
                int r4 = r4.draftId
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r2.a((java.lang.String) r3, (int) r4)
                java.lang.String r3 = "tab_name"
                java.lang.String r4 = "time_effect"
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
                java.lang.String r3 = "effect_name"
                java.util.ArrayList r4 = com.ss.android.ugc.aweme.effect.e.a()
                java.lang.Object r4 = r4.get(r1)
                com.ss.android.ugc.aweme.effect.EffectModel r4 = (com.ss.android.ugc.aweme.effect.EffectModel) r4
                java.lang.String r4 = r4.name
                com.ss.android.ugc.aweme.shortvideo.bj r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f65805b
                r14.a(r15, r2)
                if (r1 != 0) goto L_0x0473
                dmt.av.video.x r8 = dmt.av.video.x.a()
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                android.widget.RelativeLayout r2 = r2.getSelelctLayout()
                r3 = 8
                r2.setVisibility(r3)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                int r3 = r0.w
                r2.setOverlayColor(r3)
            L_0x0470:
                r13 = 0
                goto L_0x04f6
            L_0x0473:
                if (r1 != r9) goto L_0x0494
                com.ss.android.ugc.aweme.shortvideo.edit.u r2 = r0.f3088d
                boolean r2 = r2.b()
                if (r2 == 0) goto L_0x0488
                dmt.av.video.x r8 = dmt.av.video.x.b()
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                int r3 = r0.v
                r2.setOverlayColor(r3)
            L_0x0488:
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                android.widget.RelativeLayout r2 = r2.getSelelctLayout()
                r3 = 8
                r2.setVisibility(r3)
                goto L_0x0470
            L_0x0494:
                if (r1 != r6) goto L_0x04c5
                dmt.av.video.x r8 = dmt.av.video.x.a(r11)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                int r3 = r0.w
                r2.setOverlayColor(r3)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                android.widget.ImageView r2 = r2.getTvSelelct()
                r0.a((int) r6, (android.widget.ImageView) r2)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                android.widget.RelativeLayout r2 = r2.getSelelctLayout()
                r2.setVisibility(r10)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                int r3 = (int) r11
                r2.a((int) r3, (int) r6)
                r2 = 0
                dmt.av.video.s r13 = dmt.av.video.s.b(r2)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                r2.b(r10)
                goto L_0x04f6
            L_0x04c5:
                r2 = 3
                if (r1 != r2) goto L_0x0470
                dmt.av.video.x r8 = dmt.av.video.x.b(r11)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r3 = r0.mEffectSeekLayout
                int r4 = r0.w
                r3.setOverlayColor(r4)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r3 = r0.mEffectSeekLayout
                android.widget.ImageView r3 = r3.getTvSelelct()
                r0.a((int) r2, (android.widget.ImageView) r3)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                android.widget.RelativeLayout r2 = r2.getSelelctLayout()
                r2.setVisibility(r10)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                int r3 = (int) r11
                r2.a((int) r3, (int) r6)
                r2 = 0
                dmt.av.video.s r13 = dmt.av.video.s.b(r2)
                com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
                r2.b(r10)
            L_0x04f6:
                com.ss.android.ugc.aweme.effect.EffectPointModel r2 = new com.ss.android.ugc.aweme.effect.EffectPointModel
                r2.<init>()
                r0.H = r2
                if (r1 == 0) goto L_0x0531
                com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r0.H
                r2.setType(r6)
                com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r0.H
                int r3 = (int) r11
                r2.setStartPoint(r3)
                com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r0.H
                r2.setEndPoint(r3)
                com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r0.H
                java.util.ArrayList r3 = com.ss.android.ugc.aweme.effect.e.a()
                java.lang.Object r3 = r3.get(r1)
                com.ss.android.ugc.aweme.effect.EffectModel r3 = (com.ss.android.ugc.aweme.effect.EffectModel) r3
                java.lang.String r3 = r3.key
                r2.setKey(r3)
                com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r0.H
                java.util.ArrayList r3 = com.ss.android.ugc.aweme.effect.e.a()
                java.lang.Object r1 = r3.get(r1)
                com.ss.android.ugc.aweme.effect.EffectModel r1 = (com.ss.android.ugc.aweme.effect.EffectModel) r1
                java.lang.String r1 = r1.name
                r2.setName(r1)
            L_0x0531:
                if (r13 == 0) goto L_0x0538
                android.arch.lifecycle.MutableLiveData<dmt.av.video.s> r1 = r0.f3090f
                r1.setValue(r13)
            L_0x0538:
                if (r8 == 0) goto L_0x0542
                android.arch.lifecycle.MutableLiveData<dmt.av.video.x> r1 = r0.h
                r1.setValue(r8)
                r0.g()
            L_0x0542:
                return
            L_0x0543:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effect.VEEffectHelper.AnonymousClass9.onChanged(java.lang.Object):void");
        }
    };
    public Observer<o> W = new Observer<o>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43570a;

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            o oVar = (o) obj;
            if (PatchProxy.isSupport(new Object[]{oVar}, this, f43570a, false, 38746, new Class[]{o.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{oVar}, this, f43570a, false, 38746, new Class[]{o.class}, Void.TYPE);
                return;
            }
            if (oVar.f83048d == 0 && !TextUtils.isEmpty(oVar.f83046b) && oVar.f83047c > 0) {
                VEEffectHelper vEEffectHelper = VEEffectHelper.this;
                CharSequence charSequence = oVar.f83046b;
                long j = oVar.f83047c;
                if (PatchProxy.isSupport(new Object[]{charSequence, new Long(j)}, vEEffectHelper, VEEffectHelper.f3085a, false, 38668, new Class[]{CharSequence.class, Long.TYPE}, Void.TYPE)) {
                    VEEffectHelper vEEffectHelper2 = vEEffectHelper;
                    PatchProxy.accessDispatch(new Object[]{charSequence, new Long(j)}, vEEffectHelper2, VEEffectHelper.f3085a, false, 38668, new Class[]{CharSequence.class, Long.TYPE}, Void.TYPE);
                    return;
                }
                if (vEEffectHelper.mRlEffectHint != null) {
                    vEEffectHelper.mRlEffectHint.setVisibility(0);
                    vEEffectHelper.mRlEffectHint.postDelayed(new p(vEEffectHelper), j);
                }
                if (vEEffectHelper.mTvEffectHint != null) {
                    vEEffectHelper.mTvEffectHint.setText(charSequence);
                }
            }
        }
    };
    public EffectPlatform X;
    public n Y;
    private EffectPointModel Z;
    private final e aa;
    private com.ss.android.ugc.aweme.base.activity.a ab = new o(this);

    /* renamed from: b  reason: collision with root package name */
    public final cb f3086b;

    /* renamed from: c  reason: collision with root package name */
    public final VEVideoPublishEditViewModel f3087c;
    @BindView(2131493027)
    FrameLayout contentlatout;

    /* renamed from: d  reason: collision with root package name */
    public u f3088d;

    /* renamed from: e  reason: collision with root package name */
    public MutableLiveData<p> f3089e;

    /* renamed from: f  reason: collision with root package name */
    public MutableLiveData<s> f3090f;
    public MutableLiveData<v> g;
    public MutableLiveData<x> h;
    public MutableLiveData<VEEffectSelectOp> i;
    public MutableLiveData<o> j;
    public MutableLiveData<Float> k;
    public MutableLiveData<Boolean> l;
    @BindView(2131493423)
    LinearLayout loadingArea;
    public LiveData<Boolean> m;
    @BindView(2131492999)
    public ChooseVideoCoverView mChooseVideoCoverView;
    @BindView(2131493100)
    public VEEffectSeekLayout mEffectSeekLayout;
    @BindView(2131493099)
    RelativeLayout mEffectTitleLayout;
    @BindView(2131493327)
    public ImageView mIvPlay;
    @BindView(2131493598)
    RelativeLayout mRlEffectHint;
    @BindView(2131493654)
    LinearLayout mSeeklayout;
    @BindView(2131493427)
    public DmtStatusView mStatusView;
    @BindView(2131493747)
    public AVDmtTabLayout mTabLayout;
    @BindView(2131493829)
    public TextView mTextCancel;
    @BindView(2131493870)
    public TextView mTextxSave;
    @BindView(2131493838)
    TextView mTvEffectHint;
    @BindView(2131493909)
    VideoEditView mVideoEditView;
    @BindView(2131493928)
    public NoScrollViewPager mViewPager;
    public h<j> n;
    public SafeHandler o;
    CutMultiVideoViewModel p;
    EffectVideoCoverGeneratorImpl q;
    public com.ss.android.vesdk.p r;
    public a s;
    com.ss.android.ugc.aweme.shortvideo.widget.n t;
    m u;
    public int v;
    @BindView(2131493923)
    public RelativeLayout videolayout;
    public int w;
    public b x;
    public a y;
    public View z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43598a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43598a, false, 38754, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43598a, false, 38754, new Class[0], Void.TYPE);
                return;
            }
            VEEffectHelper.this.mEffectSeekLayout.b((int) VEEffectHelper.this.s.a());
            VEEffectHelper.this.b();
            VEEffectHelper.this.o.post(this);
        }

        a() {
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43600a;

        /* renamed from: b  reason: collision with root package name */
        int f43601b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43600a, false, 38755, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43600a, false, 38755, new Class[0], Void.TYPE);
                return;
            }
            VEEffectSeekLayout vEEffectSeekLayout = VEEffectHelper.this.mEffectSeekLayout;
            int i = this.f43601b;
            int a2 = (int) VEEffectHelper.this.s.a();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(a2)}, vEEffectSeekLayout, VEEffectSeekLayout.f43611a, false, 38779, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                VEEffectSeekLayout vEEffectSeekLayout2 = vEEffectSeekLayout;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(a2)}, vEEffectSeekLayout2, VEEffectSeekLayout.f43611a, false, 38779, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                if (!vEEffectSeekLayout.f43613c.isEmpty()) {
                    vEEffectSeekLayout.a(i).setEndPoint(a2);
                    vEEffectSeekLayout.f43612b.setEffectPointModels(vEEffectSeekLayout.f43613c);
                }
                vEEffectSeekLayout.b(a2);
            }
            VEEffectHelper.this.b();
            VEEffectHelper.this.o.post(this);
        }

        b(int i) {
            this.f43601b = i;
        }
    }

    public final void a(boolean z2, int i2) {
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f3085a, false, 38682, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2)}, this, f3085a, false, 38682, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.O = z2;
        if (this.C) {
            this.F = z2;
            if (!z2) {
                this.mTextxSave.setVisibility(8);
                this.mTextCancel.setVisibility(8);
            }
            j.a((View) this.contentlatout, z2, i2, this.z, (com.ss.android.ugc.aweme.base.a<Void>) new z<Void>(this, z2));
            if (z2) {
                this.aa.a(this.ab);
                this.J = 0;
                if (this.mEffectSeekLayout != null) {
                    this.f3090f.setValue(s.b(0));
                    VEEffectSeekLayout vEEffectSeekLayout = this.mEffectSeekLayout;
                    if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38702, new Class[0], Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38702, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z3 = this.s.c();
                    }
                    vEEffectSeekLayout.a(z3 ? this.A : 0, 1);
                    m();
                }
                i();
                if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38694, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38694, new Class[0], Void.TYPE);
                } else {
                    if (this.u == null) {
                        this.u = new m() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f43582a;

                            public final void a(int i, int i2, float f2, String str) {
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f43582a, false, 38738, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f43582a, false, 38738, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
                                    return;
                                }
                                if (i == 4098) {
                                    p pVar = (p) VEEffectHelper.this.f3089e.getValue();
                                    if (VEEffectHelper.this.F && (pVar == null || pVar.f83054e != 0)) {
                                        VEEffectHelper.this.o.post(new Runnable() {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f43584a;

                                            public final void run() {
                                                if (PatchProxy.isSupport(new Object[0], this, f43584a, false, 38739, new Class[0], Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[0], this, f43584a, false, 38739, new Class[0], Void.TYPE);
                                                    return;
                                                }
                                                if (VEEffectHelper.this.s.c()) {
                                                    VEEffectHelper.this.f3090f.setValue(s.b(((long) VEEffectHelper.this.r.t()) - VEEffectHelper.this.J));
                                                } else {
                                                    VEEffectHelper.this.f3090f.setValue(s.b(VEEffectHelper.this.J));
                                                }
                                                VEEffectHelper.this.mEffectSeekLayout.b((int) VEEffectHelper.this.J);
                                                VEEffectHelper.this.h();
                                            }
                                        });
                                    }
                                }
                            }
                        };
                        dmt.av.video.n.a(this.r, this.u);
                    }
                }
            } else {
                this.aa.b(this.ab);
            }
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38701, new Class[0], Void.TYPE);
            return;
        }
        if (this.mEffectSeekLayout != null) {
            this.mEffectSeekLayout.b((int) this.s.a());
        }
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38706, new Class[0], Void.TYPE);
            return;
        }
        j.a((View) this.mIvPlay, true, (View) null, false, false);
        if (this.mIvPlay != null) {
            this.mIvPlay.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38664, new Class[0], Void.TYPE);
            return;
        }
        this.x = null;
        this.y = null;
        this.o.removeCallbacksAndMessages(null);
        this.R.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38686, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.setValue(Float.valueOf(this.mVideoEditView.getSelectedTime()));
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38704, new Class[0], Void.TYPE);
            return;
        }
        this.f3090f.setValue(s.a());
        j.a((View) this.mIvPlay, false, (View) null, false, false);
        if (this.mIvPlay != null) {
            this.mIvPlay.setVisibility(8);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38705, new Class[0], Void.TYPE);
            return;
        }
        this.f3090f.setValue(s.b());
        m();
    }

    /* access modifiers changed from: package-private */
    public final JSONObject j() {
        if (!PatchProxy.isSupport(new Object[0], this, f3085a, false, 38709, new Class[0], JSONObject.class)) {
            return c.a().a("shoot_way", this.f3086b.mShootWay).b();
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38709, new Class[0], JSONObject.class);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38672, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.o.post(this.x);
        }
        if (this.y != null) {
            this.o.post(this.y);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38673, new Class[0], Void.TYPE);
            return;
        }
        this.o.removeCallbacksAndMessages(null);
    }

    public final int d() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38697, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38697, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mEffectTitleLayout.getHeight() == 0) {
            return (int) UIUtils.dip2Px(this.B, 52.0f);
        } else {
            return this.mEffectTitleLayout.getHeight();
        }
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38698, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38698, new Class[0], Integer.TYPE)).intValue();
        } else if (this.contentlatout.getHeight() == 0) {
            return (int) UIUtils.dip2Px(this.B, 276.0f);
        } else {
            return this.contentlatout.getHeight();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38699, new Class[0], Void.TYPE);
            return;
        }
        k();
        if (this.N == 1) {
            l();
            this.Y.a(1);
        } else if (this.N == 2 && (this.H == null || !this.H.getKey().equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE) || this.f3088d == null || this.f3088d.b())) {
            this.Y.a(2);
            com.ss.android.ugc.aweme.utils.a.f75468b.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "fx_confirm", "fx_page", 0, 0, j());
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38707, new Class[0], Void.TYPE);
            return;
        }
        this.M = new ArrayList<>(this.L);
        if (this.H != null) {
            this.Z = this.H.clone();
        }
        if (this.h.getValue() != null) {
            this.I = ((x) this.h.getValue()).clone();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38665, new Class[0], Void.TYPE);
            return;
        }
        if (this.s.b() && this.E) {
            if (!this.s.c()) {
                this.f3090f.setValue(s.b(0));
            } else if (this.s.c()) {
                this.f3090f.setValue(s.b(((long) this.r.t()) - this.J));
            }
            g();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38674, new Class[0], Void.TYPE);
            return;
        }
        dmt.av.video.n.b(this.r, this.u);
        if (this.mChooseVideoCoverView.getAdapter() instanceof ChooseVideoCoverView.Adapter) {
            ChooseVideoCoverView.Adapter adapter = (ChooseVideoCoverView.Adapter) this.mChooseVideoCoverView.getAdapter();
            if (adapter != null) {
                adapter.a();
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38710, new Class[0], Void.TYPE);
        } else if (this.X != null) {
            this.X.destroy();
        }
        if (this.D != null) {
            EffectTabPagerAdapter effectTabPagerAdapter = this.D;
            if (PatchProxy.isSupport(new Object[0], effectTabPagerAdapter, EffectTabPagerAdapter.f43522a, false, 38583, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], effectTabPagerAdapter, EffectTabPagerAdapter.f43522a, false, 38583, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.effect.a.a aVar = effectTabPagerAdapter.f43525d;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.effect.a.a.f43645a, false, 38834, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.effect.a.a.f43645a, false, 38834, new Class[0], Void.TYPE);
                return;
            }
            EffectPlatform a2 = com.ss.android.ugc.aweme.effect.a.a.j.a();
            if (a2 != null) {
                a2.destroy();
            }
            com.ss.android.ugc.aweme.effect.a.a.i = null;
            aVar.f43646b.clear();
            aVar.f43647c.clear();
            aVar.f43648d.clear();
            aVar.f43650f.set(false);
        }
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3085a, false, 38703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3085a, false, 38703, new Class[0], Void.TYPE);
            return;
        }
        ArrayList<EffectPointModel> arrayList = this.L;
        if (!arrayList.equals(this.M) && this.M != null && arrayList.size() > this.M.size()) {
            int[] iArr = new int[(arrayList.size() - this.M.size())];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr[i2] = arrayList.get(this.M.size() + i2).getIndex();
            }
            this.f3089e.setValue(p.a(iArr));
        }
        if (this.I != null) {
            this.h.setValue(this.I.clone());
        } else {
            this.h.setValue(x.a());
        }
        s sVar = null;
        if (this.Z != null) {
            this.H = this.Z.clone();
        } else {
            this.H = null;
        }
        if ("time_effect".equals(this.K)) {
            this.mEffectSeekLayout.a(true);
            if (this.I != null) {
                x xVar = (x) this.h.getValue();
                if (xVar.f83082b.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                    this.l.setValue(Boolean.TRUE);
                    this.mEffectSeekLayout.a(0, 1);
                    this.mEffectSeekLayout.getSelelctLayout().setVisibility(8);
                    this.mEffectSeekLayout.setOverlayColor(this.v);
                } else if (xVar.f83082b.equals(PushConstants.PUSH_TYPE_UPLOAD_LOG)) {
                    this.mEffectSeekLayout.setOverlayColor(this.w);
                    a(2, this.mEffectSeekLayout.getTvSelelct());
                    this.mEffectSeekLayout.a((int) xVar.f83083c, 2);
                    this.mEffectSeekLayout.getSelelctLayout().setVisibility(0);
                    sVar = s.b(0);
                    this.mEffectSeekLayout.b(0);
                } else if (xVar.f83082b.equals("3")) {
                    this.mEffectSeekLayout.setOverlayColor(this.w);
                    a(3, this.mEffectSeekLayout.getTvSelelct());
                    this.mEffectSeekLayout.a((int) xVar.f83083c, 2);
                    this.mEffectSeekLayout.getSelelctLayout().setVisibility(0);
                    sVar = s.b(0);
                    this.mEffectSeekLayout.b(0);
                } else if (xVar.f83082b.equals(PushConstants.PUSH_TYPE_NOTIFY)) {
                    this.mEffectSeekLayout.getSelelctLayout().setVisibility(8);
                    this.mEffectSeekLayout.setOverlayColor(this.w);
                }
                if (sVar != null) {
                    this.f3090f.setValue(sVar);
                }
                return;
            }
            this.mEffectSeekLayout.a(0, 1);
            this.mEffectSeekLayout.setOverlayColor(this.w);
            this.mEffectSeekLayout.getSelelctLayout().setVisibility(8);
            return;
        }
        this.mEffectSeekLayout.a(false);
        this.mEffectSeekLayout.getSelelctLayout().setVisibility(8);
    }

    private void b(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3085a, false, 38712, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3085a, false, 38712, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        VideoEditView videoEditView = this.mVideoEditView;
        if (!z2) {
            i2 = 8;
        }
        videoEditView.setVisibility(i2);
    }

    private void c(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3085a, false, 38713, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3085a, false, 38713, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        VEEffectSeekLayout vEEffectSeekLayout = this.mEffectSeekLayout;
        if (!z2) {
            i2 = 8;
        }
        vEEffectSeekLayout.setVisibility(i2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3085a, false, 38663, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3085a, false, 38663, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ArrayList effectPointModels = this.mEffectSeekLayout.getEffectPointModels();
        if (effectPointModels != null && !effectPointModels.isEmpty()) {
            p.g l2 = this.r.l();
            VEEffectSeekLayout vEEffectSeekLayout = this.mEffectSeekLayout;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, vEEffectSeekLayout, VEEffectSeekLayout.f43611a, false, 38771, new Class[]{Integer.TYPE}, Void.TYPE)) {
                VEEffectSeekLayout vEEffectSeekLayout2 = vEEffectSeekLayout;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, vEEffectSeekLayout2, VEEffectSeekLayout.f43611a, false, 38771, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                vEEffectSeekLayout.f43613c.remove(vEEffectSeekLayout.a(i2));
                vEEffectSeekLayout.f43612b.setEffectPointModels(vEEffectSeekLayout.f43613c);
            }
            if (effectPointModels.isEmpty()) {
                this.f3090f.setValue(s.b(0));
                this.mEffectSeekLayout.b((int) this.s.a(0));
            } else {
                int endPoint = ((EffectPointModel) effectPointModels.get(effectPointModels.size() - 1)).getEndPoint();
                this.mEffectSeekLayout.b(endPoint);
                if (this.s.c()) {
                    endPoint = this.r.t() - endPoint;
                }
                this.f3090f.setValue(s.b((long) endPoint));
            }
            if (l2 == p.g.STARTED) {
                h();
            }
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3085a, false, 38692, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3085a, false, 38692, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.loadingArea.setVisibility(0);
            this.mSeeklayout.setVisibility(8);
            if (this.mStatusView != null) {
                this.mStatusView.d();
            }
        } else {
            if (this.mStatusView != null) {
                this.mStatusView.b();
            }
            this.loadingArea.setVisibility(8);
            this.mSeeklayout.setVisibility(0);
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3085a, false, 38715, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3085a, false, 38715, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 >= 0 && i3 >= 0 && !this.mVideoEditView.a(i2, i3, 0)) {
            this.R.postDelayed(new w(this, i2, i3), 300);
        }
        this.f3090f.setValue(s.b(0));
    }

    public void a(int i2, ImageView imageView) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), imageView}, this, f3085a, false, 38711, new Class[]{Integer.TYPE, ImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), imageView}, this, f3085a, false, 38711, new Class[]{Integer.TYPE, ImageView.class}, Void.TYPE);
            return;
        }
        l.a(i2, imageView);
    }

    /* access modifiers changed from: package-private */
    public void a(long j2, long j3) {
        dmt.av.video.p pVar;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f3085a, false, 38669, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f3085a, false, 38669, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        c();
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, null, dmt.av.video.p.f83050a, true, 92001, new Class[]{Long.TYPE, Long.TYPE}, dmt.av.video.p.class)) {
            pVar = (dmt.av.video.p) PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, null, dmt.av.video.p.f83050a, true, 92001, new Class[]{Long.TYPE, Long.TYPE}, dmt.av.video.p.class);
        } else {
            pVar = new dmt.av.video.p();
            pVar.f83054e = 6;
            pVar.f83052c = j4;
            pVar.f83053d = j5;
        }
        pVar.f83055f = this.s.c();
        this.f3089e.setValue(pVar);
        g();
    }

    public final void a(List<EffectPointModel> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3085a, false, 38714, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f3085a, false, 38714, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            b(true);
            c(false);
            if (list == null || list.isEmpty()) {
                this.mVideoEditView.b(false);
                return;
            }
            a(list.get(0).getStartPoint(), list.get(0).getEndPoint());
            this.mVideoEditView.b(true);
        } else {
            b(false);
            c(true);
        }
    }

    public VEEffectHelper(@NonNull cb cbVar, FragmentActivity fragmentActivity, e eVar) {
        this.f3086b = cbVar;
        this.G = fragmentActivity;
        this.aa = eVar;
        this.R = new SafeHandler(fragmentActivity);
        this.f3087c = (VEVideoPublishEditViewModel) ViewModelProviders.of(fragmentActivity).get(VEVideoPublishEditViewModel.class);
    }
}

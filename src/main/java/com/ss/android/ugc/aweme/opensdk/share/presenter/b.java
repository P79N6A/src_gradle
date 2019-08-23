package com.ss.android.ugc.aweme.opensdk.share.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.opensdk.share.e;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.c;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.photo.IPhotoService;
import com.ss.android.ugc.aweme.share.systemshare.a;
import com.ss.android.ugc.aweme.u.ak;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58406a;

    /* renamed from: b  reason: collision with root package name */
    public Intent f58407b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f58408c;

    /* renamed from: d  reason: collision with root package name */
    public a f58409d;

    /* renamed from: e  reason: collision with root package name */
    public String f58410e;

    /* renamed from: f  reason: collision with root package name */
    public String f58411f;

    @MeasureFunction
    public final void a(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58406a, false, 63436, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58406a, false, 63436, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        final a aVar = (a) this.f58407b.getParcelableExtra("sys_send_action");
        if (aVar != null) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing() || !iAVService.getPublishService().isPublishServiceRunning(this.f58408c)) {
                com.ss.android.ugc.aweme.ac.b.a(this.f58408c, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new b.C0400b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58414a;

                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: java.lang.Object[]} */
                    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0200, code lost:
                        if (((r2 * r0.g) / r3) >= (r0.g / r0.h)) goto L_0x01ad;
                     */
                    /* JADX WARNING: Multi-variable type inference failed */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(java.lang.String[] r20, int[] r21) {
                        /*
                            r19 = this;
                            r7 = r19
                            r8 = r20
                            r9 = 2
                            java.lang.Object[] r0 = new java.lang.Object[r9]
                            r10 = 0
                            r0[r10] = r8
                            r11 = 1
                            r0[r11] = r21
                            com.meituan.robust.ChangeQuickRedirect r2 = f58414a
                            java.lang.Class[] r5 = new java.lang.Class[r9]
                            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                            r5[r10] = r1
                            java.lang.Class<int[]> r1 = int[].class
                            r5[r11] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r3 = 0
                            r4 = 63441(0xf7d1, float:8.89E-41)
                            r1 = r19
                            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                            if (r0 == 0) goto L_0x0045
                            java.lang.Object[] r0 = new java.lang.Object[r9]
                            r0[r10] = r8
                            r0[r11] = r21
                            com.meituan.robust.ChangeQuickRedirect r2 = f58414a
                            r3 = 0
                            r4 = 63441(0xf7d1, float:8.89E-41)
                            java.lang.Class[] r5 = new java.lang.Class[r9]
                            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                            r5[r10] = r1
                            java.lang.Class<int[]> r1 = int[].class
                            r5[r11] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r1 = r19
                            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                            return
                        L_0x0045:
                            int r0 = r8.length
                            if (r0 <= 0) goto L_0x02d2
                            r0 = r21[r10]
                            if (r0 != 0) goto L_0x02d2
                            com.ss.android.ugc.aweme.share.systemshare.a r0 = r0
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r1 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.app.Activity r1 = r1.f58408c
                            java.lang.Object[] r12 = new java.lang.Object[r11]
                            r12[r10] = r1
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.systemshare.a.f65294a
                            r15 = 0
                            r16 = 73822(0x1205e, float:1.03447E-40)
                            java.lang.Class[] r2 = new java.lang.Class[r11]
                            java.lang.Class<android.content.Context> r3 = android.content.Context.class
                            r2[r10] = r3
                            java.lang.Class r18 = java.lang.Boolean.TYPE
                            r13 = r0
                            r17 = r2
                            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                            r3 = 4
                            r4 = 3
                            if (r2 == 0) goto L_0x008f
                            java.lang.Object[] r12 = new java.lang.Object[r11]
                            r12[r10] = r1
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.systemshare.a.f65294a
                            r15 = 0
                            r16 = 73822(0x1205e, float:1.03447E-40)
                            java.lang.Class[] r1 = new java.lang.Class[r11]
                            java.lang.Class<android.content.Context> r2 = android.content.Context.class
                            r1[r10] = r2
                            java.lang.Class r18 = java.lang.Boolean.TYPE
                            r13 = r0
                            r17 = r1
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            goto L_0x00c7
                        L_0x008f:
                            boolean r2 = r0.f65295b
                            if (r2 == 0) goto L_0x009d
                            int r2 = r0.f65296c
                            if (r2 == r3) goto L_0x009b
                            int r2 = r0.f65296c
                            if (r2 != r4) goto L_0x009d
                        L_0x009b:
                            r0 = 1
                            goto L_0x00c7
                        L_0x009d:
                            boolean r2 = r0.f65295b
                            if (r2 == 0) goto L_0x00c6
                            java.io.File r2 = r0.f65297d
                            if (r2 != 0) goto L_0x00a6
                            goto L_0x00c6
                        L_0x00a6:
                            int r2 = r0.f65296c
                            if (r2 != r11) goto L_0x00ab
                            goto L_0x009b
                        L_0x00ab:
                            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r5 = com.ss.android.ugc.aweme.services.IAVService.class
                            java.lang.Object r2 = r2.getService(r5)
                            com.ss.android.ugc.aweme.services.IAVService r2 = (com.ss.android.ugc.aweme.services.IAVService) r2
                            com.ss.android.ugc.aweme.framework.services.IVideoLegalCheckerAndToastService r1 = r2.getVideoLegalCheckerAndToastService(r1)
                            java.io.File r0 = r0.f65297d
                            java.lang.String r0 = r0.getAbsolutePath()
                            boolean r0 = r1.isVideoLengthOrTypeSupportedAndShowErrToast(r0, r11)
                            goto L_0x00c7
                        L_0x00c6:
                            r0 = 0
                        L_0x00c7:
                            if (r0 != 0) goto L_0x00e2
                            com.ss.android.ugc.aweme.opensdk.share.e r0 = new com.ss.android.ugc.aweme.opensdk.share.e
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r1 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.app.Activity r1 = r1.f58408c
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r2 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.content.Intent r2 = r2.f58407b
                            com.ss.android.ugc.aweme.common.w r2 = com.ss.android.ugc.aweme.opensdk.share.share.a.a((android.content.Intent) r2)
                            r0.<init>(r1, r2)
                            java.lang.String r1 = ""
                            r2 = 20007(0x4e27, float:2.8036E-41)
                            r0.a(r1, r2)
                            return
                        L_0x00e2:
                            com.ss.android.ugc.aweme.share.systemshare.a r0 = r0
                            java.lang.Object[] r12 = new java.lang.Object[r10]
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.systemshare.a.f65294a
                            r15 = 0
                            r16 = 73825(0x12061, float:1.03451E-40)
                            java.lang.Class[] r1 = new java.lang.Class[r10]
                            java.lang.Class r18 = java.lang.Boolean.TYPE
                            r13 = r0
                            r17 = r1
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                            if (r1 == 0) goto L_0x0113
                            java.lang.Object[] r12 = new java.lang.Object[r10]
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.systemshare.a.f65294a
                            r15 = 0
                            r16 = 73825(0x12061, float:1.03451E-40)
                            java.lang.Class[] r1 = new java.lang.Class[r10]
                            java.lang.Class r18 = java.lang.Boolean.TYPE
                            r13 = r0
                            r17 = r1
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            goto L_0x0147
                        L_0x0113:
                            boolean r1 = r0.f65295b
                            if (r1 == 0) goto L_0x0146
                            int r1 = r0.f65296c
                            if (r1 == r9) goto L_0x0144
                            int r1 = r0.f65296c
                            if (r1 == r4) goto L_0x0144
                            int r1 = r0.f65296c
                            if (r1 != r3) goto L_0x0124
                            goto L_0x0144
                        L_0x0124:
                            java.io.File r0 = r0.f65297d
                            if (r0 == 0) goto L_0x0146
                            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
                            java.lang.Object r0 = r0.getService(r1)
                            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
                            com.ss.android.ugc.aweme.services.photo.IPhotoService r0 = r0.photoService()
                            boolean r0 = r0.isPhotoEditEnabled()
                            if (r0 == 0) goto L_0x0146
                            boolean r0 = com.ss.android.g.a.a()
                            if (r0 != 0) goto L_0x0146
                        L_0x0144:
                            r0 = 1
                            goto L_0x0147
                        L_0x0146:
                            r0 = 0
                        L_0x0147:
                            r1 = 20008(0x4e28, float:2.8037E-41)
                            if (r0 != 0) goto L_0x0170
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r0 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.app.Activity r0 = r0.f58408c
                            r2 = 2131562402(0x7f0d0fa2, float:1.8750232E38)
                            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r2)
                            r0.a()
                            com.ss.android.ugc.aweme.opensdk.share.e r0 = new com.ss.android.ugc.aweme.opensdk.share.e
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r2 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.app.Activity r2 = r2.f58408c
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r3 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.content.Intent r3 = r3.f58407b
                            com.ss.android.ugc.aweme.common.w r3 = com.ss.android.ugc.aweme.opensdk.share.share.a.a((android.content.Intent) r3)
                            r0.<init>(r2, r3)
                            java.lang.String r2 = ""
                            r0.a(r2, r1)
                            return
                        L_0x0170:
                            com.ss.android.ugc.aweme.share.systemshare.a r0 = r0
                            java.lang.Object[] r12 = new java.lang.Object[r10]
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.systemshare.a.f65294a
                            r15 = 0
                            r16 = 73823(0x1205f, float:1.03448E-40)
                            java.lang.Class[] r2 = new java.lang.Class[r10]
                            java.lang.Class r18 = java.lang.Boolean.TYPE
                            r13 = r0
                            r17 = r2
                            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                            if (r2 == 0) goto L_0x01a1
                            java.lang.Object[] r12 = new java.lang.Object[r10]
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.systemshare.a.f65294a
                            r15 = 0
                            r16 = 73823(0x1205f, float:1.03448E-40)
                            java.lang.Class[] r2 = new java.lang.Class[r10]
                            java.lang.Class r18 = java.lang.Boolean.TYPE
                            r13 = r0
                            r17 = r2
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            goto L_0x0204
                        L_0x01a1:
                            boolean r2 = r0.f65295b
                            if (r2 == 0) goto L_0x01af
                            int r2 = r0.f65296c
                            if (r2 == r4) goto L_0x01ad
                            int r2 = r0.f65296c
                            if (r2 != r3) goto L_0x01af
                        L_0x01ad:
                            r0 = 1
                            goto L_0x0204
                        L_0x01af:
                            boolean r2 = r0.f65295b
                            if (r2 == 0) goto L_0x0203
                            java.io.File r2 = r0.f65297d
                            if (r2 != 0) goto L_0x01b8
                            goto L_0x0203
                        L_0x01b8:
                            int r2 = r0.f65296c
                            if (r2 != r9) goto L_0x01bd
                            goto L_0x01ad
                        L_0x01bd:
                            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r3 = com.ss.android.ugc.aweme.services.IAVService.class
                            java.lang.Object r2 = r2.getService(r3)
                            com.ss.android.ugc.aweme.services.IAVService r2 = (com.ss.android.ugc.aweme.services.IAVService) r2
                            com.ss.android.ugc.aweme.services.photo.IPhotoService r2 = r2.photoService()
                            java.io.File r3 = r0.f65297d
                            java.lang.String r3 = r3.getAbsolutePath()
                            int[] r2 = r2.getImageWidthHeight(r3)
                            r3 = r2[r10]
                            r2 = r2[r11]
                            int r5 = r3 * r2
                            if (r5 == 0) goto L_0x0203
                            int r5 = r0.f65299f
                            if (r3 <= r5) goto L_0x0203
                            int r5 = r0.f65299f
                            if (r2 <= r5) goto L_0x0203
                            float r2 = (float) r2
                            float r5 = r0.g
                            float r5 = r5 * r2
                            float r3 = (float) r3
                            float r5 = r5 / r3
                            float r6 = r0.h
                            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                            if (r5 >= 0) goto L_0x0203
                            float r5 = r0.g
                            float r2 = r2 * r5
                            float r2 = r2 / r3
                            float r3 = r0.g
                            float r0 = r0.h
                            float r3 = r3 / r0
                            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                            if (r0 < 0) goto L_0x0203
                            goto L_0x01ad
                        L_0x0203:
                            r0 = 0
                        L_0x0204:
                            if (r0 != 0) goto L_0x022b
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r0 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.app.Activity r0 = r0.f58408c
                            r2 = 2131562403(0x7f0d0fa3, float:1.8750234E38)
                            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r2)
                            r0.a()
                            com.ss.android.ugc.aweme.opensdk.share.e r0 = new com.ss.android.ugc.aweme.opensdk.share.e
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r2 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.app.Activity r2 = r2.f58408c
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r3 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.content.Intent r3 = r3.f58407b
                            com.ss.android.ugc.aweme.common.w r3 = com.ss.android.ugc.aweme.opensdk.share.share.a.a((android.content.Intent) r3)
                            r0.<init>(r2, r3)
                            java.lang.String r2 = ""
                            r0.a(r2, r1)
                            return
                        L_0x022b:
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r0 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.content.Intent r0 = r0.f58407b
                            com.ss.android.ugc.aweme.common.w r0 = com.ss.android.ugc.aweme.opensdk.share.share.a.a((android.content.Intent) r0)
                            boolean r1 = r10
                            if (r1 != 0) goto L_0x02c6
                            if (r0 == 0) goto L_0x02c6
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r1 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            com.ss.android.ugc.aweme.opensdk.share.presenter.a r1 = r1.f58409d
                            if (r1 != 0) goto L_0x024e
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r1 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            com.ss.android.ugc.aweme.opensdk.share.presenter.a r2 = new com.ss.android.ugc.aweme.opensdk.share.presenter.a
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r3 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.app.Activity r3 = r3.f58408c
                            android.arch.lifecycle.LifecycleOwner r3 = (android.arch.lifecycle.LifecycleOwner) r3
                            r2.<init>(r3)
                            r1.f58409d = r2
                        L_0x024e:
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r1 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            com.ss.android.ugc.aweme.opensdk.share.presenter.a r1 = r1.f58409d
                            java.lang.String r2 = r0.mClientKey
                            java.lang.String r0 = r0.mCallerPackage
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b$2$1 r3 = new com.ss.android.ugc.aweme.opensdk.share.presenter.b$2$1
                            r3.<init>()
                            java.lang.Object[] r12 = new java.lang.Object[r4]
                            r12[r10] = r2
                            r12[r11] = r0
                            r12[r9] = r3
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.opensdk.share.presenter.a.f58399a
                            r15 = 0
                            r16 = 63428(0xf7c4, float:8.8882E-41)
                            java.lang.Class[] r5 = new java.lang.Class[r4]
                            java.lang.Class<java.lang.String> r6 = java.lang.String.class
                            r5[r10] = r6
                            java.lang.Class<java.lang.String> r6 = java.lang.String.class
                            r5[r11] = r6
                            java.lang.Class<com.ss.android.ugc.aweme.opensdk.share.presenter.a$a> r6 = com.ss.android.ugc.aweme.opensdk.share.presenter.a.C0658a.class
                            r5[r9] = r6
                            java.lang.Class r18 = java.lang.Void.TYPE
                            r13 = r1
                            r17 = r5
                            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                            if (r5 == 0) goto L_0x02a7
                            java.lang.Object[] r12 = new java.lang.Object[r4]
                            r12[r10] = r2
                            r12[r11] = r0
                            r12[r9] = r3
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.opensdk.share.presenter.a.f58399a
                            r15 = 0
                            r16 = 63428(0xf7c4, float:8.8882E-41)
                            java.lang.Class[] r0 = new java.lang.Class[r4]
                            java.lang.Class<java.lang.String> r2 = java.lang.String.class
                            r0[r10] = r2
                            java.lang.Class<java.lang.String> r2 = java.lang.String.class
                            r0[r11] = r2
                            java.lang.Class<com.ss.android.ugc.aweme.opensdk.share.presenter.a$a> r2 = com.ss.android.ugc.aweme.opensdk.share.presenter.a.C0658a.class
                            r0[r9] = r2
                            java.lang.Class r18 = java.lang.Void.TYPE
                            r13 = r1
                            r17 = r0
                            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                            goto L_0x02d1
                        L_0x02a7:
                            com.ss.android.ugc.aweme.opensdk.share.api.ClientScopesApi r4 = r1.f58400b
                            io.reactivex.Observable r0 = r4.getClientScopes(r2, r0)
                            io.reactivex.Scheduler r2 = io.reactivex.schedulers.Schedulers.io()
                            io.reactivex.Observable r0 = r0.subscribeOn(r2)
                            io.reactivex.Scheduler r2 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
                            io.reactivex.Observable r0 = r0.observeOn(r2)
                            com.ss.android.ugc.aweme.opensdk.share.presenter.a$1 r2 = new com.ss.android.ugc.aweme.opensdk.share.presenter.a$1
                            r2.<init>(r3)
                            r0.subscribe((io.reactivex.Observer<? super T>) r2)
                            goto L_0x0338
                        L_0x02c6:
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r0 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            com.ss.android.ugc.aweme.share.systemshare.a r1 = r0
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r2 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            java.lang.String r2 = r2.f58411f
                            r0.a((com.ss.android.ugc.aweme.share.systemshare.a) r1, (java.lang.String) r2)
                        L_0x02d1:
                            return
                        L_0x02d2:
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r0 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.app.Activity r0 = r0.f58408c
                            r1 = 2131561640(0x7f0d0ca8, float:1.8748686E38)
                            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r10)
                            java.lang.Object[] r12 = new java.lang.Object[r11]
                            r12[r10] = r0
                            r13 = 0
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.opensdk.share.presenter.d.f58422a
                            r15 = 1
                            r16 = 63445(0xf7d5, float:8.8905E-41)
                            java.lang.Class[] r1 = new java.lang.Class[r11]
                            java.lang.Class<android.widget.Toast> r2 = android.widget.Toast.class
                            r1[r10] = r2
                            java.lang.Class r18 = java.lang.Void.TYPE
                            r17 = r1
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                            if (r1 == 0) goto L_0x0311
                            java.lang.Object[] r12 = new java.lang.Object[r11]
                            r12[r10] = r0
                            r13 = 0
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.opensdk.share.presenter.d.f58422a
                            r15 = 1
                            r16 = 63445(0xf7d5, float:8.8905E-41)
                            java.lang.Class[] r0 = new java.lang.Class[r11]
                            java.lang.Class<android.widget.Toast> r1 = android.widget.Toast.class
                            r0[r10] = r1
                            java.lang.Class r18 = java.lang.Void.TYPE
                            r17 = r0
                            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                            goto L_0x0320
                        L_0x0311:
                            int r1 = android.os.Build.VERSION.SDK_INT
                            r2 = 25
                            if (r1 != r2) goto L_0x031d
                            r1 = r0
                            android.widget.Toast r1 = (android.widget.Toast) r1
                            com.ss.android.ugc.aweme.utils.eq.a(r1)
                        L_0x031d:
                            r0.show()
                        L_0x0320:
                            com.ss.android.ugc.aweme.opensdk.share.e r0 = new com.ss.android.ugc.aweme.opensdk.share.e
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r1 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.app.Activity r1 = r1.f58408c
                            com.ss.android.ugc.aweme.opensdk.share.presenter.b r2 = com.ss.android.ugc.aweme.opensdk.share.presenter.b.this
                            android.content.Intent r2 = r2.f58407b
                            com.ss.android.ugc.aweme.common.w r2 = com.ss.android.ugc.aweme.opensdk.share.share.a.a((android.content.Intent) r2)
                            r0.<init>(r1, r2)
                            java.lang.String r1 = ""
                            r2 = 20005(0x4e25, float:2.8033E-41)
                            r0.a(r1, r2)
                        L_0x0338:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.opensdk.share.presenter.b.AnonymousClass2.a(java.lang.String[], int[]):void");
                    }
                });
                return;
            }
            new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 20010);
        }
    }

    public b(Activity activity, Intent intent) {
        this.f58407b = intent;
        this.f58408c = activity;
    }

    private boolean a(String str, a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f58406a, false, 63437, new Class[]{String.class, a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f58406a, false, 63437, new Class[]{String.class, a.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            switch (FFMpegManager.a().b(str)) {
                case -5:
                    new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 22001);
                    return false;
                case -4:
                    new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 20010);
                    return false;
                case -3:
                    new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 20011);
                    return false;
                case -2:
                    new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 20012);
                    return false;
                case -1:
                    new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 20007);
                    return false;
                default:
                    return true;
            }
        }
    }

    public final void a(a aVar, String str) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aVar, str}, this, f58406a, false, 63435, new Class[]{a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, str}, this, f58406a, false, 63435, new Class[]{a.class, String.class}, Void.TYPE);
        } else if (!d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a(this.f58408c, this.f58410e, "video_edit_page", (Bundle) null, (f) new f() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58412a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f58412a, false, 63439, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58412a, false, 63439, new Class[0], Void.TYPE);
                        return;
                    }
                    b.this.a(true);
                }

                public final void a(Bundle bundle) {
                    if (PatchProxy.isSupport(new Object[]{null}, this, f58412a, false, 63440, new Class[]{Bundle.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{null}, this, f58412a, false, 63440, new Class[]{Bundle.class}, Void.TYPE);
                        return;
                    }
                    new e(b.this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(b.this.f58407b)).a("", 20004);
                }
            });
        } else {
            switch (aVar.f65296c) {
                case 1:
                    IPhotoService photoService = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService();
                    PhotoContext compress = photoService.compress(aVar.f65297d.getAbsolutePath(), new c());
                    if (compress == null) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this.f58408c, (int) C0906R.string.b0w).a();
                        return;
                    }
                    new ak().a("system_upload").b("photo").a(1).e();
                    compress.mShootWay = "upload";
                    if (compress.mainBusinessData != null) {
                        compress.mPhotoFrom = 3;
                    }
                    w a2 = com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b);
                    if (a2 != null) {
                        a2.mAppName = str;
                        if (this.f58409d != null && this.f58409d.a() && !TextUtils.isEmpty(a2.mHashTag)) {
                            com.ss.android.ugc.aweme.shortvideo.c cVar = new com.ss.android.ugc.aweme.shortvideo.c();
                            cVar.challengeName = a2.mHashTag;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(cVar);
                            compress.challenges = arrayList;
                        }
                    }
                    compress.mainBusinessData = ((IAVService) ServiceManager.get().getService(IAVService.class)).createMainBusinessContextJson(a2);
                    if (photoService != null) {
                        photoService.toPhotoEditActivity(this.f58408c, compress);
                    }
                    return;
                case 2:
                    w a3 = com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b);
                    if (a3 == null || TextUtils.isEmpty(a3.mClientKey) || a(aVar.f65297d.getAbsolutePath(), aVar)) {
                        new ak().a("system_upload").b("video").a(1).e();
                        Intent intent = new Intent();
                        intent.putExtra("file_path", aVar.f65297d.getAbsolutePath());
                        intent.putExtra("is_from_sys_share", true);
                        intent.putExtra("creation_id", UUID.randomUUID().toString());
                        intent.putExtra("shoot_way", "system_upload");
                        intent.putExtra("extra_share_context", a3);
                        intent.putExtra("extra_share_app_name", str);
                        if (a3 != null && this.f58409d != null && this.f58409d.a() && !TextUtils.isEmpty(a3.mHashTag)) {
                            com.ss.android.ugc.aweme.shortvideo.c cVar2 = new com.ss.android.ugc.aweme.shortvideo.c();
                            cVar2.challengeName = a3.mHashTag;
                            intent.putExtra("av_challenge", cVar2);
                        }
                        ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivity(this.f58408c, intent);
                        return;
                    }
                    return;
                case 3:
                    for (String fileExtensionFromUrl : aVar.f65298e) {
                        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(fileExtensionFromUrl));
                        if (mimeTypeFromExtension != null && !mimeTypeFromExtension.contains("image")) {
                            new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 20008);
                            return;
                        }
                    }
                    if (aVar.f65298e == null || aVar.f65298e.size() <= 12) {
                        PhotoMovieContext photoMovieContext = new PhotoMovieContext();
                        Music a4 = com.ss.android.ugc.aweme.photomovie.a.a();
                        photoMovieContext.mImageList = aVar.f65298e;
                        photoMovieContext.mMusicPath = com.ss.android.ugc.aweme.photomovie.a.f58869b;
                        w a5 = com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b);
                        if (a5 != null && this.f58409d != null && this.f58409d.a() && !TextUtils.isEmpty(a5.mHashTag)) {
                            a5.mAppName = str;
                            com.ss.android.ugc.aweme.shortvideo.c cVar3 = new com.ss.android.ugc.aweme.shortvideo.c();
                            cVar3.challengeName = a5.mHashTag;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(cVar3);
                            photoMovieContext.challenges = arrayList2;
                        }
                        photoMovieContext.mainBusinessData = ((IAVService) ServiceManager.get().getService(IAVService.class)).createMainBusinessContextJson(a5);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(a4);
                        List a6 = az.a(arrayList3, c.f58421b);
                        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                        if (iAVService != null) {
                            iAVService.photoMovieService().toPhotoMovieEditActivity(this.f58408c, photoMovieContext, a6, null);
                            return;
                        }
                    } else {
                        new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 20002);
                        return;
                    }
                    break;
                case 4:
                    w a7 = com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b);
                    if (!(a7 == null || TextUtils.isEmpty(a7.mClientKey) || aVar.f65298e == null)) {
                        Iterator<String> it2 = aVar.f65298e.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!a(it2.next(), aVar)) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            return;
                        }
                    }
                    ArrayList a8 = aVar.a();
                    if (a8 != null) {
                        if (a8.size() <= 12) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("open_sdk_import_media_list", a8);
                            intent2.putExtra("is_from_sys_share", true);
                            intent2.putExtra("creation_id", UUID.randomUUID().toString());
                            intent2.putExtra("shoot_way", "system_upload");
                            intent2.putExtra("extra_share_context", a7);
                            intent2.putExtra("extra_share_app_name", str);
                            if (a7 != null && this.f58409d != null && this.f58409d.a() && !TextUtils.isEmpty(a7.mHashTag)) {
                                com.ss.android.ugc.aweme.shortvideo.c cVar4 = new com.ss.android.ugc.aweme.shortvideo.c();
                                cVar4.challengeName = a7.mHashTag;
                                intent2.putExtra("av_challenge", cVar4);
                            }
                            ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivity(this.f58408c, intent2);
                            break;
                        } else {
                            new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 20002);
                            return;
                        }
                    } else {
                        new e(this.f58408c, com.ss.android.ugc.aweme.opensdk.share.share.a.a(this.f58407b)).a("", 20010);
                        return;
                    }
            }
        }
    }
}

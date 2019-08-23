package com.bytedance.android.livesdk.chatroom.f;

import com.bytedance.android.live.base.model.ImageModel;
import com.meituan.robust.ChangeQuickRedirect;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class c implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10217a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageModel f10218b;

    c(ImageModel imageModel) {
        this.f10218b = imageModel;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.facebook.datasource.DataSource} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void subscribe(io.reactivex.ObservableEmitter r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f10217a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<io.reactivex.ObservableEmitter> r3 = io.reactivex.ObservableEmitter.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 6496(0x1960, float:9.103E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f10217a
            r13 = 0
            r14 = 6496(0x1960, float:9.103E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<io.reactivex.ObservableEmitter> r0 = io.reactivex.ObservableEmitter.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            r2 = r17
            com.bytedance.android.live.base.model.ImageModel r3 = r2.f10218b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.f.b.f10213a
            r13 = 1
            r14 = 6494(0x195e, float:9.1E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r4 = com.bytedance.android.live.base.model.ImageModel.class
            r15[r9] = r4
            java.lang.Class<com.facebook.datasource.DataSource> r16 = com.facebook.datasource.DataSource.class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r5 = 0
            if (r4 == 0) goto L_0x006c
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.f.b.f10213a
            r13 = 1
            r14 = 6494(0x195e, float:9.1E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r1 = com.bytedance.android.live.base.model.ImageModel.class
            r15[r9] = r1
            java.lang.Class<com.facebook.datasource.DataSource> r16 = com.facebook.datasource.DataSource.class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r5 = r1
            com.facebook.datasource.DataSource r5 = (com.facebook.datasource.DataSource) r5
            goto L_0x012d
        L_0x006c:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.f.b.f10213a
            r13 = 1
            r14 = 6495(0x195f, float:9.101E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r4 = com.bytedance.android.live.base.model.ImageModel.class
            r15[r9] = r4
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r16 = com.facebook.imagepipeline.request.ImageRequest[].class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x009d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.f.b.f10213a
            r13 = 1
            r14 = 6495(0x195f, float:9.101E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r1 = com.bytedance.android.live.base.model.ImageModel.class
            r15[r9] = r1
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r16 = com.facebook.imagepipeline.request.ImageRequest[].class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.facebook.imagepipeline.request.ImageRequest[] r1 = (com.facebook.imagepipeline.request.ImageRequest[]) r1
            goto L_0x00fc
        L_0x009d:
            if (r3 == 0) goto L_0x00fb
            java.util.List r1 = r3.getUrls()
            if (r1 == 0) goto L_0x00fb
            java.util.List r1 = r3.getUrls()
            int r1 = r1.size()
            if (r1 != 0) goto L_0x00b0
            goto L_0x00fb
        L_0x00b0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.bytedance.android.live.core.utils.fresco.c r4 = new com.bytedance.android.live.core.utils.fresco.c
            r4.<init>()
            java.util.List r6 = r3.getUrls()
            java.util.Iterator r6 = r6.iterator()
        L_0x00c2:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00e7
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = com.bytedance.common.utility.StringUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x00c2
            android.net.Uri r7 = android.net.Uri.parse(r7)
            com.facebook.imagepipeline.request.ImageRequestBuilder r7 = com.facebook.imagepipeline.request.ImageRequestBuilder.newBuilderWithSource(r7)
            r4.a(r7)
            com.facebook.imagepipeline.request.ImageRequest r7 = r7.build()
            r1.add(r7)
            goto L_0x00c2
        L_0x00e7:
            int r4 = r1.size()
            if (r4 != 0) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            int r4 = r1.size()
            com.facebook.imagepipeline.request.ImageRequest[] r4 = new com.facebook.imagepipeline.request.ImageRequest[r4]
            java.lang.Object[] r1 = r1.toArray(r4)
            com.facebook.imagepipeline.request.ImageRequest[] r1 = (com.facebook.imagepipeline.request.ImageRequest[]) r1
            goto L_0x00fc
        L_0x00fb:
            r1 = r5
        L_0x00fc:
            if (r1 == 0) goto L_0x012d
            int r4 = r1.length
            if (r4 != 0) goto L_0x0102
            goto L_0x012d
        L_0x0102:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r1.length
        L_0x0108:
            if (r9 >= r6) goto L_0x011e
            r7 = r1[r9]
            if (r7 == 0) goto L_0x011b
            com.facebook.imagepipeline.core.ImagePipeline r8 = com.facebook.drawee.backends.pipeline.Fresco.getImagePipeline()
            com.facebook.imagepipeline.request.ImageRequest$a r10 = com.facebook.imagepipeline.request.ImageRequest.a.FULL_FETCH
            com.facebook.common.internal.Supplier r7 = r8.getDataSourceSupplier(r7, r5, r10)
            r4.add(r7)
        L_0x011b:
            int r9 = r9 + 1
            goto L_0x0108
        L_0x011e:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0125
            goto L_0x012d
        L_0x0125:
            com.facebook.datasource.c r1 = com.facebook.datasource.c.a(r4)
            com.facebook.datasource.DataSource r5 = r1.get()
        L_0x012d:
            if (r5 != 0) goto L_0x014a
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Cannot build requests from imageModel: "
            r4.<init>(r5)
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r1.<init>(r3)
            r0.onError(r1)
            return
        L_0x014a:
            com.bytedance.android.livesdk.chatroom.f.b$1 r1 = new com.bytedance.android.livesdk.chatroom.f.b$1
            r1.<init>(r0, r3)
            java.util.concurrent.ExecutorService r0 = com.bytedance.common.utility.concurrent.TTExecutors.getNormalExecutor()
            r5.subscribe(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.f.c.subscribe(io.reactivex.ObservableEmitter):void");
    }
}

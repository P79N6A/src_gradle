package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e;
import com.ss.android.ugc.aweme.sticker.a.b;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/InteractStickerViewFactory;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69863a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J6\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J4\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/InteractStickerViewFactory$Companion;", "", "()V", "createBusinessStickerView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BusinessInteractStickerView;", "context", "Landroid/content/Context;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "interactStickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "rootView", "Landroid/view/View;", "videoDataGetter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVideoDataGetter;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "createPoiStickerView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/PoiInteractStickerView;", "createVoteStickerView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteInteractStickerView;", "iVoteDetailSaveData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69864a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @Nullable
        public final e a(@NotNull Context context, @Nullable d dVar, @NotNull InteractStickerStruct interactStickerStruct, @NotNull View view, @Nullable f fVar) {
            float f2;
            Context context2 = context;
            d dVar2 = dVar;
            InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{context2, dVar2, interactStickerStruct2, view2, fVar}, this, f69864a, false, 79490, new Class[]{Context.class, d.class, InteractStickerStruct.class, View.class, f.class}, e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[]{context2, dVar2, interactStickerStruct2, view2, fVar}, this, f69864a, false, 79490, new Class[]{Context.class, d.class, InteractStickerStruct.class, View.class, f.class}, e.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(interactStickerStruct2, "interactStickerStruct");
            Intrinsics.checkParameterIsNotNull(view2, "rootView");
            b.a aVar = null;
            if (!p.c()) {
                return null;
            }
            if (dVar2 != null) {
                com.ss.android.ugc.aweme.sticker.a.b bVar = dVar2.k;
                if (bVar != null) {
                    aVar = bVar.a();
                }
            }
            float f3 = 0.0f;
            if (dVar2 != null) {
                if (aVar != null) {
                    f2 = (float) aVar.f71621a;
                } else {
                    f2 = 0.0f;
                }
                dVar2.a(f2);
            }
            if (dVar2 != null) {
                if (aVar != null) {
                    f3 = (float) aVar.f71622b;
                }
                dVar2.b(f3);
            }
            e eVar = new e(interactStickerStruct.getType(), context, view, interactStickerStruct, dVar);
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab  */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g a(@org.jetbrains.annotations.NotNull android.content.Context r26, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.sticker.d r27, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r28, @org.jetbrains.annotations.NotNull android.view.View r29, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r30) {
            /*
                r25 = this;
                r2 = r26
                r5 = r27
                r4 = r28
                r3 = r29
                r6 = r30
                r0 = 5
                java.lang.Object[] r7 = new java.lang.Object[r0]
                r1 = 0
                r7[r1] = r2
                r14 = 1
                r7[r14] = r5
                r15 = 2
                r7[r15] = r4
                r16 = 3
                r7[r16] = r3
                r17 = 4
                r7[r17] = r6
                com.meituan.robust.ChangeQuickRedirect r9 = f69864a
                java.lang.Class[] r12 = new java.lang.Class[r0]
                java.lang.Class<android.content.Context> r8 = android.content.Context.class
                r12[r1] = r8
                java.lang.Class<com.ss.android.ugc.aweme.sticker.d> r8 = com.ss.android.ugc.aweme.sticker.d.class
                r12[r14] = r8
                java.lang.Class<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r8 = com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct.class
                r12[r15] = r8
                java.lang.Class<android.view.View> r8 = android.view.View.class
                r12[r16] = r8
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g> r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g.class
                r12[r17] = r8
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g> r13 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g.class
                r10 = 0
                r11 = 79492(0x13684, float:1.11392E-40)
                r8 = r25
                boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
                if (r7 == 0) goto L_0x007c
                java.lang.Object[] r7 = new java.lang.Object[r0]
                r7[r1] = r2
                r7[r14] = r5
                r7[r15] = r4
                r7[r16] = r3
                r7[r17] = r6
                com.meituan.robust.ChangeQuickRedirect r20 = f69864a
                r21 = 0
                r22 = 79492(0x13684, float:1.11392E-40)
                java.lang.Class[] r0 = new java.lang.Class[r0]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r0[r1] = r2
                java.lang.Class<com.ss.android.ugc.aweme.sticker.d> r1 = com.ss.android.ugc.aweme.sticker.d.class
                r0[r14] = r1
                java.lang.Class<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r1 = com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct.class
                r0[r15] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r0[r16] = r1
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g> r1 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g.class
                r0[r17] = r1
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g> r24 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g.class
                r18 = r7
                r19 = r25
                r23 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g r0 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g) r0
                return r0
            L_0x007c:
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
                java.lang.String r0 = "interactStickerStruct"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
                java.lang.String r0 = "rootView"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                java.lang.String r0 = "iVoteDetailSaveData"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
                if (r5 == 0) goto L_0x009b
                com.ss.android.ugc.aweme.sticker.a.b r0 = r5.k
                if (r0 == 0) goto L_0x009b
                com.ss.android.ugc.aweme.sticker.a.b$a r0 = r0.a()
                goto L_0x009c
            L_0x009b:
                r0 = 0
            L_0x009c:
                r1 = 0
                if (r5 == 0) goto L_0x00a9
                if (r0 == 0) goto L_0x00a5
                int r7 = r0.f71621a
                float r7 = (float) r7
                goto L_0x00a6
            L_0x00a5:
                r7 = 0
            L_0x00a6:
                r5.a((float) r7)
            L_0x00a9:
                if (r5 == 0) goto L_0x00b3
                if (r0 == 0) goto L_0x00b0
                int r0 = r0.f71622b
                float r1 = (float) r0
            L_0x00b0:
                r5.b((float) r1)
            L_0x00b3:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g r7 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g
                int r1 = r28.getType()
                r0 = r7
                r2 = r26
                r3 = r29
                r4 = r28
                r5 = r27
                r6 = r30
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a.a(android.content.Context, com.ss.android.ugc.aweme.sticker.d, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, android.view.View, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g):com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00b4  */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b a(@org.jetbrains.annotations.NotNull android.content.Context r28, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.sticker.d r29, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r30, @org.jetbrains.annotations.NotNull android.view.View r31, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f r32, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.Aweme r33) {
            /*
                r27 = this;
                r2 = r28
                r5 = r29
                r4 = r30
                r3 = r31
                r0 = 6
                java.lang.Object[] r9 = new java.lang.Object[r0]
                r1 = 0
                r9[r1] = r2
                r7 = 1
                r9[r7] = r5
                r16 = 2
                r9[r16] = r4
                r17 = 3
                r9[r17] = r3
                r18 = 4
                r9[r18] = r32
                r19 = 5
                r9[r19] = r33
                com.meituan.robust.ChangeQuickRedirect r11 = f69864a
                java.lang.Class[] r14 = new java.lang.Class[r0]
                java.lang.Class<android.content.Context> r10 = android.content.Context.class
                r14[r1] = r10
                java.lang.Class<com.ss.android.ugc.aweme.sticker.d> r10 = com.ss.android.ugc.aweme.sticker.d.class
                r14[r7] = r10
                java.lang.Class<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r10 = com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct.class
                r14[r16] = r10
                java.lang.Class<android.view.View> r10 = android.view.View.class
                r14[r17] = r10
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f> r10 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f.class
                r14[r18] = r10
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r10 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r14[r19] = r10
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b> r15 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b.class
                r12 = 0
                r13 = 79491(0x13683, float:1.1139E-40)
                r10 = r27
                boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                if (r9 == 0) goto L_0x0089
                java.lang.Object[] r9 = new java.lang.Object[r0]
                r9[r1] = r2
                r9[r7] = r5
                r9[r16] = r4
                r9[r17] = r3
                r9[r18] = r32
                r9[r19] = r33
                com.meituan.robust.ChangeQuickRedirect r22 = f69864a
                r23 = 0
                r24 = 79491(0x13683, float:1.1139E-40)
                java.lang.Class[] r0 = new java.lang.Class[r0]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r0[r1] = r2
                java.lang.Class<com.ss.android.ugc.aweme.sticker.d> r1 = com.ss.android.ugc.aweme.sticker.d.class
                r0[r7] = r1
                java.lang.Class<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r1 = com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct.class
                r0[r16] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r0[r17] = r1
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f> r1 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f.class
                r0[r18] = r1
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r0[r19] = r1
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b> r26 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b.class
                r20 = r9
                r21 = r27
                r25 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b r0 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b) r0
                return r0
            L_0x0089:
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
                java.lang.String r0 = "interactStickerStruct"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
                java.lang.String r0 = "rootView"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r0 = 0
                if (r5 == 0) goto L_0x00a4
                com.ss.android.ugc.aweme.sticker.a.b r1 = r5.k
                if (r1 == 0) goto L_0x00a4
                com.ss.android.ugc.aweme.sticker.a.b$a r1 = r1.a()
                goto L_0x00a5
            L_0x00a4:
                r1 = r0
            L_0x00a5:
                r7 = 0
                if (r5 == 0) goto L_0x00b2
                if (r1 == 0) goto L_0x00ae
                int r9 = r1.f71621a
                float r9 = (float) r9
                goto L_0x00af
            L_0x00ae:
                r9 = 0
            L_0x00af:
                r5.a((float) r9)
            L_0x00b2:
                if (r5 == 0) goto L_0x00bc
                if (r1 == 0) goto L_0x00b9
                int r1 = r1.f71622b
                float r7 = (float) r1
            L_0x00b9:
                r5.b((float) r7)
            L_0x00bc:
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d9 }
                java.lang.String r7 = r30.getAttr()     // Catch:{ Exception -> 0x00d9 }
                r1.<init>(r7)     // Catch:{ Exception -> 0x00d9 }
                java.lang.String r7 = "interaction_extra"
                java.lang.String r1 = r1.getString(r7)     // Catch:{ Exception -> 0x00d9 }
                com.google.gson.Gson r7 = com.ss.android.ugc.aweme.app.api.m.d()     // Catch:{ Exception -> 0x00d9 }
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData> r9 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData.class
                java.lang.Object r1 = r7.fromJson((java.lang.String) r1, (java.lang.Class<T>) r9)     // Catch:{ Exception -> 0x00d9 }
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r1 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData) r1     // Catch:{ Exception -> 0x00d9 }
                r7 = r1
                goto L_0x00da
            L_0x00d9:
                r7 = r0
            L_0x00da:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b r9 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b
                int r1 = r30.getType()
                r0 = r9
                r2 = r28
                r3 = r31
                r4 = r30
                r5 = r29
                r6 = r32
                r8 = r33
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a.a(android.content.Context, com.ss.android.ugc.aweme.sticker.d, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, android.view.View, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f, com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b");
        }
    }
}

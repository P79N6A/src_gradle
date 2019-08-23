package com.bytedance.android.livesdk.chatroom.f;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/utils/NinePatchUtil;", "", "()V", "TAG", "", "getPaddingFromNinePatchChunk", "Landroid/graphics/Rect;", "data", "", "loadNinePatchDrawable", "", "imageModel", "Lcom/bytedance/android/live/base/model/ImageModel;", "view", "Landroid/view/View;", "autoRTL", "", "callback", "Ljava/lang/Runnable;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10219a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f10220b = new d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "it", "", "apply", "(Ljava/lang/Integer;)Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 1, 13})
    static final class a<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10221a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f10222b;

        a(String str) {
            this.f10222b = str;
        }

        /* access modifiers changed from: private */
        @Nullable
        /* renamed from: a */
        public Bitmap apply(@NotNull Integer num) {
            Integer num2 = num;
            if (PatchProxy.isSupport(new Object[]{num2}, this, f10221a, false, 6501, new Class[]{Integer.class}, Bitmap.class)) {
                return (Bitmap) PatchProxy.accessDispatch(new Object[]{num2}, this, f10221a, false, 6501, new Class[]{Integer.class}, Bitmap.class);
            }
            Intrinsics.checkParameterIsNotNull(num2, AdvanceSetting.NETWORK_TYPE);
            try {
                try {
                    com.bytedance.android.livesdkapi.i.d dVar = (com.bytedance.android.livesdkapi.i.d) TTLiveSDKContext.getHostService().h().a(false, Integer.MAX_VALUE, this.f10222b, new ArrayList(), null).a();
                    Intrinsics.checkExpressionValueIsNotNull(dVar, "response");
                    return BitmapFactory.decodeStream(new ByteArrayInputStream(dVar.f18821e));
                } catch (Exception e2) {
                    e = e2;
                    com.bytedance.android.live.core.c.a.a(6, "NinePatchUtil", e.getStackTrace());
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                com.bytedance.android.live.core.c.a.a(6, "NinePatchUtil", e.getStackTrace());
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class b<T> implements Consumer<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f10224b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f10225c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f10226d;

        b(boolean z, View view, Runnable runnable) {
            this.f10224b = z;
            this.f10225c = view;
            this.f10226d = runnable;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f10223a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 6502(0x1966, float:9.111E-42)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0038
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f10223a
                r3 = 0
                r4 = 6502(0x1966, float:9.111E-42)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r18
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0038:
                com.bytedance.android.livesdk.chatroom.f.d r0 = com.bytedance.android.livesdk.chatroom.f.d.f10220b
                r1 = 0
                if (r8 == 0) goto L_0x0042
                byte[] r2 = r8.getNinePatchChunk()
                goto L_0x0043
            L_0x0042:
                r2 = r1
            L_0x0043:
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r2
                com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.f.d.f10219a
                r14 = 0
                r15 = 6500(0x1964, float:9.108E-42)
                java.lang.Class[] r3 = new java.lang.Class[r9]
                java.lang.Class<byte[]> r4 = byte[].class
                r3[r10] = r4
                java.lang.Class<android.graphics.Rect> r17 = android.graphics.Rect.class
                r12 = r0
                r16 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r3 == 0) goto L_0x0078
                java.lang.Object[] r1 = new java.lang.Object[r9]
                r1[r10] = r2
                com.meituan.robust.ChangeQuickRedirect r11 = com.bytedance.android.livesdk.chatroom.f.d.f10219a
                r12 = 0
                r13 = 6500(0x1964, float:9.108E-42)
                java.lang.Class[] r14 = new java.lang.Class[r9]
                java.lang.Class<byte[]> r2 = byte[].class
                r14[r10] = r2
                java.lang.Class<android.graphics.Rect> r15 = android.graphics.Rect.class
                r9 = r1
                r10 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                android.graphics.Rect r0 = (android.graphics.Rect) r0
                r6 = r0
                goto L_0x00c1
            L_0x0078:
                if (r2 != 0) goto L_0x007c
            L_0x007a:
                r6 = r1
                goto L_0x00c1
            L_0x007c:
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2)
                java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r0 = r0.order(r2)
                byte r2 = r0.get()
                if (r2 != 0) goto L_0x008f
                goto L_0x007a
            L_0x008f:
                r0.get()
                r0.get()
                r0.get()
                java.lang.String r1 = "byteBuffer"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.getInt()
                r0.getInt()
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                int r2 = r0.getInt()
                r1.left = r2
                int r2 = r0.getInt()
                r1.right = r2
                int r2 = r0.getInt()
                r1.top = r2
                int r0 = r0.getInt()
                r1.bottom = r0
                goto L_0x007a
            L_0x00c1:
                if (r8 == 0) goto L_0x0120
                byte[] r0 = r8.getNinePatchChunk()
                if (r0 == 0) goto L_0x0120
                if (r6 == 0) goto L_0x0120
                android.graphics.drawable.NinePatchDrawable r9 = new android.graphics.drawable.NinePatchDrawable
                android.content.res.Resources r1 = com.bytedance.android.live.core.utils.ac.a()
                byte[] r3 = r8.getNinePatchChunk()
                r5 = 0
                r0 = r9
                r2 = r8
                r4 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 19
                if (r0 < r1) goto L_0x00e7
                boolean r0 = r7.f10224b
                r9.setAutoMirrored(r0)
            L_0x00e7:
                android.view.View r0 = r7.f10225c
                android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
                r0.setBackground(r9)
                boolean r0 = r7.f10224b
                if (r0 == 0) goto L_0x010a
                android.content.Context r0 = com.bytedance.android.live.core.utils.ac.e()
                boolean r0 = com.bytedance.android.live.uikit.d.c.a(r0)
                if (r0 == 0) goto L_0x010a
                android.view.View r0 = r7.f10225c
                int r1 = r6.right
                int r2 = r6.top
                int r3 = r6.left
                int r4 = r6.bottom
                r0.setPadding(r1, r2, r3, r4)
                goto L_0x0117
            L_0x010a:
                android.view.View r0 = r7.f10225c
                int r1 = r6.left
                int r2 = r6.top
                int r3 = r6.right
                int r4 = r6.bottom
                r0.setPadding(r1, r2, r3, r4)
            L_0x0117:
                java.lang.Runnable r0 = r7.f10226d
                if (r0 == 0) goto L_0x011f
                r0.run()
                goto L_0x0131
            L_0x011f:
                return
            L_0x0120:
                if (r8 == 0) goto L_0x012a
                java.lang.String r0 = "NinePatchUtil"
                java.lang.String r1 = "downloaded bitmap is null."
                com.bytedance.android.live.core.c.a.c(r0, r1)
                return
            L_0x012a:
                java.lang.String r0 = "NinePatchUtil"
                java.lang.String r1 = "no ninepatch chunk found in bitmap."
                com.bytedance.android.live.core.c.a.c(r0, r1)
            L_0x0131:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.f.d.b.accept(java.lang.Object):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class c<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10227a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f10228b = new c();

        c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f10227a, false, 6503, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f10227a, false, 6503, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(th, "throwable");
            com.bytedance.android.live.core.c.a.a(6, "NinePatchUtil", th.getStackTrace());
        }
    }

    private d() {
    }

    public final void a(@NotNull ImageModel imageModel, @NotNull View view, boolean z, @Nullable Runnable runnable) {
        String str;
        ImageModel imageModel2 = imageModel;
        View view2 = view;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{imageModel2, view2, Byte.valueOf(z ? (byte) 1 : 0), runnable2}, this, f10219a, false, 6499, new Class[]{ImageModel.class, View.class, Boolean.TYPE, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel2, view2, Byte.valueOf(z), runnable2}, this, f10219a, false, 6499, new Class[]{ImageModel.class, View.class, Boolean.TYPE, Runnable.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(imageModel2, "imageModel");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        if (!Lists.isEmpty(imageModel.getUrls())) {
            List<String> urls = imageModel.getUrls();
            if (urls != null) {
                str = urls.get(0);
            } else {
                str = null;
            }
            Observable.just(0).subscribeOn(Schedulers.io()).map(new a(str)).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(z, view2, runnable2), c.f10228b);
        }
    }
}

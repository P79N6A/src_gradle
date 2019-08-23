package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.m;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdkapi.h.g;
import com.bytedance.android.livesdkapi.h.k;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000e\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0017R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/android/livesdk/gift/effect/entry/view/UserSpecialEntryView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bannerBackground", "Lcom/facebook/drawee/view/SimpleDraweeView;", "bannerText", "Landroid/widget/TextView;", "controllerListener", "com/bytedance/android/livesdk/gift/effect/entry/view/UserSpecialEntryView$controllerListener$1", "Lcom/bytedance/android/livesdk/gift/effect/entry/view/UserSpecialEntryView$controllerListener$1;", "displayDuration", "scrollContent", "Landroid/view/View;", "scrollView", "userHonorBadge", "Lcom/bytedance/android/live/core/widget/HSImageView;", "setupUi", "", "message", "Lcom/bytedance/android/livesdk/gift/effect/entry/model/BaseUserMessage;", "startDisplay", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class UserSpecialEntryView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14869a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f14870e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final View f14871b;

    /* renamed from: c  reason: collision with root package name */
    public final View f14872c;

    /* renamed from: d  reason: collision with root package name */
    public int f14873d;

    /* renamed from: f  reason: collision with root package name */
    private final SimpleDraweeView f14874f;
    private final TextView g;
    private final HSImageView h;
    private final b i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/android/livesdk/gift/effect/entry/view/UserSpecialEntryView$Companion;", "", "()V", "BANNER_HEIGHT_DP", "", "IMAGE_HEIGHT_FALLBACK", "", "IMAGE_WIDTH_FALLBACK", "TAG", "", "setViewWidth", "", "view", "Landroid/view/View;", "widthPx", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14875a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u0013"}, d2 = {"com/bytedance/android/livesdk/gift/effect/entry/view/UserSpecialEntryView$controllerListener$1", "Lcom/facebook/drawee/controller/ControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "onFailure", "", "id", "", "throwable", "", "onFinalImageSet", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "onIntermediateImageFailed", "onIntermediateImageSet", "onRelease", "onSubmit", "callerContext", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class b implements ControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserSpecialEntryView f14877b;

        public final void onFailure(@Nullable String str, @Nullable Throwable th) {
        }

        public final void onIntermediateImageFailed(@Nullable String str, @Nullable Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(@Nullable String str) {
        }

        public final void onSubmit(@Nullable String str, @Nullable Object obj) {
        }

        b(UserSpecialEntryView userSpecialEntryView) {
            this.f14877b = userSpecialEntryView;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            int i;
            int i2;
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f14876a, false, 9522, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f14876a, false, 9522, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                return;
            }
            if (imageInfo != null) {
                i2 = imageInfo.getWidth();
                i = imageInfo.getHeight();
            } else {
                i2 = 0;
                i = 0;
            }
            if (i2 <= 0 || i <= 0) {
                com.bytedance.android.live.core.c.a.c("UserSpecialEntryView", "Invalid image info received: (w=" + i2 + ",h=" + i + ')');
                i2 = 540;
                i = 32;
            }
            float a2 = ((float) ac.a(32.0f)) / ((float) i);
            a aVar = UserSpecialEntryView.f14870e;
            View view = this.f14877b;
            float f2 = ((float) i2) * a2;
            if (!Float.isNaN(f2)) {
                int round = Math.round(f2);
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(round)}, aVar, a.f14875a, false, 9521, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(round)}, aVar2, a.f14875a, false, 9521, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                } else if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = round;
                    }
                    view.requestLayout();
                }
            } else {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/android/live/base/model/ImageModel;", "it", "Lcom/bytedance/android/livesdkapi/message/TextPiece;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class c extends Lambda implements Function1<g, ImageModel> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(1);
        }

        @Nullable
        public final ImageModel invoke(@Nullable g gVar) {
            g gVar2 = gVar;
            if (PatchProxy.isSupport(new Object[]{gVar2}, this, changeQuickRedirect, false, 9523, new Class[]{g.class}, ImageModel.class)) {
                return (ImageModel) PatchProxy.accessDispatch(new Object[]{gVar2}, this, changeQuickRedirect, false, 9523, new Class[]{g.class}, ImageModel.class);
            }
            if (gVar2 != null) {
                k kVar = gVar2.f18792d;
                if (kVar != null) {
                    User user = kVar.f18800a;
                    if (user != null) {
                        m userHonor = user.getUserHonor();
                        if (userHonor != null) {
                            return userHonor.j();
                        }
                    }
                }
            }
            return null;
        }
    }

    @JvmOverloads
    public UserSpecialEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.bytedance.android.livesdkapi.h.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.bytedance.android.livesdkapi.h.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.bytedance.android.livesdkapi.h.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.bytedance.android.livesdkapi.h.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.bytedance.android.livesdkapi.h.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setupUi(@org.jetbrains.annotations.NotNull com.bytedance.android.livesdk.gift.effect.entry.e.a r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f14869a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.entry.e.a> r1 = com.bytedance.android.livesdk.gift.effect.entry.e.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 9517(0x252d, float:1.3336E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f14869a
            r3 = 0
            r4 = 9517(0x252d, float:1.3336E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.entry.e.a> r1 = com.bytedance.android.livesdk.gift.effect.entry.e.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            boolean r0 = r10.b()
            if (r0 != 0) goto L_0x003c
            return
        L_0x003c:
            com.bytedance.android.livesdk.gift.effect.entry.b.a$a r0 = com.bytedance.android.livesdk.gift.effect.entry.b.a.f14816a
            com.bytedance.android.livesdk.message.model.as$a r1 = r10.l
            java.lang.String r2 = "message.effectConfig"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.bytedance.android.live.base.model.ImageModel r1 = r1.f16494e
            java.lang.String r2 = "message.effectConfig.textIcon"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r0 = r0.a((com.bytedance.android.live.base.model.ImageModel) r1)
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x005e
            int r1 = r1.length()
            if (r1 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r1 = 0
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            if (r1 == 0) goto L_0x0062
            return
        L_0x0062:
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r1 = com.facebook.drawee.backends.pipeline.Fresco.newDraweeControllerBuilder()
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = r1.setUri((java.lang.String) r0)
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r0.setAutoPlayAnimations(r7)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r0
            com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView$b r1 = r9.i
            com.facebook.drawee.controller.ControllerListener r1 = (com.facebook.drawee.controller.ControllerListener) r1
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r0.setControllerListener(r1)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r0
            com.facebook.drawee.controller.AbstractDraweeController r0 = r0.build()
            com.facebook.drawee.view.SimpleDraweeView r1 = r9.f14874f
            if (r1 == 0) goto L_0x0087
            com.facebook.drawee.interfaces.DraweeController r0 = (com.facebook.drawee.interfaces.DraweeController) r0
            r1.setController(r0)
        L_0x0087:
            com.bytedance.android.livesdk.message.model.as$a r0 = r10.l
            java.lang.String r1 = "message.effectConfig"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.bytedance.android.livesdkapi.h.e r0 = r0.f16492c
            r1 = 0
            if (r0 == 0) goto L_0x009a
            java.lang.String r2 = r0.f18783b
            android.text.Spannable r2 = com.bytedance.android.livesdk.chatroom.e.y.a((java.lang.String) r2, (com.bytedance.android.livesdkapi.h.e) r0)
            goto L_0x009b
        L_0x009a:
            r2 = r1
        L_0x009b:
            android.widget.TextView r3 = r9.g
            if (r3 == 0) goto L_0x00a4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
        L_0x00a4:
            com.bytedance.android.livesdk.message.model.as$a r2 = r10.l
            java.lang.String r3 = "message.effectConfig"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            int r2 = r2.f16495f
            r9.f14873d = r2
            com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView$c r2 = com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView.c.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            if (r0 == 0) goto L_0x00e9
            java.util.List<com.bytedance.android.livesdkapi.h.g> r0 = r0.f18785d
            if (r0 == 0) goto L_0x00e9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00bf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00e7
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.bytedance.android.livesdkapi.h.g r4 = (com.bytedance.android.livesdkapi.h.g) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            int r5 = r4.f18789a
            com.bytedance.android.livesdkapi.h.d r6 = com.bytedance.android.livesdkapi.h.d.USER
            int r6 = r6.getPieceType()
            if (r5 != r6) goto L_0x00e3
            java.lang.Object r4 = r2.invoke(r4)
            if (r4 == 0) goto L_0x00e3
            r4 = 1
            goto L_0x00e4
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            if (r4 == 0) goto L_0x00bf
            r1 = r3
        L_0x00e7:
            com.bytedance.android.livesdkapi.h.g r1 = (com.bytedance.android.livesdkapi.h.g) r1
        L_0x00e9:
            java.lang.Object r0 = r2.invoke(r1)
            com.bytedance.android.live.base.model.ImageModel r0 = (com.bytedance.android.live.base.model.ImageModel) r0
            if (r0 == 0) goto L_0x00fa
            com.bytedance.android.live.core.widget.HSImageView r1 = r9.h
            if (r1 == 0) goto L_0x00f9
            com.bytedance.android.livesdk.chatroom.f.b.a((com.bytedance.android.live.core.widget.HSImageView) r1, (com.bytedance.android.live.base.model.ImageModel) r0)
            goto L_0x0104
        L_0x00f9:
            return
        L_0x00fa:
            com.bytedance.android.live.core.widget.HSImageView r0 = r9.h
            if (r0 == 0) goto L_0x0104
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView.setupUi(com.bytedance.android.livesdk.gift.effect.entry.e.a):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserSpecialEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(C0906R.layout.aoh, this);
        this.f14874f = (SimpleDraweeView) findViewById(C0906R.id.jb);
        this.f14871b = findViewById(C0906R.id.jl);
        this.f14872c = findViewById(C0906R.id.jd);
        this.g = (TextView) findViewById(C0906R.id.jn);
        this.h = (HSImageView) findViewById(C0906R.id.jo);
        this.i = new b(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public /* synthetic */ UserSpecialEntryView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}

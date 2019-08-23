package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.h;
import com.ss.android.ugc.playerkit.videoview.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010'\u001a\u00020\u001dH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/guide/PixaloopStickerGuideDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "faceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "stickerGuideData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/guide/PixaloopStickerGuideData;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/guide/PixaloopStickerGuideData;)V", "hintTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "imageView", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "isValidData", "", "()Z", "loadingLayout", "Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;", "mVideo", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "mainHandler", "Landroid/os/Handler;", "pixaloopVideoPlayAdapter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/guide/PixaloopVideoPlayAdapter;", "videoView", "Lcom/ss/android/ugc/playerkit/videoview/KeepSurfaceTextureView;", "videoViewComponent", "Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "dismiss", "", "initVideo", "initVideoListener", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "playVideo", "playerRelease", "setMainHandler", "show", "showOrHideLoadingView", "isShow", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69399a = null;

    /* renamed from: d  reason: collision with root package name */
    public static final String f69400d = f69400d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f69401e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public AnimatedImageView f69402b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f69403c;

    /* renamed from: f  reason: collision with root package name */
    private DmtLoadingLayout f69404f;
    private KeepSurfaceTextureView g;
    private VideoViewComponent h;
    private DmtTextView i;
    private Video j;
    private d k;
    private final FaceStickerBean l;
    private final a m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/guide/PixaloopStickerGuideDialog$Companion;", "", "()V", "KEY_SHOW_GUIDE", "", "isShow", "", "faceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69405a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/guide/PixaloopStickerGuideDialog$initVideo$1", "Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "onSurfaceAvailable", "", "width", "", "height", "onSurfaceDestroyed", "onSurfaceTextureSizeChanged", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b$b  reason: collision with other inner class name */
    public static final class C0729b implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f69407b;

        public final void a(int i, int i2) {
        }

        public final void b(int i, int i2) {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f69406a, false, 78964, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69406a, false, 78964, new Class[0], Void.TYPE);
                return;
            }
            if (this.f69407b.f69402b != null) {
                AnimatedImageView animatedImageView = this.f69407b.f69402b;
                if (animatedImageView == null) {
                    Intrinsics.throwNpe();
                }
                animatedImageView.setVisibility(0);
            }
        }

        C0729b(b bVar) {
            this.f69407b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/guide/PixaloopStickerGuideDialog$initVideoListener$1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/guide/PixaloopVideoPlayAdapter;", "onPlayFailed", "", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onRenderFirstFrame", "sourceId", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f69409b;

        c(b bVar) {
            this.f69409b = bVar;
        }

        public final void a(@NotNull com.ss.android.ugc.aweme.video.b.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f69408a, false, 78966, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f69408a, false, 78966, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "sourceId");
            this.f69409b.a(false);
            if (this.f69409b.f69402b != null) {
                AnimatedImageView animatedImageView = this.f69409b.f69402b;
                if (animatedImageView == null) {
                    Intrinsics.throwNpe();
                }
                animatedImageView.setVisibility(8);
            }
        }

        public final void a(@NotNull com.ss.android.ugc.aweme.video.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f69408a, false, 78965, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f69408a, false, 78965, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            this.f69409b.a(false);
            if (this.f69409b.f69402b != null) {
                AnimatedImageView animatedImageView = this.f69409b.f69402b;
                if (animatedImageView == null) {
                    Intrinsics.throwNpe();
                }
                animatedImageView.setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f69411b;

        d(b bVar) {
            this.f69411b = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f69410a, false, 78967, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f69410a, false, 78967, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f69411b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f69413b;

        e(b bVar) {
            this.f69413b = bVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f69412a, false, 78968, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69412a, false, 78968, new Class[0], Void.TYPE);
                return;
            }
            this.f69413b.a(false);
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f69399a, false, 78961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69399a, false, 78961, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f69399a, false, 78958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69399a, false, 78958, new Class[0], Void.TYPE);
        } else if (this.h != null) {
            if (this.k != null) {
                VideoViewComponent videoViewComponent = this.h;
                if (videoViewComponent == null) {
                    Intrinsics.throwNpe();
                }
                videoViewComponent.b((com.ss.android.ugc.aweme.video.a.a) this.k);
            }
            VideoViewComponent videoViewComponent2 = this.h;
            if (videoViewComponent2 == null) {
                Intrinsics.throwNpe();
            }
            videoViewComponent2.a();
        }
        c.a(this);
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f69399a, false, 78960, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69399a, false, 78960, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            String a2 = com.ss.android.ugc.aweme.port.in.a.o.a(f69400d, "");
            com.ss.android.ugc.aweme.port.in.a.o.b(f69400d, a2 + String.valueOf(this.l.getStickerId()) + ",");
        }
        super.show();
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69399a, false, 78959, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69399a, false, 78959, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f69404f != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f69404f;
            if (dmtLoadingLayout == null) {
                Intrinsics.throwNpe();
            }
            if (!z) {
                i2 = 8;
            }
            dmtLoadingLayout.setVisibility(i2);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69399a, false, 78953, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f69399a, false, 78953, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.a8r);
        Window window = getWindow();
        if (window == null) {
            Intrinsics.throwNpe();
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            Intrinsics.throwNpe();
        }
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "drawable.paint");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            Intrinsics.throwNpe();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(true);
        findViewById(C0906R.id.ci4).setOnClickListener(new d(this));
        if (PatchProxy.isSupport(new Object[0], this, f69399a, false, 78954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69399a, false, 78954, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            a aVar = this.m;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f69392a, false, 78947, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar, a.f69392a, false, 78947, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (TextUtils.isEmpty(aVar.b()) || TextUtils.isEmpty(aVar.a())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.g = (KeepSurfaceTextureView) findViewById(C0906R.id.dt9);
                this.f69402b = (AnimatedImageView) findViewById(C0906R.id.b2e);
                this.f69404f = (DmtLoadingLayout) findViewById(C0906R.id.bjl);
                this.i = (DmtTextView) findViewById(C0906R.id.zd);
                View findViewById = findViewById(C0906R.id.dsa);
                if (Build.VERSION.SDK_INT >= 21) {
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "videoLayout");
                    AnimatedImageView animatedImageView = this.f69402b;
                    if (animatedImageView == null) {
                        Intrinsics.throwNpe();
                    }
                    findViewById.setOutlineProvider(new com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.a((int) UIUtils.dip2Px(animatedImageView.getContext(), 4.0f)));
                    findViewById.setClipToOutline(true);
                }
                View findViewById2 = findViewById(C0906R.id.bl3);
                Drawable a2 = bc.a(-1, -1, 0, (int) UIUtils.dip2Px(getContext(), 4.0f));
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootLayout");
                findViewById2.setBackground(a2);
                Drawable a3 = bc.a(303437859, 303437859, 0, 0);
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                GenericDraweeHierarchy build = new GenericDraweeHierarchyBuilder(context.getResources()).build();
                build.setPlaceholderImage(a3);
                build.setFailureImage(a3);
                AnimatedImageView animatedImageView2 = this.f69402b;
                if (animatedImageView2 == null) {
                    Intrinsics.throwNpe();
                }
                animatedImageView2.setHierarchy(build);
                if (this.m != null) {
                    if (!TextUtils.isEmpty(this.m.b())) {
                        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f69402b, this.m.b());
                    }
                    if (TextUtils.isEmpty(this.m.f69395d)) {
                        DmtTextView dmtTextView = this.i;
                        if (dmtTextView == null) {
                            Intrinsics.throwNpe();
                        }
                        dmtTextView.setVisibility(8);
                    } else {
                        DmtTextView dmtTextView2 = this.i;
                        if (dmtTextView2 == null) {
                            Intrinsics.throwNpe();
                        }
                        dmtTextView2.setVisibility(0);
                        DmtTextView dmtTextView3 = this.i;
                        if (dmtTextView3 == null) {
                            Intrinsics.throwNpe();
                        }
                        dmtTextView3.setText(this.m.f69395d);
                    }
                }
                if (PatchProxy.isSupport(new Object[0], this, f69399a, false, 78956, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69399a, false, 78956, new Class[0], Void.TYPE);
                } else {
                    this.k = new c(this);
                }
                if (PatchProxy.isSupport(new Object[0], this, f69399a, false, 78955, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69399a, false, 78955, new Class[0], Void.TYPE);
                    return;
                }
                KeepSurfaceTextureView keepSurfaceTextureView = this.g;
                if (keepSurfaceTextureView == null) {
                    Intrinsics.throwNpe();
                }
                h a4 = h.a(keepSurfaceTextureView);
                this.h = new VideoViewComponent();
                VideoViewComponent videoViewComponent = this.h;
                if (videoViewComponent == null) {
                    Intrinsics.throwNpe();
                }
                KeepSurfaceTextureView keepSurfaceTextureView2 = this.g;
                if (keepSurfaceTextureView2 == null) {
                    Intrinsics.throwNpe();
                }
                videoViewComponent.a(keepSurfaceTextureView2);
                VideoViewComponent videoViewComponent2 = this.h;
                if (videoViewComponent2 == null) {
                    Intrinsics.throwNpe();
                }
                videoViewComponent2.a((com.ss.android.ugc.aweme.video.a.a) this.k);
                a4.a((i) new C0729b(this));
                if (PatchProxy.isSupport(new Object[0], this, f69399a, false, 78957, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69399a, false, 78957, new Class[0], Void.TYPE);
                    return;
                }
                if (this.h != null) {
                    if (PatchProxy.isSupport(new Object[0], this, f69399a, false, 78951, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f69399a, false, 78951, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (this.m == null || TextUtils.isEmpty(this.m.a())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        if (this.j == null) {
                            this.j = new Video();
                            VideoUrlModel videoUrlModel = new VideoUrlModel();
                            videoUrlModel.setH265(false);
                            ArrayList arrayList = new ArrayList();
                            a aVar2 = this.m;
                            if (aVar2 == null) {
                                Intrinsics.throwNpe();
                            }
                            String a5 = aVar2.a();
                            if (a5 == null) {
                                Intrinsics.throwNpe();
                            }
                            arrayList.add(a5);
                            videoUrlModel.setUrlList(arrayList);
                            videoUrlModel.setUrlKey(this.m.f69394c);
                            videoUrlModel.setUri(this.m.f69394c);
                            Video video = this.j;
                            if (video == null) {
                                Intrinsics.throwNpe();
                            }
                            video.setPlayAddr(videoUrlModel);
                            Video video2 = this.j;
                            if (video2 == null) {
                                Intrinsics.throwNpe();
                            }
                            video2.setSourceId(this.m.f69394c);
                        }
                        a(true);
                        VideoViewComponent videoViewComponent3 = this.h;
                        if (videoViewComponent3 == null) {
                            Intrinsics.throwNpe();
                        }
                        Video video3 = this.j;
                        if (video3 == null) {
                            Intrinsics.throwNpe();
                        }
                        videoViewComponent3.a(video3);
                        if (this.f69403c != null) {
                            Handler handler = this.f69403c;
                            if (handler == null) {
                                Intrinsics.throwNpe();
                            }
                            handler.postDelayed(new e(this), 5000);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @Nullable FaceStickerBean faceStickerBean, @Nullable a aVar) {
        super(context, C0906R.style.gc);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.l = faceStickerBean;
        this.m = aVar;
    }
}

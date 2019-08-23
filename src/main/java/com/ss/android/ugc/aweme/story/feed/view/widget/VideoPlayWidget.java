package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.sticker.c;
import com.ss.android.ugc.aweme.story.player.view.KeepSurfaceTextureView;
import com.ss.android.ugc.aweme.story.player.view.VideoPlayView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0014J\u0010\u00107\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0014J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000209J\b\u0010;\u001a\u000205H\u0002J\u0012\u0010<\u001a\u0002052\b\u0010=\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010>\u001a\u0002052\b\u0010+\u001a\u0004\u0018\u00010,J\u0012\u0010?\u001a\u0002052\b\u0010=\u001a\u0004\u0018\u00010&H\u0014J\b\u0010@\u001a\u000205H\u0016J\b\u0010A\u001a\u000205H\u0016J\u0006\u0010B\u001a\u000205J\u0006\u0010C\u001a\u000205J\u0006\u0010D\u001a\u000205J\u0016\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020FJ\u0006\u0010H\u001a\u000205R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*¨\u0006I"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/view/widget/VideoPlayWidget;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/LifecycleOwnerWidget;", "fragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "eventParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerEventParams;", "getEventParams", "()Lcom/ss/android/ugc/aweme/sticker/InteractStickerEventParams;", "setEventParams", "(Lcom/ss/android/ugc/aweme/sticker/InteractStickerEventParams;)V", "getFragment", "()Landroid/support/v4/app/Fragment;", "mCover", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "getMCover", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "setMCover", "(Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;)V", "mData", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "getMData", "()Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "setMData", "(Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;)V", "mTextureView", "Lcom/ss/android/ugc/aweme/story/player/view/KeepSurfaceTextureView;", "getMTextureView", "()Lcom/ss/android/ugc/aweme/story/player/view/KeepSurfaceTextureView;", "setMTextureView", "(Lcom/ss/android/ugc/aweme/story/player/view/KeepSurfaceTextureView;)V", "mVideoPlayView", "Lcom/ss/android/ugc/aweme/story/player/view/VideoPlayView;", "getMVideoPlayView", "()Lcom/ss/android/ugc/aweme/story/player/view/VideoPlayView;", "setMVideoPlayView", "(Lcom/ss/android/ugc/aweme/story/player/view/VideoPlayView;)V", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "stickerWidget", "Lcom/ss/android/ugc/aweme/arch/widgets/base/Widget;", "getStickerWidget", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/Widget;", "setStickerWidget", "(Lcom/ss/android/ugc/aweme/arch/widgets/base/Widget;)V", "sticketLayout", "getSticketLayout", "setSticketLayout", "bind", "", "awemeWithComment", "bindPoiStickerData", "getHeight", "", "getWidth", "initVideoData", "initView", "view", "initWidget", "onBindView", "onCreate", "onPause", "resumePlay", "tryPausePlay", "tryPlay", "isAutoPlay", "", "isReadWhenPageSelected", "tryStop", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoPlayWidget extends LifecycleOwnerWidget {
    public static ChangeQuickRedirect k;
    @Nullable
    public KeepSurfaceTextureView l;
    @Nullable
    public AnimatedImageView m;
    @Nullable
    public VideoPlayView n;
    @Nullable
    public com.ss.android.ugc.aweme.story.api.model.b o;
    @Nullable
    public View p;
    @Nullable
    public Widget q;
    @Nullable
    public View r;
    @Nullable
    public c s;
    @NotNull
    public final Fragment t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/ugc/aweme/story/feed/view/widget/VideoPlayWidget$bind$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "v", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72957a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPlayWidget f72958b;

        public a(VideoPlayWidget videoPlayWidget) {
            this.f72958b = videoPlayWidget;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x019b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLayoutChange(@org.jetbrains.annotations.Nullable android.view.View r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
            /*
                r19 = this;
                r7 = r19
                r9 = 9
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r20
                java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
                r11 = 1
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r12 = 2
                r0[r12] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
                r13 = 3
                r0[r13] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
                r14 = 4
                r0[r14] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
                r15 = 5
                r0[r15] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
                r16 = 6
                r0[r16] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
                r17 = 7
                r0[r17] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
                r18 = 8
                r0[r18] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f72957a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r13] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r14] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r15] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r16] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r17] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r18] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 84374(0x14996, float:1.18233E-40)
                r1 = r19
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x00ee
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r20
                java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r0[r12] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
                r0[r13] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
                r0[r14] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
                r0[r15] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
                r0[r16] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
                r0[r17] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
                r0[r18] = r1
                com.meituan.robust.ChangeQuickRedirect r1 = f72957a
                r2 = 0
                r3 = 84374(0x14996, float:1.18233E-40)
                java.lang.Class[] r4 = new java.lang.Class[r9]
                java.lang.Class<android.view.View> r5 = android.view.View.class
                r4[r10] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r11] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r12] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r13] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r14] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r15] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r16] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r17] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r18] = r5
                java.lang.Class r5 = java.lang.Void.TYPE
                r20 = r0
                r21 = r19
                r22 = r1
                r23 = r2
                r24 = r3
                r25 = r4
                r26 = r5
                com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
                return
            L_0x00ee:
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r0 = r7.f72958b
                android.view.View r0 = r0.p
                if (r0 == 0) goto L_0x00fa
                r1 = r7
                android.view.View$OnLayoutChangeListener r1 = (android.view.View.OnLayoutChangeListener) r1
                r0.removeOnLayoutChangeListener(r1)
            L_0x00fa:
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r0 = r7.f72958b
                com.ss.android.ugc.aweme.story.api.model.b r0 = r0.o
                if (r0 == 0) goto L_0x0111
                com.ss.android.ugc.aweme.story.api.model.LifeStory r0 = r0.getLifeStory()
                if (r0 == 0) goto L_0x0111
                com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
                if (r0 == 0) goto L_0x0111
                int r0 = r0.getWidth()
                goto L_0x0112
            L_0x0111:
                r0 = 0
            L_0x0112:
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r1 = r7.f72958b
                com.ss.android.ugc.aweme.story.api.model.b r1 = r1.o
                if (r1 == 0) goto L_0x0129
                com.ss.android.ugc.aweme.story.api.model.LifeStory r1 = r1.getLifeStory()
                if (r1 == 0) goto L_0x0129
                com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
                if (r1 == 0) goto L_0x0129
                int r1 = r1.getHeight()
                goto L_0x012a
            L_0x0129:
                r1 = 0
            L_0x012a:
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r2 = r7.f72958b
                int r2 = r2.e()
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r3 = r7.f72958b
                int r3 = r3.f()
                android.view.View[] r4 = new android.view.View[r12]
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r5 = r7.f72958b
                com.ss.android.ugc.aweme.story.player.view.KeepSurfaceTextureView r5 = r5.l
                android.view.View r5 = (android.view.View) r5
                r4[r10] = r5
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r5 = r7.f72958b
                com.ss.android.ugc.aweme.base.ui.AnimatedImageView r5 = r5.m
                android.view.View r5 = (android.view.View) r5
                r4[r11] = r5
                com.ss.android.ugc.aweme.story.feed.c.d.a((int) r0, (int) r1, (int) r2, (int) r3, (android.view.View[]) r4)
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r0 = r7.f72958b
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r1 = r7.f72958b
                com.ss.android.ugc.aweme.story.api.model.b r1 = r1.o
                java.lang.Object[] r2 = new java.lang.Object[r11]
                r2[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget.k
                r4 = 0
                r5 = 84368(0x14990, float:1.18225E-40)
                java.lang.Class[] r6 = new java.lang.Class[r11]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r8 = com.ss.android.ugc.aweme.story.api.model.b.class
                r6[r10] = r8
                java.lang.Class r8 = java.lang.Void.TYPE
                r20 = r2
                r21 = r0
                r22 = r3
                r23 = r4
                r24 = r5
                r25 = r6
                r26 = r8
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r20, r21, r22, r23, r24, r25, r26)
                if (r2 == 0) goto L_0x019b
                java.lang.Object[] r2 = new java.lang.Object[r11]
                r2[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget.k
                r3 = 0
                r4 = 84368(0x14990, float:1.18225E-40)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r6 = com.ss.android.ugc.aweme.story.api.model.b.class
                r5[r10] = r6
                java.lang.Class r6 = java.lang.Void.TYPE
                r20 = r2
                r21 = r0
                r22 = r1
                r23 = r3
                r24 = r4
                r25 = r5
                r26 = r6
                com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
                return
            L_0x019b:
                if (r1 == 0) goto L_0x01ac
                com.ss.android.ugc.aweme.story.player.view.KeepSurfaceTextureView r2 = r0.l
                if (r2 == 0) goto L_0x01ac
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget$b r3 = new com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget$b
                r3.<init>(r0, r1)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                r2.post(r3)
                return
            L_0x01ac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget.a.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPlayWidget f72960b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.api.model.b f72961c;

        b(VideoPlayWidget videoPlayWidget, com.ss.android.ugc.aweme.story.api.model.b bVar) {
            this.f72960b = videoPlayWidget;
            this.f72961c = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f72959a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 84375(0x14997, float:1.18235E-40)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f72959a
                r5 = 0
                r6 = 84375(0x14997, float:1.18235E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r1 = r9.f72960b
                android.view.View r1 = r1.r
                r2 = 0
                if (r1 == 0) goto L_0x0031
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                goto L_0x0032
            L_0x0031:
                r1 = r2
            L_0x0032:
                if (r1 == 0) goto L_0x004a
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r3 = r9.f72960b
                com.ss.android.ugc.aweme.story.player.view.KeepSurfaceTextureView r3 = r3.l
                if (r3 == 0) goto L_0x0043
                int r3 = r3.getWidth()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x0044
            L_0x0043:
                r3 = r2
            L_0x0044:
                int r3 = r3.intValue()
                r1.width = r3
            L_0x004a:
                if (r1 == 0) goto L_0x0060
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r3 = r9.f72960b
                com.ss.android.ugc.aweme.story.player.view.KeepSurfaceTextureView r3 = r3.l
                if (r3 == 0) goto L_0x005a
                int r2 = r3.getHeight()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L_0x005a:
                int r2 = r2.intValue()
                r1.height = r2
            L_0x0060:
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r2 = r9.f72960b
                android.view.View r2 = r2.r
                if (r2 == 0) goto L_0x0069
                r2.setLayoutParams(r1)
            L_0x0069:
                com.ss.android.ugc.aweme.story.api.model.b r1 = r9.f72961c
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r2 = r9.f72960b
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r2.g
                java.lang.String r3 = "mDataCenter"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget$b$1 r3 = new com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget$b$1
                r3.<init>(r9)
                com.ss.android.ugc.aweme.sticker.a.a r3 = (com.ss.android.ugc.aweme.sticker.a.a) r3
                com.ss.android.ugc.aweme.story.feed.view.e r4 = new com.ss.android.ugc.aweme.story.feed.view.e
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r5 = r9.f72960b
                com.ss.android.ugc.aweme.story.api.model.b r5 = r5.o
                if (r5 == 0) goto L_0x0094
                com.ss.android.ugc.aweme.story.api.model.LifeStory r5 = r5.getLifeStory()
                if (r5 == 0) goto L_0x0094
                com.ss.android.ugc.aweme.feed.model.Video r5 = r5.getVideo()
                if (r5 == 0) goto L_0x0094
                int r5 = r5.getWidth()
                goto L_0x0095
            L_0x0094:
                r5 = 0
            L_0x0095:
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r6 = r9.f72960b
                com.ss.android.ugc.aweme.story.api.model.b r6 = r6.o
                if (r6 == 0) goto L_0x00ab
                com.ss.android.ugc.aweme.story.api.model.LifeStory r6 = r6.getLifeStory()
                if (r6 == 0) goto L_0x00ab
                com.ss.android.ugc.aweme.feed.model.Video r6 = r6.getVideo()
                if (r6 == 0) goto L_0x00ab
                int r0 = r6.getHeight()
            L_0x00ab:
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r6 = r9.f72960b
                int r6 = r6.e()
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r7 = r9.f72960b
                int r7 = r7.f()
                r4.<init>(r5, r0, r6, r7)
                com.ss.android.ugc.aweme.sticker.a.b r4 = (com.ss.android.ugc.aweme.sticker.a.b) r4
                com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget r0 = r9.f72960b
                com.ss.android.ugc.aweme.sticker.c r0 = r0.s
                com.ss.android.ugc.aweme.story.c.a.a(r1, r2, r3, r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget.b.run():void");
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84371, new Class[0], Void.TYPE);
            return;
        }
        VideoPlayView videoPlayView = this.n;
        if (videoPlayView != null) {
            videoPlayView.c();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84372, new Class[0], Void.TYPE);
            return;
        }
        VideoPlayView videoPlayView = this.n;
        if (videoPlayView != null) {
            videoPlayView.b();
        }
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84359, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84361, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        Widget widget = this.q;
        if (widget != null) {
            ((com.ss.android.ugc.aweme.sticker.a) widget).f();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.IInteractStickerWidget");
    }

    public final int e() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84369, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 84369, new Class[0], Integer.TYPE)).intValue();
        }
        View view = this.p;
        if (view != null) {
            i = view.getMeasuredWidth();
        }
        if (i == 0) {
            i = UIUtils.getScreenWidth(this.t.getContext());
        }
        return i;
    }

    public final int f() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84370, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 84370, new Class[0], Integer.TYPE)).intValue();
        }
        View view = this.p;
        if (view != null) {
            i = view.getMeasuredHeight();
        }
        if (i == 0) {
            int screenHeight = UIUtils.getScreenHeight(this.t.getContext());
            com.ss.android.ugc.aweme.story.base.utils.b a2 = com.ss.android.ugc.aweme.story.base.utils.b.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "StoryAllScreenAdaptationV2.getInstance()");
            i = screenHeight - a2.e();
        }
        com.ss.android.ugc.aweme.story.base.utils.b a3 = com.ss.android.ugc.aweme.story.base.utils.b.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "StoryAllScreenAdaptationV2.getInstance()");
        if (a3.b()) {
            i = UIUtils.getScreenHeight(this.t.getContext());
            com.ss.android.ugc.aweme.story.base.utils.b a4 = com.ss.android.ugc.aweme.story.base.utils.b.a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "StoryAllScreenAdaptationV2.getInstance()");
            a4.c();
            com.ss.android.ugc.aweme.story.base.utils.b a5 = com.ss.android.ugc.aweme.story.base.utils.b.a();
            Intrinsics.checkExpressionValueIsNotNull(a5, "StoryAllScreenAdaptationV2.getInstance()");
            a5.d();
            com.ss.android.ugc.aweme.story.base.utils.b a6 = com.ss.android.ugc.aweme.story.base.utils.b.a();
            Intrinsics.checkExpressionValueIsNotNull(a6, "StoryAllScreenAdaptationV2.getInstance()");
            a6.e();
        }
        return i;
    }

    public VideoPlayWidget(@NotNull Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.t = fragment;
    }

    public final void a(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 84360, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 84360, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        if (view != null) {
            LayoutInflater from = LayoutInflater.from(view.getContext());
            if (view != null) {
                from.inflate(C0906R.layout.ase, (ViewGroup) view);
                if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 84363, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 84363, new Class[]{View.class}, Void.TYPE);
                } else if (view != null) {
                    this.l = (KeepSurfaceTextureView) view.findViewById(C0906R.id.d29);
                    this.m = (AnimatedImageView) view.findViewById(C0906R.id.b08);
                    this.r = view.findViewById(C0906R.id.av6);
                    this.n = new VideoPlayView(this.t, this.l);
                    VideoPlayView videoPlayView = this.n;
                    if (videoPlayView != null) {
                        videoPlayView.f4170e = this.m;
                    }
                }
                this.p = view;
                Widget widget = this.q;
                if (PatchProxy.isSupport(new Object[]{widget}, this, k, false, 84362, new Class[]{Widget.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{widget}, this, k, false, 84362, new Class[]{Widget.class}, Void.TYPE);
                } else {
                    if (widget != null) {
                        d().a((int) C0906R.id.av6, widget);
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, k, false, 84373, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, k, false, 84373, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        VideoPlayView videoPlayView = this.n;
        if (videoPlayView != null) {
            videoPlayView.a(z, z2);
        }
    }
}

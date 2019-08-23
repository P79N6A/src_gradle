package com.ss.android.ugc.aweme.longvideonew.widget;

import android.animation.AnimatorSet;
import android.arch.lifecycle.Observer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.longvideonew.d;
import com.ss.android.ugc.aweme.longvideonew.feature.VolumeController;
import com.ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u00016B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0012\u00100\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u00102\u001a\u00020-2\b\u00103\u001a\u0004\u0018\u00010/H\u0016J\b\u00104\u001a\u00020-H\u0016J\b\u00105\u001a\u00020-H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/widget/VideoFunctionalLayerWidget;", "Lcom/ss/android/ugc/aweme/utils/GenericWidget;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "Landroid/view/View$OnClickListener;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mEventType", "", "mPageType", "", "mBusinessType", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;ILjava/lang/String;)V", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMBusinessType", "()Ljava/lang/String;", "mCoverImg", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "getMCoverImg", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "setMCoverImg", "(Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;)V", "getMEventType", "getMPageType", "()I", "mPlayLoadingView", "Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;", "getMPlayLoadingView", "()Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;", "setMPlayLoadingView", "(Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;)V", "mReplayImg", "Landroid/widget/ImageView;", "getMReplayImg", "()Landroid/widget/ImageView;", "setMReplayImg", "(Landroid/widget/ImageView;)V", "mVolumeController", "Lcom/ss/android/ugc/aweme/longvideonew/feature/VolumeController;", "getMVolumeController", "()Lcom/ss/android/ugc/aweme/longvideonew/feature/VolumeController;", "setMVolumeController", "(Lcom/ss/android/ugc/aweme/longvideonew/feature/VolumeController;)V", "onBindView", "", "view", "Landroid/view/View;", "onChanged", "t", "onClick", "v", "onCreate", "onDestroy", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoFunctionalLayerWidget extends GenericWidget implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54086a;
    public static final a r = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public ImageView f54087b;
    @Nullable
    public AnimatedImageView k;
    @Nullable
    public LineProgressBar l;
    @Nullable
    public VolumeController m;
    @Nullable
    public final Aweme n;
    @NotNull
    public final String o;
    public final int p;
    @NotNull
    public final String q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/widget/VideoFunctionalLayerWidget$Companion;", "", "()V", "ACTION_REPLAY", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f54086a, false, 56972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54086a, false, 56972, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        Observer observer = this;
        this.g.a("action_video_on_play_completed", observer).a("action_video_on_resume_play", observer).a("action_video_on_pause_play", observer).a("action_video_on_prepare_play", observer).a("action_video_on_play_fail", observer).a("action_video_on_buffering", observer).a("action_video_on_render_ready", observer).a("on_render_first_frame", observer).a("action_seek_stop_tracking_touch", observer).a("action_keycode_volume_down", observer).a("action_keycode_volume_up", observer);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f54086a, false, 56974, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54086a, false, 56974, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        LineProgressBar lineProgressBar = this.l;
        if (lineProgressBar != null) {
            lineProgressBar.c();
        }
        VolumeController volumeController = this.m;
        if (volumeController != null) {
            if (PatchProxy.isSupport(new Object[0], volumeController, VolumeController.f54053a, false, 56937, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], volumeController, VolumeController.f54053a, false, 56937, new Class[0], Void.TYPE);
            } else {
                AnimatorSet animatorSet = volumeController.f54054b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = volumeController.f54055c;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                AnimatorSet animatorSet3 = volumeController.f54056d;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
            }
        }
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54086a, false, 56976, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54086a, false, 56976, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.b4c) {
            bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
            ImageView imageView = this.f54087b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.g.a("action_replay", (Object) "replay");
        }
    }

    public final void a(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f54086a, false, 56973, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54086a, false, 56973, new Class[]{View.class}, Void.TYPE);
        } else if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            UrlModel urlModel = null;
            View inflate = LayoutInflater.from(c()).inflate(C0906R.layout.a9u, null, false);
            if (inflate != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                viewGroup.addView(frameLayout);
                this.k = (AnimatedImageView) frameLayout.findViewById(C0906R.id.a1a);
                AnimatedImageView animatedImageView = this.k;
                if (animatedImageView != null) {
                    animatedImageView.setVisibility(0);
                }
                if ("long_video_player_activity".equals(this.q)) {
                    d.f54037b.a(this.n);
                }
                Video a2 = d.f54036a.a(this.n);
                AnimatedImageView animatedImageView2 = this.k;
                if (animatedImageView2 != null) {
                    if (a2 != null) {
                        urlModel = a2.getOriginCover();
                    }
                    animatedImageView2.a(urlModel);
                }
                View findViewById = frameLayout.findViewById(C0906R.id.gk);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "funLayerContainer.findViewById(R.id.audio_view)");
                this.m = new VolumeController((AudioControlView) findViewById);
                this.l = (LineProgressBar) frameLayout.findViewById(C0906R.id.bym);
                LineProgressBar lineProgressBar = this.l;
                if (lineProgressBar != null) {
                    lineProgressBar.a();
                }
                this.f54087b = (ImageView) frameLayout.findViewById(C0906R.id.b4c);
                ImageView imageView = this.f54087b;
                if (imageView != null) {
                    imageView.setOnClickListener(this);
                }
                ImageView imageView2 = this.f54087b;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54086a, false, 56975, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f54086a, false, 56975, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            str = aVar.f34376a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1294386419:
                    if (str.equals("action_video_on_render_ready")) {
                        LineProgressBar lineProgressBar = this.l;
                        if (lineProgressBar != null) {
                            lineProgressBar.b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -1235492779:
                    if (str.equals("on_render_first_frame")) {
                        AnimatedImageView animatedImageView = this.k;
                        if (animatedImageView != null) {
                            animatedImageView.setVisibility(8);
                        }
                        return;
                    }
                    break;
                case -809540112:
                    if (str.equals("action_video_on_pause_play")) {
                        LineProgressBar lineProgressBar2 = this.l;
                        if (lineProgressBar2 != null) {
                            lineProgressBar2.b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -517056298:
                    if (str.equals("action_video_on_play_fail")) {
                        LineProgressBar lineProgressBar3 = this.l;
                        if (lineProgressBar3 != null) {
                            lineProgressBar3.b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -411372444:
                    if (str.equals("action_keycode_volume_up")) {
                        VolumeController volumeController = this.m;
                        if (volumeController != null) {
                            Object a2 = aVar.a();
                            Intrinsics.checkExpressionValueIsNotNull(a2, "t.getData()");
                            volumeController.a(((Number) a2).intValue(), null);
                            return;
                        }
                    }
                    break;
                case -192431061:
                    if (str.equals("action_keycode_volume_down")) {
                        VolumeController volumeController2 = this.m;
                        if (volumeController2 != null) {
                            Object a3 = aVar.a();
                            Intrinsics.checkExpressionValueIsNotNull(a3, "t.getData()");
                            volumeController2.a(((Number) a3).intValue(), null);
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -110819137:
                    if (str.equals("action_video_on_prepare_play")) {
                        LineProgressBar lineProgressBar4 = this.l;
                        if (lineProgressBar4 != null) {
                            lineProgressBar4.a();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 356960147:
                    if (str.equals("action_video_on_play_completed")) {
                        ImageView imageView = this.f54087b;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        AnimatedImageView animatedImageView2 = this.k;
                        if (animatedImageView2 != null) {
                            animatedImageView2.setVisibility(0);
                        }
                        return;
                    }
                    break;
                case 710880054:
                    if (str.equals("action_seek_stop_tracking_touch")) {
                        Object a4 = aVar.a();
                        Intrinsics.checkExpressionValueIsNotNull(a4, "t.getData()");
                        if (((Number) a4).floatValue() > 0.0f) {
                            ImageView imageView2 = this.f54087b;
                            if (imageView2 != null) {
                                imageView2.setVisibility(8);
                            }
                            AnimatedImageView animatedImageView3 = this.k;
                            if (animatedImageView3 != null) {
                                animatedImageView3.setVisibility(8);
                            }
                            return;
                        }
                    }
                    break;
                case 1422397231:
                    if (str.equals("action_video_on_buffering")) {
                        Object a5 = aVar.a();
                        Intrinsics.checkExpressionValueIsNotNull(a5, "t.getData()");
                        if (((Boolean) a5).booleanValue()) {
                            LineProgressBar lineProgressBar5 = this.l;
                            if (lineProgressBar5 != null) {
                                lineProgressBar5.a();
                                break;
                            } else {
                                return;
                            }
                        } else {
                            LineProgressBar lineProgressBar6 = this.l;
                            if (lineProgressBar6 != null) {
                                lineProgressBar6.b();
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
                case 2060932179:
                    if (str.equals("action_video_on_resume_play")) {
                        ImageView imageView3 = this.f54087b;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                        AnimatedImageView animatedImageView4 = this.k;
                        if (animatedImageView4 != null) {
                            animatedImageView4.setVisibility(8);
                        }
                        return;
                    }
                    break;
            }
        }
    }

    public VideoFunctionalLayerWidget(@Nullable Aweme aweme, @NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "mEventType");
        Intrinsics.checkParameterIsNotNull(str2, "mBusinessType");
        this.n = aweme;
        this.o = str;
        this.p = i;
        this.q = str2;
    }
}

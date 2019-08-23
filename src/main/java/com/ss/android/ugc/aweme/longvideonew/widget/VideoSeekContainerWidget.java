package com.ss.android.ugc.aweme.longvideonew.widget;

import android.arch.lifecycle.Observer;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.b.d;
import com.ss.android.ugc.aweme.longvideo.b.f;
import com.ss.android.ugc.aweme.longvideo.j;
import com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.ss.android.ugc.aweme.longvideonew.feature.c;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.aq;
import com.ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u00012B'\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010'\u001a\u00020 H\u0016J\"\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0014H\u0016J\u0012\u0010-\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010.\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0002R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/widget/VideoSeekContainerWidget;", "Lcom/ss/android/ugc/aweme/utils/GenericWidget;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "Landroid/view/View$OnClickListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mEventType", "", "mPageType", "", "mBusinessType", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;ILjava/lang/String;)V", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMBusinessType", "()Ljava/lang/String;", "getMEventType", "mIsTrackingTouch", "", "mOnStopTrackingTouchTime", "", "getMPageType", "()I", "mPlayControlView", "Landroid/widget/ImageView;", "mSeekBar", "Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;", "mSeekBarStartTouch", "mSwitchMode", "onBindView", "", "view", "Landroid/view/View;", "onChanged", "t", "onClick", "v", "onCreate", "onProgressChanged", "seekBar", "Landroid/widget/SeekBar;", "progress", "fromUser", "onStartTrackingTouch", "onStopTrackingTouch", "updateSwitchModeStatus", "width", "heigt", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoSeekContainerWidget extends GenericWidget implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54102a;
    public static final a n = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f54103b;
    @NotNull
    public final String k;
    public final int l;
    @NotNull
    public final String m;
    private boolean o;
    private ImageView p;
    private ImageView q;
    private VideoPlaySeekBar r;
    private int t;
    private long u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/widget/VideoSeekContainerWidget$Companion;", "", "()V", "ACTION_PLAY_CONTROL", "", "ACTION_SEEK_STOP_TRACKING_TOUCH", "ACTION_SWITCH_MODE", "ONE_HUNDRED", "", "VIDEO_SEEK_BUFFER_TIME_MS", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f54102a, false, 57005, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54102a, false, 57005, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        Observer observer = this;
        this.g.a("action_is_landscape_mode", observer).a("action_video_on_resume_play", observer).a("action_video_on_pause_play", observer).a("action_video_on_play_progress_change", observer).a("action_video_secondary_progress", observer).a("action_video_on_play_completed", observer).a("resize_video_and_cover", observer);
    }

    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f54102a, false, 57010, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f54102a, false, 57010, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        this.o = true;
        com.ss.android.ugc.aweme.longvideo.a.a aVar = new com.ss.android.ugc.aweme.longvideo.a.a();
        aVar.f53874a = true;
        bg.a(aVar);
        if (seekBar != null) {
            this.t = seekBar.getProgress();
        }
    }

    public final void a(@Nullable View view) {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54102a, false, 57006, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54102a, false, 57006, new Class[]{View.class}, Void.TYPE);
        } else if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            Video video = null;
            View inflate = LayoutInflater.from(c()).inflate(C0906R.layout.a77, null, false);
            if (inflate != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                viewGroup.addView(linearLayout);
                this.p = (ImageView) linearLayout.findViewById(C0906R.id.b43);
                ImageView imageView = this.p;
                if (imageView != null) {
                    imageView.setSelected(true);
                }
                ImageView imageView2 = this.p;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(this);
                }
                this.q = (ImageView) linearLayout.findViewById(C0906R.id.b5t);
                ImageView imageView3 = this.q;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(this);
                }
                if ("long_video_player_activity".equals(this.m)) {
                    video = j.f53966b.a(this.f54103b);
                }
                if (video == null) {
                    video = j.f53965a.a(this.f54103b);
                }
                if (video != null) {
                    i = video.getWidth();
                } else {
                    i = 0;
                }
                if (video != null) {
                    i2 = video.getHeight();
                } else {
                    i2 = 0;
                }
                a(i, i2);
                this.r = (VideoPlaySeekBar) linearLayout.findViewById(C0906R.id.dsu);
                VideoPlaySeekBar videoPlaySeekBar = this.r;
                if (videoPlaySeekBar != null) {
                    if (video != null) {
                        i3 = video.getDuration();
                    }
                    videoPlaySeekBar.setTotalTime(f.a.b(i3));
                }
                VideoPlaySeekBar videoPlaySeekBar2 = this.r;
                if (videoPlaySeekBar2 != null) {
                    videoPlaySeekBar2.setProgress(0.0f);
                }
                VideoPlaySeekBar videoPlaySeekBar3 = this.r;
                if (videoPlaySeekBar3 != null) {
                    videoPlaySeekBar3.setOnSeekBarChangeListener(this);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        Boolean bool;
        Boolean bool2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54102a, false, 57009, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54102a, false, 57009, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.b43) {
            ImageView imageView = this.p;
            if (imageView != null && imageView.isSelected()) {
                new aq().b(this.f54103b, this.l).a(this.k).a(1).e();
            }
            DataCenter dataCenter = this.g;
            ImageView imageView2 = this.p;
            if (imageView2 != null) {
                bool2 = Boolean.valueOf(imageView2.isSelected());
            } else {
                bool2 = Boolean.FALSE;
            }
            dataCenter.a("action_play_control", (Object) bool2);
            return;
        }
        if (num != null && num.intValue() == C0906R.id.b5t) {
            ImageView imageView3 = this.q;
            if (imageView3 != null && !imageView3.isSelected()) {
                d a2 = d.a().a("enter_from", this.k).a("is_long_item", 1);
                Aweme aweme = this.f54103b;
                if (aweme != null) {
                    str = aweme.getAid();
                }
                r.a("enter_full_screen", (Map) a2.a("group_id", str).f34114b);
            }
            DataCenter dataCenter2 = this.g;
            ImageView imageView4 = this.q;
            if (imageView4 != null) {
                bool = Boolean.valueOf(imageView4.isSelected());
            } else {
                bool = Boolean.FALSE;
            }
            dataCenter2.a("action_switch_mode", (Object) bool);
        }
    }

    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f54102a, false, 57011, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f54102a, false, 57011, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        this.u = SystemClock.elapsedRealtime();
        this.o = false;
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            DataCenter dataCenter = this.g;
            if (dataCenter != null) {
                dataCenter.a("action_seek_stop_tracking_touch", (Object) Float.valueOf(((float) progress) / 100.0f));
            }
        }
        com.ss.android.ugc.aweme.longvideo.a.a aVar = new com.ss.android.ugc.aweme.longvideo.a.a();
        aVar.f53875b = true;
        bg.a(aVar);
        if (seekBar != null) {
            if (this.t < seekBar.getProgress()) {
                str = "front";
            } else {
                str = "back";
            }
            d a2 = d.a().a("enter_from", this.k).a("is_long_item", 1).a("impr_type", aa.s(this.f54103b)).a("action_type", str);
            Aweme aweme = this.f54103b;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            r.a("click_progress_bar", (Map) a2.a("group_id", str2).f34114b);
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54102a, false, 57008, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f54102a, false, 57008, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            str = aVar.f34376a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -809540112:
                    if (str.equals("action_video_on_pause_play")) {
                        ImageView imageView = this.p;
                        if (imageView != null) {
                            imageView.setSelected(false);
                        }
                        return;
                    }
                    break;
                case -330388150:
                    if (str.equals("action_video_on_play_progress_change") && !this.o && (this.u == 0 || SystemClock.elapsedRealtime() > this.u + 1200)) {
                        VideoPlaySeekBar videoPlaySeekBar = this.r;
                        if (videoPlaySeekBar != null) {
                            Object a2 = aVar.a();
                            Intrinsics.checkExpressionValueIsNotNull(a2, "t.getData()");
                            videoPlaySeekBar.setProgress(((Number) a2).floatValue());
                            break;
                        } else {
                            return;
                        }
                    }
                case 356960147:
                    if (str.equals("action_video_on_play_completed")) {
                        VideoPlaySeekBar videoPlaySeekBar2 = this.r;
                        if (videoPlaySeekBar2 != null) {
                            videoPlaySeekBar2.setProgress(0.0f);
                        }
                        this.u = 0;
                        return;
                    }
                    break;
                case 441659136:
                    if (str.equals("resize_video_and_cover")) {
                        Object a3 = aVar.a();
                        Intrinsics.checkExpressionValueIsNotNull(a3, "t.getData()");
                        c cVar = (c) a3;
                        a(cVar.f54074a, cVar.f54075b);
                        break;
                    }
                    break;
                case 929573523:
                    if (str.equals("action_is_landscape_mode")) {
                        ImageView imageView2 = this.q;
                        if (imageView2 != null) {
                            Object a4 = aVar.a();
                            Intrinsics.checkExpressionValueIsNotNull(a4, "t.getData()");
                            imageView2.setSelected(((Boolean) a4).booleanValue());
                        }
                        Object a5 = aVar.a();
                        Intrinsics.checkExpressionValueIsNotNull(a5, "t.getData()");
                        if (((Boolean) a5).booleanValue()) {
                            VideoPlaySeekBar videoPlaySeekBar3 = this.r;
                            if (videoPlaySeekBar3 != null) {
                                videoPlaySeekBar3.setSeekBarThumb(1);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            VideoPlaySeekBar videoPlaySeekBar4 = this.r;
                            if (videoPlaySeekBar4 != null) {
                                videoPlaySeekBar4.setSeekBarThumb(0);
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
                case 1083569349:
                    if (str.equals("action_video_secondary_progress")) {
                        VideoPlaySeekBar videoPlaySeekBar5 = this.r;
                        if (videoPlaySeekBar5 != null) {
                            Object a6 = aVar.a();
                            Intrinsics.checkExpressionValueIsNotNull(a6, "t.getData()");
                            videoPlaySeekBar5.setSecondaryProgress(((Number) a6).intValue());
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 2060932179:
                    if (str.equals("action_video_on_resume_play")) {
                        ImageView imageView3 = this.p;
                        if (imageView3 != null) {
                            imageView3.setSelected(true);
                        }
                        return;
                    }
                    break;
            }
        }
    }

    private final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54102a, false, 57007, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54102a, false, 57007, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!"long_video_player_activity".equals(this.m) || !d.a.a(i, i2)) {
            ImageView imageView = this.q;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = this.q;
            if (imageView2 != null) {
                imageView2.setOnClickListener(this);
            }
            ImageView imageView3 = this.q;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
        }
    }

    public VideoSeekContainerWidget(@Nullable Aweme aweme, @NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "mEventType");
        Intrinsics.checkParameterIsNotNull(str2, "mBusinessType");
        this.f54103b = aweme;
        this.k = str;
        this.l = i;
        this.m = str2;
    }
}

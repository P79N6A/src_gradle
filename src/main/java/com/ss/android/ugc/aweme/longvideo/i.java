package com.ss.android.ugc.aweme.longvideo;

import android.widget.SeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.longvideo.b.f;
import com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/LongVideoSeekView;", "Lcom/ss/android/ugc/aweme/longvideo/IProgressView;", "seekBar", "Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;", "longVideoPlayView", "Lcom/ss/android/ugc/aweme/longvideo/ILongVideoPlayView;", "(Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;Lcom/ss/android/ugc/aweme/longvideo/ILongVideoPlayView;)V", "isTrackingTouch", "", "getLongVideoPlayView", "()Lcom/ss/android/ugc/aweme/longvideo/ILongVideoPlayView;", "setLongVideoPlayView", "(Lcom/ss/android/ugc/aweme/longvideo/ILongVideoPlayView;)V", "mSeekBarChangeListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getSeekBar", "()Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;", "setSeekBar", "(Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;)V", "initSeekBar", "", "totalTimeMilli", "", "onProgress", "progress", "", "onSecondaryProgress", "setSeekBarChangeListener", "seekBarChangeListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53958a;

    /* renamed from: b  reason: collision with root package name */
    public SeekBar.OnSeekBarChangeListener f53959b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f53960c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public VideoPlaySeekBar f53961d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public b f53962e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/longvideo/LongVideoSeekView$initSeekBar$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53963a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f53964b;

        a(i iVar) {
            this.f53964b = iVar;
        }

        public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            if (PatchProxy.isSupport(new Object[]{seekBar}, this, f53963a, false, 56666, new Class[]{SeekBar.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{seekBar}, this, f53963a, false, 56666, new Class[]{SeekBar.class}, Void.TYPE);
                return;
            }
            this.f53964b.f53960c = true;
            com.ss.android.ugc.aweme.longvideo.a.a aVar = new com.ss.android.ugc.aweme.longvideo.a.a();
            aVar.f53874a = true;
            bg.a(aVar);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f53964b.f53959b;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
            if (PatchProxy.isSupport(new Object[]{seekBar}, this, f53963a, false, 56667, new Class[]{SeekBar.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{seekBar}, this, f53963a, false, 56667, new Class[]{SeekBar.class}, Void.TYPE);
                return;
            }
            this.f53964b.f53960c = false;
            if (seekBar != null) {
                int progress = seekBar.getProgress();
                b bVar = this.f53964b.f53962e;
                if (bVar != null) {
                    bVar.b(((float) progress) / 100.0f);
                }
            }
            com.ss.android.ugc.aweme.longvideo.a.a aVar = new com.ss.android.ugc.aweme.longvideo.a.a();
            aVar.f53875b = true;
            bg.a(aVar);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f53964b.f53959b;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
        }

        public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
            SeekBar seekBar2 = seekBar;
            if (PatchProxy.isSupport(new Object[]{seekBar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f53963a, false, 56665, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{seekBar2, Integer.valueOf(i), Byte.valueOf(z)}, this, f53963a, false, 56665, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f53964b.f53959b;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar2, i, z);
            }
        }
    }

    public final void a(@NotNull SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
        if (PatchProxy.isSupport(new Object[]{onSeekBarChangeListener2}, this, f53958a, false, 56660, new Class[]{SeekBar.OnSeekBarChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSeekBarChangeListener2}, this, f53958a, false, 56660, new Class[]{SeekBar.OnSeekBarChangeListener.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(onSeekBarChangeListener2, "seekBarChangeListener");
        this.f53959b = onSeekBarChangeListener2;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f53958a, false, 56662, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f53958a, false, 56662, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (!this.f53960c) {
            this.f53961d.setProgress(f2);
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53958a, false, 56661, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53958a, false, 56661, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f53961d.setTotalTime(f.a.b(i));
        this.f53961d.setProgress(0.0f);
        this.f53961d.setOnSeekBarChangeListener(new a(this));
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53958a, false, 56663, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53958a, false, 56663, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f53961d.setSecondaryProgress(i);
    }

    public i(@NotNull VideoPlaySeekBar videoPlaySeekBar, @Nullable b bVar) {
        Intrinsics.checkParameterIsNotNull(videoPlaySeekBar, "seekBar");
        this.f53961d = videoPlaySeekBar;
        this.f53962e = bVar;
    }
}

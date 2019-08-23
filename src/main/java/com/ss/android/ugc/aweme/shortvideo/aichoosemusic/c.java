package com.ss.android.ugc.aweme.shortvideo.aichoosemusic;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.p;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u001c\u001a\u00020\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper;", "", "()V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "handler", "Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper$PositionHandler;", "positionListener", "Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper$PositionListener;", "getPositionListener", "()Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper$PositionListener;", "setPositionListener", "(Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper$PositionListener;)V", "veEditor", "Lcom/ss/android/vesdk/VEEditor;", "getVeEditor", "()Lcom/ss/android/vesdk/VEEditor;", "setVeEditor", "(Lcom/ss/android/vesdk/VEEditor;)V", "pausePlay", "", "release", "resumePlay", "setOnPositionListener", "startPlay", "PositionHandler", "PositionListener", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65571a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public p f65572b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public b f65573c;

    /* renamed from: d  reason: collision with root package name */
    public a f65574d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    public long f65575e = 100;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper$PositionHandler;", "Landroid/os/Handler;", "aiMusicPositionPlayer", "Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper;", "(Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper;)V", "weakReferenceAiMusicPositionPlayer", "Ljava/lang/ref/WeakReference;", "getWeakReferenceAiMusicPositionPlayer", "()Ljava/lang/ref/WeakReference;", "setWeakReferenceAiMusicPositionPlayer", "(Ljava/lang/ref/WeakReference;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65576a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<c> f65577b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(@NotNull c cVar) {
            super(Looper.getMainLooper());
            Intrinsics.checkParameterIsNotNull(cVar, "aiMusicPositionPlayer");
            this.f65577b = new WeakReference<>(cVar);
        }

        public final void handleMessage(@Nullable Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f65576a, false, 75083, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f65576a, false, 75083, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            super.handleMessage(message);
            c cVar = (c) this.f65577b.get();
            if (cVar != null) {
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                if (!(cVar.f65572b == null || cVar.f65573c == null)) {
                    b bVar = cVar.f65573c;
                    if (bVar == null) {
                        Intrinsics.throwNpe();
                    }
                    p pVar = cVar.f65572b;
                    if (pVar == null) {
                        Intrinsics.throwNpe();
                    }
                    bVar.a(pVar.u());
                }
                postDelayed(null, cVar.f65575e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper$PositionListener;", "", "updatePosition", "", "durationTime", "", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(int i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65571a, false, 75078, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65571a, false, 75078, new Class[0], Void.TYPE);
            return;
        }
        this.f65574d.removeCallbacksAndMessages(null);
        this.f65574d.postDelayed(null, this.f65575e);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65571a, false, 75079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65571a, false, 75079, new Class[0], Void.TYPE);
            return;
        }
        this.f65574d.removeCallbacksAndMessages(null);
    }
}

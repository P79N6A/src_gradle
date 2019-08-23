package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Ldmt/av/video/VEAudioEffectOp;", "", "mOp", "", "mIsOriginal", "", "mAudioParam", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;", "(Ljava/lang/String;ZLcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;)V", "getMAudioParam", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;", "mIndex", "Ljava/util/concurrent/atomic/AtomicInteger;", "getMIndex", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setMIndex", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "getMIsOriginal", "()Z", "getMOp", "()Ljava/lang/String;", "mOriginIndex", "getMOriginIndex", "setMOriginIndex", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83004a;
    public static final a g = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public AtomicInteger f83005b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public AtomicInteger f83006c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f83007d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f83008e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final AudioEffectParam f83009f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldmt/av/video/VEAudioEffectOp$Companion;", "", "()V", "TYPE_APPLY", "", "TYPE_CLEAR", "apply", "Ldmt/av/video/VEAudioEffectOp;", "isOriginal", "", "audioParam", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;", "clear", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f83010a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final j a(boolean z, @Nullable AudioEffectParam audioEffectParam) {
            AudioEffectParam audioEffectParam2 = audioEffectParam;
            if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), audioEffectParam2}, this, f83010a, false, 91966, new Class[]{Boolean.TYPE, AudioEffectParam.class}, j.class)) {
                return new j("apply", z, audioEffectParam2, (byte) 0);
            }
            return (j) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), audioEffectParam2}, this, f83010a, false, 91966, new Class[]{Boolean.TYPE, AudioEffectParam.class}, j.class);
        }
    }

    @JvmStatic
    @NotNull
    public static final j a(boolean z, @Nullable AudioEffectParam audioEffectParam) {
        AudioEffectParam audioEffectParam2 = audioEffectParam;
        if (!PatchProxy.isSupport(new Object[]{(byte) 1, audioEffectParam2}, null, f83004a, true, 91964, new Class[]{Boolean.TYPE, AudioEffectParam.class}, j.class)) {
            return g.a(true, audioEffectParam2);
        }
        return (j) PatchProxy.accessDispatch(new Object[]{(byte) 1, audioEffectParam2}, null, f83004a, true, 91964, new Class[]{Boolean.TYPE, AudioEffectParam.class}, j.class);
    }

    private j(String str, boolean z, AudioEffectParam audioEffectParam) {
        this.f83007d = str;
        this.f83008e = z;
        this.f83009f = audioEffectParam;
        this.f83005b = new AtomicInteger(-1);
        this.f83006c = new AtomicInteger(-1);
    }

    public /* synthetic */ j(String str, boolean z, AudioEffectParam audioEffectParam, byte b2) {
        this(str, z, audioEffectParam);
    }

    public /* synthetic */ j(String str, boolean z, AudioEffectParam audioEffectParam, int i) {
        this(str, z, null);
    }
}

package dmt.av.video;

import com.google.common.a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Ldmt/av/video/VEEffectHintOp;", "", "op", "", "(I)V", "durationInMilliseconds", "", "getDurationInMilliseconds", "()J", "setDurationInMilliseconds", "(J)V", "hintText", "", "getHintText", "()Ljava/lang/CharSequence;", "setHintText", "(Ljava/lang/CharSequence;)V", "getOp", "()I", "hashCode", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83044a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f83045e = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f83046b;

    /* renamed from: c  reason: collision with root package name */
    public long f83047c;

    /* renamed from: d  reason: collision with root package name */
    public final int f83048d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Ldmt/av/video/VEEffectHintOp$Companion;", "", "()V", "OP_SHOW_HINT", "", "showHint", "Ldmt/av/video/VEEffectHintOp;", "hint", "", "duration", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f83049a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, f83044a, false, 91997, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f83044a, false, 91997, new Class[0], Integer.TYPE)).intValue();
        }
        return j.a(Integer.valueOf(this.f83048d), this.f83046b, Long.valueOf(this.f83047c));
    }

    private o(int i) {
        this.f83048d = i;
        this.f83046b = "";
    }

    public /* synthetic */ o(int i, byte b2) {
        this(0);
    }
}

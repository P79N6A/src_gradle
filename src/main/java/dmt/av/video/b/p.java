package dmt.av.video.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.g;
import com.ss.android.vesdk.af;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Ldmt/av/video/record/VEMusicCapacityProviderImpl;", "Ldmt/av/video/record/MusicCapacityProvider;", "recorder", "Lcom/ss/android/vesdk/VERecorder;", "(Lcom/ss/android/vesdk/VERecorder;)V", "setMusicPath", "", "bgmPaths", "", "setMusicTime", "musicStartTime", "", "recordTime", "useMusic", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82952a;

    /* renamed from: b  reason: collision with root package name */
    private final af f82953b;

    public final void a(@Nullable String str) {
    }

    public p(@NotNull af afVar) {
        Intrinsics.checkParameterIsNotNull(afVar, "recorder");
        this.f82953b = afVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f82952a, false, 92240, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f82952a, false, 92240, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f82953b.a(z);
    }

    public final void a(@Nullable String str, long j, long j2) {
        String str2 = str;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j3), new Long(j4)}, this, f82952a, false, 92239, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str2, new Long(j3), new Long(j4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f82952a, false, 92239, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (str2 != null) {
            this.f82953b.a(g.a(str2, co.AUDIO), (int) j3, -1, 2);
        }
    }
}

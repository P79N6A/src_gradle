package dmt.av.video.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Ldmt/av/video/record/OldMusicCapacityProviderImpl;", "Ldmt/av/video/record/MusicCapacityProvider;", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "(Lcom/ss/android/medialib/presenter/MediaRecordPresenter;)V", "setMusicPath", "", "bgmPaths", "", "setMusicTime", "musicStartTime", "", "recordTime", "useMusic", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82912a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaRecordPresenter f82913b;

    public c(@NotNull MediaRecordPresenter mediaRecordPresenter) {
        Intrinsics.checkParameterIsNotNull(mediaRecordPresenter, "mediaRecordPresenter");
        this.f82913b = mediaRecordPresenter;
    }

    public final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f82912a, false, 92174, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f82912a, false, 92174, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f82913b.a(str2);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f82912a, false, 92175, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f82912a, false, 92175, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f82913b.d(z ? 1 : 0);
    }

    public final void a(@Nullable String str, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j3), new Long(j4)}, this, f82912a, false, 92176, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, new Long(j3), new Long(j4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f82912a, false, 92176, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.f82913b.a(j3, j4);
    }
}

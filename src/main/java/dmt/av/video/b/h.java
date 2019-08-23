package dmt.av.video.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Ldmt/av/video/record/OldVoiceCapacityProviderImpl;", "Ldmt/av/video/record/VoiceCapacityProvider;", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "(Lcom/ss/android/medialib/presenter/MediaRecordPresenter;)V", "startAudioRecorder", "", "stopAudioRecorder", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h implements z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82934a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaRecordPresenter f82935b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f82934a, false, 92220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82934a, false, 92220, new Class[0], Void.TYPE);
            return;
        }
        this.f82935b.m();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f82934a, false, 92221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82934a, false, 92221, new Class[0], Void.TYPE);
            return;
        }
        this.f82935b.n();
    }

    public h(@NotNull MediaRecordPresenter mediaRecordPresenter) {
        Intrinsics.checkParameterIsNotNull(mediaRecordPresenter, "mediaRecordPresenter");
        this.f82935b = mediaRecordPresenter;
    }
}
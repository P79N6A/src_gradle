package dmt.av.video.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.vesdk.runtime.d;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Ldmt/av/video/record/VERecorderResManagerImpl;", "Lcom/ss/android/vesdk/runtime/VERecorderResManager;", "veWorkPath", "", "workspace", "Lcom/ss/android/ugc/aweme/shortvideo/WorkSpace/Workspace;", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/WorkSpace/Workspace;)V", "genSegmentAudioPath", "segmentIndex", "", "genSegmentVideoPath", "getConcatSegmentAudioPath", "getConcatSegmentVideoPath", "getSegmentDirPath", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class t extends d {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f82966f;
    private final String g;
    private final com.ss.android.ugc.aweme.shortvideo.a.d h;

    @NotNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f82966f, false, 92266, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f82966f, false, 92266, new Class[0], String.class);
        }
        String str = fg.g;
        Intrinsics.checkExpressionValueIsNotNull(str, "ShortVideoConfig2.sTmpDir");
        return str;
    }

    @NotNull
    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f82966f, false, 92269, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f82966f, false, 92269, new Class[0], String.class);
        }
        File c2 = this.h.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "workspace.concatVideoFile");
        String path = c2.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "workspace.concatVideoFile.path");
        return path;
    }

    @NotNull
    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f82966f, false, 92270, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f82966f, false, 92270, new Class[0], String.class);
        }
        File d2 = this.h.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "workspace.concatAudioFile");
        String path = d2.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "workspace.concatAudioFile.path");
        return path;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(@NotNull String str, @NotNull com.ss.android.ugc.aweme.shortvideo.a.d dVar) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "veWorkPath");
        Intrinsics.checkParameterIsNotNull(dVar, "workspace");
        this.g = str;
        this.h = dVar;
    }
}

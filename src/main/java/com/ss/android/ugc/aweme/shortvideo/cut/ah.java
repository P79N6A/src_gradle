package com.ss.android.ugc.aweme.shortvideo.cut;

import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.vesdk.VEListener;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J$\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH&J \u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\n2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001bH&J\u0016\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001bH&J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000eH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u000eH&¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/IVideoCutter;", "", "compile", "", "settings", "Lcom/ss/android/ugc/aweme/shortvideo/cut/CutVideoCompileSettings;", "listener", "Lcom/ss/android/vesdk/VEListener$VEEditorCompileListener;", "destroy", "rotateFile", "", "index", "", "degree", "", "rotateForPreview", "scaleW", "scaleH", "selectSegment", "segment", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "setBoundary", "intPoint", "outPoint", "unselect", "isConfirm", "segmentList", "", "updatePlayOrder", "videoList", "updateSegmentSpeed", "speed", "updateTotalSpeed", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface ah {
    void a(int i, int i2);

    void a(int i, @NotNull h hVar);

    void a(@NotNull af afVar, @NotNull VEListener.g gVar);

    void a(@NotNull List<? extends h> list);

    void a(boolean z, @Nullable List<? extends h> list);

    boolean a(float f2, float f3, float f4);

    boolean a(int i, float f2);

    void b(int i, float f2);
}

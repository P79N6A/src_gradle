package com.ss.android.ugc.aweme.shortvideo.cut.model;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/model/ExtractFrameCallback;", "", "onGetBitMap", "", "closeBitmap", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface b {
    void a(@NotNull CloseableReference<CloseableImage> closeableReference);
}

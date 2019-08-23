package com.ss.android.ugc.aweme.services.videoprocess;

import com.ss.android.ugc.aweme.shortvideo.q.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/services/videoprocess/IVideoProcessorsService;", "", "addStoryWaterMark", "", "videoPath", "", "outPath", "videoWidth", "", "videoHeight", "listener", "Lcom/ss/android/ugc/aweme/shortvideo/videoprocess/VideoProcessListener;", "convertVideo2Gif", "inputPath", "isAddWaterMark", "", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface IVideoProcessorsService {
    void addStoryWaterMark(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull a aVar);

    void convertVideo2Gif(@NotNull String str, @NotNull String str2, boolean z, @NotNull a aVar);
}

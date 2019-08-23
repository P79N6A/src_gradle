package com.ss.android.ugc.aweme.services.upload;

import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/services/upload/ITTUploaderConfigService;", "", "getVideoCreation", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/shortvideo/model/VideoCreation;", "uploadVideoType", "Lcom/ss/android/ugc/aweme/services/upload/UploadVideoType;", "params", "Ljava/util/LinkedHashMap;", "", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface ITTUploaderConfigService {
    @NotNull
    q<VideoCreation> getVideoCreation(@NotNull UploadVideoType uploadVideoType, @NotNull LinkedHashMap<String, String> linkedHashMap);
}

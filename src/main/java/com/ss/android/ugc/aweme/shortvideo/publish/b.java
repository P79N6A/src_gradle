package com.ss.android.ugc.aweme.shortvideo.publish;

import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\fH&J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/publish/IAVPublishServiceExtension;", "", "name", "", "getName", "()Ljava/lang/String;", "writeFieldMap", "", "photoContext", "Lcom/ss/android/ugc/aweme/photo/PhotoContext;", "fieldMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "videoContext", "Lcom/ss/android/ugc/aweme/shortvideo/BaseShortVideoContext;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface b {
    void a(@NotNull PhotoContext photoContext, @NotNull LinkedHashMap<String, String> linkedHashMap);

    void a(@NotNull BaseShortVideoContext baseShortVideoContext, @NotNull LinkedHashMap<String, String> linkedHashMap);
}

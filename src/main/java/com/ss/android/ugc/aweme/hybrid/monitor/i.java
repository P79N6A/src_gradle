package com.ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/ISession;", "", "begin", "", "id", "", "end", "navigateToUri", "uri", "Landroid/net/Uri;", "onApiComplete", "request", "Lcom/ss/android/ugc/aweme/hybrid/monitor/ApiRequest;", "error", "Lcom/ss/android/ugc/aweme/hybrid/monitor/ApiResultException;", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public interface i {
    void a(@NotNull b bVar, @Nullable c cVar);

    void a(@NotNull String str);

    void b();

    void b(@NotNull Uri uri);
}

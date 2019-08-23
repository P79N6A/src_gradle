package com.ss.android.ugc.aweme.story.api;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.story.api.model.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/ISettingService;", "", "getAdaptationParams", "Lcom/ss/android/ugc/aweme/story/api/model/AdaptationParams;", "getPlanAInputIcon", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getPlanAInputText", "", "isDuoshanRedpackageShow", "", "isImEnable", "isPlanAOpen", "isPlanBOpen", "isXPlanOpen", "wrapperSendMessageSyncXIcon", "", "imageView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "type", "", "storyservices_release"}, k = 1, mv = {1, 1, 11})
public interface f {
    @Nullable
    a a();

    void a(@NotNull RemoteImageView remoteImageView, int i);

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    @Nullable
    UrlModel f();

    @Nullable
    String g();
}

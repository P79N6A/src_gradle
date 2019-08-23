package com.ss.android.ugc.aweme.story.api.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest;", "", "cancel", "", "getCurrState", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$State;", "setAvatarOpenRequestInterceptor", "interceptor", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$AvatarOpenRequestInterceptor;", "setHasUnReadStory", "hasUnReadStory", "", "startOpenStoryDetail", "AvatarOpenRequestInterceptor", "ErrorType", "OnPreloadListener", "State", "storyservices_release"}, k = 1, mv = {1, 1, 11})
public interface a {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$AvatarOpenRequestInterceptor;", "", "processOpenData", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "userStory", "storyservices_release"}, k = 1, mv = {1, 1, 11})
    /* renamed from: com.ss.android.ugc.aweme.story.api.b.a$a  reason: collision with other inner class name */
    public interface C0747a {
        @Nullable
        UserStory a(@Nullable UserStory userStory);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$ErrorType;", "", "(Ljava/lang/String;I)V", "EMPTY", "NET_ERROR", "TIME_OUT", "OTHER_ERROR", "storyservices_release"}, k = 1, mv = {1, 1, 11})
    public enum b {
        EMPTY,
        NET_ERROR,
        TIME_OUT,
        OTHER_ERROR;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$OnPreloadListener;", "", "onFail", "", "errorType", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$ErrorType;", "onSuccess", "storyservices_release"}, k = 1, mv = {1, 1, 11})
    public interface c {
        void a();

        void a(@NotNull b bVar);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$State;", "", "(Ljava/lang/String;I)V", "READY", "IN_PROGRESS", "CANCELED", "FINISHED", "storyservices_release"}, k = 1, mv = {1, 1, 11})
    public enum d {
        READY,
        IN_PROGRESS,
        CANCELED,
        FINISHED;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @NotNull
    d a();

    void a(@Nullable C0747a aVar);

    void a(boolean z);

    void b();

    void c();
}

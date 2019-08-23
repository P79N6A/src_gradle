package com.ss.android.ugc.aweme.story.api;

import android.content.Context;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J0\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/IDuoshanService;", "", "getDuoshanActivitySchemeType", "", "()Ljava/lang/Integer;", "getDuoshanDownloadText", "", "isDuoshanActivityOpen", "", "openDuoshan", "", "context", "Landroid/content/Context;", "scheme", "story", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "callback", "Lcom/ss/android/ugc/aweme/story/api/IDuoshanService$DialogCallback;", "DialogCallback", "storyservices_release"}, k = 1, mv = {1, 1, 11})
public interface b {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/IDuoshanService$DialogCallback;", "", "onDismiss", "", "onShow", "storyservices_release"}, k = 1, mv = {1, 1, 11})
    public interface a {
        void a();

        void b();
    }

    @Nullable
    Integer a();

    void a(@Nullable Context context, @Nullable String str, @Nullable LifeStory lifeStory, @Nullable a aVar);
}

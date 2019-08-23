package com.ss.android.ugc.aweme.story.api;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000  2\u00020\u0001:\u0001 J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH&J&\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH&J\u001c\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J4\u0010\u0011\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH&J<\u0010\u0011\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H&J\"\u0010\u0017\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH&J*\u0010\u0017\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH&J2\u0010\u0017\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0016H&J:\u0010\u0017\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH&J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H&¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/IProfileService;", "", "blockUserStory", "", "context", "Landroid/content/Context;", "uid", "", "blockType", "", "callback", "Lcom/ss/android/ugc/aweme/story/api/Callback;", "changeFollowStatus", "status", "gotoChat", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "openStoryChat", "story", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "message", "isStoryReplySelf", "", "openStorySettingPage", "enterType", "theme", "topMargin", "isSubPage", "layout", "Landroid/widget/FrameLayout;", "openUserDetailPage", "secUid", "Companion", "storyservices_release"}, k = 1, mv = {1, 1, 11})
public interface d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f71833d = a.f71836c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/IProfileService$Companion;", "", "()V", "ENTER_TYPE_BOTTOM", "", "getENTER_TYPE_BOTTOM", "()I", "ENTER_TYPE_RIGHT", "getENTER_TYPE_RIGHT", "THEME_TYPE_BLCAK", "getTHEME_TYPE_BLCAK", "THEME_TYPE_WHITE", "getTHEME_TYPE_WHITE", "storyservices_release"}, k = 1, mv = {1, 1, 11})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f71834a = 2;

        /* renamed from: b  reason: collision with root package name */
        public static final int f71835b = 1;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ a f71836c = new a();

        /* renamed from: d  reason: collision with root package name */
        private static final int f71837d = 1;

        /* renamed from: e  reason: collision with root package name */
        private static final int f71838e = 2;

        private a() {
        }
    }

    void a(@Nullable Context context, int i, int i2, int i3, boolean z);

    void a(@Nullable Context context, @Nullable User user);

    void a(@Nullable Context context, @Nullable LifeStory lifeStory, @Nullable String str, @NotNull a<Object> aVar);

    void a(@Nullable Context context, @Nullable LifeStory lifeStory, @Nullable String str, @NotNull a<Object> aVar, boolean z);

    void a(@NotNull Context context, @NotNull String str, int i, @NotNull a<Integer> aVar);

    void a(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void a(@NotNull String str, int i, @NotNull a<Integer> aVar);
}

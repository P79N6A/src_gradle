package com.ss.android.ugc.aweme.story.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.a.a.c;
import com.ss.android.ugc.aweme.story.a.b.l;
import com.ss.android.ugc.aweme.story.a.b.m;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/StoryCacheManager;", "", "()V", "followStoryListCache", "Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedCache;", "followStoryListRepository", "Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedRepository;", "friendStoryListCache", "friendStoryListRepository", "userStoryCache", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryCache;", "getUserStoryCache", "()Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryCache;", "userStoryRepository", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryRepository;", "userStoryRepository$annotations", "getUserStoryRepository", "()Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryRepository;", "clearListCache", "", "getLifeFeedRepository", "tabType", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71771a;

    /* renamed from: b  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.story.a.a.a f71772b = new com.ss.android.ugc.aweme.story.a.a.a();

    /* renamed from: c  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.story.a.a.a f71773c = new com.ss.android.ugc.aweme.story.a.a.a();

    /* renamed from: d  reason: collision with root package name */
    public static final a f71774d = new a();
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static final l f71775e = new l();

    /* renamed from: f  reason: collision with root package name */
    private static final c f71776f = new c(f71772b, f71775e);
    private static final c g = new c(f71773c, f71775e);
    @NotNull
    private static final m h = new m(f71775e, f71772b, f71773c);

    private a() {
    }

    @NotNull
    public static final m a() {
        return h;
    }

    @JvmStatic
    @NotNull
    public static final c a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f71771a, true, 85014, new Class[]{Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f71771a, true, 85014, new Class[]{Integer.TYPE}, c.class);
        }
        switch (i) {
            case 1:
                return g;
            case 2:
                return f71776f;
            default:
                throw new IllegalArgumentException();
        }
    }
}

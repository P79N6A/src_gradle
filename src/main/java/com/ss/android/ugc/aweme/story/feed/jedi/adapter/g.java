package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyProvider;", "", "widgetManager", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;)V", "itemWidgetFactory", "Lkotlin/Function0;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxy;", "store", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyStore;", "getStore", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyStore;", "getWidgetManager", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;", "get", "position", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72639a;

    /* renamed from: b  reason: collision with root package name */
    final Function0<StoryViewHolderProxy> f72640b = a.INSTANCE;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final h f72641c = new h(this.f72642d);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final StoryViewHolderProxyManager f72642d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxy;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<StoryViewHolderProxy> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        @NotNull
        public final StoryViewHolderProxy invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83550, new Class[0], StoryViewHolderProxy.class)) {
                return new StoryViewHolderProxy();
            }
            return (StoryViewHolderProxy) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83550, new Class[0], StoryViewHolderProxy.class);
        }
    }

    public g(@NotNull StoryViewHolderProxyManager storyViewHolderProxyManager) {
        Intrinsics.checkParameterIsNotNull(storyViewHolderProxyManager, "widgetManager");
        this.f72642d = storyViewHolderProxyManager;
    }
}

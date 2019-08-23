package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tJ\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyStore;", "", "widgetManager", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;)V", "itemWidgetList", "", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxy;", "widgetsCount", "", "getWidgetsCount", "()I", "clear", "", "get", "position", "insert", "put", "widget", "remove", "swap", "from", "to", "update", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72643a;

    /* renamed from: b  reason: collision with root package name */
    final List<StoryViewHolderProxy> f72644b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final StoryViewHolderProxyManager f72645c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72643a, false, 83558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72643a, false, 83558, new Class[0], Void.TYPE);
        } else if (this.f72644b.size() != 0) {
            for (StoryViewHolderProxy storyViewHolderProxy : this.f72644b) {
                if (storyViewHolderProxy != null) {
                    this.f72645c.b(storyViewHolderProxy);
                }
            }
            this.f72644b.clear();
        }
    }

    public h(@NotNull StoryViewHolderProxyManager storyViewHolderProxyManager) {
        Intrinsics.checkParameterIsNotNull(storyViewHolderProxyManager, "widgetManager");
        this.f72645c = storyViewHolderProxyManager;
    }

    private final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72643a, false, 83555, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72643a, false, 83555, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f72644b.add(i, null);
    }

    private final void b(int i, StoryViewHolderProxy storyViewHolderProxy) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), storyViewHolderProxy}, this, f72643a, false, 83554, new Class[]{Integer.TYPE, StoryViewHolderProxy.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), storyViewHolderProxy}, this, f72643a, false, 83554, new Class[]{Integer.TYPE, StoryViewHolderProxy.class}, Void.TYPE);
        } else if (i < this.f72644b.size()) {
            this.f72644b.set(i, storyViewHolderProxy);
        } else {
            this.f72644b.add(i, storyViewHolderProxy);
        }
    }

    public final void a(int i, @Nullable StoryViewHolderProxy storyViewHolderProxy) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), storyViewHolderProxy}, this, f72643a, false, 83553, new Class[]{Integer.TYPE, StoryViewHolderProxy.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), storyViewHolderProxy}, this, f72643a, false, 83553, new Class[]{Integer.TYPE, StoryViewHolderProxy.class}, Void.TYPE);
            return;
        }
        if (i2 >= 0) {
            if (i2 <= this.f72644b.size()) {
                if (storyViewHolderProxy != null) {
                    b(i, storyViewHolderProxy);
                } else {
                    a(i);
                }
            }
        }
    }
}

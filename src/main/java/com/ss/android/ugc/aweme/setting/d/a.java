package com.ss.android.ugc.aweme.setting.d;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.api.BlackApiManager;
import com.ss.android.ugc.aweme.setting.model.BlackList;
import java.util.List;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.f.a<User, BlackList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63937a;

    /* renamed from: b  reason: collision with root package name */
    public int f63938b;

    /* renamed from: c  reason: collision with root package name */
    private int f63939c;

    public a() {
        this(0);
    }

    public final List<User> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((BlackList) this.mData).blockList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((BlackList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public a(int i) {
        this.f63938b = i;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f63937a, false, 72265, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f63937a, false, 72265, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(this.f63939c);
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f63937a, false, 72264, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f63937a, false, 72264, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(0);
    }

    private void a(final int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f63937a, false, 72266, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f63937a, false, 72266, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63940a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f63940a, false, 72268, new Class[0], Object.class)) {
                    return BlackApiManager.a(i, 10, a.this.f63938b);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f63940a, false, 72268, new Class[0], Object.class);
            }
        }, 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        BlackList blackList = (BlackList) obj;
        if (PatchProxy.isSupport(new Object[]{blackList}, this, f63937a, false, 72267, new Class[]{BlackList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{blackList}, this, f63937a, false, 72267, new Class[]{BlackList.class}, Void.TYPE);
            return;
        }
        if (blackList == null || CollectionUtils.isEmpty(blackList.blockList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = blackList;
            if (!this.mIsNewDataEmpty) {
                this.f63939c = blackList.index;
            }
        } else if (i == 4) {
            if (!this.mIsNewDataEmpty) {
                ((BlackList) this.mData).blockList.addAll(blackList.blockList);
                ((BlackList) this.mData).hasMore = blackList.hasMore;
                this.f63939c = blackList.index;
                return;
            }
            ((BlackList) this.mData).hasMore = false;
        }
    }
}

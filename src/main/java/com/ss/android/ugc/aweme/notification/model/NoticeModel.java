package com.ss.android.ugc.aweme.notification.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.Notice;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class NoticeModel extends a<BaseNotice, Notice> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mMaxTime;
    private long mMinTime;

    public List<BaseNotice> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((Notice) this.mData).items;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((Notice) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    private void saveLogPb() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63128, new Class[0], Void.TYPE);
            return;
        }
        for (BaseNotice baseNotice : ((Notice) this.mData).items) {
            baseNotice.logPbBean = ((Notice) this.mData).logPbBean;
        }
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 3) {
            return false;
        }
        return true;
    }

    public void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 63125, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 63125, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        fetchNotice(this.mMaxTime, this.mMinTime, objArr[1].intValue(), objArr[2]);
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 63124, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 63124, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.mMaxTime = 0;
        this.mMinTime = 0;
        fetchNotice(this.mMaxTime, this.mMinTime, objArr[1].intValue(), objArr[2]);
    }

    public void handleData(Notice notice) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{notice}, this, changeQuickRedirect, false, 63127, new Class[]{Notice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{notice}, this, changeQuickRedirect, false, 63127, new Class[]{Notice.class}, Void.TYPE);
            return;
        }
        if (notice == null || CollectionUtils.isEmpty(notice.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = notice;
            if (!this.mIsNewDataEmpty) {
                this.mMaxTime = notice.maxTime;
                this.mMinTime = notice.minTime;
                saveLogPb();
            }
        } else if (i == 4) {
            if (!this.mIsNewDataEmpty) {
                ((Notice) this.mData).items.addAll(notice.items);
                ((Notice) this.mData).hasMore = notice.hasMore;
                this.mMaxTime = notice.maxTime;
                this.mMinTime = notice.minTime;
                saveLogPb();
                return;
            }
            ((Notice) this.mData).hasMore = false;
        }
    }

    private void fetchNotice(long j, long j2, int i, Integer num) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i), num}, this, changeQuickRedirect, false, 63126, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j3), new Long(j4), Integer.valueOf(i), num};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 63126, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class}, Void.TYPE);
            return;
        }
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final long j5 = j;
        final long j6 = j2;
        final int i2 = i;
        final Integer num2 = num;
        AnonymousClass1 r0 = new Callable<Notice>() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public Notice call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63129, new Class[0], Notice.class)) {
                    return (Notice) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63129, new Class[0], Notice.class);
                }
                try {
                    return NoticeApiManager.a(j5, j6, 20, i2, num2, 1, e.a(), e.b());
                } catch (ExecutionException e2) {
                    throw com.ss.android.ugc.aweme.app.api.m.a(e2);
                }
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}

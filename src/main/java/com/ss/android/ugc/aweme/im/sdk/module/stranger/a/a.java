package com.ss.android.ugc.aweme.im.sdk.module.stranger.a;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerMsgSession;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerSessionList;
import com.ss.android.ugc.aweme.im.sdk.model.d;
import com.ss.android.ugc.aweme.im.sdk.model.e;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.g;
import com.ss.android.ugc.aweme.im.sdk.utils.aj;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.c;

public final class a extends com.ss.android.ugc.aweme.common.f.a<g, StrangerSessionList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51951a;

    /* renamed from: b  reason: collision with root package name */
    private long f51952b;

    public final boolean checkParams(Object... objArr) {
        return objArr != null;
    }

    public final List<g> getItems() {
        if (PatchProxy.isSupport(new Object[0], this, f51951a, false, 52540, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f51951a, false, 52540, new Class[0], List.class);
        } else if (this.mData != null) {
            return e.a(((StrangerSessionList) this.mData).getLastMsg());
        } else {
            return null;
        }
    }

    public final boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f51951a, false, 52539, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f51951a, false, 52539, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((StrangerSessionList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f51951a, false, 52535, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f51951a, false, 52535, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(0, 20, true);
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f51951a, false, 52536, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f51951a, false, 52536, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f51952b += 20;
        a(this.f51952b, 20, true);
    }

    public final /* synthetic */ void handleData(Object obj) {
        StrangerSessionList strangerSessionList = (StrangerSessionList) obj;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{strangerSessionList}, this, f51951a, false, 52538, new Class[]{StrangerSessionList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strangerSessionList}, this, f51951a, false, 52538, new Class[]{StrangerSessionList.class}, Void.TYPE);
            return;
        }
        if (strangerSessionList == null || CollectionUtils.isEmpty(strangerSessionList.getLastMsg())) {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = strangerSessionList;
            if (this.mIsNewDataEmpty) {
                c.a().d(new d());
            }
        } else if (i == 4 && !this.mIsNewDataEmpty) {
            List<StrangerMsgSession> lastMsg = ((StrangerSessionList) this.mData).getLastMsg();
            lastMsg.addAll(strangerSessionList.getLastMsg());
            ((StrangerSessionList) this.mData).setLastMsg(lastMsg);
            ((StrangerSessionList) this.mData).setHasMore(strangerSessionList.isHasMore());
        }
    }

    private void a(long j, long j2, boolean z) {
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), 20L, (byte) 1}, this, f51951a, false, 52537, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j3), 20L, (byte) 1};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f51951a, false, 52537, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final long j4 = j;
        AnonymousClass1 r0 = new Callable(20, true) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51953a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f51953a, false, 52541, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f51953a, false, 52541, new Class[0], Object.class);
                }
                try {
                    return r.a(j4, 20, true);
                } catch (ExecutionException e2) {
                    throw aj.a(e2);
                }
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}

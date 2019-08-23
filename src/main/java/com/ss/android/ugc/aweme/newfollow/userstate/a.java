package com.ss.android.ugc.aweme.newfollow.userstate;

import a.g;
import a.i;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.forward.api.ForwardApi;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.newfollow.a.b;
import java.util.Iterator;
import java.util.List;

public class a extends com.ss.android.ugc.aweme.follow.presenter.a<FollowFeed, FollowFeedList> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57385a;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public a clone() {
        if (PatchProxy.isSupport(new Object[0], this, f57385a, false, 61770, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f57385a, false, 61770, new Class[0], a.class);
        }
        try {
            a aVar = (a) super.clone();
            aVar.mData = ((FollowFeedList) this.mData).clone();
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public List<FollowFeed> getItems() {
        if (PatchProxy.isSupport(new Object[0], this, f57385a, false, 61768, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f57385a, false, 61768, new Class[0], List.class);
        } else if (this.mData == null) {
            return null;
        } else {
            return ((FollowFeedList) this.mData).getItems();
        }
    }

    public boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f57385a, false, 61767, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57385a, false, 61767, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((FollowFeedList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void refreshList(java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f57385a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 61765(0xf145, float:8.6551E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f57385a
            r13 = 0
            r14 = 61765(0xf145, float:8.6551E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            int r2 = r0.length
            r3 = 3
            if (r2 < r3) goto L_0x0051
            r1 = r0[r1]
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r1 = 2
            r0 = r0[r1]
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r7 = 0
            r9 = 20
            r2 = r17
            r2.a(r3, r4, r5, r7, r9)
            return
        L_0x0051:
            r0 = r0[r1]
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 20
            r1 = r17
            r1.a(r2, r3, r4, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.userstate.a.refreshList(java.lang.Object[]):void");
    }

    public void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f57385a, false, 61766, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f57385a, false, 61766, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        long j = 0;
        if (objArr.length >= 3) {
            String str = objArr[1];
            String str2 = objArr[2];
            if (!CollectionUtils.isEmpty(getItems())) {
                j = ((FollowFeedList) this.mData).getMaxCursor();
            }
            a(str, str2, j, -1, 10);
            return;
        }
        String str3 = objArr[1];
        if (!CollectionUtils.isEmpty(getItems())) {
            j = ((FollowFeedList) this.mData).getMaxCursor();
        }
        a(str3, null, j, -1, 10);
    }

    public /* synthetic */ void handleData(Object obj) {
        boolean z;
        FollowFeedList followFeedList = (FollowFeedList) obj;
        if (PatchProxy.isSupport(new Object[]{followFeedList}, this, f57385a, false, 61769, new Class[]{FollowFeedList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeedList}, this, f57385a, false, 61769, new Class[]{FollowFeedList.class}, Void.TYPE);
            return;
        }
        if (followFeedList == null || CollectionUtils.isEmpty(followFeedList.getItems())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 2 && !isDataEmpty()) {
                ((FollowFeedList) this.mData).getItems().clear();
            }
            int size = followFeedList.getItems().size();
            for (int i = 0; i < size; i++) {
                FollowFeed followFeed = (FollowFeed) followFeedList.getItems().get(i);
                if (followFeed != null && followFeed.getFeedType() == 65280) {
                    Aweme aweme = followFeed.getAweme();
                    if (b.i(aweme)) {
                        Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(aweme);
                        com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
                        a3.a(a2.getAid() + 1, followFeedList.getRequestId(), i);
                        followFeed.setAweme(a2);
                        followFeedList.getItems().set(i, followFeed);
                        if (a2.getAwemeType() == 13) {
                            Aweme forwardItem = a2.getForwardItem();
                            if (forwardItem != null) {
                                forwardItem.setRepostFromGroupId(a2.getAid());
                                forwardItem.setRepostFromUserId(a2.getAuthorUid());
                                Aweme a4 = com.ss.android.ugc.aweme.feed.a.a().a(forwardItem);
                                com.ss.android.ugc.aweme.feed.a a5 = com.ss.android.ugc.aweme.feed.a.a();
                                a5.a(a4.getAid() + 1, followFeedList.getRequestId(), i);
                            }
                        }
                    }
                }
            }
            if (this.mListQueryType != 1) {
                Iterator it2 = followFeedList.getItems().iterator();
                while (it2.hasNext()) {
                    FollowFeed followFeed2 = (FollowFeed) it2.next();
                    if (!isDataEmpty() && ((FollowFeedList) this.mData).getItems().indexOf(followFeed2) >= 0) {
                        it2.remove();
                    }
                }
            }
            int i2 = this.mListQueryType;
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                        this.mData = followFeedList;
                        break;
                    case 2:
                        followFeedList.getItems().addAll(getItems());
                        ((FollowFeedList) this.mData).setItems(followFeedList.getItems());
                        break;
                }
            } else {
                ((FollowFeedList) this.mData).getItems().addAll(followFeedList.getItems());
                ((FollowFeedList) this.mData).setHasMore(((FollowFeedList) this.mData).getHasMore() & followFeedList.getHasMore());
            }
            ai.a().a(((FollowFeedList) this.mData).getRequestId(), ((FollowFeedList) this.mData).getLogPb());
            if (((FollowFeedList) this.mData).getMaxCursor() != 0) {
                ((FollowFeedList) this.mData).setMaxCursor(Math.min(((FollowFeedList) this.mData).getMaxCursor(), followFeedList.getMaxCursor()));
            }
            if (((FollowFeedList) this.mData).getMinCursor() != 0) {
                ((FollowFeedList) this.mData).setMinCursor(Math.max(((FollowFeedList) this.mData).getMinCursor(), followFeedList.getMinCursor()));
            }
            for (int i3 = 0; i3 < ((FollowFeedList) this.mData).getItems().size(); i3++) {
                if (((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i3)).getFeedType() == 65280 && ((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i3)).getAweme() != null) {
                    ((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i3)).getAweme().setAwemePosition(i3);
                }
            }
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = null;
        }
        if (!(this.mData == null || this.mListQueryType == 2)) {
            ((FollowFeedList) this.mData).setHasMore(0);
        }
    }

    private void a(String str, String str2, long j, long j2, int i) {
        i iVar;
        int i2;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j3), new Long(j4), Integer.valueOf(i)}, this, f57385a, false, 61762, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j3), new Long(j4), Integer.valueOf(i)}, this, f57385a, false, 61762, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Object[] objArr = {str, str2, new Long(j3), new Long(j4), Integer.valueOf(i)};
        if (PatchProxy.isSupport(objArr, null, ForwardApi.f48265a, true, 45364, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE, Integer.TYPE}, i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j3), new Long(j4), Integer.valueOf(i)}, null, ForwardApi.f48265a, true, 45364, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE, Integer.TYPE}, i.class);
            i2 = 0;
        } else {
            i2 = 0;
            iVar = ForwardApi.f48266b.getUserForwardList(str, str2, j, j2, i);
        }
        iVar.c(new b(this)).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, i2));
    }
}

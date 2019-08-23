package com.ss.android.ugc.aweme.feed.h;

import a.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.rocket.l;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class g extends a<Aweme, FeedItemList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45483a;

    /* renamed from: f  reason: collision with root package name */
    public static volatile String f45484f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45485b;

    /* renamed from: c  reason: collision with root package name */
    public FeedItemList f45486c;

    /* renamed from: d  reason: collision with root package name */
    public int f45487d;

    /* renamed from: e  reason: collision with root package name */
    public long f45488e;
    public ad g;
    private int h;
    private int i;
    private String j;
    private boolean k;

    public boolean a() {
        return false;
    }

    public g() {
    }

    public List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).items;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b() throws Exception {
        FeedItemList b2 = com.ss.android.ugc.aweme.feed.cache.a.f45154c.b();
        if (b2 == null) {
            return null;
        }
        Message obtainMessage = this.mHandler.obtainMessage(0);
        obtainMessage.obj = b2;
        this.mHandler.sendMessage(obtainMessage);
        return null;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45483a, false, 42023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45483a, false, 42023, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new com.ss.android.ugc.aweme.main.story.g());
    }

    public boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f45483a, false, 42030, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45483a, false, 42030, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((FeedItemList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    public g(int i2) {
        this(i2, 0);
    }

    public void setItems(List<Aweme> list) {
        if (this.mData != null) {
            ((FeedItemList) this.mData).items = list;
        }
    }

    private static Integer a(Object[] objArr) {
        if (objArr.length < 4 || !(objArr[3] instanceof Integer)) {
            return null;
        }
        return objArr[3];
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 3 && objArr.length != 4 && objArr.length != 5 && objArr.length != 6)) {
            return false;
        }
        return true;
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f45483a, false, 42031, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45483a, false, 42031, new Class[]{String.class}, Void.TYPE);
        } else if (this.mData != null && ((FeedItemList) this.mData).items != null && !((FeedItemList) this.mData).items.isEmpty()) {
            Iterator<Aweme> it2 = ((FeedItemList) this.mData).items.iterator();
            while (it2.hasNext()) {
                Aweme next = it2.next();
                if (!TextUtils.isEmpty(next.getAid()) && next.getAid().equals(str)) {
                    it2.remove();
                    return;
                }
            }
        }
    }

    private boolean a(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45483a, false, 42033, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45483a, false, 42033, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!aweme.isAd()) {
            return true;
        } else {
            return aweme.getAwemeRawAd().isEnableFilterSameVideo();
        }
    }

    private void b(FeedItemList feedItemList) {
        boolean z;
        int i2;
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList2}, this, f45483a, false, 42029, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList2}, this, f45483a, false, 42029, new Class[]{FeedItemList.class}, Void.TYPE);
        } else if (feedItemList2 != null) {
            List<Aweme> list = feedItemList2.items;
            if (list == null || list.isEmpty()) {
                return;
            }
            ListIterator<Aweme> listIterator = list.listIterator();
            try {
                z = com.ss.android.ugc.aweme.global.config.settings.g.b().bu().booleanValue();
                i2 = 0;
            } catch (com.bytedance.ies.a unused) {
                i2 = 0;
                z = true;
            }
            while (listIterator.hasNext()) {
                Aweme next = listIterator.next();
                if (next == null) {
                    listIterator.remove();
                } else {
                    if (am.e(next) || am.f(next)) {
                        if (this.mListQueryType != 1 || i2 >= 3 || !am.a(next, 3)) {
                            ExecutorService executorService = i.f1051a;
                            if (PatchProxy.isSupport(new Object[]{next, executorService}, null, am.f39706a, true, 32608, new Class[]{Aweme.class, Executor.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{next, executorService}, null, am.f39706a, true, 32608, new Class[]{Aweme.class, Executor.class}, Void.TYPE);
                            } else {
                                am.a(next, executorService, null, false, 12);
                            }
                        } else if (z) {
                            listIterator.remove();
                        } else {
                            am.a(next, null, null, true);
                            if (am.a(next, false)) {
                                listIterator.remove();
                            }
                        }
                    }
                    i2++;
                }
            }
        }
    }

    public void loadLatestList(Object... objArr) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45483a, false, 42025, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f45483a, false, 42025, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.h = objArr[1].intValue();
        this.i = objArr[2].intValue();
        if (objArr.length < 5 || !(objArr[4] instanceof String)) {
            this.j = "";
        } else {
            this.j = objArr[4];
        }
        int i2 = this.h;
        if (CollectionUtils.isEmpty(getItems())) {
            j2 = 0;
        } else {
            j2 = -1;
        }
        b(i2, j2, ((FeedItemList) this.mData).minCursor, this.mCount, a(objArr), null, this.i, this.j, null, null);
        c();
    }

    public void loadMoreList(Object... objArr) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45483a, false, 42024, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f45483a, false, 42024, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        if (this.mData != null) {
            this.f45488e = ((FeedItemList) this.mData).cursor;
        }
        this.h = objArr[1].intValue();
        this.i = objArr[2].intValue();
        if (objArr.length < 5 || !(objArr[4] instanceof String)) {
            this.j = "";
        } else {
            this.j = objArr[4];
        }
        int i2 = this.h;
        if (CollectionUtils.isEmpty(getItems())) {
            j2 = 0;
        } else {
            j2 = ((FeedItemList) this.mData).maxCursor;
        }
        b(i2, j2, -1, this.mCount, a(objArr), null, this.i, this.j, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void refreshList(java.lang.Object... r19) {
        /*
            r18 = this;
            r13 = r18
            r7 = r19
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f45483a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42021(0xa425, float:5.8884E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f45483a
            r3 = 0
            r4 = 42021(0xa425, float:5.8884E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            r0 = 0
            r13.f45488e = r0
            r0 = r7[r8]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13.h = r0
            r0 = 2
            r0 = r7[r0]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13.i = r0
            int r0 = r7.length
            r1 = 5
            r2 = 4
            if (r0 < r1) goto L_0x0063
            r0 = r7[r2]
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x0063
            r0 = r7[r2]
            java.lang.String r0 = (java.lang.String) r0
            r13.j = r0
            goto L_0x0067
        L_0x0063:
            java.lang.String r0 = ""
            r13.j = r0
        L_0x0067:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            int r3 = r7.length
            r4 = 3
            if (r3 < r2) goto L_0x0077
            r3 = r7[r4]
            boolean r3 = r3 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x0077
            r0 = r7[r4]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x0077:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f45483a
            r3 = 0
            r4 = 42022(0xa426, float:5.8885E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a4
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f45483a
            r3 = 0
            r4 = 42022(0xa426, float:5.8885E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x010c
        L_0x00a4:
            com.ss.android.ugc.aweme.base.m r0 = com.ss.android.ugc.aweme.base.m.a()
            com.bytedance.common.utility.collection.WeakHandler r1 = r13.mHandler
            com.ss.android.ugc.aweme.feed.h.h r2 = new com.ss.android.ugc.aweme.feed.h.h
            r2.<init>(r13)
            r0.a(r1, r2, r9)
            goto L_0x010c
        L_0x00b3:
            int r0 = r7.length
            r3 = 6
            r5 = 0
            if (r0 < r3) goto L_0x00c4
            r0 = r7[r2]
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x00c4
            r0 = r7[r2]
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            goto L_0x00c5
        L_0x00c4:
            r11 = r5
        L_0x00c5:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x00da
            int r0 = r7.length
            if (r0 < r3) goto L_0x00da
            r0 = r7[r1]
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x00da
            r0 = r7[r1]
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            goto L_0x00db
        L_0x00da:
            r12 = r5
        L_0x00db:
            int r1 = r13.h
            r8 = 0
            r14 = 0
            int r6 = r13.mCount
            java.lang.Integer r10 = a((java.lang.Object[]) r19)
            int r0 = r7.length
            if (r0 < r2) goto L_0x00f7
            r0 = r7[r4]
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x00f7
            r0 = r7[r4]
            java.lang.String r0 = (java.lang.String) r0
            r16 = r0
            goto L_0x00f9
        L_0x00f7:
            r16 = r5
        L_0x00f9:
            int r7 = r13.i
            java.lang.String r4 = r13.j
            r0 = r18
            r2 = r8
            r17 = r4
            r4 = r14
            r9 = r7
            r7 = r10
            r8 = r16
            r10 = r17
            r0.b(r1, r2, r4, r6, r7, r8, r9, r10, r11, r12)
        L_0x010c:
            int r0 = r13.h
            r1 = 11
            if (r0 == r1) goto L_0x0115
            r18.c()
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.h.g.refreshList(java.lang.Object[]):void");
    }

    /* renamed from: a */
    public void handleData(FeedItemList feedItemList) {
        boolean z;
        int i2;
        int i3;
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList2}, this, f45483a, false, 42028, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList2}, this, f45483a, false, 42028, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        if (feedItemList2 == null || CollectionUtils.isEmpty(feedItemList2.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (this.f45486c == null || feedItemList2 == null || ((!feedItemList.getReplaceFake() && !feedItemList.isAppendCache()) || this.f45486c.items == null || feedItemList2.items == null)) {
            this.f45486c = feedItemList2;
        } else {
            this.mListQueryType = 4;
            this.f45486c.items.addAll(feedItemList2.items);
        }
        if (!this.mIsNewDataEmpty) {
            if (this.f45485b && this.mListQueryType == 2 && feedItemList.isRefreshClear() && !isDataEmpty()) {
                ((FeedItemList) this.mData).items.clear();
            }
            if (!com.ss.android.g.a.a()) {
                l.a();
            }
            if (this.mListQueryType != 1) {
                Iterator<Aweme> it2 = feedItemList2.items.iterator();
                ArrayList arrayList = new ArrayList();
                while (it2.hasNext()) {
                    Aweme next = it2.next();
                    if (!isDataEmpty() && ((FeedItemList) this.mData).items.indexOf(next) >= 0) {
                        Aweme aweme = ((FeedItemList) this.mData).items.get(((FeedItemList) this.mData).items.lastIndexOf(next));
                        Aweme aweme2 = aweme;
                        Aweme aweme3 = next;
                        if (PatchProxy.isSupport(new Object[]{next, aweme}, this, f45483a, false, 42034, new Class[]{Aweme.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aweme3, aweme2}, this, f45483a, false, 42034, new Class[]{Aweme.class, Aweme.class}, Void.TYPE);
                        } else if (aweme3.equals(aweme2)) {
                            if (aweme3.isAd()) {
                                Context context = GlobalContext.getContext();
                                if (aweme2.isAd()) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.ss.android.ugc.aweme.commercialize.log.g.a(context, aweme3, i3);
                            }
                            if (a(aweme3)) {
                                if (c.Z(aweme3)) {
                                    com.ss.android.ugc.aweme.commercialize.log.g.a((Context) k.a(), aweme3, com.ss.android.ugc.aweme.commercialize.splash.a.a().a("8", (String) null));
                                }
                                d a2 = d.a();
                                if (aweme2.isAd()) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                r.a("vv_failed", (Map) a2.a("failed_reason", i2).a("group_id", aweme2.getAid()).f34114b);
                            }
                        }
                        if (a(aweme3)) {
                            it2.remove();
                            arrayList.add(aweme3.getAid());
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    int i4 = this.h;
                    if (i4 == 0) {
                        r.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_hot").setValue(String.valueOf(arrayList.size())));
                        String requestId = feedItemList.getRequestId();
                        if (PatchProxy.isSupport(new Object[]{arrayList, requestId}, this, f45483a, false, 42032, new Class[]{List.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{arrayList, requestId}, this, f45483a, false, 42032, new Class[]{List.class, String.class}, Void.TYPE);
                        } else if (!CollectionUtils.isEmpty(arrayList)) {
                            n.a("service_monitor", "aweme_delete_duplicated_items", com.ss.android.ugc.aweme.app.d.c.a().a("request_id", requestId).a("user_id", com.ss.android.ugc.aweme.user.c.a().e()).a("list_count", Integer.valueOf(arrayList.size())).a("item_ids_str", com.ss.android.ugc.aweme.utils.r.a((List<String>) arrayList)).a("page_type", "homepage_hot").b());
                        }
                    } else if (i4 == 2) {
                        r.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_fresh").setValue(String.valueOf(arrayList.size())));
                    }
                }
            }
            if (!(feedItemList2.extra == null || feedItemList2.extra.fatalItemIds == null || feedItemList2.extra.fatalItemIds.isEmpty())) {
                for (String a3 : feedItemList2.extra.fatalItemIds) {
                    a(a3);
                }
            }
            int i5 = this.mListQueryType;
            if (i5 != 4) {
                switch (i5) {
                    case 1:
                        this.mData = feedItemList2;
                        break;
                    case 2:
                        feedItemList2.items.addAll(getItems());
                        ((FeedItemList) this.mData).items = feedItemList2.items;
                        break;
                }
            } else {
                ((FeedItemList) this.mData).items.addAll(feedItemList2.items);
                ((FeedItemList) this.mData).hasMore &= feedItemList2.hasMore;
            }
            ((FeedItemList) this.mData).cursor = feedItemList2.cursor;
            if (((FeedItemList) this.mData).maxCursor != 0) {
                ((FeedItemList) this.mData).maxCursor = Math.min(((FeedItemList) this.mData).maxCursor, feedItemList2.maxCursor);
            }
            if (((FeedItemList) this.mData).minCursor != 0) {
                ((FeedItemList) this.mData).minCursor = Math.max(((FeedItemList) this.mData).minCursor, feedItemList2.minCursor);
            }
            for (int i6 = 0; i6 < ((FeedItemList) this.mData).items.size(); i6++) {
                ((FeedItemList) this.mData).items.get(i6).setAwemePosition(i6);
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = null;
            }
            if (!(this.mData == null || this.mListQueryType == 2)) {
                ((FeedItemList) this.mData).hasMore = 0;
            }
        }
        b(feedItemList);
    }

    public g(int i2, int i3) {
        this(i2, i3, false);
    }

    private g(int i2, int i3, boolean z) {
        this.mCount = i2;
        this.f45487d = i3;
        this.k = false;
    }

    @SuppressLint({"TooManyMethodParam"})
    private void b(int i2, long j2, long j3, int i3, Integer num, String str, int i4, String str2, String str3, String str4) {
        g gVar;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5), Integer.valueOf(i3), num, str, Integer.valueOf(i4), str2, str3, str4}, this, f45483a, false, 42026, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5), Integer.valueOf(i3), num, str, Integer.valueOf(i4), str2, str3, str4}, this, f45483a, false, 42026, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (i4 != 0 || !com.ss.android.ugc.aweme.feed.cache.a.c()) {
            gVar = this;
        } else {
            gVar = this;
            i.a((Callable<TResult>) new i<TResult>(gVar));
        }
        g gVar2 = gVar;
        j jVar = r0;
        j jVar2 = new j(this, i2, j2, j3, i3, num, str, i4, str2, str3, str4);
        if (gVar2.k) {
            com.ss.android.b.a.a.a.b(new k(jVar));
        } else {
            jVar.run();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: com.bytedance.common.utility.collection.WeakHandler} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: com.bytedance.common.utility.collection.WeakHandler} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: com.ss.android.ugc.aweme.feed.z$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: com.bytedance.common.utility.collection.WeakHandler} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(int r17, long r18, long r20, int r22, java.lang.Integer r23, java.lang.String r24, int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            r16 = this;
            r14 = r17
            r15 = r16
            com.bytedance.common.utility.collection.WeakHandler r13 = r15.mHandler
            com.ss.android.ugc.aweme.feed.h.g$1 r12 = new com.ss.android.ugc.aweme.feed.h.g$1
            r0 = r12
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r15 = r12
            r12 = r27
            r14 = r13
            r13 = r28
            r0.<init>(r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = android.text.TextUtils.isEmpty(r24)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            boolean r0 = android.text.TextUtils.isEmpty(r28)
            if (r0 == 0) goto L_0x003a
            boolean r0 = android.text.TextUtils.isEmpty(r27)
            if (r0 == 0) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r4[r2] = r5
            r4[r1] = r14
            r5 = 2
            r4[r5] = r15
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7 = 3
            r4[r7] = r6
            java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
            r8 = 4
            r4[r8] = r6
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.feed.z.f47066a
            r10 = 1
            r11 = 40120(0x9cb8, float:5.622E-41)
            java.lang.Class[] r12 = new java.lang.Class[r3]
            java.lang.Class r13 = java.lang.Integer.TYPE
            r12[r2] = r13
            java.lang.Class<com.bytedance.common.utility.collection.WeakHandler> r13 = com.bytedance.common.utility.collection.WeakHandler.class
            r12[r1] = r13
            java.lang.Class<java.util.concurrent.Callable> r13 = java.util.concurrent.Callable.class
            r12[r5] = r13
            java.lang.Class r13 = java.lang.Integer.TYPE
            r12[r7] = r13
            java.lang.Class r13 = java.lang.Boolean.TYPE
            r12[r8] = r13
            java.lang.Class r13 = java.lang.Void.TYPE
            r18 = r4
            r19 = r6
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r12
            r24 = r13
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r4 == 0) goto L_0x00d3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)
            r4[r2] = r6
            r4[r1] = r14
            r4[r5] = r15
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4[r7] = r6
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r4[r8] = r0
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.feed.z.f47066a
            r9 = 1
            r10 = 40120(0x9cb8, float:5.622E-41)
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Class r11 = java.lang.Integer.TYPE
            r3[r2] = r11
            java.lang.Class<com.bytedance.common.utility.collection.WeakHandler> r2 = com.bytedance.common.utility.collection.WeakHandler.class
            r3[r1] = r2
            java.lang.Class<java.util.concurrent.Callable> r1 = java.util.concurrent.Callable.class
            r3[r5] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r3[r7] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r3[r8] = r1
            java.lang.Class r1 = java.lang.Void.TYPE
            r17 = r4
            r18 = r0
            r19 = r6
            r20 = r9
            r21 = r10
            r22 = r3
            r23 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x00d3:
            if (r0 == 0) goto L_0x0101
            r0 = r17
            if (r0 != 0) goto L_0x0103
            java.lang.Boolean r1 = com.ss.android.ugc.aweme.feed.z.f47067b
            if (r1 != 0) goto L_0x0103
            if (r14 == 0) goto L_0x0103
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            com.ss.android.ugc.aweme.feed.z.f47067b = r1
            long r3 = com.ss.android.ugc.aweme.feed.z.f47071f
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00f4
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = com.ss.android.ugc.aweme.feed.z.f47071f
            long r3 = r3 - r5
            com.ss.android.ugc.aweme.feed.z.h = r3
        L_0x00f4:
            com.ss.android.ugc.aweme.feed.z$b r13 = new com.ss.android.ugc.aweme.feed.z$b
            r13.<init>(r14, r2)
            com.ss.android.ugc.aweme.feed.z.i = r13
            com.ss.android.ugc.aweme.feed.z$a r12 = new com.ss.android.ugc.aweme.feed.z$a
            r12.<init>(r15)
            goto L_0x0105
        L_0x0101:
            r0 = r17
        L_0x0103:
            r13 = r14
            r12 = r15
        L_0x0105:
            com.ss.android.ugc.aweme.feed.aa r1 = new com.ss.android.ugc.aweme.feed.aa
            r1.<init>(r12, r13, r0, r2)
            com.ss.android.ugc.aweme.feed.ab r0 = new com.ss.android.ugc.aweme.feed.ab
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r1 = com.ss.android.ugc.aweme.thread.h.c()
            a.i.a((java.util.concurrent.Callable<TResult>) r0, (java.util.concurrent.Executor) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.h.g.a(int, long, long, int, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void");
    }
}

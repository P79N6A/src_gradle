package com.ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.api.u;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.n;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.dr;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Nullable;

public final class b extends a<Aweme, FeedItemList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61591a;

    /* renamed from: b  reason: collision with root package name */
    public int f61592b;

    /* renamed from: c  reason: collision with root package name */
    public String f61593c;

    /* renamed from: d  reason: collision with root package name */
    private int f61594d;

    public final boolean isNewDataEmpty() {
        return false;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).items;
    }

    public final boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f61591a, false, 67548, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61591a, false, 67548, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((FeedItemList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 5) {
            return false;
        }
        return true;
    }

    public final void a(@NonNull FeedItemList feedItemList) {
        if (PatchProxy.isSupport(new Object[]{feedItemList}, this, f61591a, false, 67538, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList}, this, f61591a, false, 67538, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        Message obtainMessage = this.mHandler.obtainMessage(0);
        obtainMessage.obj = feedItemList;
        handleMsg(obtainMessage);
    }

    public final Observable<FeedItemList> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f61591a, false, 67550, new Class[]{String.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{str2}, this, f61591a, false, 67550, new Class[]{String.class}, Observable.class);
        }
        ((n) c.a(k.a(), n.class)).a("");
        return Observable.create(new c(this, str2)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public FeedItemList b(@Nullable String str) {
        String a2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f61591a, false, 67554, new Class[]{String.class}, FeedItemList.class)) {
            return (FeedItemList) PatchProxy.accessDispatch(new Object[]{str}, this, f61591a, false, 67554, new Class[]{String.class}, FeedItemList.class);
        }
        File c2 = c(str);
        if (c2 != null && c2.exists()) {
            synchronized (this) {
                a2 = bm.a(c2, "UTF-8");
            }
            if (!TextUtils.isEmpty(a2)) {
                try {
                    return (FeedItemList) u.a().fromJson(a2, FeedItemList.class);
                } catch (JsonSyntaxException unused) {
                } catch (JsonIOException e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a(a2, (Exception) e2);
                } catch (UnsupportedOperationException e3) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e3);
                }
            }
        }
        return null;
    }

    public final void setItems(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f61591a, false, 67547, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f61591a, false, 67547, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setItems(list);
        if (this.mData == null) {
            FeedItemList feedItemList = new FeedItemList();
            feedItemList.items = list;
            this.mData = feedItemList;
            return;
        }
        ((FeedItemList) this.mData).items = list;
    }

    @Nullable
    private File c(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f61591a, false, 67555, new Class[]{String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{str3}, this, f61591a, false, 67555, new Class[]{String.class}, File.class);
        }
        File cacheDir = GlobalContext.getContext().getCacheDir();
        if (cacheDir == null || !cacheDir.exists()) {
            return null;
        }
        File file = new File(cacheDir.getPath() + File.separator + "aweme_publish");
        try {
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
        } catch (SecurityException unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(File.separator);
        if (PatchProxy.isSupport(new Object[]{str3}, this, f61591a, false, 67556, new Class[]{String.class}, String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[]{str3}, this, f61591a, false, 67556, new Class[]{String.class}, String.class);
        } else {
            str2 = com.bytedance.sdk.account.b.d.b.a("https://aweme.snssdk.com/aweme/v1/aweme/post/" + str3);
        }
        sb.append(str2);
        return new File(sb.toString());
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f61591a, false, 67540, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f61591a, false, 67540, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f61592b = objArr[4].intValue();
        long j = 0;
        if (objArr.length >= 6) {
            String str = objArr[2];
            int intValue = objArr[3].intValue();
            if (this.mData != null) {
                j = ((FeedItemList) this.mData).maxCursor;
            }
            a(str, intValue, j, 10, objArr[5]);
            return;
        }
        String a2 = dr.a().a(objArr[2]);
        String str2 = objArr[2];
        int intValue2 = objArr[3].intValue();
        if (this.mData != null) {
            j = ((FeedItemList) this.mData).maxCursor;
        }
        a(str2, intValue2, j, 10, a2);
    }

    public final void refreshList(Object... objArr) {
        int i;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f61591a, false, 67539, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f61591a, false, 67539, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f61592b = objArr[4].intValue();
        if (this.f61594d == 4) {
            i = 12;
        } else {
            i = 20;
        }
        if (objArr.length >= 6) {
            boolean booleanValue = objArr[1].booleanValue();
            int intValue = objArr[3].intValue();
            a(booleanValue, objArr[2], intValue, 0, i, objArr[5]);
            return;
        }
        String a2 = dr.a().a(objArr[2]);
        a(objArr[1].booleanValue(), objArr[2], objArr[3].intValue(), 0, i, a2);
    }

    public final boolean sendRequest(Object... objArr) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f61591a, false, 67544, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f61591a, false, 67544, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f61591a, false, 67545, new Class[]{Object[].class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f61591a, false, 67545, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (checkParams(objArr)) {
            this.mIsLoading = true;
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        this.mListQueryType = objArr[0].intValue();
        int i = this.mListQueryType;
        if (i != 4) {
            switch (i) {
                case 1:
                    refreshList(objArr);
                    break;
                case 2:
                    loadLatestList(objArr);
                    break;
            }
        } else {
            loadMoreList(objArr);
        }
        return true;
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        boolean z2;
        int i;
        Aweme aweme;
        FeedItemList feedItemList = (FeedItemList) obj;
        if (PatchProxy.isSupport(new Object[]{feedItemList}, this, f61591a, false, 67546, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList}, this, f61591a, false, 67546, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        ai.a().a(feedItemList.getRequestId(), feedItemList.logPb);
        if (feedItemList == null || feedItemList.fetchType != 0) {
            z = false;
        } else {
            z = true;
        }
        if (feedItemList == null || CollectionUtils.isEmpty(feedItemList.items)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int size = feedItemList.items.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme2 = feedItemList.items.get(i2);
                if (aweme2 == null) {
                    i = -1;
                } else {
                    i = aweme2.getIsTop();
                }
                if (aweme2 == null || (!aweme2.isSelfSee() && !aweme2.isProhibited())) {
                    aweme = com.ss.android.ugc.aweme.feed.a.a().a(aweme2);
                } else {
                    aweme = com.ss.android.ugc.aweme.feed.a.a().a(aweme2, this.f61594d);
                }
                if (z && i >= 0) {
                    aweme.setIsTop(i);
                }
                com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
                a2.a(aweme.getAid() + (this.f61592b + this.f61594d), feedItemList.getRequestId(), i2);
                feedItemList.items.set(i2, aweme);
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = feedItemList;
                if (TextUtils.equals(this.f61593c, d.a().getCurUserId())) {
                    com.ss.android.ugc.aweme.profile.d.a.a(this.f61594d, false, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.items.size());
                }
            } else if (i3 == 4) {
                if (this.mData == null) {
                    this.mData = feedItemList;
                } else {
                    if (CollectionUtils.isEmpty(((FeedItemList) this.mData).items)) {
                        ((FeedItemList) this.mData).items = feedItemList.items;
                    } else {
                        ((FeedItemList) this.mData).items.addAll(a(feedItemList.items, ((FeedItemList) this.mData).items));
                    }
                    ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                    ((FeedItemList) this.mData).hasMore = feedItemList.hasMore & ((FeedItemList) this.mData).hasMore;
                }
                if (TextUtils.equals(this.f61593c, d.a().getCurUserId()) && ((FeedItemList) this.mData).items.size() - feedItemList.items.size() <= 10) {
                    com.ss.android.ugc.aweme.profile.d.a.a(this.f61594d, true, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.items.size());
                }
            }
            if (this.f61594d == 4 && this.mData != null) {
                ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                ((FeedItemList) this.mData).maxCursor = feedItemList.cursor;
            }
        } else if (this.mData != null) {
            if (feedItemList != null) {
                ((FeedItemList) this.mData).hasMore = feedItemList.hasMore;
                ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                return;
            }
            ((FeedItemList) this.mData).hasMore = 0;
        } else if (feedItemList == null) {
            this.mData = new FeedItemList();
            ((FeedItemList) this.mData).hasMore = 0;
        } else {
            this.mData = feedItemList;
        }
    }

    private static List<Aweme> a(List<Aweme> list, List<Aweme> list2) {
        if (PatchProxy.isSupport(new Object[]{list, list2}, null, f61591a, true, 67549, new Class[]{List.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, list2}, null, f61591a, true, 67549, new Class[]{List.class, List.class}, List.class);
        } else if (list == null || list2 == null) {
            return list;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Aweme next : list) {
                arrayList.add(next);
                Iterator<Aweme> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (TextUtils.equals(next.getAid(), it2.next().getAid())) {
                            arrayList.remove(next);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return arrayList;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.FeedItemList r12, java.lang.String r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r12
            r10 = 1
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f61591a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r2 = com.ss.android.ugc.aweme.feed.model.FeedItemList.class
            r6[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 67551(0x107df, float:9.4659E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003f
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r12
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f61591a
            r4 = 0
            r5 = 67551(0x107df, float:9.4659E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r0 = com.ss.android.ugc.aweme.feed.model.FeedItemList.class
            r6[r9] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x003f:
            monitor-enter(r11)
            java.io.File r1 = r11.c(r13)     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0048
            monitor-exit(r11)     // Catch:{ all -> 0x0062 }
            return
        L_0x0048:
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0060 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0060 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0060 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0060 }
            com.google.gson.Gson r1 = com.ss.android.ugc.aweme.app.api.u.a()     // Catch:{ IOException -> 0x0060 }
            java.lang.String r0 = r1.toJson((java.lang.Object) r12)     // Catch:{ IOException -> 0x0060 }
            r2.write(r0)     // Catch:{ IOException -> 0x0060 }
            r2.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            monitor-exit(r11)     // Catch:{ all -> 0x0062 }
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0062 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.b.a(com.ss.android.ugc.aweme.feed.model.FeedItemList, java.lang.String):void");
    }

    private void a(String str, int i, long j, int i2, String str2) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), new Long(j2), 10, str2}, this, f61591a, false, 67542, new Class[]{String.class, Integer.TYPE, Long.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str, Integer.valueOf(i), new Long(j2), 10, str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f61591a, false, 67542, new Class[]{String.class, Integer.TYPE, Long.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(false, str, i, j, 10, str2);
    }

    private void a(boolean z, String str, int i, long j, int i2, String str2) {
        String str3 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str3, Integer.valueOf(i), new Long(j2), Integer.valueOf(i2), str2}, this, f61591a, false, 67541, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Long.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str3, Integer.valueOf(i), new Long(j2), Integer.valueOf(i2), str2}, this, f61591a, false, 67541, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Long.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        final int i3 = i;
        this.f61594d = i3;
        this.f61593c = str3;
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final boolean z2 = z;
        final String str4 = str;
        final String str5 = str2;
        final long j3 = j;
        final int i4 = i2;
        AnonymousClass1 r0 = new Callable<FeedItemList>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61595a;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public FeedItemList call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f61595a, false, 67560, new Class[0], FeedItemList.class)) {
                    return (FeedItemList) PatchProxy.accessDispatch(new Object[0], this, f61595a, false, 67560, new Class[0], FeedItemList.class);
                }
                FeedItemList a2 = AwemeApi.a(z2, str4, str5, i3, j3, i4, null);
                if (a2 != null) {
                    a2.fetchType = i3;
                    if (TextUtils.equals(str4, d.a().getCurUserId()) && i3 == 0 && j3 == 0) {
                        b.this.a(a2, str4);
                    }
                }
                return a2;
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}

package com.ss.android.ugc.aweme.feed;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.commercialize.feed.a;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.share.seconditem.e;
import com.ss.android.ugc.aweme.splash.SplashAdActivity;
import java.util.concurrent.Callable;

public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44631a;

    /* renamed from: b  reason: collision with root package name */
    private final Callable f44632b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f44633c;

    /* renamed from: d  reason: collision with root package name */
    private final int f44634d;

    /* renamed from: e  reason: collision with root package name */
    private final int f44635e;

    public aa(Callable callable, Handler handler, int i, int i2) {
        this.f44632b = callable;
        this.f44633c = handler;
        this.f44634d = i;
        this.f44635e = i2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f44631a, false, 40129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44631a, false, 40129, new Class[0], Void.TYPE);
            return;
        }
        Callable callable = this.f44632b;
        Handler handler = this.f44633c;
        int i = this.f44634d;
        int i2 = this.f44635e;
        try {
            e = callable.call();
        } catch (Exception e2) {
            e = e2;
        }
        Object obj = e;
        if (!(handler == null || obj == null)) {
            boolean z = obj instanceof FeedItemList;
            if (z) {
                FeedItemList feedItemList = (FeedItemList) obj;
                if (feedItemList != null && !CollectionUtils.isEmpty(feedItemList.items)) {
                    if (PatchProxy.isSupport(new Object[]{feedItemList, Integer.valueOf(i)}, null, g.f45483a, true, 42027, new Class[]{FeedItemList.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{feedItemList, Integer.valueOf(i)}, null, g.f45483a, true, 42027, new Class[]{FeedItemList.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        c.b(feedItemList);
                        a.a().a(feedItemList);
                        c.a(feedItemList);
                        e.a(feedItemList);
                        int size = feedItemList.items.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Aweme aweme = feedItemList.items.get(i3);
                            aweme.setRequestId(feedItemList.getRequestId());
                            Aweme a2 = a.a().a(aweme);
                            a a3 = a.a();
                            a3.a(a2.getAid() + (i + 0), feedItemList.getRequestId(), i3);
                            feedItemList.items.set(i3, a2);
                        }
                        if (!(!AwemeAppData.p().an || feedItemList == null || feedItemList.localExtra == null)) {
                            com.ss.android.ugc.aweme.feed.e.a.a().a(feedItemList.items, feedItemList.localExtra.get("aweme_id"));
                        }
                    }
                }
            }
            Message obtainMessage = handler.obtainMessage(i2);
            obtainMessage.obj = obj;
            if (SplashAdActivity.f71565e && com.ss.android.g.a.a()) {
                SplashAdActivity.f71566f = true;
                Object obj2 = SplashAdActivity.f71564d;
                try {
                    synchronized (obj2) {
                        obj2.wait(5000);
                    }
                } catch (InterruptedException unused) {
                }
            }
            handler.sendMessage(obtainMessage);
            if (z) {
                z.a((FeedItemList) obj);
            }
        }
    }
}

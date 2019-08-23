package com.ss.android.ugc.aweme.poi.model;

import a.i;
import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.newfollow.a.b;
import com.ss.android.ugc.aweme.newfollow.e.c;
import java.util.ArrayList;

public final class g implements a.g<i, Void> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59914a;

    /* renamed from: b  reason: collision with root package name */
    Handler f59915b;

    /* renamed from: c  reason: collision with root package name */
    int f59916c;

    /* renamed from: d  reason: collision with root package name */
    String f59917d;

    public final /* synthetic */ Object then(i iVar) throws Exception {
        c cVar;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f59914a, false, 65003, new Class[]{i.class}, Void.class)) {
            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f59914a, false, 65003, new Class[]{i.class}, Void.class);
        } else if (this.f59915b == null) {
            return null;
        } else {
            Message obtainMessage = this.f59915b.obtainMessage(this.f59916c);
            if (iVar.c()) {
                cVar = new c(this.f59917d);
            } else if (iVar.d()) {
                cVar = new c(this.f59917d);
                cVar.h = iVar.f();
            } else {
                cVar = new c(this.f59917d);
                i iVar2 = (i) iVar.e();
                if (iVar2.status_code != 0) {
                    cVar.h = new Exception("fail request due to wrong status code");
                } else if (iVar2 != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    cVar.f57105e = iVar2.f59920b;
                    cVar.f57103c = (long) iVar2.f59921c;
                    cVar.f57104d = (long) iVar2.f59921c;
                    if (iVar2.f59919a != null) {
                        for (Aweme next : iVar2.f59919a) {
                            if (b.j(next)) {
                                FollowFeed followFeed = new FollowFeed(next);
                                followFeed.setRequestId(iVar2.getRequestId());
                                arrayList2.add(followFeed);
                            }
                        }
                        arrayList.addAll(arrayList2);
                    }
                    cVar.f57102b = arrayList;
                }
            }
            obtainMessage.obj = cVar;
            this.f59915b.sendMessage(obtainMessage);
            return null;
        }
    }

    public g(Handler handler, int i, String str) {
        this.f59915b = handler;
        this.f59916c = i;
        this.f59917d = str;
    }
}

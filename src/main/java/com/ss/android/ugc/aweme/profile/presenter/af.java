package com.ss.android.ugc.aweme.profile.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.account.c.a;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.profile.api.WatchApi;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.WatchStatus;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class af extends a<com.ss.android.ugc.aweme.common.a<WatchStatus>, s> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f61583b;

    /* renamed from: c  reason: collision with root package name */
    public WatchApi f61584c = ((WatchApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(WatchApi.class));
    public String g;

    public af() {
        if (PatchProxy.isSupport(new Object[0], this, f61583b, false, 67652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61583b, false, 67652, new Class[0], Void.TYPE);
            return;
        }
        a(new com.ss.android.ugc.aweme.common.a<WatchStatus>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61585a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 2) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(final Object... objArr) {
                final int i;
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f61585a, false, 67658, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f61585a, false, 67658, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    af.this.g = objArr[0];
                    if (objArr[1].intValue() == 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    m.a().a(this.mHandler, new Callable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f61587a;

                        public final Object call() throws Exception {
                            if (PatchProxy.isSupport(new Object[0], this, f61587a, false, 67659, new Class[0], Object.class)) {
                                return PatchProxy.accessDispatch(new Object[0], this, f61587a, false, 67659, new Class[0], Object.class);
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("user_id", (String) objArr[0]);
                            hashMap.put("type", String.valueOf(i));
                            NetUtil.putCommonParams(hashMap, true);
                            WatchStatus watchStatus = (WatchStatus) af.this.f61584c.turnPostNotification(hashMap).execute().body();
                            watchStatus.userId = (String) objArr[0];
                            return watchStatus;
                        }
                    }, 0);
                    return true;
                }
            }
        });
    }

    public final void b() {
        WatchStatus watchStatus;
        if (PatchProxy.isSupport(new Object[0], this, f61583b, false, 67655, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61583b, false, 67655, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e == null) {
            watchStatus = null;
        } else {
            watchStatus = (WatchStatus) this.f2978e.getData();
        }
        if (watchStatus != null) {
            if (this.f2979f != null) {
                ((s) this.f2979f).a(watchStatus);
                bg.a(watchStatus);
            }
            if (PatchProxy.isSupport(new Object[]{watchStatus}, this, f61583b, false, 67657, new Class[]{WatchStatus.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{watchStatus}, this, f61583b, false, 67657, new Class[]{WatchStatus.class}, Void.TYPE);
            } else if (com.ss.android.g.a.b() && watchStatus != null) {
                FollowStatus cpoyToFollowStatus = watchStatus.cpoyToFollowStatus();
                if (!(cpoyToFollowStatus == null || cpoyToFollowStatus.followStatus == 0)) {
                    bg.a(cpoyToFollowStatus);
                    User user = new User();
                    user.setUid(cpoyToFollowStatus.userId);
                    user.setFollowStatus(cpoyToFollowStatus.followStatus);
                    b.a().updateIMUserFollowStatus(b.a(user));
                }
            }
        }
    }

    public final boolean a(Object... objArr) {
        if (!PatchProxy.isSupport(new Object[]{objArr}, this, f61583b, false, 67653, new Class[]{Object[].class}, Boolean.TYPE)) {
            return super.a(objArr);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f61583b, false, 67653, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61583b, false, 67654, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61583b, false, 67654, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            String str = this.g;
            if (PatchProxy.isSupport(new Object[]{str}, this, f61583b, false, 67656, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f61583b, false, 67656, new Class[]{String.class}, Void.TYPE);
                return;
            }
            WatchStatus watchStatus = new WatchStatus();
            watchStatus.userId = str;
            watchStatus.watchStatus = 0;
            bg.a(watchStatus);
        }
    }
}

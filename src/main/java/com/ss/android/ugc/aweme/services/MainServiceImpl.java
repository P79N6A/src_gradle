package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.services.music.IMusicService;
import com.ss.android.ugc.aweme.video.local.d;

@Keep
public class MainServiceImpl implements IMainService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IBusinessGoodsService businessGoodsService;
    private IMusicService chooseMusicService;
    private ILocalVideoCacheService localVideoCacheService;

    public IBusinessGoodsService getBusinessGoodsService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71453, new Class[0], IBusinessGoodsService.class)) {
            return (IBusinessGoodsService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71453, new Class[0], IBusinessGoodsService.class);
        }
        if (this.businessGoodsService == null) {
            this.businessGoodsService = new BusinessGoodsServiceImpl();
        }
        return this.businessGoodsService;
    }

    public ILocalVideoCacheService getLocalVideoCacheService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71454, new Class[0], ILocalVideoCacheService.class)) {
            return (ILocalVideoCacheService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71454, new Class[0], ILocalVideoCacheService.class);
        }
        if (this.localVideoCacheService == null) {
            this.localVideoCacheService = new d();
        }
        return this.localVideoCacheService;
    }

    public IMusicService musicService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71450, new Class[0], IMusicService.class)) {
            return (IMusicService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71450, new Class[0], IMusicService.class);
        }
        if (this.chooseMusicService == null) {
            this.chooseMusicService = new com.ss.android.ugc.aweme.music.d();
        }
        return this.chooseMusicService;
    }

    public boolean isMainPage(Context context) {
        return context instanceof MainActivity;
    }

    public String getStoryEnterFromForMain(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 71451, new Class[]{Activity.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 71451, new Class[]{Activity.class}, String.class);
        } else if (!(activity2 instanceof MainActivity)) {
            return "";
        } else {
            if (((MainActivity) activity2).isUnderMainTab()) {
                return "homepage_hot";
            }
            return "homepage_friends";
        }
    }

    public void setStartWithoutSplash(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71452, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 71452, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AwemeAppData.p().ao = z;
    }
}

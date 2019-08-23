package com.ss.android.ugc.aweme.im.sdk.feedupdate;

import com.crashlytics.android.Crashlytics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<FeedUpdate.a> awemeSubsets = new ArrayList();
    private UrlModel coverUrl;
    private boolean isPhoto;
    private String lastAid;
    private long lastTime;
    private int tagCount;
    private String title;
    private String uid;

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getLastAid() {
        return this.lastAid;
    }

    public long getLastTime() {
        return this.lastTime;
    }

    public int getTagCount() {
        return this.tagCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isPhoto() {
        return this.isPhoto;
    }

    public void generate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52077, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52077, new Class[0], Void.TYPE);
        } else if (j.a((Collection<T>) this.awemeSubsets)) {
            this.tagCount = 0;
        } else {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<FeedUpdate.a> it2 = this.awemeSubsets.iterator();
            while (it2.hasNext()) {
                try {
                    if (currentTimeMillis - it2.next().timeStamp > 604800) {
                        it2.remove();
                    }
                } catch (Exception e2) {
                    Crashlytics.logException(e2);
                }
            }
            if (j.a((Collection<T>) this.awemeSubsets)) {
                this.tagCount = 0;
            } else {
                this.tagCount = this.awemeSubsets.size();
            }
        }
    }

    public void setPhoto(boolean z) {
        this.isPhoto = z;
    }

    public b(FeedUpdate.d dVar) {
        this.uid = String.valueOf(dVar.uid);
        add(dVar);
    }

    public void add(FeedUpdate.d dVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, changeQuickRedirect, false, 52078, new Class[]{FeedUpdate.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, changeQuickRedirect, false, 52078, new Class[]{FeedUpdate.d.class}, Void.TYPE);
            return;
        }
        if (dVar.lastAweme != null) {
            this.lastAid = dVar.lastAweme.f51449a;
            this.title = dVar.lastAweme.f51451c;
            this.lastTime = dVar.lastAweme.f51450b;
            if (dVar.lastAweme.f51454f != 2) {
                z = false;
            }
            this.isPhoto = z;
            if (this.isPhoto) {
                if (dVar.lastAweme.f51453e != null && dVar.lastAweme.f51453e.size() > 0) {
                    this.coverUrl = dVar.lastAweme.f51453e.get(0).f51448a;
                }
            } else if (dVar.lastAweme.f51452d != null) {
                this.coverUrl = dVar.lastAweme.f51452d.f51455a;
            }
        }
        this.awemeSubsets.addAll(dVar.getAwemeSubsets());
        this.tagCount = this.awemeSubsets.size();
    }
}

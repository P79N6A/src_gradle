package com.ss.android.ugc.aweme.challenge.singlelinestyle;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.model.mixfeed.ChallengeMixFeed;
import com.ss.android.ugc.aweme.challenge.model.mixfeed.ChallengeMixFeedModel;
import com.ss.android.ugc.aweme.newfollow.f.b;
import java.util.List;

public class a extends b<ChallengeMixFeedModel, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35423a;

    /* renamed from: b  reason: collision with root package name */
    SingleLineChallengeFeedFragment f35424b;

    public final Fragment c() {
        return this.f35424b;
    }

    public String getEventType() {
        if (!PatchProxy.isSupport(new Object[0], this, f35423a, false, 25927, new Class[0], String.class)) {
            return SingleLineChallengeFeedFragment.d();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f35423a, false, 25927, new Class[0], String.class);
    }

    public final void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35423a, false, 25924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35423a, false, 25924, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f2978e != null && this.f2979f != null && ((b) this.f2979f).isViewValid()) {
            ((b) this.f2979f).b(false);
            int i = ((ChallengeMixFeedModel) this.f2978e).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    b bVar = (b) this.f2979f;
                    List<ChallengeMixFeed> items = ((ChallengeMixFeedModel) this.f2978e).getItems();
                    if (((ChallengeMixFeedModel) this.f2978e).isHasMore() && !((ChallengeMixFeedModel) this.f2978e).isNewDataEmpty()) {
                        z = true;
                    }
                    bVar.b(items, z);
                }
            } else if (((ChallengeMixFeedModel) this.f2978e).isDataEmpty()) {
                ((b) this.f2979f).a(3);
            } else {
                ((b) this.f2979f).a(((ChallengeMixFeedModel) this.f2978e).getItems(), ((ChallengeMixFeedModel) this.f2978e).isHasMore());
            }
        }
    }

    public a(SingleLineChallengeFeedFragment singleLineChallengeFeedFragment) {
        this.f35424b = singleLineChallengeFeedFragment;
    }

    public final String a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35423a, false, 25926, new Class[]{Boolean.TYPE}, String.class)) {
            return SingleLineChallengeFeedFragment.d();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35423a, false, 25926, new Class[]{Boolean.TYPE}, String.class);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f35423a, false, 25925, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f35423a, false, 25925, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2978e != null && this.f2979f != null && ((b) this.f2979f).isViewValid()) {
            ((b) this.f2979f).b(false);
            int i = ((ChallengeMixFeedModel) this.f2978e).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    ((b) this.f2979f).c(1);
                }
                return;
            }
            ((b) this.f2979f).a(1);
        }
    }
}

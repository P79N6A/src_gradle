package com.ss.android.ugc.aweme.main.story;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.story.live.d;
import com.ss.android.ugc.aweme.story.model.Story;
import com.ss.android.ugc.aweme.story.model.StoryResponse;
import java.util.Iterator;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54903a;

    /* renamed from: b  reason: collision with root package name */
    public StoryResponse f54904b;

    /* renamed from: c  reason: collision with root package name */
    public d f54905c;

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f54903a, false, 58186, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54903a, false, 58186, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f54905c != null && !CollectionUtils.isEmpty(this.f54905c.f54983a) && com.ss.android.ugc.aweme.story.a.a()) {
            z = true;
        }
        return z;
    }

    public final boolean a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f54903a, false, 58185, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54903a, false, 58185, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[0], this, f54903a, false, 58187, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54903a, false, 58187, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (this.f54904b != null && !CollectionUtils.isEmpty(this.f54904b.getStoryFeed())) {
                Iterator<Story> it2 = this.f54904b.getStoryFeed().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().isLive()) {
                            if (com.ss.android.ugc.aweme.story.a.a()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = true;
            }
            z = false;
        }
        if (z || b()) {
            return true;
        }
        return false;
    }
}

package com.ss.android.ugc.aweme.story.feed.view.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.api.model.i;
import com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager;
import com.ss.android.ugc.aweme.story.feed.c.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.c;

public class StoryFeedPagerAdapter extends MultiTypePagerAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f4151e;

    /* renamed from: f  reason: collision with root package name */
    public List<b> f4152f = new ArrayList();
    public volatile boolean g;
    private Fragment h;
    private RollViewPager i;

    private static int c(int i2) {
        switch (i2) {
            case 14:
                return 0;
            case 15:
                return 1;
            case 10000:
                return 2;
            case 10001:
                return 3;
            default:
                return 0;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f4151e, false, 83914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4151e, false, 83914, new Class[0], Void.TYPE);
            return;
        }
        c.a().c(this);
    }

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f4151e, false, 83904, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4151e, false, 83904, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f4152f == null) {
            return 0;
        } else {
            return this.f4152f.size();
        }
    }

    public void notifyDataSetChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f4151e, false, 83907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4151e, false, 83907, new Class[0], Void.TYPE);
            return;
        }
        super.notifyDataSetChanged();
    }

    public final int a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4151e, false, 83901, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return c(this.f4152f.get(i2).getAwemeType());
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4151e, false, 83901, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final b b(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4151e, false, 83902, new Class[]{Integer.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4151e, false, 83902, new Class[]{Integer.TYPE}, b.class);
        } else if (i3 >= 0 && i3 < getCount()) {
            return this.f4152f.get(i3);
        } else {
            return null;
        }
    }

    public final int a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f4151e, false, 83912, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f4151e, false, 83912, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else if (view == null) {
            return 0;
        } else {
            return c(((a) view.getTag()).j().getAwemeType());
        }
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f4151e, false, 83913, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f4151e, false, 83913, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Object tag = view.getTag();
        if (tag != null && (tag instanceof a)) {
            ((a) tag).h();
        }
    }

    public int getItemPosition(Object obj) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f4151e, false, 83905, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f4151e, false, 83905, new Class[]{Object.class}, Integer.TYPE)).intValue();
        }
        a aVar = (a) ((View) obj).getTag();
        int count = getCount();
        for (int i2 = 0; i2 < count; i2++) {
            b bVar = this.f4152f.get(i2);
            if (aVar != null && StringUtils.equal(bVar.getStoryId(), aVar.i())) {
                b j = aVar.j();
                if (PatchProxy.isSupport(new Object[]{bVar, j}, this, f4151e, false, 83906, new Class[]{b.class, b.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, j}, this, f4151e, false, 83906, new Class[]{b.class, b.class}, Boolean.TYPE)).booleanValue();
                } else if (bVar == null || j == null || bVar.getAwemeType() != j.getAwemeType()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return i2;
                }
            }
        }
        return -2;
    }

    @Subscribe
    public void onViewerCountChange(com.ss.android.ugc.aweme.story.comment.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f4151e, false, 83903, new Class[]{com.ss.android.ugc.aweme.story.comment.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f4151e, false, 83903, new Class[]{com.ss.android.ugc.aweme.story.comment.b.b.class}, Void.TYPE);
            return;
        }
        HashMap<String, i> hashMap = bVar.f72147a;
        if (hashMap != null && !hashMap.isEmpty() && !CollectionUtils.isEmpty(this.f4152f)) {
            for (String next : hashMap.keySet()) {
                for (b next2 : this.f4152f) {
                    if (TextUtils.equals(next2.getLifeStory().getStoryId(), next)) {
                        next2.setViewUserList(hashMap.get(next));
                    }
                }
            }
        }
    }

    public final void a(b bVar) {
        b bVar2;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f4151e, false, 83909, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f4151e, false, 83909, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f4151e, false, 83910, new Class[]{b.class}, b.class)) {
            bVar2 = (b) PatchProxy.accessDispatch(new Object[]{bVar}, this, f4151e, false, 83910, new Class[]{b.class}, b.class);
        } else {
            if (!CollectionUtils.isEmpty(this.f4152f)) {
                Iterator<b> it2 = this.f4152f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    b next = it2.next();
                    if (g.a(next, bVar)) {
                        bVar2 = next;
                        break;
                    }
                }
            }
            bVar2 = null;
        }
        if (bVar2 != null) {
            if (getCount() > 1) {
                int indexOf = this.f4152f.indexOf(bVar2);
                if (indexOf != getCount() - 1) {
                    this.g = true;
                    this.i.setCurrentItem(indexOf + 1);
                } else {
                    this.i.setCurrentItem(indexOf - 1);
                }
            }
            this.g = false;
            if (this.f4152f.remove(bVar2)) {
                notifyDataSetChanged();
            }
        }
    }

    public final void a(List<b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f4151e, false, 83896, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f4151e, false, 83896, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f4152f.clear();
        if (!CollectionUtils.isEmpty(list)) {
            this.f4152f.addAll(list);
        }
        notifyDataSetChanged();
    }

    public final View a(int i2, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        View inflate;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), view, viewGroup2}, this, f4151e, false, 83897, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), view, viewGroup2}, this, f4151e, false, 83897, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        }
        int a2 = a(i2);
        if (view == null) {
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(a2)}, this, f4151e, false, 83899, new Class[]{ViewGroup.class, Integer.TYPE}, View.class)) {
                switch (a2) {
                    case 0:
                        inflate = this.f4148c.inflate(C0906R.layout.a9c, viewGroup2, false);
                        break;
                    case 1:
                        inflate = this.f4148c.inflate(C0906R.layout.a91, viewGroup2, false);
                        break;
                    case 2:
                        inflate = this.f4148c.inflate(C0906R.layout.a9b, viewGroup2, false);
                        break;
                    case 3:
                        inflate = this.f4148c.inflate(C0906R.layout.a9a, viewGroup2, false);
                        break;
                    default:
                        inflate = this.f4148c.inflate(C0906R.layout.a9c, viewGroup2, false);
                        break;
                }
            } else {
                inflate = (View) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(a2)}, this, f4151e, false, 83899, new Class[]{ViewGroup.class, Integer.TYPE}, View.class);
            }
            View view3 = inflate;
            if (!PatchProxy.isSupport(new Object[]{view3, Integer.valueOf(a2), Integer.valueOf(i2)}, this, f4151e, false, 83898, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, a.class)) {
                switch (a2) {
                    case 0:
                        aVar = new f(view3, this.h, this);
                        break;
                    case 1:
                        aVar = new StoryImageViewHolder(view3, this.h, this);
                        break;
                    case 2:
                        aVar = new e(view3, this.h, this);
                        break;
                    case 3:
                        aVar = new d(view3, this.h, this);
                        break;
                    default:
                        aVar = new f(view3, this.h, this);
                        break;
                }
            } else {
                aVar = (a) PatchProxy.accessDispatch(new Object[]{view3, Integer.valueOf(a2), Integer.valueOf(i2)}, this, f4151e, false, 83898, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, a.class);
            }
            view3.setTag(aVar);
            view2 = view3;
        } else {
            aVar = (a) view.getTag();
            view2 = view;
        }
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Integer.valueOf(i2), viewGroup2, Integer.valueOf(a2)}, this, f4151e, false, 83900, new Class[]{a.class, Integer.TYPE, ViewGroup.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Integer.valueOf(i2), viewGroup2, Integer.valueOf(a2)}, this, f4151e, false, 83900, new Class[]{a.class, Integer.TYPE, ViewGroup.class, Integer.TYPE}, Void.TYPE);
        } else {
            aVar2.a(this.f4152f.get(i2));
        }
        return view2;
    }

    public StoryFeedPagerAdapter(Context context, LayoutInflater layoutInflater, Fragment fragment, RollViewPager rollViewPager) {
        super(context, layoutInflater);
        this.h = fragment;
        this.i = rollViewPager;
        c.a().a((Object) this);
    }
}

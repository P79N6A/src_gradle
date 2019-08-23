package com.bytedance.scene.ui;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.animation.b;
import com.bytedance.scene.b.j;
import com.bytedance.scene.e;
import com.bytedance.scene.group.c;
import com.bytedance.scene.group.d;
import com.bytedance.scene.group.h;

public abstract class ScenePageAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private c f22213a;

    /* renamed from: b  reason: collision with root package name */
    private h f22214b;

    public abstract h a(int i);

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        if (((e) obj).f22094b == view) {
            return true;
        }
        return false;
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        String str = "android:switcher:" + ((long) i);
        ViewPager viewPager = (ViewPager) viewGroup;
        h hVar = (h) this.f22213a.a(str);
        if (hVar != null) {
            a(viewPager, hVar, i);
            this.f22213a.c(hVar);
            return hVar;
        }
        h a2 = a(i);
        a(viewPager, a2, i);
        this.f22213a.a(viewGroup.getId(), (e) a2, str);
        return a2;
    }

    private void a(ViewPager viewPager, h hVar, int i) {
        boolean z;
        if (this.f22214b == null && viewPager.getCurrentItem() == i) {
            this.f22214b = hVar;
        }
        if (hVar == this.f22214b) {
            z = true;
        } else {
            z = false;
        }
        if (hVar.l != z) {
            hVar.a(z);
        }
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        c cVar = this.f22213a;
        b bVar = c.i;
        j.a();
        d dVar = cVar.j;
        d.e eVar = new d.e(dVar, (e) obj, bVar, (byte) 0);
        if (dVar.f22116e) {
            dVar.f22117f.add(eVar);
        } else {
            d.a((d.C0229d) eVar);
        }
    }

    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        h hVar = (h) obj;
        if (hVar != this.f22214b) {
            if (this.f22214b != null) {
                this.f22214b.a(false);
            }
            if (hVar != null) {
                hVar.a(true);
            }
            this.f22214b = hVar;
        }
    }
}

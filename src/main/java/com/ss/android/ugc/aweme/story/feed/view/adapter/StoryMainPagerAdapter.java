package com.ss.android.ugc.aweme.story.feed.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import java.util.ArrayList;
import java.util.List;

public class StoryMainPagerAdapter extends MultiTypePagerAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f72715e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f72716f;
    public List<UserStory> g = new ArrayList();
    private Fragment h;
    private ViewPager i;

    public final int a(int i2) {
        return 0;
    }

    public final int a(View view) {
        return 0;
    }

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f72715e, false, 84009, new Class[0], Integer.TYPE)) {
            return this.g.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72715e, false, 84009, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(List<UserStory> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f72715e, false, 84011, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f72715e, false, 84011, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.g.clear();
        if (!CollectionUtils.isEmpty(list)) {
            this.g.addAll(list);
        }
        notifyDataSetChanged();
    }

    public final UserStory b(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72715e, false, 84012, new Class[]{Integer.TYPE}, UserStory.class)) {
            return (UserStory) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72715e, false, 84012, new Class[]{Integer.TYPE}, UserStory.class);
        } else if (i3 >= 0 && i3 < getCount()) {
            return this.g.get(i3);
        } else {
            return null;
        }
    }

    public int getItemPosition(@NonNull Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f72715e, false, 84013, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f72715e, false, 84013, new Class[]{Object.class}, Integer.TYPE)).intValue();
        }
        c cVar = (c) ((View) obj).getTag();
        int count = getCount();
        for (int i2 = 0; i2 < count; i2++) {
            UserStory userStory = this.g.get(i2);
            if (cVar != null && g.a(userStory, cVar.f72725f)) {
                return i2;
            }
        }
        return -2;
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72715e, false, 84010, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72715e, false, 84010, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Object tag = view.getTag();
        if (tag != null && (tag instanceof c)) {
            ((c) tag).h();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.ss.android.ugc.aweme.story.feed.view.adapter.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(int r14, android.view.View r15, android.view.ViewGroup r16) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r10 = 0
            r0[r10] = r1
            r11 = 1
            r0[r11] = r15
            r12 = 2
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f72715e
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 84007(0x14827, float:1.17719E-40)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r10] = r1
            r0[r11] = r15
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f72715e
            r3 = 0
            r4 = 84007(0x14827, float:1.17719E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x005a:
            if (r15 != 0) goto L_0x0072
            android.view.LayoutInflater r0 = r7.f4148c
            r1 = 2131690690(0x7f0f04c2, float:1.901043E38)
            android.view.View r0 = r0.inflate(r1, r8, r10)
            com.ss.android.ugc.aweme.story.feed.view.adapter.c r1 = new com.ss.android.ugc.aweme.story.feed.view.adapter.c
            android.support.v4.app.Fragment r2 = r7.h
            android.support.v4.view.ViewPager r3 = r7.i
            r1.<init>(r0, r2, r3)
            r0.setTag(r1)
            goto L_0x007a
        L_0x0072:
            java.lang.Object r0 = r15.getTag()
            r1 = r0
            com.ss.android.ugc.aweme.story.feed.view.adapter.c r1 = (com.ss.android.ugc.aweme.story.feed.view.adapter.c) r1
            r0 = r15
        L_0x007a:
            java.util.List<com.ss.android.ugc.aweme.story.api.model.UserStory> r2 = r7.g
            r3 = r14
            java.lang.Object r2 = r2.get(r14)
            com.ss.android.ugc.aweme.story.api.model.UserStory r2 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r2
            r1.b((com.ss.android.ugc.aweme.story.api.model.UserStory) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.adapter.StoryMainPagerAdapter.a(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public StoryMainPagerAdapter(Context context, LayoutInflater layoutInflater, Fragment fragment, ViewPager viewPager) {
        super(context, layoutInflater);
        this.h = fragment;
        this.i = viewPager;
    }
}

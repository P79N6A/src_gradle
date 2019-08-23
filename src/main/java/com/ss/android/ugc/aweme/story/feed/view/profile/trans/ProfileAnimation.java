package com.ss.android.ugc.aweme.story.feed.view.profile.trans;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ProfileAnimation extends DefaultItemAnimator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72790a;

    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (!PatchProxy.isSupport(new Object[]{viewHolder, viewHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f72790a, false, 84081, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return super.animateChange(viewHolder, viewHolder2, i, i2, i3, i4);
        }
        Object[] objArr = {viewHolder, viewHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        return ((Boolean) PatchProxy.accessDispatch(objArr, this, f72790a, false, 84081, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }
}

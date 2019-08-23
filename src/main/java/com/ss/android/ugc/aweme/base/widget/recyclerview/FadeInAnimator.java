package com.ss.android.ugc.aweme.base.widget.recyclerview;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.widget.recyclerview.BaseItemAnimator;

public class FadeInAnimator extends BaseItemAnimator {
    public static ChangeQuickRedirect j;

    public final void a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, j, false, 25571, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, j, false, 25571, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ViewCompat.setAlpha(viewHolder2.itemView, 0.0f);
    }

    public final void b(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, j, false, 25570, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, j, false, 25570, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ViewCompat.animate(viewHolder.itemView).alpha(0.0f).setDuration(getRemoveDuration()).setInterpolator(this.i).setListener(new BaseItemAnimator.DefaultRemoveVpaListener(viewHolder)).setStartDelay(e(viewHolder)).start();
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, j, false, 25572, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, j, false, 25572, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ViewCompat.animate(viewHolder.itemView).alpha(1.0f).setDuration(getAddDuration()).setInterpolator(this.i).setListener(new BaseItemAnimator.DefaultAddVpaListener(viewHolder)).setStartDelay(f(viewHolder)).start();
    }
}

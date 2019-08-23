package com.ss.android.ugc.aweme.account.base.widget.recyclerview;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.base.widget.recyclerview.BaseItemAnimator;

public class FadeInAnimator extends BaseItemAnimator {
    public static ChangeQuickRedirect j;

    public final void a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, j, false, 19798, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, j, false, 19798, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ViewCompat.setAlpha(viewHolder2.itemView, 0.0f);
    }

    public final void b(RecyclerView.ViewHolder viewHolder) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, j, false, 19797, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, j, false, 19797, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ViewPropertyAnimatorCompat listener = ViewCompat.animate(viewHolder.itemView).alpha(0.0f).setDuration(getRemoveDuration()).setInterpolator(this.i).setListener(new BaseItemAnimator.DefaultRemoveVpaListener(viewHolder));
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, BaseItemAnimator.f31748a, false, 19765, new Class[]{RecyclerView.ViewHolder.class}, Long.TYPE)) {
            j2 = ((Long) PatchProxy.accessDispatch(new Object[]{viewHolder}, this, BaseItemAnimator.f31748a, false, 19765, new Class[]{RecyclerView.ViewHolder.class}, Long.TYPE)).longValue();
        } else {
            j2 = Math.abs((((long) viewHolder.getOldPosition()) * getRemoveDuration()) / 4);
        }
        listener.setStartDelay(j2).start();
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, j, false, 19799, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, j, false, 19799, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ViewPropertyAnimatorCompat listener = ViewCompat.animate(viewHolder.itemView).alpha(1.0f).setDuration(getAddDuration()).setInterpolator(this.i).setListener(new BaseItemAnimator.DefaultAddVpaListener(viewHolder));
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, BaseItemAnimator.f31748a, false, 19767, new Class[]{RecyclerView.ViewHolder.class}, Long.TYPE)) {
            j2 = ((Long) PatchProxy.accessDispatch(new Object[]{viewHolder}, this, BaseItemAnimator.f31748a, false, 19767, new Class[]{RecyclerView.ViewHolder.class}, Long.TYPE)).longValue();
        } else {
            j2 = Math.abs((((long) viewHolder.getAdapterPosition()) * getAddDuration()) / 4);
        }
        listener.setStartDelay(j2).start();
    }
}

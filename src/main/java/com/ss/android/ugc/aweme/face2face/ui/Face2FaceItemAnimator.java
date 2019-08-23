package com.ss.android.ugc.aweme.face2face.ui;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.animation.OvershootInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.widget.recyclerview.BaseItemAnimator;
import com.ss.android.ugc.aweme.p.a;

public class Face2FaceItemAnimator extends BaseItemAnimator {
    public static ChangeQuickRedirect j;

    public Face2FaceItemAnimator() {
        this.i = new a();
        setAddDuration(150);
        setRemoveDuration(150);
        setMoveDuration(150);
    }

    public final void a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, j, false, 39256, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, j, false, 39256, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        viewHolder2.itemView.setAlpha(0.0f);
        viewHolder2.itemView.setScaleX(0.7f);
        viewHolder2.itemView.setScaleY(0.7f);
        ViewCompat.setTranslationZ(viewHolder2.itemView, -40.0f);
    }

    public final void b(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, j, false, 39257, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, j, false, 39257, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ViewCompat.animate(viewHolder.itemView).alpha(0.0f).translationZ(-40.0f).setDuration(getRemoveDuration()).setInterpolator(new OvershootInterpolator()).setListener(new BaseItemAnimator.DefaultRemoveVpaListener(viewHolder)).setStartDelay(e(viewHolder)).start();
        ViewCompat.animate(viewHolder.itemView).scaleX(0.7f).scaleY(0.7f).setInterpolator(new OvershootInterpolator()).setDuration(getAddDuration()).setListener(new BaseItemAnimator.DefaultAddVpaListener(viewHolder)).setStartDelay(f(viewHolder)).start();
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, j, false, 39258, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, j, false, 39258, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ViewCompat.animate(viewHolder.itemView).alpha(1.0f).translationZ(0.0f).setDuration(getAddDuration()).setInterpolator(this.i).setListener(new BaseItemAnimator.DefaultAddVpaListener(viewHolder)).setStartDelay(f(viewHolder)).start();
        ViewCompat.animate(viewHolder.itemView).scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(getAddDuration()).setListener(new BaseItemAnimator.DefaultAddVpaListener(viewHolder)).setStartDelay(f(viewHolder)).start();
    }

    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, viewHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, j, false, 39259, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            Object[] objArr = {viewHolder, viewHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, j, false, 39259, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (i != i3) {
            int i5 = i2;
            int i6 = i4;
        } else if (i2 == i4) {
            return true;
        }
        return super.animateChange(viewHolder, viewHolder2, i, i2, i3, i4);
    }
}

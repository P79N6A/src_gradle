package com.ss.android.ugc.aweme.effect;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.VEEffectAdapter;

public final /* synthetic */ class m implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43762a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectAdapter.ViewHolder f43763b;

    m(VEEffectAdapter.ViewHolder viewHolder) {
        this.f43763b = viewHolder;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f43762a, false, 38661, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f43762a, false, 38661, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        VEEffectAdapter.ViewHolder viewHolder = this.f43763b;
        int adapterPosition = viewHolder.getAdapterPosition();
        if (-1 == adapterPosition) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (VEEffectAdapter.this.f43561b != null) {
                        VEEffectAdapter.this.f43561b.a(0, adapterPosition, VEEffectAdapter.this.f43711e.get(adapterPosition));
                        break;
                    }
                    break;
                case 1:
                    break;
            }
        }
        if (VEEffectAdapter.this.f43561b != null) {
            VEEffectAdapter.this.f43561b.a(1, adapterPosition, VEEffectAdapter.this.f43711e.get(adapterPosition));
        }
        return true;
    }
}

package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class a implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14255a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseLiveViewHolder f14256b;

    a(BaseLiveViewHolder baseLiveViewHolder) {
        this.f14256b = baseLiveViewHolder;
    }

    public final boolean onLongClick(View view) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view}, this, f14255a, false, 8718, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f14255a, false, 8718, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        BaseLiveViewHolder baseLiveViewHolder = this.f14256b;
        Room room = baseLiveViewHolder.j;
        if (PatchProxy.isSupport(new Object[]{room}, baseLiveViewHolder, BaseLiveViewHolder.f14221a, false, 8716, new Class[]{Room.class}, Boolean.TYPE)) {
            BaseLiveViewHolder baseLiveViewHolder2 = baseLiveViewHolder;
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{room}, baseLiveViewHolder2, BaseLiveViewHolder.f14221a, false, 8716, new Class[]{Room.class}, Boolean.TYPE)).booleanValue();
        } else if (!(room == null || room.getOwner() == null)) {
            int[] iArr = new int[2];
            baseLiveViewHolder.itemView.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            View view2 = (View) baseLiveViewHolder.itemView.getParent();
            view2.getLocationInWindow(iArr2);
            int a2 = ac.a(78.0f);
            int max = Math.max(0, iArr2[1] - iArr[1]);
            int height = (baseLiveViewHolder.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + baseLiveViewHolder.itemView.getHeight()) - iArr2[1]) - view2.getHeight());
            float f2 = ((float) a2) / 2.0f;
            if (((float) height) >= (((float) baseLiveViewHolder.itemView.getHeight()) / 2.0f) + f2) {
                View inflate = View.inflate(baseLiveViewHolder.itemView.getContext(), C0906R.layout.alh, null);
                View findViewById = inflate.findViewById(C0906R.id.a5_);
                ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).topMargin = (int) (((((float) baseLiveViewHolder.itemView.getHeight()) / 2.0f) - f2) - ((float) max));
                PopupWindow popupWindow = new PopupWindow(inflate, baseLiveViewHolder.itemView.getWidth(), height, true);
                inflate.setOnClickListener(new f(popupWindow));
                findViewById.setOnClickListener(new g(baseLiveViewHolder, room, popupWindow));
                popupWindow.showAtLocation(baseLiveViewHolder.itemView, 51, iArr[0], iArr[1] + max);
                z = true;
            }
        }
        if (z) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return z;
    }
}

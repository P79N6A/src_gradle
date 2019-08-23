package com.bytedance.android.livesdk.effect.adpater;

import android.view.View;
import com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter;
import com.bytedance.android.livesdk.effect.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13726a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveFilterAdapter f13727b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13728c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveFilterAdapter.ViewHolder f13729d;

    a(LiveFilterAdapter liveFilterAdapter, int i, LiveFilterAdapter.ViewHolder viewHolder) {
        this.f13727b = liveFilterAdapter;
        this.f13728c = i;
        this.f13729d = viewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13726a, false, 8234, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13726a, false, 8234, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveFilterAdapter liveFilterAdapter = this.f13727b;
        int i = this.f13728c;
        LiveFilterAdapter.ViewHolder viewHolder = this.f13729d;
        if (liveFilterAdapter.f13716d != null) {
            liveFilterAdapter.f13715c = i;
            if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, liveFilterAdapter, LiveFilterAdapter.f13713a, false, 8231, new Class[]{LiveFilterAdapter.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {viewHolder, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = LiveFilterAdapter.f13713a;
                LiveFilterAdapter liveFilterAdapter2 = liveFilterAdapter;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr, liveFilterAdapter2, changeQuickRedirect2, false, 8231, new Class[]{LiveFilterAdapter.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            } else if (!(liveFilterAdapter.f13714b == null || liveFilterAdapter.f13714b.size() <= i || liveFilterAdapter.f13714b.get(i).getEffect() == null)) {
                if (viewHolder != null) {
                    viewHolder.a();
                }
                liveFilterAdapter.f13714b.get(i).setNew(false);
                j.a().a(liveFilterAdapter.f13714b.get(i).getEffect().id, false);
            }
            liveFilterAdapter.f13716d.a(i);
            liveFilterAdapter.notifyDataSetChanged();
        }
    }
}

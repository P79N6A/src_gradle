package com.bytedance.android.livesdk.live;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.ArrayMap;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.widget.LiveFragmentStatePagerAdapter;
import com.bytedance.android.livesdkapi.depend.d.i;
import com.bytedance.android.livesdkapi.g.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class LiveDetailPagerAdapter extends LiveFragmentStatePagerAdapter {
    public static ChangeQuickRedirect g;

    /* renamed from: a  reason: collision with root package name */
    private final e f15776a;

    /* renamed from: b  reason: collision with root package name */
    private final e.a f15777b = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private final Map<Long, i> f15778c = new ArrayMap();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 10246, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 10246, new Class[0], Void.TYPE);
            return;
        }
        this.f15776a.b(this.f15777b);
    }

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 10249, new Class[0], Integer.TYPE)) {
            return this.f15776a.b();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, g, false, 10249, new Class[0], Integer.TYPE)).intValue();
    }

    private static long a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, g, true, 10254, new Class[]{Bundle.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{bundle2}, null, g, true, 10254, new Class[]{Bundle.class}, Long.TYPE)).longValue();
        }
        long j = bundle2.getLong("live.intent.extra.item_id_for_view_pager", -1);
        if (j > 0) {
            return j;
        }
        long j2 = bundle2.getLong("live.intent.extra.USER_ID", -1);
        if (j2 <= 0) {
            j2 = bundle2.getLong("live.intent.extra.ROOM_ID", -1);
        }
        bundle2.putLong("live.intent.extra.item_id_for_view_pager", j2);
        return j2;
    }

    @Nullable
    public final i b(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 10252, new Class[]{Integer.TYPE}, i.class)) {
            return this.f15778c.get(Long.valueOf(c(i)));
        }
        return (i) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 10252, new Class[]{Integer.TYPE}, i.class);
    }

    public final long c(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 10253, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return a(this.f15776a.a(i));
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 10253, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
    }

    public int getItemPosition(@NonNull Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, g, false, 10247, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, g, false, 10247, new Class[]{Object.class}, Integer.TYPE)).intValue();
        }
        int a2 = this.f15776a.a(((Fragment) obj).getArguments());
        if (a2 < 0) {
            return -2;
        }
        return a2;
    }

    public final Fragment a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 10248, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 10248, new Class[]{Integer.TYPE}, Fragment.class);
        }
        LivePlayFragment livePlayFragment = new LivePlayFragment();
        livePlayFragment.g().setArguments(this.f15776a.a(i));
        return livePlayFragment.g();
    }

    public LiveDetailPagerAdapter(FragmentManager fragmentManager, e eVar) {
        super(fragmentManager);
        this.f15776a = eVar;
        this.f15776a.a(this.f15777b);
    }

    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, g, false, 10250, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, g, false, 10250, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        i iVar = (i) super.instantiateItem(viewGroup, i);
        this.f15778c.put(Long.valueOf(c(i)), iVar);
        return iVar;
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj2}, this, g, false, 10251, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj2}, this, g, false, 10251, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (obj2 instanceof i) {
            i iVar = (i) obj2;
            iVar.c();
            this.f15778c.remove(Long.valueOf(a(iVar.g().getArguments())));
        }
        super.destroyItem(viewGroup, i, obj);
    }
}

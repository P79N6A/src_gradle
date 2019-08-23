package com.ss.android.ugc.aweme.miniapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp.constant.MicroConstants;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RecentlyMicroAppListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55453a;

    /* renamed from: b  reason: collision with root package name */
    public List<f> f55454b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<String> f55455c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private int f55456d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f55457e;

    interface a {
        void a(String str);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f55453a, false, 59166, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55453a, false, 59166, new Class[0], Integer.TYPE)).intValue();
        }
        int size = this.f55454b.size();
        if (this.f55456d == 0) {
            return size;
        }
        if (this.f55456d == 1) {
            return (this.f55457e ? 1 : 0) + size;
        }
        throw new IllegalArgumentException("invalid item type" + this.f55456d);
    }

    public RecentlyMicroAppListAdapter(@MicroConstants.MicroListItemType int i) {
        this.f55456d = i;
    }

    public final void a(List<f> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f55453a, false, 59167, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f55453a, false, 59167, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f55454b.clear();
        this.f55454b.addAll(list);
        notifyDataSetChanged();
    }

    public final void a(List<f> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55453a, false, 59168, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f55453a, false, 59168, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f55457e = z;
        this.f55454b.clear();
        this.f55454b.addAll(list);
        notifyDataSetChanged();
    }

    private void a(Context context, f fVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context, fVar}, this, f55453a, false, 59171, new Class[]{Context.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, fVar}, this, f55453a, false, 59171, new Class[]{Context.class, f.class}, Void.TYPE);
        } else if (context != null && fVar != null) {
            String appId = fVar.getAppId();
            if (!this.f55455c.contains(appId) || this.f55456d != 0) {
                this.f55455c.add(appId);
                ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).preloadMiniApp(appId, fVar.getType());
                d a2 = d.a().a("mp_id", fVar.getAppId()).a("author_id", com.ss.android.ugc.aweme.account.d.a().getCurUserId()).a("enter_from", "setting_page");
                if (fVar.getType() == 1) {
                    str = "micro_app";
                } else {
                    str = "micro_game";
                }
                r.a("mp_show", (Map) a2.a("_param_for_special", str).f34114b);
            }
        }
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f55453a, false, 59162, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f55453a, false, 59162, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (this.f55456d == 0) {
            return new RecentlyMicroAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.wj, viewGroup, false));
        } else {
            if (this.f55456d == 1) {
                return new MostUseMicroAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aae, viewGroup, false));
            }
            throw new IllegalArgumentException("invalid item type" + this.f55456d);
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f55453a, false, 59163, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f55453a, false, 59163, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f55456d == 0) {
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f55453a, false, 59165, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f55453a, false, 59165, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            } else {
                f fVar = this.f55454b.get(i2);
                if (viewHolder2 instanceof RecentlyMicroAppViewHolder) {
                    RecentlyMicroAppViewHolder recentlyMicroAppViewHolder = (RecentlyMicroAppViewHolder) viewHolder2;
                    c cVar = new c(this, i2, fVar);
                    if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i), cVar}, recentlyMicroAppViewHolder, RecentlyMicroAppViewHolder.f55458a, false, 59174, new Class[]{f.class, Integer.TYPE, a.class}, Void.TYPE)) {
                        RecentlyMicroAppViewHolder recentlyMicroAppViewHolder2 = recentlyMicroAppViewHolder;
                        PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i), cVar}, recentlyMicroAppViewHolder2, RecentlyMicroAppViewHolder.f55458a, false, 59174, new Class[]{f.class, Integer.TYPE, a.class}, Void.TYPE);
                    } else {
                        int i3 = 8;
                        if (fVar == null) {
                            recentlyMicroAppViewHolder.f55459b.setVisibility(8);
                        } else {
                            TextView textView = recentlyMicroAppViewHolder.f55459b;
                            if (i2 == 0) {
                                i3 = 0;
                            }
                            textView.setVisibility(i3);
                            recentlyMicroAppViewHolder.f55460c.setText(fVar.getName());
                            c.a(recentlyMicroAppViewHolder.f55461d, fVar.getIcon());
                            recentlyMicroAppViewHolder.itemView.setOnClickListener(new d(fVar, cVar));
                        }
                    }
                }
                a(viewHolder2.itemView.getContext(), fVar);
            }
        } else if (this.f55456d == 1) {
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f55453a, false, 59164, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f55453a, false, 59164, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            } else if (viewHolder2 instanceof MostUseMicroAppViewHolder) {
                if (i2 <= this.f55454b.size() - 1) {
                    f fVar2 = this.f55454b.get(i2);
                    MostUseMicroAppViewHolder mostUseMicroAppViewHolder = (MostUseMicroAppViewHolder) viewHolder2;
                    if (PatchProxy.isSupport(new Object[]{fVar2}, mostUseMicroAppViewHolder, MostUseMicroAppViewHolder.f55449a, false, 59156, new Class[]{f.class}, Void.TYPE)) {
                        MostUseMicroAppViewHolder mostUseMicroAppViewHolder2 = mostUseMicroAppViewHolder;
                        PatchProxy.accessDispatch(new Object[]{fVar2}, mostUseMicroAppViewHolder2, MostUseMicroAppViewHolder.f55449a, false, 59156, new Class[]{f.class}, Void.TYPE);
                    } else {
                        mostUseMicroAppViewHolder.f55450b.setText(fVar2.getName());
                        c.a(mostUseMicroAppViewHolder.f55451c, fVar2.getIcon());
                        mostUseMicroAppViewHolder.itemView.setOnClickListener(new a(mostUseMicroAppViewHolder, fVar2));
                    }
                    a(viewHolder2.itemView.getContext(), fVar2);
                } else if (this.f55457e) {
                    MostUseMicroAppViewHolder mostUseMicroAppViewHolder3 = (MostUseMicroAppViewHolder) viewHolder2;
                    if (PatchProxy.isSupport(new Object[0], mostUseMicroAppViewHolder3, MostUseMicroAppViewHolder.f55449a, false, 59158, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], mostUseMicroAppViewHolder3, MostUseMicroAppViewHolder.f55449a, false, 59158, new Class[0], Void.TYPE);
                        return;
                    }
                    mostUseMicroAppViewHolder3.f55450b.setText(mostUseMicroAppViewHolder3.f55452d.getString(C0906R.string.bcc));
                    c.a(mostUseMicroAppViewHolder3.f55451c, 2130839157);
                    mostUseMicroAppViewHolder3.itemView.setOnClickListener(new b(mostUseMicroAppViewHolder3));
                }
            }
        }
    }
}

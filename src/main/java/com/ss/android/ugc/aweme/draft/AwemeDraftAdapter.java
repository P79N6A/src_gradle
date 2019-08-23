package com.ss.android.ugc.aweme.draft;

import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.AwemeDraftViewHolder;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import java.util.List;
import java.util.Map;

public class AwemeDraftAdapter extends BaseAdapter<c> implements AwemeDraftViewHolder.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43351a;

    /* renamed from: b  reason: collision with root package name */
    boolean f43352b;

    /* renamed from: c  reason: collision with root package name */
    public a f43353c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f43354d;

    /* renamed from: e  reason: collision with root package name */
    private Map<ImageView, CloseableReference<CloseableImage>> f43355e;

    protected class AwemeDraftFooterViewHolder extends RecyclerView.ViewHolder {
        public AwemeDraftFooterViewHolder(View view) {
            super(view);
        }
    }

    public interface a {
        void a();
    }

    public List<c> getData() {
        return this.mItems;
    }

    public AwemeDraftAdapter(Map<ImageView, CloseableReference<CloseableImage>> map) {
        this.f43355e = map;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43351a, false, 38336, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43351a, false, 38336, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f43354d = z;
        notifyDataSetChanged();
    }

    public final void b(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f43351a, false, 38345, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f43351a, false, 38345, new Class[]{c.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.port.in.a.F.a(cVar.f());
        l.a().d(cVar2);
        cVar.j();
    }

    public int getBasicItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43351a, false, 38340, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((c) this.mItems.get(i)).v;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43351a, false, 38340, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    private boolean a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43351a, false, 38346, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43351a, false, 38346, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (((c) this.mItems.get(i)).f43438f == null || i == 0 || ((c) this.mItems.get(i - 1)).v != 1) {
            return false;
        } else {
            if (i == this.mItems.size() - 1) {
                return true;
            }
            int i2 = i + 1;
            if (((c) this.mItems.get(i2)).v == 1 || ((c) this.mItems.get(i2)).f43438f == null) {
                return true;
            }
            return false;
        }
    }

    public final void a(c cVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f43351a, false, 38343, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f43351a, false, 38343, new Class[]{c.class}, Void.TYPE);
            return;
        }
        int indexOf = this.mItems.indexOf(cVar);
        if (indexOf != -1) {
            int i = 2;
            if (a(indexOf)) {
                this.mItems.remove(indexOf);
                int i2 = indexOf - 1;
                this.mItems.remove(i2);
                if (this.mItems.size() != this.f43352b || this.f43353c == null) {
                    notifyItemRangeRemoved(i2, 2);
                } else {
                    this.f43353c.a();
                }
            } else {
                int size = this.mItems.size();
                if (!this.f43352b) {
                    i = 1;
                }
                if (size != i) {
                    z = false;
                }
                this.mItems.remove(indexOf);
                if (!z || this.f43353c == null) {
                    notifyItemRemoved(indexOf);
                } else {
                    this.f43353c.a();
                }
            }
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f43351a, false, 38338, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f43351a, false, 38338, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (viewHolder instanceof AwemeDraftViewHolder) {
            AwemeDraftViewHolder awemeDraftViewHolder = (AwemeDraftViewHolder) viewHolder;
            awemeDraftViewHolder.r = this.f43354d;
            awemeDraftViewHolder.a((c) this.mItems.get(i), i);
        } else {
            if (viewHolder instanceof AwemeDraftMusicHolder) {
                AwemeDraftMusicHolder awemeDraftMusicHolder = (AwemeDraftMusicHolder) viewHolder;
                awemeDraftMusicHolder.f43366d = this.f43354d;
                awemeDraftMusicHolder.a((c) this.mItems.get(i), i);
            }
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f43351a, false, 38339, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f43351a, false, 38339, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 1) {
            return new AwemeDraftMusicHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.to, viewGroup, false));
        } else {
            if (i == 2) {
                return new AwemeDraftFooterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tn, viewGroup, false));
            }
            return new AwemeDraftViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tm, viewGroup, false), this.f43355e, this);
        }
    }

    public final void a(View view, c cVar) {
        final c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{view, cVar2}, this, f43351a, false, 38341, new Class[]{View.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, cVar2}, this, f43351a, false, 38341, new Class[]{View.class, c.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{view, cVar2}, this, f43351a, false, 38349, new Class[]{View.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, cVar2}, this, f43351a, false, 38349, new Class[]{View.class, c.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(view.getContext());
        aVar.a((CharSequence[]) new String[]{view.getContext().getResources().getString(C0906R.string.ic)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43359a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43359a, false, 38352, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43359a, false, 38352, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                AwemeDraftAdapter.this.b(cVar2);
                AwemeDraftAdapter.this.a(cVar2);
                ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().notifyDraftDelete(cVar2);
                r.onEvent(MobClick.obtain().setEventName("click_delete").setLabelName("draft_page"));
                r.a("delete_drafts", (Map) d.a().a("draft_cnt", 1).f34114b);
                dialogInterface.dismiss();
            }
        });
        aVar.b();
    }
}

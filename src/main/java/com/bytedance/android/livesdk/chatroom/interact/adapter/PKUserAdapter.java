package com.bytedance.android.livesdk.chatroom.interact.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKTitleViewHolder;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKUserViewHolder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class PKUserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10322a;

    /* renamed from: b  reason: collision with root package name */
    public List<Room> f10323b;

    /* renamed from: c  reason: collision with root package name */
    public List<Room> f10324c;

    /* renamed from: d  reason: collision with root package name */
    public int f10325d;

    /* renamed from: e  reason: collision with root package name */
    public int f10326e;

    /* renamed from: f  reason: collision with root package name */
    private Context f10327f;
    private a g;

    public interface a {
        void a(Room room, int i);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f10322a, false, 4478, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f10322a, false, 4478, new Class[0], Integer.TYPE)).intValue();
        } else if (Lists.isEmpty(this.f10323b) && Lists.isEmpty(this.f10324c)) {
            return 0;
        } else {
            if (this.f10326e == 0) {
                return this.f10325d;
            }
            if (this.f10325d == 0) {
                return this.f10326e + 1;
            }
            return this.f10326e + this.f10325d + 2;
        }
    }

    public int getItemViewType(int i) {
        if (this.f10326e == 0) {
            return 4;
        }
        if (i == 0) {
            return 1;
        }
        if (i <= this.f10326e) {
            return 2;
        }
        if (i == this.f10326e + 1) {
            return 3;
        }
        return 4;
    }

    private int a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f10322a, false, 4480, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f10322a, false, 4480, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (Lists.isEmpty(this.f10323b) && Lists.isEmpty(this.f10324c)) {
            return 0;
        } else {
            if (this.f10326e == 0) {
                return i;
            }
            if (this.f10325d == 0) {
                return i - 1;
            }
            if (i <= this.f10326e) {
                return i - 1;
            }
            return (i - this.f10326e) - 2;
        }
    }

    public PKUserAdapter(Context context, a aVar) {
        this.f10327f = context;
        this.g = aVar;
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f10322a, false, 4476, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f10322a, false, 4476, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 3 || i == 1) {
            return new PKTitleViewHolder(LayoutInflater.from(this.f10327f).inflate(C0906R.layout.ajh, viewGroup, false), i);
        } else {
            return new PKUserViewHolder(LayoutInflater.from(this.f10327f).inflate(C0906R.layout.aji, viewGroup, false), this.g, i);
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f10322a, false, 4477, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f10322a, false, 4477, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getItemViewType(i) == 4) {
            PKUserViewHolder pKUserViewHolder = (PKUserViewHolder) viewHolder;
            Room room = this.f10323b.get(a(i));
            if (i < getItemCount() - 1) {
                z = true;
            }
            pKUserViewHolder.a(pKUserViewHolder, i, room, z);
        } else if (getItemViewType(i) == 2) {
            PKUserViewHolder pKUserViewHolder2 = (PKUserViewHolder) viewHolder;
            Room room2 = this.f10324c.get(a(i));
            if (i < this.f10326e) {
                z = true;
            }
            pKUserViewHolder2.a(pKUserViewHolder2, i, room2, z);
        } else if (getItemViewType(i) == 3) {
            ((PKTitleViewHolder) viewHolder).a(this.f10327f.getString(C0906R.string.d5p));
        } else {
            if (getItemViewType(i) == 1) {
                ((PKTitleViewHolder) viewHolder).a(this.f10327f.getString(C0906R.string.d71));
            }
        }
    }
}

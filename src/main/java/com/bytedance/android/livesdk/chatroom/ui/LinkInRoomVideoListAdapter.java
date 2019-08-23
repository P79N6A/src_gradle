package com.bytedance.android.livesdk.chatroom.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.fresco.h;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.utils.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class LinkInRoomVideoListAdapter extends RecyclerView.Adapter<ListPlayerViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11545a;

    /* renamed from: b  reason: collision with root package name */
    public a f11546b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f11547c = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11551a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11552c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11551a, true, 5928, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11551a, true, 5928, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomVideoListAdapter.java", AnonymousClass1.class);
            f11552c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LinkInRoomVideoListAdapter$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 73);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11551a, false, 5927, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11551a, false, 5927, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f11552c, this, this, view));
            if (LinkInRoomVideoListAdapter.this.f11546b != null && view.getTag() != null) {
                LinkInRoomVideoListAdapter.this.f11546b.c(((Long) view.getTag()).longValue());
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f11548d = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11554a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11555c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11554a, true, 5930, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11554a, true, 5930, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomVideoListAdapter.java", AnonymousClass2.class);
            f11555c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LinkInRoomVideoListAdapter$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 84);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11554a, false, 5929, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11554a, false, 5929, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f11555c, this, this, view));
            if (LinkInRoomVideoListAdapter.this.f11546b != null && view.getTag() != null) {
                LinkInRoomVideoListAdapter.this.f11546b.d(((Long) view.getTag()).longValue());
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f11549e = cg.f12008b;

    /* renamed from: f  reason: collision with root package name */
    private List<j> f11550f;
    private int g;

    static class AnchorViewHolder extends ListPlayerViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f11557a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f11558b;

        /* renamed from: c  reason: collision with root package name */
        View f11559c;

        AnchorViewHolder(View view) {
            super(view);
            this.f11557a = view.findViewById(C0906R.id.y4);
            this.f11558b = (ImageView) view.findViewById(C0906R.id.hb);
            this.f11559c = view.findViewById(C0906R.id.a5d);
        }
    }

    static class ListPlayerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: d  reason: collision with root package name */
        AvatarIconView f11560d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f11561e;

        /* renamed from: f  reason: collision with root package name */
        TextView f11562f;
        TextView g;

        ListPlayerViewHolder(View view) {
            super(view);
            this.f11560d = (AvatarIconView) view.findViewById(C0906R.id.i7);
            this.f11561e = (ImageView) view.findViewById(C0906R.id.aog);
            this.f11562f = (TextView) view.findViewById(C0906R.id.bpn);
            this.g = (TextView) view.findViewById(C0906R.id.a3u);
        }
    }

    public interface a {
        void c(long j);

        void d(long j);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f11545a, false, 5925, new Class[0], Integer.TYPE)) {
            return this.f11550f.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11545a, false, 5925, new Class[0], Integer.TYPE)).intValue();
    }

    public final int a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f11545a, false, 5921, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11545a, false, 5921, new Class[0], Integer.TYPE)).intValue();
        }
        for (j jVar : this.f11550f) {
            if (2 == jVar.g) {
                i++;
            }
        }
        return i;
    }

    public final int b() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f11545a, false, 5922, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11545a, false, 5922, new Class[0], Integer.TYPE)).intValue();
        }
        for (j jVar : this.f11550f) {
            if (1 == jVar.g) {
                i++;
            }
        }
        return i;
    }

    public int getItemViewType(int i) {
        return this.g;
    }

    public final void a(long j) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f11545a, false, 5919, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f11545a, false, 5919, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        int size = this.f11550f.size();
        while (true) {
            if (i >= size) {
                break;
            }
            j jVar = this.f11550f.get(i);
            if (jVar != null && jVar.f11052e != null && jVar.f11052e.getId() == j) {
                jVar.g = 2;
                jVar.f11053f = System.currentTimeMillis() / 1000;
                break;
            }
            i++;
        }
        notifyItemChanged(i);
    }

    public final void b(long j) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f11545a, false, 5920, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f11545a, false, 5920, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        int size = this.f11550f.size();
        if (size > 0) {
            int i2 = -1;
            while (true) {
                if (i >= size) {
                    break;
                }
                j jVar = this.f11550f.get(i);
                if (jVar != null && jVar.f11052e != null && jVar.f11052e.getId() == j) {
                    i2 = i;
                    break;
                }
                i++;
            }
            if (i2 >= 0 && i2 < size) {
                this.f11550f.remove(i2);
                notifyItemRemoved(i2);
            }
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f11545a, false, 5923, new Class[]{ViewGroup.class, Integer.TYPE}, ListPlayerViewHolder.class)) {
            return (ListPlayerViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f11545a, false, 5923, new Class[]{ViewGroup.class, Integer.TYPE}, ListPlayerViewHolder.class);
        } else if (i == 0) {
            return new AnchorViewHolder(View.inflate(viewGroup.getContext(), C0906R.layout.ajg, null));
        } else {
            return new ListPlayerViewHolder(View.inflate(viewGroup.getContext(), C0906R.layout.ajf, null));
        }
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        boolean z;
        int i2;
        int i3;
        ListPlayerViewHolder listPlayerViewHolder = (ListPlayerViewHolder) viewHolder;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{listPlayerViewHolder, Integer.valueOf(i)}, this, f11545a, false, 5924, new Class[]{ListPlayerViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{listPlayerViewHolder, Integer.valueOf(i)}, this, f11545a, false, 5924, new Class[]{ListPlayerViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        j jVar = this.f11550f.get(i);
        if (jVar != null && jVar.f11052e != null) {
            User user = jVar.f11052e;
            listPlayerViewHolder.f11560d.setAvatar(user.getAvatarMedium());
            if (user.getUserHonor() != null) {
                listPlayerViewHolder.f11560d.setIcon(user.getUserHonor().k());
            }
            h.a(listPlayerViewHolder.f11560d, String.valueOf(listPlayerViewHolder.f11560d.getId()), user);
            listPlayerViewHolder.f11560d.setOnClickListener(this.f11549e);
            listPlayerViewHolder.f11562f.setText(user.getNickName());
            if (jVar.j > 0) {
                str = ac.a((int) C0906R.string.d87, Integer.valueOf(jVar.j));
            } else {
                int a2 = ah.a((int) ((System.currentTimeMillis() / 1000) - jVar.f11053f));
                if (2 == jVar.g) {
                    i3 = C0906R.plurals.v;
                } else {
                    i3 = C0906R.plurals.w;
                }
                str = ac.a(i3, a2, Integer.valueOf(a2));
            }
            listPlayerViewHolder.g.setText(str);
            if (listPlayerViewHolder instanceof AnchorViewHolder) {
                AnchorViewHolder anchorViewHolder = (AnchorViewHolder) listPlayerViewHolder;
                int i4 = 8;
                if (com.bytedance.android.livesdkapi.a.a.f18614b && anchorViewHolder.f11558b != null) {
                    anchorViewHolder.f11558b.setVisibility(8);
                } else if (anchorViewHolder.f11558b != null && 2 == jVar.h) {
                    anchorViewHolder.f11558b.setImageResource(2130841205);
                } else if (anchorViewHolder.f11558b != null && 1 == jVar.h) {
                    anchorViewHolder.f11558b.setImageResource(2130841214);
                }
                if (1 == jVar.g) {
                    z = false;
                } else {
                    if (2 == jVar.g) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = false;
                }
                View view = anchorViewHolder.f11557a;
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
                View view2 = anchorViewHolder.f11559c;
                if (z) {
                    i4 = 0;
                }
                view2.setVisibility(i4);
                anchorViewHolder.f11557a.setTag(Long.valueOf(user.getId()));
                anchorViewHolder.f11557a.setOnClickListener(this.f11547c);
                anchorViewHolder.f11559c.setTag(Long.valueOf(user.getId()));
                anchorViewHolder.f11559c.setOnClickListener(this.f11548d);
            }
        }
    }

    public LinkInRoomVideoListAdapter(a aVar, List<j> list, int i) {
        this.f11546b = aVar;
        if (list != null) {
            this.f11550f = list;
            if (i == 0 || i == 1) {
                this.g = i;
                return;
            }
            throw new IllegalArgumentException("Type must be 1 for anchor or 2 for audience.");
        }
        throw new RuntimeException("List can not be null.");
    }
}

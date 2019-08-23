package com.bytedance.android.livesdk.chatroom.interact.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import java.util.Map;

public class LinkInRoomAudioGuestAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10287a;

    /* renamed from: b  reason: collision with root package name */
    public List<j> f10288b;

    /* renamed from: c  reason: collision with root package name */
    public List<j> f10289c;

    /* renamed from: d  reason: collision with root package name */
    public a f10290d;

    public class AudioGuestViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10291a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f10292b;

        /* renamed from: c  reason: collision with root package name */
        TextView f10293c;

        /* renamed from: d  reason: collision with root package name */
        TextView f10294d;

        /* renamed from: e  reason: collision with root package name */
        TextView f10295e;

        /* renamed from: f  reason: collision with root package name */
        View f10296f;
        View g;
        public LottieAnimationView h;
        public j i;

        AudioGuestViewHolder(View view) {
            super(view);
            this.f10292b = (ImageView) view.findViewById(C0906R.id.am3);
            this.f10293c = (TextView) view.findViewById(C0906R.id.am6);
            this.f10294d = (TextView) view.findViewById(C0906R.id.am4);
            this.f10295e = (TextView) view.findViewById(C0906R.id.am5);
            this.f10296f = view.findViewById(C0906R.id.am7);
            this.g = view.findViewById(C0906R.id.am8);
            this.h = (LottieAnimationView) view.findViewById(C0906R.id.c_4);
            this.h.setAnimation("audio_interact_effect.json");
            this.h.loop(true);
            view.setOnClickListener(new a(this));
        }
    }

    public class EmptyStubViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10297a;

        /* renamed from: b  reason: collision with root package name */
        TextView f10298b;

        /* renamed from: c  reason: collision with root package name */
        int f10299c;

        EmptyStubViewHolder(View view) {
            super(view);
            this.f10298b = (TextView) view.findViewById(C0906R.id.a9s);
            view.setOnClickListener(new b(this));
        }
    }

    public interface a {
        void a(int i, boolean z);

        void a(j jVar);

        void b(int i);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f10287a, false, 4453, new Class[0], Integer.TYPE)) {
            return this.f10288b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f10287a, false, 4453, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(Map<String, Boolean> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f10287a, false, 4455, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f10287a, false, 4455, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        for (int i = 0; i < this.f10288b.size(); i++) {
            j jVar = this.f10288b.get(i);
            Boolean bool = map.get(String.valueOf(jVar.f11051d));
            if (!(jVar.f11051d <= 0 || bool == null || bool.booleanValue() == jVar.o)) {
                jVar.o = bool.booleanValue();
                this.f10290d.a(i, jVar.o);
            }
        }
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f10287a, false, 4451, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f10287a, false, 4451, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f10288b.get(i).f11051d < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public LinkInRoomAudioGuestAdapter(List<j> list, a aVar) {
        this.f10288b = list;
        this.f10290d = aVar;
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f10287a, false, 4450, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f10287a, false, 4450, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 0) {
            return new EmptyStubViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ak2, viewGroup, false));
        } else {
            return new AudioGuestViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ak3, viewGroup, false));
        }
    }

    public final void a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f10287a, false, 4456, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f10287a, false, 4456, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        int i = -1;
        for (int i2 = 0; i2 < this.f10288b.size(); i2++) {
            j jVar = this.f10288b.get(i2);
            if (jVar.f11051d > 0 && jVar.f11052e.getId() == j3) {
                this.f10288b.get(i2).f11050c = j4;
                i = i2;
            }
        }
        if (i >= 0) {
            notifyItemChanged(i);
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f10287a, false, 4452, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f10287a, false, 4452, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof EmptyStubViewHolder) {
            EmptyStubViewHolder emptyStubViewHolder = (EmptyStubViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, emptyStubViewHolder, EmptyStubViewHolder.f10297a, false, 4460, new Class[]{Integer.TYPE}, Void.TYPE)) {
                EmptyStubViewHolder emptyStubViewHolder2 = emptyStubViewHolder;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, emptyStubViewHolder2, EmptyStubViewHolder.f10297a, false, 4460, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                emptyStubViewHolder.f10299c = i2;
                emptyStubViewHolder.f10298b.setText(String.valueOf(emptyStubViewHolder.f10299c + 1));
                return;
            }
        } else if (viewHolder2 instanceof AudioGuestViewHolder) {
            AudioGuestViewHolder audioGuestViewHolder = (AudioGuestViewHolder) viewHolder2;
            j jVar = this.f10288b.get(i2);
            if (PatchProxy.isSupport(new Object[]{jVar, Integer.valueOf(i)}, audioGuestViewHolder, AudioGuestViewHolder.f10291a, false, 4457, new Class[]{j.class, Integer.TYPE}, Void.TYPE)) {
                AudioGuestViewHolder audioGuestViewHolder2 = audioGuestViewHolder;
                PatchProxy.accessDispatch(new Object[]{jVar, Integer.valueOf(i)}, audioGuestViewHolder2, AudioGuestViewHolder.f10291a, false, 4457, new Class[]{j.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            audioGuestViewHolder.i = jVar;
            b.b(audioGuestViewHolder.f10292b, jVar.f11052e.getAvatarMedium());
            audioGuestViewHolder.f10293c.setText(String.valueOf(i2 + 1));
            if (jVar.f11052e.getGender() == 1) {
                audioGuestViewHolder.f10293c.setBackgroundResource(2130840903);
            } else if (jVar.f11052e.getGender() == 2) {
                audioGuestViewHolder.f10293c.setBackgroundResource(2130840902);
            } else {
                audioGuestViewHolder.f10293c.setBackgroundResource(2130840904);
            }
            audioGuestViewHolder.f10294d.setText(e.c(jVar.f11050c));
            audioGuestViewHolder.f10295e.setText(jVar.f11052e.getNickName());
            if (jVar.m != 0) {
                audioGuestViewHolder.f10296f.setVisibility(0);
                audioGuestViewHolder.g.setVisibility(0);
                audioGuestViewHolder.h.setVisibility(4);
                if (audioGuestViewHolder.h.isAnimating()) {
                    audioGuestViewHolder.h.cancelAnimation();
                    return;
                }
            } else {
                audioGuestViewHolder.f10296f.setVisibility(8);
                audioGuestViewHolder.g.setVisibility(8);
            }
        }
    }
}

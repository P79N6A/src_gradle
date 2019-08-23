package com.bytedance.android.livesdk.chatroom.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.model.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class LuckyBoxSendAdapter extends RecyclerView.Adapter<RedEnvelopeViewHolder> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11696a;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f11697f;

    /* renamed from: b  reason: collision with root package name */
    List<x> f11698b;

    /* renamed from: c  reason: collision with root package name */
    a f11699c;

    /* renamed from: d  reason: collision with root package name */
    int f11700d;

    /* renamed from: e  reason: collision with root package name */
    private LayoutInflater f11701e;

    static class RedEnvelopeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public View f11702a;

        /* renamed from: b  reason: collision with root package name */
        public HSImageView f11703b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f11704c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f11705d;

        /* renamed from: e  reason: collision with root package name */
        public View f11706e;

        /* renamed from: f  reason: collision with root package name */
        public View f11707f;

        RedEnvelopeViewHolder(View view) {
            super(view);
            this.f11702a = view;
            this.f11703b = (HSImageView) view.findViewById(C0906R.id.ar6);
            this.f11704c = (TextView) view.findViewById(C0906R.id.title);
            this.f11705d = (TextView) view.findViewById(C0906R.id.a3u);
            this.f11706e = view.findViewById(C0906R.id.kq);
            this.f11707f = view.findViewById(C0906R.id.kg);
        }
    }

    interface a {
        void a(x xVar);
    }

    public int getItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f11696a, false, 6253, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11696a, false, 6253, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f11698b != null) {
            i = this.f11698b.size();
        }
        return i;
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11696a, true, 6254, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11696a, true, 6254, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("LuckyBoxSendAdapter.java", LuckyBoxSendAdapter.class);
        f11697f = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LuckyBoxSendAdapter", "android.view.View", NotifyType.VIBRATE, "", "void"), 63);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11696a, false, 6249, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11696a, false, 6249, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f11697f, this, this, view));
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != this.f11700d) {
            int i = this.f11700d;
            this.f11700d = intValue;
            notifyItemChanged(i);
            notifyItemChanged(this.f11700d);
            this.f11699c.a(this.f11698b.get(this.f11700d));
        }
    }

    LuckyBoxSendAdapter(@NonNull LayoutInflater layoutInflater, @NonNull a aVar) {
        this.f11701e = layoutInflater;
        this.f11699c = aVar;
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11696a, false, 6251, new Class[]{ViewGroup.class, Integer.TYPE}, RedEnvelopeViewHolder.class)) {
            return new RedEnvelopeViewHolder(this.f11701e.inflate(C0906R.layout.ane, viewGroup2, false));
        }
        return (RedEnvelopeViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11696a, false, 6251, new Class[]{ViewGroup.class, Integer.TYPE}, RedEnvelopeViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        RedEnvelopeViewHolder redEnvelopeViewHolder = (RedEnvelopeViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{redEnvelopeViewHolder, Integer.valueOf(i)}, this, f11696a, false, 6252, new Class[]{RedEnvelopeViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{redEnvelopeViewHolder, Integer.valueOf(i)}, this, f11696a, false, 6252, new Class[]{RedEnvelopeViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        x xVar = this.f11698b.get(i);
        redEnvelopeViewHolder.f11702a.setTag(Integer.valueOf(i));
        redEnvelopeViewHolder.f11702a.setOnClickListener(this);
        com.bytedance.android.livesdk.chatroom.f.b.a(redEnvelopeViewHolder.f11703b, xVar.f11184d);
        redEnvelopeViewHolder.f11704c.setText(ac.a((int) C0906R.string.did, Integer.valueOf(xVar.f11183c)));
        redEnvelopeViewHolder.f11705d.setText(xVar.f11182b);
        View view = redEnvelopeViewHolder.f11706e;
        int i3 = 8;
        if (this.f11700d == i) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        View view2 = redEnvelopeViewHolder.f11707f;
        if (this.f11700d == i) {
            i3 = 0;
        }
        view2.setVisibility(i3);
    }
}

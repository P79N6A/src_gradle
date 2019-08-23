package com.ss.android.ugc.aweme.face2face.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.widget.recyclerview.b;
import com.ss.android.ugc.aweme.face2face.net.f;
import com.ss.android.ugc.aweme.face2face.ui.viewholder.Face2FaceUserViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class Face2FaceFriendsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44032a;

    /* renamed from: b  reason: collision with root package name */
    public f f44033b = new f();

    /* renamed from: c  reason: collision with root package name */
    public f f44034c = new f();

    /* renamed from: d  reason: collision with root package name */
    public List<f> f44035d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public a f44036e;

    /* renamed from: f  reason: collision with root package name */
    private int f44037f;

    public interface a {
        void a(View view, f fVar, int i);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f44032a, false, 39238, new Class[0], Integer.TYPE)) {
            return this.f44035d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44032a, false, 39238, new Class[0], Integer.TYPE)).intValue();
    }

    public Face2FaceFriendsAdapter(int i) {
        this.f44037f = i;
        if (PatchProxy.isSupport(new Object[0], this, f44032a, false, 39233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44032a, false, 39233, new Class[0], Void.TYPE);
            return;
        }
        User user = new User();
        user.setNickname("header");
        this.f44033b.setUser(user);
        User user2 = new User();
        user.setNickname("footer");
        this.f44034c.setUser(user2);
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44032a, false, 39237, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44032a, false, 39237, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f44035d.get(i) == this.f44033b) {
            return 65281;
        } else {
            if (this.f44035d.get(i) == this.f44034c) {
                return 65284;
            }
            if (this.f44037f == 65281) {
                return 65282;
            }
            return super.getItemViewType(i);
        }
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f44032a, false, 39240, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f44032a, false, 39240, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        viewHolder2.itemView.clearAnimation();
        b.a(viewHolder2.itemView);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44032a, false, 39235, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44032a, false, 39235, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (getItemViewType(i)) {
            case 65281:
                return;
            case 65282:
                ((Face2FaceUserViewHolder) viewHolder).a(this.f44035d.get(i), i);
                break;
            case 65284:
                return;
        }
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44032a, false, 39234, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44032a, false, 39234, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i) {
            case 65281:
                return new RecyclerView.ViewHolder(new View(viewGroup.getContext())) {
                };
            case 65282:
                return new Face2FaceUserViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tz, viewGroup2, false), this.f44036e);
            case 65284:
                Context context = viewGroup.getContext();
                if (PatchProxy.isSupport(new Object[]{context, 12}, null, ar.f71118a, true, 81080, new Class[]{Context.class, Integer.TYPE}, View.class)) {
                    view = (View) PatchProxy.accessDispatch(new Object[]{context, 12}, null, ar.f71118a, true, 81080, new Class[]{Context.class, Integer.TYPE}, View.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(context, "context");
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) UIUtils.dip2Px(context, 12.0f));
                    View view2 = new View(context);
                    view2.setLayoutParams(layoutParams);
                    view2.setBackgroundColor(0);
                    view = view2;
                }
                return new RecyclerView.ViewHolder(view) {
                };
            default:
                return new Face2FaceUserViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tz, viewGroup2, false), this.f44036e);
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull List<Object> list) {
        int i2 = i;
        List<Object> list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i), list2}, this, f44032a, false, 39236, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), list2}, this, f44032a, false, 39236, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
        } else if (CollectionUtils.isEmpty(list)) {
            onBindViewHolder(viewHolder, i);
        } else {
            if (getItemViewType(i2) == 65282) {
                ((Face2FaceUserViewHolder) viewHolder).a(this.f44035d.get(i2), (Bundle) list2.get(0));
            }
        }
    }
}

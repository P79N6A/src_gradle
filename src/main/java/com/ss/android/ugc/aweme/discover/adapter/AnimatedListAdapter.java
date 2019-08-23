package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.log.u;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.presenter.j;
import com.ss.android.ugc.aweme.utils.ex;

public class AnimatedListAdapter extends AnimatedAdapter implements d {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f41525f;
    public a g;
    @Nullable
    public Category i;
    public int j;
    public String k;
    public boolean l = true;

    static class CoverMoreViewHolder extends RecyclerView.ViewHolder {
        CoverMoreViewHolder(View view, final a aVar) {
            super(view);
            view.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41526a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f41526a, false, 35488, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f41526a, false, 35488, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            });
        }
    }

    public interface a {
        void a();
    }

    public void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
    }

    private String a() {
        if (PatchProxy.isSupport(new Object[0], this, f41525f, false, 35487, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f41525f, false, 35487, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!CollectionUtils.isEmpty(this.mItems)) {
            for (int i2 = 0; i2 < this.mItems.size(); i2++) {
                Aweme aweme = (Aweme) this.mItems.get(i2);
                if (aweme != null) {
                    if (i2 < this.mItems.size() - 1) {
                        sb.append(aweme.getAid());
                        sb.append(",");
                    } else {
                        sb.append(aweme.getAid());
                    }
                }
            }
        }
        return sb.toString();
    }

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f41525f, false, 35485, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f41525f, false, 35485, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        } else if (!ex.b()) {
            return new CoverMoreViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tc, viewGroup2, false), this.g);
        } else {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams((int) UIUtils.dip2Px(viewGroup.getContext(), 14.0f), -1));
            return new CoverMoreViewHolder(view, null);
        }
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f41525f, false, 35484, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new CoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.s9, viewGroup2, false), this);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f41525f, false, 35484, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f41525f, false, 35483, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f41525f, false, 35483, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        CoverViewHolder coverViewHolder = (CoverViewHolder) viewHolder;
        coverViewHolder.a((Aweme) this.mItems.get(i2), i2);
        coverViewHolder.c(this.l);
    }

    public final void a(View view, Aweme aweme, String str) {
        com.ss.android.ugc.aweme.common.f.a aVar;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{view, aweme, str}, this, f41525f, false, 35486, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aweme, str}, this, f41525f, false, 35486, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
        } else if (aweme != null) {
            if (this.j == 2) {
                if (ex.b()) {
                    str3 = "from_challenge_children_mode";
                } else {
                    str3 = "from_discovery_challenge";
                }
                str2 = "challenge_id";
                aVar = new com.ss.android.ugc.aweme.challenge.c.a();
                if (this.i != null && this.i.isAd()) {
                    Context context = view.getContext();
                    Category category = this.i;
                    String aid = aweme.getAid();
                    if (PatchProxy.isSupport(new Object[]{context, category, aid}, null, g.f39316a, true, 31737, new Class[]{Context.class, Category.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context, category, aid}, null, g.f39316a, true, 31737, new Class[]{Context.class, Category.class, String.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.commercialize.log.d.a().b("auto_full_screen").a("discovery_ad").d("video").a(Long.valueOf(category.getCreativeId())).g(category.getLogExtra()).e(aid).a(context);
                        g.a((g.a) new u(category), category.getClickTrackUrlList(), true);
                    }
                }
                i2 = 2;
            } else {
                if (ex.b()) {
                    str5 = "from_music_children_mode";
                } else {
                    str5 = "from_music";
                }
                str2 = "music_id";
                aVar = new j();
            }
            com.ss.android.ugc.aweme.feed.a.a().f44610c = aVar;
            com.ss.android.ugc.aweme.ag.j a2 = com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", "discovery").a("video_from", str3).a("video_type", i2).a("profile_enterprise_type", aweme.getEnterpriseType()).a(str2, this.k);
            if (ex.b()) {
                a2.a("ids", a());
            }
            h.a().a(a2.a());
            if (TextUtils.equals(str3, "from_discovery_challenge")) {
                str4 = "challenge";
            } else {
                str4 = "music";
            }
            r.onEvent(MobClick.obtain().setEventName("cell_click").setLabelName("video_click").setValue(aweme.getAid()).setJsonObject(new c().a("cell_type", str4).b()));
        }
    }
}

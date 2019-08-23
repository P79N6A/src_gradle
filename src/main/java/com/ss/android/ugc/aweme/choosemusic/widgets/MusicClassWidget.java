package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.d.u;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder;
import com.ss.android.ugc.aweme.music.adapter.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

public class MusicClassWidget extends ListItemWidget<MusicClassViewHolder> implements Observer<a> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f36173b;
    public int k;
    public int l;
    public int m;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f36173b, false, 27002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36173b, false, 27002, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("list", (Observer<a>) this);
        this.m = ((Integer) this.g.a("key_choose_music_type")).intValue();
    }

    private void a(List<Object> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f36173b, false, 27005, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f36173b, false, 27005, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && list.size() > 0) {
            ((MusicClassViewHolder) this.f34346a).a(((u) list.get(this.k)).f35864a, this.m);
            ((MusicClassViewHolder) this.f34346a).f36086d = new d() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36174a;

                public final void a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
                    if (PatchProxy.isSupport(new Object[]{viewHolder, view, musicModel}, this, f36174a, false, 27008, new Class[]{RecyclerView.ViewHolder.class, View.class, MusicModel.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{viewHolder, view, musicModel}, this, f36174a, false, 27008, new Class[]{RecyclerView.ViewHolder.class, View.class, MusicModel.class}, Void.TYPE);
                        return;
                    }
                    if (view.getId() == C0906R.id.dkt) {
                        Intent intent = new Intent(MusicClassWidget.this.f2709d, MusicDetailListActivity.class);
                        intent.putExtra("music_type", 4);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", MusicClassWidget.this.m);
                        MusicClassWidget.this.a(intent, MusicClassWidget.this.l);
                    }
                }
            };
            ((MusicClassViewHolder) this.f34346a).f36087e = new f(this);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f36173b, false, 27004, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f36173b, false, 27004, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f34346a != null) {
            String str = aVar.f34376a;
            char c2 = 65535;
            if (str.hashCode() == 3322014 && str.equals("list")) {
                c2 = 0;
            }
            if (c2 == 0) {
                a((List) aVar.a());
            }
        }
    }

    public final void a(ItemWidgetViewHolder itemWidgetViewHolder) {
        if (PatchProxy.isSupport(new Object[]{itemWidgetViewHolder}, this, f36173b, false, 27003, new Class[]{ItemWidgetViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{itemWidgetViewHolder}, this, f36173b, false, 27003, new Class[]{ItemWidgetViewHolder.class}, Void.TYPE);
            return;
        }
        super.a(itemWidgetViewHolder);
        a((List) this.g.a("list"));
    }

    public final void a(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f36173b, false, 27006, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f36173b, false, 27006, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i2 == -1) {
            if (i == this.l) {
                c().setResult(-1, intent2);
                c().finish();
            }
        }
    }
}

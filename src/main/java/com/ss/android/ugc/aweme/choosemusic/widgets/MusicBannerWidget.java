package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.choosemusic.view.BannerView;
import com.ss.android.ugc.aweme.discover.model.Banner;
import java.util.List;

public class MusicBannerWidget extends Widget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36168a;

    /* renamed from: b  reason: collision with root package name */
    BannerView f36169b;
    private int k;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f36168a, false, 26983, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36168a, false, 26983, new Class[0], Void.TYPE);
            return;
        }
        this.g.a("data_banner", (Observer<a>) this);
        this.k = ((Integer) this.g.a("key_choose_music_type")).intValue();
        super.onCreate();
    }

    private void a(List<Banner> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f36168a, false, 26985, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f36168a, false, 26985, new Class[]{List.class}, Void.TYPE);
        } else if (list == null || list.size() <= 0) {
            this.f2711f.setVisibility(8);
        } else {
            this.f2711f.setVisibility(0);
            this.f36169b.a(list, true);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f36168a, false, 26986, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f36168a, false, 26986, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!(this.f36169b == null || aVar == null)) {
            a((List) aVar.a());
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36168a, false, 26984, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36168a, false, 26984, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.f36169b = new BannerView(view, this.k);
        a((List) this.g.a("data_banner"));
    }
}

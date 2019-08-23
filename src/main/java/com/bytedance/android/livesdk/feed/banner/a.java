package com.bytedance.android.livesdk.feed.banner;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.live.c;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.livesdkapi.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14032a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f14033b;

    /* renamed from: c  reason: collision with root package name */
    TextView f14034c;

    /* renamed from: d  reason: collision with root package name */
    List<ImageView> f14035d = new ArrayList(3);

    /* renamed from: e  reason: collision with root package name */
    ImageView f14036e;

    /* renamed from: f  reason: collision with root package name */
    private final View f14037f;
    private final int[] g;

    public a(View view) {
        this.f14037f = view;
        this.f14034c = (TextView) view.findViewById(C0906R.id.c_m);
        this.f14033b = (ImageView) view.findViewById(C0906R.id.c_g);
        this.f14036e = (ImageView) view.findViewById(C0906R.id.c_e);
        this.f14035d.add(view.findViewById(C0906R.id.hm));
        this.f14035d.add(view.findViewById(C0906R.id.hn));
        this.f14035d.add(view.findViewById(C0906R.id.ho));
        this.g = new int[]{2130840649, 2130840651, 2130840648};
    }

    public final void a(final c cVar) {
        int i;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f14032a, false, 8518, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f14032a, false, 8518, new Class[]{c.class}, Void.TYPE);
            return;
        }
        q.b(this.f14033b, cVar.f7720a);
        this.f14034c.setText(cVar.f7721b);
        if (com.bytedance.android.livesdk.feed.l.c.c()) {
            this.f14037f.setContentDescription(cVar.f7721b);
        }
        this.f14037f.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14038a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14038a, false, 8519, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14038a, false, 8519, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                try {
                    Uri parse = Uri.parse(cVar.f7723d);
                    if (h.e() != null) {
                        h.e().a(view.getContext(), parse);
                    }
                } catch (Exception unused) {
                }
            }
        });
        if (!com.bytedance.android.live.uikit.d.c.a(this.f14037f.getContext()) || Build.VERSION.SDK_INT < 19) {
            this.f14036e.setBackgroundResource(2130841223);
        } else {
            this.f14036e.setBackgroundResource(0);
            Drawable c2 = ac.c(2130841223);
            c2.setAutoMirrored(true);
            this.f14036e.setBackground(c2);
        }
        int size = this.f14035d.size();
        if (cVar.f7722c == null) {
            i = 0;
        } else {
            i = cVar.f7722c.size();
        }
        int max = Math.max(0, size - i);
        for (int i2 = 0; i2 < this.f14035d.size(); i2++) {
            ImageView imageView = this.f14035d.get(i2);
            if (i2 < max) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                if (i2 < this.g.length) {
                    imageView.setBackgroundResource(this.g[i2]);
                }
                q.a(imageView, cVar.f7722c.get(i2 - max).f7719a);
            }
        }
    }
}

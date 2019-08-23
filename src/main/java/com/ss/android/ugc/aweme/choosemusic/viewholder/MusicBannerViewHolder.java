package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.app.Activity;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.i;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.BannerViewHolder;
import com.ss.android.ugc.aweme.discover.model.Banner;
import java.util.List;
import java.util.Map;

public class MusicBannerViewHolder extends BannerViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36063a;

    /* renamed from: b  reason: collision with root package name */
    public int f36064b;

    /* renamed from: e  reason: collision with root package name */
    private int f36065e;

    class a implements View.OnAttachStateChangeListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36066a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f36068c;

        private void a() {
            if (PatchProxy.isSupport(new Object[0], this, f36066a, false, 26876, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36066a, false, 26876, new Class[0], Void.TYPE);
                return;
            }
            this.f36068c = false;
            MusicBannerViewHolder.this.itemView.removeCallbacks(this);
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f36066a, false, 26877, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36066a, false, 26877, new Class[0], Void.TYPE);
                return;
            }
            Banner banner = MusicBannerViewHolder.this.f41534d;
            boolean b2 = ao.b(MusicBannerViewHolder.this.itemView);
            if (banner != null) {
                if (b2 && !this.f36068c) {
                    String bid = MusicBannerViewHolder.this.f41534d.getBid();
                    int i = MusicBannerViewHolder.this.f36064b;
                    if (PatchProxy.isSupport(new Object[]{bid, Integer.valueOf(i)}, null, c.f35896a, true, 26784, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bid, Integer.valueOf(i)}, null, c.f35896a, true, 26784, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        r.a("banner_show", (Map) d.a().a("enter_from", "change_music_page").a("banner_id", bid).a("client_order", Integer.toString(i)).f34114b);
                    }
                }
                this.f36068c = b2;
            }
            MusicBannerViewHolder.this.itemView.postDelayed(this, 250);
        }

        private a() {
        }

        public final void onViewAttachedToWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36066a, false, 26874, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36066a, false, 26874, new Class[]{View.class}, Void.TYPE);
                return;
            }
            a();
            run();
        }

        public final void onViewDetachedFromWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36066a, false, 26875, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36066a, false, 26875, new Class[]{View.class}, Void.TYPE);
                return;
            }
            a();
        }

        /* synthetic */ a(MusicBannerViewHolder musicBannerViewHolder, byte b2) {
            this();
        }
    }

    public void clickCover() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f36063a, false, 26872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36063a, false, 26872, new Class[0], Void.TYPE);
            return;
        }
        if (this.f41534d != null && !TextUtils.isEmpty(this.f41534d.getSchema())) {
            String schema = this.f41534d.getSchema();
            if (schema == null || !schema.startsWith("aweme://assmusic/category/")) {
                h.a().a(this.f41534d.getSchema());
                List<String> a2 = k.a(this.f41534d.getSchema());
                if (!CollectionUtils.isEmpty(a2) && a2.size() > 1) {
                    c.a(new com.ss.android.ugc.aweme.choosemusic.a("change_music_page", "", "click_banner", c.a()), a2.get(1), true);
                }
            } else {
                if (!schema.contains("?")) {
                    str = schema + "?musicType=" + this.f36065e;
                } else {
                    str = schema + "&musicType=" + this.f36065e;
                }
                String str3 = str;
                h a3 = h.a();
                Activity activity = (Activity) this.itemView.getContext();
                if (PatchProxy.isSupport(new Object[]{activity, str3, 1}, a3, h.f2586a, false, 70959, new Class[]{Activity.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str3, 1}, a3, h.f2586a, false, 70959, new Class[]{Activity.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                } else {
                    if (PatchProxy.isSupport(new Object[]{a3, activity, str3, 1}, null, i.f33249a, true, 70967, new Class[]{h.class, Activity.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{a3, activity, str3, 1}, null, i.f33249a, true, 70967, new Class[]{h.class, Activity.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                    } else {
                        com.ss.android.ugc.aweme.lancet.i.a(str3);
                        a3.a(activity, str3, 1);
                    }
                }
                String b2 = k.b(this.f41534d.getSchema(), "name");
                String bid = this.f41534d.getBid();
                if (PatchProxy.isSupport(new Object[]{str3}, this, f36063a, false, 26873, new Class[]{String.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{str3}, this, f36063a, false, 26873, new Class[]{String.class}, String.class);
                } else {
                    List<String> a4 = k.a(str3);
                    if (CollectionUtils.isEmpty(a4) || a4.size() < 2) {
                        str2 = "";
                    } else {
                        str2 = a4.get(1);
                    }
                }
                c.a(b2, "click_banner", bid, "change_music_page", str2);
            }
            String bid2 = this.f41534d.getBid();
            int i = this.f36064b;
            if (PatchProxy.isSupport(new Object[]{bid2, Integer.valueOf(i)}, null, c.f35896a, true, 26783, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bid2, Integer.valueOf(i)}, null, c.f35896a, true, 26783, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            r.a("banner_click", (Map) d.a().a("enter_from", "change_music_page").a("banner_id", bid2).a("client_order", Integer.toString(i)).f34114b);
        }
    }

    public MusicBannerViewHolder(View view, int i) {
        super(view);
        this.f36065e = i;
        a aVar = new a(this, (byte) 0);
        view.addOnAttachStateChangeListener(aVar);
        if (ViewCompat.isAttachedToWindow(view)) {
            aVar.run();
        }
    }

    public final void a(Banner banner, int i) {
        if (PatchProxy.isSupport(new Object[]{banner, Integer.valueOf(i)}, this, f36063a, false, 26871, new Class[]{Banner.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{banner, Integer.valueOf(i)}, this, f36063a, false, 26871, new Class[]{Banner.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(banner, i);
        this.f36064b = i + 1;
    }
}

package com.ss.android.ugc.aweme.discover.adapter;

import android.graphics.Outline;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.widget.NearByPoiLocationLayout;
import com.ss.android.ugc.aweme.profile.d.b;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.f;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.q;

public class StaggeredGridSearchAwemeViewHolder extends AbsCellViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41910a;

    /* renamed from: b  reason: collision with root package name */
    View f41911b;

    /* renamed from: c  reason: collision with root package name */
    TextView f41912c;
    AvatarImageView k;
    TextView l;
    TextView m;
    TextView n;
    TextView o;
    View p;
    NearByPoiLocationLayout q;
    int r;
    public String s;
    private boolean v;
    private float w = ((float) ((p.b(this.u) - 24) / 2));

    public final void a(float f2) {
    }

    public final void l() {
    }

    public final boolean k() {
        return this.v;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41910a, false, 35950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41910a, false, 35950, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final String j() {
        if (PatchProxy.isSupport(new Object[0], this, f41910a, false, 35951, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f41910a, false, 35951, new Class[0], String.class);
        } else if (this.g != null) {
            return ((Aweme) this.g).getAid();
        } else {
            return "";
        }
    }

    public final void i() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f41910a, false, 35949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41910a, false, 35949, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            Video video = ((Aweme) this.g).getVideo();
            if (video != null) {
                if (((Aweme) this.g).getVideo().getWidth() == 0) {
                    f2 = 1.0f;
                } else {
                    f2 = ((float) ((Aweme) this.g).getVideo().getHeight()) / ((float) ((Aweme) this.g).getVideo().getWidth());
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
                layoutParams.height = (int) (this.w * f2);
                this.h.setLayoutParams(layoutParams);
                if (AbTestManager.a().ax() == 1) {
                    f.a(this.f41911b.getContext(), true);
                } else {
                    f.a(this.f41911b.getContext(), false);
                }
                if (e() && a(video.getDynamicCover())) {
                    this.h.a(video.getDynamicCover());
                    this.i = true;
                } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                    this.h.setImageResource(C0906R.color.a0k);
                } else {
                    c.b(this.h, video.getCover());
                }
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f41910a, false, 35948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41910a, false, 35948, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            i();
            if (((Aweme) this.g).isLive() && !TextUtils.isEmpty(((Aweme) this.g).getTitle())) {
                this.f41912c.setVisibility(0);
                this.f41912c.setText(((Aweme) this.g).getTitle());
            } else if (!TextUtils.isEmpty(((Aweme) this.g).getDesc())) {
                this.f41912c.setVisibility(0);
                this.f41912c.setText(((Aweme) this.g).getDesc());
            } else {
                this.f41912c.setVisibility(8);
            }
            if (((Aweme) this.g).getAuthor() != null) {
                this.k.a(((Aweme) this.g).getAuthor().getAvatarThumb());
            }
            this.l.setVisibility(0);
            if (((Aweme) this.g).getAuthor() != null) {
                this.l.setText(((Aweme) this.g).getAuthor().getNickname());
            }
            this.m.setText(String.valueOf(b.a(((Aweme) this.g).getStatistics().getDiggCount())));
            ((Aweme) this.g).getPoiStruct();
            if (TextUtils.isEmpty(((Aweme) this.g).getDistance())) {
                this.o.setVisibility(8);
                this.p.setVisibility(8);
            } else {
                this.o.setVisibility(0);
                this.o.setText(((Aweme) this.g).getDistance());
                this.p.setVisibility(0);
            }
            this.n.setVisibility(8);
            this.q.setVisibility(8);
            if (!com.ss.android.ugc.aweme.feed.c.e()) {
                this.o.setVisibility(8);
            }
        }
    }

    public final void d(boolean z) {
        this.v = true;
    }

    public final void a(Aweme aweme, int i, boolean z) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41910a, false, 35947, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z)}, this, f41910a, false, 35947, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, i);
        if (aweme2 != null) {
            this.g = aweme2;
            this.v = z;
            if (this.v) {
                b();
            }
        }
    }

    public StaggeredGridSearchAwemeViewHolder(final View view, String str, final d dVar, final int i) {
        super(view);
        this.f41911b = view;
        this.r = i;
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.f41912c = (TextView) view.findViewById(C0906R.id.bog);
        this.k = (AvatarImageView) view.findViewById(C0906R.id.hk);
        this.l = (TextView) view.findViewById(C0906R.id.awq);
        this.m = (TextView) view.findViewById(C0906R.id.a08);
        this.n = (TextView) view.findViewById(C0906R.id.bjq);
        this.o = (TextView) view.findViewById(C0906R.id.dmw);
        this.p = view.findViewById(C0906R.id.dmx);
        this.q = (NearByPoiLocationLayout) view.findViewById(C0906R.id.bq3);
        this.i = true;
        this.s = str;
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41913a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41913a, false, 35952, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41913a, false, 35952, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getStatus() == null || !((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.a(view, (Aweme) StaggeredGridSearchAwemeViewHolder.this.g, StaggeredGridSearchAwemeViewHolder.this.s);
                    }
                    return;
                }
                a.c(view.getContext(), (int) C0906R.string.dr2).a();
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41917a;

            public final void onClick(View view) {
                String str;
                if (PatchProxy.isSupport(new Object[]{view}, this, f41917a, false, 35953, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41917a, false, 35953, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (StaggeredGridSearchAwemeViewHolder.this.g != null && ((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAuthor() != null) {
                    r.onEvent(MobClick.obtain().setEventName("head").setLabelName(StaggeredGridSearchAwemeViewHolder.this.s).setValue(((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAuthorUid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("group_id", ((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAid()).a("to_user_id", aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("author_id", aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("request_id", aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g, i)).a("poi_channel", aa.b()).a("city_info", aa.a()).a("distance_info", aa.i((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("poi_id", aa.e((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("poi_type", aa.h((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("enterMethod", "click_head").b()));
                    ((q) new q().b((Aweme) StaggeredGridSearchAwemeViewHolder.this.g, i).b(StaggeredGridSearchAwemeViewHolder.this.s).k(((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAuthorUid()).a("click_head")).e();
                    new com.ss.android.ugc.aweme.u.p().a(((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAid()).c(StaggeredGridSearchAwemeViewHolder.this.s).b(((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAuthorUid()).e();
                    MobClick value = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g));
                    com.ss.android.ugc.aweme.app.d.c a2 = new com.ss.android.ugc.aweme.app.d.c().a("group_id", ((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAid()).a("request_id", aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g, i));
                    if (((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).isImage()) {
                        str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    r.onEvent(value.setJsonObject(a2.a("is_photo", str).a("poi_channel", aa.b()).a("city_info", aa.a()).a("distance_info", aa.i((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("poi_id", aa.e((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("poi_type", aa.h((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("enter_from", StaggeredGridSearchAwemeViewHolder.this.s).b()));
                    UserProfileActivity.a(view.getContext(), ((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAuthor(), StaggeredGridSearchAwemeViewHolder.this.s, "", "main_head");
                }
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41920a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41920a, false, 35954, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41920a, false, 35954, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (StaggeredGridSearchAwemeViewHolder.this.g != null && ((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAuthor() != null) {
                    r.onEvent(MobClick.obtain().setEventName("name").setLabelName(StaggeredGridSearchAwemeViewHolder.this.s).setValue(((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAuthorUid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("group_id", ((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAid()).a("to_user_id", aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("author_id", aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("request_id", aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g, i)).a("poi_channel", aa.b()).a("city_info", aa.a()).a("distance_info", aa.i((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("poi_id", aa.e((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("poi_type", aa.h((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("enterMethod", "click_name").b()));
                    ((q) new q().b((Aweme) StaggeredGridSearchAwemeViewHolder.this.g, i).b(StaggeredGridSearchAwemeViewHolder.this.s).a("click_name")).e();
                    new com.ss.android.ugc.aweme.u.p().e((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).c(StaggeredGridSearchAwemeViewHolder.this.s).e();
                    r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("group_id", ((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAid()).a("request_id", aa.a((Aweme) StaggeredGridSearchAwemeViewHolder.this.g, i)).a("is_photo", aa.n((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("poi_channel", aa.b()).a("city_info", aa.a()).a("distance_info", aa.i((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("poi_id", aa.e((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("poi_type", aa.h((Aweme) StaggeredGridSearchAwemeViewHolder.this.g)).a("enter_from", StaggeredGridSearchAwemeViewHolder.this.s).b()));
                    UserProfileActivity.a(view.getContext(), ((Aweme) StaggeredGridSearchAwemeViewHolder.this.g).getAuthor(), StaggeredGridSearchAwemeViewHolder.this.s, "", "main_head");
                }
            }
        });
        this.h.setAnimationListener(this.f40163e);
        if (Build.VERSION.SDK_INT >= 21) {
            this.h.setOutlineProvider(new ViewOutlineProvider() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41923a;

                @RequiresApi(api = 21)
                public final void getOutline(View view, Outline outline) {
                    if (PatchProxy.isSupport(new Object[]{view, outline}, this, f41923a, false, 35955, new Class[]{View.class, Outline.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, outline}, this, f41923a, false, 35955, new Class[]{View.class, Outline.class}, Void.TYPE);
                    } else if (AbTestManager.a().aw() == 1) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 4.0f);
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + 4, 4.0f);
                    }
                }
            });
            this.h.setClipToOutline(true);
        }
    }
}

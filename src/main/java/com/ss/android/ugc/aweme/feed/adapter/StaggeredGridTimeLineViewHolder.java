package com.ss.android.ugc.aweme.feed.adapter;

import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.lighten.core.b.a;
import com.bytedance.lighten.loader.SmartImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.widget.NearByPoiLocationLayout;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.profile.d.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.views.SmartAnimatedImageView;
import com.ss.android.ugc.aweme.views.m;
import java.util.List;

public class StaggeredGridTimeLineViewHolder extends BaseStaggeredGridTimelineViewHolder {
    public static ChangeQuickRedirect v;
    TextView A;
    TextView B;
    ImageView C;
    View D;
    NearByPoiLocationLayout E;
    int F;
    TextView G;
    View H;
    public String I;
    protected SmartAnimatedImageView J;
    private boolean K;
    private float L = ((float) ((p.b(this.u) - u.a(20.0d)) / 2));
    View w;
    TextView x;
    AvatarImageView y;
    TextView z;

    public final void a(float f2) {
    }

    public final void l() {
    }

    public final boolean k() {
        return this.K;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40659, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40664, new Class[0], Void.TYPE);
            return;
        }
        this.J.a();
    }

    public final String j() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40660, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 40660, new Class[0], String.class);
        } else if (this.g != null) {
            return ((Aweme) this.g).getAid();
        } else {
            return "";
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40668, new Class[0], Void.TYPE);
            return;
        }
        this.J.animate().alpha(0.0f).start();
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40669, new Class[0], Void.TYPE);
            return;
        }
        this.J.animate().alpha(1.0f).start();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40665, new Class[0], Void.TYPE);
            return;
        }
        SmartAnimatedImageView smartAnimatedImageView = this.J;
        if (smartAnimatedImageView.getController() != null) {
            Animatable animatable = smartAnimatedImageView.getController().getAnimatable();
            if (animatable != null && animatable.isRunning()) {
                animatable.stop();
                if (!(smartAnimatedImageView.f21798a == null || smartAnimatedImageView.f21798a.get() == null)) {
                    ((a) smartAnimatedImageView.f21798a.get()).b();
                }
            }
        }
    }

    public final void h() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40666, new Class[0], Void.TYPE);
        } else if (this.J != null) {
            SmartAnimatedImageView smartAnimatedImageView = this.J;
            if (!(smartAnimatedImageView.getController() == null || smartAnimatedImageView.getController().getAnimatable() == null)) {
                Animatable animatable = smartAnimatedImageView.getController().getAnimatable();
                if (animatable instanceof com.facebook.a.a.a) {
                    ((com.facebook.a.a.a) animatable).dropCaches();
                }
            }
        }
    }

    public final void i() {
        UrlModel urlModel;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40658, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40658, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            float f2 = 1.0f;
            this.J.setAlpha(1.0f);
            if (((Aweme) this.g).isLive()) {
                User author = ((Aweme) this.g).getAuthor();
                if (author != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
                    if (e.b()) {
                        layoutParams.height = (int) ((this.L * 16.0f) / 9.0f);
                    } else {
                        layoutParams.height = (int) this.L;
                    }
                    this.H.setLayoutParams(layoutParams);
                    SmartAnimatedImageView smartAnimatedImageView = this.J;
                    if (author.roomCover == null) {
                        urlModel = author.getAvatarLarger();
                    } else {
                        urlModel = author.roomCover;
                    }
                    m.a((SmartImageView) smartAnimatedImageView, urlModel, (int) this.L, layoutParams.height, "poi");
                }
            } else if (((Aweme) this.g).isImage()) {
                List<ImageInfo> imageInfos = ((Aweme) this.g).getImageInfos();
                if (imageInfos != null && !imageInfos.isEmpty()) {
                    ImageInfo imageInfo = imageInfos.get(0);
                    if (imageInfo != null) {
                        if (imageInfo.getWidth() != 0) {
                            f2 = ((float) imageInfo.getHeight()) / ((float) imageInfo.getWidth());
                        }
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
                        layoutParams2.height = (int) (this.L * f2);
                        this.H.setLayoutParams(layoutParams2);
                        m.a((SmartImageView) this.J, imageInfo.getLabelLarge(), (int) this.L, layoutParams2.height, "poi");
                    }
                }
            } else {
                Video video = ((Aweme) this.g).getVideo();
                if (video != null) {
                    if (((Aweme) this.g).getVideo().getWidth() != 0) {
                        f2 = ((float) ((Aweme) this.g).getVideo().getHeight()) / ((float) ((Aweme) this.g).getVideo().getWidth());
                    }
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
                    layoutParams3.height = (int) (this.L * f2);
                    this.H.setLayoutParams(layoutParams3);
                    if (e() && a(video.getDynamicCover())) {
                        this.J.a(video.getDynamicCover());
                        this.i = true;
                    } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                        this.J.setImageResource(C0906R.color.a0k);
                    } else {
                        m.a((SmartImageView) this.J, video.getCover(), (int) this.L, layoutParams3.height, "poi");
                    }
                }
            }
        }
    }

    public final void b() {
        String str;
        String str2;
        int i;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40654, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40654, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            i();
            if (((Aweme) this.g).isLive() && !TextUtils.isEmpty(((Aweme) this.g).getTitle())) {
                this.x.setVisibility(0);
                this.x.setText(((Aweme) this.g).getTitle());
            } else if (!TextUtils.isEmpty(((Aweme) this.g).getDesc())) {
                this.x.setVisibility(0);
                this.x.setText(((Aweme) this.g).getDesc());
            } else {
                this.x.setVisibility(8);
            }
            if (((Aweme) this.g).getAuthor() != null) {
                this.y.a(((Aweme) this.g).getAuthor().getAvatarThumb());
            }
            if (((Aweme) this.g).getAuthor() != null) {
                this.z.setVisibility(0);
                if (!TextUtils.isEmpty(((Aweme) this.g).getAuthor().getRemarkName())) {
                    this.z.setText(((Aweme) this.g).getAuthor().getRemarkName());
                } else {
                    this.z.setText(((Aweme) this.g).getAuthor().getNickname());
                }
            } else {
                this.z.setVisibility(4);
            }
            if (((Aweme) this.g).isLive()) {
                this.A.setCompoundDrawablesWithIntrinsicBounds(2130839708, 0, 0, 0);
                this.A.setText(String.valueOf(((Aweme) this.g).getRoom().getUserCount()));
            } else {
                ImageView imageView = this.C;
                if (((Aweme) this.g).isImage()) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                this.A.setCompoundDrawablesWithIntrinsicBounds(2130838749, 0, 0, 0);
                this.A.setText(String.valueOf(b.a(((Aweme) this.g).getStatistics().getDiggCount())));
            }
            if (((Aweme) this.g).getAuthor() != null && ((Aweme) this.g).getAuthor().getRoomTypeTag() != null) {
                this.G.setVisibility(0);
                this.G.setText(((Aweme) this.g).getAuthor().getRoomTypeTag());
            } else if (((Aweme) this.g).isLive()) {
                this.G.setVisibility(0);
                this.G.setText(C0906R.string.cck);
            } else {
                this.G.setVisibility(8);
            }
            PoiStruct poiStruct = ((Aweme) this.g).getPoiStruct();
            if (poiStruct == null) {
                if (TextUtils.isEmpty(((Aweme) this.g).getDistance())) {
                    this.B.setVisibility(8);
                    this.D.setVisibility(8);
                } else {
                    this.B.setVisibility(0);
                    this.B.setText(((Aweme) this.g).getDistance());
                    this.D.setVisibility(0);
                }
                this.E.setVisibility(8);
            } else {
                this.E.setVisibility(0);
                this.E.setData(poiStruct);
                if (TextUtils.isEmpty(((Aweme) this.g).getDistance())) {
                    this.B.setVisibility(8);
                } else {
                    this.B.setVisibility(0);
                    this.B.setText(((Aweme) this.g).getDistance());
                }
            }
            if (!c.e()) {
                this.B.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, v, false, 40655, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, v, false, 40655, new Class[0], Void.TYPE);
                return;
            }
            if (this.g != null) {
                StringBuilder sb = new StringBuilder();
                String distance = ((Aweme) this.g).getDistance();
                if (PatchProxy.isSupport(new Object[]{distance}, this, v, false, 40656, new Class[]{String.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{distance}, this, v, false, 40656, new Class[]{String.class}, String.class);
                } else {
                    if (!TextUtils.isEmpty(distance)) {
                        int indexOf = distance.toLowerCase().indexOf("km");
                        int indexOf2 = distance.toLowerCase().indexOf("m");
                        if (indexOf != -1) {
                            str = String.format(this.u.getResources().getString(C0906R.string.ccg), new Object[]{distance.substring(0, indexOf)});
                        } else if (indexOf2 != -1) {
                            str = String.format(this.u.getResources().getString(C0906R.string.cch), new Object[]{distance.substring(0, indexOf2)});
                        }
                    }
                    str = "";
                }
                this.B.setContentDescription(str);
                sb.append(str);
                if (((Aweme) this.g).isLive() && !TextUtils.isEmpty(((Aweme) this.g).getTitle())) {
                    this.x.setContentDescription(((Aweme) this.g).getTitle());
                    sb.append(((Aweme) this.g).getTitle());
                } else if (!TextUtils.isEmpty(((Aweme) this.g).getDesc())) {
                    this.x.setContentDescription(((Aweme) this.g).getDesc());
                    sb.append(((Aweme) this.g).getDesc());
                } else {
                    this.x.setContentDescription("");
                }
                if (((Aweme) this.g).isLive()) {
                    str2 = String.format(this.u.getResources().getString(C0906R.string.ccj), new Object[]{Integer.valueOf(((Aweme) this.g).getRoom().getUserCount())});
                } else {
                    str2 = String.format(this.u.getResources().getString(C0906R.string.cci), new Object[]{Integer.valueOf(((Aweme) this.g).getStatistics().getDiggCount())});
                }
                this.A.setContentDescription(str2);
                sb.append(str2);
                if (((Aweme) this.g).getAuthor() == null) {
                    this.z.setContentDescription("");
                    this.y.setContentDescription("");
                } else if (!TextUtils.isEmpty(((Aweme) this.g).getAuthor().getRemarkName())) {
                    this.z.setContentDescription(((Aweme) this.g).getAuthor().getRemarkName());
                    this.y.setContentDescription(((Aweme) this.g).getAuthor().getRemarkName());
                } else {
                    this.z.setContentDescription(((Aweme) this.g).getAuthor().getNickname());
                    this.y.setContentDescription(((Aweme) this.g).getAuthor().getNickname());
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    String format = String.format(this.u.getResources().getString(C0906R.string.ccf), new Object[]{sb2});
                    this.H.setContentDescription(format);
                    this.w.setContentDescription(format);
                    return;
                }
                this.H.setContentDescription("");
                this.w.setContentDescription("");
            }
        }
    }

    public final void d(boolean z2) {
        this.K = true;
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 40663, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 40663, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.J.setUserVisibleHint(z2);
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 40662, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 40662, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.J.setAttached(z2);
    }

    /* access modifiers changed from: private */
    public void a(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, v, false, 40661, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, v, false, 40661, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.J.setUserVisibleHint(false);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, boolean z2) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 40652, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z2)}, this, v, false, 40652, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.g != null && ((Aweme) this.g).getAuthor() != null) {
            MobClick obtain = MobClick.obtain();
            if (z2) {
                str = "head";
            } else {
                str = "name";
            }
            MobClick value = obtain.setEventName(str).setLabelName(this.I).setValue(((Aweme) this.g).getAuthorUid());
            com.ss.android.ugc.aweme.app.d.c a2 = new com.ss.android.ugc.aweme.app.d.c().a("group_id", ((Aweme) this.g).getAid()).a("to_user_id", aa.a((Aweme) this.g)).a("author_id", aa.a((Aweme) this.g)).a("request_id", aa.a((Aweme) this.g, this.F)).a("poi_channel", aa.b()).a("city_info", aa.a()).a("distance_info", aa.i((Aweme) this.g)).a("poi_id", aa.e((Aweme) this.g)).a("poi_type", aa.h((Aweme) this.g));
            if (z2) {
                str2 = "click_head";
            } else {
                str2 = "click_name";
            }
            r.onEvent(value.setJsonObject(a2.a("enterMethod", str2).b()));
            q k = new q().b((Aweme) this.g, this.F).b(this.I).k(((Aweme) this.g).getAuthorUid());
            if (z2) {
                str3 = "click_head";
            } else {
                str3 = "click_name";
            }
            ((q) k.a(str3)).e();
            new com.ss.android.ugc.aweme.u.p().e((Aweme) this.g).c(this.I).e();
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aa.a((Aweme) this.g)).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("group_id", ((Aweme) this.g).getAid()).a("request_id", aa.a((Aweme) this.g, this.F)).a("is_photo", aa.n((Aweme) this.g)).a("poi_channel", aa.b()).a("city_info", aa.a()).a("distance_info", aa.i((Aweme) this.g)).a("poi_id", aa.e((Aweme) this.g)).a("poi_type", aa.h((Aweme) this.g)).a("enter_from", this.I).b()));
            UserProfileActivity.a(view.getContext(), ((Aweme) this.g).getAuthor(), this.I, "", "main_head");
        }
    }

    public final void a(Aweme aweme, int i, boolean z2) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 40653, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z2)}, this, v, false, 40653, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(aweme, i);
        if (aweme2 != null) {
            this.g = aweme2;
            this.K = z2;
            if (this.K) {
                b();
            }
            n();
        }
    }

    public StaggeredGridTimeLineViewHolder(final View view, String str, final d dVar, int i, z zVar) {
        super(str, i, view, null);
        this.w = view;
        this.F = i;
        this.J = (SmartAnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.x = (TextView) view.findViewById(C0906R.id.ds9);
        this.y = (AvatarImageView) view.findViewById(C0906R.id.hk);
        this.z = (TextView) view.findViewById(C0906R.id.awq);
        this.A = (TextView) view.findViewById(C0906R.id.a08);
        this.B = (TextView) view.findViewById(C0906R.id.dmw);
        this.C = (ImageView) view.findViewById(C0906R.id.b3v);
        this.D = view.findViewById(C0906R.id.dmx);
        this.E = (NearByPoiLocationLayout) view.findViewById(C0906R.id.bq3);
        this.G = (TextView) view.findViewById(C0906R.id.bf7);
        this.H = view.findViewById(C0906R.id.a1d);
        this.i = true;
        this.I = str;
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44786a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44786a, false, 40672, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44786a, false, 40672, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) StaggeredGridTimeLineViewHolder.this.g).getStatus() == null || !((Aweme) StaggeredGridTimeLineViewHolder.this.g).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.a(view, (Aweme) StaggeredGridTimeLineViewHolder.this.g, StaggeredGridTimeLineViewHolder.this.I);
                    }
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), (int) C0906R.string.dr2).a();
            }
        });
        this.H.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44790a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44790a, false, 40673, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44790a, false, 40673, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) StaggeredGridTimeLineViewHolder.this.g).getStatus() == null || !((Aweme) StaggeredGridTimeLineViewHolder.this.g).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.a(view, (Aweme) StaggeredGridTimeLineViewHolder.this.g, StaggeredGridTimeLineViewHolder.this.I);
                    }
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), (int) C0906R.string.dr2).a();
            }
        });
        this.y.setOnClickListener(new aa(this));
        this.z.setOnClickListener(new ab(this));
        this.J.setAnimationListener(new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44794a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f44794a, false, 40674, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f44794a, false, 40674, new Class[0], Void.TYPE);
                    return;
                }
                StaggeredGridTimeLineViewHolder.this.f40163e.a();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f44794a, false, 40675, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f44794a, false, 40675, new Class[0], Void.TYPE);
                    return;
                }
                StaggeredGridTimeLineViewHolder.this.f40163e.b();
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            this.J.setOutlineProvider(new ViewOutlineProvider() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44796a;

                @RequiresApi(api = 21)
                public final void getOutline(View view, Outline outline) {
                    if (PatchProxy.isSupport(new Object[]{view, outline}, this, f44796a, false, 40676, new Class[]{View.class, Outline.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, outline}, this, f44796a, false, 40676, new Class[]{View.class, Outline.class}, Void.TYPE);
                        return;
                    }
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 4.0f);
                }
            });
            this.J.setClipToOutline(true);
        }
    }
}

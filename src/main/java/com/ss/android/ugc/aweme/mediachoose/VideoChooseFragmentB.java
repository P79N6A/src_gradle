package com.ss.android.ugc.aweme.mediachoose;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapterB;
import com.ss.android.ugc.aweme.mediachoose.MediaAdapterB;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.photo.local.MediaChooseFragmentB;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.ce;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.local.ChooseRecyclerView;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoChooseFragmentB extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55222a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f55223b;

    /* renamed from: c  reason: collision with root package name */
    protected ProgressBar f55224c;

    /* renamed from: d  reason: collision with root package name */
    public ChooseRecyclerView f55225d;

    /* renamed from: e  reason: collision with root package name */
    protected MediaAdapterB f55226e;

    /* renamed from: f  reason: collision with root package name */
    public View f55227f;
    public View g;
    public TextView h;
    public MediaAdapterB.b i;
    public boolean j;
    public MediaChooseFragmentB k;
    public boolean l;
    public long m = ff.a();
    protected MediaAdapterB.a n = new MediaAdapterB.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55228a;

        public final void a(View view, a aVar) {
            String str;
            w aVar2;
            w wVar;
            View view2 = view;
            a aVar3 = aVar;
            if (PatchProxy.isSupport(new Object[]{view2, aVar3}, this, f55228a, false, 58603, new Class[]{View.class, a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, aVar3}, this, f55228a, false, 58603, new Class[]{View.class, a.class}, Void.TYPE);
                return;
            }
            if (!VideoChooseFragmentB.this.f55226e.g) {
                i.a(false, true);
                VideoChooseFragmentB videoChooseFragmentB = VideoChooseFragmentB.this;
                if (PatchProxy.isSupport(new Object[]{aVar3}, videoChooseFragmentB, VideoChooseFragmentB.f55222a, false, 58581, new Class[]{a.class}, Void.TYPE)) {
                    Object[] objArr = {aVar3};
                    VideoChooseFragmentB videoChooseFragmentB2 = videoChooseFragmentB;
                    PatchProxy.accessDispatch(objArr, videoChooseFragmentB2, VideoChooseFragmentB.f55222a, false, 58581, new Class[]{a.class}, Void.TYPE);
                    return;
                }
                d.a().b();
                d.a().a(aVar3);
                if (aVar3.g == 4) {
                    if (aVar3.h <= videoChooseFragmentB.m) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) videoChooseFragmentB.getActivity(), videoChooseFragmentB.getString(C0906R.string.dp6, Long.valueOf(videoChooseFragmentB.m / 1000))).a();
                    } else if (aVar3.h <= 600000) {
                        String str2 = aVar3.f56315e;
                        if (PatchProxy.isSupport(new Object[]{str2, aVar3}, videoChooseFragmentB, VideoChooseFragmentB.f55222a, false, 58584, new Class[]{String.class, a.class}, Void.TYPE)) {
                            Object[] objArr2 = {str2, aVar3};
                            Object[] objArr3 = objArr2;
                            VideoChooseFragmentB videoChooseFragmentB3 = videoChooseFragmentB;
                            PatchProxy.accessDispatch(objArr3, videoChooseFragmentB3, VideoChooseFragmentB.f55222a, false, 58584, new Class[]{String.class, a.class}, Void.TYPE);
                        } else if (videoChooseFragmentB.getActivity() != null) {
                            if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoLegalCheckInLocal)) {
                                aVar2 = new d(videoChooseFragmentB.getActivity());
                            } else {
                                aVar2 = new a(videoChooseFragmentB.getActivity());
                            }
                            aVar2.a(aVar, videoChooseFragmentB.m, -1, new r(videoChooseFragmentB, str2), new s(videoChooseFragmentB));
                        }
                        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("upload_type", "single_content").a("content_type", "video").a("previous_page", videoChooseFragmentB.k.k.a().a()).a("shoot_way", videoChooseFragmentB.k.k.a().c());
                        if (videoChooseFragmentB.k.k.b()) {
                            str = "upload_page";
                        } else {
                            str = "multi_shoot_page";
                        }
                        r.a("enter_upload_cropping_page", (Map) a2.a("enter_from", str).a("creation_id", videoChooseFragmentB.k.k.a().b()).f34114b);
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) videoChooseFragmentB.getActivity(), (int) C0906R.string.drv).a();
                    }
                }
            } else if (!VideoChooseFragmentB.this.j) {
                VideoChooseFragmentB.this.j = true;
                VideoChooseFragmentB videoChooseFragmentB4 = VideoChooseFragmentB.this;
                if (PatchProxy.isSupport(new Object[]{view2, aVar3}, videoChooseFragmentB4, VideoChooseFragmentB.f55222a, false, 58586, new Class[]{View.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                    VideoChooseFragmentB videoChooseFragmentB5 = videoChooseFragmentB4;
                    PatchProxy.accessDispatch(new Object[]{view2, aVar3}, videoChooseFragmentB5, VideoChooseFragmentB.f55222a, false, 58586, new Class[]{View.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
                } else {
                    String str3 = aVar3.f56315e;
                    if (videoChooseFragmentB4.getActivity() != null) {
                        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoLegalCheckInLocal)) {
                            wVar = new d(videoChooseFragmentB4.getActivity());
                        } else {
                            wVar = new a(videoChooseFragmentB4.getActivity());
                        }
                        wVar.a(aVar, 0, -1, new t(videoChooseFragmentB4, view2, str3), new u(videoChooseFragmentB4));
                    }
                }
            }
        }
    };
    private ImageView o;
    private ImageView p;
    private TextView q;
    private boolean r;
    private int s;
    private int t;
    private int u;

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f55222a, false, 58596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55222a, false, 58596, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        MediaAdapterB mediaAdapterB = this.f55226e;
        if (PatchProxy.isSupport(new Object[0], mediaAdapterB, MediaAdapterB.f55175a, false, 58533, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], mediaAdapterB, MediaAdapterB.f55175a, false, 58533, new Class[0], Void.TYPE);
            return;
        }
        mediaAdapterB.n.b(mediaAdapterB.q);
        mediaAdapterB.n.b(mediaAdapterB.p);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f55222a, false, 58589, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f55222a, false, 58589, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.s = getArguments().getInt("ARG_NUM_COLUMNS", 3);
        this.t = getArguments().getInt("ARG_TEXT_COLOR", getResources().getColor(C0906R.color.a3l));
        this.u = getArguments().getInt("ARG_SHADOW_COLOR", getResources().getColor(C0906R.color.a2p));
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55222a, false, 58593, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55222a, false, 58593, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 1) {
            this.f55224c.setVisibility(0);
            this.f55227f.setVisibility(8);
        } else if (i2 == 2) {
            this.f55227f.setVisibility(0);
            this.f55224c.setVisibility(8);
            ((SimpleItemAnimator) this.f55225d.getItemAnimator()).setSupportsChangeAnimations(false);
            this.f55223b.setText(null);
            this.r = true;
        } else {
            this.f55223b.setVisibility(0);
            this.f55223b.setText(getResources().getString(C0906R.string.bi8));
            this.f55227f.setVisibility(8);
            this.f55224c.setVisibility(8);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f55222a, false, 58587, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f55222a, false, 58587, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.port.in.a.f61121d.a((Context) getActivity(), (c) getArguments().getSerializable("challenge"));
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f55222a, false, 58594, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f55222a, false, 58594, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(String str, Long l2, Integer num) {
        this.j = false;
        a(str, num.intValue(), l2.longValue(), "preview");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit b(String str, Long l2, Integer num) {
        a(str, num.intValue(), l2.longValue(), "select");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(String str, String str2, Long l2) {
        if (!isViewValid()) {
            return null;
        }
        n.a("aweme_movie_import_error_rate", 0, (JSONObject) null);
        b(str2, 0, l2.longValue(), "select");
        if (!this.l) {
            a(str);
        } else if (getActivity() != null) {
            a((Activity) getActivity(), str, true, -1);
        }
        return null;
    }

    @SuppressLint({"InflateParams"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup, bundle}, this, f55222a, false, 58590, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup, bundle}, this, f55222a, false, 58590, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.apu, null);
        this.f55225d = (ChooseRecyclerView) inflate.findViewById(C0906R.id.alh);
        this.f55225d.setLayoutManager(new WrapGridLayoutManager(null, this.s));
        this.f55225d.addItemDecoration(new GridSpacingItemDecoration(this.s, (int) UIUtils.dip2Px(getContext(), 1.0f), false));
        this.f55223b = (TextView) inflate.findViewById(C0906R.id.dcr);
        this.f55224c = (ProgressBar) inflate.findViewById(C0906R.id.b2w);
        this.g = inflate.findViewById(C0906R.id.bh9);
        this.o = (ImageView) inflate.findViewById(C0906R.id.b3c);
        this.h = (TextView) inflate.findViewById(C0906R.id.dew);
        this.f55227f = inflate.findViewById(C0906R.id.bh8);
        this.p = (ImageView) inflate.findViewById(C0906R.id.b3d);
        this.q = (TextView) inflate.findViewById(C0906R.id.dex);
        this.f55227f.setVisibility(0);
        if (this.k != null) {
            this.f55225d.setFragment(this.k.k);
        }
        if (PatchProxy.isSupport(new Object[0], this, f55222a, false, 58591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55222a, false, 58591, new Class[0], Void.TYPE);
        } else {
            this.f55224c.setVisibility(0);
            MediaAdapterB mediaAdapterB = new MediaAdapterB(getActivity(), this, this.s, 1.3d, 1.5f, 0);
            this.f55226e = mediaAdapterB;
            this.f55226e.k = this.u;
            this.f55226e.j = this.t;
            this.f55226e.l = false;
            this.f55226e.r = this.i;
            this.f55226e.h = this.n;
            AnonymousClass2 r0 = new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55230a;

                public final void onClick(View view) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f55230a, false, 58604, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f55230a, false, 58604, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    VideoChooseFragmentB.this.f55226e.g = !VideoChooseFragmentB.this.f55226e.g;
                    if (VideoChooseFragmentB.this.f55226e.g) {
                        VideoChooseFragmentB.this.g.setVisibility(0);
                        VideoChooseFragmentB.this.f55227f.setVisibility(8);
                        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", VideoChooseFragmentB.this.k.k.a().b()).a("shoot_way", VideoChooseFragmentB.this.k.k.a().c()).a("previous_page", VideoChooseFragmentB.this.k.k.a().a());
                        if (VideoChooseFragmentB.this.k.k.b()) {
                            str = "upload_page";
                        } else {
                            str = "multi_shoot_page";
                        }
                        r.a("click_multi_choose_button", (Map) a2.a("enter_from", str).f34114b);
                    } else {
                        VideoChooseFragmentB.this.g.setVisibility(8);
                        VideoChooseFragmentB.this.f55227f.setVisibility(0);
                    }
                    MediaAdapterB mediaAdapterB = VideoChooseFragmentB.this.f55226e;
                    if (PatchProxy.isSupport(new Object[0], mediaAdapterB, MediaAdapterB.f55175a, false, 58532, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], mediaAdapterB, MediaAdapterB.f55175a, false, 58532, new Class[0], Void.TYPE);
                        return;
                    }
                    mediaAdapterB.a(mediaAdapterB.f55177c.size());
                    mediaAdapterB.notifyDataSetChanged();
                    if (!Lists.isEmpty(mediaAdapterB.m)) {
                        mediaAdapterB.m.clear();
                        if (mediaAdapterB.r != null) {
                            mediaAdapterB.r.a(mediaAdapterB.m);
                        }
                    }
                }
            };
            this.f55227f.setOnClickListener(r0);
            this.o.setOnClickListener(r0);
            this.h.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55232a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f55232a, false, 58605, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f55232a, false, 58605, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (VideoChooseFragmentB.this.k != null) {
                        VideoChooseFragmentB.this.k.b((List<ImageChooseAdapterB.a>) null);
                    }
                }
            });
            this.f55225d.setAdapter(this.f55226e);
        }
        a(1);
        return inflate;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(View view, String str, String str2, Long l2) {
        if (!isViewValid()) {
            this.j = false;
            return null;
        }
        n.a("aweme_movie_import_error_rate", 0, (JSONObject) null);
        b(str2, 0, l2.longValue(), "preview");
        if (PatchProxy.isSupport(new Object[]{view, str}, this, f55222a, false, 58588, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, str}, this, f55222a, false, 58588, new Class[]{View.class, String.class}, Void.TYPE);
        } else {
            VideoPreviewActivity.a(getActivity(), view, str, (((float) UIUtils.getScreenWidth(getContext())) * 1.0f) / ((float) UIUtils.getScreenHeight(getContext())));
            this.j = false;
        }
        return null;
    }

    private void a(String str, int i2, long j2, String str2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), new Long(j3), str2}, this, f55222a, false, 58597, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str, Integer.valueOf(i2), new Long(j3), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f55222a, false, 58597, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
        } else if (getActivity() != null && isViewValid()) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d.a(getActivity(), i2, -1);
            n.a("aweme_movie_import_error_rate", 1, com.ss.android.ugc.aweme.app.d.c.a().a("errorCode", String.valueOf(i2)).b());
            b(str, 1, j2, str2);
        }
    }

    private void b(String str, int i2, long j2, String str2) {
        String str3 = str;
        long j3 = j2;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), new Long(j3), str4}, this, f55222a, false, 58598, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str3, Integer.valueOf(i2), new Long(j3), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f55222a, false, 58598, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j3);
            n.a("aweme_video_import_duration", jSONObject, com.ss.android.ugc.aweme.app.d.c.a().a("status", String.valueOf(i2)).a("scene_name", str4).a("type", str3).b());
        } catch (JSONException unused) {
        }
    }

    public void a(Activity activity, String str, boolean z, int i2) {
        Activity activity2 = activity;
        String str2 = str;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, (byte) 1, Integer.valueOf(i2)}, this, f55222a, false, 58585, new Class[]{Activity.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2, (byte) 1, Integer.valueOf(i2)}, this, f55222a, false, 58585, new Class[]{Activity.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (activity2 instanceof VideoRecordNewActivity) {
            Intent intent = new Intent();
            intent.putExtra("video_file", str2);
            intent.putExtra("video_multi_edit", true);
            if (i3 > 0) {
                intent.putExtra("reverse_video_max_time", i3);
            }
            ((ce) activity2).a(1, -1, intent);
        }
    }
}

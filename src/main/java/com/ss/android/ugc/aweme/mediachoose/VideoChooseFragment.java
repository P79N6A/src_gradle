package com.ss.android.ugc.aweme.mediachoose;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.mediachoose.MediaAdapter;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.widget.baseadapter.HeaderAndFooterWrapper;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoChooseFragment extends AmeBaseFragment implements v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55208a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f55209b;

    /* renamed from: c  reason: collision with root package name */
    protected DmtLoadingLayout f55210c;

    /* renamed from: d  reason: collision with root package name */
    protected RecyclerView f55211d;

    /* renamed from: e  reason: collision with root package name */
    protected MediaAdapter f55212e;

    /* renamed from: f  reason: collision with root package name */
    protected d f55213f;
    public View g;
    public ImageView h;
    public ImageView i;
    public TextView j;
    public k k;
    public boolean l;
    public long m = ff.a();
    public HeaderAndFooterWrapper n;
    public boolean o;
    public boolean p;
    protected MediaAdapter.a q = new MediaAdapter.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55214a;

        public final void a(View view, a aVar) {
            w aVar2;
            w wVar;
            View view2 = view;
            a aVar3 = aVar;
            if (PatchProxy.isSupport(new Object[]{view2, aVar3}, this, f55214a, false, 58576, new Class[]{View.class, a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, aVar3}, this, f55214a, false, 58576, new Class[]{View.class, a.class}, Void.TYPE);
                return;
            }
            if (!VideoChooseFragment.this.f55212e.g) {
                i.a(false, true);
                VideoChooseFragment videoChooseFragment = VideoChooseFragment.this;
                if (PatchProxy.isSupport(new Object[]{aVar3}, videoChooseFragment, VideoChooseFragment.f55208a, false, 58550, new Class[]{a.class}, Void.TYPE)) {
                    Object[] objArr = {aVar3};
                    VideoChooseFragment videoChooseFragment2 = videoChooseFragment;
                    PatchProxy.accessDispatch(objArr, videoChooseFragment2, VideoChooseFragment.f55208a, false, 58550, new Class[]{a.class}, Void.TYPE);
                    return;
                }
                d.a().b();
                d.a().a(aVar3);
                if (aVar3.g == 4) {
                    if (aVar3.h <= videoChooseFragment.m) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) videoChooseFragment.getActivity(), videoChooseFragment.d()).a();
                    } else if (aVar3.h <= 600000) {
                        String str = aVar3.f56315e;
                        if (PatchProxy.isSupport(new Object[]{str, aVar3}, videoChooseFragment, VideoChooseFragment.f55208a, false, 58553, new Class[]{String.class, a.class}, Void.TYPE)) {
                            Object[] objArr2 = {str, aVar3};
                            Object[] objArr3 = objArr2;
                            VideoChooseFragment videoChooseFragment3 = videoChooseFragment;
                            PatchProxy.accessDispatch(objArr3, videoChooseFragment3, VideoChooseFragment.f55208a, false, 58553, new Class[]{String.class, a.class}, Void.TYPE);
                        } else if (videoChooseFragment.getActivity() != null) {
                            if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoLegalCheckInLocal)) {
                                aVar2 = new d(videoChooseFragment.getActivity());
                            } else {
                                aVar2 = new a(videoChooseFragment.getActivity());
                            }
                            aVar2.a(aVar, videoChooseFragment.m, -1, new l(videoChooseFragment, str), new m(videoChooseFragment));
                        }
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) videoChooseFragment.getActivity(), (int) C0906R.string.drv).a();
                    }
                    q.a(videoChooseFragment.getContext(), "upload", "choose_content", 0, 0, c.a().a("is_photo", PushConstants.PUSH_TYPE_NOTIFY).b());
                }
            } else if (!VideoChooseFragment.this.l) {
                VideoChooseFragment.this.l = true;
                VideoChooseFragment videoChooseFragment4 = VideoChooseFragment.this;
                if (PatchProxy.isSupport(new Object[]{view2, aVar3}, videoChooseFragment4, VideoChooseFragment.f55208a, false, 58554, new Class[]{View.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                    VideoChooseFragment videoChooseFragment5 = videoChooseFragment4;
                    PatchProxy.accessDispatch(new Object[]{view2, aVar3}, videoChooseFragment5, VideoChooseFragment.f55208a, false, 58554, new Class[]{View.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
                } else {
                    String str2 = aVar3.f56315e;
                    if (videoChooseFragment4.getActivity() != null) {
                        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoLegalCheckInLocal)) {
                            wVar = new d(videoChooseFragment4.getActivity());
                        } else {
                            wVar = new a(videoChooseFragment4.getActivity());
                        }
                        wVar.a(aVar, 0, -1, new n(videoChooseFragment4, view2, str2), new o(videoChooseFragment4));
                    }
                }
            }
        }
    };
    private boolean r;
    private int s;
    private int t;
    private int u;
    private d.b v = new d.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55220a;

        public final void a(boolean z, int i, List<com.ss.android.ugc.aweme.music.b.a.a> list) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), list}, this, f55220a, false, 58579, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), list}, this, f55220a, false, 58579, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE);
            } else if (VideoChooseFragment.this.isViewValid() && !VideoChooseFragment.this.p) {
                VideoChooseFragment.this.f55210c.setVisibility(8);
                if (z) {
                    VideoChooseFragment.this.c();
                }
            }
        }
    };

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f55208a, false, 58555, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f55208a, false, 58555, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.port.in.a.f61121d.a((Context) getActivity(), (com.ss.android.ugc.aweme.shortvideo.c) getArguments().getSerializable("challenge"));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55208a, false, 58560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55208a, false, 58560, new Class[0], Void.TYPE);
            return;
        }
        if (this.f55213f == null && getActivity() != null) {
            d.a(getActivity().getApplicationContext());
            this.f55213f = d.a();
        }
        if (Lists.isEmpty(this.f55213f.a(4))) {
            this.f55210c.setVisibility(0);
            this.f55213f.a(4, false);
        }
        if (this.f55212e == null) {
            MediaAdapter mediaAdapter = new MediaAdapter(getActivity(), this, this.s, 1.0d, 1.5f, 0);
            this.f55212e = mediaAdapter;
            this.n = new HeaderAndFooterWrapper(this.f55212e);
            this.n.a(x.a(getActivity(), 96));
        }
        this.f55212e.k = this.u;
        this.f55212e.j = this.t;
        this.f55212e.l = false;
        this.f55212e.s = this.k;
        AnonymousClass2 r0 = new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55216a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f55216a, false, 58577, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f55216a, false, 58577, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                VideoChooseFragment.this.f55212e.g = !VideoChooseFragment.this.f55212e.g;
                if (VideoChooseFragment.this.f55212e.g) {
                    VideoChooseFragment.this.i.setVisibility(8);
                    VideoChooseFragment.this.h.setVisibility(0);
                    VideoChooseFragment.this.j.setVisibility(8);
                } else {
                    VideoChooseFragment.this.i.setVisibility(0);
                    VideoChooseFragment.this.h.setVisibility(8);
                    VideoChooseFragment.this.j.setVisibility(0);
                }
                MediaAdapter mediaAdapter = VideoChooseFragment.this.f55212e;
                if (PatchProxy.isSupport(new Object[0], mediaAdapter, MediaAdapter.f55143a, false, 58503, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], mediaAdapter, MediaAdapter.f55143a, false, 58503, new Class[0], Void.TYPE);
                } else {
                    mediaAdapter.a(mediaAdapter.f55145c.size());
                    mediaAdapter.n.e();
                    if (!Lists.isEmpty(mediaAdapter.m)) {
                        mediaAdapter.m.clear();
                        if (mediaAdapter.s != null) {
                            mediaAdapter.s.a(mediaAdapter.m);
                        }
                    }
                }
                VideoChooseFragment.this.n.notifyDataSetChanged();
            }
        };
        this.g.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55218a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f55218a, false, 58578, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f55218a, false, 58578, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
            }
        });
        this.h.setOnClickListener(r0);
        this.i.setOnClickListener(r0);
        this.j.setOnClickListener(r0);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f55208a, false, 58562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55208a, false, 58562, new Class[0], Void.TYPE);
        } else if (!this.p) {
            c();
        }
    }

    public String d() {
        if (PatchProxy.isSupport(new Object[0], this, f55208a, false, 58566, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f55208a, false, 58566, new Class[0], String.class);
        }
        return getString(C0906R.string.dp6, Long.valueOf(this.m / 1000));
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f55208a, false, 58567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55208a, false, 58567, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.notifyDataSetChanged();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f55208a, false, 58564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55208a, false, 58564, new Class[0], Void.TYPE);
            return;
        }
        if (this.f55213f != null) {
            List<com.ss.android.ugc.aweme.music.b.a.a> a2 = this.f55213f.a(4);
            if (!a2.isEmpty()) {
                this.f55210c.setVisibility(0);
            }
            i.a((Callable<TResult>) new p<TResult>(a2)).a((g<TResult, TContinuationResult>) new q<TResult,TContinuationResult>(this), i.f1052b);
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f55208a, false, 58561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55208a, false, 58561, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        MediaAdapter mediaAdapter = this.f55212e;
        if (PatchProxy.isSupport(new Object[0], mediaAdapter, MediaAdapter.f55143a, false, 58487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], mediaAdapter, MediaAdapter.f55143a, false, 58487, new Class[0], Void.TYPE);
        } else {
            mediaAdapter.p.a(mediaAdapter.q);
            mediaAdapter.p.a(mediaAdapter.r);
        }
        this.f55213f.a(this.v);
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f55208a, false, 58563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55208a, false, 58563, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        MediaAdapter mediaAdapter = this.f55212e;
        if (PatchProxy.isSupport(new Object[0], mediaAdapter, MediaAdapter.f55143a, false, 58488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], mediaAdapter, MediaAdapter.f55143a, false, 58488, new Class[0], Void.TYPE);
        } else {
            mediaAdapter.p.b(mediaAdapter.q);
            mediaAdapter.p.b(mediaAdapter.r);
        }
        this.f55213f.b(this.v);
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f55208a, false, 58559, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f55208a, false, 58559, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        a();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f55208a, false, 58557, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f55208a, false, 58557, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.s = getArguments().getInt("ARG_NUM_COLUMNS", 4);
        this.t = getArguments().getInt("ARG_TEXT_COLOR", getResources().getColor(C0906R.color.a3l));
        this.u = getArguments().getInt("ARG_SHADOW_COLOR", getResources().getColor(C0906R.color.a2p));
        this.r = getArguments().getBoolean("ARG_MULTI_VIDEO_ENABLE", true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(i iVar) throws Exception {
        View view;
        List list = (List) iVar.e();
        MediaAdapter mediaAdapter = this.f55212e;
        List<com.ss.android.ugc.aweme.music.b.a.a> c2 = this.f55213f.c();
        if (PatchProxy.isSupport(new Object[]{list, c2}, mediaAdapter, MediaAdapter.f55143a, false, 58485, new Class[]{Collection.class, Collection.class}, Void.TYPE)) {
            MediaAdapter mediaAdapter2 = mediaAdapter;
            PatchProxy.accessDispatch(new Object[]{list, c2}, mediaAdapter2, MediaAdapter.f55143a, false, 58485, new Class[]{Collection.class, Collection.class}, Void.TYPE);
        } else {
            mediaAdapter.f55145c.clear();
            mediaAdapter.f55145c.addAll(list);
            mediaAdapter.a(mediaAdapter.f55145c.size());
            mediaAdapter.n.e();
        }
        this.f55211d.setAdapter(this.n);
        ((SimpleItemAnimator) this.f55211d.getItemAnimator()).setSupportsChangeAnimations(false);
        this.f55212e.h = this.q;
        int i2 = 8;
        this.f55210c.setVisibility(8);
        if (list.size() == 0) {
            this.f55209b.setText(getResources().getString(C0906R.string.bi8));
            view = this.g;
        } else {
            this.f55209b.setText(null);
            this.p = true;
            view = this.g;
            if (this.r) {
                i2 = 0;
            }
        }
        view.setVisibility(i2);
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f55208a, false, 58565, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f55208a, false, 58565, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(String str, Long l2, Integer num) {
        this.l = false;
        a(str, num.intValue(), l2.longValue(), "preview");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit b(String str, Long l2, Integer num) {
        a(str, num.intValue(), l2.longValue(), "select");
        return null;
    }

    @SuppressLint({"InflateParams"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup, bundle}, this, f55208a, false, 58558, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup, bundle}, this, f55208a, false, 58558, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.apt, null);
        this.f55211d = (RecyclerView) inflate.findViewById(C0906R.id.alh);
        this.f55211d.setLayoutManager(new WrapGridLayoutManager(null, this.s));
        this.f55211d.addItemDecoration(new GridSpacingItemDecoration(this.s, (int) UIUtils.dip2Px(getContext(), 1.0f), false));
        this.f55209b = (TextView) inflate.findViewById(C0906R.id.dcr);
        this.f55210c = (DmtLoadingLayout) inflate.findViewById(C0906R.id.dsb);
        this.g = inflate.findViewById(C0906R.id.qs);
        this.h = (ImageView) inflate.findViewById(C0906R.id.b3c);
        this.i = (ImageView) inflate.findViewById(C0906R.id.b3d);
        this.j = (TextView) inflate.findViewById(C0906R.id.dew);
        View view = this.g;
        if (!this.r) {
            i2 = 8;
        }
        view.setVisibility(i2);
        return inflate;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(String str, String str2, Long l2) {
        if (!isViewValid()) {
            return null;
        }
        n.a("aweme_movie_import_error_rate", 0, (JSONObject) null);
        b(str2, 0, l2.longValue(), "select");
        if (!this.o) {
            a(str);
        } else if (getActivity() != null) {
            Intent intent = new Intent();
            intent.putExtra("video_file", str);
            intent.putExtra("video_multi_edit", true);
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(View view, String str, String str2, Long l2) {
        if (!isViewValid()) {
            this.l = false;
            return null;
        }
        n.a("aweme_movie_import_error_rate", 0, (JSONObject) null);
        b(str2, 0, l2.longValue(), "preview");
        if (PatchProxy.isSupport(new Object[]{view, str}, this, f55208a, false, 58556, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, str}, this, f55208a, false, 58556, new Class[]{View.class, String.class}, Void.TYPE);
        } else {
            VideoPreviewActivity.a(getActivity(), view, str, (((float) UIUtils.getScreenWidth(getContext())) * 1.0f) / ((float) UIUtils.getScreenHeight(getContext())));
            this.l = false;
        }
        return null;
    }

    private void b(String str, int i2, long j2, String str2) {
        String str3 = str;
        long j3 = j2;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), new Long(j3), str4}, this, f55208a, false, 58569, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str3, Integer.valueOf(i2), new Long(j3), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f55208a, false, 58569, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j3);
            n.a("aweme_video_import_duration", jSONObject, c.a().a("status", String.valueOf(i2)).a("scene_name", str4).a("type", str3).b());
        } catch (JSONException unused) {
        }
    }

    private void a(String str, int i2, long j2, String str2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), new Long(j3), str2}, this, f55208a, false, 58568, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str, Integer.valueOf(i2), new Long(j3), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f55208a, false, 58568, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
        } else if (getActivity() == null || !isViewValid()) {
        } else {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d.a(getActivity(), i2, (int) (this.m / 1000));
            n.a("aweme_movie_import_error_rate", 1, c.a().a("errorCode", String.valueOf(i2)).b());
            b(str, 1, j2, str2);
        }
    }

    public static VideoChooseFragment a(int i2, int i3, int i4, boolean z, @Nullable com.ss.android.ugc.aweme.shortvideo.c cVar, k kVar) {
        com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar;
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0), cVar2, kVar2}, null, f55208a, true, 58549, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, com.ss.android.ugc.aweme.shortvideo.c.class, k.class}, VideoChooseFragment.class)) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z), cVar2, kVar2};
            return (VideoChooseFragment) PatchProxy.accessDispatch(objArr, null, f55208a, true, 58549, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, com.ss.android.ugc.aweme.shortvideo.c.class, k.class}, VideoChooseFragment.class);
        }
        VideoChooseFragment videoChooseFragment = new VideoChooseFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_NUM_COLUMNS", i2);
        bundle.putInt("ARG_TEXT_COLOR", i3);
        bundle.putInt("ARG_SHADOW_COLOR", i4);
        bundle.putBoolean("ARG_MULTI_VIDEO_ENABLE", z);
        bundle.putSerializable("challenge", cVar2);
        videoChooseFragment.setArguments(bundle);
        videoChooseFragment.k = kVar2;
        return videoChooseFragment;
    }
}

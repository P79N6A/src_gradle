package com.ss.android.ugc.aweme.photo.local;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter;
import com.ss.android.ugc.aweme.music.b.a;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

public class ImageChooseFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58560a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f58561b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f58562c;

    /* renamed from: d  reason: collision with root package name */
    public ProgressBar f58563d;

    /* renamed from: e  reason: collision with root package name */
    public ImageChooseAdapter f58564e;

    /* renamed from: f  reason: collision with root package name */
    public a f58565f;
    public boolean g;
    public ImageChooseAdapter.a h = new ImageChooseAdapter.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58571a;

        public final void a(View view, com.ss.android.ugc.aweme.music.b.a.a aVar) {
            if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f58571a, false, 63657, new Class[]{View.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f58571a, false, 63657, new Class[]{View.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
            } else if (aVar != null) {
                if (ImageChooseFragment.this.f58564e.i) {
                    com.ss.android.ugc.aweme.port.in.a.f61121d.a(ImageChooseFragment.this.getActivity(), view, (((float) UIUtils.getScreenWidth(ImageChooseFragment.this.getContext())) * 1.0f) / ((float) UIUtils.getScreenHeight(ImageChooseFragment.this.getContext())), "file://" + aVar.f56315e);
                } else if (ImageChooseAdapter.a(aVar)) {
                    ImageChooseFragment.this.f58565f.a(aVar);
                }
            }
        }
    };
    private int i;
    private int j;

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f58560a, false, 63652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58560a, false, 63652, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        ImageChooseAdapter imageChooseAdapter = this.f58564e;
        if (PatchProxy.isSupport(new Object[0], imageChooseAdapter, ImageChooseAdapter.f55084a, false, 58439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], imageChooseAdapter, ImageChooseAdapter.f55084a, false, 58439, new Class[0], Void.TYPE);
            return;
        }
        imageChooseAdapter.n.a(imageChooseAdapter.o);
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f58560a, false, 63653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58560a, false, 63653, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        ImageChooseAdapter imageChooseAdapter = this.f58564e;
        if (PatchProxy.isSupport(new Object[0], imageChooseAdapter, ImageChooseAdapter.f55084a, false, 58440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], imageChooseAdapter, ImageChooseAdapter.f55084a, false, 58440, new Class[0], Void.TYPE);
            return;
        }
        imageChooseAdapter.n.b(imageChooseAdapter.o);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58560a, false, 63648, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58560a, false, 63648, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.i = getArguments().getInt("ARG_NUM_COLUMNS", 4);
        this.j = getArguments().getInt("ARG_SUPPORT_FLAGS", 0);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58560a, false, 63650, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58560a, false, 63650, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        ImageChooseAdapter imageChooseAdapter = new ImageChooseAdapter(getActivity(), this.i, 1.0d, 1.5f, 0);
        this.f58564e = imageChooseAdapter;
        this.f58564e.l = this.f58565f;
        if ((this.j & 2) <= 0) {
            ImageChooseAdapter imageChooseAdapter2 = this.f58564e;
            if (PatchProxy.isSupport(new Object[0], imageChooseAdapter2, ImageChooseAdapter.f55084a, false, 58438, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], imageChooseAdapter2, ImageChooseAdapter.f55084a, false, 58438, new Class[0], Void.TYPE);
                return;
            }
            imageChooseAdapter2.i = !imageChooseAdapter2.i;
            imageChooseAdapter2.a(imageChooseAdapter2.f55088e.size());
            imageChooseAdapter2.notifyDataSetChanged();
            if (imageChooseAdapter2.h != null) {
                imageChooseAdapter2.h.mImageList.clear();
                imageChooseAdapter2.h.poiData = null;
                imageChooseAdapter2.l.a(imageChooseAdapter2.h);
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58560a, false, 63649, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58560a, false, 63649, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.s0, viewGroup2, false);
        this.f58561b = (RecyclerView) inflate.findViewById(C0906R.id.arc);
        this.f58563d = (ProgressBar) inflate.findViewById(C0906R.id.arf);
        this.f58562c = (TextView) inflate.findViewById(C0906R.id.bqx);
        this.f58561b.setLayoutManager(new WrapGridLayoutManager(null, this.i));
        this.f58561b.addItemDecoration(new GridSpacingItemDecoration(this.i, (int) UIUtils.dip2Px(getContext(), 1.0f), false));
        return inflate;
    }
}

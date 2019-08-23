package com.zhihu.matisse.internal.ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.C0906R;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.entity.d;
import com.zhihu.matisse.internal.model.AlbumMediaCollection;
import com.zhihu.matisse.internal.ui.adapter.AlbumMediaAdapter;
import com.zhihu.matisse.internal.ui.widget.MediaGridInset;

public class MediaSelectionFragment extends Fragment implements AlbumMediaCollection.a, AlbumMediaAdapter.a, AlbumMediaAdapter.b {

    /* renamed from: a  reason: collision with root package name */
    public AlbumMediaAdapter f82680a;

    /* renamed from: b  reason: collision with root package name */
    private final AlbumMediaCollection f82681b = new AlbumMediaCollection();

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f82682c;

    /* renamed from: d  reason: collision with root package name */
    private a f82683d;

    /* renamed from: e  reason: collision with root package name */
    private AlbumMediaAdapter.a f82684e;

    /* renamed from: f  reason: collision with root package name */
    private AlbumMediaAdapter.b f82685f;

    public interface a {
        com.zhihu.matisse.internal.model.a c();
    }

    public final void a() {
        this.f82680a.b(null);
    }

    public final void b() {
        if (this.f82684e != null) {
            this.f82684e.b();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f82681b.a();
    }

    public final void a(Cursor cursor) {
        this.f82680a.b(cursor);
    }

    public static MediaSelectionFragment a(com.zhihu.matisse.internal.entity.a aVar) {
        MediaSelectionFragment mediaSelectionFragment = new MediaSelectionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_album", aVar);
        mediaSelectionFragment.setArguments(bundle);
        return mediaSelectionFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.f82683d = (a) context;
            if (context instanceof AlbumMediaAdapter.a) {
                this.f82684e = (AlbumMediaAdapter.a) context;
            }
            if (context instanceof AlbumMediaAdapter.b) {
                this.f82685f = (AlbumMediaAdapter.b) context;
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must implement SelectionProvider.");
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        com.zhihu.matisse.internal.entity.a aVar = (com.zhihu.matisse.internal.entity.a) getArguments().getParcelable("extra_album");
        this.f82680a = new AlbumMediaAdapter(getContext(), this.f82683d.c(), this.f82682c);
        this.f82680a.f82690a = this;
        this.f82680a.f82691b = this;
        int i = 1;
        this.f82682c.setHasFixedSize(true);
        d a2 = d.a();
        if (a2.n > 0) {
            int round = Math.round(((float) getContext().getResources().getDisplayMetrics().widthPixels) / ((float) a2.n));
            if (round != 0) {
                i = round;
            }
        } else {
            i = a2.m;
        }
        this.f82682c.setLayoutManager(new GridLayoutManager(getContext(), i));
        this.f82682c.addItemDecoration(new MediaGridInset(i, getResources().getDimensionPixelSize(C0906R.dimen.il), false));
        this.f82682c.setAdapter(this.f82680a);
        this.f82681b.a(getActivity(), (AlbumMediaCollection.a) this);
        this.f82681b.a(aVar, a2.k);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f82682c = (RecyclerView) view.findViewById(C0906R.id.cci);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(C0906R.layout.on, viewGroup, false);
    }

    public final void a(com.zhihu.matisse.internal.entity.a aVar, c cVar, int i) {
        if (this.f82685f != null) {
            this.f82685f.a((com.zhihu.matisse.internal.entity.a) getArguments().getParcelable("extra_album"), cVar, i);
        }
    }
}

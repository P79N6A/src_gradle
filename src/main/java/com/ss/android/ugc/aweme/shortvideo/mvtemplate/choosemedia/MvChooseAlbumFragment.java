package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class MvChooseAlbumFragment extends AmeBaseFragment implements MvImageAlbumAdapter.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68518a;

    /* renamed from: b  reason: collision with root package name */
    public MvImageAlbumAdapter f68519b;

    /* renamed from: c  reason: collision with root package name */
    public d f68520c;

    /* renamed from: d  reason: collision with root package name */
    View f68521d;

    /* renamed from: e  reason: collision with root package name */
    public MvImageAlbumAdapter.b f68522e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f68523f;
    private RecyclerView g;
    private d.b h = new d.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68524a;

        public final void a(boolean z, int i, List<a> list) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), list}, this, f68524a, false, 77945, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), list}, this, f68524a, false, 77945, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE);
                return;
            }
            List<a> a2 = MvChooseAlbumFragment.this.f68520c.a(i);
            ArrayList arrayList = new ArrayList();
            for (a next : a2) {
                if (!(next == null || next.f56315e == null || TextUtils.isEmpty(next.f56315e))) {
                    String[] split = next.f56315e.split("\\.");
                    if (split.length <= 0 || !split[split.length - 1].equals("gif")) {
                        arrayList.add(MvImageChooseAdapter.b.a(next));
                    }
                }
            }
            MvChooseAlbumFragment.this.f68519b.a((List<MvImageChooseAdapter.b>) arrayList, i, false);
        }
    };
    private d.a i = new e(this);

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f68518a, false, 77941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68518a, false, 77941, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f68520c != null) {
            this.f68520c.b(this.h);
            this.f68520c.b(this.i);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f68518a, false, 77936, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f68518a, false, 77936, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f68518a, false, 77934, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f68518a, false, 77934, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2) {
        List<a> a2 = this.f68520c.a(i2);
        ArrayList arrayList = new ArrayList();
        for (a next : a2) {
            if (!(next == null || next.f56315e == null || TextUtils.isEmpty(next.f56315e))) {
                String[] split = next.f56315e.split("\\.");
                if (split.length <= 0 || !split[split.length - 1].equals("gif")) {
                    arrayList.add(MvImageChooseAdapter.b.a(next));
                }
            }
        }
        this.f68519b.a((List<MvImageChooseAdapter.b>) arrayList, i2, true);
    }

    public final void a(MvImageAlbumAdapter.a aVar, boolean z, int i2) {
        MvImageAlbumAdapter.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f68518a, false, 77939, new Class[]{MvImageAlbumAdapter.a.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(z), Integer.valueOf(i2)}, this, f68518a, false, 77939, new Class[]{MvImageAlbumAdapter.a.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f68522e != null) {
            boolean z2 = z;
            this.f68522e.a(aVar, z, i2);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f68518a, false, 77935, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f68518a, false, 77935, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.f68521d = layoutInflater.inflate(C0906R.layout.a6q, viewGroup2, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i2 = arguments.getInt("key_support_flag", -1);
        } else {
            i2 = -1;
        }
        if (PatchProxy.isSupport(new Object[0], this, f68518a, false, 77937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68518a, false, 77937, new Class[0], Void.TYPE);
        } else {
            this.g = (RecyclerView) this.f68521d.findViewById(C0906R.id.ar9);
            this.g.setLayoutManager(new WrapLinearLayoutManager(getActivity()));
            this.f68519b = new MvImageAlbumAdapter(getActivity(), this);
            this.f68520c = d.a();
            if (this.f68520c != null) {
                this.f68520c.a(this.h);
                this.f68520c.a(this.i);
            }
            this.g.setAdapter(this.f68519b);
            this.f68521d.post(new f(this));
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68518a, false, 77938, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68518a, false, 77938, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f68520c != null) {
            if (!((i2 & 1) == 0 && (i2 & 2) == 0)) {
                this.f68520c.a(3, false);
            }
            if ((i2 & 4) != 0) {
                this.f68520c.a(4, false);
            }
        }
        return this.f68521d;
    }
}

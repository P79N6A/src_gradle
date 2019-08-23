package com.ss.android.ugc.aweme.choosemusic.fragment;

import a.g;
import a.i;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.a;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.d.j;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;

public class MusicSheetFragment extends AmeBaseFragment implements a.C0022a<MusicCollectionItem>, com.ss.android.ugc.aweme.choosemusic.b.a<MusicCollectionItem>, LoadMoreRecyclerViewAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35938a;

    /* renamed from: b  reason: collision with root package name */
    protected DataCenter f35939b;

    /* renamed from: c  reason: collision with root package name */
    protected c<MusicCollectionItem> f35940c;

    /* renamed from: d  reason: collision with root package name */
    protected int f35941d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.choosemusic.d.a f35942e;

    /* renamed from: f  reason: collision with root package name */
    private a f35943f;
    private final int g = 1024;

    public final String b() {
        return "music_sheet_list";
    }

    public final String c() {
        return "refresh_status_music_sheet";
    }

    public final String d() {
        return "loadmore_status_music_sheet";
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35938a, false, 26622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35938a, false, 26622, new Class[0], Void.TYPE);
            return;
        }
        this.f35942e = new com.ss.android.ugc.aweme.choosemusic.d.a(getContext(), this.f35939b);
        this.f35942e.a(0, 1024);
    }

    public final DataCenter e() {
        if (PatchProxy.isSupport(new Object[0], this, f35938a, false, 26621, new Class[0], DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[0], this, f35938a, false, 26621, new Class[0], DataCenter.class);
        }
        this.f35939b = DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.c.a((Fragment) this), (LifecycleOwner) this);
        return this.f35939b;
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f35938a, false, 26626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35938a, false, 26626, new Class[0], Void.TYPE);
            return;
        }
        if (this.f35942e != null) {
            this.f35942e.a(0, 1024);
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f35938a, false, 26628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35938a, false, 26628, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f35938a, false, 26627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35938a, false, 26627, new Class[0], Void.TYPE);
            return;
        }
        if (this.f35940c != null) {
            this.f35940c.a();
        }
        if (!(this.f35942e == null || this.f35939b == null)) {
            com.ss.android.ugc.aweme.choosemusic.d.a aVar = this.f35942e;
            int intValue = ((Integer) ((b) this.f35939b.a(b())).a("list_cursor")).intValue();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue), 1024}, aVar, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26730, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                com.ss.android.ugc.aweme.choosemusic.d.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue), 1024}, aVar2, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26730, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            aVar.f35804b.getMusicSheet(intValue, 1024).a((g<TResult, TContinuationResult>) new j<TResult,TContinuationResult>(aVar), i.f1052b);
        }
    }

    public void onCreate(Bundle bundle) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35938a, false, 26618, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35938a, false, 26618, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f35941d = i;
    }

    public final c<MusicCollectionItem> a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35938a, false, 26623, new Class[]{View.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{view}, this, f35938a, false, 26623, new Class[]{View.class}, c.class);
        }
        com.ss.android.ugc.aweme.choosemusic.view.i iVar = new com.ss.android.ugc.aweme.choosemusic.view.i(getContext(), view, this, this, this.f35941d);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.bex)}, iVar, com.ss.android.ugc.aweme.choosemusic.view.i.g, false, 26855, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(C0906R.string.bex)};
            ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.choosemusic.view.i.g;
            com.ss.android.ugc.aweme.choosemusic.view.i iVar2 = iVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr, iVar2, changeQuickRedirect2, false, 26855, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            iVar.mTitleBar.setTitle((int) C0906R.string.bex);
        }
        this.f35940c = iVar;
        return this.f35940c;
    }

    @CallSuper
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f35938a, false, 26620, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f35938a, false, 26620, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.f35943f == null) {
            this.f35943f = new a(this);
        }
        this.f35943f.a(view, bundle);
    }

    public final /* synthetic */ void a(Object obj, int i) {
        MusicCollectionItem musicCollectionItem = (MusicCollectionItem) obj;
        if (PatchProxy.isSupport(new Object[]{musicCollectionItem, Integer.valueOf(i)}, this, f35938a, false, 26624, new Class[]{MusicCollectionItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicCollectionItem, Integer.valueOf(i)}, this, f35938a, false, 26624, new Class[]{MusicCollectionItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (musicCollectionItem != null && !TextUtils.isEmpty(musicCollectionItem.mcId)) {
            Intent intent = new Intent(getContext(), MusicDetailListActivity.class);
            intent.putExtra("music_type", 2);
            intent.putExtra("music_class_id", musicCollectionItem.mcId);
            intent.putExtra("music_class_name", musicCollectionItem.mcName);
            intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f35941d);
            intent.putExtra("music_class_enter_method", "click_category_list");
            startActivityForResult(intent, 10001);
            com.ss.android.ugc.aweme.choosemusic.f.c.a(musicCollectionItem.mcName, "click_category_list", "", "change_music_page_detail", musicCollectionItem.mcId);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f35938a, false, 26625, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f35938a, false, 26625, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            getActivity().setResult(-1, intent2);
            getActivity().finish();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35938a, false, 26619, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ou, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35938a, false, 26619, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}

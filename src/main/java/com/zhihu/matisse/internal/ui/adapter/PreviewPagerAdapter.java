package com.zhihu.matisse.internal.ui.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.ui.PreviewItemFragment;
import java.util.ArrayList;
import java.util.List;

public class PreviewPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<c> f82698a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f82699b = null;

    public interface a {
    }

    public int getCount() {
        return this.f82698a.size();
    }

    public final void a(List<c> list) {
        this.f82698a.addAll(list);
    }

    public final c a(int i) {
        return this.f82698a.get(i);
    }

    public Fragment getItem(int i) {
        PreviewItemFragment previewItemFragment = new PreviewItemFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_item", this.f82698a.get(i));
        previewItemFragment.setArguments(bundle);
        return previewItemFragment;
    }

    public PreviewPagerAdapter(FragmentManager fragmentManager, a aVar) {
        super(fragmentManager);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }
}

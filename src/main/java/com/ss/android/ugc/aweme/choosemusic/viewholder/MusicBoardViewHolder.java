package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.a.b;
import com.ss.android.ugc.aweme.choosemusic.view.f;
import com.ss.android.ugc.aweme.choosemusic.view.g;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MusicBoardViewHolder extends ItemWidgetViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f36069c;
    public static int j = ((int) UIUtils.dip2Px(k.a(), 84.0f));

    /* renamed from: d  reason: collision with root package name */
    public f f36070d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.music.adapter.f<b> f36071e;

    /* renamed from: f  reason: collision with root package name */
    public int f36072f = -1;
    public int g;
    public a h;
    MusicBoardAdapter i;
    public int k;
    public boolean l;
    private ViewPager.OnPageChangeListener m;
    @BindView(2131498197)
    TextView mTvTitleLeft;
    @BindView(2131498200)
    TextView mTvTitleRight;
    @BindView(2131498553)
    public ViewPager mVpMusicContainer;
    @BindView(2131493987)
    View mVwLine;

    class MusicBoardAdapter extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36073a;

        /* renamed from: b  reason: collision with root package name */
        public List<MusicModel> f36074b = null;

        /* renamed from: c  reason: collision with root package name */
        LinkedList<g> f36075c = new LinkedList<>();

        public int getItemPosition(@NonNull Object obj) {
            return -2;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        public int getCount() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f36073a, false, 26890, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36073a, false, 26890, new Class[0], Integer.TYPE)).intValue();
            } else if (this.f36074b == null) {
                return 0;
            } else {
                int size = this.f36074b.size() / 3;
                if (this.f36074b.size() % 3 != 0) {
                    i = 1;
                }
                return size + i;
            }
        }

        MusicBoardAdapter(List<MusicModel> list) {
        }

        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f36073a, false, 26888, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f36073a, false, 26888, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
            }
            g poll = this.f36075c.poll();
            if (poll == null) {
                poll = new g(viewGroup.getContext(), MusicBoardViewHolder.this.k);
            }
            poll.a(MusicBoardViewHolder.this.f36070d, MusicBoardViewHolder.this.f36071e);
            poll.a(this.f36074b, i * 3, MusicBoardViewHolder.this.f36072f, MusicBoardViewHolder.this.g, MusicBoardViewHolder.this.h, MusicBoardViewHolder.this.l);
            viewGroup2.addView(poll);
            return poll;
        }

        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f36073a, false, 26889, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f36073a, false, 26889, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            viewGroup2.removeView((View) obj);
            this.f36075c.offer((g) obj);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36069c, false, 26884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36069c, false, 26884, new Class[0], Void.TYPE);
            return;
        }
        this.mVwLine.setVisibility(0);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36069c, false, 26885, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36069c, false, 26885, new Class[0], Void.TYPE);
            return;
        }
        this.mVwLine.setVisibility(4);
    }

    public final void a(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f36069c, false, 26879, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f36069c, false, 26879, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        if (!(this.f36071e == null || this.mVpMusicContainer == null)) {
            this.mVpMusicContainer.removeOnPageChangeListener(this.m);
        }
        this.m = onPageChangeListener;
    }

    public final void a(com.ss.android.ugc.aweme.choosemusic.a.a aVar) {
        boolean z;
        MusicModel.CollectionType collectionType;
        com.ss.android.ugc.aweme.choosemusic.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f36069c, false, 26880, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f36069c, false, 26880, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.a.class}, Void.TYPE);
            return;
        }
        int i2 = 0;
        while (i2 < this.mVpMusicContainer.getChildCount()) {
            g gVar = (g) this.mVpMusicContainer.getChildAt(i2);
            if (gVar != null) {
                ArrayList musicItemViews = gVar.getMusicItemViews();
                if (musicItemViews != null && aVar2 != null) {
                    Iterator it2 = musicItemViews.iterator();
                    while (it2.hasNext()) {
                        MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) it2.next();
                        MusicModel musicModel = aVar2.f35741e;
                        if (PatchProxy.isSupport(new Object[]{musicItemViewHolder, musicModel}, this, f36069c, false, 26881, new Class[]{MusicItemViewHolder.class, MusicModel.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{musicItemViewHolder, musicModel}, this, f36069c, false, 26881, new Class[]{MusicItemViewHolder.class, MusicModel.class}, Boolean.TYPE)).booleanValue();
                            continue;
                        } else if (musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || musicItemViewHolder.f36102d == null || !musicModel.getMusicId().equals(musicItemViewHolder.f36102d.getMusicId())) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            MusicModel musicModel2 = musicItemViewHolder.f36102d;
                            if (aVar2.f35740d == 1) {
                                collectionType = MusicModel.CollectionType.COLLECTED;
                            } else {
                                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                            }
                            musicModel2.setCollectionType(collectionType);
                            musicItemViewHolder.c();
                            return;
                        }
                    }
                    i2++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void a(f fVar, com.ss.android.ugc.aweme.music.adapter.f<b> fVar2) {
        this.f36070d = fVar;
        this.f36071e = fVar2;
    }

    public MusicBoardViewHolder(View view, int i2) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.i = new MusicBoardAdapter(null);
        this.mVpMusicContainer.setAdapter(this.i);
        this.k = i2;
        this.mTvTitleRight.setOnClickListener(new a(this));
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36069c, false, 26882, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36069c, false, 26882, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f36072f = i3;
        if (i2 >= 0) {
            int i4 = 0;
            while (i4 < this.mVpMusicContainer.getChildCount()) {
                g gVar = (g) this.mVpMusicContainer.getChildAt(i4);
                if (gVar != null) {
                    ArrayList musicItemViews = gVar.getMusicItemViews();
                    if (musicItemViews != null) {
                        Iterator it2 = musicItemViews.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) it2.next();
                            if (musicItemViewHolder.f36103e == i2) {
                                musicItemViewHolder.a(false);
                                break;
                            }
                        }
                        i4++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void a(int i2, int i3, boolean[] zArr, boolean[] zArr2) {
        boolean[] zArr3 = zArr2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), zArr, zArr3}, this, f36069c, false, 26878, new Class[]{Integer.TYPE, Integer.TYPE, boolean[].class, boolean[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), zArr, zArr3}, this, f36069c, false, 26878, new Class[]{Integer.TYPE, Integer.TYPE, boolean[].class, boolean[].class}, Void.TYPE);
            return;
        }
        for (int i4 = 0; i4 < zArr3.length; i4++) {
            if (this.mVpMusicContainer.getTop() + (j * i4) > i3) {
                int i5 = i2;
            } else if (this.mVpMusicContainer.getTop() + ((i4 + 1) * j) >= i2) {
                if (!zArr[i4]) {
                    zArr[i4] = true;
                    zArr3[i4] = true;
                }
            }
            zArr[i4] = false;
            zArr3[i4] = false;
        }
    }

    public final void a(MusicCollectionItem musicCollectionItem, List<MusicModel> list, int i2, int i3, int i4, a aVar, boolean z) {
        MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
        List<MusicModel> list2 = list;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{musicCollectionItem2, list2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), aVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36069c, false, 26886, new Class[]{MusicCollectionItem.class, List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicCollectionItem2, list2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), aVar2, Byte.valueOf(z)}, this, f36069c, false, 26886, new Class[]{MusicCollectionItem.class, List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mTvTitleLeft.setText(musicCollectionItem2.mcName);
        if (list2 != null) {
            this.mVpMusicContainer.getLayoutParams().height = j * Math.min(3, list.size());
        }
        this.l = z;
        this.g = i4;
        this.f36072f = i3;
        this.i.f36074b = list2;
        this.i.notifyDataSetChanged();
        this.mVpMusicContainer.setCurrentItem(i2);
        this.mVpMusicContainer.addOnPageChangeListener(this.m);
        this.h = aVar2;
    }
}

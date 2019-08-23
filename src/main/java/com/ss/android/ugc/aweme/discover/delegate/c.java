package com.ss.android.ugc.aweme.discover.delegate;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.adapter.AnimatedListAdapter;
import com.ss.android.ugc.aweme.discover.adapter.CategoryViewHolder;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.List;

public final class c extends a<List<DiscoverItemData>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42270a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42271b = true;

    public final void b(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42270a, false, 36188, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42270a, false, 36188, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ((CategoryViewHolder) viewHolder).c();
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42270a, false, 36190, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new CategoryViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ti, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42270a, false, 36190, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public final void a(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42270a, false, 36187, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42270a, false, 36187, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        if (this.f42271b) {
            ((CategoryViewHolder) viewHolder).b();
        }
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42270a, false, 36189, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42270a, false, 36189, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        DiscoverItemData discoverItemData = (DiscoverItemData) list.get(i);
        if (discoverItemData.getType() == 5) {
            return discoverItemData.getCategoryOrAd().isCategory();
        }
        return false;
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        int i2 = i;
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42270a, false, 36191, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            Object[] objArr = {list2, Integer.valueOf(i), viewHolder, list};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f42270a, false, 36191, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        CategoryOrAd categoryOrAd = ((DiscoverItemData) list2.get(i2)).getCategoryOrAd();
        int b2 = com.ss.android.ugc.aweme.commercialize.utils.c.b(list2);
        CategoryViewHolder categoryViewHolder = (CategoryViewHolder) viewHolder;
        Category category = categoryOrAd.category;
        int i3 = i2 - b2;
        if (PatchProxy.isSupport(new Object[]{category, Integer.valueOf(i3)}, categoryViewHolder, CategoryViewHolder.f41566a, false, 35529, new Class[]{Category.class, Integer.TYPE}, Void.TYPE)) {
            CategoryViewHolder categoryViewHolder2 = categoryViewHolder;
            PatchProxy.accessDispatch(new Object[]{category, Integer.valueOf(i3)}, categoryViewHolder2, CategoryViewHolder.f41566a, false, 35529, new Class[]{Category.class, Integer.TYPE}, Void.TYPE);
        } else if (category != null) {
            if (CategoryViewHolder.f41567b == category) {
                if (categoryViewHolder.h == null) {
                    categoryViewHolder.h = categoryViewHolder.mViewStubPlaceHolder.inflate();
                }
                v.a(categoryViewHolder.h, 0);
                v.a(categoryViewHolder.mRoot, 8);
            } else {
                categoryViewHolder.f41570e = i3;
                v.a((View) categoryViewHolder.mViewStubPlaceHolder, 8);
                v.a(categoryViewHolder.mRoot, 0);
                if (ex.b()) {
                    v.a(categoryViewHolder.mCategoryCountView, 8);
                }
                categoryViewHolder.f41569d = category;
                Challenge challenge = categoryViewHolder.f41569d.getChallenge();
                Music music = categoryViewHolder.f41569d.getMusic();
                if (categoryViewHolder.f41571f == null) {
                    categoryViewHolder.f41571f = new AnimatedListAdapter();
                    categoryViewHolder.f41571f.i = categoryViewHolder.f41569d;
                    View view = new View(categoryViewHolder.g);
                    view.setLayoutParams(new ViewGroup.LayoutParams((int) UIUtils.dip2Px(categoryViewHolder.g, 14.0f), -1));
                    categoryViewHolder.f41571f.a(view);
                    categoryViewHolder.mListView.setAdapter(categoryViewHolder.f41571f);
                    categoryViewHolder.f41571f.g = categoryViewHolder;
                }
                if (challenge != null) {
                    categoryViewHolder.mViewDiscoverBg.setVisibility(8);
                    if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).havePGCShow() || !challenge.isPgcshow()) {
                        categoryViewHolder.mIvType.setImageResource(2130839284);
                        if (!TextUtils.isEmpty(category.getDesc())) {
                            categoryViewHolder.mTvType.setText(category.getDesc());
                        } else {
                            categoryViewHolder.mTvType.setVisibility(8);
                            ((ConstraintLayout.LayoutParams) categoryViewHolder.mTvTitle.getLayoutParams()).topMargin = (int) UIUtils.dip2Px(categoryViewHolder.g, 20.0f);
                        }
                    } else {
                        if (!(challenge.getAuthor() == null || challenge.getAuthor().getAvatarThumb() == null)) {
                            com.ss.android.ugc.aweme.base.c.b(categoryViewHolder.mIvType, challenge.getAuthor().getAvatarThumb());
                        }
                        categoryViewHolder.mTvType.setText(categoryViewHolder.g.getString(C0906R.string.bmb));
                    }
                    categoryViewHolder.mTvCount.setText(b.a(challenge.getDisplayCount()));
                    categoryViewHolder.mTvTitle.setText(challenge.getChallengeName());
                    categoryViewHolder.f41571f.k = challenge.getCid();
                    categoryViewHolder.f41571f.j = 2;
                    if (categoryViewHolder.f41569d.isAd()) {
                        categoryViewHolder.f41571f.i = category;
                    }
                } else if (music != null) {
                    categoryViewHolder.mIvType.setImageResource(2130838883);
                    categoryViewHolder.mViewDiscoverBg.setVisibility(8);
                    categoryViewHolder.mTvCount.setText(b.a((long) music.getUserCount()));
                    categoryViewHolder.mTvTitle.setText(music.getMusicName());
                    if (!TextUtils.isEmpty(category.getDesc())) {
                        categoryViewHolder.mTvType.setText(category.getDesc());
                    } else {
                        categoryViewHolder.mTvType.setVisibility(8);
                        ((ConstraintLayout.LayoutParams) categoryViewHolder.mTvTitle.getLayoutParams()).topMargin = (int) UIUtils.dip2Px(categoryViewHolder.g, 20.0f);
                    }
                    categoryViewHolder.f41571f.k = String.valueOf(music.getId());
                    categoryViewHolder.f41571f.j = 1;
                }
                categoryViewHolder.f41571f.setData(categoryViewHolder.f41569d.getItems());
                try {
                    categoryViewHolder.f41568c.scrollToPositionWithOffset(0, 0);
                } catch (Exception unused) {
                }
            }
        }
        boolean z = this.f42271b;
        if (categoryViewHolder.f41571f != null) {
            categoryViewHolder.f41571f.l = z;
        }
    }
}

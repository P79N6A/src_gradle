package com.ss.android.ugc.aweme.discover.adapter;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver;
import com.ss.android.ugc.aweme.discover.mob.a.b;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.discover.model.CategoryCoverStruct;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.setting.f;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;

public class CategoryNewViewHolder extends BaseCategoryNewViewHolder implements RecyclerViewVisibilityObserver.d {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f41561b;

    /* renamed from: c  reason: collision with root package name */
    public AnimatedImageView f41562c;

    /* renamed from: d  reason: collision with root package name */
    DmtTextView f41563d;

    /* renamed from: e  reason: collision with root package name */
    public Category f41564e;

    /* renamed from: f  reason: collision with root package name */
    public int f41565f;

    /* access modifiers changed from: package-private */
    public void a(Word word) {
        Word word2 = word;
        if (PatchProxy.isSupport(new Object[]{word2}, this, f41561b, false, 35519, new Class[]{Word.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{word2}, this, f41561b, false, 35519, new Class[]{Word.class}, Void.TYPE);
        } else if (word2 != null) {
            new b().a(word2).e();
        }
    }

    private boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f41561b, false, 35521, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41561b, false, 35521, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a.a() && c.a()) {
            return false;
        } else {
            if (com.ss.android.ugc.aweme.framework.d.a.a(this.itemView.getContext()) && f.a(this.itemView.getContext())) {
                z = true;
            }
            return z;
        }
    }

    private void a(CategoryCoverStruct categoryCoverStruct) {
        if (PatchProxy.isSupport(new Object[]{categoryCoverStruct}, this, f41561b, false, 35523, new Class[]{CategoryCoverStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{categoryCoverStruct}, this, f41561b, false, 35523, new Class[]{CategoryCoverStruct.class}, Void.TYPE);
        } else if (!a() || !a(categoryCoverStruct.getDynamicCover())) {
            com.ss.android.ugc.aweme.base.c.b(this.f41562c, categoryCoverStruct.getCover());
        } else {
            this.f41562c.a(categoryCoverStruct.getDynamicCover());
        }
    }

    private boolean a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f41561b, false, 35522, new Class[]{UrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, this, f41561b, false, 35522, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        } else {
            for (String isEmpty : urlModel.getUrlList()) {
                if (!TextUtils.isEmpty(isEmpty)) {
                    return true;
                }
            }
            return false;
        }
    }

    public CategoryNewViewHolder(View view, RecyclerView recyclerView) {
        super(view, recyclerView);
        this.f41562c = (AnimatedImageView) view.findViewById(C0906R.id.b08);
        this.f41563d = (DmtTextView) view.findViewById(C0906R.id.dkk);
    }

    @SuppressLint({"SetTextI18n"})
    public final void a(Category category, int i) {
        if (PatchProxy.isSupport(new Object[]{category, Integer.valueOf(i)}, this, f41561b, false, 35516, new Class[]{Category.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{category, Integer.valueOf(i)}, this, f41561b, false, 35516, new Class[]{Category.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(category, i);
        this.f41564e = category;
        if (category.isChallenge()) {
            Challenge challenge = category.getChallenge();
            DmtTextView dmtTextView = this.f41563d;
            dmtTextView.setText("#" + challenge.getChallengeName());
            a(challenge.getCategoryCover());
            this.itemView.setOnClickListener(new b(this, challenge, category, i));
            return;
        }
        if (category.isMusic()) {
            Music music = category.getMusic();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append("*");
            spannableStringBuilder.setSpan(new com.ss.android.ugc.aweme.commercialize.ad.b(this.itemView.getContext(), 2130838884), 0, 1, 17);
            this.f41563d.setText(music.getMusicName());
            spannableStringBuilder.append(music.getMusicName());
            this.f41563d.setText(spannableStringBuilder);
            a(music.getCategoryCover());
            this.itemView.setOnClickListener(new c(this, music, category));
        }
    }

    public final void a(int i, @Nullable Object obj, @Nullable RecyclerView.ViewHolder viewHolder, @Nullable View view, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj, viewHolder, view, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f41561b, false, 35525, new Class[]{Integer.TYPE, Object.class, RecyclerView.ViewHolder.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj, viewHolder, view, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f41561b, false, 35525, new Class[]{Integer.TYPE, Object.class, RecyclerView.ViewHolder.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 0 && i3 == 1 && this.f41564e != null && this.f41564e.isChallengeAd()) {
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf((i + 1) - this.f41565f));
            d.a().a("list_ad").b("show").a(Long.valueOf(this.f41564e.getCreativeId())).g(this.f41564e.getLogExtra()).a((Object) hashMap).a(this.itemView.getContext());
        }
    }
}

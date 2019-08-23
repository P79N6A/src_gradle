package com.ss.android.ugc.aweme.discover.model;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public final class CategoryOrAd implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 42;
    public final CategoryListAdInfo ad;
    public final Category category;

    public final boolean isAd() {
        if (this.ad != null) {
            return true;
        }
        return false;
    }

    public final boolean isCategory() {
        if (this.category != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37007, new Class[0], Integer.TYPE)) {
            return super.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37007, new Class[0], Integer.TYPE)).intValue();
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37008, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37008, new Class[0], String.class);
        } else if (isAd()) {
            return String.format("CategoryOrAd[Ad %d]", new Object[]{this.ad.getAdId()});
        } else if (this.category.getChallenge() != null) {
            return String.format("CategoryOrAd[Category.challenge %s]", new Object[]{this.category.getChallenge().getDesc()});
        } else if (this.category.getMusic() != null) {
            return String.format("CategoryOrAd[Category.music %s]", new Object[]{this.category.getMusic().getAlbum()});
        } else if (this.category.getItems() == null) {
            return "CategoryOrAd[Category.unknown]";
        } else {
            return String.format("CategoryOrAd[Category.items %d]", new Object[]{Integer.valueOf(this.category.getItems().size())});
        }
    }

    public CategoryOrAd(Category category2) {
        this.category = category2;
    }

    public CategoryOrAd(CategoryListAdInfo categoryListAdInfo) {
        this.ad = categoryListAdInfo;
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37004, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37004, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (!(obj instanceof CategoryOrAd)) {
            return false;
        } else {
            CategoryOrAd categoryOrAd = (CategoryOrAd) obj;
            if (!isCategory() || !categoryOrAd.isCategory()) {
                if (isAd() && categoryOrAd.isAd()) {
                    return equals(this.ad, categoryOrAd.ad);
                }
            } else if (this.category.getChallenge() != null && categoryOrAd.category.getChallenge() != null) {
                return this.category.getChallenge().getCid().equals(categoryOrAd.category.getChallenge().getCid());
            } else {
                if (!(this.category.getMusic() == null || categoryOrAd.category.getMusic() == null)) {
                    return this.category.getMusic().equals(categoryOrAd.category.getMusic());
                }
            }
            return false;
        }
    }

    private boolean equals(CategoryListAdInfo categoryListAdInfo, CategoryListAdInfo categoryListAdInfo2) {
        CategoryListAdInfo categoryListAdInfo3 = categoryListAdInfo;
        CategoryListAdInfo categoryListAdInfo4 = categoryListAdInfo2;
        if (PatchProxy.isSupport(new Object[]{categoryListAdInfo3, categoryListAdInfo4}, this, changeQuickRedirect, false, 37005, new Class[]{CategoryListAdInfo.class, CategoryListAdInfo.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{categoryListAdInfo3, categoryListAdInfo4}, this, changeQuickRedirect, false, 37005, new Class[]{CategoryListAdInfo.class, CategoryListAdInfo.class}, Boolean.TYPE)).booleanValue();
        } else if (categoryListAdInfo3 == categoryListAdInfo4) {
            return true;
        } else {
            if (categoryListAdInfo3 == null || categoryListAdInfo4 == null) {
                return false;
            }
            return equals(categoryListAdInfo.getAdId(), categoryListAdInfo2.getAdId());
        }
    }

    private boolean equals(Long l, Long l2) {
        if (PatchProxy.isSupport(new Object[]{l, l2}, this, changeQuickRedirect, false, 37006, new Class[]{Long.class, Long.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{l, l2}, this, changeQuickRedirect, false, 37006, new Class[]{Long.class, Long.class}, Boolean.TYPE)).booleanValue();
        } else if (l != null) {
            return l.equals(l2);
        } else {
            if (l2 == null) {
                return true;
            }
            return false;
        }
    }
}

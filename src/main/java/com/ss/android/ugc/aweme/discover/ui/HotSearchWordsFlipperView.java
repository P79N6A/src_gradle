package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.AdDefaultSearchStruct;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class HotSearchWordsFlipperView extends ViewFlipper implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42922a;

    /* renamed from: b  reason: collision with root package name */
    List<ItemUnion> f42923b;

    /* renamed from: c  reason: collision with root package name */
    int f42924c;

    /* renamed from: d  reason: collision with root package name */
    int f42925d;

    /* renamed from: e  reason: collision with root package name */
    private a f42926e;

    public static class ItemUnion {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42927a;

        /* renamed from: b  reason: collision with root package name */
        public final HotSearchItem f42928b;

        /* renamed from: c  reason: collision with root package name */
        public final AdDefaultSearchStruct f42929c;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public final int a() {
            if (this.f42929c != null) {
                return 2;
            }
            return 1;
        }

        public final String b() {
            if (PatchProxy.isSupport(new Object[0], this, f42927a, false, 37686, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f42927a, false, 37686, new Class[0], String.class);
            } else if (this.f42929c != null) {
                return this.f42929c.getDefaultWord();
            } else {
                return this.f42928b.getWord();
            }
        }

        public ItemUnion(@NonNull AdDefaultSearchStruct adDefaultSearchStruct) {
            this.f42929c = adDefaultSearchStruct;
        }

        public ItemUnion(@NonNull HotSearchItem hotSearchItem) {
            this.f42928b = hotSearchItem;
        }
    }

    public interface a {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42922a, false, 37673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42922a, false, 37673, new Class[0], Void.TYPE);
            return;
        }
        setVisibility(0);
        if (!isFlipping()) {
            showNext();
            startFlipping();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42922a, false, 37674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42922a, false, 37674, new Class[0], Void.TYPE);
            return;
        }
        if (isFlipping()) {
            stopFlipping();
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f42922a, false, 37675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42922a, false, 37675, new Class[0], Void.TYPE);
            return;
        }
        b();
        setVisibility(8);
    }

    public String getCurrentDisplayedWord() {
        if (PatchProxy.isSupport(new Object[0], this, f42922a, false, 37676, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f42922a, false, 37676, new Class[0], String.class);
        }
        ItemUnion currentItem = getCurrentItem();
        if (currentItem != null) {
            return currentItem.b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f42922a, false, 37682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42922a, false, 37682, new Class[0], Void.TYPE);
            return;
        }
        ItemUnion currentItem = getCurrentItem();
        if (currentItem != null && currentItem.a() == 2) {
            g.a((g.a) new ae(this, currentItem), currentItem.f42929c.getAdData().getTrackUrlList(), true);
            d.a().a("result_ad").b("hot_search_keyword_show").d("default_search_keyword").g(currentItem.f42929c.getAdData().getLogExtra()).a(currentItem.f42929c.getAdData().getCreativeId()).a(getContext());
        }
    }

    public ItemUnion getCurrentItem() {
        if (PatchProxy.isSupport(new Object[0], this, f42922a, false, 37678, new Class[0], ItemUnion.class)) {
            return (ItemUnion) PatchProxy.accessDispatch(new Object[0], this, f42922a, false, 37678, new Class[0], ItemUnion.class);
        }
        int displayedChild = getDisplayedChild();
        if (displayedChild < 0 || displayedChild >= this.f42923b.size()) {
            return null;
        }
        return this.f42923b.get(displayedChild);
    }

    public String getCurrentOperatedWord() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f42922a, false, 37677, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f42922a, false, 37677, new Class[0], String.class);
        }
        ItemUnion currentItem = getCurrentItem();
        if (currentItem != null) {
            if (PatchProxy.isSupport(new Object[0], currentItem, ItemUnion.f42927a, false, 37687, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], currentItem, ItemUnion.f42927a, false, 37687, new Class[0], String.class);
            } else if (currentItem.f42929c == null) {
                return currentItem.f42928b.getRealSearchWord();
            } else {
                str = currentItem.f42929c.getSearchWord();
            }
        } else {
            str = null;
        }
        return str;
    }

    public void setOnItemChangeListener(a aVar) {
        this.f42926e = aVar;
    }

    public HotSearchWordsFlipperView(Context context) {
        this(context, null);
    }

    public void setDisplayedChild(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42922a, false, 37681, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42922a, false, 37681, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int displayedChild = getDisplayedChild();
        super.setDisplayedChild(i);
        if (displayedChild != getDisplayedChild()) {
            if (PatchProxy.isSupport(new Object[0], this, f42922a, false, 37683, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42922a, false, 37683, new Class[0], Void.TYPE);
                return;
            }
            if (this.f42926e != null) {
                getCurrentItem();
                getDisplayedChild();
            }
            c();
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f42922a, false, 37672, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f42922a, false, 37672, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            postDelayed(new ad(this), 100);
        }
    }

    public HotSearchWordsFlipperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f42922a, false, 37671, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f42922a, false, 37671, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HotSearchWordsFlipperView);
        int i = obtainStyledAttributes.getInt(0, 2) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        this.f42924c = obtainStyledAttributes.getColor(2, 15);
        this.f42925d = obtainStyledAttributes.getColor(1, getResources().getColor(C0906R.color.a6n));
        this.f42923b = new ArrayList();
        int intValue = ((Integer) SharePrefCache.inst().getHotSearchWordsShowInterval().c()).intValue() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        setFlipInterval(intValue > 0 ? intValue : i);
        setInAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.ca));
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.cb));
        obtainStyledAttributes.recycle();
    }
}

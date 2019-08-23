package com.ss.android.ugc.aweme.commerce.card;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.commerce.card.CommerceCardViewPagerAdapter;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public class CommerceGoodHalfCardContainer extends RelativeLayout implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36809a = null;
    private static final String l = "CommerceGoodHalfCardContainer";

    /* renamed from: b  reason: collision with root package name */
    public View f36810b;

    /* renamed from: c  reason: collision with root package name */
    public ViewPager f36811c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView f36812d;

    /* renamed from: e  reason: collision with root package name */
    public Disposable f36813e;

    /* renamed from: f  reason: collision with root package name */
    public List<h> f36814f;
    public boolean g;
    public boolean h;
    public JSONObject i;
    public boolean j;
    public boolean k;
    private CommerceCardViewPagerAdapter.a m;
    private CommerceCardViewPagerAdapter.b n;
    private CommerceCardViewPagerAdapter.c o;
    private a p;
    private List<Boolean> q;
    private List<Boolean> r;
    private CommerceCardIndicatorAdapter s;

    public interface a {
        void a(h hVar);
    }

    public void onPageScrollStateChanged(int i2) {
    }

    public void onPageScrolled(int i2, float f2, int i3) {
    }

    public void setOnClickBuyListener(CommerceCardViewPagerAdapter.a aVar) {
        this.m = aVar;
    }

    public void setOnClickCloseListener(CommerceCardViewPagerAdapter.b bVar) {
        this.n = bVar;
    }

    public void setOnClickGoodDetailListener(CommerceCardViewPagerAdapter.c cVar) {
        this.o = cVar;
    }

    public void setOnPageSelectedListener(a aVar) {
        this.p = aVar;
    }

    public CommerceGoodHalfCardContainer(Context context) {
        this(context, null);
    }

    public void setInCleanMode(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36809a, false, 28033, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36809a, false, 28033, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j = z;
        if (z || !this.h) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public void onPageSelected(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36809a, false, 28028, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36809a, false, 28028, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.q != null && this.q.size() != 1 && this.q.size() > i2 && this.s != null) {
            for (int i3 = 0; i3 < this.q.size(); i3++) {
                this.q.set(i3, Boolean.FALSE);
            }
            this.q.set(i2, Boolean.TRUE);
            this.s.notifyDataSetChanged();
            if (!(this.r == null || this.r.size() == 1 || this.r.size() <= i2 || this.p == null || this.f36814f == null || this.f36814f.size() <= i2 || this.r.get(i2).booleanValue())) {
                this.p.a(this.f36814f.get(i2));
                this.r.set(i2, Boolean.TRUE);
            }
        }
    }

    public void setCommerceCard(List<h> list) {
        List<h> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f36809a, false, 28027, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f36809a, false, 28027, new Class[]{List.class}, Void.TYPE);
        } else if (!j.a((Collection<T>) list) && this.f36811c != null && this.f36812d != null && this.f36810b != null) {
            this.g = true;
            if (!TextUtils.isEmpty(list.get(0).getOriginUserId())) {
                list2 = new ArrayList<>();
                list2.add(list.get(0));
            } else {
                list2 = list;
            }
            CommerceCardViewPagerAdapter commerceCardViewPagerAdapter = new CommerceCardViewPagerAdapter(list2, getContext());
            if (this.n != null) {
                commerceCardViewPagerAdapter.f36805c = this.n;
            }
            if (this.o != null) {
                commerceCardViewPagerAdapter.f36806d = this.o;
            }
            if (this.m != null) {
                commerceCardViewPagerAdapter.f36804b = this.m;
            }
            this.f36811c.setAdapter(commerceCardViewPagerAdapter);
            this.f36811c.addOnPageChangeListener(this);
            if (list2.size() > 1) {
                WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getContext());
                wrapLinearLayoutManager.setOrientation(0);
                this.f36812d.setLayoutManager(wrapLinearLayoutManager);
                this.q = new ArrayList();
                this.r = new ArrayList();
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    this.q.add(Boolean.FALSE);
                    this.r.add(Boolean.FALSE);
                }
                this.q.set(0, Boolean.TRUE);
                this.r.set(0, Boolean.TRUE);
                this.s = new CommerceCardIndicatorAdapter(getContext(), this.q);
                this.f36812d.setAdapter(this.s);
                this.f36812d.setAlpha(0.0f);
                this.f36812d.setVisibility(0);
                return;
            }
            this.f36812d.setVisibility(8);
        }
    }

    public CommerceGoodHalfCardContainer(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommerceGoodHalfCardContainer(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}

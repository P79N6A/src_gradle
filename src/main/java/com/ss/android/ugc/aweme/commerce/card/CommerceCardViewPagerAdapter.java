package com.ss.android.ugc.aweme.commerce.card;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.commerce.service.l.d;
import com.ss.android.ugc.aweme.commerce.service.l.e;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.widgets.RemoteCardHeadImageView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class CommerceCardViewPagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36803a;

    /* renamed from: b  reason: collision with root package name */
    public a f36804b;

    /* renamed from: c  reason: collision with root package name */
    public b f36805c;

    /* renamed from: d  reason: collision with root package name */
    public c f36806d;

    /* renamed from: e  reason: collision with root package name */
    float f36807e = 0.75f;

    /* renamed from: f  reason: collision with root package name */
    private List<View> f36808f = new ArrayList();

    public interface a {
        void a(h hVar);
    }

    public interface b {
        void a(h hVar);
    }

    public interface c {
        void a(h hVar);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f36803a, false, 28016, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36803a, false, 28016, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f36808f == null) {
            return 0;
        } else {
            return this.f36808f.size();
        }
    }

    private String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f36803a, false, 28019, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f36803a, false, 28019, new Class[]{Long.TYPE}, String.class);
        } else if (j2 < 10000) {
            return String.valueOf(j);
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            sb.append(decimalFormat.format(d2 / 10000.0d));
            sb.append("w");
            return sb.toString();
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f36803a, false, 28018, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f36803a, false, 28018, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        viewGroup.addView(this.f36808f.get(i));
        return this.f36808f.get(i);
    }

    CommerceCardViewPagerAdapter(List<h> list, Context context) {
        RemoteCardHeadImageView remoteCardHeadImageView;
        RemoteCardHeadImageView remoteCardHeadImageView2;
        LinearLayout linearLayout;
        int i;
        int i2;
        LinearLayout linearLayout2;
        int i3;
        DmtTextView dmtTextView;
        LinearLayout linearLayout3;
        Context context2 = context;
        LayoutInflater from = LayoutInflater.from(context);
        Iterator<h> it2 = list.iterator();
        while (it2.hasNext()) {
            h next = it2.next();
            View inflate = from.inflate(C0906R.layout.a26, null);
            RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(C0906R.id.b1k);
            DmtTextView dmtTextView2 = (DmtTextView) inflate.findViewById(C0906R.id.dgj);
            DmtTextView dmtTextView3 = (DmtTextView) inflate.findViewById(C0906R.id.dce);
            LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(C0906R.id.bh5);
            RemoteCardHeadImageView remoteCardHeadImageView3 = (RemoteCardHeadImageView) inflate.findViewById(C0906R.id.b32);
            RemoteCardHeadImageView remoteCardHeadImageView4 = (RemoteCardHeadImageView) inflate.findViewById(C0906R.id.b33);
            RemoteImageView remoteImageView2 = (RemoteImageView) inflate.findViewById(C0906R.id.b31);
            DmtTextView dmtTextView4 = (DmtTextView) inflate.findViewById(C0906R.id.de_);
            LayoutInflater layoutInflater = from;
            Iterator<h> it3 = it2;
            ImageView imageView = (ImageView) inflate.findViewById(C0906R.id.azy);
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0906R.id.qn);
            DmtTextView dmtTextView5 = (DmtTextView) inflate.findViewById(C0906R.id.dah);
            DmtTextView dmtTextView6 = (DmtTextView) inflate.findViewById(C0906R.id.daj);
            DmtTextView dmtTextView7 = (DmtTextView) inflate.findViewById(C0906R.id.dcd);
            LinearLayout linearLayout5 = (LinearLayout) inflate.findViewById(C0906R.id.bga);
            DmtTextView dmtTextView8 = (DmtTextView) inflate.findViewById(C0906R.id.dcf);
            DmtTextView dmtTextView9 = (DmtTextView) inflate.findViewById(C0906R.id.dha);
            DmtTextView dmtTextView10 = (DmtTextView) inflate.findViewById(C0906R.id.dcc);
            LinearLayout linearLayout6 = (LinearLayout) inflate.findViewById(C0906R.id.bg8);
            LinearLayout linearLayout7 = (LinearLayout) inflate.findViewById(C0906R.id.bfp);
            View view = inflate;
            if (next.isPreSaleGood()) {
                dmtTextView2.setVisibility(0);
                dmtTextView2.setText(context2.getString(C0906R.string.bq_));
            } else if (next.isAppointment()) {
                dmtTextView2.setVisibility(0);
                dmtTextView2.setText(next.getToutiao().getAppointment().getShowLabel());
            } else if (next.isSecKillGood()) {
                dmtTextView2.setVisibility(0);
                dmtTextView2.setText(context2.getString(C0906R.string.c2t));
            } else {
                dmtTextView2.setVisibility(8);
            }
            if (next.isPreSaleGood() || next.isAppointment() || next.isSecKillGood()) {
                SpannableString spannableString = new SpannableString(next.shortTitle());
                linearLayout = linearLayout7;
                LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(com.ss.android.ugc.aweme.framework.e.b.a(context2, 30.0f), 0);
                int length = spannableString.length();
                remoteCardHeadImageView2 = remoteCardHeadImageView3;
                remoteCardHeadImageView = remoteCardHeadImageView4;
                Object[] objArr = {spannableString, standard, 0, Integer.valueOf(length), 18};
                if (PatchProxy.isSupport(objArr, null, e.f36831a, true, 28024, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr2 = {spannableString, standard, 0, Integer.valueOf(length), 18};
                    Object[] objArr3 = objArr2;
                    PatchProxy.accessDispatch(objArr3, null, e.f36831a, true, 28024, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    i = 0;
                } else {
                    i = 0;
                    spannableString.setSpan(standard, 0, length, 18);
                }
                dmtTextView3.setText(spannableString);
            } else {
                dmtTextView3.setText(next.shortTitle());
                linearLayout = linearLayout7;
                remoteCardHeadImageView2 = remoteCardHeadImageView3;
                remoteCardHeadImageView = remoteCardHeadImageView4;
                i = 0;
            }
            if (j.b(next.preferredImages())) {
                com.ss.android.ugc.aweme.base.c.b(remoteImageView, next.preferredImages().get(i));
            }
            if (next.isThirdParty()) {
                dmtTextView10.setText(d.a(next.getPrice()));
            } else if (next.getToutiao() != null) {
                dmtTextView10.setText(d.a(next.getToutiao().getMinPrice()));
            } else {
                dmtTextView8.setVisibility(4);
                dmtTextView10.setVisibility(4);
            }
            if (next.hasCoupon() || !TextUtils.isEmpty(next.getFirstFullReduction())) {
                LinearLayout linearLayout8 = linearLayout6;
                if (!TextUtils.isEmpty(next.getFirstFullReduction())) {
                    DmtTextView dmtTextView11 = dmtTextView9;
                    dmtTextView11.setText(next.getFirstFullReduction());
                    linearLayout5.setVisibility(8);
                    dmtTextView11.setVisibility(0);
                } else {
                    LinearLayout linearLayout9 = linearLayout5;
                    DmtTextView dmtTextView12 = dmtTextView9;
                    if (next.hasCoupon()) {
                        e.f38011b.a((TextView) dmtTextView5, (com.ss.android.ugc.aweme.commerce.service.models.c) next);
                        linearLayout9.setVisibility(0);
                        dmtTextView12.setVisibility(8);
                    }
                }
                if (next.getSales() != 0) {
                    String format = String.format(Locale.getDefault(), context.getResources().getString(C0906R.string.bci), new Object[]{a((long) next.getSales())});
                    dmtTextView = dmtTextView6;
                    dmtTextView.setText(format);
                } else {
                    dmtTextView = dmtTextView6;
                    if (next.getVisitor() != null && next.getVisitor().getCount() > 0) {
                        i3 = 0;
                        dmtTextView.setText(String.format(Locale.getDefault(), context.getResources().getString(C0906R.string.b9e), new Object[]{a(next.getVisitor().getCount())}));
                        dmtTextView.post(new a(dmtTextView));
                        i2 = 8;
                        linearLayout4.setVisibility(8);
                        linearLayout8.setVisibility(i3);
                        dmtTextView7.setVisibility(8);
                    }
                }
                i3 = 0;
                dmtTextView.post(new a(dmtTextView));
                i2 = 8;
                linearLayout4.setVisibility(8);
                linearLayout8.setVisibility(i3);
                dmtTextView7.setVisibility(8);
            } else {
                if (next.getSales() != 0) {
                    dmtTextView7.setText(String.format(Locale.getDefault(), context.getResources().getString(C0906R.string.bci), new Object[]{a((long) next.getSales())}));
                    linearLayout4.setVisibility(8);
                    dmtTextView7.setVisibility(0);
                    linearLayout3 = linearLayout6;
                    i2 = 8;
                } else {
                    if (next.getVisitor() == null || next.getVisitor().getCount() <= 0) {
                        i2 = 8;
                        linearLayout4.setVisibility(8);
                    } else {
                        dmtTextView4.setText(String.format(Locale.getDefault(), context.getResources().getString(C0906R.string.b9e), new Object[]{a(next.getVisitor().getCount())}));
                        if (next.getVisitor().getAvatars() != null) {
                            int size = next.getVisitor().getAvatars().size();
                            if (size > 0) {
                                remoteImageView2.setVisibility(0);
                                com.ss.android.ugc.aweme.base.c.b(remoteImageView2, next.getVisitor().getAvatars().get(0));
                            }
                            if (size > 1) {
                                RemoteCardHeadImageView remoteCardHeadImageView5 = remoteCardHeadImageView;
                                remoteCardHeadImageView5.setVisibility(0);
                                remoteCardHeadImageView5.setClip(true);
                                com.ss.android.ugc.aweme.base.c.b(remoteCardHeadImageView5, next.getVisitor().getAvatars().get(1));
                            }
                            if (size > 2) {
                                RemoteCardHeadImageView remoteCardHeadImageView6 = remoteCardHeadImageView2;
                                remoteCardHeadImageView6.setVisibility(0);
                                remoteCardHeadImageView6.setClip(true);
                                com.ss.android.ugc.aweme.base.c.b(remoteCardHeadImageView6, next.getVisitor().getAvatars().get(2));
                            }
                        }
                        linearLayout4.setVisibility(0);
                        i2 = 8;
                    }
                    dmtTextView7.setVisibility(i2);
                    linearLayout3 = linearLayout6;
                }
                linearLayout3.setVisibility(i2);
            }
            if (next.isThirdParty()) {
                linearLayout2 = linearLayout;
            } else {
                linearLayout2 = linearLayout;
                i2 = 0;
            }
            linearLayout2.setVisibility(i2);
            frameLayout.setOnClickListener(new b(this, next));
            ImageView imageView2 = imageView;
            imageView2.setOnTouchListener(new c(this, imageView2, next));
            linearLayout2.setOnTouchListener(new d(this, linearLayout2, next));
            this.f36808f.add(view);
            from = layoutInflater;
            it2 = it3;
            context2 = context;
        }
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f36803a, false, 28017, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f36803a, false, 28017, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        viewGroup2.removeView(this.f36808f.get(i));
    }
}

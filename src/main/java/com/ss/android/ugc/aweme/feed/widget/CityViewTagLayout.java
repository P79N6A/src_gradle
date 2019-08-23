package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.shortvideo.ui.PressFadeFrameLayout;
import java.util.ArrayList;
import java.util.List;

public class CityViewTagLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46955a;

    /* renamed from: b  reason: collision with root package name */
    public a f46956b;

    public interface a {
        void a(NearbyCities.CityBean cityBean);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46955a, false, 43628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46955a, false, 43628, new Class[0], Void.TYPE);
            return;
        }
        setOrientation(1);
    }

    public void setListener(a aVar) {
        this.f46956b = aVar;
    }

    public CityViewTagLayout(Context context) {
        super(context);
        a();
    }

    public void setData(final List<NearbyCities.CityBean> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f46955a, false, 43629, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f46955a, false, 43629, new Class[]{List.class}, Void.TYPE);
            return;
        }
        removeAllViews();
        post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46957a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f46957a, false, 43630, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f46957a, false, 43630, new Class[0], Void.TYPE);
                    return;
                }
                ArrayList arrayList = new ArrayList(list);
                int i = 0;
                while (!arrayList.isEmpty()) {
                    LinearLayout linearLayout = new LinearLayout(CityViewTagLayout.this.getContext());
                    linearLayout.setOrientation(0);
                    int i2 = i;
                    for (int i3 = 0; i3 < 3 && !arrayList.isEmpty(); i3++) {
                        NearbyCities.CityBean cityBean = (NearbyCities.CityBean) arrayList.get(0);
                        if (TextUtils.isEmpty(cityBean.name)) {
                            arrayList.remove(cityBean);
                        } else {
                            PressFadeFrameLayout pressFadeFrameLayout = new PressFadeFrameLayout(CityViewTagLayout.this.getContext());
                            pressFadeFrameLayout.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -2));
                            DmtTextView dmtTextView = new DmtTextView(CityViewTagLayout.this.getContext());
                            dmtTextView.setText(cityBean.name);
                            dmtTextView.setTextColor(CityViewTagLayout.this.getResources().getColor(C0906R.color.a0b));
                            dmtTextView.setTextSize(13.0f);
                            dmtTextView.setGravity(17);
                            dmtTextView.setBackgroundResource(2130837862);
                            pressFadeFrameLayout.setTag(cityBean);
                            pressFadeFrameLayout.setOnClickListener(new View.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f46960a;

                                public final void onClick(View view) {
                                    if (PatchProxy.isSupport(new Object[]{view}, this, f46960a, false, 43631, new Class[]{View.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{view}, this, f46960a, false, 43631, new Class[]{View.class}, Void.TYPE);
                                        return;
                                    }
                                    ClickInstrumentation.onClick(view);
                                    if (CityViewTagLayout.this.f46956b != null) {
                                        CityViewTagLayout.this.f46956b.a((NearbyCities.CityBean) view.getTag());
                                    }
                                }
                            });
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((CityViewTagLayout.this.getMeasuredWidth() - ((int) UIUtils.dip2Px(CityViewTagLayout.this.getContext(), 10.0f))) / 3, (int) UIUtils.dip2Px(CityViewTagLayout.this.getContext(), 36.0f));
                            if (i3 == 0 || i3 == 1) {
                                layoutParams.setMargins(0, 0, (int) UIUtils.dip2Px(CityViewTagLayout.this.getContext(), 5.0f), 0);
                            }
                            dmtTextView.setLayoutParams(layoutParams);
                            pressFadeFrameLayout.addView(dmtTextView);
                            linearLayout.addView(pressFadeFrameLayout);
                            arrayList.remove(cityBean);
                            i2++;
                        }
                    }
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.setMargins(0, 0, 0, (int) UIUtils.dip2Px(CityViewTagLayout.this.getContext(), 5.0f));
                    linearLayout.setLayoutParams(layoutParams2);
                    CityViewTagLayout.this.addView(linearLayout);
                    i = i2;
                }
                if (i == 0 && CityViewTagLayout.this.getParent() != null) {
                    ((View) CityViewTagLayout.this.getParent()).setVisibility(8);
                }
            }
        });
    }

    public CityViewTagLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public CityViewTagLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}

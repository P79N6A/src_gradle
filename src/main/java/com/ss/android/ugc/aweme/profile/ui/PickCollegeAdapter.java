package com.ss.android.ugc.aweme.profile.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.utils.ed;

public class PickCollegeAdapter extends BaseAdapter<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62078a;

    /* renamed from: b  reason: collision with root package name */
    public a f62079b;

    class CollegeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public CommonItemView f62083a;

        private CollegeViewHolder(View view) {
            super(view);
            this.f62083a = (CommonItemView) view;
        }

        /* synthetic */ CollegeViewHolder(PickCollegeAdapter pickCollegeAdapter, View view, byte b2) {
            this(view);
        }
    }

    public interface a {
        void a(View view, String str);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f62078a, false, 68588, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f62078a, false, 68588, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (viewHolder instanceof CollegeViewHolder) {
            CollegeViewHolder collegeViewHolder = (CollegeViewHolder) viewHolder;
            collegeViewHolder.f62083a.setLeftText((CharSequence) this.mItems.get(i));
            collegeViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62080a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62080a, false, 68590, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62080a, false, 68590, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (PickCollegeAdapter.this.f62079b != null) {
                        PickCollegeAdapter.this.f62079b.a(view, (String) PickCollegeAdapter.this.mItems.get(i));
                    }
                }
            });
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f62078a, false, 68589, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f62078a, false, 68589, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        CommonItemView commonItemView = new CommonItemView(viewGroup.getContext());
        commonItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        commonItemView.setRightIconRes(0);
        View.OnTouchListener a2 = ed.a(0.5f, 1.0f);
        CollegeViewHolder collegeViewHolder = new CollegeViewHolder(this, commonItemView, (byte) 0);
        collegeViewHolder.itemView.setOnTouchListener(a2);
        return collegeViewHolder;
    }
}

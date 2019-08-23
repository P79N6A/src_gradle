package com.ss.android.ugc.aweme.discover.delegate;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.BaseCategoryNewViewHolder;
import com.ss.android.ugc.aweme.discover.model.SameCityModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;

public final class SameCityDelegate extends a<List<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42230a;

    public class SameCityViewHolder extends BaseCategoryNewViewHolder {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f42231b;

        /* renamed from: c  reason: collision with root package name */
        AnimatedImageView f42232c;

        public SameCityViewHolder(View view, RecyclerView recyclerView) {
            super(view, recyclerView);
            this.f42232c = (AnimatedImageView) view.findViewById(C0906R.id.b08);
        }
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42230a, false, 36215, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42230a, false, 36215, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        return new SameCityViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tl, viewGroup2, false), (RecyclerView) viewGroup2);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42230a, false, 36214, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42230a, false, 36214, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!(list.get(i) instanceof SameCityModel) || TextUtils.isEmpty(SameCityModel.sImageUrl)) {
            return false;
        } else {
            return true;
        }
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42230a, false, 36216, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42230a, false, 36216, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        SameCityViewHolder sameCityViewHolder = (SameCityViewHolder) viewHolder;
        SameCityModel sameCityModel = (SameCityModel) list2.get(i);
        if (PatchProxy.isSupport(new Object[]{sameCityModel}, sameCityViewHolder, SameCityViewHolder.f42231b, false, 36217, new Class[]{SameCityModel.class}, Void.TYPE)) {
            SameCityViewHolder sameCityViewHolder2 = sameCityViewHolder;
            PatchProxy.accessDispatch(new Object[]{sameCityModel}, sameCityViewHolder2, SameCityViewHolder.f42231b, false, 36217, new Class[]{SameCityModel.class}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) sameCityViewHolder.f42232c.getLayoutParams();
        layoutParams.height = ((UIUtils.getScreenWidth(sameCityViewHolder.f42232c.getContext()) - ((int) UIUtils.dip2Px(sameCityViewHolder.itemView.getContext(), 32.0f))) * 52) / 343;
        if (sameCityModel.isHaveBanner) {
            layoutParams.topMargin = (int) UIUtils.dip2Px(sameCityViewHolder.itemView.getContext(), 16.0f);
        }
        sameCityViewHolder.f42232c.setLayoutParams(layoutParams);
        if (sameCityModel != null) {
            c.b(sameCityViewHolder.f42232c, sameCityModel.mCover);
        }
        sameCityViewHolder.f42232c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42234a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f42234a, false, 36218, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f42234a, false, 36218, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                r.a("homepage_fresh_click", (Map) d.a().a("scene_id", 1003).a("click_method", "enter").a("enter_from", "discovery").f34114b);
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).startSameCityActivity(SameCityViewHolder.this.itemView.getContext());
            }
        });
    }
}

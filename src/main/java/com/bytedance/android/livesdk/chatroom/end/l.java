package com.bytedance.android.livesdk.chatroom.end;

import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.end.TopFansLayout;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdkapi.depend.model.live.g;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class l implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10119a;

    /* renamed from: b  reason: collision with root package name */
    private final TopFansLayout f10120b;

    /* renamed from: c  reason: collision with root package name */
    private final BaseFragment f10121c;

    l(TopFansLayout topFansLayout, BaseFragment baseFragment) {
        this.f10120b = topFansLayout;
        this.f10121c = baseFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10119a, false, 4279, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10119a, false, 4279, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        TopFansLayout topFansLayout = this.f10120b;
        List list = (List) obj;
        if (this.f10121c.b_()) {
            if (!Lists.isEmpty(list)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    g gVar = (g) it2.next();
                    if (gVar == null || gVar.f18735a <= 0) {
                        it2.remove();
                    }
                }
                if (Lists.isEmpty(list)) {
                    if (topFansLayout.f1840d != null) {
                        topFansLayout.f1840d.a();
                    }
                    return;
                }
                TypedArray obtainTypedArray = topFansLayout.getContext().getResources().obtainTypedArray(C0906R.array.ac);
                topFansLayout.f1838b.clear();
                int i = 0;
                while (i < list.size()) {
                    if (i < obtainTypedArray.length()) {
                        User user = ((g) list.get(i)).f18736b;
                        if (user != null) {
                            TopFansLayout.b bVar = new TopFansLayout.b(LayoutInflater.from(topFansLayout.getContext()).inflate(C0906R.layout.ajj, null), (byte) 0);
                            b.a((ImageView) bVar.f10092c, user.getAvatarThumb(), 2130841141);
                            if (user.getId() == TTLiveSDKContext.getHostService().k().b() || user.isFollowing() || !topFansLayout.k) {
                                bVar.f10090a.setVisibility(8);
                            } else {
                                bVar.f10090a.setVisibility(0);
                            }
                            g gVar2 = (g) list.get(i);
                            gVar2.f18737c = i + 1;
                            bVar.f10090a.setTag(C0906R.id.d7q, gVar2);
                            bVar.f10090a.setOnClickListener(topFansLayout.l);
                            bVar.f10092c.setBackgroundResource(obtainTypedArray.getResourceId(i, 0));
                            bVar.f10092c.setTag(C0906R.id.d7q, gVar2);
                            bVar.f10092c.setOnClickListener(topFansLayout.g);
                            if (gVar2.f18736b != null) {
                                bVar.f10093d.setText(gVar2.f18736b.getNickName());
                                bVar.f10094e.setText(topFansLayout.f1841e.getResources().getString(C0906R.string.cvq, new Object[]{e.a(gVar2.f18735a)}));
                            }
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                            layoutParams.weight = 1.0f;
                            bVar.f10091b.setLayoutParams(layoutParams);
                            topFansLayout.f1838b.add(bVar);
                            topFansLayout.addView(bVar.f10091b);
                            if (i != list.size() - 1) {
                                View view = new View(topFansLayout.f1841e);
                                view.setBackgroundResource(2130841018);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) UIUtils.dip2Px(topFansLayout.f1841e, 0.5f), -1);
                                layoutParams2.topMargin = (int) UIUtils.dip2Px(topFansLayout.f1841e, 20.0f);
                                layoutParams2.bottomMargin = (int) UIUtils.dip2Px(topFansLayout.f1841e, 20.0f);
                                topFansLayout.addView(view, layoutParams2);
                            }
                            if (i == 0 && list.size() != 2) {
                                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) bVar.f10092c.getLayoutParams();
                                layoutParams3.topMargin = 0;
                                layoutParams3.width = (int) UIUtils.dip2Px(topFansLayout.f1841e, 56.0f);
                                layoutParams3.height = (int) UIUtils.dip2Px(topFansLayout.f1841e, 56.0f);
                                bVar.f10093d.setTextSize(2, 14.0f);
                                ((RelativeLayout.LayoutParams) bVar.f10093d.getLayoutParams()).topMargin = (int) UIUtils.dip2Px(topFansLayout.f1841e, 24.0f);
                            }
                        }
                        i++;
                    }
                }
                if (list.size() == 3) {
                    int indexOfChild = topFansLayout.indexOfChild(topFansLayout.f1838b.get(1).f10091b);
                    topFansLayout.removeView(topFansLayout.f1838b.get(0).f10091b);
                    topFansLayout.removeView(topFansLayout.f1838b.get(1).f10091b);
                    topFansLayout.addView(topFansLayout.f1838b.get(1).f10091b, 0);
                    topFansLayout.addView(topFansLayout.f1838b.get(0).f10091b, indexOfChild);
                }
                obtainTypedArray.recycle();
                topFansLayout.postInvalidate();
                topFansLayout.a();
            } else if (topFansLayout.f1840d != null) {
                topFansLayout.f1840d.a();
            }
        }
    }
}

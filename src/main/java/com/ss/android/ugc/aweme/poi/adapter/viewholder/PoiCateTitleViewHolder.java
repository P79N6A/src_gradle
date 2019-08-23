package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.a.d;
import com.ss.android.ugc.aweme.poi.adapter.a;
import com.ss.android.ugc.aweme.poi.c;

public class PoiCateTitleViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59501a;

    /* renamed from: b  reason: collision with root package name */
    private Context f59502b;
    @BindView(2131496202)
    View mMoreArrow;
    @BindView(2131496201)
    View mMoreTxt;
    @BindView(2131496203)
    TextView mTxtTitle;

    public PoiCateTitleViewHolder(View view) {
        super(view);
        this.f59502b = view.getContext();
        ButterKnife.bind((Object) this, view);
    }

    public final void a(d dVar, c cVar, a aVar) {
        d dVar2 = dVar;
        final c cVar2 = cVar;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, cVar2, aVar2}, this, f59501a, false, 64797, new Class[]{d.class, c.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, cVar2, aVar2}, this, f59501a, false, 64797, new Class[]{d.class, c.class, a.class}, Void.TYPE);
        } else if (dVar2 != null) {
            if (dVar2.isAweme) {
                this.mTxtTitle.setText(C0906R.string.bnx);
            } else {
                this.mTxtTitle.setText(C0906R.string.bny);
            }
            if (dVar2.showMore) {
                this.mMoreTxt.setVisibility(0);
                this.mMoreArrow.setVisibility(0);
                this.mTxtTitle.setTextSize(17.0f);
                this.mTxtTitle.setTextColor(this.f59502b.getResources().getColor(C0906R.color.ou));
                this.itemView.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f59503a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f59503a, false, 64798, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f59503a, false, 64798, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (aVar2 != null) {
                            aVar2.a(cVar2.getAwemeId(), cVar2.getPoiId(), false, 1);
                        }
                    }
                });
                return;
            }
            this.mMoreTxt.setVisibility(8);
            this.mMoreArrow.setVisibility(8);
            this.mTxtTitle.setTextSize(13.0f);
            this.mTxtTitle.setTextColor(this.f59502b.getResources().getColor(C0906R.color.xo));
        }
    }
}

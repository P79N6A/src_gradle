package com.ss.android.ugc.aweme.poi.ui.publish;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.az;
import java.util.List;

public class SpeedRecommendPoiAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60827a;

    /* renamed from: b  reason: collision with root package name */
    public a f60828b;

    /* renamed from: c  reason: collision with root package name */
    private List<az> f60829c;

    class SearchItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60830a;

        /* renamed from: b  reason: collision with root package name */
        View f60831b;

        /* renamed from: c  reason: collision with root package name */
        TextView f60832c;

        SearchItemViewHolder(View view) {
            super(view);
            this.f60831b = view;
            this.f60832c = (TextView) view.findViewById(C0906R.id.clt);
        }
    }

    class SpeedRecommendPoiViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60836a;

        /* renamed from: b  reason: collision with root package name */
        SpeedRecommendPoiItemView f60837b;

        SpeedRecommendPoiViewHolder(SpeedRecommendPoiItemView speedRecommendPoiItemView) {
            super(speedRecommendPoiItemView);
            this.f60837b = speedRecommendPoiItemView;
        }
    }

    public interface a {
        void a(az azVar, boolean z);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f60827a, false, 66688, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60827a, false, 66688, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f60829c == null) {
            return 1;
        } else {
            return this.f60829c.size() + 1;
        }
    }

    public SpeedRecommendPoiAdapter(List<az> list) {
        this.f60829c = list;
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60827a, false, 66689, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60827a, false, 66689, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f60829c == null || i != this.f60829c.size()) {
            return 1;
        } else {
            return 2;
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60827a, false, 66686, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60827a, false, 66686, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 2) {
            return new SearchItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0o, viewGroup, false));
        } else {
            return new SpeedRecommendPoiViewHolder((SpeedRecommendPoiItemView) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0n, viewGroup, false));
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f60827a, false, 66687, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f60827a, false, 66687, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (getItemViewType(i3)) {
            case 1:
                SpeedRecommendPoiViewHolder speedRecommendPoiViewHolder = (SpeedRecommendPoiViewHolder) viewHolder;
                az azVar = this.f60829c.get(i3);
                if (PatchProxy.isSupport(new Object[]{azVar}, speedRecommendPoiViewHolder, SpeedRecommendPoiViewHolder.f60836a, false, 66692, new Class[]{az.class}, Void.TYPE)) {
                    SpeedRecommendPoiViewHolder speedRecommendPoiViewHolder2 = speedRecommendPoiViewHolder;
                    PatchProxy.accessDispatch(new Object[]{azVar}, speedRecommendPoiViewHolder2, SpeedRecommendPoiViewHolder.f60836a, false, 66692, new Class[]{az.class}, Void.TYPE);
                    break;
                } else {
                    SpeedRecommendPoiItemView speedRecommendPoiItemView = speedRecommendPoiViewHolder.f60837b;
                    if (PatchProxy.isSupport(new Object[]{azVar}, speedRecommendPoiItemView, SpeedRecommendPoiItemView.f60842a, false, 66695, new Class[]{az.class}, Void.TYPE)) {
                        SpeedRecommendPoiItemView speedRecommendPoiItemView2 = speedRecommendPoiItemView;
                        PatchProxy.accessDispatch(new Object[]{azVar}, speedRecommendPoiItemView2, SpeedRecommendPoiItemView.f60842a, false, 66695, new Class[]{az.class}, Void.TYPE);
                    } else {
                        PoiStruct poiStruct = azVar.f59909a;
                        if (poiStruct != null) {
                            speedRecommendPoiItemView.mTvPoiName.setText(poiStruct.getPoiName());
                        }
                        boolean z = azVar.f59910b;
                        speedRecommendPoiItemView.setSelected(z);
                        speedRecommendPoiItemView.mTvPoiName.setSelected(z);
                        TextView textView = speedRecommendPoiItemView.mTvPoiName;
                        if (z) {
                            i2 = speedRecommendPoiItemView.mTvPoiName.getContext().getResources().getColor(C0906R.color.zo);
                        } else {
                            i2 = speedRecommendPoiItemView.mTvPoiName.getContext().getResources().getColor(C0906R.color.zx);
                        }
                        textView.setTextColor(i2);
                    }
                    speedRecommendPoiViewHolder.f60837b.setOnClickListener(new View.OnClickListener(azVar) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f60839a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ az f60840b;

                        public final void onClick(View view) {
                            az azVar;
                            if (PatchProxy.isSupport(new Object[]{view}, this, f60839a, false, 66693, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f60839a, false, 66693, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            boolean z = this.f60840b.f59910b;
                            this.f60840b.f59910b = !z;
                            if (SpeedRecommendPoiAdapter.this.f60828b != null) {
                                a aVar = SpeedRecommendPoiAdapter.this.f60828b;
                                if (z) {
                                    azVar = null;
                                } else {
                                    azVar = this.f60840b;
                                }
                                aVar.a(azVar, false);
                            }
                        }

                        {
                            this.f60840b = r2;
                        }
                    });
                    return;
                }
            case 2:
                SearchItemViewHolder searchItemViewHolder = (SearchItemViewHolder) viewHolder;
                if (!PatchProxy.isSupport(new Object[0], searchItemViewHolder, SearchItemViewHolder.f60830a, false, 66690, new Class[0], Void.TYPE)) {
                    searchItemViewHolder.f60832c.setText(C0906R.string.bce);
                    searchItemViewHolder.f60831b.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f60834a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f60834a, false, 66691, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f60834a, false, 66691, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (SpeedRecommendPoiAdapter.this.f60828b != null) {
                                SpeedRecommendPoiAdapter.this.f60828b.a(null, true);
                            }
                        }
                    });
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], searchItemViewHolder, SearchItemViewHolder.f60830a, false, 66690, new Class[0], Void.TYPE);
                    return;
                }
        }
    }
}

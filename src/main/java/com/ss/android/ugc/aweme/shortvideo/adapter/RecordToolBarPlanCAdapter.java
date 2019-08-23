package com.ss.android.ugc.aweme.shortvideo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.collect.av;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ha;
import com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarClickListener;
import com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class RecordToolBarPlanCAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65470a;

    /* renamed from: b  reason: collision with root package name */
    public LinkedHashMap<Integer, RecordToolBarModel> f65471b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<RecordToolBarModel> f65472c;

    /* renamed from: d  reason: collision with root package name */
    public int f65473d = C0906R.layout.zl;

    class FilterViewHolder extends RecyclerView.ViewHolder {
        FilterViewHolder(View view) {
            super(view);
        }
    }

    class StickerViewHolder extends RecyclerView.ViewHolder {
        StickerViewHolder(View view) {
            super(view);
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        ImageView f65476a;

        /* renamed from: b  reason: collision with root package name */
        TextView f65477b;

        ViewHolder(View view) {
            super(view);
            this.f65476a = (ImageView) view.findViewById(C0906R.id.b2_);
            this.f65477b = (TextView) view.findViewById(C0906R.id.dd5);
            this.f65476a.setOnClickListener(new View.OnClickListener(RecordToolBarPlanCAdapter.this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65479a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f65479a, false, 74989, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f65479a, false, 74989, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = ViewHolder.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        RecordToolBarModel recordToolBarModel = RecordToolBarPlanCAdapter.this.f65472c.get(adapterPosition);
                        if (recordToolBarModel != null) {
                            RecordToolBarClickListener recordToolBarClickListener = recordToolBarModel.onClickListener;
                            if (!recordToolBarModel.enabled) {
                                if (recordToolBarClickListener != null) {
                                    recordToolBarClickListener.disableAction(recordToolBarModel);
                                }
                                return;
                            }
                            if (recordToolBarModel.onAnimateListener != null) {
                                recordToolBarModel.onAnimateListener.onAnimate(view);
                            }
                            if (recordToolBarClickListener != null) {
                                recordToolBarClickListener.onClick(recordToolBarModel);
                                if (recordToolBarModel.needsNotify) {
                                    ViewHolder.this.f65476a.setImageResource(recordToolBarModel.resId);
                                    recordToolBarModel.setNeedsNotifyFalse();
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f65470a, false, 74982, new Class[0], Integer.TYPE)) {
            return this.f65472c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f65470a, false, 74982, new Class[0], Integer.TYPE)).intValue();
    }

    public RecordToolBarPlanCAdapter(LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap) {
        this.f65471b = linkedHashMap;
    }

    public final int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65470a, false, 74978, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return av.d(this.f65472c, new b(this, i));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65470a, false, 74978, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final RecordToolBarModel b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65470a, false, 74983, new Class[]{Integer.TYPE}, RecordToolBarModel.class)) {
            return (RecordToolBarModel) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65470a, false, 74983, new Class[]{Integer.TYPE}, RecordToolBarModel.class);
        }
        RecordToolBarModel recordToolBarModel = null;
        int a2 = a(i);
        if (a2 != -1) {
            recordToolBarModel = this.f65472c.remove(a2);
            recordToolBarModel.status = 4;
            notifyItemRemoved(a2);
        }
        return recordToolBarModel;
    }

    public final RecordToolBarModel c(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65470a, false, 74984, new Class[]{Integer.TYPE}, RecordToolBarModel.class)) {
            return (RecordToolBarModel) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65470a, false, 74984, new Class[]{Integer.TYPE}, RecordToolBarModel.class);
        }
        RecordToolBarModel recordToolBarModel = null;
        if (i2 != -1) {
            recordToolBarModel = this.f65472c.remove(i2);
            recordToolBarModel.status = 4;
            notifyItemRemoved(i);
        }
        return recordToolBarModel;
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65470a, false, 74981, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65470a, false, 74981, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (a(this.f65471b, (V) this.f65472c.get(i)) == 0) {
            return 1;
        } else {
            if (a(this.f65471b, (V) this.f65472c.get(i)) == 1) {
                return 2;
            }
            return 0;
        }
    }

    public final <V> int a(LinkedHashMap<Integer, V> linkedHashMap, V v) {
        V v2 = v;
        if (PatchProxy.isSupport(new Object[]{linkedHashMap, v2}, this, f65470a, false, 74987, new Class[]{LinkedHashMap.class, Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{linkedHashMap, v2}, this, f65470a, false, 74987, new Class[]{LinkedHashMap.class, Object.class}, Integer.TYPE)).intValue();
        }
        for (Map.Entry next : linkedHashMap.entrySet()) {
            if (next.getValue() == v2) {
                return ((Integer) next.getKey()).intValue();
            }
        }
        return -1;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        float f2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f65470a, false, 74980, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f65470a, false, 74980, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getItemViewType(i) == 0) {
            RecordToolBarModel recordToolBarModel = this.f65472c.get(i);
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            ImageView imageView = viewHolder2.f65476a;
            imageView.setImageResource(recordToolBarModel.resId);
            if (recordToolBarModel.enabled) {
                i2 = 255;
            } else {
                i2 = 127;
            }
            imageView.setImageAlpha(i2);
            TextView textView = viewHolder2.f65477b;
            View view = viewHolder2.itemView;
            if (recordToolBarModel.enabled) {
                f2 = 1.0f;
            } else {
                f2 = 0.49803922f;
            }
            textView.setAlpha(f2);
            if (recordToolBarModel.descId <= 0) {
                textView.setVisibility(8);
                view.setContentDescription(null);
            } else {
                textView.setText(recordToolBarModel.descId);
                textView.setVisibility(0);
                view.setContentDescription(view.getContext().getText(recordToolBarModel.descId));
            }
            if (recordToolBarModel.shouldAnimate && recordToolBarModel.onAnimateListener != null) {
                recordToolBarModel.onAnimateListener.onAnimate(imageView);
            }
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f65470a, false, 74979, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f65470a, false, 74979, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 1) {
            boolean a2 = ha.a(viewGroup.getContext());
            if (a.b() && !a2) {
                i2 = C0906R.layout.fn;
            } else if (a.b() && a2) {
                i2 = C0906R.layout.fo;
            } else if (a2) {
                i2 = C0906R.layout.fl;
            } else {
                i2 = C0906R.layout.fm;
            }
            return new FilterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
        } else if (i == 2) {
            return new StickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zn, viewGroup, false));
        } else {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.f65473d, viewGroup, false));
        }
    }

    public final void a(RecordToolBarModel recordToolBarModel, int i) {
        if (PatchProxy.isSupport(new Object[]{recordToolBarModel, Integer.valueOf(i)}, this, f65470a, false, 74986, new Class[]{RecordToolBarModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recordToolBarModel, Integer.valueOf(i)}, this, f65470a, false, 74986, new Class[]{RecordToolBarModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(this.f65472c.size(), recordToolBarModel, i);
    }

    public final void a(int i, RecordToolBarModel recordToolBarModel, int i2) {
        int i3 = i;
        RecordToolBarModel recordToolBarModel2 = recordToolBarModel;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recordToolBarModel2, Integer.valueOf(i2)}, this, f65470a, false, 74985, new Class[]{Integer.TYPE, RecordToolBarModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recordToolBarModel2, Integer.valueOf(i2)}, this, f65470a, false, 74985, new Class[]{Integer.TYPE, RecordToolBarModel.class, Integer.TYPE}, Void.TYPE);
        } else if (i3 >= 0 && i3 <= this.f65472c.size() && !this.f65472c.contains(recordToolBarModel2)) {
            this.f65472c.add(i, recordToolBarModel2);
            recordToolBarModel2.status = i2;
            notifyItemInserted(i);
        }
    }
}

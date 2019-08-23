package com.ss.android.ugc.aweme.imported;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.d;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import java.util.List;

public class AVHashTagListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52895a;

    /* renamed from: b  reason: collision with root package name */
    List<d> f52896b;

    /* renamed from: c  reason: collision with root package name */
    d f52897c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f52898d;

    /* renamed from: e  reason: collision with root package name */
    public AVSearchChallengeList f52899e;

    /* renamed from: f  reason: collision with root package name */
    private Context f52900f;

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131493021)
        LinearLayout mContent;
        @BindView(2131493199)
        ImageView mHashTagImage;
        @BindView(2131493201)
        TextView mHashTagNum;
        @BindView(2131493202)
        TextView mHashTagTitle;
        @BindView(2131493258)
        ImageView mHashTagUser;

        public ItemViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52904a;

        /* renamed from: b  reason: collision with root package name */
        private ItemViewHolder f52905b;

        @CallSuper
        public void unbind() {
            if (PatchProxy.isSupport(new Object[0], this, f52904a, false, 54444, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52904a, false, 54444, new Class[0], Void.TYPE);
                return;
            }
            ItemViewHolder itemViewHolder = this.f52905b;
            if (itemViewHolder != null) {
                this.f52905b = null;
                itemViewHolder.mHashTagTitle = null;
                itemViewHolder.mHashTagImage = null;
                itemViewHolder.mHashTagNum = null;
                itemViewHolder.mContent = null;
                itemViewHolder.mHashTagUser = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        @UiThread
        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.f52905b = itemViewHolder;
            itemViewHolder.mHashTagTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.amp, "field 'mHashTagTitle'", TextView.class);
            itemViewHolder.mHashTagImage = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.amm, "field 'mHashTagImage'", ImageView.class);
            itemViewHolder.mHashTagNum = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.amo, "field 'mHashTagNum'", TextView.class);
            itemViewHolder.mContent = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.yp, "field 'mContent'", LinearLayout.class);
            itemViewHolder.mHashTagUser = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.asj, "field 'mHashTagUser'", ImageView.class);
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f52895a, false, 54441, new Class[0], Integer.TYPE)) {
            return this.f52896b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52895a, false, 54441, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52895a, false, 54440, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f52896b.get(i).f66728b;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52895a, false, 54440, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f52895a, false, 54438, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f52895a, false, 54438, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i != 2) {
            return null;
        } else {
            return new ItemViewHolder(LayoutInflater.from(this.f52900f).inflate(C0906R.layout.ve, viewGroup2, false));
        }
    }

    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f52895a, false, 54439, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f52895a, false, 54439, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder instanceof ItemViewHolder) {
            String challengeName = this.f52896b.get(i).f66727a.getChallengeName();
            if (!challengeName.startsWith("#")) {
                challengeName = "#" + challengeName;
            }
            ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
            itemViewHolder.mHashTagTitle.setText(challengeName);
            itemViewHolder.mHashTagNum.setText(c.a(this.f52896b.get(i).f66727a.getDisplayCount()));
            TextView textView = itemViewHolder.mHashTagNum;
            int i3 = 8;
            if (!this.f52896b.get(i).f66730d) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            itemViewHolder.mHashTagUser.setVisibility(4);
            int i4 = this.f52896b.get(i).f66729c;
            ImageView imageView = itemViewHolder.mHashTagImage;
            if (this.f52898d && i4 > 0) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            if (i4 > 0) {
                itemViewHolder.mHashTagImage.setImageResource(i4);
            }
            viewHolder.itemView.setOnClickListener(new a(this, i));
            if (this.f52896b.get(i).f66728b == 2) {
                itemViewHolder.mContent.setOnTouchListener(new View.OnTouchListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52901a;

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f52901a, false, 54443, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f52901a, false, 54443, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        }
                        if (motionEvent.getAction() == 0) {
                            ((ItemViewHolder) viewHolder).mContent.setAlpha(0.5f);
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            ((ItemViewHolder) viewHolder).mContent.setAlpha(1.0f);
                        }
                        return false;
                    }
                });
            }
        }
    }
}

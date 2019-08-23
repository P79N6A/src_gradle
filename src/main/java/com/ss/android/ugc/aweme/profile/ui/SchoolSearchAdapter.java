package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.search.g;
import com.ss.android.ugc.aweme.profile.model.SchoolStruct;
import com.ss.android.ugc.aweme.utils.ed;
import java.util.ArrayList;
import java.util.List;

public class SchoolSearchAdapter extends BaseAdapter<SchoolStruct.School> implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62340a;

    /* renamed from: b  reason: collision with root package name */
    public a f62341b;

    /* renamed from: c  reason: collision with root package name */
    private String f62342c;

    /* renamed from: d  reason: collision with root package name */
    private List<SchoolStruct.School> f62343d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private boolean f62344e = true;

    class NearestSchoolViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62349a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f62350b;

        /* renamed from: c  reason: collision with root package name */
        Context f62351c;

        private View a() {
            if (PatchProxy.isSupport(new Object[0], this, f62349a, false, 68988, new Class[0], View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[0], this, f62349a, false, 68988, new Class[0], View.class);
            } else if (this.f62351c == null) {
                return null;
            } else {
                CommonItemView commonItemView = new CommonItemView(this.f62351c);
                commonItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                commonItemView.setRightIconRes(0);
                return commonItemView;
            }
        }

        public final void a(List<SchoolStruct.School> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f62349a, false, 68985, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f62349a, false, 68985, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f62350b.removeAllViews();
            for (SchoolStruct.School school : list) {
                a(school.name, true);
            }
        }

        private NearestSchoolViewHolder(View view) {
            super(view);
            this.f62350b = (LinearLayout) view.findViewById(C0906R.id.bq2);
            this.f62351c = view.getContext();
        }

        /* access modifiers changed from: package-private */
        public void a(final String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62349a, false, 68987, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f62349a, false, 68987, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            CommonItemView commonItemView = (CommonItemView) a();
            if (commonItemView != null) {
                commonItemView.setOnTouchListener(ed.a(0.5f, 1.0f));
                commonItemView.setLeftText(str);
                if (z) {
                    commonItemView.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f62353a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f62353a, false, 68989, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f62353a, false, 68989, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (!TextUtils.equals(str, NearestSchoolViewHolder.this.f62351c.getString(C0906R.string.bon)) && SchoolSearchAdapter.this.f62341b != null) {
                                SchoolSearchAdapter.this.f62341b.a(view, str);
                            }
                        }
                    });
                }
                this.f62350b.addView(commonItemView, new LinearLayout.LayoutParams(-1, (int) UIUtils.dip2Px(this.f62351c, 52.0f)));
            }
        }

        /* synthetic */ NearestSchoolViewHolder(SchoolSearchAdapter schoolSearchAdapter, View view, byte b2) {
            this(view);
        }
    }

    class SchoolSearchViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        CommonItemView f62356a;

        private SchoolSearchViewHolder(View view) {
            super(view);
            this.f62356a = (CommonItemView) view;
        }

        /* synthetic */ SchoolSearchViewHolder(SchoolSearchAdapter schoolSearchAdapter, View view, byte b2) {
            this(view);
        }
    }

    public interface a {
        void a(View view, String str);
    }

    public final void a(PoiStruct poiStruct) {
    }

    public int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f62340a, false, 68983, new Class[0], Integer.TYPE)) {
            return super.getBasicItemCount() + (this.f62344e ? 1 : 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f62340a, false, 68983, new Class[0], Integer.TYPE)).intValue();
    }

    public int getBasicItemViewType(int i) {
        if (this.f62344e && i == 0) {
            return 1;
        }
        return 2;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f62340a, false, 68982, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f62340a, false, 68982, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f62342c = str;
        if (TextUtils.isEmpty(this.f62342c)) {
            this.f62344e = true;
        } else {
            this.f62344e = false;
        }
    }

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f62340a, false, 68981, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f62340a, false, 68981, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        this.mTextColor = ContextCompat.getColor(viewGroup.getContext(), C0906R.color.zx);
        return super.onCreateFooterViewHolder(viewGroup);
    }

    public final void a(List<SchoolStruct.School> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f62340a, false, 68979, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f62340a, false, 68979, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            this.f62343d.clear();
            this.f62343d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f62340a, false, 68980, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f62340a, false, 68980, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 1) {
            return new NearestSchoolViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zt, viewGroup, false), (byte) 0);
        } else {
            CommonItemView commonItemView = new CommonItemView(viewGroup.getContext());
            commonItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            commonItemView.setRightIconRes(0);
            View.OnTouchListener a2 = ed.a(0.5f, 1.0f);
            SchoolSearchViewHolder schoolSearchViewHolder = new SchoolSearchViewHolder(this, commonItemView, (byte) 0);
            schoolSearchViewHolder.itemView.setOnTouchListener(a2);
            return schoolSearchViewHolder;
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        SpannableString spannableString;
        final RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f62340a, false, 68977, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f62340a, false, 68977, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (viewHolder2 instanceof SchoolSearchViewHolder) {
            SchoolSearchViewHolder schoolSearchViewHolder = (SchoolSearchViewHolder) viewHolder2;
            if (this.f62344e) {
                i2 = i - 1;
            } else {
                i2 = i;
            }
            final String str = ((SchoolStruct.School) this.mItems.get(i2)).name;
            if (TextUtils.isEmpty(this.f62342c) || !str.contains(this.f62342c)) {
                schoolSearchViewHolder.f62356a.setLeftText(str);
            } else {
                CommonItemView commonItemView = schoolSearchViewHolder.f62356a;
                String str2 = this.f62342c;
                if (PatchProxy.isSupport(new Object[]{str, str2}, this, f62340a, false, 68978, new Class[]{String.class, String.class}, SpannableString.class)) {
                    spannableString = (SpannableString) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f62340a, false, 68978, new Class[]{String.class, String.class}, SpannableString.class);
                } else {
                    spannableString = new SpannableString(str);
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(GlobalContext.getContext().getResources().getColor(C0906R.color.a1s));
                    int indexOf = str.indexOf(str2);
                    int indexOf2 = str.indexOf(str2) + str2.length();
                    if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(indexOf), Integer.valueOf(indexOf2), 0}, null, dl.f62659a, true, 68990, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(indexOf), Integer.valueOf(indexOf2), 0}, null, dl.f62659a, true, 68990, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        spannableString.setSpan(foregroundColorSpan, indexOf, indexOf2, 0);
                    }
                }
                commonItemView.setLeftText(spannableString);
            }
            if (this.f62341b != null) {
                schoolSearchViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62345a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f62345a, false, 68984, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f62345a, false, 68984, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        SchoolSearchAdapter.this.f62341b.a(viewHolder2.itemView, str);
                    }
                });
            }
        } else {
            if (viewHolder2 instanceof NearestSchoolViewHolder) {
                if (!CollectionUtils.isEmpty(this.f62343d)) {
                    ((NearestSchoolViewHolder) viewHolder2).a(this.f62343d);
                    return;
                }
                NearestSchoolViewHolder nearestSchoolViewHolder = (NearestSchoolViewHolder) viewHolder2;
                if (PatchProxy.isSupport(new Object[0], nearestSchoolViewHolder, NearestSchoolViewHolder.f62349a, false, 68986, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], nearestSchoolViewHolder, NearestSchoolViewHolder.f62349a, false, 68986, new Class[0], Void.TYPE);
                    return;
                }
                nearestSchoolViewHolder.f62350b.removeAllViews();
                nearestSchoolViewHolder.a(nearestSchoolViewHolder.f62351c.getString(C0906R.string.c2s), false);
            }
        }
    }
}

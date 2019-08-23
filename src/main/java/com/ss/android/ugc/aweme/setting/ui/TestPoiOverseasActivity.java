package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.poi.ui.n;
import com.ss.android.ugc.aweme.utils.q;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class TestPoiOverseasActivity extends AmeBaseActivity implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64251a;

    /* renamed from: b  reason: collision with root package name */
    private double[][] f64252b = {new double[]{35.6876148d, 139.7567735d}, new double[]{35.7078225d, 139.7660301d}, new double[]{39.4972306d, -116.5261509d}, new double[]{35.4634218d, -97.5173063d}, new double[]{12.8966982d, 100.8938733d}, new double[]{12.9723444d, 100.973703d}, new double[]{50.8812038d, 10.1427705d}, new double[]{39.9252825d, -8.7372812d}, new double[]{38.5318013d, 35.4382321d}, new double[]{37.2761492d, 34.7951663d}, new double[]{24.4419429d, 54.6478849d}, new double[]{24.4382834d, 54.5702582d}, new double[]{55.797254d, 37.5471293d}, new double[]{51.7548197d, -1.2565555d}};
    @BindView(2131494119)
    SettingItemSwitch fakeGps;
    @BindView(2131495222)
    DmtEditText latValue;
    @BindView(2131495623)
    DmtEditText lngValue;
    @BindView(2131495660)
    RecyclerView mLocationList;
    @BindView(2131495711)
    TextView mMapGetPoint;
    @BindView(2131495737)
    TextView mMccMnc;
    @BindView(2131496905)
    DmtEditText mSchemaEditText;
    @BindView(2131497590)
    TextView mTitle;
    @BindView(2131493111)
    TextView mTxtApply;
    @BindView(2131495221)
    TextView mTxtLat;
    @BindView(2131495622)
    TextView mTxtLng;

    static class LocationAdapter extends RecyclerView.Adapter<LocationViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64253a;

        /* renamed from: b  reason: collision with root package name */
        private Context f64254b;

        /* renamed from: c  reason: collision with root package name */
        private List<a> f64255c;

        public int getItemCount() {
            if (PatchProxy.isSupport(new Object[0], this, f64253a, false, 72733, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f64253a, false, 72733, new Class[0], Integer.TYPE)).intValue();
            } else if (this.f64255c == null) {
                return 0;
            } else {
                return this.f64255c.size();
            }
        }

        private LocationAdapter(Context context, List<a> list) {
            this.f64254b = context;
            this.f64255c = list;
        }

        @NonNull
        public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2 = viewGroup;
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f64253a, false, 72731, new Class[]{ViewGroup.class, Integer.TYPE}, LocationViewHolder.class)) {
                return new LocationViewHolder(LayoutInflater.from(this.f64254b).inflate(C0906R.layout.e9, viewGroup2, false));
            }
            return (LocationViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f64253a, false, 72731, new Class[]{ViewGroup.class, Integer.TYPE}, LocationViewHolder.class);
        }

        public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            LocationViewHolder locationViewHolder = (LocationViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{locationViewHolder, Integer.valueOf(i)}, this, f64253a, false, 72732, new Class[]{LocationViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{locationViewHolder, Integer.valueOf(i)}, this, f64253a, false, 72732, new Class[]{LocationViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            a aVar = this.f64255c.get(i);
            if (PatchProxy.isSupport(new Object[]{aVar}, locationViewHolder, LocationViewHolder.f64256a, false, 72734, new Class[]{a.class}, Void.TYPE)) {
                LocationViewHolder locationViewHolder2 = locationViewHolder;
                PatchProxy.accessDispatch(new Object[]{aVar}, locationViewHolder2, LocationViewHolder.f64256a, false, 72734, new Class[]{a.class}, Void.TYPE);
                return;
            }
            locationViewHolder.f64257b.setText(aVar.f64262a);
            locationViewHolder.itemView.setOnClickListener(new View.OnClickListener(aVar) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64259a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f64260b;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f64259a, false, 72735, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f64259a, false, 72735, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!n.a().b()) {
                        u.a(Toast.makeText(LocationViewHolder.this.f64258c, "enable toggle first", 0));
                        return;
                    }
                    n.a().a(new double[]{this.f64260b.f64263b, this.f64260b.f64264c});
                    u.a(Toast.makeText(LocationViewHolder.this.f64258c, "lat & lng saved successfully!", 0));
                }

                {
                    this.f64260b = r2;
                }
            });
        }

        /* synthetic */ LocationAdapter(Context context, List list, byte b2) {
            this(context, list);
        }
    }

    static class LocationViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64256a;

        /* renamed from: b  reason: collision with root package name */
        TextView f64257b;

        /* renamed from: c  reason: collision with root package name */
        public Context f64258c;

        LocationViewHolder(View view) {
            super(view);
            this.f64258c = view.getContext();
            this.f64257b = (TextView) view.findViewById(C0906R.id.bk9);
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f64262a;

        /* renamed from: b  reason: collision with root package name */
        public double f64263b;

        /* renamed from: c  reason: collision with root package name */
        public double f64264c;

        a(String str, double[] dArr) {
            this.f64262a = str;
            this.f64263b = dArr[0];
            this.f64264c = dArr[1];
        }
    }

    public final int a() {
        return C0906R.layout.e_;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64251a, false, 72729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64251a, false, 72729, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64251a, false, 72730, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64251a, false, 72730, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @OnClick({2131495711})
    public void mapGetPoint() {
        if (PatchProxy.isSupport(new Object[0], this, f64251a, false, 72724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64251a, false, 72724, new Class[0], Void.TYPE);
        } else if (!n.a().b()) {
            v.a(Toast.makeText(this, "enable toggle first", 0));
        } else {
            startActivityForResult(new Intent(this, TestPoiMapPickUpActivity.class), 666);
        }
    }

    @OnClick({2131495207})
    public void schemaJump() {
        if (PatchProxy.isSupport(new Object[0], this, f64251a, false, 72725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64251a, false, 72725, new Class[0], Void.TYPE);
            return;
        }
        String str = "";
        if (this.mSchemaEditText.getText() != null) {
            str = this.mSchemaEditText.getText().toString().trim();
        }
        if (TextUtils.isEmpty(str)) {
            v.a(Toast.makeText(this, "please input schema!", 0));
        } else {
            h.a().a(str);
        }
    }

    @OnClick({2131493111})
    public void onConfigPoiOverseas() {
        if (PatchProxy.isSupport(new Object[0], this, f64251a, false, 72723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64251a, false, 72723, new Class[0], Void.TYPE);
        } else if (!n.a().b()) {
            v.a(Toast.makeText(this, "enable toggle first", 0));
        } else {
            String obj = this.latValue.getEditableText().toString();
            String obj2 = this.lngValue.getEditableText().toString();
            if (StringUtils.isEmpty(obj) || StringUtils.isEmpty(obj2)) {
                v.a(Toast.makeText(this, "must set both lat & lng", 0));
                return;
            }
            double parseDouble = Double.parseDouble(obj);
            double parseDouble2 = Double.parseDouble(obj2);
            if (Math.abs(parseDouble) > 90.0d) {
                v.a(Toast.makeText(this, "lat should be set from -90 to 90", 0));
            } else if (Math.abs(parseDouble2) > 180.0d) {
                v.a(Toast.makeText(this, "lng should be set from -180 to 180", 0));
            } else {
                n a2 = n.a();
                if (PatchProxy.isSupport(new Object[]{obj, obj2}, a2, n.f60822a, false, 66028, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj, obj2}, a2, n.f60822a, false, 66028, new Class[]{String.class, String.class}, Void.TYPE);
                    return;
                }
                if (a2.f60824b != null) {
                    a2.f60824b.a(obj);
                    a2.f60824b.b(obj2);
                }
            }
        }
    }

    @OnClick({2131493213})
    public void exit(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64251a, false, 72726, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64251a, false, 72726, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    public void OnSettingItemClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64251a, false, 72722, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64251a, false, 72722, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.a_0) {
            boolean z = !this.fakeGps.a();
            n a2 = n.a();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, a2, n.f60822a, false, 66025, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, a2, n.f60822a, false, 66025, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (a2.f60824b != null) {
                a2.f60824b.b(z);
            }
            this.fakeGps.setChecked(z);
            this.fakeGps.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), (int) C0906R.color.a0i));
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        List list;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64251a, false, 72720, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64251a, false, 72720, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onCreate", true);
        super.onCreate(bundle);
        this.fakeGps.setChecked(n.a().b());
        this.fakeGps.setOnSettingItemClickListener(this);
        this.mTitle.setText("POI FAKE GPS");
        this.mTxtLat.setText("latitude");
        this.mTxtLng.setText("longitude");
        this.mTxtApply.setText("Apply");
        TextView textView = this.mMccMnc;
        if (PatchProxy.isSupport(new Object[0], this, f64251a, false, 72721, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f64251a, false, 72721, new Class[0], String.class);
        } else {
            str = "getNetworkOperator:" + q.a() + "\ngetSimOperator:" + q.d();
        }
        textView.setText(str);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.setOrientation(1);
        this.mLocationList.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView = this.mLocationList;
        if (PatchProxy.isSupport(new Object[0], this, f64251a, false, 72727, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], this, f64251a, false, 72727, new Class[0], List.class);
        } else {
            list = new ArrayList();
            list.add(new a("日本——二の丸庭園", this.f64252b[0]));
            list.add(new a("日本——Yushima Tenmangu", this.f64252b[1]));
            list.add(new a("美国——Sonic Drive-In", this.f64252b[2]));
            list.add(new a("美国——Chesapeake Energy Arena", this.f64252b[3]));
            list.add(new a("泰国——Underwater World Pattaya", this.f64252b[4]));
            list.add(new a("泰国——Pattaya Sheep farms", this.f64252b[5]));
            list.add(new a("德国——schönen Feriendorf Frauensee", this.f64252b[6]));
            list.add(new a("葡萄牙——Vista Alegre", this.f64252b[7]));
            list.add(new a("土耳其——埃尔吉耶斯山Erciyes Dağı", this.f64252b[8]));
            list.add(new a("土耳其——Topaşır Milli Parkı", this.f64252b[9]));
            list.add(new a("阿拉伯——阿布扎比国际机场", this.f64252b[10]));
            list.add(new a("阿拉伯——Al Raha Beach Hotel", this.f64252b[11]));
            list.add(new a("莫斯科——Центральный дом авиации и космонавтики ДОСААФ РФ", this.f64252b[12]));
            list.add(new a("英国——牛津大学University of Oxford", this.f64252b[13]));
        }
        recyclerView.setAdapter(new LocationAdapter(this, list, (byte) 0));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f64251a, false, 72728, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f64251a, false, 72728, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
        } else if (i2 == -1) {
            if (i == 666) {
                DmtEditText dmtEditText = this.latValue;
                dmtEditText.setText(intent2.getDoubleExtra("latitude", 0.0d));
                DmtEditText dmtEditText2 = this.lngValue;
                dmtEditText2.setText(intent2.getDoubleExtra("longitude", 0.0d));
            }
            super.onActivityResult(i, i2, intent);
        }
    }
}

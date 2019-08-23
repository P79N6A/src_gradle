package com.xiaomi.push;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public class dy implements Comparable<dy> {

    /* renamed from: a  reason: collision with root package name */
    protected int f81961a;

    /* renamed from: a  reason: collision with other field name */
    private long f289a;

    /* renamed from: a  reason: collision with other field name */
    String f290a;

    /* renamed from: a  reason: collision with other field name */
    private final LinkedList<Cdo> f291a;

    public dy() {
        this(null, 0);
    }

    public dy(String str) {
        this(str, 0);
    }

    public dy(String str, int i) {
        this.f291a = new LinkedList<>();
        this.f289a = 0;
        this.f290a = str;
        this.f81961a = i;
    }

    /* renamed from: a */
    public int compareTo(dy dyVar) {
        if (dyVar == null) {
            return 1;
        }
        return dyVar.f81961a - this.f81961a;
    }

    public dy a(JSONObject jSONObject) {
        synchronized (this) {
            this.f289a = jSONObject.getLong(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP);
            this.f81961a = jSONObject.getInt("wt");
            this.f290a = jSONObject.getString("host");
            JSONArray jSONArray = jSONObject.getJSONArray("ah");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f291a.add(new Cdo().a(jSONArray.getJSONObject(i)));
            }
        }
        return this;
    }

    public JSONObject a() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = new JSONObject();
            jSONObject.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, this.f289a);
            jSONObject.put("wt", this.f81961a);
            jSONObject.put("host", this.f290a);
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = this.f291a.iterator();
            while (it2.hasNext()) {
                jSONArray.put(((Cdo) it2.next()).a());
            }
            jSONObject.put("ah", jSONArray);
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public void a(Cdo doVar) {
        synchronized (this) {
            if (doVar != null) {
                this.f291a.add(doVar);
                int a2 = doVar.a();
                if (a2 > 0) {
                    this.f81961a += doVar.a();
                } else {
                    int size = this.f291a.size();
                    int i = 0;
                    while (true) {
                        size--;
                        if (size < 0 || this.f291a.get(size).a() >= 0) {
                            this.f81961a += a2 * i;
                        } else {
                            i++;
                        }
                    }
                    this.f81961a += a2 * i;
                }
                if (this.f291a.size() > 30) {
                    this.f81961a -= this.f291a.remove().a();
                }
            }
        }
    }

    public String toString() {
        return this.f290a + ":" + this.f81961a;
    }
}

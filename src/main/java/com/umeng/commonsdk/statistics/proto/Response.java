package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.aa;
import com.umeng.commonsdk.proguard.ac;
import com.umeng.commonsdk.proguard.ad;
import com.umeng.commonsdk.proguard.ai;
import com.umeng.commonsdk.proguard.aj;
import com.umeng.commonsdk.proguard.al;
import com.umeng.commonsdk.proguard.an;
import com.umeng.commonsdk.proguard.ao;
import com.umeng.commonsdk.proguard.aq;
import com.umeng.commonsdk.proguard.ar;
import com.umeng.commonsdk.proguard.as;
import com.umeng.commonsdk.proguard.at;
import com.umeng.commonsdk.proguard.au;
import com.umeng.commonsdk.proguard.g;
import com.umeng.commonsdk.proguard.j;
import com.umeng.commonsdk.proguard.p;
import com.umeng.commonsdk.proguard.q;
import com.umeng.commonsdk.proguard.v;
import com.umeng.commonsdk.proguard.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Response implements j<Response, e>, Serializable, Cloneable {
    public static final ad IMPRINT_FIELD_DESC = new ad("imprint", (byte) 12, 3);
    public static final ad MSG_FIELD_DESC = new ad("msg", (byte) 11, 2);
    public static final ad RESP_CODE_FIELD_DESC = new ad("resp_code", (byte) 8, 1);
    public static final an STRUCT_DESC = new an("Response");
    public static final Map<e, v> metaDataMap;
    private static final Map<Class<? extends aq>, ar> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public d imprint;
    public String msg;
    private e[] optionals;
    public int resp_code;

    static class a extends as<Response> {
        private a() {
        }

        /* renamed from: b */
        public void a(ai aiVar, Response response) throws p {
            response.validate();
            aiVar.a(Response.STRUCT_DESC);
            aiVar.a(Response.RESP_CODE_FIELD_DESC);
            aiVar.a(response.resp_code);
            aiVar.c();
            if (response.msg != null && response.isSetMsg()) {
                aiVar.a(Response.MSG_FIELD_DESC);
                aiVar.a(response.msg);
                aiVar.c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                aiVar.a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(aiVar);
                aiVar.c();
            }
            aiVar.d();
            aiVar.b();
        }

        /* renamed from: a */
        public void b(ai aiVar, Response response) throws p {
            aiVar.j();
            while (true) {
                ad l = aiVar.l();
                if (l.f80813b != 0) {
                    switch (l.f80814c) {
                        case 1:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                response.resp_code = aiVar.w();
                                response.setResp_codeIsSet(true);
                                break;
                            }
                        case 2:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                response.msg = aiVar.z();
                                response.setMsgIsSet(true);
                                break;
                            }
                        case 3:
                            if (l.f80813b != 12) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                response.imprint = new d();
                                response.imprint.read(aiVar);
                                response.setImprintIsSet(true);
                                break;
                            }
                        default:
                            al.a(aiVar, l.f80813b);
                            break;
                    }
                    aiVar.m();
                } else {
                    aiVar.k();
                    if (response.isSetResp_code()) {
                        response.validate();
                        return;
                    }
                    throw new aj("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
                }
            }
        }
    }

    static class b implements ar {
        private b() {
        }

        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    static class c extends at<Response> {
        private c() {
        }

        public void a(ai aiVar, Response response) throws p {
            ao aoVar = (ao) aiVar;
            aoVar.a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            aoVar.a(bitSet, 2);
            if (response.isSetMsg()) {
                aoVar.a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(aoVar);
            }
        }

        public void b(ai aiVar, Response response) throws p {
            ao aoVar = (ao) aiVar;
            response.resp_code = aoVar.w();
            response.setResp_codeIsSet(true);
            BitSet b2 = aoVar.b(2);
            if (b2.get(0)) {
                response.msg = aoVar.z();
                response.setMsgIsSet(true);
            }
            if (b2.get(1)) {
                response.imprint = new d();
                response.imprint.read(aoVar);
                response.setImprintIsSet(true);
            }
        }
    }

    static class d implements ar {
        private d() {
        }

        /* renamed from: a */
        public c b() {
            return new c();
        }
    }

    public enum e implements q {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, "imprint");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f80995d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f80996e;

        /* renamed from: f  reason: collision with root package name */
        private final String f80997f;

        public final short a() {
            return this.f80996e;
        }

        public final String b() {
            return this.f80997f;
        }

        static {
            f80995d = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f80995d.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f80995d.get(str);
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return RESP_CODE;
                case 2:
                    return MSG;
                case 3:
                    return IMPRINT;
                default:
                    return null;
            }
        }

        public static e b(int i) {
            e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        private e(short s, String str) {
            this.f80996e = s;
            this.f80997f = str;
        }
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public d getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        if (this.imprint != null) {
            return true;
        }
        return false;
    }

    public boolean isSetMsg() {
        if (this.msg != null) {
            return true;
        }
        return false;
    }

    public boolean isSetResp_code() {
        return g.a(this.__isset_bitfield, 0);
    }

    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public Response deepCopy() {
        return new Response(this);
    }

    public void unsetResp_code() {
        this.__isset_bitfield = g.b(this.__isset_bitfield, 0);
    }

    public void validate() throws p {
        if (this.imprint != null) {
            this.imprint.l();
        }
    }

    public Response() {
        this.optionals = new e[]{e.MSG, e.IMPRINT};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            if (this.msg == null) {
                sb.append("null");
            } else {
                sb.append(this.msg);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            if (this.imprint == null) {
                sb.append("null");
            } else {
                sb.append(this.imprint);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(as.class, new b());
        schemes.put(at.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.RESP_CODE, new v("resp_code", (byte) 1, new w((byte) 8)));
        enumMap.put(e.MSG, new v("msg", (byte) 2, new w((byte) 11)));
        enumMap.put(e.IMPRINT, new v("imprint", (byte) 2, new aa((byte) 12, d.class)));
        metaDataMap = Collections.unmodifiableMap(enumMap);
        v.a(Response.class, metaDataMap);
    }

    public Response setImprint(d dVar) {
        this.imprint = dVar;
        return this;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void setImprintIsSet(boolean z) {
        if (!z) {
            this.imprint = null;
        }
    }

    public void setMsgIsSet(boolean z) {
        if (!z) {
            this.msg = null;
        }
    }

    public Response setResp_code(int i) {
        this.resp_code = i;
        setResp_codeIsSet(true);
        return this;
    }

    public Response(int i) {
        this();
        this.resp_code = i;
        setResp_codeIsSet(true);
    }

    public e fieldForId(int i) {
        return e.a(i);
    }

    public void setResp_codeIsSet(boolean z) {
        this.__isset_bitfield = g.a(this.__isset_bitfield, 0, z);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
            read(new ac(new au((InputStream) objectInputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ac(new au((OutputStream) objectOutputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void read(ai aiVar) throws p {
        schemes.get(aiVar.D()).b().b(aiVar, this);
    }

    public void write(ai aiVar) throws p {
        schemes.get(aiVar.D()).b().a(aiVar, this);
    }

    public Response(Response response) {
        this.optionals = new e[]{e.MSG, e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new d(response.imprint);
        }
    }
}

package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.at;
import com.mapbox.geojson.Point;
import java.util.List;

public abstract class m extends at {
    private final String accessToken;
    private final Boolean alternatives;
    private final String annotations;
    private final String approaches;
    private final Boolean bannerInstructions;
    private final String baseUrl;
    private final String bearings;
    private final Boolean continueStraight;
    private final List<Point> coordinates;
    private final String exclude;
    private final String geometries;
    private final String language;
    private final String overview;
    private final String profile;
    private final String radiuses;
    private final String requestUuid;
    private final Boolean roundaboutExits;
    private final Boolean steps;
    private final String user;
    private final Boolean voiceInstructions;
    private final String voiceUnits;
    private final String waypointNames;

    static final class a extends at.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26230a;

        /* renamed from: b  reason: collision with root package name */
        private String f26231b;

        /* renamed from: c  reason: collision with root package name */
        private String f26232c;

        /* renamed from: d  reason: collision with root package name */
        private List<Point> f26233d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f26234e;

        /* renamed from: f  reason: collision with root package name */
        private String f26235f;
        private String g;
        private String h;
        private Boolean i;
        private Boolean j;
        private String k;
        private String l;
        private Boolean m;
        private String n;
        private String o;
        private Boolean p;
        private Boolean q;
        private String r;
        private String s;
        private String t;
        private String u;
        private String v;

        a() {
        }

        public final at a() {
            String str = "";
            if (this.f26230a == null) {
                str = str + " baseUrl";
            }
            if (this.f26231b == null) {
                str = str + " user";
            }
            if (this.f26232c == null) {
                str = str + " profile";
            }
            if (this.f26233d == null) {
                str = str + " coordinates";
            }
            if (this.k == null) {
                str = str + " geometries";
            }
            if (this.s == null) {
                str = str + " accessToken";
            }
            if (this.t == null) {
                str = str + " requestUuid";
            }
            if (str.isEmpty()) {
                ac acVar = new ac(this.f26230a, this.f26231b, this.f26232c, this.f26233d, this.f26234e, this.f26235f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
                return acVar;
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public final at.a a(@Nullable Boolean bool) {
            this.f26234e = bool;
            return this;
        }

        public final at.a b(Boolean bool) {
            this.i = bool;
            return this;
        }

        public final at.a c(@Nullable Boolean bool) {
            this.j = bool;
            return this;
        }

        public final at.a d(@Nullable Boolean bool) {
            this.m = bool;
            return this;
        }

        public final at.a e(Boolean bool) {
            this.p = bool;
            return this;
        }

        public final at.a f(Boolean bool) {
            this.q = bool;
            return this;
        }

        public final at.a h(@Nullable String str) {
            this.l = str;
            return this;
        }

        public final at.a i(String str) {
            this.n = str;
            return this;
        }

        public final at.a j(String str) {
            this.o = str;
            return this;
        }

        public final at.a k(@Nullable String str) {
            this.r = str;
            return this;
        }

        public final at.a n(String str) {
            this.u = str;
            return this;
        }

        public final at.a o(@Nullable String str) {
            this.v = str;
            return this;
        }

        public final at.a d(String str) {
            this.f26235f = str;
            return this;
        }

        public final at.a e(String str) {
            this.g = str;
            return this;
        }

        public final at.a f(String str) {
            this.h = str;
            return this;
        }

        public final at.a a(String str) {
            if (str != null) {
                this.f26230a = str;
                return this;
            }
            throw new NullPointerException("Null baseUrl");
        }

        public final at.a b(String str) {
            if (str != null) {
                this.f26231b = str;
                return this;
            }
            throw new NullPointerException("Null user");
        }

        public final at.a c(String str) {
            if (str != null) {
                this.f26232c = str;
                return this;
            }
            throw new NullPointerException("Null profile");
        }

        public final at.a g(String str) {
            if (str != null) {
                this.k = str;
                return this;
            }
            throw new NullPointerException("Null geometries");
        }

        public final at.a l(String str) {
            if (str != null) {
                this.s = str;
                return this;
            }
            throw new NullPointerException("Null accessToken");
        }

        public final at.a m(String str) {
            if (str != null) {
                this.t = str;
                return this;
            }
            throw new NullPointerException("Null requestUuid");
        }

        public final at.a a(List<Point> list) {
            if (list != null) {
                this.f26233d = list;
                return this;
            }
            throw new NullPointerException("Null coordinates");
        }
    }

    @NonNull
    public String accessToken() {
        return this.accessToken;
    }

    @Nullable
    public Boolean alternatives() {
        return this.alternatives;
    }

    @Nullable
    public String annotations() {
        return this.annotations;
    }

    @Nullable
    public String approaches() {
        return this.approaches;
    }

    @Nullable
    public Boolean bannerInstructions() {
        return this.bannerInstructions;
    }

    @NonNull
    public String baseUrl() {
        return this.baseUrl;
    }

    @Nullable
    public String bearings() {
        return this.bearings;
    }

    @Nullable
    public Boolean continueStraight() {
        return this.continueStraight;
    }

    @NonNull
    public List<Point> coordinates() {
        return this.coordinates;
    }

    @Nullable
    public String exclude() {
        return this.exclude;
    }

    public String geometries() {
        return this.geometries;
    }

    @Nullable
    public String language() {
        return this.language;
    }

    @Nullable
    public String overview() {
        return this.overview;
    }

    @NonNull
    public String profile() {
        return this.profile;
    }

    @Nullable
    public String radiuses() {
        return this.radiuses;
    }

    @NonNull
    public String requestUuid() {
        return this.requestUuid;
    }

    @Nullable
    public Boolean roundaboutExits() {
        return this.roundaboutExits;
    }

    @Nullable
    public Boolean steps() {
        return this.steps;
    }

    @NonNull
    public String user() {
        return this.user;
    }

    @Nullable
    public Boolean voiceInstructions() {
        return this.voiceInstructions;
    }

    @Nullable
    public String voiceUnits() {
        return this.voiceUnits;
    }

    @Nullable
    public String waypointNames() {
        return this.waypointNames;
    }

    public String toString() {
        return "RouteOptions{baseUrl=" + this.baseUrl + ", user=" + this.user + ", profile=" + this.profile + ", coordinates=" + this.coordinates + ", alternatives=" + this.alternatives + ", language=" + this.language + ", radiuses=" + this.radiuses + ", bearings=" + this.bearings + ", continueStraight=" + this.continueStraight + ", roundaboutExits=" + this.roundaboutExits + ", geometries=" + this.geometries + ", overview=" + this.overview + ", steps=" + this.steps + ", annotations=" + this.annotations + ", exclude=" + this.exclude + ", voiceInstructions=" + this.voiceInstructions + ", bannerInstructions=" + this.bannerInstructions + ", voiceUnits=" + this.voiceUnits + ", accessToken=" + this.accessToken + ", requestUuid=" + this.requestUuid + ", approaches=" + this.approaches + ", waypointNames=" + this.waypointNames + "}";
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int hashCode = (((((((this.baseUrl.hashCode() ^ 1000003) * 1000003) ^ this.user.hashCode()) * 1000003) ^ this.profile.hashCode()) * 1000003) ^ this.coordinates.hashCode()) * 1000003;
        int i15 = 0;
        if (this.alternatives == null) {
            i = 0;
        } else {
            i = this.alternatives.hashCode();
        }
        int i16 = (hashCode ^ i) * 1000003;
        if (this.language == null) {
            i2 = 0;
        } else {
            i2 = this.language.hashCode();
        }
        int i17 = (i16 ^ i2) * 1000003;
        if (this.radiuses == null) {
            i3 = 0;
        } else {
            i3 = this.radiuses.hashCode();
        }
        int i18 = (i17 ^ i3) * 1000003;
        if (this.bearings == null) {
            i4 = 0;
        } else {
            i4 = this.bearings.hashCode();
        }
        int i19 = (i18 ^ i4) * 1000003;
        if (this.continueStraight == null) {
            i5 = 0;
        } else {
            i5 = this.continueStraight.hashCode();
        }
        int i20 = (i19 ^ i5) * 1000003;
        if (this.roundaboutExits == null) {
            i6 = 0;
        } else {
            i6 = this.roundaboutExits.hashCode();
        }
        int hashCode2 = (((i20 ^ i6) * 1000003) ^ this.geometries.hashCode()) * 1000003;
        if (this.overview == null) {
            i7 = 0;
        } else {
            i7 = this.overview.hashCode();
        }
        int i21 = (hashCode2 ^ i7) * 1000003;
        if (this.steps == null) {
            i8 = 0;
        } else {
            i8 = this.steps.hashCode();
        }
        int i22 = (i21 ^ i8) * 1000003;
        if (this.annotations == null) {
            i9 = 0;
        } else {
            i9 = this.annotations.hashCode();
        }
        int i23 = (i22 ^ i9) * 1000003;
        if (this.exclude == null) {
            i10 = 0;
        } else {
            i10 = this.exclude.hashCode();
        }
        int i24 = (i23 ^ i10) * 1000003;
        if (this.voiceInstructions == null) {
            i11 = 0;
        } else {
            i11 = this.voiceInstructions.hashCode();
        }
        int i25 = (i24 ^ i11) * 1000003;
        if (this.bannerInstructions == null) {
            i12 = 0;
        } else {
            i12 = this.bannerInstructions.hashCode();
        }
        int i26 = (i25 ^ i12) * 1000003;
        if (this.voiceUnits == null) {
            i13 = 0;
        } else {
            i13 = this.voiceUnits.hashCode();
        }
        int hashCode3 = (((((i26 ^ i13) * 1000003) ^ this.accessToken.hashCode()) * 1000003) ^ this.requestUuid.hashCode()) * 1000003;
        if (this.approaches == null) {
            i14 = 0;
        } else {
            i14 = this.approaches.hashCode();
        }
        int i27 = (hashCode3 ^ i14) * 1000003;
        if (this.waypointNames != null) {
            i15 = this.waypointNames.hashCode();
        }
        return i27 ^ i15;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        if (!this.baseUrl.equals(atVar.baseUrl()) || !this.user.equals(atVar.user()) || !this.profile.equals(atVar.profile()) || !this.coordinates.equals(atVar.coordinates()) || (this.alternatives != null ? !this.alternatives.equals(atVar.alternatives()) : atVar.alternatives() != null) || (this.language != null ? !this.language.equals(atVar.language()) : atVar.language() != null) || (this.radiuses != null ? !this.radiuses.equals(atVar.radiuses()) : atVar.radiuses() != null) || (this.bearings != null ? !this.bearings.equals(atVar.bearings()) : atVar.bearings() != null) || (this.continueStraight != null ? !this.continueStraight.equals(atVar.continueStraight()) : atVar.continueStraight() != null) || (this.roundaboutExits != null ? !this.roundaboutExits.equals(atVar.roundaboutExits()) : atVar.roundaboutExits() != null) || !this.geometries.equals(atVar.geometries()) || (this.overview != null ? !this.overview.equals(atVar.overview()) : atVar.overview() != null) || (this.steps != null ? !this.steps.equals(atVar.steps()) : atVar.steps() != null) || (this.annotations != null ? !this.annotations.equals(atVar.annotations()) : atVar.annotations() != null) || (this.exclude != null ? !this.exclude.equals(atVar.exclude()) : atVar.exclude() != null) || (this.voiceInstructions != null ? !this.voiceInstructions.equals(atVar.voiceInstructions()) : atVar.voiceInstructions() != null) || (this.bannerInstructions != null ? !this.bannerInstructions.equals(atVar.bannerInstructions()) : atVar.bannerInstructions() != null) || (this.voiceUnits != null ? !this.voiceUnits.equals(atVar.voiceUnits()) : atVar.voiceUnits() != null) || !this.accessToken.equals(atVar.accessToken()) || !this.requestUuid.equals(atVar.requestUuid()) || (this.approaches != null ? !this.approaches.equals(atVar.approaches()) : atVar.approaches() != null) || (this.waypointNames != null ? !this.waypointNames.equals(atVar.waypointNames()) : atVar.waypointNames() != null)) {
            return false;
        }
        return true;
    }

    m(String str, String str2, String str3, List<Point> list, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool2, @Nullable Boolean bool3, String str7, @Nullable String str8, @Nullable Boolean bool4, @Nullable String str9, @Nullable String str10, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable String str11, String str12, String str13, @Nullable String str14, @Nullable String str15) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        List<Point> list2 = list;
        String str19 = str7;
        String str20 = str12;
        String str21 = str13;
        if (str16 != null) {
            this.baseUrl = str16;
            if (str17 != null) {
                this.user = str17;
                if (str18 != null) {
                    this.profile = str18;
                    if (list2 != null) {
                        this.coordinates = list2;
                        this.alternatives = bool;
                        this.language = str4;
                        this.radiuses = str5;
                        this.bearings = str6;
                        this.continueStraight = bool2;
                        this.roundaboutExits = bool3;
                        if (str19 != null) {
                            this.geometries = str19;
                            this.overview = str8;
                            this.steps = bool4;
                            this.annotations = str9;
                            this.exclude = str10;
                            this.voiceInstructions = bool5;
                            this.bannerInstructions = bool6;
                            this.voiceUnits = str11;
                            if (str20 != null) {
                                this.accessToken = str20;
                                if (str21 != null) {
                                    this.requestUuid = str21;
                                    this.approaches = str14;
                                    this.waypointNames = str15;
                                    return;
                                }
                                throw new NullPointerException("Null requestUuid");
                            }
                            throw new NullPointerException("Null accessToken");
                        }
                        throw new NullPointerException("Null geometries");
                    }
                    throw new NullPointerException("Null coordinates");
                }
                throw new NullPointerException("Null profile");
            }
            throw new NullPointerException("Null user");
        }
        throw new NullPointerException("Null baseUrl");
    }
}

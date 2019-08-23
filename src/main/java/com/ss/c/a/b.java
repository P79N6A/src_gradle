package com.ss.c.a;

import org.json.JSONObject;

public interface b {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f78285a;

        /* renamed from: b  reason: collision with root package name */
        public final String f78286b;

        /* renamed from: c  reason: collision with root package name */
        public final String f78287c;

        /* renamed from: d  reason: collision with root package name */
        public final Exception f78288d;

        /* renamed from: com.ss.c.a.b$a$a  reason: collision with other inner class name */
        public static class C0833a {

            /* renamed from: a  reason: collision with root package name */
            public JSONObject f78289a;

            /* renamed from: b  reason: collision with root package name */
            String f78290b;

            /* renamed from: c  reason: collision with root package name */
            public String f78291c;

            /* renamed from: d  reason: collision with root package name */
            Exception f78292d;

            private C0833a() {
            }

            public final a a() {
                return new a(this, (byte) 0);
            }

            public final C0833a a(Exception exc) {
                this.f78292d = exc;
                return this;
            }

            /* synthetic */ C0833a(byte b2) {
                this();
            }

            public final C0833a a(String str) {
                this.f78290b = str;
                return this;
            }
        }

        public static C0833a a() {
            return new C0833a((byte) 0);
        }

        private a(C0833a aVar) {
            this.f78285a = aVar.f78289a;
            this.f78286b = aVar.f78290b;
            this.f78287c = aVar.f78291c;
            this.f78288d = aVar.f78292d;
        }

        /* synthetic */ a(C0833a aVar, byte b2) {
            this(aVar);
        }
    }

    a a(String str, String str2);
}

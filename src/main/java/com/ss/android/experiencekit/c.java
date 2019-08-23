package com.ss.android.experiencekit;

public final class c {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private StringBuilder f29086a = new StringBuilder("{");

        private static String b() {
            return " ";
        }

        private String a() {
            return b();
        }

        public final String toString() {
            this.f29086a.delete(this.f29086a.length() - 1, this.f29086a.length());
            this.f29086a.append("}");
            return this.f29086a.toString();
        }

        public final a a(String str, long j) {
            StringBuilder sb = this.f29086a;
            sb.append(a());
            sb.append("\"");
            sb.append(str);
            sb.append("\" : ");
            sb.append(j);
            sb.append(",");
            return this;
        }

        public final a a(String str, String str2) {
            StringBuilder sb = this.f29086a;
            sb.append(a());
            sb.append("\"");
            sb.append(str);
            sb.append("\" : \"");
            sb.append(str2);
            sb.append("\",");
            return this;
        }
    }
}

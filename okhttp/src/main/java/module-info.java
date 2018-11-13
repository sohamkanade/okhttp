module okhttp {
    requires transitive okio;
    requires transitive java.logging;
    exports okhttp3;
    exports okhttp3.internal;
    exports okhttp3.internal.platform;
    exports okhttp3.internal.publicsuffix;
    exports okhttp3.internal.annotations;
}
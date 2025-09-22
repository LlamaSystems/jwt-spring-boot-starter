module io.github.aliabbosashurov.jwt {
    requires static lombok;
    requires org.jspecify;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    exports io.github.aliabbosashurov.jwt;
    exports io.github.aliabbosashurov.jwt.autoconfigure;

    opens io.github.aliabbosashurov.jwt.autoconfigure;
}
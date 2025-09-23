package ricciliao.x.log.api;


import java.util.ServiceLoader;

public final class XLoggerFactory {

    private XLoggerFactory() {
        throw new IllegalStateException("Utility class");
    }

    private static final XLoggerProvider PROVIDER_INSTANCE;

    static {
        ServiceLoader<XLoggerProvider> loader = ServiceLoader.load(XLoggerProvider.class, XLoggerFactory.class.getClassLoader());
        PROVIDER_INSTANCE = loader.findFirst().orElseThrow(() -> new IllegalStateException("No XLoggerProvider found"));
    }

    public static XLogger getLogger(Class<?> clazz) {

        return getXLoggerFactory().getLogger(clazz);
    }

    public static IXLoggerFactory getXLoggerFactory() {

        return PROVIDER_INSTANCE.getXLoggerFactory();
    }

}

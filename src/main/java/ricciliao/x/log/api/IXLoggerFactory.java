package ricciliao.x.log.api;


public interface IXLoggerFactory {

    XLogger getLogger(Class<?> clazz);

}

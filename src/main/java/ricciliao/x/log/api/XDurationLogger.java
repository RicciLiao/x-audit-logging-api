package ricciliao.x.log.api;

import org.slf4j.Logger;

public interface XDurationLogger extends Logger {

    Logger start();

    Logger stop();

}

package multiLayerDemo.core.concretes;

import multiLayerDemo.core.abstracts.LoggerService;
import multiLayerDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String msg) {
        JLoggerManager jLoggerManager=new JLoggerManager();
        jLoggerManager.log(msg);
    }
}

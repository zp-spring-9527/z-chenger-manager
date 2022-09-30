package cn.zchenger.manager.init;

import cn.zchenger.manager.execute.ManagerBaseExecute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ExecuteDataSourceBeanFactory implements InitializingBean, ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(ExecuteDataSourceBeanFactory.class);

    private static Map<String, ManagerBaseExecute>  managerBaseExecuteMap =new HashMap<>();


    //启动时会执行一次
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}

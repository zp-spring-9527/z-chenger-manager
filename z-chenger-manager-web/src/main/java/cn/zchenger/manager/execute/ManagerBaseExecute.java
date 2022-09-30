package cn.zchenger.manager.execute;

import cn.zchenger.manager.exception.ExecuteException;
import cn.zchenger.manager.exception.ParameterException;
import cn.zchenger.manager.response.ServerResponse;

public interface ManagerBaseExecute {



    public void  preExecute() throws ParameterException;


    public ServerResponse doExecute() throws ExecuteException;




}

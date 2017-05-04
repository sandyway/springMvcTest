package org.springframework.test.mvc.async;

import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.async.CallableProcessingInterceptorAdapter;

import java.util.concurrent.Callable;

/**
 * Created by songway on 2017/5/3.
 */
public class TimeoutCallableProcessingInterceptor extends CallableProcessingInterceptorAdapter{
    @Override
    public <T> Object handleTimeout(NativeWebRequest request, Callable<T> task) throws Exception {
        throw new IllegalStateException("[" + task.getClass().getName() + "] time out");
    }
}

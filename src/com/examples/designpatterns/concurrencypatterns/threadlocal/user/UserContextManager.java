package com.examples.designpatterns.concurrencypatterns.threadlocal.user;

import java.util.function.Supplier;

//User Thread Local
public class UserContextManager {

    private static final ThreadLocal<UserContext> userThreadLocal =
        ThreadLocal.withInitial(UserContext::new);
        //ThreadLocal.withInitial(() -> new UserContext());
        /*ThreadLocal.withInitial(new Supplier<UserContext>(){
            @Override
            public UserContext get() {
                return new UserContext();
            }
        });*/


    public static UserContext getContext(){
        return userThreadLocal.get();
    }
}

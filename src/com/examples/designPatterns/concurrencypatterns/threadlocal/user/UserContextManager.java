package com.examples.designPatterns.concurrencypatterns.threadlocal.user;

//User Thread Local
public class UserContextManager {

    private static final ThreadLocal<UserContext> userTheadLocal = ThreadLocal.withInitial(UserContext::new);

    public static UserContext getContext(){
        return userTheadLocal.get();
    }
}

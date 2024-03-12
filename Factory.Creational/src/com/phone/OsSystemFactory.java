package com.phone;

public class OsSystemFactory {

    public Os getInstance(String os) {
        if (os.equals("OpenSource")) {
            return new Android();
        } else if (os.equals("IOS")) {
            return new IOS();
        } else {
            return new Windows();
        }

    }

}

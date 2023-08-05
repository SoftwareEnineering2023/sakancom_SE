package com.example.sw_raia;

import java.io.IOException;

import static com.example.sw_raia.NextPage.make;

public class TESTLOGIN {

    public static boolean userNametest(String string2) {
        if(LoginControl.typeuser==1)
        {

        }
        else if (LoginControl.typeuser==2)
        {

        }
        else if(LoginControl.typeuser==3)
        {

        }

        return true;
    }

    public static boolean passWordtest(String string2) throws IOException {
        if(LoginControl.typeuser==1)
        {
            try {
                make("adminpage.fxml","Admin");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else if (LoginControl.typeuser==2)
        {
            make("insert.fxml","Owner");
        }
        else if(LoginControl.typeuser==3)
        {
            make("Tenant.fxml","Tenant");
        }
        return true;
    }
}

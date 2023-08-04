package com.example.sw_raia;

import javax.swing.*;

public class TESTLOGIN {
public  static boolean flag=true;
    public static boolean userNametest(String string2) {
if(logincontrol1.typeuser==1)
{
    if(sakanat.admin1.get(0).getUsername().trim().equals(string2.trim()))
        return true;

  else if(sakanat.admin1.get(1).getUsername().trim().equals(string2.trim()))
        return true;
  else    JOptionPane.showMessageDialog(null, "user not found", "incorrect", JOptionPane.ERROR_MESSAGE);


}
else if (logincontrol1.typeuser==2)
{
    for (int i=0;i<sakanat.owner1.size();i++)
    {
        if(sakanat.owner1.get(i).getUsername().trim().equals(string2.trim()))
            return true;
        else   flag=true;
    }
if(flag==false){JOptionPane.showMessageDialog(null, "user not found", "incorrect", JOptionPane.ERROR_MESSAGE);flag=true;}
}
else if(logincontrol1.typeuser==3)
{
    for (int i=0;i<sakanat.tenant1.size();i++)
    {
        if(sakanat.tenant1.get(i).getUsername().trim().equals(string2.trim()))
            return true;
        else   flag=true;
    }
    if(flag==false) {
        JOptionPane.showMessageDialog(null, "user not found", "incorrect", JOptionPane.ERROR_MESSAGE);
   flag=true; }
}

return false;
    }

    public static boolean passWordtest(String string2)

    {
        if(logincontrol1.typeuser==1)
        {
            if(sakanat.admin1.get(0).getPassword().trim().equals(string2.trim()))
                return true;

            if(sakanat.admin1.get(1).getPassword().trim().equals(string2.trim()))
                return true;
        }
        else if (logincontrol1.typeuser==2)
        {
            for (int i=0;i<sakanat.owner1.size();i++)
            {
                if(sakanat.owner1.get(i).getPassword().trim().equals(string2.trim()))
                    return true;
                else   flag=true;
            }
            if(flag==false)
            {
                JOptionPane.showMessageDialog(null, "user not found", "incorrect", JOptionPane.ERROR_MESSAGE);
                flag=true;
            }


        }
        else if(logincontrol1.typeuser==3)
        {
            for (int i=0;i<sakanat.tenant1.size();i++)
            {
                if(sakanat.tenant1.get(i).getPassword().trim().equals(string2.trim()))
                    return true;
                else  flag=false;

            }
            if(flag==false)
            {
                JOptionPane .showMessageDialog(null, "user not found", "incorrect", JOptionPane.ERROR_MESSAGE);
flag=true;
            }

        }
        return false;
    }

}
